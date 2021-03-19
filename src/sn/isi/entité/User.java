package sn.isi.entité;

public class User {
    private Integer id;
    private String prenom;
    private String nom ;
    private String email;
    private Integer eta;

    /* definitions des constructeurs*/

    public User(Integer id, String prenom, String nom, String email, Integer eta) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.eta = eta;
    }

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }
}
