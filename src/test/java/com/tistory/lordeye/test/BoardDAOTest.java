package com.tistory.lordeye.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.tistory.lordeye.domain.BoardVO;
import com.tistory.lordeye.persistence.BoardDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardDAOTest {
	
	@Inject
	private BoardDAO dao;
	/*
	@Inject
	Logger logger;*/
	
	@Test
	public void testCreate() throws Exception{
		BoardVO board = new BoardVO();
		board.setTitle("새로운 글을 넣습니다.");
		board.setContent("새로운 글을 넣습니다");
		board.setWriter("user00");
		dao.create(board);
	}
	
	/*@Test
	public void testRead()throws Exception{
		logger.info(dao.read(1).toString());
	}
	*/
	@Test
	public void testUpdate() throws Exception{
		BoardVO board= new BoardVO();
		board.setBno(1);
		board.setTitle("수정된 글입니다.");
		board.setContent("수정 테스트");
		dao.update(board);
	}
	
	@Test
	public void testDelete() throws Exception{
		dao.delete(1);
	}
}
