package etu.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "FORMATIONS" )
public class Formation implements Serializable {
    @Id
    @GeneratedValue
    @Column( name = "REF_FORMATION" )
    private Long                 id;
    private String               nom;
    private int                  duree;
    @OneToMany( mappedBy = "formation" )
    private Collection<Etudiant> etudiants;

    public Formation() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Formation( String nom, int duree ) {
        super();
        this.nom = nom;
        this.duree = duree;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom( String nom ) {
        this.nom = nom;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree( int duree ) {
        this.duree = duree;
    }

    public Collection<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants( Collection<Etudiant> etudiants ) {
        this.etudiants = etudiants;
    }

}
