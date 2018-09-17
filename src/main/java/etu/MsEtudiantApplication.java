package etu;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import etu.dao.EtudiantRepository;
import etu.dao.FormationRepository;
import etu.entities.Etudiant;
import etu.entities.Formation;

@SpringBootApplication
public class MsEtudiantApplication implements CommandLineRunner {
    @Autowired
    private EtudiantRepository          etudiantRepository;
    @Autowired
    private FormationRepository         formationRepository;
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;
    private DateFormat                  df = new SimpleDateFormat( "dd-mm-YYYY" );

    public static void main( String[] args ) {
        SpringApplication.run( MsEtudiantApplication.class, args );
    }

    @Override
    public void run( String... args ) throws Exception {
        repositoryRestConfiguration.exposeIdsFor( Formation.class, Etudiant.class );
        Formation f1 = new Formation( "Developpement Web", 2 );
        Formation f2 = new Formation( "Network Security", 3 );
        Formation form1 = formationRepository.save( f1 );
        Formation form2 = formationRepository.save( f2 );

        Etudiant et1 = etudiantRepository
                .save( new Etudiant( "Kane", "Cheikh Tidiane", df.parse( "04-03-1995" ), form1 ) );
        Etudiant et2 = etudiantRepository.save( new Etudiant( "Diaw", "Ababacar", df.parse( "14-09-1994" ), form2 ) );
        Etudiant et3 = etudiantRepository
                .save( new Etudiant( "Diop", "El Hadji Diarga", df.parse( "12-01-1995" ), form1 ) );
        Etudiant et4 = etudiantRepository.save( new Etudiant( "Diatta", "Abdou", df.parse( "30-04-1992" ), form1 ) );

    }
}
