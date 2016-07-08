package com.atguigu.exam;
/**
 * 定义题目Item类 里面带属性
 * 选择题内容包括题目、4个选项和标准答案（均为单选）；

 * @author kang chen
 *
 */
public class Item {
	private String title;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private char answer;
	public Item() {
	}
	public Item(String title, String optionA, String optionB, String optionC,
			String optionD, char answer) {
		this.title = title;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = answer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	public char getAnswer() {
		return answer;
	}
	public void setAnswer(char answer) {
		this.answer = answer;
	}
	public String getQuestion(){
		return title+"\n"+optionA+"\n"+optionB+"\n"+optionC+"\n"+optionD;
	}
	@Override
	public String toString() {
		return   title+"\n"+optionA+"\n"+optionB+"\n"+optionC+"\n"+optionD+"\n"+answer;
	}
	

	
}
