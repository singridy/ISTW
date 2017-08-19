/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaM.converter;

import br.com.sistemaM.facade.AbstractFacade;
import java.io.Serializable;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author tiago
 */
public class ConverterGenerico implements Converter, Serializable {

    private final AbstractFacade facade;

    public ConverterGenerico(AbstractFacade facade) {
        this.facade = facade;
    }

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if(string.equals("null")){
            return null;
        }
        return facade.pesquisarId(Long.valueOf(string));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return o.toString();
    }

}
