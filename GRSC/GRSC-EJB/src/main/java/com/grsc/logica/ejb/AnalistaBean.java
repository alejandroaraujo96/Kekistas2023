package com.grsc.logica.ejb;

import com.grsc.modelo.daos.AnalistaJpaController;
import com.grsc.exceptions.PreexistingEntityException;
import com.grsc.modelo.entities.Analista;
import com.grsc.modelo.entities.Usuarios;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AnalistaBean implements AnalistaBeanRemote{
     EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("GRSCPU");
    private AnalistaJpaController controlador= new AnalistaJpaController(entityManagerFactory);
    
    @Override
    public Boolean existeAnalista(BigInteger idUser) {
        Boolean existe = false;
        Analista analista= controlador.findAnalista(idUser);
        if(!(analista==null)){
            existe=true;
        }
        return existe;
    }
    
    @Override
    public Boolean ingresarAnalista(BigInteger id) {
       boolean pudeCrear = false;
       
       UsuarioBean userBean= new UsuarioBean();
       Usuarios usuario= userBean.buscarUsuario(id);
       
        if (existeAnalista(id)) {
            System.out.println("Analista con dicha ci ya registrado");
        } else {
            Analista analista = Analista.builder()
                    .idUsuario(id)
                    .usuarios(usuario)
                    .build();
            System.out.println(analista);
            try {
                controlador.create(analista);
                pudeCrear = true;
            } catch (PreexistingEntityException ex) {
                Logger.getLogger(DocenteBean.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) { 
               Logger.getLogger(DocenteBean.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        return pudeCrear;
    }
}
