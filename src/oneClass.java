import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class oneClass {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int a=5; a<15; a++){
            numbers.add(a*9);
        }
        System.out.println("Numbers with the multiples of nine: " + numbers);
        System.out.println();
        System.out.print("Number with multiply with 10: ");
        for(int b : numbers){
            System.out.print(b*10 + "  ");
        }

        LinkedList<Integer> members = new LinkedList<>();
        for(int a : numbers){
            members.add(a*2);
        }
        System.out.println();
        System.out.print("Printing the LinkedList: ");
        members.forEach(mem->System.out.print(mem + "  "));

        Map<String, Integer> studentList = new HashMap<>();
        studentList.put("ID", 118055);
        studentList.put("Roll.No", 49);
        studentList.put("Phone", 93815877);
        studentList.put("PinCode", 507160);
        System.out.println();

        System.out.print("Student detail: ");
        studentList.forEach((String aa, Integer bb)-> {
            System.out.print(" ["+aa +" , "+ bb + "]");
        });
        System.out.print(".......");
    }
}
