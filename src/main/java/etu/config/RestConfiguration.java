package etu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import etu.entities.Etudiant;
import etu.entities.Formation;

@Configuration
public class RestConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration( RepositoryRestConfiguration config ) {
        config.exposeIdsFor( Etudiant.class, Formation.class );
        // permet de retourner l'entéte qui a été ajouter
        config.setReturnBodyOnCreate( true );
        config.setReturnBodyOnUpdate( true );
        config.getCorsRegistry()
                .addMapping( "/**" )
                .allowedOrigins( "http://localhost:4200" )
                .allowedHeaders( "*" )
                .allowedMethods( "GET", "POST", "PUT", "DELETE", "PATH" );
    }

}
