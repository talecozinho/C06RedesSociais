abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;

    abstract void postarFoto();

    abstract void postarVideo();

    abstract void postarComentario();

    public void curtirPublicacao()
    {
        System.out.println("Publicacao curtida com sucesso");
    }


}
