package com.rest.optional.stream.api.bin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private BigInteger id;
    private String name;
    private String email;
    private String gender;
    private String status;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

}
