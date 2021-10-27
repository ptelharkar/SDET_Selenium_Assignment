package RestAssurePackage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResToken {
	@JsonProperty
	String success;
	@JsonProperty
	String[] error;
	@JsonProperty
	Data data;
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String[] getError() {
		return error;
	}
	public void setError(String[] error) {
		this.error = error;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
		

}
