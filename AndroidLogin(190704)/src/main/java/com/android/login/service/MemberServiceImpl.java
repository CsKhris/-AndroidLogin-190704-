package com.android.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.login.dao.MemberDao;
import com.android.login.domain.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memberDao;
	
	@Override
	public Member login(Member member) {
		member.setId(member.getId().toUpperCase());
		// System.out.println("Service : " + member);
		return memberDao.login(member);
	}
}
