
public class Person {
	
	//初期値としてそれぞれnullと0を代入しておく
	//→これを「初期化」という
	//このあと、この中にTestクラスからnameとageを持ってくる
	public String name = null;
	public int age = 0;
	
	public String phoneNumber = null;
	public String address = null;
	
	public void talk() {
		System.out.println(this.name + "が話す");
	}
	
	public void walk() {
		System.out.println(this.name + "が歩く");
	}
	
	public void run() {
		System.out.println(this.name + "が走る");
	}

}
