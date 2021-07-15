package com.lti.demos;


class FaceBook {
	int userId;
	int no = 0;
	static int like=0;

	FaceBook(int userId) {
		this.userId = userId;
	}
	static void likes()
	{
		like++;
		System.out.println(" likes " + like);
	}		
	@Override
	public String toString() {
		return "FaceBook [userId=" + userId + ", no=" + no + "]";
	}
	void showLikes()
	{
		no++;
		System.out.println("no : "  +no);		
	}
}

public class FaceBookUserApp {

	public static void main(String[] args) {
		
		Math.sqrt(25);
		
		FaceBook user1= new FaceBook(101);
		System.out.println(user1);
		user1.showLikes();
		FaceBook.likes();
		
		FaceBook user2= new FaceBook(102);
		System.out.println(user2);
		user2.showLikes();
		FaceBook.likes();
		
		FaceBook user3= new FaceBook(102);
		System.out.println(user3);
		user3.showLikes();
		FaceBook.likes();

	}

}