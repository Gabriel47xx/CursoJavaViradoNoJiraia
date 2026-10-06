package AulasJava.AulasJava.JavaCore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        System.out.println(map);
        for(String key : map.keySet()){
            System.out.println(key+" : "+ map.get(key));
        }

    }
}
