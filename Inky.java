public class Inky {

    public Inky(String word){
        System.out.println(word);
    }

    public Inky(String word1, String word2, String word3){
        System.out.println(word1 + " " + word2);
        System.out.println(word2 + " " + word3);
        System.out.println(word1 + " " + word2 + " " + word3);
    }

    public static void main(String[] args) {
        
        String pinky = "Donkey";
        String blinky = "Pinky";
        String rinky = "Monkey";

        Inky ponky = new Inky(pinky);
        Inky ponky2 = new Inky(blinky, pinky, rinky);

    }
    
}
