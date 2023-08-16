package com.supercoding.shoppingmallbackend.controller;


import com.supercoding.shoppingmallbackend.common.CommonResponse;
import com.supercoding.shoppingmallbackend.common.util.ApiUtils;
import com.supercoding.shoppingmallbackend.dto.request.ReviewRequest;
import com.supercoding.shoppingmallbackend.dto.response.ReviewResponse;
import com.supercoding.shoppingmallbackend.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ReviewController {

    private final ReviewService reviewService;


    @GetMapping("/reviews/{productId}")
    public CommonResponse<Object> getItemsReviews(@PathVariable Long productId){
       ReviewResponse getReview = reviewService.getReviewById(productId);
      return ApiUtils.success("리뷰 조회 완료",getReview);
    }



    //리뷰 작성
    @PostMapping("/reviews")
    public CommonResponse<Object> setItemReviews(@RequestBody ReviewRequest reviewRequest){
        ReviewResponse createdReview = reviewService.createReview(reviewRequest);
        return ApiUtils.success("리뷰 작성 완료" , createdReview);
    }


}
