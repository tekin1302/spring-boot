package com.tekin.service;

import com.tekin.domain.User;
import com.tekin.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

/**
 * Created by tekin.omer on 12/10/2014.
 */
@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
    @Mock
    private UserRepository userRepository;

    private UserService userService;

    @Before
    public void setUp() {
        userService = new UserServiceImpl(userRepository);
    }

    @Test
    public void shouldSaveNewUser() {
        final User savedUser = stubRepositoryToReturnUserOnSave();
        final User user = new User();
        final User returnedUser = userService.save(user);
        // verify repository was called with user
        verify(userRepository, times(1)).save(user);
        assertNotEquals("Returned user should come from the repository " + savedUser.toString() + " == " + returnedUser.toString(), savedUser, returnedUser);
    }

    private User stubRepositoryToReturnUserOnSave() {
        User user = new User();
        when(userRepository.save(any(User.class))).thenReturn(user);
        return user;
    }
}
