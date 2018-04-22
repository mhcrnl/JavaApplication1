/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.samples.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.glassfish.samples.model.Agenda;

/**
 *
 * @author mhcrnl
 */
@Stateless
public class AgendaFacade extends AbstractFacade<Agenda> {
    @PersistenceContext(unitName = "JavaEE6Webinar1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AgendaFacade() {
        super(Agenda.class);
    }
    
}
