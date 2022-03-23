package study.datajpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String username;

    // JPA기 때문에 기본 생성자도 하나 있어야
    protected Member() {
    }

    public Member(String username) {
        this.username = username;
    }
}
