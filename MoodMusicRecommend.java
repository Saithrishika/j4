import java.util.Scanner;

public class MoodMusicRecommend {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Welcome to Mood Music Recommender ");
            System.out.println("How are you feeling today? (happy, sad, angry, relaxed, excited)");
            System.out.print("Enter your mood: ");
            String mood = sc.nextLine().toLowerCase();
            
            System.out.println("\nRecommended Song:");
            
            switch (mood) {
                case "happy" -> System.out.println("Song: \"Happy\" by Pharrell Williams");
                case "sad" -> System.out.println(" Song: \"Someone Like You\" by Adele");
                case "angry" -> System.out.println("Song: \"In the End\" by Linkin Park");
                case "relaxed" -> System.out.println("Song: \"Weightless\" by Marconi Union");
                case "excited" -> System.out.println(" Song: \"Can't Stop the Feeling!\" by Justin Timberlake");
                default -> System.out.println(" Mood not recognized. Try again with happy/sad/angry/relaxed/excited.");
            }
        }
    }
}
