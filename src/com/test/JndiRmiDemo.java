package com.test;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Hashtable;

public class JndiRmiDemo {
    public static void main(String[] args) throws Exception {
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.rmi.registry.RegistryContextFactory");
        env.put(Context.PROVIDER_URL,"rmi://localhost:1099");
        InitialContext context = new InitialContext(env);
        String name = "foo";
        User user = new User();
        context.bind(name,user);
        Object obj = context.lookup(name);
        System.out.println(name+" is bound to: "+obj);

    }
}
