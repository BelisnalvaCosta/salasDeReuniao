package me.dio.salasDeReuniao.model;

import jakarta.persistence.*;

@Table(name = "salasdereuniao")
public class Room {

    private Long id;
    private String nome;
    private String data;
    private String starHour;
    private String endHour;

    public Room() {

    }

    public Room(Long id, String nome, String data, String starHour, String endHour) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.starHour = starHour;
        this.endHour = endHour;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "data", nullable = false)
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Column(name = "starHour", nullable = false)
    public String getStarHour() {
        return starHour;
    }

    public void setStarHour(String starHour) {
        this.starHour = starHour;
    }

    @Column(name = "endHour", nullable = false)
    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", data='" + data + '\'' +
                ", starHour='" + starHour + '\'' +
                ", endHour='" + endHour + '\'' +
                '}';

    }
}
