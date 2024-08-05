
import java.util.HashMap;
import java.util.Map;

public class DictionaryUsingHashMap {

    private final Map<String, String> dictionary;

    public DictionaryUsingHashMap() {
        dictionary = new HashMap<>();
    }

    public void addWord(String word, String definition) {
        dictionary.put(word, definition);
    }

    public void updateWord(String word, String newDefinition) {
        if (dictionary.containsKey(word)) {
            dictionary.put(word, newDefinition);
        } else {
            System.out.println("Word not found in the dictionary.");
        }
    }

    public String searchWord(String word) {
        return dictionary.getOrDefault(word, "Word not found in the dictionary.");
    }

    public static void main(String[] args) {
        DictionaryUsingHashMap dict = new DictionaryUsingHashMap();
        dict.addWord("AI", "Artificial Intelligence");
        System.out.println(dict.searchWord("AI")); // Prints: Artificial Intelligence
        dict.updateWord("AI", "Advanced Intelligence");
        System.out.println(dict.searchWord("AI")); // Prints: Advanced Intelligence
    }
}
