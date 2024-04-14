package br.edu.vianna.game.model;

import br.edu.vianna.game.model.Jogo;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-08T17:07:21", comments="EclipseLink-2.7.7.v20200504-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-10T20:14:14", comments="EclipseLink-2.7.7.v20200504-rNA")
>>>>>>> a78fc261c500989f68622a10a2298390ed035014
@StaticMetamodel(Time.class)
public class Time_ { 

    public static volatile ListAttribute<Time, Jogo> jogosComoTime2;
    public static volatile ListAttribute<Time, Jogo> jogosComoTime1;
    public static volatile SingularAttribute<Time, String> nome;
    public static volatile SingularAttribute<Time, Integer> id;
    public static volatile SingularAttribute<Time, Date> dataFundacao;

}