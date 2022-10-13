import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Abstraindo um Bootcamp Usando Orientação a Objetos em Java");
        curso2.setDescricao("Desmistifique a Programação Orientada a Objetos (POO) com Java e pratique esse conceito fundamental nesse desafio. Para isso, os pilares da OO são devidamente formalizados: Abstração, Encapsulamento, Herança e Polimorfismo. Com isso, você poderá desenvolver sua capacidade de abstração com um problema real e implementar as evoluções que achar interessantes ;-)");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Potência Tech powered by iFood - Java Beginners");
        bootcamp.setDescricao("O iFood chegou na DIO com uma super trilha para pessoas que querem ingressar no mercado tech! O Potência Tech Powered by iFood - Java Beginners já está com inscrições abertas para pessoas de todo o Brasil, mas voltado e focado em grupos sub-representados e pessoas de baixa renda. Uma trilha com conteúdos completos, desafios de projetos, mentorias ao vivo e networking com a comunidade.  Ao final do programa, ainda vai acontecer o Minha Carreira Tech, uma oportunidade de conhecer as empresas parceiras e ficar disponível na plataforma de talentos da DIO e ainda poder ganhar prêmios pelo seu desempenho.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev alfeuDev = new Dev();
        alfeuDev.setNome("Alfeu");
        alfeuDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alfeu:" + alfeuDev.getConteudosInscritos());
        alfeuDev.progredir();
        alfeuDev.progredir();
        alfeuDev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Alfeu:" + alfeuDev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alfeu:" + alfeuDev.getConteudosConcluidos());
        System.out.println("XP:" + alfeuDev.calcularTotalXp());

        System.out.println("-------");

    }

}