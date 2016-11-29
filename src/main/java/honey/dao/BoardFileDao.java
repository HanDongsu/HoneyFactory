package honey.dao;

import java.util.HashMap;
import java.util.List;

import honey.vo.BoardFile;

public interface BoardFileDao {

	int insertPhoto(BoardFile boardFile);
	List<BoardFile> fileList(HashMap <String,Object> map);
	List<BoardFile> otherUserReturnMethod(int memberNo); 
	int updateFile(BoardFile boardFile);
	int insertFile(BoardFile boardFile);
	int countAll(int memberNo);
  int deleteFile(int fileNo);
}
