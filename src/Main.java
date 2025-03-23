import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan kelimeyi alma-->
        System.out.println("Bir Kelime Yazınız: ");
        String word=scanner.nextLine().toLowerCase();

        //TreeMap sıralama yapmayı sağlar
        Map<Character,Integer> frekans =new TreeMap<>();

        for (char abc:word.toCharArray()){
            if (Character.isLetter(abc)){
                frekans.put(abc,frekans.getOrDefault(abc,0)+1);
            }
        }
        //Sonuçları alfabetik sırayla yazdır
        for (Map.Entry<Character,Integer> entry : frekans.entrySet()){
            System.out.println(entry.getKey()+ " = " + entry.getValue());
        }
    }
}