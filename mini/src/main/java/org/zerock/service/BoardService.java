package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getList();
	
	public void register(BoardVO board);
	
	public BoardVO detail(Long bno);
	
	public void modify(BoardVO board);
	
	public void remove(Long bno);
	
}
