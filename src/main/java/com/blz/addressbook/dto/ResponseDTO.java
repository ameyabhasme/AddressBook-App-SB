package com.blz.addressbook.dto;

public class ResponseDTO {

	public String message;
	public Object data;

	public ResponseDTO(String message, Object data) {
		super();
		this.message = message;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public Object getData() {
		return data;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
