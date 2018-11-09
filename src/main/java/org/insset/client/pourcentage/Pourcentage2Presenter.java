/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.pourcentage;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ResetButton;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import org.insset.client.message.dialogbox.DialogBoxInssetPresenter;
import org.insset.client.service.Pourcentage2Service;
import org.insset.client.service.Pourcentage2ServiceAsync;
import org.insset.shared.FieldVerifier;

/**
 *
 * @author talend
 */
public class Pourcentage2Presenter extends Composite{
    @UiField
    public SubmitButton boutonConvertGToH;
    @UiField
    public ResetButton boutonClearGAndH;
    @UiField
    public TextBox valG;
    @UiField
    public TextBox valH;
    @UiField
    public Label errorLabelGToH;
    @UiField
    public ResetButton boutonReset;
    @UiField
    public SubmitButton boutonCalcul;
    @UiField
    public TextBox pourcentage;
    @UiField
    public TextBox montantInit;
    @UiField
    public Label errorLabelPourcentage;
    
    
    interface MainUiBinder extends UiBinder<HTMLPanel, Pourcentage2Presenter> {
    }
    
    private final Pourcentage2ServiceAsync service = GWT.create(Pourcentage2Service.class);
    
    private static MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);
    
    public Pourcentage2Presenter() {
        initWidget(ourUiBinder.createAndBindUi(this));
        initHandler();
    }
    
    private void initHandler() {
        boutonClearGAndH.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                valG.setText("");
                valH.setText("");
                errorLabelGToH.setText("");
            }
        });
        boutonConvertGToH.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                convertToStartingPrice();
            }

        });
        boutonReset.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                pourcentage.setText("");
                errorLabelPourcentage.setText("");
                montantInit.setText("");
            }
        });
        boutonCalcul.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                convertPourcentage();
            }

        });
    }
    
    private void convertToStartingPrice(){        
        Integer value = null;
        Integer percent = null;
        try {
            value = Integer.parseInt(valG.getText());
            percent = Integer.parseInt(valH.getText());
        } catch (NumberFormatException e) {
            errorLabelGToH.addStyleName("serverResponseLabelError");
            errorLabelGToH.setText("Format incorect");
            return;
        }
        if (!FieldVerifier.isValidBaseNumber(value) || !FieldVerifier.isValidBasePourcentage(percent)) {
            errorLabelGToH.addStyleName("serverResponseLabelError");
            errorLabelGToH.setText("Valeur incorrecte");
            return;
        }
        service.convertToBaseNumber(Integer.parseInt(valG.getText()), Integer.parseInt(valH.getText()), new AsyncCallback<Integer>() {
            @Override
            public void onFailure(Throwable caught) {
                errorLabelGToH.setText(caught.getMessage());
            }

            @Override
            public void onSuccess(Integer result) {
                errorLabelGToH.setText(" ");
                new DialogBoxInssetPresenter("Calcul Modified to Base", valG.getText(), "Le prix de départ est de " + Integer.toString(result));
            }
        });
    }
    
    private void convertPourcentage() {
       int numberInit = Integer.parseInt(montantInit.getText());
         int numberpourcentage = Integer.parseInt(pourcentage.getText());
       
       
        if (!FieldVerifier.isValidMontant(numberInit) && !FieldVerifier.isValidPourcentage(numberpourcentage)) {
            errorLabelPourcentage.addStyleName("serverResponseLabelError");
            errorLabelPourcentage.setText("Format incorect");
            return;
        }
        service.CalculEcono(numberInit,numberpourcentage, new AsyncCallback<Integer>() {
            public void onFailure(Throwable caught) {
                errorLabelGToH.setText(caught.getMessage());
            }

            public void onSuccess(Integer result) {
               errorLabelPourcentage.setText(" ");
                new DialogBoxInssetPresenter("Convertion Roman to arabe", montantInit.getText(), String.valueOf(result));
            }
        });
    }
}
