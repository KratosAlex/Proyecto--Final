package modelo;

public class ValidarUsuario {

    public static void ValidarUsuarioCorrecto(String login, String password) throws UsuarioNoValidoException {
        if (!"carlos".equals(login) & !"14050500".equals(login)) {
            throw new UsuarioNoValidoException();
        }
    }

}
