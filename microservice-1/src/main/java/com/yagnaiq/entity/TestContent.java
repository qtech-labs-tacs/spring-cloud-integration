package com.yagnaiq.entity;


//@Entity
public class TestContent {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String subject;

	private String content;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}