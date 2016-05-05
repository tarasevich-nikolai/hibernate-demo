package tarasevich.nikolai.user;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author mikalai.u.tarasevich
 */
@Entity
@Table(name = "DBUSER")
public class DBUser {
    private int userId;
    private String username;
    private String createdBy;
    private Date createdDate;

    @Id
    @Column(name = "USER_ID", unique = true, nullable = false, precision = 5, scale = 0)
    @GenericGenerator(name="gen",strategy="increment")
    @GeneratedValue(generator="gen")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "USERNAME", nullable = false, length = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "CREATED_BY", nullable = false, length = 20)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE", nullable = false, length = 7)
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DBUser DBUser2 = (DBUser) o;

        if (userId != DBUser2.userId) return false;
        if (username != null ? !username.equals(DBUser2.username) : DBUser2.username != null) return false;
        if (createdBy != null ? !createdBy.equals(DBUser2.createdBy) : DBUser2.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(DBUser2.createdDate) : DBUser2.createdDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }
}
