
class NishinHyouji implements Observer {

	@Override
	public void update(Subject s) {
		// TODO 自動生成されたメソッド・スタブ]
		print(((Suuchi)s).getValue());


	}

	private void print(int n) {
		System.out.println( n + "を2進数で表示します");
		//
		// ここに2進数表示処理を作成する
		//


        // データ初期化
        int bin[]  = new int[32]; // 最大16桁
        int x = 0; // 桁数


        // 変換
        while (n >= 2) {
            bin[x] = n % 2;
            x++;
            n = n / 2;
        }
        bin[x] = n;
        x++;
        // 逆順に出力
        for (int i = x - 1; i >= 0; i--) {
            System.out.print(bin[i]);
        }

        System.out.println(n);


	}

}
