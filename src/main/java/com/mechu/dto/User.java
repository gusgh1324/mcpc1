package com.mechu.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String userId; // 아이디
	private String userPassword; // 비밀번호
	private String userEmail; // 이메일
	private String userName; // 이름
	private int userBirth; // 생년월일
	private String userGender; // 성별
	private int userPNumber; // 전화번호
}
