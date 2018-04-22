/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.samples.model;

import java.io.Serializable;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mhcrnl
 */
@Named
@RequestScoped
@Entity
@Table(name = "AGENDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agenda.findAll", query = "SELECT a FROM Agenda a"),
    @NamedQuery(name = "Agenda.findByName", query = "SELECT a FROM Agenda a WHERE a.name = :name"),
    @NamedQuery(name = "Agenda.findByDatanasterii", query = "SELECT a FROM Agenda a WHERE a.datanasterii = :datanasterii")})
public class Agenda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NAME")
    private String name;
    @Size(max = 10)
    @Column(name = "DATANASTERII")
    private String datanasterii;

    public Agenda() {
    }

    public Agenda(String name) {
        this.name = name;
    }
    
     public Agenda(String name, String datanasterii) {
        this.name = name;
        this.datanasterii = datanasterii;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatanasterii() {
        return datanasterii;
    }

    public void setDatanasterii(String datanasterii) {
        this.datanasterii = datanasterii;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agenda)) {
            return false;
        }
        Agenda other = (Agenda) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.glassfish.samples.model.Agenda[ name=" + name + " ]";
    }
    
}
