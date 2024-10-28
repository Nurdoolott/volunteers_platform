package com.volunteer.volunteer.platform.repositories;

import com.volunteer.volunteer.platform.domain.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
}
