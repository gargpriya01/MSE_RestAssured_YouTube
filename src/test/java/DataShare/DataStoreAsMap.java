package DataShare;

import java.util.LinkedHashMap;

public class DataStoreAsMap {
    private DataStoreAsMap(){};

    private  static LinkedHashMap<String,Object> datMap= new LinkedHashMap<String,Object>();

    public static void setValue(String key,Object value)
    {
        datMap.put(key,value);
    }

    public static Object getValue(String key){
        return datMap.get(key);
    }
}
