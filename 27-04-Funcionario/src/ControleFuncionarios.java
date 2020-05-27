
import javax.swing.JOptionPane;


public class ControleFuncionarios {


    public static void main(String[] args) {
        //Instanciar um objeto chamado funcionario da classe Funcionario
        Funcionario funcionario = new Funcionario();
        //Classe Objeto = new Construtor()
        
        funcionario.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite sua Matricula")));
        funcionario.setNome(JOptionPane.showInputDialog("Digite o Nome"));
        funcionario.setCargo(JOptionPane.showInputDialog("Digite o Cargo"));
        funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario")));
        
        
        JOptionPane.showMessageDialog(
                null, 
                "Matrícula: "+funcionario.getMatricula()+
                "\n Nome: " + funcionario.getNome() +
                "\n Cargo: " + funcionario.getCargo()+
                "\n Salario: " + funcionario.getSalario()+
                "\n Salário com Aumento: " + funcionario.reajusteSalario()
        );
        
        
 
    }
    
}
