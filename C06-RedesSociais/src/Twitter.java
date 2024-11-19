public class Twitter extends  RedeSocial implements Compartilhamento {


    @Override
    public void postarFoto()
    {
        System.out.println("Foto postada no Twitter");
    }
    public void postarVideo()
    {
        System.out.println("Video postado no Twitter");
    }

    public void postarComentario()
    {
        System.out.println("Comentario postado no Twitter");
    }

    public void compartilhar()
    {
        System.out.println("Compartilhamento no Twitter executado com sucesso");
    }

}
