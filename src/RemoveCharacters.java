import java.util.Objects;

public class RemoveCharacters {
    public static void main(String[] args) {
        boolean removeflag = false;
        String input = "aaabbbcccdddeeefffggg";
        String result = removeConsecutive(input);
        System.out.println("original string: " + input);
        System.out.println("after remove: " + result);
        int length = result.length();
        while (!Objects.equals(input, result)) {
            input = result;
            result = removeConsecutive(input);
            System.out.println("original string: " + input);
            System.out.println("after remove: " + result);
            length = result.length();


        }
    }

    public static String removeConsecutive(String input) {
        StringBuilder result = new StringBuilder();
        int length = input.length();

        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);
            int count = 1;
            while (i < length - 1 && Objects.equals(input.charAt(i + 1), currentChar)) {
                count++;
                i++;
            }
            if (count <= 2) {
                for (int j = 0; j < count; j++) {
                    result.append(currentChar);
                }
            }

        }
        return result.toString();
    }
}