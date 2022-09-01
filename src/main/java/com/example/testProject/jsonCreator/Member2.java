package com.example.testProject.jsonCreator;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "member")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode(of = "id")
public class Member2 {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private Integer age;

	@Enumerated(EnumType.STRING)
	private Grade grade;

	private Member2(String name, Integer age, Grade grade){
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}
