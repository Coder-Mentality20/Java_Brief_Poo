public class Compte3 {
    String name;
    String adresse;
    double solde;
    public  Compte3(String name, String adresse, double solde)
    {
      this.name=name;
      this.adresse=adresse;
      this.solde=solde;


    }
    public String getName(String name){
        return name;
    }
    public String getAdresse(String adresse){
        return adresse;
    }
    public String getSolde(String solde){
        return solde;
    }
   public static void main(String[]args)
   {
       Compte3 c3 =new Compte3("El Alami Hassan","Safi",14765.8);
       System.out.println(c3.name +" habite a "+ c3.adresse +" infos solde - "+ c3.solde+"DH");
       Compte3 c1 =new Compte3("Karimi Khalid","Casablanca",7654.0);
       System.out.println(c1.name+" habite a "+ c1.adresse +" infos solde - "+ c1.solde+"DH");
   }
}