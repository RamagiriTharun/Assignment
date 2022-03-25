import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ClassAssignment5 {
    static void mapMethod(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("R","Tharun");
        map.put("D","Prasad");
        map.put("P","srenu");

        Map<String, String> treeMap = new TreeMap<String, String>(map);
        for(Map.Entry<String,String> entry : treeMap.entrySet()){
            System.out.println("Key: " +entry.getKey() + " Value: "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        mapMethod();
    }
}
