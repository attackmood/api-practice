package com.cantaur.api.model.tour;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Schema(description = "여행담 좋아요 DTO")
@Getter
@Setter
public class TouristStoryHeart {

    @Schema(description = "여행담일련번호", type = "Long")
    private Long touristStoryUid;

    @Schema(description = "회원일련번호", type = "Long")
    private Long memberUid;

    @Schema(description = "여행담좋아요여부", type = "Long")
    private String heartYn;

    @JsonIgnore
    private LocalDateTime createdAt;

    @JsonIgnore
    private LocalDateTime changedAt;

}
