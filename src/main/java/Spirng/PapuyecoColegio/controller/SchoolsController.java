package Spirng.PapuyecoColegio.controller;

import Spirng.PapuyecoColegio.dto.SchoolRequestDTO;
import Spirng.PapuyecoColegio.entity.SchoolsEntity;
import Spirng.PapuyecoColegio.services.SchoolServices;
import Spirng.PapuyecoColegio.utils.ApiResponseDTO;
import Spirng.PapuyecoColegio.utils.Constants;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Controller
@RestController
@AllArgsConstructor
@Log4j2
@RequestMapping(value = Constants.Paths.SCHOOLS_PATHS)
public class SchoolsController {
    @Qualifier("SchoolServices")
    private SchoolServices schoolServices;

    @PostMapping(value = "/create-school",consumes = {"application/json"},produces = {"application/json"})
    public ResponseEntity<ApiResponseDTO<SchoolsEntity>> createSchools(@Valid @RequestBody SchoolRequestDTO request){


        return null;
    };

}
