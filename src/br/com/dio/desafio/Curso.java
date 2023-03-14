package br.com.dio.desafio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        String horas;
        return "Curso de" +
                " titulação em " + getTitulo() +
                ". Descrição: " + getDescricao() +
                ". Carga horária: " + cargaHoraria + " horas.";
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
