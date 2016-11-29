package honey.service;

import java.util.List;

import honey.vo.MainPage;

public interface MainPageService {
  List<MainPage> getBoardList(int pageNo, int length) throws Exception;
  List<MainPage> getPopularList(int pageNo, int length) throws Exception;
  List<MainPage> getBoardListAndCategory(int categoryNo, int pageNo, int length) throws Exception;
  MainPage getBoard(int no) throws Exception;
  void getViewCount(int no) throws Exception;
  String getPhoto(int memberNo) throws Exception;
  
//  UrlInfo getUrl(int no) throws Exception;
//  List<UrlInfo> getUrlList() throws Exception;
//  List<FileList> fileList(int no) throws Exception;
//  int insertBoard(MainPage mainPage) throws Exception;
//  int deleteBoard(int no) throws Exception;
}
