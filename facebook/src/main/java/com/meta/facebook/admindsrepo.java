package com.meta.facebook;

import org.springframework.data.jpa.repository.JpaRepository;

public interface admindsrepo  extends JpaRepository<alhamdadmins,String> {
    boolean existsByEmail(String email);


}
