package exercises.newfolder.SentenceSmash;

public class SentenceSmash {
    public static void main(String[] args) {
        String[] words = { "Hello", "world", "this", "is", "Java" };
        String sentence = "";

        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                sentence = words[i];
            } else {
                sentence += " " + words[i];
            }
        }

        System.out.println(sentence);
    }
}
