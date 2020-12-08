public class Compte {
    String nom;
    String Adresse;
    double sold;

    public  double  calculerInterer() {  //ex4
        double SoldInteret=sold/100;
        return SoldInteret;
    }
    public void  afficherInfosSolde () {
        System.out.println(nom+" habite à "+Adresse+" - infos solde "+sold+" DH"+" et intérêts "+calculerInterer());
    }
    public static void main(String[] args) {
        Compte client1=new Compte();
        client1.nom="alami Hassan";
        client1.Adresse="Safi";
        client1.sold=14765.80;
        client1. afficherInfosSolde();
        Compte client2=new Compte();
        client2.nom="karim khalid";
        client2.Adresse="casablanca";
        client2.sold=7645;
        client2. afficherInfosSolde();
    }
}
