package com.profeconnect.domain.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "user")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String usuario_ID;
    private String nome;
    private String password;
    private Date data_nascimento;
    private String email;
    private String sexo;
    private String nome_responsável;
    private String cpf;
    private String funcao_id;
    private Boolean ativo;

    public User() {
        
    }
    
    public User(String nome, String password, Date data_nascimento, String email, String sexo,
            String nome_responsável, String cpf, String funcao_id) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.email = email;
        this.sexo = sexo;
        this.nome_responsável = nome_responsável;
        this.cpf = cpf;
        this.funcao_id = funcao_id;
        this.ativo = true;
    }

    public String getUsuario_ID() {
        return usuario_ID;
    }

    public void setUsuario_ID(String usuario_ID) {
        this.usuario_ID = usuario_ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome_responsável() {
        return nome_responsável;
    }

    public void setNome_responsável(String nome_responsável) {
        this.nome_responsável = nome_responsável;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao_id() {
        return funcao_id;
    }

    public void setFuncao_id(String funcao_id) {
        this.funcao_id = funcao_id;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((usuario_ID == null) ? 0 : usuario_ID.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (usuario_ID == null) {
            if (other.usuario_ID != null)
                return false;
        } else if (!usuario_ID.equals(other.usuario_ID))
            return false;
        return true;
    }

}
