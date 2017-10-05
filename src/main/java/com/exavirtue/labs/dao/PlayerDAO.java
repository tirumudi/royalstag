package com.exavirtue.labs.dao;

import com.exavirtue.labs.models.Player;
import org.springframework.http.converter.xml.Jaxb2CollectionHttpMessageConverter;

import java.util.Collections;
import java.util.List;

/**
 * Created by thirumudi on 6/10/17.
 */
public class PlayerDAO {

    // get all stag entries

    List<Player> getAllStagEntries(){
        String sql = "SELECT id,name,email,status,rating,skills from PLAYER;";
        return Collections.emptyList();
    }


    /**
     * Update both status of both, when the other player accepts the request
     */


    // Add a record to 'Player Requests'

}
