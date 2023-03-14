import br.com.dio.desafio.*;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Curso faculdadeAnaliseSistemas = new Curso();
        faculdadeAnaliseSistemas.setTitulo("Análise de Sistemas");
        faculdadeAnaliseSistemas.setDescricao("Formação de analistas");
        faculdadeAnaliseSistemas.setCargaHoraria(360);

        Curso faculdadeBiologia = new Curso();
        faculdadeBiologia.setTitulo("Biologia");
        faculdadeBiologia.setDescricao("Formação para professor");
        faculdadeBiologia.setCargaHoraria(500);

        Mentoria cursoExtensao = new Mentoria();
        cursoExtensao.setTitulo("Cursos Extra Curriculares");
        cursoExtensao.setDescricao("Cursos Extra Curriculares nas respectivas áreas");
        cursoExtensao.setData(LocalDate.now());

        /*System.out.println(faculdadeAnaliseSistemas);
        System.out.println(faculdadeBiologia);
        System.out.println(cursoExtensao);*/

        System.out.println("___________________");

        Estagio estagio = new Estagio();
        estagio.setNome("Estágio Banco Pan");
        estagio.setDescricao("Atender com excelência as atividades do Banco Pan");
        estagio.getConteudos().add(faculdadeAnaliseSistemas);
        estagio.getConteudos().add(faculdadeBiologia);
        estagio.getConteudos().add(cursoExtensao);

        Aluno alunoCharles = new Aluno();
        alunoCharles.setNome("Charles");
        alunoCharles.increverAluno(estagio);
        System.out.println("Conteúdos Inscritos de Charles: " + alunoCharles.getConteudosIncritos());
        alunoCharles.progredir();
        System.out.println("Conteúdos Inscritos de Charles: " + alunoCharles.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos de Charles: " + alunoCharles.getConteudosConcluidos());
        System.out.println("XP:" + alunoCharles.calcularTotalXp() + " pontos.");

        System.out.println("___________________");

        Aluno alunoEmmanuela = new Aluno();
        alunoEmmanuela.setNome("Emmanuela");
        alunoEmmanuela.increverAluno(estagio);
        System.out.println("Conteúdos Inscritos de Emmanuela: " + alunoEmmanuela.getConteudosIncritos());
        alunoEmmanuela.progredir();
        alunoEmmanuela.progredir();
        alunoEmmanuela.progredir();
        System.out.println("Conteúdos Inscritos de Emmanuela: " + alunoEmmanuela.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos de Emmanuela: " + alunoEmmanuela.getConteudosConcluidos());
        System.out.println("XP:" + alunoEmmanuela.calcularTotalXp() + " pontos.");

    }

}