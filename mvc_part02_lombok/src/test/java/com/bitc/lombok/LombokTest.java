package com.bitc.lombok;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LombokTest {
	
	@org.junit.Before
	public void before() {
		System.out.println("test 전");
	}
	
	@org.junit.Test
	public void test() {
		System.out.println("Test 실행 method");
		
		UserVO vo = new UserVO("id001","pw001");
		System.out.println(vo);
		vo.setUno(1);
		vo.setUname("최기근");
		vo.setRegdate(new Date());
		List<String> friendList = new ArrayList<>();
		friendList.add("팽수");
		friendList.add("뿡뿡이");
		friendList.add("뽀로로");
		vo.setFriendList(friendList);
		System.out.println(vo);
		
		
		UserVO user = UserVO.builder()
						.uno(2)
						.uid("id002")
						.upw("pw002")
						.uname("최기근")
						// .friendList(friendList)
						.list("김판길").list("이인").list("박준우")
						.regdate(new Date())
						.build();
		System.out.println(user);
		
	}
	
	@org.junit.After
	public void after() {
		System.out.println("test 작업 완료");
	}
	
}



