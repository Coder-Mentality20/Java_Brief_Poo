public class Compte2 {
    String nom;
    String Adresse;
    double sold;

    public  double  calculerInterer(double tauxinterets) {  //ex4
        double SoldInteret=sold*tauxinterets/100;
        return SoldInteret;
    }
    public void  afficherInfosSolde () {
        System.out.println(nom+" habite à "+Adresse+" - infos solde "+sold+" DH"+" et intérêts "+calculerInterer(7));
    }
    public static void main(String[] args) {
        Compte2 client1=new Compte2();
        client1.nom="alami Hassan";
        client1.Adresse="Safi";
        client1.sold=14765.80;
        client1. afficherInfosSolde();
        Compte2 client2=new Compte2();
        client2.nom="karim khalid";
        client2.Adresse="casablanca";
        client2.sold=7645;
        client2. afficherInfosSolde();
    }
}
