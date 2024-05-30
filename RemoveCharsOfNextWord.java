import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        String s = "mobilePhone Phone RING EAR EARRINGS";
        System.out.println(removeCharsOfNextWord(s));
    }

    public static String removeCharsOfNextWord(String s) {
        String[] words = s.split(" ");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            for (char c : words[i + 1].toCharArray()) {
                words[i] = words[i].replace(String.valueOf(c), "");
            }
            if (!words[i].isEmpty()) {
                result.add(words[i]);
            }
        }
        result.add(words[words.length - 1]); // add the last word
        return String.join(" ", result);
    }
}