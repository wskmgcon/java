import com.sun.jdi.IntegerType;

import java.util.*;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamsapi {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(11,12,13,14,15,16,1,2,3,4,5,6,1,2,3);
        System.out.println(lst1);



        List<Integer> lst=new ArrayList<Integer>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(5);
        lst.add(4);
        lst.add(6);
        lst.add(3);
        System.out.println("Normal List "+lst);
        Set<Integer> st=new HashSet<>();
        st.addAll(lst);
        System.out.println(st);
        List str= lst.stream().map(n->n*2).collect(Collectors.toList());
        Set<Integer> set=lst.stream().collect(Collectors.toSet());

       // System.out.println(hm);
  List even=lst.stream().filter(n->(n*2)%2!=0).collect(Collectors.toList());

      //  List lst1=lst.stream().filter(n->n%2!=0).collect(Collectors.toList());
List eve=lst.stream().filter(n->n%2==0).collect(Collectors.toList());
System.out.println("even no "+eve);
        System.out.println("Map List stream takes int "+str);
System.out.println("Filter method on stream takes boolean "+even);
        System.out.println("Set method on Stream "+set);
        lst.stream().map(n->n*3).forEach(n->System.out.println("Foreach loop "+n));
        System.out.println("Stream Find method "+lst.stream().findFirst().orElse(null));

        List alist=Arrays.asList(lst,lst1.subList(0,4),lst1.subList(5,9),lst1.subList(10,14));
        System.out.println("Arrays as List "+alist);
     // Set<Integer> fm= alist.stream().flatMap().collect(Collectors.toSet());
   //   System.out.println(fm);

//child c=new child("rohit",1);
//Map<Integer,Integer> hm=lst.stream().collect(Collectors.toMap(,))
/*HashMap<Integer,Integer> hm=new HashSet<>();
hm.put(1,2);
        System.out.println(hm);
        Set<Integer> set=new HashSet<>();
        set.add(1);*/
    }
}
