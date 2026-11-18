package ss8_collection;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5};

        System.out.println("--- 1. ĐẢO NGƯỢC MẢNG SỐ NGUYÊN ---");
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));

        Stack<Integer> stackInteger = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            stackInteger.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stackInteger.pop();
        }

        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(array));
        System.out.println();

        String inputStr = "Tra Giang";

        System.out.println("--- 2. ĐẢO NGƯỢC CHUỖI TỪNG TỪ ---");
        System.out.println("Chuỗi ban đầu: \"" + inputStr + "\"");

        String[] mWords = inputStr.split("\\s+");
        Stack<String> wStack = new Stack<>();

        for (String mWord : mWords) {
            wStack.push(mWord);
        }

        for (int i = 0; i < mWords.length; i++) {
            mWords[i] = wStack.pop();
        }
        String resultStr = String.join(" ", mWords);

        // Tham khảo StringBuilder.
    }
}