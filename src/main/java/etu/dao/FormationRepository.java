package etu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import etu.entities.Formation;

public interface FormationRepository
        extends JpaRepository<Formation, Long> {

}
