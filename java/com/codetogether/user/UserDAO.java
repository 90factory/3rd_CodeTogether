package com.codetogether.user;

import javax.servlet.http.HttpSession;

import com.codetogether.login.LoginDTO;

public interface UserDAO {

	// 회원 가입
	public void create(UserVO vo) throws Exception;

	// 회원 조회
	UserVO select(LoginDTO dto) throws Exception;

	// 회원 수정
	public void update(UserVO vo) throws Exception;

	// 회원 탈퇴
	public void delete(UserVO vo) throws Exception;

	// 로그인
	UserVO login(LoginDTO dto) throws Exception;

	// 로그 아웃 // 수정 예정
	public void logout(HttpSession httpsession);


	//로그인 검증
	int checkValid(String email);

	public UserVO getBySns(UserVO vo);

	public void verify(UserVO vo);

	public void tempPassword(UserVO vo);

}
