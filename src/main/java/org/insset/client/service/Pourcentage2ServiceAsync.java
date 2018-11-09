/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 *
 * @author user
 */
public interface Pourcentage2ServiceAsync {

    /**
     * AsyncCallback pour Convertion Chiffre romain en chiffre arabe
     *
     * @param nbr
     * @param percent
     * @param callback
     * @return
     * @throws IllegalArgumentException
     */
    void convertToBaseNumber(Integer nbr, Integer percent, AsyncCallback<Integer> callback);
    
    void CalculEcono( Integer montantInit , Integer  pourcentage,  AsyncCallback<Integer> callback);
}
