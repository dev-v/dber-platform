package com.dber.#{packageName}.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(#{projectJavaName}ApiConfig.PLACE_HOLD_SERVICE_NAME)
@RequestMapping("pub/example")
public interface ExampleApi {

  @RequestMapping("{path}")
  String path(@PathVariable("path") String path);
}
