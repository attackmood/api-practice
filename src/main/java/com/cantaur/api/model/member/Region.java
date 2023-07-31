package com.cantaur.api.model.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Schema(description = "지역 DTO")
@Getter
@Setter
public class Region {

    @Schema(description = "지역코드", type = "String")
    private String regionCode;

    @Schema(description = "지역명", type = "String")
    private String regionName;

    @Schema(description = "관광지일련번호", type = "Long")
    private Long touristSiteUid;

    @JsonIgnore
    private LocalDateTime createdAt;

    @JsonIgnore
    private LocalDateTime changedAt;

}
