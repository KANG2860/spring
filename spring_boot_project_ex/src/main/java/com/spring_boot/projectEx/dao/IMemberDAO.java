package com.spring_boot.projectEx.dao;



import com.spring_boot.projectEx.model.MemberVO;

public interface IMemberDAO {
	//비밀번호 암호화 하기 이전에 사용하는 메소드
	//public String loginCheck(HashMap<String,Object>map);
	
	//비밀번호 암호화 하는 경우 사용하는 메소드
	public String loginCheck(String id);
	public void insertMember(MemberVO vo);

}
