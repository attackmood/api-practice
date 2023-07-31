package com.cantaur.api.model.member.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;


@Schema(description = "관광지태그 Response VO")
@Getter
@Setter
public class ResTouristSiteTag {

    @Schema(description = "관광지일련번호", type = "String")
    private String touristSiteUid;

    @Schema(description = "태그일련번호", type = "String")
    private String tagUid;

    @Schema(description = "태그명", type = "String")
    private String tagName;

    @Schema(description = "정렬순서", type = "Long")
    private Long sortSeq;

}
