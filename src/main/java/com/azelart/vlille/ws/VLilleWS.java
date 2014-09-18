package com.azelart.vlille.ws;

import com.azelart.vlille.dto.ExceptionDTO;
import com.azelart.vlille.dto.StationDTO;
import com.azelart.vlille.dto.StationResponseDTO;
import com.azelart.vlille.services.VLilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * VLille WS.
 * @author Corentin Azelart
 */
@Path("stations")
@Component
public class VLilleWS {

    /**
     * VLille Service.
     */
    @Autowired
    private VLilleService vLilleService;

    /**
     * Return a list of stations.
     * @return a list of stations.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public StationResponseDTO findAll() {
        final Long startTime = System.currentTimeMillis();
        try {
            final StationResponseDTO stationResponseDTO = vLilleService.findAll();
            stationResponseDTO.setTime(System.currentTimeMillis() - startTime);
            return stationResponseDTO;
        } catch (final Exception e) {
            throw new ExceptionDTO(e.getMessage());
        }
    }



}
