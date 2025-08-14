package com.alt.repository;

import com.alt.entity.ProfileEntity;
import com.alt.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository  extends CrudRepository<ProfileEntity,Long> {
}
