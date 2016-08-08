/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bafar.buro.ws.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.Session;

/**
 *
 * @author Nelly
 */
public class SgfensProspectoDatosCreditoDAO {
    private Session session;
    private Transaction tx;
    
    public SgfensProspectoDatosCreditoDAO() {
        
    }
    
    public int save(SgfensProspectoDatosCredito object) throws HibernateException { 
        int id = 0;
        try { 
            start();
            id = (int) session.save(object); 
            tx.commit(); 
        } catch (HibernateException he) { 
            handleException(he); 
            throw he; 
        } finally { 
            session.close(); 
        }  

        return id; 
    }
    
    public void update(SgfensProspectoDatosCredito object) throws HibernateException { 
        try { 
            start(); 
            session.update(object); 
            tx.commit(); 
        } catch (HibernateException he) { 
            handleException(he); 
            throw he; 
        } finally { 
            session.close(); 
        } 
    }
    
    public void delete(int id) throws HibernateException { 
        try { 
            start(); 
            SgfensProspectoDatosCredito object = (SgfensProspectoDatosCredito) session.get(SgfensProspectoDatosCredito.class,id); 
            session.delete(object); 
            tx.commit(); 
        } catch (HibernateException he) {   
            handleException(he); 
            throw he; 
        } finally { 
            session.close(); 
        } 
    } 
    
    public SgfensProspectoDatosCredito getById(int id) throws HibernateException { 
        SgfensProspectoDatosCredito object = null;  
        try { 
            start(); 
            object = (SgfensProspectoDatosCredito) session.get(SgfensProspectoDatosCredito.class, id);
        }catch(HibernateException he){
            System.out.print("Error :"+he.getMessage());
        }
        finally { 
            session.close(); 
        }  

        return object; 
    }  
     
    private void start() throws HibernateException { 
        session = HibernateUtil.getSessionFactory().openSession(); 
        tx = session.beginTransaction(); 
    }
    
    private void handleException(HibernateException he) throws HibernateException { 
        tx.rollback(); 
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he); 
    }
}
