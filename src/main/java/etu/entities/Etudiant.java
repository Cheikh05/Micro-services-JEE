package etu.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "ETUDIANTS" )
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue
    @Column( name = "REF_ET" )
    private Long      id;
    private String    nom;
    private String    prenom;
    private Date      dateNaissance;
    @ManyToOne
    @JoinColumn( name = "REF_FORMATION" )
    private Formation formation;

    public Etudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Etudiant( String nom, String prenom, Date dateNaissance, Formation formation ) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.formation = formation;
    }

    public Long getId() {
        return id;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation( Formation formation ) {
        this.formation = formation;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom( String prenom ) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance( Date dateNaissance ) {
        this.dateNaissance = dateNaissance;
    }

}
