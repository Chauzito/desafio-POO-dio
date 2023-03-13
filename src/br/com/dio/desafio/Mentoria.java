package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria {
   private String título;
   private String descricao;
   private LocalDate data;

   public Mentoria() {
   }

   public String getTítulo() {
      return título;
   }

   public void setTítulo(String título) {
      this.título = título;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public LocalDate getData() {
      return data;
   }

   public void setData(LocalDate data) {
      this.data = data;
   }

   @Override
   public String toString() {
      return "Mentoria{" +
              "título='" + título + '\'' +
              ", descricao='" + descricao + '\'' +
              ", data=" + data +
              '}';
   }
}
