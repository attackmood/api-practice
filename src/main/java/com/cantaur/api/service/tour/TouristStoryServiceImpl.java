package com.cantaur.api.service.tour;

import com.cantaur.api.mapper.tour.TouristStoryMapper;
import com.cantaur.api.model.tour.TouristStory;
import com.cantaur.api.model.tour.req.ReqTouristStory;
import com.cantaur.api.model.tour.req.ReqTouristStoryHeart;
import com.cantaur.api.model.tour.res.ResTouristStory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TouristStoryServiceImpl implements TouristStoryService {

    final TouristStoryMapper touristStoryMapper;

    @Override
    public List<ResTouristStory> getTouristStoryList(Long touristSiteUid){
        TouristStory touristStory = new TouristStory();
        touristStory.setTouristSiteUid(touristSiteUid);
        touristStory.setMemberUid(null);

        return touristStoryMapper.getTouristStoryList(touristStory);
    }


    @Override
    public void insertTouristStory(ReqTouristStory reqTouristStory){
        reqTouristStory.setMemberUid(0L);
        touristStoryMapper.insertTouristStory(reqTouristStory);
    }


    @Override
    public void insertTouristStoryHeart(ReqTouristStoryHeart reqTouristStoryHeart){
        reqTouristStoryHeart.setMemberUid(null);
        touristStoryMapper.insertTouristStoryHeart(reqTouristStoryHeart);
    }

    @Override
    public void deleteTouristStory(Long touristStoryUid){
        String rgtrId = touristStoryMapper.getTouristStoryMbrId(touristStoryUid);
        //멤버 검증
        touristStoryMapper.deleteTouristStory(touristStoryUid);

    }

}
