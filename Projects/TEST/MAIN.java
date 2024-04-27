package TEST;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MAIN {
enum MyClass{
    INSTANCE;

    MyClass() {
        System.out.println("hahah");
    }
}
static int x=9;
    public static void main(String[] args) {
//        char[] name = {'j','a','v','a'};
//        Function<char[],String> v = String::new;
//        System.out.println(v.apply(name));

//        Stream.iterate(1,i->i+2).limit(5).skip(2).forEach(System.out::println);

        List<Integer> myList = Arrays.asList(25,49,100,81);
//        List<Integer> list = list.Stream()
//                .filter(n->n<2)
//                .forEach(System.out::println)

//        myList.stream()
//                .map(x->Math.sqrt(x))
//                .forEach(System.out::println);
        List<String> strings = Arrays.asList(
                "abebe", "chala"
        );
//String [] vals = strings.stream().toArray(x->new String[x]);
//        String [] vals = strings.stream().toArray(String[]::new);
//for(String v:vals){
//    System.out.println(v);
//}


            Stream strigs = Stream.of("A", "good", "day", "to", "write", "some", "Java");
//        System.out.println(strigs.reduce("",(a,b)->a+" "+b));
        String str1 = "apple";
        String str2 = "banana";
List<String> ab = Arrays.asList("","");
        int result = str1.compareTo(str2);
        System.out.println(result);

    }

    static int getShortestDistance(int [] a){
        int time=0;
        if(a.length==0||a==null) return 0;
        if(a.length==1) return a[0];

        Arrays.sort(a);
        time+=a[1];
//        time



        return time;

    }
}
