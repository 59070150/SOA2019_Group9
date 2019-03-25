package it.kmitl.soa2019.matchservice.match_service;


import it.kmitl.soa2019.matchservice.match_service.match.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.Arrays;
import java.util.List;

@Service
public class matchService {
    private Match newmatch = new Match();

    private ArrayList<Match> matchList = new ArrayList<>(Arrays.asList(
            new Match("My game", "1", "somchai", "ladkrabang", "Registering"),
            new Match("Big game", "2", "somrak", "bangkok", "During Match"),
            new Match("Bang-ra-chan game", "3", "tongmhen", "newyork", "Registering"),
            new Match("SEA game", "4", "nipon", "pattaya", "Registering")
    ));

    public List<Match> getMatchs(String matchid) {
        List<Match> matchesIdentityById = new ArrayList<>();
        for(int count = 0;count < matchList.size();count++) {
            if(matchList.get(count).getId().equals(matchid)) {
                matchesIdentityById.add(matchList.get(count));
            }
        }
        return matchesIdentityById;
    }


    public ArrayList<Match> getAllMatch(){
        return matchList;
    }

    public Match createNewMatch() {
        newmatch.setId("5");
        newmatch.setLocation("Gotham");
        newmatch.setMatchname("Big Game");
        newmatch.setOwner_username("Batman");
        newmatch.setStatus("Registering");
        return newmatch;

    }

    public Match showCreatedMatch() {
        return newmatch;
    }




    /*

    @Autowired
    private matchRepository matchRepository;



    public  ArrayList<Match> getAll(){
        Iterator<Match> dataSet = matchRepository.findAll().iterator();
        ArrayList<Match> matchs = new ArrayList<>();

        while (dataSet.hasNext()){
            matchs.add(dataSet.next());
        }
        return matchs;
    }


    public String searchbyid (int id){
        Optional<Match> SomeMatch = matchRepository.findById(id);
        return "Hello "+ SomeMatch.get().getId();
    }
    */
}



