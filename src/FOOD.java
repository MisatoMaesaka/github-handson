public class FOOD {
    //関数の返り値は文字列　引数は数値型
    public static String getFavorite(int age) {
        String food;
        if (age >= 4) {
            food = "ちゅ〜るまぐろ味が大好き！";
            // 上の条件でここから4歳以下確定
        } else if (1 <= age) {
            food = "鰹節が大好き！";
        } else {
            food = "にぼしが大好き！";
        }
        return food;

    }
}
