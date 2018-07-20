
package modelo;


public class ValidarUsuario {
    public static void ValidarUsuarioCorrecto(String login,String password) throws UsuarioNoValiodoException{
        if(!login.equals("carlos") & !"14050500".equals( new String(password))) throw new UsuarioNoValiodoException();
        
    } 
}
