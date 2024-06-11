/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.modelo;

import jakarta.persistence.Entity;
import lombok.Data;

/**
 *
 * @author CRISTIAN
 */
@Entity
@Data
public class Juego {
    int id;
    String nombre;
}
