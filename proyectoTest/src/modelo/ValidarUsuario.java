package modelo;

public class ValidarUsuario {

    public static void ValidarUsuarioCorrecto(String login, String password) throws UsuarioNoValidoException {
        if (!("alex".equals(login) && "12345".equals(password))) {
            throw new UsuarioNoValidoException();
        }
    }

}
