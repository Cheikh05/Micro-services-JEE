package etu.dao;

import org.springframework.data.rest.core.config.Projection;

import etu.entities.Etudiant;

@Projection( name = "p1", types = { Etudiant.class } )
public interface EtudiantProjection {

    public String getNom();

}
