package br.edu.vianna.game.model;

import br.edu.vianna.game.model.Aposta;
import br.edu.vianna.game.model.ETipoUsuario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-22T19:27:04", comments="EclipseLink-2.7.7.v20200504-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-17T19:38:40", comments="EclipseLink-2.7.7.v20200504-rNA")
>>>>>>> b43f3b411c7276a1a73634fa54007629fa79aeb3
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> senha;
    public static volatile SingularAttribute<User, ETipoUsuario> tipo;
    public static volatile ListAttribute<User, Aposta> minhasApostas;
    public static volatile SingularAttribute<User, String> nome;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, Double> saldo;
    public static volatile SingularAttribute<User, String> login;
    public static volatile SingularAttribute<User, String> email;

}