
package dados;

public class FuncionarioDao {
    
     boolean casado=false;
    
    //método para conectar ao banco
    public boolean conectar() { 
       Class.forName("com.mysql.jdbc.Driver");
    }
    
    
}
