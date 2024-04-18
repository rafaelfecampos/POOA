package br.edu.vianna.game.model;

import br.edu.vianna.game.model.ETipoResultado;
import br.edu.vianna.game.model.Jogo;
import br.edu.vianna.game.model.User;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-17T19:38:40", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Aposta.class)
public class Aposta_ { 

    public static volatile SingularAttribute<Aposta, Double> valorApostado;
    public static volatile SingularAttribute<Aposta, ETipoResultado> palpite;
    public static volatile SingularAttribute<Aposta, User> apostador;
    public static volatile SingularAttribute<Aposta, Date> dataAposta;
    public static volatile SingularAttribute<Aposta, Integer> id;
    public static volatile SingularAttribute<Aposta, Jogo> jogo;

}