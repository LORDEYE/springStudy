package com.tistory.lordeye.persistence;

import com.tistory.lordeye.domain.MemberVO;

public interface MemberDAO {
	public String getTime();
	
	public void insertMember(MemberVO vo);
}
