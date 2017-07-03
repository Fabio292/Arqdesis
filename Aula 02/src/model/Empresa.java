package model;

public class Empresa {
  private int cnpj;
 
  private String razaoSocial;
  private String horarioFuncionamento;
  private int    temperaturaPadrao;
  private String horarioArCondicionado;
  
  public Empresa(){
	  
  }
  public Empresa(int cnpj, String razaoSocial, String horarioFunc, int temperaturaPadrao, String horarioAr){
	  setCnpj(cnpj);
	  setRazao(razaoSocial);
	  setHorFunc(horarioFunc);
	  setTempPadrao(temperaturaPadrao);
	  setHorFunc(horarioFunc);	  
	  
  }
  public void setCnpj(int cnpj) {  
      this.cnpj = cnpj;  
   } 
   
  
  public void setRazao(String razaoSocial) {  
      this.razaoSocial = razaoSocial;  
   } 
   
  public void setHorFunc(String horarioFuncionamento) {  
      this.horarioFuncionamento = horarioFuncionamento;  
   }  
  
  public void setTempPadrao(int temperaturaPadrao) {  
      this.temperaturaPadrao = temperaturaPadrao;  
   }
   
  public void setHorArCond(String horarioArCondicionado) {  
      this.horarioArCondicionado = horarioArCondicionado;  
   } 
   
  public int getCnpj() {  
      return this.cnpj;  
   }  
   
   


    public String getRazao() {  
      return this.razaoSocial;  
   }  
   
    public String getHorFunc() {  
      return this.horarioFuncionamento;  
   }  
   
    public int getTempPadr() {  
      return this.temperaturaPadrao;  
   }  
   
    public String getHorArCond() {  
      return this.horarioArCondicionado;  
   }  
    
    @Override
    public boolean equals(Object obj){
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (getClass() != obj.getClass())
     return false;
    Empresa other = (Empresa) obj;
    	if (cnpj != other.cnpj)
    		return false;
    return true;
    
    }
   
   }