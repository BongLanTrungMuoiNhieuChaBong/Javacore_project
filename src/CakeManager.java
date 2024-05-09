import java.util.HashMap;
import java.util.Map;

public class CakeManager {
    private Map<String, Integer> cakeInventory;
    public CakeManager(){
        cakeInventory = new HashMap<>();
    }
    public void sellCake(String name, int quantity){
        if (cakeInventory.containsKey(name)){
            int currentQuantity = cakeInventory.get(name);
            cakeInventory.put(name, currentQuantity - quantity);
            System.out.println(quantity + " " + name + "(s) đã được bán.");
        }
    }
}
