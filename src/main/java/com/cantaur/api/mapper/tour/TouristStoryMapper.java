package com.cantaur.api.mapper.tour;

import com.cantaur.api.model.tour.TouristStory;
import com.cantaur.api.model.tour.req.ReqTouristStory;
import com.cantaur.api.model.tour.req.ReqTouristStoryHeart;
import com.cantaur.api.model.tour.res.ResTouristStory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TouristStoryMapper {
    List<ResTouristStory> getTouristStoryList(TouristStory touristStory);
    String getTouristStoryMbrId(Long touristStoryUid);
    void insertTouristStory(ReqTouristStory reqTouristStory);
    void insertTouristStoryHeart(ReqTouristStoryHeart reqTouristStoryHeart);
    void deleteTouristStory(Long touristStoryUid);

}
