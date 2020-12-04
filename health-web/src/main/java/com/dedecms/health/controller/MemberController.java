package com.dedecms.health.controller;

import com.dedecms.health.pojo.Member;
import com.dedecms.health.service.MemberService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/member")
@RestController
public class MemberController {

    @Reference
    MemberService memberService;

    @GetMapping("/getAllMember")
    public Member getAllMember() {
        System.out.println("213123");
        Member member = memberService.getMemberById(1L);
        return member;
    }
}
