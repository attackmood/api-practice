package com.cantaur.api.model.tour.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "여행담 좋아요 Request VO")
@Getter
@Setter
public class ReqTouristStoryHeart {

    @Schema(description = "여행담일련번호", type = "Long")
    private Long touristStoryUid;

    @Schema(description = "회원일련번호", type = "Long")
    private Long memberUid;

    @Schema(description = "여행담좋아요여부", type = "Long")
    private String heartYn;



}
