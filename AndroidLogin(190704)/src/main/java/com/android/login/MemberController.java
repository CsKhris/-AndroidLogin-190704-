package com.android.login;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.android.login.domain.Member;
import com.android.login.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	MemberService memberService;

	// Parameter로 ID와 PW를 전송하는 요청
	// Login의 성공과 실패만 알려 줄 것인지, 모든 정보를 보여줄 것인지 고려해야 합니다.
	@RequestMapping("login")
	public Map<String, Object> login(Member member) {
		
		// 요청 처리 Method와 Parameter가 맞는지 확인
		// System.out.println(member);
		
		Member result = memberService.login(member);
		Map<String, Object> map = new HashMap<String, Object>();
		if (result != null) {
			map.put("result", "true");
		} else {
			map.put("result", "false");
		}
		return map;
	}
}
