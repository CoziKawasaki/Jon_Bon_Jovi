import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JonBonJovi {
    public static void main(String[] args) {
        string array[] = {"ボ", "ン", "ジョ", "ヴィ"};
        List<String> list = Arrays.asList(array);
        String str = null;
        for(int i=1; ; i++) {
            Collections.shuffle(list);
            System.out.printf(list.get(0));
            str += list.get(0);
            if (i % 2 == 0) {
                System.out.printf("・");
                str += "・";
            }
            if (str.indexOf("ジョン・ボン・ジョヴィ") >= 0) {
                System.out.printf("\n" + String.valueOf(i) + " Bon Jovis");
                break;
            }
        }
    }
}
