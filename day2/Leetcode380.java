import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RandomizedSet {

    private HashMap<Integer, Integer> map;
    private List<Integer> list ;
    private Random random ;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))return false;

        list.add(val);
        map.put(val, list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);

        // Swap val with last element
        list.set(index, lastElement);
        map.put(lastElement, index);

        // Remove last
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }
    
    public int getRandom() {
        int rn = random.nextInt(list.size());
        return list.get(rn);
    }


}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */