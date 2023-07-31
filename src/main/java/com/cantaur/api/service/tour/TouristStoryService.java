package com.cantaur.api.service.tour;


import com.cantaur.api.model.tour.req.ReqTouristStory;
import com.cantaur.api.model.tour.req.ReqTouristStoryHeart;
import com.cantaur.api.model.tour.res.ResTouristStory;

import java.util.List;

public interface TouristStoryService {
    List<ResTouristStory> getTouristStoryList(Long touristSiteUid);

    void insertTouristStory(ReqTouristStory reqTouristStory);

    void insertTouristStoryHeart(ReqTouristStoryHeart reqTouristStoryHeart);

    void deleteTouristStory(Long touristStoryUid);
}
