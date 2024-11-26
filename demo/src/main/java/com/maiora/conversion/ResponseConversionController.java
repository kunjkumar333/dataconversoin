package com.maiora.conversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ResponseConversionController {

    @Autowired
    private ConversionService conversionService;
    @GetMapping("/response/conversion")
    public List<RefResponse> getAllBooks(@RequestBody RequestData request) {
        return conversionService.getResponse(request);
    }
}
