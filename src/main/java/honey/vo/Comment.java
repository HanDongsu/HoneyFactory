package honey.vo;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Comment implements Serializable{
  private static final long serialVersionUID = 1L;
  
  static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
  protected int cmtNo;
  protected int commentThread;
  protected int commentDepth;
  protected String comment;
  protected String writerNick;
  protected String contents;
  protected Date createdDate;     // 이제 java.sql.Date 타입으로 날짜 정보를 제대로 다뤄보자!
  protected String createdDate2;  //birth
  protected int boardNo;
  protected int memberNo;
  protected int notUsingNo;
  protected String commentMemberPhoto;
  
  public String getCommentMemberPhoto() {
    return commentMemberPhoto;
  }
  public void setCommentMemberPhoto(String commentMemberPhoto) {
    this.commentMemberPhoto = commentMemberPhoto;
  }
  public int getNotUsingNo() {
    return notUsingNo;
  }
  public void setNotUsingNo(int notUsingNo) {
    this.notUsingNo = notUsingNo;
  }
  public int getBoardNo() {
    return boardNo;
  }
  public void setBoardNo(int boardNo) {
    this.boardNo = boardNo;
  }
  public int getMemberNo() {
    return memberNo;
  }
  public void setMemberNo(int memberNo) {
    this.memberNo = memberNo;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
    this.createdDate2 = format.format(createdDate);
  }
  public String getCreatedDate2() {
    return createdDate2;
  }
  public int getCmtNo() {
    return cmtNo;
  }
  public void setCmtNo(int cmtNo) {
    this.cmtNo = cmtNo;
  }
  public int getCommentThread() {
    return commentThread;
  }
  public void setCommentThread(int comentThread) {
    this.commentThread = comentThread;
  }
  public int getCommentDepth() {
    return commentDepth;
  }
  public void setCommentDepth(int comentDepth) {
    this.commentDepth = comentDepth;
  }
  public String getComment() {
    return comment;
  }
  public void setComent(String coment) {
    this.comment = coment;
  }
  public String getWriterNick() {
    return writerNick;
  }
  public void setWriterNick(String writerNick) {
    this.writerNick = writerNick;
  }
  public String getContents() {
    return contents;
  }
  public void setContents(String contents) {
    this.contents = contents;
  }
}
