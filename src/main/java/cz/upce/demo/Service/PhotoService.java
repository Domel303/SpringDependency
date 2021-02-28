package cz.upce.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {
    @Autowired
    ValidationService validationService;

    public void createAccount(){
        validationService.validateData();
        System.out.println("Photo has been uploaded");

    }

}
