/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package org.uv.programa01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

//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

/**
 *
 * @author mxaxe
 */
public class Programa01 {

    public static void main(String[] args) {
        Statement st=null;
        Connection con = null;
        try {
            String sql = "insert into empleados (clave, nombre, direccion, telefono) values"
                    + " ('01', 'Axel', 'Av 1', '555')";
            String url = "jdbc:postgresql://localhost:5432/ejemplo";
            String pwd = "postgres";
            String user = "postgres";
            con = DriverManager.getConnection(url, user, pwd);
            Logger.getLogger(Programa01.class.getName()).log(Level.INFO, "Se conecto...");
            st=con.createStatement();
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Programa01.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Programa01.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (con != null) {
                    con.close();
                }
                } catch (SQLException ex) {
            Logger.getLogger(Programa01.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
