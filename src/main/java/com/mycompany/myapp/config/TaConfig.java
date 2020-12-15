package com.mycompany.myapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TaConfig {
    @Value("${terminus.ta.collector.url}")
    private String terminusTaCollectorURL;

    @Value("${terminus.ta.enable}")
    private boolean terminusTaEnable;

    @Value("${terminus.ta.url}")
    private String terminusTaURL;

    @Value("${terminus.key}")
    private String terminusKey;

	public String getTerminusTaCollectorURL() {
		return terminusTaCollectorURL;
	}

	public void setTerminusTaCollectorURL(String terminusTaCollectorURL) {
		this.terminusTaCollectorURL = terminusTaCollectorURL;
	}

	public boolean isTerminusTaEnable() {
		return terminusTaEnable;
	}

	public void setTerminusTaEnable(boolean terminusTaEnable) {
		this.terminusTaEnable = terminusTaEnable;
	}

	public String getTerminusTaURL() {
		return terminusTaURL;
	}

	public void setTerminusTaURL(String terminusTaURL) {
		this.terminusTaURL = terminusTaURL;
	}

	public String getTerminusKey() {
		return terminusKey;
	}

	public void setTerminusKey(String terminusKey) {
		this.terminusKey = terminusKey;
	}
    
    
}
