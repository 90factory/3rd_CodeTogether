package com.codetogether.user;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.codetogether.login.LoginDTO;

@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserDAO userdao;

	// 회원 가입
	@Override
	public void create(UserVO vo) throws Exception {
		userdao.create(vo);
	}

	@Override
	public UserVO select(LoginDTO dto) throws Exception {
		return userdao.select(dto);
	}
	// 회원 수정
	@Override
	public void update(UserVO vo) throws Exception {
		userdao.update(vo);
	}

	// 회원 탈퇴
	@Override
	public void delete(UserVO vo) throws Exception {
		userdao.delete(vo);

	}

	// 로그인
	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		return userdao.login(dto);
	}

	// 로그아웃
	@Override
	public void logout(HttpSession httpsession) {
		httpsession.invalidate();
	}

	@Override
	public UserVO getBySns(UserVO vo) throws Exception {
		return userdao.getBySns(vo);
	}

	@Override
	public void verify(UserVO uservo) {
		userdao.verify(uservo);

	}

	@Override
	public int checkValid(String email) {
		if(userdao.checkValid(email) == 0) {
			return 0;
		}
			return 1;
	}

	@Override
	public void tempPassword(UserVO vo) {
		userdao.tempPassword(vo);
	}

}
