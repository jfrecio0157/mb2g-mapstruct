package org.example.userMapper;

import org.example.domain.User;
import org.example.model.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserComand(User user);
    User userComandToUser(UserCommand userCommand);


}
