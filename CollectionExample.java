import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        System.err.println("implementation of hashset,treeset,linked list");

        Set<Integer> rollno=new HashSet<>();
        rollno.add(1);
        rollno.add(2);
        rollno.add(3);
        System.err.println("this is for set");

        System.err.println("==========Hashset============");
        HashSet <Integer> nums=new HashSet<>();
        nums.add(101);
        nums.add(102);
        nums.add(103);
        nums.add(103);//duplicate
        nums.add(104);
        System.err.println("hashset is for maintaining ordered list");

        System.out.println("find the number "+ nums.contains(104));

        //remove number
        System.out.println("remove the number "+ nums.remove(101));
        System.out.println("elements of hashset "+ nums);

        System.out.println("==========linked list=========");
        LinkedList<Integer>num=new LinkedList<>();
        num.add(2000);
        num.add(2001);
        num.add(2002);
        num.add(2004);
        
        System.out.println("size of the student numbers: "+num.size());
        System.out.println("to check it is empty "+ num.isEmpty());
        System.out.println("check for contains "+num.contains(2005));

        System.out.println("======tree set========");
        Set <Integer> n=new TreeSet<>();
        for(Integer i:num){
            n.add(i);
        }
        System.out.println("checking contains :"+n.contains(2001));
        System.out.println("checking is empty :"+ n.isEmpty());
        System.out.println("elements of tree set :"+ n);








    }
    
}
