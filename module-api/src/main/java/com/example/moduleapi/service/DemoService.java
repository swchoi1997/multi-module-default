package com.example.moduleapi.service;

import com.example.moduleapi.exception.CustomException;
import com.example.modulecommon.domain.Member;
import com.example.modulecommon.enums.CodeEnum;
import com.example.modulecommon.repositories.MemberRepository;
import com.example.modulecommon.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DemoService {

    private final MemberRepository memberRepository;

    public String save(){
        log.info(CodeEnum.SUCCESS.getCode());
        memberRepository.save(
                new Member(Thread.currentThread().getName()));
        return "save";
    }

    public String find(){
        return String.valueOf(memberRepository.findAll().size());
    }

    public void exception(){
        throw new CustomException(CodeEnum.UNKNOWN_ERROR);
    }
}
