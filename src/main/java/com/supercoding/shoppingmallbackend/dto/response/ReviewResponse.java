package com.supercoding.shoppingmallbackend.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReviewResponse {
    private Long reviewId;
    private Long consumerId;
    private Long productId;
    private String imageUrl;
    private String content;
    private double rating;
    private String createdAt;
    private String updatedAt;
    private boolean isDeleted;
}
