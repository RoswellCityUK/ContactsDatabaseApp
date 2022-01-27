/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContactsDatabaseGUI;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Tomasz Grabowski
 */
@Entity
@Table(name = "Contacts")
@NamedQueries({
    @NamedQuery(name = "Contacts.findAll", query = "SELECT c FROM Contacts c"),
    @NamedQuery(name = "Contacts.findById", query = "SELECT c FROM Contacts c WHERE c.id = :id"),
    @NamedQuery(name = "Contacts.findByFirstName", query = "SELECT c FROM Contacts c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "Contacts.findByLastName", query = "SELECT c FROM Contacts c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Contacts.findByPhoneNumber", query = "SELECT c FROM Contacts c WHERE c.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "Contacts.findByBirthday", query = "SELECT c FROM Contacts c WHERE c.birthday = :birthday"),
    @NamedQuery(name = "Contacts.findByFriend", query = "SELECT c FROM Contacts c WHERE c.friend = :friend"),
    @NamedQuery(name = "Contacts.findByEnemy", query = "SELECT c FROM Contacts c WHERE c.enemy = :enemy")})
public class Contacts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "FirstName")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "LastName")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Column(name = "Birthday")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthday;
    @Column(name = "Friend")
    private Boolean friend;
    @Column(name = "Enemy")
    private Boolean enemy;

    public Contacts() {
    }

    public Contacts(Integer id) {
        this.id = id;
    }

    public Contacts(Integer id, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getFriend() {
        return friend;
    }

    public void setFriend(Boolean friend) {
        this.friend = friend;
    }

    public Boolean getEnemy() {
        return enemy;
    }

    public void setEnemy(Boolean enemy) {
        this.enemy = enemy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Contacts)) {
            return false;
        }
        Contacts other = (Contacts) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "[" + id + "] " + this.firstName + " " + this.lastName;
    }
    
}
