package baseball;

public class Review03 {

    public static void main(String[] args) {

        BaseBallTeam YS = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        YS.report();


        BaseBallTeam DB = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        DB.report();

        BaseBallTeam HT = new BaseBallTeam("阪神タイガース",68,71,4);
        HT.report();

        BaseBallTeam YJ = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        YJ.report();

        BaseBallTeam HC = new BaseBallTeam("広島東洋カープ",66,74,3);
        HC.report();

        BaseBallTeam TD = new BaseBallTeam("中日ドラゴンズ",66,75,2);
        TD.report();
    }

}
