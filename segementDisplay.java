import java.util.HashMap;
import java.util.Map;
import java.awt.*;
import java.awt.event.KeyListener;
//practise Assignment 5 of week 8
public class segementDisplay implements KeyListener {
    private static final Map<Integer, Integer> encodings = new HashMap<Integer, Integer>();
    static {
        encodings.put(0, 0x7E);
        encodings.put(1, 0x30);
        encodings.put(2, 0x6D);
        encodings.put(3, 0x79);
        encodings.put(4, 0x33);
        encodings.put(5, 0x5B);
        encodings.put(6, 0x5F);
        encodings.put(7, 0x70);
        encodings.put(8, 0x7F);
        encodings.put(9, 0x7B);
    }
    public static void printDigit(int digit) {
        int code = encode(digit);
        char[] bits = String.format("%7s", Integer.toBinaryString(code)).replace(' ', 0).toCharArray();
        lightSegment(bits[0] == '1', " ")
    }
    public static void main(String[] args) {












        // HashMap<String, Integer> Map = new HashMap<>();
        // Map.put("javif", 1111);
        // Map.put("shahid", 2222);
        // Map.put("javid", 3333);
        // Map.put("ashwaq", 4444);
        // Map.put("afridhy", 5555);
       // System.out.println(Map.get("javif"));
       
       //System.out.println(Map);
    }
}
