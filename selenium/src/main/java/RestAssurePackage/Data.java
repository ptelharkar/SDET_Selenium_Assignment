package RestAssurePackage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
		@JsonProperty
		String access_token;
		@JsonProperty
	    int expires_in;
		@JsonProperty
	    String token_type;
		public String getAccess_token() {
			return access_token;
		}
		public void setAccess_token(String access_token) {
			this.access_token = access_token;
		}
		public int getExpires_in() {
			return expires_in;
		}
		public void setExpires_in(int expires_in) {
			this.expires_in = expires_in;
		}
		public String getToken_type() {
			return token_type;
		}
		public void setToken_type(String token_type) {
			this.token_type = token_type;
		}
		
}
