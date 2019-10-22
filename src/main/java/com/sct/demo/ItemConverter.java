package com.sct.demo;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
@ConfigurationPropertiesBinding
public class ItemConverter implements Converter<String, Item> {
  @Override
  public Item convert(String source) {
      if(source==null){
          return null;
      }
      return new Item(source);
  }
  
 

}
