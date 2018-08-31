/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import modelo.*;
import org.hibernate.criterion.Restrictions;



/**
 *
 * @author pablo
 */
public class operaciones {
    
    public void altaUsuarios(Usuarios user){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save( user );
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Usuario insertado correctamente");
    }
    
    public void altaPedidos(Pedidos pedido){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save( pedido );
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Pedido Realizado correctamente a la brevedad recibira confirmacion con nombre cadete y nun cel");
        
    }
    
    
    public static boolean LoginUsuario(String usuario, String password) { 
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Usuarios usuario_login = (Usuarios) session.createCriteria(Usuarios.class)
                .add(Restrictions.eq("usuario", usuario)).uniqueResult();
        if(usuario_login!=null){
            if(usuario_login.getPassword().equals(password)){
                new vista.Pedido_Usuarios(usuario_login).setVisible(true);
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Error la contraseña ingresada "
                            + "no corresponde con el usuario", "" ,JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        if(usuario_login==null){
                JOptionPane.showMessageDialog(null, "El usuario no existe", "" ,JOptionPane.ERROR_MESSAGE);
                return false;
        }
        tx.commit();
        session.close();
        return true; 
}
    
    
    
    
    
    
    
}
