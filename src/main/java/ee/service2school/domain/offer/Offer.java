package ee.service2school.domain.offer;

import ee.service2school.domain.form.city.City;
import ee.service2school.domain.user.User;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
@Data
@Entity
@Table(name = "offer")
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Size(max = 4096)
    @NotNull
    @Column(name = "description", nullable = false, length = 4096)
    private String description;

    @NotNull
    @Column(name = "price_per_student", nullable = false)
    private Integer pricePerStudent;

    @NotNull
    @Column(name = "students_min", nullable = false)
    private Integer studentsMin;

    @NotNull
    @Column(name = "students_max", nullable = false)
    private Integer studentsMax;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @Size(max = 255)
    @NotNull
    @Column(name = "address", nullable = false)
    private String address;

    @NotNull
    @Column(name = "phone", nullable = false)
    private Integer phone;

    @NotNull
    @Column(name = "date_add", nullable = false)
    private LocalDate dateAdd;

    @Size(max = 255)
    @Column(name = "additional_info")
    private String additionalInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPricePerStudent() {
        return pricePerStudent;
    }

    public void setPricePerStudent(Integer pricePerStudent) {
        this.pricePerStudent = pricePerStudent;
    }

    public Integer getStudentsMin() {
        return studentsMin;
    }

    public void setStudentsMin(Integer studentsMin) {
        this.studentsMin = studentsMin;
    }

    public Integer getStudentsMax() {
        return studentsMax;
    }

    public void setStudentsMax(Integer studentsMax) {
        this.studentsMax = studentsMax;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public LocalDate getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDate dateAdd) {
        this.dateAdd = dateAdd;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

}