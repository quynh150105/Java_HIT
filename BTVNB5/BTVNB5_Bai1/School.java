package BTVNB5_Bai1;
import java.util.Scanner;
public class School {
	private String SName;
	private String SDate;
	
	public School(String SName, String SDate) {
		this.SName = SName;
		this.SDate = SDate;
	}
	
	public School() {
	}

	public void setName(String SName) {
		this.SName = SName;
	}
	public String getName() {
		return SName;
	}
	public void setDate(String SDate) {
		this.SDate = SDate;
	}
	public String getDate() {
		return SDate;
	}
	

}
