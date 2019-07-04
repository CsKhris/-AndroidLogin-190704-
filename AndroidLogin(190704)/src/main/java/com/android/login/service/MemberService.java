package com.android.login.service;

import com.android.login.domain.Member;

public interface MemberService {
	// Login 처리를 위한 Method
	public Member login(Member member);
}
