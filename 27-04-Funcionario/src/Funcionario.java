public class Funcionario {
    private int matricula;
    private String nome;
    private String cargo;
    private double salario;
    
    //Construtor

    public Funcionario() {
    }
    
    //Setter e Getters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
 
    //Métodos
    public double reajusteSalario(){
        if(this.cargo.equalsIgnoreCase("gerente")){
            salario = salario * 1.10;
        } 
        else if (this.cargo.equalsIgnoreCase("vendedor")){
            salario = salario * 1.05;
        } 
        else {
          salario = salario * 1.01;  
        }
        
        return salario;
    }
}
