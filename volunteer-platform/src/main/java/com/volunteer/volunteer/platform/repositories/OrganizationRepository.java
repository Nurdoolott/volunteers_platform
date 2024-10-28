package com.volunteer.volunteer.platform.repositories;

import com.volunteer.volunteer.platform.domain.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
