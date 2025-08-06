package com.mytodoapp.backend.domain.signup;

import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "accounts") // opzionale se la tabella si chiama già "account(s)"
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Cognome")
    private String cognome;
    @Column(name = "Data_Di_Nascita")
    private LocalDate dataDiNascita;
    @Column(name = "Username")
    private String username;
    @Column(name = "Password")
    private String password;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCognome(){
        return cognome;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita(){
        return dataDiNascita;
    }
    public void setDataDiNascita(LocalDate dataDiNascita){
        this.dataDiNascita = dataDiNascita;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
