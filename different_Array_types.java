import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class different_Array_types  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();

        char[] seq = input.toCharArray();
        System.out.println(seq+ "toCharArray()");
        
        List<String> str = Arrays.asList("Anas","Javid") ;
        System.out.println(str);

        String arr[] = {"Anas","Javid","Aravindh"};
        for(int i=0;i<arr.length;i++) System.out.println(arr[i]);

        ArrayList<String> cars = new ArrayList<String>(str);
        // cars.add("Volvo");
        System.out.println(cars);
        

        sc.close();
    }
}
