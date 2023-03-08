import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(75);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Programação");
        mentoria.setDescricao("Descrição Mentoria");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJeffrey = new Dev();
        devJeffrey.setNome("Jeffrey");
        devJeffrey.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Jeffrey: " + devJeffrey.getConteudosInscritos());

        devJeffrey.progedir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos de Jeffrey: " + devJeffrey.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Jeffrey: " + devJeffrey.getConteudosConcluidos());
        System.out.println("XP: " + devJeffrey.calcularTotalXp());

        System.out.println("------------");

        Dev devAndrew = new Dev();
        devAndrew.setNome("Andrew");
        devAndrew.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Andrew: " + devAndrew.getConteudosInscritos());

        devAndrew.progedir();
        System.out.println("-");


        System.out.println("Conteudos Inscritos de Andrew: " + devAndrew.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Andrew: " + devAndrew.getConteudosConcluidos());
        System.out.println("XP: " + devAndrew.calcularTotalXp());






    }
}
