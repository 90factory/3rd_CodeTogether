package com.codetogether.user;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JwtServiceImpl implements JwtService{

	public static String createToken() {
		String key = "A";

		Map<String, Object> headers = new HashMap<>();
		headers.put("typ", "JWT");
		headers.put("alg", "HS256");

		Map<String, Object> payloads = new HashMap<>();
		Long expiredTime = (long) (1000 * 601); // 만료기간 1분
		Date now = new Date();
		now.setTime(now.getTime() + expiredTime);
		payloads.put("exp", now);
		payloads.put("data", "hello world!");

		String jwt = Jwts.builder()
				.setHeader(headers)
				.setClaims(payloads)
				.signWith(SignatureAlgorithm.HS256, key.getBytes())
				.compact();

		return jwt;

	}

	public static void getTokenFromJwtString(String jwtTokenString) throws InterruptedException {
		Claims claims = Jwts.parser()
				.setSigningKey("A".getBytes())
				.parseClaimsJws(jwtTokenString)
				.getBody();
		Date expiration = claims.get("exp", Date.class);
			System.out.println(expiration);

			String data = claims.get("data", String.class);
			System.out.println(data);
	}
}
