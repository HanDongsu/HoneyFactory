package honey.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import honey.dao.MainPageDao;
import honey.service.MainPageService;
import honey.vo.MainPage;

@Service
public class MainPageImpl implements MainPageService {
  @Autowired MainPageDao mainDao;
  @Autowired MemberFileDao photoDao;
  
  public List<MainPage> getBoardList(int pageNo, int length) throws Exception {
    HashMap<String, Object> map = new HashMap<>();
    map.put("startIndex", (pageNo - 1)*length);
    map.put("length", length);
    return mainDao.boardList(map);
  }
  public List<MainPage> getPopularList(int pageNo, int length) throws Exception {
    HashMap<String, Object> map = new HashMap<> ();
    map.put("startIndex", (pageNo - 1)*length);
    map.put("length", length);
    return mainDao.boardList(map);
  }
  public List<MainPage> getBoardListAndCategory(int categoryNo, int pageNo, int length) throws Exception {
    HashMap<String, Object> map = new HashMap<> ();
    map.put("startIndex", (pageNo - 1)*length);
    map.put("length", length);
    map.put("categoryNo", categoryNo);
    return mainDao.boardList(map);
  }
  public MainPage getBoard(int no) throws Exception {
    return mainDao.selectOne(no);
  }
  public void getViewCount(int no) throws Exception {
    mainDao.increaseViewCount(no);
  }
//  public String getPhoto(int memberNo) throws Exception {
//    return mainDao.
//  }
  
//  UrlInfo getUrl(int no) throws Exception;
//  List<UrlInfo> getUrlList() throws Exception;
//  List<FileList> fileList(int no) throws Exception;
//  int insertBoard(MainPage mainPage) throws Exception;
//  int deleteBoard(int no) throws Exception;
}
