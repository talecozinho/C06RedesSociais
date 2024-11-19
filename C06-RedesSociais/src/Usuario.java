import java.util.HashSet;
import java.util.Set;

public class Usuario {

    private String nome;
    private String email;
    Set<RedeSocial> redesSociais = new HashSet<RedeSocial>();

    public Usuario(RedeSocial[] redesSociais) {
        try
        {
            for (RedeSocial elemento : redesSociais)
            {
                this.redesSociais.add(elemento);
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] findRede()
    {
        int i = 0;
        int[] pos = new int[2];
        try
        {
            for (RedeSocial elemento : redesSociais)
            {
                if (elemento instanceof Facebook)
                {
                    pos[i] = 0;
                } else if (elemento instanceof GooglePlus) {
                    pos[i] = 1;
                } else if (elemento instanceof Instagram) {
                    pos[i] = 2;
                } else if (elemento instanceof Twitter) {
                    pos[i] = 3;
                }
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return pos;
    }
}
