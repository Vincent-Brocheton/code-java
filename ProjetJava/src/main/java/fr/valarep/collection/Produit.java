package fr.valarep.collection;

public class Produit implements Comparable<Produit>{

    private final String nom;
    private final int poids;

    public Produit(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public int getPoids() {
        return poids;
    }

    @Override
    public String toString() {
        return "Produit [" + nom + ", " + poids + "kg]";
    }

    @Override
    public int compareTo(Produit autre) {
        return this.poids - autre.poids ;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + poids;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produit other = (Produit) obj;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (poids != other.poids)
            return false;
        return true;
    }

}