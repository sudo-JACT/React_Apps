package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Task;
import com.mycompany.myapp.domain.User;
import com.mycompany.myapp.service.dto.TaskDTO;
import com.mycompany.myapp.service.dto.UserDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Task} and its DTO {@link TaskDTO}.
 */
@Mapper(componentModel = "spring")
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {
    @Mapping(target = "user_task", source = "user_task", qualifiedByName = "userLogin")
    TaskDTO toDto(Task s);

    @Named("userLogin")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "login", source = "login")
    UserDTO toDtoUserLogin(User user);
}
