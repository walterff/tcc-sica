package projetotcc.tabelas;
// Generated 18/06/2012 14:06:03 by Hibernate Tools 3.2.1.GA



/**
 * Tblvacinas generated by hbm2java
 */
public class Tblvacinas  implements java.io.Serializable {


     private Integer codVacina;
     private String nomeVacina;
     private String descricaoVacina;

    public Tblvacinas() {
    }

    public Tblvacinas(String nomeVacina, String descricaoVacina) {
       this.nomeVacina = nomeVacina;
       this.descricaoVacina = descricaoVacina;
    }
   
    public Integer getCodVacina() {
        return this.codVacina;
    }
    
    public void setCodVacina(Integer codVacina) {
        this.codVacina = codVacina;
    }
    public String getNomeVacina() {
        return this.nomeVacina;
    }
    
    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }
    public String getDescricaoVacina() {
        return this.descricaoVacina;
    }
    
    public void setDescricaoVacina(String descricaoVacina) {
        this.descricaoVacina = descricaoVacina;
    }




}


