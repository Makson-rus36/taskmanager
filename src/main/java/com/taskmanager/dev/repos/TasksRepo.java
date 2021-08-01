package com.taskmanager.dev.repos;

import com.taskmanager.dev.models.Tasks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TasksRepo extends CrudRepository<Tasks, Long> {
    List<Tasks> findByTags(String tag);
}
