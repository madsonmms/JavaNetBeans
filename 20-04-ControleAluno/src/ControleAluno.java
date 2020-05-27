
import javax.swing.JOptionPane;

public class ControleAluno {

    public static void main(String[] args) {
        Aluno aluno;
        aluno = new Aluno(); //instancia um objeto chamado aluno da classe Aluno
        aluno.setRa(JOptionPane.showInputDialog("Digite o RA"));
        aluno.setNome(JOptionPane.showInputDialog("Digite o Nome"));
        aluno.setDisciplina(JOptionPane.showInputDialog("Digite a Disciplina"));
        aluno.setAV1(Double.parseDouble(JOptionPane.showInputDialog("Digite o AV1")));
        aluno.setAV2(Double.parseDouble(JOptionPane.showInputDialog("Digite o AV2")));
        
        System.out.println(aluno.getRa());
        JOptionPane.showMessageDialog(null, "Seu RA é " + aluno.getRa());
        JOptionPane.showMessageDialog(null, "Seu Nome é " + aluno.getNome());
        JOptionPane.showMessageDialog(null, "Sua Disciplina é " + aluno.getDisciplina());
        JOptionPane.showMessageDialog(null, "Seu Nota AV1 é " + aluno.getAV1());
        JOptionPane.showMessageDialog(null, "Seu Nota AV2 é " + aluno.getAV2());
        
        JOptionPane.showMessageDialog(null, "Sua Média é " + aluno.CalcularMedia());
    }
    
}
