import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String a="mohit";
        System.out.println(a);
        float b=6.5f;
        System.out.println(b);
        System.out.println(a.length());
        String a2=a.replace('m','r');
        System.out.println(a2);
        String name="mohit meena";
        System.out.println(name.substring(0,3));

        int[] marks= new int[3];
        marks[0]=97;
        marks[1]=67;
        marks[2]=99;
        Arrays.sort(marks);
        System.out.println(marks[0]);

        mohit t1=new mohit();
        t1.method_1();
    }
}

