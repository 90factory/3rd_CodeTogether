package com.codetogether.user;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.codetogether.login.LoginDTO;
import com.mysql.cj.util.StringUtils;

@Repository
public class UserDAOImpl implements UserDAO {

	@Inject
	private SqlSession sql;

	// 회원 가입
	@Override
	public void create(UserVO vo) throws Exception {
		sql.insert("create", vo);
	}

	@Override
	public UserVO select(LoginDTO dto) throws Exception {
		return sql.selectOne("select", dto);
	}
	// 회원 수정
	@Override
	public void update(UserVO vo) throws Exception {
		sql.update("update", vo);
	}

	// 회원 탈퇴
	@Override
	public void delete(UserVO vo) throws Exception {
		sql.delete("delete", vo);
	}

	// 로그인
	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		return sql.selectOne("login", dto);
	}

	// 로그 아웃 //JWT 처리 추가 예정
	@Override
	public void logout(HttpSession httpsession) {

	}

	@Override
	public int checkValid(String email) {
		return sql.selectOne("checkValid", email);
	}

	@Override
	public UserVO getBySns(UserVO vo) {
		if ( !StringUtils.isNullOrEmpty(vo.getNaver_email())) {
			return sql.selectOne("getBySnsNaver", vo.getNaver_email());
		} else {
			return sql.selectOne("getBySnsGoogle", vo.getGoogle_email());
			//구글 추가예정
	}
}

	@Override
	public void verify(UserVO vo) {
		sql.selectOne("verfy", vo);
	}

	@Override
	public void tempPassword(UserVO vo) {
		sql.selectOne("tempPassword", vo);
	}
}