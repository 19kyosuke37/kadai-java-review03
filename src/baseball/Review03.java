package baseball;

public class Review03 {

    public static void main(String[] args) {

        BaseBallTeam ys = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        ys.report();
      
        BaseBallTeam db = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        db.report();

        BaseBallTeam ht = new BaseBallTeam("阪神タイガース",68,71,4);
        ht.report();

        BaseBallTeam yj = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        yj.report();

        BaseBallTeam HC = new BaseBallTeam("広島東洋カープ",66,74,3);
        HC.report();

        BaseBallTeam TD = new BaseBallTeam("中日ドラゴンズ",66,75,2);
        TD.report();
    }

}
