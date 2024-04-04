package br.edu.vianna.game.model;

import br.edu.vianna.game.model.ETipoUsuario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-08T17:07:21", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> senha;
    public static volatile SingularAttribute<User, ETipoUsuario> tipo;
    public static volatile SingularAttribute<User, String> nome;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, Double> saldo;
    public static volatile SingularAttribute<User, String> login;
    public static volatile SingularAttribute<User, String> email;

}