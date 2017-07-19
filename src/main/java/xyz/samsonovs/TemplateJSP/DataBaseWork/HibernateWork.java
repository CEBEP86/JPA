package xyz.samsonovs.TemplateJSP.DataBaseWork;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.samsonovs.TemplateJSP.domain.Task;
import xyz.samsonovs.TemplateJSP.repositories.TaskRepository;

import java.util.List;

/**
 * Created by Костя on 19.07.2017.
 */
public class HibernateWork {
    @Autowired
    TaskRepository taskRepository;

    public Task add(Task task) {
        task.setId(null);
        return taskRepository.save(task);
    }

    public List<Task> load() {
        return taskRepository.findAll();
    }

    public void save(Task task) {
        taskRepository.save(task);
    }

    public void delete(Integer id) {
        taskRepository.delete(id);
    }

}






