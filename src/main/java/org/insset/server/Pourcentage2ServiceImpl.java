/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.insset.client.service.Pourcentage2Service;
import org.insset.shared.FieldVerifier;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class Pourcentage2ServiceImpl extends RemoteServiceServlet implements Pourcentage2Service {

    @Override
    public Integer convertToBaseNumber(Integer nbr, Integer percent){
        double diviseur = 1.0-(percent/100.0);
        double division = nbr/diviseur;
        Integer res = (int)division;
        return res;
    }

    @Override
    public Double CalculEcono( Integer montantInit,Integer pourcentage )throws IllegalArgumentException{
        if (FieldVerifier.isValidMontant(montantInit) && FieldVerifier.isValidPourcentage(pourcentage)){
            double pourcentageNumber=(double)pourcentage/100;
            double numberEcono =montantInit * pourcentageNumber;

            double prixFinal =montantInit-numberEcono;

            double resultatFinal = prixFinal;
            return resultatFinal;
         }else {
            throw new IllegalArgumentException("test");
        }
    }

}
