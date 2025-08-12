package exercises.additional.JoinWords;

public class JoinWords {
    public static void main(String[] args) {
        String[] test = { "Java", "is", "fun" };
        System.out.println(wordsJoined(test));
    }

    public static String wordsJoined(String[] words) {
        String joinedWords = "";
        boolean isFirst = true;

        for (int i = 0; i < words.length; i++) {
            if (isFirst) {
                joinedWords += words[i];
                isFirst = false;
            } else {
                joinedWords += " " + words[i];
            }
        }
        return joinedWords;
    }
}
