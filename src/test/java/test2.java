import org.example.domain.User;
import org.example.model.UserCommand;
import org.example.userMapper.UserMapper;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;



public class test2 {

    @Test
    public void testUserToUserCommand(){

    //given
        User user = new User();
        user.setFirstName("Paco");
        user.setLastName("Recio");
        user.setEmail("paco.recio@example.com");

    //when
    UserCommand userCommand = UserMapper.INSTANCE.userToUserComand(user);

    //then
    assertThat(userCommand.getFirstName(), equalTo("Paco"));
    assertThat(userCommand.getLastName(),equalTo("Recio"));
    assertThat(userCommand.getEmail(), equalTo("paco.recio@example.com"));
    }
}



