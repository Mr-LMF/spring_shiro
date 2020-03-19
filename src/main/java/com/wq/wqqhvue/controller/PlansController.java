package com.wq.wqqhvue.controller;

import com.wq.wqqhvue.entity.Plans;
import com.wq.wqqhvue.repository.PlansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


import org.springframework.web.bind.annotation.*;


/**
 * Created by Mr LMF on 2020-03-02 23:19
 */
@RestController
@RequestMapping("/plans")
public class PlansController {
@Autowired
   private PlansService plansService;
@GetMapping("/showPlans/{page}/{size}")
public Page<Plans> showPlans(
        @PathVariable("page") Integer page,
        @PathVariable("size") Integer size
){
    PageRequest request = PageRequest.of(page, size);
    return plansService.findAll(request);
}
@PostMapping("/save")
public String save(@RequestBody Plans plans){
    Plans result = plansService.save(plans);
    if (result != null){
        return "success";
    }else {
        return "error";
    }
}
@GetMapping("/findById/{id}")
public Plans findById(@PathVariable("id") Integer id){
return plansService.findById(id).get();
}
@PutMapping("/update")
public String update(@RequestBody Plans plans){
        Plans result = plansService.save(plans);
        if (result != null){
            return "success";
        }else {
            return "error";
        }
}
@DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
    plansService.deleteById(id);
}
}
