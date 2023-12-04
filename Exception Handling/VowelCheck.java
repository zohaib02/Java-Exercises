public class VowelCheck {
    public static void main(String[] args) {
        try {
            String text = "Java handling and managing exceptions ";
            // String text = "Typy gyps fly.";
            System.out.println("Original string: " + text);
            checkVowels(text);
            System.out.println("String contains vowels.");
        } catch (NoVowelsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkVowels(String text) throws NoVowelsException {
        boolean containsVowels = false;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (vowels.contains(String.valueOf(ch))) {
                containsVowels = true;
                break;
            }
        }
        if (!containsVowels) {
            throw new NoVowelsException("String does not contain any vowels.");
        }
    }
}
class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}
