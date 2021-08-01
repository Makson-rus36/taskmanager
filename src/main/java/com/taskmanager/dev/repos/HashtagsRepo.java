package com.taskmanager.dev.repos;

import com.taskmanager.dev.models.Hashtags;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HashtagsRepo extends CrudRepository<Hashtags, Long> {
}
