package com.supercoding.shoppingmallbackend.dto.request;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReviewRequest {
    private Long consumerId;
    private Long productId;
}
