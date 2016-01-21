/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.samples;

import static java.lang.System.out;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.glassfish.samples.model.Agenda;

/**
 *
 * @author mhcrnl
 */
@Stateless
@Named
public class AgendaEJB {
    
    @PersistenceContext
    EntityManager em;
    @Inject Agenda agenda;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public List getList() {
        return em.createNamedQuery("Agenda.findAll").getResultList();
    }
    
    public void create(){
        Agenda f2 = new Agenda(agenda.getName(), agenda.getDatanasterii());
        em.persist(f2);
        out.println(em);
    }
}
