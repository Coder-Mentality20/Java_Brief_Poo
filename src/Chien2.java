public class Chien2 {
    String nom;
    void aboyer(String meal1) {
        System.out.println(nom+" "+meal1);
    }
    void mange(String meal2 ) {
        System.out.println(nom+" "+meal2);
    }
    public static void main(String[] args) {
        Chien2 Rex=new Chien2();
        Rex.nom="Rex";
        Rex.aboyer("Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! - Je mange de la viande");
        Rex.mange("Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! - Je mange de la viande");
        Chien2 Max=new Chien2();
        Max.nom="Max";
        Max.aboyer("Je ne suis pas du tout en colère. Iwiw !! awaw !! - Je mange du poisson");
        Max.mange("Je ne suis pas du tout en colère. Iwiw !! awaw !! - Je mange du poisson");
    }
}
