package com.example.dynamicboardcore.util.user;

import com.example.dynamicboardcore.util.type.Authority;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponseDto {
    private String email;
    private String password;
    private Authority authority;

    public static UserResponseDto of(User user) {
        return new ModelMapper().map(user, UserResponseDto.class);
    }
}
