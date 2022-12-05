package com.myplantdiary.enterprise;


import com.myplantdiary.enterprise.dto.Specimen;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/*

    This is application controller
 */

@Controller
public class PlantDiaryController {

    @RequestMapping("/")
    public String index(){
        Specimen specimen = new Specimen();
        return "start";
    }

    @GetMapping("/specimen")
    public ResponseEntity fetchAllSpecimens(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/specimen/{id}/")
    public ResponseEntity fetchSpecimenById(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }

    /*
    * */
    @PostMapping(value = "/specimen")
    public Specimen createSpecimen(@RequestBody Specimen specimen){
        return specimen;
    }

    @DeleteMapping("/specimen/{id}/")
    public ResponseEntity deleteSpecimen(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }




}
