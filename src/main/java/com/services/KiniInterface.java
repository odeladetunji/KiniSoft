package com.services;

import com.dto.KiniDto;
import com.entity.Kini;

public interface KiniInterface {
    Kini saveKini(KiniDto kiniDto);
    Kini updateKini(KiniDto kiniDto);
}
