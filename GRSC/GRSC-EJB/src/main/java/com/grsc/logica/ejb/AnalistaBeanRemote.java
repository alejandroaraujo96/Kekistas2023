package com.grsc.logica.ejb;

import java.math.BigInteger;
import javax.ejb.Remote;

@Remote
public interface AnalistaBeanRemote {
    Boolean existeAnalista(BigInteger idUser);
    Boolean ingresarAnalista(BigInteger id);
}
