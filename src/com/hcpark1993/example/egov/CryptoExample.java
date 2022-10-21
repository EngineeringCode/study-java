package com.hcpark1993.example.egov;

import egovframework.rte.fdl.cryptography.EgovPasswordEncoder;

/*
 * 전자정부 표준프레임워크 > 공통기반 레이어 3.5.0
 * https://www.egovframe.go.kr/home/ntt/nttRead.do?menuNo=34&bbsId=14&nttId=944
 */

public class CryptoExample {
	public static void main(String[] args) {
		EgovPasswordEncoder egovPasswordEncoder = new EgovPasswordEncoder();
		egovPasswordEncoder.setAlgorithm("SHA-256");
		egovPasswordEncoder.setHashedPassword("1234567890");
		System.out.println(egovPasswordEncoder.encryptPassword("password"));
	}
}
