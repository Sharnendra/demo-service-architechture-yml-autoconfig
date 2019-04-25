package com.service.demoservicearchitechture.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@ConfigurationProperties("service")
@Component
public class MultiService {
	@Override
	public String toString() {
		return "service [data=" + data + "]";
	}

	public List<DataCofig> getData() {
		return data;
	}

	public void setData(List<DataCofig> data) {
		this.data = data;
	}

	private List<DataCofig> data=new ArrayList<>();
}
