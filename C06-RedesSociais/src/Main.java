import exceptions.IncorrectPasswordException;
import exceptions.InvalidSocialMediaException;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Random rand = new Random();
        int i = 0;
        int numIn, numAmigos, operacao;

        numAmigos = rand.nextInt(5000);

        Scanner in = new Scanner(System.in);

        RedeSocial[] redes = new RedeSocial[2];

        do {
            System.out.println("Escolha duas redes sociais distintas para se cadastrar:\n0 = Facebook\n1 = Google Plus\n2 = Intagram\n3 = Twitter.");

            numIn = Integer.parseInt(in.nextLine());

            switch (numIn) {
                case 0:
                    redes[i] = new Facebook();
                    i++;
                    break;
                case 1:
                    redes[i] = new GooglePlus();
                    i++;
                    break;
                case 2:
                    redes[i] = new Instagram();
                    i++;
                    break;
                case 3:
                    redes[i] = new Twitter();
                    i++;
                    break;
                default:
                    System.out.println("Número invalido");
                    break;
            }
        } while (i < 2);

        System.out.println("Digite seu nome e depois email.");

        String nomeIn = in.nextLine();
        String emailIn = in.nextLine();

        System.out.println("Entre com a sua senha  para a 1a rede escolhida");
        String senhaIn = in.nextLine();

        System.out.println("Você possui " + numAmigos + " Amigos nesta rede.");

        redes[0].senha = senhaIn;
        redes[0].numAmigos = numAmigos;

        System.out.println("Entre com a sua senha  para a 2a rede escolhida");
        senhaIn = in.nextLine();

        numAmigos = rand.nextInt(5000);
        System.out.println("Você possui " + numAmigos + " Amigos nesta rede.");

        redes[1].senha = senhaIn;
        redes[1].numAmigos = numAmigos;

        Usuario user = new Usuario(redes);
        user.setNome(nomeIn);
        user.setEmail(emailIn);

        while (true) {
            System.out.println("Escolha uma rede para acessar ou digite -1 para sair.\n0 = Facebook\n1 = Google Plus\n2 = Instagram\n3 = Twitter");
            numIn = Integer.parseInt(in.nextLine());
            if (numIn == -1) {
                break;
            }

            System.out.println("Digite sua senha nesta rede.");
            senhaIn = in.nextLine();

            System.out.println("Escolha uma operação:\n0 = Foto\n1 = Video\n2 = Comentário\n3 = Curtir Publicação\n4 = Streaming\n5 = Compartilhar");
            operacao = Integer.parseInt(in.nextLine());

            for (RedeSocial elemento : user.redesSociais) {
                switch (numIn) {
                    case 0:
                        if (elemento.senha.equals(senhaIn) && elemento instanceof Facebook) {
                            switch (operacao) {
                                case 0:
                                    elemento.postarFoto();
                                    break;
                                case 1:
                                    elemento.postarVideo();
                                    break;
                                case 2:
                                    elemento.postarComentario();
                                    break;
                                case 3:
                                    elemento.curtirPublicacao();
                                    break;
                                case 4:
                                    ((Facebook) elemento).fazStreaming();
                                    break;
                                case 5:
                                    ((Facebook) elemento).compartilhar();
                                    break;
                                default:
                                    System.out.println("Operação invalida");
                            }
                        }
                        break;
                    case 1:
                        if (elemento.senha.equals(senhaIn) && elemento instanceof GooglePlus) {
                            switch (operacao) {
                                case 0:
                                    elemento.postarFoto();
                                    break;
                                case 1:
                                    elemento.postarVideo();
                                    break;
                                case 2:
                                    elemento.postarComentario();
                                    break;
                                case 3:
                                    elemento.curtirPublicacao();
                                    break;
                                case 4:
                                    ((GooglePlus) elemento).fazStreaming();
                                    break;
                                case 5:
                                    ((GooglePlus) elemento).compartilhar();
                                    break;
                                default:
                                    System.out.println("Operação invalida");
                            }
                        }
                        break;
                    case 2:
                        if (elemento.senha.equals(senhaIn) && elemento instanceof Instagram) {
                            switch (operacao) {
                                case 0:
                                    elemento.postarFoto();
                                    break;
                                case 1:
                                    elemento.postarVideo();
                                    break;
                                case 2:
                                    elemento.postarComentario();
                                    break;
                                case 3:
                                    elemento.curtirPublicacao();
                                    break;
                                default:
                                    System.out.println("Operação invalida");
                            }
                        }
                        break;
                    case 3:
                        if (elemento.senha.equals(senhaIn) && elemento instanceof Twitter) {
                            switch (operacao) {
                                case 0:
                                    elemento.postarFoto();
                                    break;
                                case 1:
                                    elemento.postarVideo();
                                    break;
                                case 2:
                                    elemento.postarComentario();
                                    break;
                                case 3:
                                    elemento.curtirPublicacao();
                                    break;
                                case 5:
                                    ((Twitter) elemento).compartilhar();
                                    break;
                                default:
                                    System.out.println("Operação invalida");
                            }
                        }
                        break;
                    default:
                        System.out.println("Senha ou plataforma invalida");
                }
            }
        }
    }
}
