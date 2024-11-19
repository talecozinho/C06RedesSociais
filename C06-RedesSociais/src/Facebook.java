public class Facebook extends  RedeSocial implements VideoConferencia, Compartilhamento{

    @Override
    public void postarFoto()
    {
        System.out.println("Foto postada no Facebook");
    }
    public void postarVideo()
    {
        System.out.println("Video postado no Facebook");
    }

    public void postarComentario()
    {
        System.out.println("Comentario postado no Facebook");
    }

    public void fazStreaming()
    {
        System.out.println("Streaming no Facebook iniciado com sucesso");
    }

    public void compartilhar()
    {
        System.out.println("Compartilhamento no Facebook executado com sucesso");
    }
}
