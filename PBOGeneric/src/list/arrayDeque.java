
package list;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class arrayDeque {
    public static void main(String[] args) {
        Deque<Integer> aDeque = new ArrayDeque<>();
        
        //operasi method add
        aDeque.add(10);
        aDeque.add(20);
        aDeque.add(30);
        aDeque.add(40);
        aDeque.add(50);
        //menggunakan perulangan for
        aDeque.forEach((data) -> {
            System.out.println("data: " + data);
        });
        System.out.println("-------------------");
        //operasi method clear()
        System.out.println("menggunakan clear()");
        aDeque.clear();
        System.out.println("-------------------");
        //operasi method addFirst()
        aDeque.addFirst(1);
        aDeque.addFirst(5);
        aDeque.addFirst(10);

        
        //operasi method addLast()
        aDeque.addLast(100);
        aDeque.addLast(200);
        
        //iterators
        System.out.println("element dari deque menggunakan iterator: ");
        
        for(Iterator itr = aDeque.iterator();
                itr.hasNext(); ){
            System.out.println(itr.next());
        }
        System.out.println("-------------------");
        //desc Iterator()
        //untuk membalikkan posisi order deque
        System.out.println("element dari deque order di balikkan : ");
        
        for(Iterator descItr = aDeque.descendingIterator();
                descItr.hasNext(); ){
            System.out.println(descItr.next());
        }
        System.out.println("-------------------");
        //operasi getFirst() 
        //method mendapatkan element pertama
        System.out.println("menggunakan getFirst(): " + aDeque.getFirst());
        System.out.println("-------------------");
        //operasi getLast()
        //method mendapatkan element terakhir
        System.out.println("menggunakan getLast(): " + aDeque.getLast());
        System.out.println("-------------------");
    }
}
