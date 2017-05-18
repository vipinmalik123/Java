package org.vipinmalik.misc;

import javax.json.*;

public class JsonBuilderTest {
	public static void main (String[] args) {
		JsonArrayBuilder referralDataArr = Json.createArrayBuilder();
		
		for (int i = 0; i < 3; i++) {
			referralDataArr.add(Json.createObjectBuilder()
					.add("BOOKING_REQUEST_LAST_UPDATE", "February, 20 2017 15:57:54")
					.add("BOOKED_PROVIDER_NAME", "")
					.add("BOOKED_PROVIDER_ADDRESS2", "")
					.add("BOOKED_PROVIDER_FACILITY_ID", "")
					.add("BOOKED_PROVIDER_ADDRESS1", 0)
					.add("REFERRALS_ACCEPTED", 0)
					.add("DISCHARGE_ID", 49272744));
		}
		
		JsonObjectBuilder builder = Json.createObjectBuilder();
		builder.add("RefferralData", referralDataArr);
		JsonObject jsonO = builder.build();
		
		System.out.println(jsonO);
		
		JsonObjectBuilder patientJsonBuilder = Json.createObjectBuilder();
		patientJsonBuilder.add("mrn", Json.createObjectBuilder()
										.add("display", "z201611111446")
										.add("value", "z201611111446"));
		System.out.println(patientJsonBuilder.build());
	}

}
