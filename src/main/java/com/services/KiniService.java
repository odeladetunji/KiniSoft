package com.services;

import com.dto.KiniDto;
import com.entity.Kini;
import com.exception.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import com.repository.KiniRepository;

import java.util.Optional;

@Service
public class KiniService implements KiniInterface {

    @Autowired
    KiniRepository kiniRepository;

    public Kini saveKini(KiniDto kiniDto){
        Kini kini = new Kini();
        kini.setEmail(kiniDto.getEmail());
        kini.setTelephone(kiniDto.getTelephone());
        kini.setUsername(kiniDto.getUsername());

        return kiniRepository.save(kini);
    }

    public Kini updateKini(KiniDto kiniDto){
        if (ObjectUtils.isEmpty(kiniDto.getId()))
            throw new ApiException("Id is required for update");

        Optional<Kini> findKiniById = kiniRepository.findById(kiniDto.getId());
        findKiniById.orElseThrow(() -> new ApiException(String.format("Kini with this Id %s not found"
                , kiniDto.getId())));

        Kini kini = findKiniById.get();
        kini.setEmail(kiniDto.getEmail());
        kini.setTelephone(kiniDto.getTelephone());
        kini.setUsername(kiniDto.getUsername());

        return kiniRepository.save(kini);
    }

}
