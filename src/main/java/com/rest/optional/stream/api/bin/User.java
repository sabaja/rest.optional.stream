package com.rest.optional.stream.api.bin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -3413836556179887134L;
    private BigInteger id;
    private String name;
    private String email;
    private String gender;
    private String status;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
