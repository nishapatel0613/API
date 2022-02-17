package com.example.Vanguard.API.Controller;



import com.example.Vanguard.API.Entity.Client;
import com.example.Vanguard.API.Service.RetirementDecision;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {


    @Autowired
    private RetirementDecision retirementDecision;


//    @RequestMapping(method = RequestMethod.GET, value = "/retirement/{sal}/")
//    public ResponseEntity<Client> getClient(@PathVariable Long sal){
//
//       String s = retirementDecision.retirement(sal) ;
//        return new ResponseEntity(s ,HttpStatus.OK);
//    }

//

    @RequestMapping(method = RequestMethod.POST, value = "/client")
    public ResponseEntity<Client> createClient(@RequestBody Client client){
        return new ResponseEntity(retirementDecision.retirement(client.getId()),HttpStatus.CREATED);
    }


}
