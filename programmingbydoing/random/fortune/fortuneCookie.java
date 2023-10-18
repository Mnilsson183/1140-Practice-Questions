package programmingbydoing.random.fortune;
/*
 * https://programmingbydoing.com/a/fortune-cookie.html
 */
public class fortuneCookie {
    public static void main(String[] args){
        int indexCookie = (int)(Math.random() * 6);
        String cookie[] = {
            "A beautiful, smart, and loving person will be coming into your life.", 
            "A dubious friend may be an enemy in camouflage.", 
            "No one asked you", 
            "A faithful friend is a strong defense.", 
            "A feather in the hand is better than a bird in the air.", 
            "A fresh start will put you on your way." 
        };

        System.out.printf("Fortune cookie says: %s\n", cookie[indexCookie]);



    }
}
