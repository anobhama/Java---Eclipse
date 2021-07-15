//usage of static variables

package com.lti.demos;

class Fb
{
	int userId;
	static int no=0;
	
	Fb(int userId)
	{
		this.userId= userId;
	}

	@Override
	public String toString() {
		return "Fb [userId=" + userId + ", no=" + no + "]";
	}
	void showLikes()
	{
		no++;
		System.out.println(no);
	}
	
}
public class Static_FB {
public static void main(String[] args) {
	
	Fb usr1=new Fb(101);
	//System.out.println(usr1);
	usr1.showLikes();
	
	Fb usr2=new Fb(102);
	usr2.showLikes();
}


}


