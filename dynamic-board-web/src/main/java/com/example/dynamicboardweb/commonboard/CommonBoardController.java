package com.example.dynamicboardweb.commonboard;

import com.example.dynamicboardcore.util.TestUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonBoardController {
    @GetMapping("/")
    public String test() {
        return TestUtil.test();
    }
}
