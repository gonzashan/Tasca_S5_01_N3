package cat.itacademy.barcelonactiva.sanmiguelalonso.gonzalo.s05.t01.n01.controllers;

import cat.itacademy.barcelonactiva.sanmiguelalonso.gonzalo.s05.t01.n01.model.dto.FlorDTO;
import cat.itacademy.barcelonactiva.sanmiguelalonso.gonzalo.s05.t01.n01.model.exception.ErrorDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumeWebService {
    @Autowired
    RestTemplate restTemplate;


    /**
     * GET -> /flor/clientFlorsAll"
     * @return ResponseEntity
     */
    @RequestMapping(value = "/flor/clientFlorsAll")
    public ResponseEntity<?> getProductList() {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<FlorDTO> entity = new HttpEntity<FlorDTO>(headers);

        return restTemplate.exchange(
                "http://localhost:9001/flor/getAll", HttpMethod.GET, entity, Object.class);
    }


    /**
     * GET -> /flor/clientFlorsGetOne/{id}"
     * @return Object
     */
    @RequestMapping(value = "/flor/clientFlorsGetOne/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> updateProduct(@PathVariable("id") Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<FlorDTO> entity = new HttpEntity<FlorDTO>(headers);

        try {
            return restTemplate.exchange(
                    "http://localhost:9001/flor/getOne/" + id, HttpMethod.GET, entity, Object.class);

        } catch (HttpClientErrorException e) {
            return new ResponseEntity<ErrorDetails>
                    (new ErrorDetails(e.getRawStatusCode(), "No se ha trobat la flor amb id: " + id),
                            e.getStatusCode());

        }
    }


    /**
     * POST -> /flor/clientFlorsAdd"
     * @return ResponseEntity
     */
    @RequestMapping(value = "/flor/clientFlorsAdd", method = RequestMethod.POST)
    public ResponseEntity<?> createProducts(@RequestBody FlorDTO product) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<FlorDTO> entity = new HttpEntity<FlorDTO>(product, headers);

        try {
            return restTemplate.exchange(
                    "http://localhost:9001/flor/add", HttpMethod.POST, entity, String.class);

        } catch (HttpServerErrorException.InternalServerError e) {
            return new ResponseEntity<ErrorDetails>
                    (new ErrorDetails(e.getRawStatusCode(), "No se ha pogut guardar la flor nova."),
                            HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


/**
 * PUT -> /flor/clientFlorsUpdate"
 * @return Object
 */
    @RequestMapping(value = "/flor/clientFlorsUpdate", method = RequestMethod.PUT)
    public ResponseEntity<?> updateProduct(@RequestBody FlorDTO product) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<FlorDTO> entity = new HttpEntity<FlorDTO>(product, headers);

        try {
            return restTemplate.exchange(
                    "http://localhost:9001/flor/update", HttpMethod.PUT, entity, String.class);

        } catch (HttpClientErrorException | HttpServerErrorException e) {
            return new ResponseEntity<ErrorDetails>
                    (new ErrorDetails(e.getRawStatusCode(), "No se ha pogut actualizar el registre."),
                            e.getStatusCode());
        }

    }


    /**
     * DELETE -> /flor/clientFlorsDelete/{id}"
     * @return Object
     */
    @RequestMapping(value = "/flor/clientFlorsDelete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteProduct(@PathVariable("id") Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<FlorDTO> entity = new HttpEntity<FlorDTO>(headers);

        try {
            return restTemplate.exchange(
                    "http://localhost:9001/flor/delete/" + id, HttpMethod.DELETE, entity, String.class);

        } catch (HttpClientErrorException | HttpServerErrorException e) {
            return new ResponseEntity<ErrorDetails>
                    (new ErrorDetails(e.getRawStatusCode(), "No se ha pogut eliminar la flor nova amb id: " + id),
                            e.getStatusCode());
        }

    }



}

