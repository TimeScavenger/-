package com.dedecms.health.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dedecms.health.mapper.MemberMapper;
import com.dedecms.health.pojo.Member;
import com.dedecms.health.service.MemberService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {
    @Override
    public Member findMemeberByTelephone(String telephone) {
        return null;
    }

    @Override
    public int saveMember(Member member) {
        return 0;
    }

    @Override
    public Member getMemberById(Long id) {
        Member member = new Member();
        member.setName("zhangdddd");
        return member;
    }
}
