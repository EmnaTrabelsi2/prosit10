import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class   DepartementHashSet implements IDepartement<Departement>{
    private Set<Departement> departements;

    public DepartementHashSet() {

        this.departements = new HashSet<>();

    }
    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNom().equals(nom)) {
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);

    }

    @Override
    public void displayDepartement() {
        departements.forEach(System.out::println);

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(departements);


    }
}
