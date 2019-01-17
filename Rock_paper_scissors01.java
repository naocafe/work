package rock_paper_scissors;

import lib.Input;

public class Rock_paper_scissors01 {

	public static void main(String[] args) {
		// じゃんけんゲーム

		//値の定義

		String stryou;      //ユーザ入力の文字列格納
		int youplay = 0;       //ユーザの入力内容を数値に変換
		int cpuplay = 0;
		int flg = 0;        //終了フラグの設定
		int win = 0;        //戦績格納用
		int lose = 0;
		int draw = 0;
		int intWork;

		//ゲーム画面出力
		gametitle();

		while(flg != 1) {

			//ユーザに入力を求める
			if((stryou = Input.getString("グー チョキ パー もしくは 終了 のいずれかを入力してください。")) != null) {

				//グーチョキパーの判定
				if(stryou.equals("グー")) {
					youplay = 0;
				}else if(stryou.equals("チョキ")){
					youplay = 1;
				}else if(stryou.equals("パー")) {
					youplay = 2;
				}else if(stryou.equals("終了")) {
					System.out.println("ゲームを終了します。");
					System.out.println("戦績：勝利" + win + "負け" + lose + "あいこ" + draw);
					flg = 1; //念のため
					break;  //終了
				}else {
					System.out.println("正しい文字を入力してください。");
					continue;
				}

				//cpuの手札を取得
				cpuplay = (int)(Math.random() * 3);  //0～3でランダムで取得

				//勝敗の判定
				//勝ち0　負け1　あいこ2
				intWork = gamewinlose(youplay,cpuplay);

				//戦績の保存
				if(intWork == 0) {
					win++;
				}else if(intWork == 1) {
					lose++;
				}else {
					draw++;
				}


			}else {
				System.out.println("正しい文字を入力してください。");
			}


		}


	}

	public static int gamewinlose(int youplay, int cpuplay) {
		//0:グー 1:チョキ 2:パー
		int intWork = 0; //勝ち0　負け1　あいこ2

		switch(youplay){
		case 0: //グー
			switch(cpuplay) {
			case 0:
				intWork = 2;
				System.out.println("CPUはグーです。");
				System.out.println("あいこです。");
				break;
			case 1:
				intWork = 0;
				System.out.println("CPUはチョキです。");
				System.out.println("あなたの勝ちです。");
				break;
			case 2:
				intWork = 1;
				System.out.println("CPUはパーです。");
				System.out.println("あなたの負けです。");
				break;

			}

			break;
		case 1: //チョキ
			switch(cpuplay) {
			case 0:
				intWork = 1;
				System.out.println("CPUはグーです。");
				System.out.println("あなたの負けです。");
				break;
			case 1:
				intWork = 2;
				System.out.println("CPUはグーです。");
				System.out.println("あいこです。");
				break;
			case 2:
				intWork = 0;
				System.out.println("CPUはグーです。");
				System.out.println("あなたの勝ちです。");
				break;

			}

			break;
		case 2: //パー
			switch(cpuplay) {
			case 0:
				intWork = 0;
				System.out.println("CPUはグーです。");
				System.out.println("あなたの勝ちです。");
				break;
			case 1:
				intWork = 1;
				System.out.println("CPUはグーです。");
				System.out.println("あなたの負けです。");
				break;
			case 2:
				intWork = 2;
				System.out.println("CPUはグーです。");
				System.out.println("あいこです。");
				break;

			}
			break;
		}




		return intWork;
	}


	public static void gametitle() {
		//タイトルを表示するだけ。
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		System.out.println("*****************じゃんけんゲーム*****************");
		System.out.println("*********************201812***********************");
		System.out.println("**************************************************");
		System.out.println("**************************************************");


		return;

	}



}
