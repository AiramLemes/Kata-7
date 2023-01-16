package kata7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram<T> {
    private Map<T, Integer> map;
    private final String type;
    private final String filter;
    private final String bin;

    public Histogram(String type, String filter, String bin) {
        this.map = new HashMap<T, Integer>();
        this.type = type;
        this.filter = filter;
        this.bin = bin;
    }
    
    public Integer get(T key) {
        return this.map.get(key);
    } 
    
    public Set<T> keySet(){
        return this.map.keySet();
    }
    
    public void increment(T key) {
        this.map.put(key, this.map.containsKey(key) ? this.map.get(key) +1 : 1);
    }  
}
