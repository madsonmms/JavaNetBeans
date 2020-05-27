public class Aluno {
    //Atributos
    private String ra;
    private String nome;
    private String disciplina;
    private double av1;
    private double av2;
    
    //Setters = métodos que recebem informação
    
    public void setRa(String ra){ //String ra = variável local usada para receber informação
        this.ra = ra;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public void setAV1(double av1){
        this.av1 = av1;
    }
    public void setAV2(double av2){
        this.av2 = av2;
    }
    
    //Métodos getter = obtém dados armazenados no objeto
    
    public String getRa(){
        return this.ra;
    }
    public String getNome(){
        return this.nome;
    }
    public String getDisciplina(){
        return this.disciplina;
    }
    public double getAV1(){
        return this.av1;
    }
    public double getAV2(){
        return this.av2;
    }
    
    //Método de Calculo
    
    public double CalcularMedia(){
        return(this.av1 + this.av2) / 2;
    }
}
