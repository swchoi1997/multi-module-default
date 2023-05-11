package com.example.moduleapi.service;

import com.example.modulecommon.enums.CodeEnum;
import com.example.modulecommon.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DemoService {

    private final CommonDemoService commonDemoService;

    public String save(){
        log.info(CodeEnum.SUCCESS.getCode());
        return "save";
    }

    public String find(){
        log.info(commonDemoService.commonService());
        return "find";
    }
}
