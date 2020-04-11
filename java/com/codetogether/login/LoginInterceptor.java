package com.codetogether.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

//		SnsLogin naverLogin = new SnsLogin(naverSns);
//		model.addAttribute("naver_url", naverLogin.getNaverAuthURL());


//		HttpSession session = request.getSession();
//		Object obj = session.getAttribute("login");
//		if ( obj == null ) {
//			response.sendRedirect("/loginForm");
//			return false;
//		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}
}