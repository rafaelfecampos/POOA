package br.edu.vianna.game.model;

import br.edu.vianna.game.model.Aposta;
import br.edu.vianna.game.model.ETipoResultado;
import br.edu.vianna.game.model.Time;
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
@StaticMetamodel(Jogo.class)
public class Jogo_ { 

    public static volatile SingularAttribute<Jogo, Time> time1;
    public static volatile SingularAttribute<Jogo, Time> time2;
    public static volatile SingularAttribute<Jogo, ETipoResultado> resultado;
    public static volatile SingularAttribute<Jogo, Double> oddsEmpate;
    public static volatile SingularAttribute<Jogo, Date> dataJogo;
    public static volatile SingularAttribute<Jogo, Integer> id;
    public static volatile SingularAttribute<Jogo, Integer> golsTime2;
    public static volatile SingularAttribute<Jogo, Double> oddsTime2;
    public static volatile ListAttribute<Jogo, Aposta> apostas;
    public static volatile SingularAttribute<Jogo, Double> oddsTime1;
    public static volatile SingularAttribute<Jogo, Integer> golsTime1;

}