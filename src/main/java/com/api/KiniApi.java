package com.api;

import com.dto.KiniDto;
import com.entity.Kini;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.services.KiniService;

@RestController
@RequestMapping("/kini")
public class KiniApi {

    @Autowired
    private KiniService kiniService;

    @PostMapping("/save")
    public Kini saveOrUpdate(@RequestBody KiniDto kiniDto){
        return kiniService.saveKini(kiniDto);
    }

    @PutMapping("/update")
    public Kini updateKini(@RequestBody KiniDto kiniDto){
        return kiniService.updateKini(kiniDto);
    }
}
