public class GooglePlus extends  RedeSocial implements VideoConferencia, Compartilhamento{


    @Override
    public void postarFoto()
    {
        System.out.println("Foto postada no Google Plus");
    }
    public void postarVideo()
    {
        System.out.println("Video postado no Google Plus");
    }

    public void postarComentario()
    {
        System.out.println("Comentario postado no Google Plus");
    }

    public void fazStreaming()
    {
        System.out.println("Streaming no Google Plus iniciado com sucesso");
    }

    public void compartilhar()
    {
        System.out.println("Compartilhamento no Google Plus executado com sucesso");
    }
}
