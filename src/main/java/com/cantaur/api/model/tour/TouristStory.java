package com.cantaur.api.model.tour;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Schema(description = "여행담 DTO")
@Getter
@Setter
public class TouristStory {
    @Schema(description = "여행담일련번호", type = "Long")
    private Long touristStoryUid;

    @Schema(description = "관광지일련번호", type = "Long")
    private Long touristSiteUid;

    @Schema(description = "회원일련번호", type = "Long")
    private Long memberUid;

    @Schema(description = "여행담내용", type = "String")
    private String contents;

    @Schema(description = "노출여부", type = "String")
    private String exposureYn;

    @Schema(description = "변경자아이디", type = "String")
    private String changedMemberId;

    @JsonIgnore
    private LocalDateTime deletedAt;

    @JsonIgnore
    private LocalDateTime createdAt;

    @JsonIgnore
    private LocalDateTime changedAt;


}
