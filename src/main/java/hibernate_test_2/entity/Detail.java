package hibernate_test_2.entity;

import javax.persistence.*;

@Entity
@Table(name = "deetails")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "city")
    private String city;
    @Column(name = "phone_number")
    private String phineNumber;
    @Column(name = "email")
    private String email;

    public Detail(String city, String phineNumber, String email) {
        this.city = city;
        this.phineNumber = phineNumber;
        this.email = email;
    }

    public Detail() {
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhineNumber() {
        return phineNumber;
    }

    public void setPhineNumber(String phineNumber) {
        this.phineNumber = phineNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", phineNumber='" + phineNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
