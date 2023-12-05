package entities;

public class Departement implements Comparable<Departement>{
    private int id;
    private String nomDepartement;
    private int nbrEmploye;

    public Departement() {
    }

    public Departement(int id, String nomDepartement, int nbrEmploye) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbrEmploye = nbrEmploye;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNbrEmploye() {
        return nbrEmploye;
    }

    public void setNbrEmploye(int nbrEmploye) {
        this.nbrEmploye = nbrEmploye;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement departement = (Departement) o;
        return id == departement.id && nomDepartement.equals(departement.nomDepartement);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + nomDepartement.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nomDepartement=" + nomDepartement + ", nbrEmploye=" + nbrEmploye;
    }

    @Override
    public int compareTo(Departement o) {
        return id-o.getId();
    }
}
