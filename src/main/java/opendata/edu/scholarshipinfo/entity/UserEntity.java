package opendata.edu.scholarshipinfo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userIdx")
    private Long userIdx;  // 사용자 idx

    @Column(name = "affiliation")
    private String affiliation;  // 학교

    @Column(name = "department")
    private String department;  // 학과

    @Column(name = "year")
    private int year;  // 학년

    @Column(name = "semester")
    private int semester;  // 학기

    @Column(name = "grade")
    private String grade;  // 성적

    @Column(name = "residence")
    private String residence;  // 거주지




}
