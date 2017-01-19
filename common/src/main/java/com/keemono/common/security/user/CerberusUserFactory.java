package com.keemono.common.security.user;


import org.springframework.security.core.authority.AuthorityUtils;

/**
 * Created by eduard.frades on 18/1/17.
 */
public class CerberusUserFactory {

    public static CerberusUser create(CerberusUserSecurity user) {
        return new CerberusUser(
                user.getUuid(),
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                user.getLastPasswordReset(),
                AuthorityUtils.commaSeparatedStringToAuthorityList(user.getAuthorities())
        );
    }
}
