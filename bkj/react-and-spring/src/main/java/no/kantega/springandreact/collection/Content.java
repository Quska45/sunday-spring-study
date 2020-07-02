package no.kantega.springandreact.collection;

import org.springframework.data.annotation.Id;

public class Content {

  @Id
  public String id;

	public String title;    //크롤링한 글 제목
	public String content;  //크롤링한 글 내용 : 필요없다고 생각되는데 일단 넣었음
	public String ownerName;//크롤링한 글의 작성자
	public String readCount;//크롤링한 글의 조회수
	public String regDate;  //크롤링한 날짜
  
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getReadCount() {
		return readCount;
	}
	public void setReadCount(String readCount) {
		this.readCount = readCount;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
  
  
}