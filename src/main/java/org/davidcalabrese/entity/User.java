package org.davidcalabrese.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents a user in the application. Corresponds to table blog.user.
 *
 * @author David Calabrese
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_created")
    @CreationTimestamp
    private LocalDate dateCreated;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "access_privileges")
    private String accessPrivileges;

    @Column(name = "profile_image")
    private String profileImage;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Post> posts = new HashSet<>();

    /** No arg constructor */
    public User() {}

    /**
     * Constructor that takes all fields except ID (generated by database)
     *
     * @param userName string which identifies a user in application
     * @param firstName user's first name
     * @param lastName user's last name
     * @param dateCreated datetime account was created
     * @param email user's email address
     * @param password user's password
     * @param accessPrivileges user's access privileges (`user` by default, otherwise `admin`)
     */
    public User(int id, String userName, String firstName, String lastName, LocalDate dateCreated, String email, String password, String accessPrivileges) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateCreated = dateCreated;
        this.email = email;
        this.password = password;
        this.accessPrivileges = accessPrivileges;
    }

    /**
     * Gets the value of <code>id</code>
     *
     * @return value of <code>id</code>
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of <code>id</code>
     *
     * @param id the value of <code>id</code>
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the value of <code>userName</code>
     *
     * @return value of <code>userName</code>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of <code>userName</code>
     *
     * @param userName the value of <code>userName</code>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets the value of <code>firstName</code>
     *
     * @return value of <code>firstName</code>
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of <code>firstName</code>
     *
     * @param firstName the value of <code>firstName</code>
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the value of <code>lastName</code>
     *
     * @return value of <code>lastName</code>
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of <code>lastName</code>
     *
     * @param lastName the value of <code>lastName</code>
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the value of <code>timeCreated</code>
     *
     * @return value of <code>timeCreated</code>
     */
    public LocalDate getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of <code>timeCreated</code>
     *
     * @param timeCreated the value of <code>timeCreated</code>
     */
    public void setDateCreated(LocalDate timeCreated) {
        this.dateCreated = timeCreated;
    }

    /**
     * Gets the value of <code>email</code>
     *
     * @return value of <code>email</code>
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of <code>email</code>
     *
     * @param email the value of <code>email</code>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the value of <code>password</code>
     *
     * @return value of <code>password</code>
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of <code>password</code>
     *
     * @param password the value of <code>password</code>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the value of <code>accessPrivileges</code>
     *
     * @return value of <code>accessPrivileges</code>
     */
    public String getAccessPrivileges() {
        return accessPrivileges;
    }

    /**
     * Sets the value of <code>accessPrivileges</code>
     *
     * @param accessPrivileges the value of <code>accessPrivileges</code>
     */
    public void setAccessPrivileges(String accessPrivileges) {
        this.accessPrivileges = accessPrivileges;
    }

    /**
     * Gets the value of <code>profileImage</code>
     *
     * @return value of <code>profileImage</code>
     */
    public String getProfileImage() {
        return profileImage;
    }

    /**
     * Sets the value of <code>profileImage</code>
     *
     * @param profileImage the value of <code>profileImage</code>
     */
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
