/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author moulaYounes
 */
public class Operation {
    private int id;
    private double montant;
    private String type;
    private Compte compte;

    public Operation(int id, double montant, String type) {
        this.id = id;
        this.montant = montant;
        this.type = type;
    }

    public Operation(int id) {
        this.id = id;
    }

    public Operation() {
    }
    
    

    @Override
    public String toString() {
        return "Operation{" + "id=" + id + ", montant=" + montant + ", type=" + type + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Operation other = (Operation) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Compte getCompte() {
        if(compte==null){
            compte=new Compte();
        }
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
    
    
}
