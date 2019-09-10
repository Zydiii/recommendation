package sebastianj1w.recommendation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sebastianj1w.recommendation.entity.Cluster;
import sebastianj1w.recommendation.entity.User;
import sebastianj1w.recommendation.service.BehaviorService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping(value = "/behavior")
public class behavior {
    @Autowired
    BehaviorService behaviorService;

    @ResponseBody
    @RequestMapping("/getUser")
    public User getUser(@RequestParam int id) {
        return behaviorService.getUser(id);
    }

    @ResponseBody
    @RequestMapping("/getAll")
    public List<User> getAll() {
//        behaviorService.getSimilar();
        return behaviorService.getAll();
    }

    @ResponseBody
    @RequestMapping("/getSimilar")
    public Set<Cluster> getSimilar() {
        return behaviorService.getSimilar();
//        return behaviorService.getAll();
    }

    @ResponseBody
    @RequestMapping("/insertUser")
    public void insertUser(@RequestParam int id, @RequestParam int c1, @RequestParam int c2, @RequestParam int c3, @RequestParam int c4, @RequestParam int c5) {
        behaviorService.insertUser(id, c1, c2, c3, c4, c5);
    }

    @ResponseBody
    @RequestMapping("/addBc1")
    public void addc1(@RequestParam long id) {
        behaviorService.addBehaviorC1(id);
    }

    @ResponseBody
    @RequestMapping("/addBc2")
    public void addc2(@RequestParam long id) {
        behaviorService.addBehaviorC2(id);
    }

    @ResponseBody
    @RequestMapping("/addBc3")
    public void addc3(@RequestParam long id) {
        behaviorService.addBehaviorC3(id);
    }

    @ResponseBody
    @RequestMapping("/addBc4")
    public void addc4(@RequestParam long id) {
        behaviorService.addBehaviorC4(id);
    }

    @ResponseBody
    @RequestMapping("/addBc5")
    public void addc5(@RequestParam long id) {
        behaviorService.addBehaviorC5(id);
    }

}
