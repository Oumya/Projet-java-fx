/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;



import java.sql.Date;

/**
 *
 * @author mbodj
 */
public class RendezVousDto {
    
    
    
    

    private int id;
    private Date date;
    private String serviceDemande;
    private String typeServiceDemande;
    private String etat;

    public RendezVousDto() {
    }

    public RendezVousDto(int id, Date date, String serviceDemande, String typeServiceDemande, String etat) {
        this.id = id;
        this.date = date;
        this.serviceDemande = serviceDemande;
        this.typeServiceDemande = typeServiceDemande;
        this.etat = etat;
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getServiceDemande() {
        return serviceDemande;
    }

    public void setServiceDemande(String serviceDemande) {
        this.serviceDemande = serviceDemande;
    }

    public String getTypeServiceDemande() {
        return typeServiceDemande;
    }

    public void setTypeServiceDemande(String typeServiceDemande) {
        this.typeServiceDemande = typeServiceDemande;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
    @Override
    public String toString(){
        return serviceDemande;
    }
    
}
