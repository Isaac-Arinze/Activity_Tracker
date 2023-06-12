package com.zikan.activity_tracker.mapper;

import com.zikan.activity_tracker.dto.requestDto.UserDto;
import com.zikan.activity_tracker.entity.User;

import java.util.function.Function;

public class userRequestDtoMapper implements Function<User, UserDto> {
    @Override
    public UserDto apply(User user) {
        return null;
    }
}
