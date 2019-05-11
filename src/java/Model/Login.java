/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Honey
 */
@Entity
@Table(name="login")
public class Login {
    @Column(name = "name")
    private String Name;
    
    @Id
    @Column(name = "email" )
    private String Email;
    
    @Column(name = "Contact")
    private String Contact;
    
    @Column(name = "password")
    private String Password;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public boolean equals(Object o)
    {
        Login l = (Login) o;
        if(this.Email.equals(l.getEmail()) && this.Password.equals(l.getPassword()))
            return true;
        else
            return false;
    }
    
}
