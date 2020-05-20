package com.yyy.shop;

import com.yyy.shop.model.User;
import com.yyy.shop.repository.UserRepository;
import com.yyy.shop.service.UserService;
import com.yyy.shop.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.clearInvocations;
import static org.mockito.Mockito.verify;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class AppServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private final UserService userService = new UserServiceImpl();

    @Test
    void shouldSaveUserSuccessFully(){
        final User user = new User();
        user.setId(1L);
        user.setUsername("dung");
        user.setPassword("password");

        given(userRepository.findById(user.getId())).willReturn(Optional.empty());
        given(userRepository.save(user)).willAnswer(invocation -> invocation.getArgument(0));

        User savedUser = userService.saveUser(user);
        assertThat(savedUser).isNotNull();
        verify(userRepository).save(any(User.class));
    }



}
