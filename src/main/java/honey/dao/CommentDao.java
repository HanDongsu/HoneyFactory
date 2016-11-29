package honey.dao;

import java.util.List;
import java.util.Map;

import honey.vo.HoneyComent;



public interface CommentDao {
  List<Comment> commentList(Map<String, Object> paramMap) throws Exception;
  HoneyComent commentDetail(int no) throws Exception;
  int insertComment(Coment honeyComent) throws Exception;
  int insertChildComent(Coment honeyComent) throws Exception;
  int saveCometNo(HoneyComent honeyComent) throws Exception;
  int updateComment(HoneyComent honeyComent) throws Exception;
  int delete(int cmtNo) throws Exception;
  int childdelete(int cmtNo) throws Exception;
}
