
package list;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList <String> data = new ArrayList<String>();
        data.add("Faisal");
        data.add("Ncek");
        data.add("Maulidan");
        
        for(String name : data) {
            System.out.println(name);
        }
    }
}
