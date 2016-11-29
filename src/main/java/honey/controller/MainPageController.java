package honey.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import honey.service.MainPageService;
import honey.vo.JsonResult;
import honey.vo.MainPage;

@Controller
@RequestMapping({"/mainpage/"})
@SessionAttributes({"MainPage"})
public class MainPageController {
  @Autowired MainPageService mainService;
  
  @RequestMapping("boardList")
  public Object list(
      HttpSession session, 
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="20") int length) throws Exception {
    List<MainPage> mainList = mainService.getBoardList(pageNo, length);
//    List<UrlInfo> urlList = mainService.getUrlList();
    try {
      List<MainPage> settingUrlBoard = setImage.setImage(mainList, urlList);
      for (int i = 0; i < settingUrlBoard.size();i++) {
        String userPhoto = mainService.getPhoto(settingUrlBoard.get(i).getUserNo());
        String[] userPhotoSplit = userPhoto.split("\\.");
      }
      return JsonResult.success(listMap);
    } catch (Exception e) {
      return JsonResult.fail();
    }
  }
  
}
