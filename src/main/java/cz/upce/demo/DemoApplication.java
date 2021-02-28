package cz.upce.demo;

import cz.upce.demo.Service.VideoService;
import cz.upce.demo.Service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoApplication {
    @Autowired
    PhotoService photoService;
    @Autowired
    VideoService videoService;

    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cz.upce.demo");
        context.getBean(DemoApplication.class).process();
    }

    private void process() {
        photoService.createAccount();
        videoService.publishArticle();
    }

}
