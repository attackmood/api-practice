package com.cantaur.api.model.member.req;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "관광지 Request VO")
@Getter
@Setter
public class ReqTouristSite {

    @JsonIgnore
    private Long touristSiteUid;

    @JsonIgnore
    private String regionCode;
}
