package xyz.samsonovs.TemplateJSP.repositories;

import xyz.samsonovs.TemplateJSP.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository   <Task, Integer> {


}