package com.kiganda.servspace.repository;

import com.kiganda.servspace.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long>{
    
}