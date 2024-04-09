import java.util.Objects;

public class ReplaceCharacters {
    public static void main(String[] args) {
        boolean removeflag = false;
        String input = "abcccbad";
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
                for (int j = 0; j < count; j++) {
                    result.append(currentChar);
                }
            } else {
                char replacement = (char) (currentChar - 1);
                if (Character.isLetter(replacement)) {
                    result.append(replacement);
                }

            }

        }
        return result.toString();
    }
}