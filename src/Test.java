
public class Test {
	
	//mainメゾッドがあるTestクラスを実行する
	public static void main(String[] args) {
		
		//Person taro = new Person();のmewはインスタンス化するという意味
		//→newが出てきた場合はインスタンス化と考える
		
		//taroは変数名(わかりやすい名前にする)
		//右辺のPerson()をインスタンス化して変数taroに代入している
		Person taro = new Person();
		//右辺のPerson()をインスタンス化して変数taroに代入している(左辺のPersonは型です)
		
		taro.name = "山田太郎";
		taro.age = 20;
		//taro.nameの「.」を使うことによってtaroインスタンスのnameを呼び出すことができる
		
		//最後にtaro.nameとtaro.ageを出力するので山田太郎と20が表示される
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		
		//演習②
		Person jiro = new Person();
		
		jiro.name = "木村次郎";
		jiro.age = 18;
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		
		Person hanako = new Person();
		
		hanako.name = "鈴木花子";
		hanako.age = 16;
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
		Person eigo = new Person();
		
		eigo.name = "椿本永河";
		eigo.age = 24;
		
		System.out.println(eigo.name);
		System.out.println(eigo.age);
		
		
		taro.phoneNumber ="0010-200-0050";
		System.out.println(taro.phoneNumber);
		
		taro.address = "ooooooo@yahooo.jp";
		System.out.println(taro.address);
		
		taro.talk();
		taro.walk();
		taro.run();
		
		
		Robot aibo = new Robot();
		
		aibo.name = "アイボ";
				
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot asimo = new Robot();
		
		asimo.name = "アシモ";
		
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Robot pepper = new Robot();
		
		pepper.name = "ペッパー";
		
		pepper.talk();
		pepper.walk();
		pepper.run();
	}

}
