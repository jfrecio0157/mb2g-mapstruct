import org.example.domain.User;
import org.example.model.UserCommand;
import org.example.userMapper.UserMapper;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class test1 {

    @Test
    public void testUserCommandToUser(){

    //given
    UserCommand userCommand = new UserCommand();
    userCommand.setFirstName("Paco");
    userCommand.setLastName("Recio");
    userCommand.setEmail("paco.recio@example.com");


    //when
    User user = UserMapper.INSTANCE.userComandToUser(userCommand);


    //then
    assertThat(user.getFirstName(), equalTo("Paco"));
    assertThat(user.getLastName(),equalTo("Recio"));
    assertThat(user.getEmail(), equalTo("paco.recio@example.com"));
    }
}



