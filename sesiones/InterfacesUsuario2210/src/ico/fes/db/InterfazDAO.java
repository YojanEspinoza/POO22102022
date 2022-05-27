/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ico.fes.db;

import ico.fes.iu.swing.modelos.Persona;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface InterfazDAO {
    public abstract ArrayList seleccionarTodo()throws java.sql.SQLException;
    public abstract boolean insertar(Persona p)throws java.sql.SQLException;
    public abstract boolean eliminar()throws java.sql.SQLException;
}
