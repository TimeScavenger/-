package com.dedecms.health.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dedecms.health.pojo.Member;

public interface MemberService extends IService<Member> {
    Member findMemeberByTelephone(String telephone);

    public int saveMember(Member member);

    public Member getMemberById(Long id);
}
