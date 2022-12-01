package br.unicamp.helply.APIconfig;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

    public class Aluno  implements Serializable{
        @SerializedName("email")
        private String email ;
        @SerializedName("nome")
        private String nome ;
        @SerializedName("senha")
        private String senha ;
        @SerializedName("disponivel")
        private boolean disponivel;
        @SerializedName("avatar")
        private int avatar;
        @SerializedName("serie")
        private int serie;
        @SerializedName("materia")
        private int materia;

    public Aluno(String email, String nome, String senha, boolean disponivel, int avatar, int serie, int materia) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.disponivel = disponivel;
        this.avatar = avatar;
        this.serie = serie;
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "  email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", disponivel=" + disponivel +
                ", avatar=" + avatar +
                ", serie=" + serie +
                ", materia=" + materia +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getMateria() {
        return materia;
    }

    public void setMateria(int materia) {
        this.materia = materia;
    }

}
