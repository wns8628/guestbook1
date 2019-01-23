package com.douzone.guestbook.dao.test;

import java.util.List;

import com.douzone.guestbook.dao.GuestbookDao;
import com.douzone.guestbook.vo.GuestbookVo;

public class GuestbookTest {

	public static void main(String[] args) {

//		insertTest("둘리","1111","둘리다");
//		insertTest("최기석","3333","안녕기석아");
//		insertTest("김택주","4444","안녕택주야");
		
		getListTest();
	}
	
	public static void insertTest(String name, String password, String message) {
		
		GuestbookVo vo = new GuestbookVo();
		vo.setName(name); //이름 
		vo.setPassword(password); //비번
		vo.setMessage(message); //글
				
		new GuestbookDao().insert(vo);
	}
	
	public static void getListTest() {
		List<GuestbookVo> list = new GuestbookDao().getList();
		for(GuestbookVo vo : list) {
			System.out.println(vo);
		}
	}
}
