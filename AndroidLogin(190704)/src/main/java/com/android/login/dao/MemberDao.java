package com.android.login.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.android.login.domain.Member;

@Repository
public class MemberDao {
	@Autowired
	SqlSession sqlSession;

	// Login 처리 Method
	public Member login(Member member) {
		// System.out.println("DAO : " + member);
		return sqlSession.selectOne("member.login", member);
	}
}
