package honey.dao;

import java.util.List;
import java.util.Map;

import honey.vo.MainPage;

public interface MainPageDao {
  List<MainPage> boardList(Map<String, Object> paramMap) throws Exception;
  List<MainPage> popularList(Map<String, Object> paramMap) throws Exception;
  List<MainPage> boardListAndCategory(Map<String, Object> paramMap) throws Exception;
//  List<FileList> fileList(Map<String, Object> paramMap) throws Exception;
  MainPage selectOne(int no) throws Exception;
//  int insertBoard(MainPage mainPage) throws Exception;
  int increaseViewCount(int no) throws Exception;
//  int deleteBoard(int no) throws Exception;
}
