import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCharles = new Dev();
        devCharles.setNome("Charles");
        devCharles.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Charles" + devCharles.getConteudosIncritos());
        devCharles.progredir();
        devCharles.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Inscritos Charles" + devCharles.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Charles" + devCharles.getConteudosConcluidos());
        System.out.println("XP:" + devCharles.calcularTotalXp());

        System.out.println("__________");

        Dev devEmmanuela = new Dev();
        devEmmanuela.setNome("Emmanuela");
        devEmmanuela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Emmanuela" + devEmmanuela.getConteudosIncritos());
        devEmmanuela.progredir();
        devEmmanuela.progredir();
        devEmmanuela.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Inscritos Emmanuela" + devEmmanuela.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Emmanuela" + devEmmanuela.getConteudosConcluidos());
        System.out.println("XP:" + devEmmanuela.calcularTotalXp());

    }

}