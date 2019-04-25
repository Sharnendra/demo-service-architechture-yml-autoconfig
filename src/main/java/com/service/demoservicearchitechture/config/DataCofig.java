package com.service.demoservicearchitechture.config;

public class DataCofig {
	
	@Override
	public String toString() {
		return "DataCofig [name=" + name + ", host=" + host + ", json=" + json + "]";
	}

	private String name;
	private String host;
	private String json;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
