package br.edu.vianna.game.model;

import br.edu.vianna.game.model.Jogo;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-22T19:27:04", comments="EclipseLink-2.7.7.v20200504-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-17T19:38:40", comments="EclipseLink-2.7.7.v20200504-rNA")
>>>>>>> b43f3b411c7276a1a73634fa54007629fa79aeb3
@StaticMetamodel(Time.class)
public class Time_ { 

    public static volatile ListAttribute<Time, Jogo> jogosComoTime2;
    public static volatile ListAttribute<Time, Jogo> jogosComoTime1;
    public static volatile SingularAttribute<Time, String> nome;
    public static volatile SingularAttribute<Time, Integer> id;
    public static volatile SingularAttribute<Time, Date> dataFundacao;

}