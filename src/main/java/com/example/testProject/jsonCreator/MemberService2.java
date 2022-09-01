package com.example.testProject.jsonCreator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService2 {

	private final MemberRepository memberRepository;

	public Member2 addMember(String name, Integer age, Grade grade) {

		Member2 findMember = memberRepository.findByName(name);

		if(findMember == null){

			Member2 member = Member2.builder()
					.name(name)
					.age(age)
					.grade(grade.GOLD)
					.build();

			return memberRepository.save(member);
		}

		return findMember;
	}
}
