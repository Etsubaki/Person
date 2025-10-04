
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
		
	}

}
