package com.ebit.xapistatement.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.xapistatement.model.Weather;

@RestController
@RequestMapping("/v1/weather")
public class WeatherV1Controller extends GenericRestController<Weather> {

}
