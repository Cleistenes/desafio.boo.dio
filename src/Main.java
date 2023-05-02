import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição curso Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuciano = new Dev();
        devLuciano.setNome("Luciano");
        devLuciano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luciano: " + devLuciano.getConteudosIncritos());
        devLuciano.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Inscritos de Luciano: " + devLuciano.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos de Luciano: " + devLuciano.getConteudosConcluidos());
        System.out.println("XP: " + devLuciano.calcularTotalXp());

        Dev devOutro = new Dev();
        devOutro.setNome("Outro");
        devOutro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Outro: " + devOutro.getConteudosIncritos());
        devOutro.progredir();
        devOutro.progredir();
        devOutro.progredir();
        System.out.println(".");
        System.out.println("Conteúdos Inscritos de Outro: " + devOutro.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos de Outro: " + devOutro.getConteudosConcluidos());
        System.out.println("XP: " + devOutro.calcularTotalXp());



    }
}