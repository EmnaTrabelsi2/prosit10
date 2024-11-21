import java.util.Objects;

public class Departement implements Comparable<Departement>{
    int id;
    String nom;
    int nbr;
    public Departement(){}
    public Departement(int id, String nom, int nbr) {
        this.id = id;
        this.nom = nom;
        this.nbr=nbr;
    }
int getId() {return this.id;}
    int getNbr() {return this.nbr;}
    String getNom() {return this.nom;}
    void setId(int id) {this.id=id;}
    void setNbr(int nbr) {this.nbr=nbr;}
    void setNom(String nom) {this.nom=nom;}
    @Override
    public String toString() {
        return " Departement {" +
                "identifiant=" + id +
                ", nom='" + nom + '\'' +
                ", nbr='" + nbr + '\'' +                '}';


    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement departement = (Departement) o;
        return Double.compare(departement.id, id) == 0 && Objects.equals(nom, departement.nom);
    }




    // Redéfinition de la méthode hashCode (nécessaire pour le bon fonctionnement dans un HashSet)
    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    public int compareTo(Departement other) {
        return Integer.compare(this.id, other.id); // Compare les IDs en tant qu'entiers
    }

}
