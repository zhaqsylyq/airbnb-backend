package com.zhaqsylyq.airbnbclone.user.mapper;

import com.zhaqsylyq.airbnbclone.user.application.dto.ReadUserDTO;
import com.zhaqsylyq.airbnbclone.user.domain.Authority;
import com.zhaqsylyq.airbnbclone.user.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }

}
