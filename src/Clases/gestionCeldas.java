package Clases;


import java.awt.Component;
import java.awt.Font;

import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Esta clase permite gestionar la tabla y los eventos realizados sobre ella
 * cada celda seria un objeto personalizable
 *
 * @author CHENAO
 *
 */
public class gestionCeldas extends DefaultTableCellRenderer {

    private String tipo = "text";

    //se definen por defecto los tipos de datos a usar
    private Font normal = new Font("Verdana", Font.PLAIN, 12);
    private Font bold = new Font("Verdana", Font.BOLD, 12);
    //etiqueta que almacenará el icono a mostrar
    private JLabel label = new JLabel();
    //iconos disponibles para ser mostrados en la etiqueta dependiendo de la columna que lo contenga
    private ImageIcon iconoVerContrato = new ImageIcon(getClass().getResource("/Imagenes/buscar-archivo.png"));
    private ImageIcon iconoSeleccionar = new ImageIcon(getClass().getResource("/Imagenes/selectperson.png"));
    private ImageIcon iconoEliminar = new ImageIcon(getClass().getResource("/Imagenes/delete .png"));
    private ImageIcon iconoSelectcar = new ImageIcon(getClass().getResource("/Imagenes/selectcar.png"));

    public gestionCeldas() {

    }


    public gestionCeldas(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {

     
        //si el tipo es icono entonces valida cual icono asignar a la etiqueta.
        if (tipo.equals("Contrato")) {
            if (String.valueOf(value).equals("Contrato")) {
                
                label.setHorizontalAlignment(CENTER);
                label.setIcon(iconoVerContrato);
                setHorizontalAlignment(CENTER);

               label.setHorizontalAlignment(0);
             
                return label;
            }
        }
        
         if (tipo.equals("Seleccionar")) {
            if (String.valueOf(value).equals("Seleccionar")) {
                
                label.setHorizontalAlignment(CENTER);
                label.setIcon(iconoSeleccionar);
                setHorizontalAlignment(CENTER);

               label.setHorizontalAlignment(0);
             
                return label;
            }
        }
         
         if (tipo.equals("Seleccionarcar")) {
            if (String.valueOf(value).equals("Seleccionarcar")) {
                
                label.setHorizontalAlignment(CENTER);
                label.setIcon(iconoSelectcar);
                setHorizontalAlignment(CENTER);

               label.setHorizontalAlignment(0);
             
                return label;
            }
        }
         
         if (tipo.equals("Eliminar")) {
            if (String.valueOf(value).equals("Eliminar")) {
                
                label.setHorizontalAlignment(CENTER);
                label.setIcon(iconoEliminar);
                setHorizontalAlignment(CENTER);

               label.setHorizontalAlignment(0);
             
                return label;
            }
        }
        
        

        return this;

    }
}
