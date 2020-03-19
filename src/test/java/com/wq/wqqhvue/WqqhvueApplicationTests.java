package com.wq.wqqhvue;

import com.wq.wqqhvue.entity.Plans;
import com.wq.wqqhvue.repository.PlansService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable; //分页包 千万不要引错了

@SpringBootTest
class WqqhvueApplicationTests {
    @Autowired
    private PlansService plansService;
    @Test
    void contextLoads() {
        PageRequest pageRequest = PageRequest.of(0, 2);
        Page<Plans> page = plansService.findAll(pageRequest);
        int i = 0;
    }
    @Test
    void save(){
        Plans plans = new Plans();
        plans.setName("王骞");
        plans.setDes("无与伦比的帅");
        Plans save = plansService.save(plans);
        System.out.println(save);
    }
    @Test
    void findById(){
        Plans plans = plansService.findById(1).get();
        System.out.println(plans);

    }
    @Test
    void update(){
        Plans plans = new Plans();
        plans.setPlan_id(5);
        plans.setName("测试测试");
        Plans save = plansService.save(plans);
        System.out.println(save);

    }
    @Test
    void delete(){
        plansService.deleteById(5);
    }

}
