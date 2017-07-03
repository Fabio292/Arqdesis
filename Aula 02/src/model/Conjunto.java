package model;

public class Conjunto{
  private int idConjunto;
  private String nomeConjunto;
  private int cnpjEmp;
  private int temperatura;
  
  public void setIdConjunto(int idConjunto) {  
      this.idConjunto = idConjunto;  
   } 
     
  public void setNomeConjunto(String nomeConjunto) {  
      this.nomeConjunto = nomeConjunto;  
   }  

  public void setCnpj(int cnpj) {  
      this.cnpjEmp= cnpj;  
   } 
   
  public int getIdConjunto() {  
      return this.idConjunto;  
   } 
  public String getNomeConjunto() {  
      return this.nomeConjunto;  

   }
  
  public int getCnpj() {  
      return this.cnpjEmp;  
   }

public int getTemperatura() {
	return temperatura;
}

public void setTemperatura(int temperatura) {
	this.temperatura = temperatura;
} 
   }