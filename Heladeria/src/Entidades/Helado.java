/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import dao.HeladoDao;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Helado {

    private int id;
    private String sabor;

    public Helado() {
    }

    public Helado(int id, String sabor) {
        this.id = id;
        this.sabor = sabor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public static ArrayList<Helado> ListarHelados() {

        HeladoDao helado = new HeladoDao();

        return helado.listarHelados();
    }

    public static void guardarUnHelado(Helado helado) {
        HeladoDao h = new HeladoDao();
        h.guardarHelado(helado);
    }
}
