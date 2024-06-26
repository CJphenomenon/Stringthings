import java.util.Objects;

public class RemoveCharacters {
    public static void main(String[] args) {
        String input = "aabcccbbad";
        String result = removeConsecutive(input);
        System.out.println("original string: " + input);
        System.out.println("after remove: " + result);
        while (!Objects.equals(input, result)) {
            input = result;
            result = removeConsecutive(input);
            if (!Objects.equals(input, result)) {
                System.out.println("original string: " + input);
                System.out.println("after remove: " + result);
            }
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
                result.append(String.valueOf(currentChar).repeat(Math.max(0, count)));
            }

        }
        return result.toString();
    }
}