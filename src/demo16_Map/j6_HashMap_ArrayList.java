package demo16_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class j6_HashMap_ArrayList {
    public static void main(String[] args) {
        // 创建元素类型为HashMap类型的ArrayList
        ArrayList<HashMap<String, String>> hmArrList = new ArrayList<>();

        // 创建集合ArrayList的第一个元素 -- HashMap集合，并设置键值对元素
        HashMap<String, String> strStrHashMap1 = new HashMap<>();
        strStrHashMap1.put("01","java");
        strStrHashMap1.put("02","C++");
        hmArrList.add(strStrHashMap1);  // 把HashMap作为元素添加到ArrayList集合

        // 创建集合ArrayList的第二个元素 -- HashMap集合，并设置键值对元素
        HashMap<String, String> strStrHashMap2 = new HashMap<>();
        strStrHashMap2.put("03","C");
        strStrHashMap2.put("04","Python");
        strStrHashMap2.put("05","Golong");
        hmArrList.add(strStrHashMap2);

        // 创建集合ArrayList的第三个元素 -- HashMap集合，并设置键值对元素
        HashMap<String, String> strStrHashMap3 = new HashMap<>();
        strStrHashMap3.put("06","Cpython");
        strStrHashMap3.put("07","python-types");
        strStrHashMap3.put("08","C#");
        hmArrList.add(strStrHashMap3);

        // 这是从 元素类型是HashMap<String, String>的ArrayList中抽取HashMap元素
        for (HashMap<String, String> hm: hmArrList){
            Set<String> keySet = hm.keySet();
            // 这是从 元素HashMap<String, String> 的 keySet集合(即键集合)中 抽取元素
            for(String key: keySet){
                System.out.println(hm.get(key));
            }
        }
    }
}
