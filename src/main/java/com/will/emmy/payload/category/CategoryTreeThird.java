package com.will.emmy.payload.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryTreeThird {

    private Long levelThreeId;

    private String levelThreeName;


}