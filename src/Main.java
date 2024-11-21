import java.util.TreeSet;

public class Main {public static void main(String[] args) {
    DepartementHashSet departementHashSet = new DepartementHashSet();

    // Création de départements
    Departement dep1 = new Departement(3, "Marketing", 30);
    Departement dep2 = new Departement(1, "Informatique", 50);
    Departement dep3 = new Departement(2, "Finance", 20);

    // Ajouter des départements
    departementHashSet.ajouterDepartement(dep1);
    departementHashSet.ajouterDepartement(dep2);
    departementHashSet.ajouterDepartement(dep3);

    // Afficher les départements triés par ID
    TreeSet<Departement> sortedDepartements = departementHashSet.trierDepartementById();
    System.out.println("Départements triés par ID :");
    for (Departement dep : sortedDepartements) {
        System.out.println(dep);
    }
}
    }