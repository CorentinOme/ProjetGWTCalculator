/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 *
 * @author user
 */
@RemoteServiceRelativePath("baseConvert")
public interface Pourcentage2Service extends RemoteService {

    /**
     * Convertion Chiffre romain en chiffre arabe
     *
     * @param nbr
     * @return
     * @throws IllegalArgumentException
     */
    Integer convertToBaseNumber(Integer nbr, Integer percent);

    Double CalculEcono(Integer montantInit , Integer  pourcentage);
}
