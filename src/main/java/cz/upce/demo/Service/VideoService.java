package cz.upce.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {
    @Autowired
    ValidationService validationService;
    public void publishArticle(){
        validationService.validateData();
        System.out.println("Video has been uploaded");

    }
}
