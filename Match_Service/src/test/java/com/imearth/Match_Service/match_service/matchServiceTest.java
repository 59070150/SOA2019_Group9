package com.imearth.Match_Service.match_service;

import com.imearth.Match_Service.match_service.model.Match;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class matchServiceTest {

    @Mock
    matchRepository matchRepository;

    @Test
    public void searchbyid (){
        Match matchstub = new Match();
        matchstub.setId(1);
        matchstub.setLocation("Somewhere");
        matchstub.setMatchname("My game");
        matchstub.setOwner_username("alex");
        matchstub.setStatus("Openning");


        /*
                     @Mock
                matchRepository matchRepository;

                @Test
                public String searchbyid (int id){
                    Optional<Match> SomeMatch = matchRepository.findById(id);
                    return "Hello "+ SomeMatch.get().getId();
                }
         */

    }
}
