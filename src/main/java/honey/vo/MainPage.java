package honey.vo;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class MainPage implements Serializable{
  private static final long serialVersionUID = 1L;
  
  protected int boardNo;
  protected String boardTitle;
  protected String boardLinkedUrl;
  protected String writerNick;
  protected String boardContents;
  protected int boardLike;
  protected int boardViewCount;
  protected String userEmail;
  protected int userNo;
  protected int categoryNo;
  protected String category;
  protected String linkedTitle;
  protected String linkedSimpleUrl;
  protected String linkedDetailUrl;
  protected String linkedDesc;
  protected String boardLinkedYoutubeUrl;
  protected String userProfilePath;
  static SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
  protected Date boardCreatedDate;  // java.sql.Date 타입의 날짜 정보
  protected String boardCreatedStringDate;  // createDate를 String객체로 변환하여 사용
  protected int fileStatus;
  
  public int getBoardNo() {
    return boardNo;
  }
  public void setBoardNo(int boardNo) {
    this.boardNo = boardNo;
  }
  public String getBoardTitle() {
    return boardTitle;
  }
  public void setBoardTitle(String boardTitle) {
    this.boardTitle = boardTitle;
  }
  public String getBoardLinkedUrl() {
    return boardLinkedUrl;
  }
  public void setBoardLinkedUrl(String boardLinkedUrl) {
    this.boardLinkedUrl = boardLinkedUrl;
  }
  public String getWriterNick() {
    return writerNick;
  }
  public void setWriterNick(String writerNick) {
    this.writerNick = writerNick;
  }
  public String getBoardContents() {
    return boardContents;
  }
  public void setBoardContents(String boardContents) {
    this.boardContents = boardContents;
  }
  public int getBoardLike() {
    return boardLike;
  }
  public void setBoardLike(int boardLike) {
    this.boardLike = boardLike;
  }
  public int getBoardViewCount() {
    return boardViewCount;
  }
  public void setBoardViewCount(int boardViewCount) {
    this.boardViewCount = boardViewCount;
  }
  public String getUserEmail() {
    return userEmail;
  }
  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }
  public int getUserNo() {
    return userNo;
  }
  public void setUserNo(int userNo) {
    this.userNo = userNo;
  }
  public int getCategoryNo() {
    return categoryNo;
  }
  public void setCategoryNo(int categoryNo) {
    this.categoryNo = categoryNo;
  }
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }
  public String getLinkedTitle() {
    return linkedTitle;
  }
  public void setLinkedTitle(String linkedTitle) {
    this.linkedTitle = linkedTitle;
  }
  public String getLinkedSimpleUrl() {
    return linkedSimpleUrl;
  }
  public void setLinkedSimpleUrl(String linkedSimpleUrl) {
    this.linkedSimpleUrl = linkedSimpleUrl;
  }
  public String getLinkedDetailUrl() {
    return linkedDetailUrl;
  }
  public void setLinkedDetailUrl(String linkedDetailUrl) {
    this.linkedDetailUrl = linkedDetailUrl;
  }
  public String getLinkedDesc() {
    return linkedDesc;
  }
  public void setLinkedDesc(String linkedDesc) {
    this.linkedDesc = linkedDesc;
  }
  public String getBoardLinkedYoutubeUrl() {
    return boardLinkedYoutubeUrl;
  }
  public void setBoardLinkedYoutubeUrl(String boardLinkedYoutubeUrl) {
    this.boardLinkedYoutubeUrl = boardLinkedYoutubeUrl;
  }
  public String getUserProfilePath() {
    return userProfilePath;
  }
  public void setUserProfilePath(String userProfilePath) {
    this.userProfilePath = userProfilePath;
  }
  public static SimpleDateFormat getSimpleDate() {
    return simpleDate;
  }
  public static void setSimpleDate(SimpleDateFormat simpleDate) {
    MainPage.simpleDate = simpleDate;
  }
  public Date getBoardCreatedDate() {
    return boardCreatedDate;
  }
  public void setBoardCreatedDate(Date boardCreatedDate) {
    this.boardCreatedDate = boardCreatedDate;
    this.boardCreatedStringDate = simpleDate.format(boardCreatedDate);
  }
  public String getBoardCreatedStringDate() {
    return boardCreatedStringDate;
  }
  public void setBoardCreatedStringDate(String str) {
    this.boardCreatedDate = Date.valueOf(str);
    this.boardCreatedStringDate = str;
  }
  public int getFileStatus() {
    return fileStatus;
  }
  public void setFileStatus(int fileStatus) {
    this.fileStatus = fileStatus;
  }
}
