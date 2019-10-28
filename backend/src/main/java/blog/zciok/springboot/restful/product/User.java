package blog.zciok.springboot.restful.product;

import lombok.Data;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user", schema = "public")
@Data
public class User  {
	@Id
	@Column(name = "id")
    private Long id;

    private String login;
    
    private String name;
    
    private String type;
    
    @Column(name="avatar_url")
    private String avatarUrl;
    
    @Column(name="created_at")
    private java.sql.Timestamp createdAt;    
    
    @Column(name="request_count")
    private Integer requestCount;
    
    @Column(name="calculations")
    private BigDecimal calculations;
}
