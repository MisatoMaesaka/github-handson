import java.util.List;

public class Main2 {
    public static void main2(String[] args) {

        int count = 0;
        List<Cat> catList = CatList.setCatList();

        // 配列で使う要素の型　変数名　：　配列
        for (Cat cat : catList) {

            count = count + 1;

            // favorite関数で猫の好物を取得
            System.out.println("ペットの名前" + count + "：" + cat.getName());
            System.out.print("年齢は" + cat.getAge() + "歳で、");
            System.out.println("毛の色は" + cat.getColor() + "です。");
            System.out.println("好物は" + cat.getFavorite().getName() + "が大好きです！");

        }
    }
}
