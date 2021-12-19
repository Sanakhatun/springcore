package com.springcore.ci;

public class Certificate {

	public String certId;

	public String name;

	public Certificate(String certId, String name) {
		super();
		this.certId = certId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certificate [certId=" + certId + ", name=" + name + "]";
	}

}
