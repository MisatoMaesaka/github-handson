import java.util.List;

public class CatList {
    // List型関数で作成
    public static List<Cat> setCatList() {

        // 配列の要素の型（名前、年齢、カラー）はCatクラスのものを使用
        return List.of(new Cat("Roku", 4, "黒"),
                new Cat("Tom", 1, "灰＆白"),
                new Cat("Lucca", 1, "こげ茶＆白"),
                new Cat("Bun", 0, "黒＆白"),
                new Cat("Hinata", 0, "茶＆白"));
    }
}
