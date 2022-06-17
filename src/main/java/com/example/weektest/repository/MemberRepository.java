package com.example.weektest.repository;

import com.example.weektest.user.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
import java.util.List;
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findAllByMyServiceAgeEqualsAndMyServiceGenderNot(int myServiceAge, Gender myServiceGender);
}
