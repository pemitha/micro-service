package com.epic.ms.gateway.API_GATEWAY.bean;

import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
public class Test {
   // to show the use of lombok only @data  @NoArgsConstructor  @AllArgsConstructor   private constructor
    private long id;
    private String name;
    private Double amount;

}
