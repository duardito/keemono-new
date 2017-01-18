package com.keemono.user;

import com.keemono.common.security.user.CerberusUserFactory;
import com.keemono.common.security.user.UserSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by eduard.frades on 18/1/17.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,   rollbackFor = Exception.class, readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = null;
        try {
            user = userRepository.findByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            UserSecurity security = new UserSecurity();
            security.setId(user.getId());
            security.setAuthorities(user.getAuthorities());
            security.setUsername(user.getUsername());
            security.setUuid(user.getUuid());
            return CerberusUserFactory.create(security);
        }
    }
}
