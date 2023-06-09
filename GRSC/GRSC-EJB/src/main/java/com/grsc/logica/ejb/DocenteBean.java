package com.grsc.logica.ejb;

import com.grsc.modelo.daos.TutorJpaController;
import com.grsc.exceptions.PreexistingEntityException;
import com.grsc.modelo.entities.Area;
import com.grsc.modelo.entities.TipoTutor;
import com.grsc.modelo.entities.Tutor;
import com.grsc.modelo.entities.Usuarios;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DocenteBean implements DocenteBeanRemote{

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("GRSCPU");
    private TutorJpaController controlador= new TutorJpaController(entityManagerFactory);
    
    @Override
    public Boolean existeTutor(BigInteger idUser) {
        Boolean existe = false;
        Tutor tutor= controlador.findTutor(idUser);
        if(!(tutor==null)){
            existe=true;
        }
        return existe;
    }
    
    @Override
    public Boolean ingresarDocente(BigInteger id, TipoTutor tipo, Area area) {
       boolean pudeCrear = false;

       UsuarioBean userBean= new UsuarioBean();
       Usuarios usuario= userBean.buscarUsuario(id);
       
        if (existeTutor(id)) {
            System.out.println("Tutor con dicha ci ya registrado");
        } else {
            Tutor tutor = Tutor.builder()
                    .idUsuario(id)
                    .idArea(area)
                    .idTipoTutor(tipo)
                    .usuarios(usuario)
                    .build();

            try {
                controlador.create(tutor);
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
