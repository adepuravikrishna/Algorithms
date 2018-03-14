import java.util.*;

public class TestCollections{

     public static void main(String []args){
       // System.out.println("Hello World");
        Set<String> s = new LinkedHashSet<String>();
        s.add("ravi");
        s.add("vamsi");
        s.add("adepu");
        
        Iterator<String> it = s.iterator();
        
        while(it.hasNext()){
            
           System.out.println(it.next());
        }
        
        Map<String,String> map= new HashMap<String,String>();
        
        map.put("adepu","ravi");
        map.put("somesula","anvesh");
        
        for(Map.Entry<String,String> entry: map.entrySet()){
            System.out.println("Key :"+entry.getKey()+", value :"+entry.getValue());
        }
        
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
         
         pq.add(7);
         pq.add(10);
         pq.add(3);
         pq.add(2);
         
         while(!pq.isEmpty()){
            System.out.println(pq.poll()); 
         }       
        
     }
}
