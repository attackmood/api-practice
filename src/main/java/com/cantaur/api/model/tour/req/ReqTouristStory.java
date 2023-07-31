package com.cantaur.api.model.tour.req;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "여행담 Request VO")
@Getter
@Setter
public class ReqTouristStory {
    @JsonIgnore
    private Long touristStoryUid;

    @Schema(description = "관광지일련번호", type = "Long")
    private Long touristSiteUid;

    @JsonIgnore
    private Long memberUid;

    @Schema(description = "여행담내용", type = "String")
    private String contents;

    @JsonIgnore
    private String exposureYn;

    @JsonIgnore
    private String changedMemberId;


}
