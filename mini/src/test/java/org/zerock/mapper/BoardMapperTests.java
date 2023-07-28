package org.zerock.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.backoff.BackOff;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) // JUnit으로 테스트 하겠다.
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") // 설정 파일 위치
@Log4j
public class BoardMapperTests {

	@Autowired
	private BoardMapper mapper;

	@Test
	public void test() {
		mapper.getList().forEach(board -> log.info(board));
	}


	
//	@Test
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글");
//		board.setContent("새로 작성하는 내용");
//		board.setWriter("newbie");
//		
//		mapper.insert(board);
//		
//		log.info(board);
//	}

//	@Test
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글 SelectKey");
//		board.setContent("새로 작성하는 내용 SelectKey");
//		board.setWriter("newbie");
//		
//		mapper.insertSelectKey(board);
//		
//		log.info(board);
//	}
//	@Test
//	public void testRead() {
//		BoardVO board = mapper.read(4L);
//		log.info(board);
//	}
//	@Test
//	public void testUpdate() {
//		BoardVO board = new BoardVO();
//		
//		board.setBno(3L);
//		board.setTitle("수정된 제목");
//		board.setContent("수정된 내용");
//		board.setWriter("정주원");
//		
//		int count = mapper.update(board);
//		log.info("update count : "+count);
//	}
//	@Test
//	public void testDelete() {
//		log.info("DELETE COUNT: " + mapper.delete(4L));
//	}
}
