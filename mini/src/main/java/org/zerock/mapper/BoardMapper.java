package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	
	public void insert(BoardVO baord);
	
	public void insertSelectKey(BoardVO baord);
	
	public BoardVO read(Long bno);
	
	public void delete(Long bno);
	
	public void update(BoardVO board);
	
}
