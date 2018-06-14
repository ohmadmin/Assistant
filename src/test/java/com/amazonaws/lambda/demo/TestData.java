package com.amazonaws.lambda.demo;

public class TestData {

	public static String getRequestContent() {
		return "{\n" + 
				"	\"version\": \"1.0\",\n" + 
				"	\"session\": {\n" + 
				"		\"new\": true,\n" + 
				"		\"sessionId\": \"amzn1.echo-api.session.44907412-db59-4850-b806-bc45be7df83a\",\n" + 
				"		\"application\": {\n" + 
				"			\"applicationId\": \"amzn1.ask.skill.9392c12d-2ec7-4ddd-8788-392ec280c3fa\"\n" + 
				"		},\n" + 
				"		\"user\": {\n" + 
				"			\"userId\": \"amzn1.ask.account.AGPDZ4Y5WT7BX5OPTVGZTPJFNQJQVKTIR3F3AA4BCJEP7AUV3QVDBLUDE7E73WG6TEJSH2IJQGB2POZJRDYKHYSWUFG4RW5BS5JYDRQ37D6O4XMEZ3ECKMIMVYNXMYVOOMO6FF3IGVWOWZJXGPWWWUTJPBEM2SCVZBOHPL5RBRCYXYEVRYGSVL3MDSQMEP4LA2GGEZGVCVWL2ZA\"\n" + 
				"		}\n" + 
				"	},\n" + 
				"	\"context\": {\n" + 
				"		\"AudioPlayer\": {\n" + 
				"			\"playerActivity\": \"IDLE\"\n" + 
				"		},\n" + 
				"		\"Display\": {},\n" + 
				"		\"System\": {\n" + 
				"			\"application\": {\n" + 
				"				\"applicationId\": \"amzn1.ask.skill.9392c12d-2ec7-4ddd-8788-392ec280c3fa\"\n" + 
				"			},\n" + 
				"			\"user\": {\n" + 
				"				\"userId\": \"amzn1.ask.account.AGPDZ4Y5WT7BX5OPTVGZTPJFNQJQVKTIR3F3AA4BCJEP7AUV3QVDBLUDE7E73WG6TEJSH2IJQGB2POZJRDYKHYSWUFG4RW5BS5JYDRQ37D6O4XMEZ3ECKMIMVYNXMYVOOMO6FF3IGVWOWZJXGPWWWUTJPBEM2SCVZBOHPL5RBRCYXYEVRYGSVL3MDSQMEP4LA2GGEZGVCVWL2ZA\"\n" + 
				"			},\n" + 
				"			\"device\": {\n" + 
				"				\"deviceId\": \"amzn1.ask.device.AFWXJZXA27QS45OAFQYYMUS6OL3PJVES4IAH3T632RYFD6DVMS27UAJCLYUNYVQXD73VNKTBHNTM3H443LNSQV4NOOEQF3NO4H3YNVICTMJ7Q6GJN6WAT6UPS7UXFZONNEG3FNKA5LHHIEWMCNZ2KRMPZ7K5JWWEQLPGQZWH6XU5LL4CS2AFS\",\n" + 
				"				\"supportedInterfaces\": {\n" + 
				"					\"AudioPlayer\": {},\n" + 
				"					\"Display\": {\n" + 
				"						\"templateVersion\": \"1.0\",\n" + 
				"						\"markupVersion\": \"1.0\"\n" + 
				"					}\n" + 
				"				}\n" + 
				"			},\n" + 
				"			\"apiEndpoint\": \"https://api.amazonalexa.com\",\n" + 
				"			\"apiAccessToken\": \"eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IjEifQ.eyJhdWQiOiJodHRwczovL2FwaS5hbWF6b25hbGV4YS5jb20iLCJpc3MiOiJBbGV4YVNraWxsS2l0Iiwic3ViIjoiYW16bjEuYXNrLnNraWxsLjkzOTJjMTJkLTJlYzctNGRkZC04Nzg4LTM5MmVjMjgwYzNmYSIsImV4cCI6MTUyODkyMzcyNSwiaWF0IjoxNTI4OTIwMTI1LCJuYmYiOjE1Mjg5MjAxMjUsInByaXZhdGVDbGFpbXMiOnsiY29uc2VudFRva2VuIjpudWxsLCJkZXZpY2VJZCI6ImFtem4xLmFzay5kZXZpY2UuQUZXWEpaWEEyN1FTNDVPQUZRWVlNVVM2T0wzUEpWRVM0SUFIM1Q2MzJSWUZENkRWTVMyN1VBSkNMWVVOWVZRWEQ3M1ZOS1RCSE5UTTNINDQzTE5TUVY0Tk9PRVFGM05PNEgzWU5WSUNUTUo3UTZHSk42V0FUNlVQUzdVWEZaT05ORUczRk5LQTVMSEhJRVdNQ05aMktSTVBaN0s1SldXRVFMUEdRWldINlhVNUxMNENTMkFGUyIsInVzZXJJZCI6ImFtem4xLmFzay5hY2NvdW50LkFHUERaNFk1V1Q3Qlg1T1BUVkdaVFBKRk5RSlFWS1RJUjNGM0FBNEJDSkVQN0FVVjNRVkRCTFVERTdFNzNXRzZURUpTSDJJSlFHQjJQT1pKUkRZS0hZU1dVRkc0Ulc1QlM1SllEUlEzN0Q2TzRYTUVaM0VDS01JTVZZTlhNWVZPT01PNkZGM0lHVldPV1pKWEdQV1dXVVRKUEJFTTJTQ1ZaQk9IUEw1UkJSQ1lYWUVWUllHU1ZMM01EU1FNRVA0TEEyR0dFWkdWQ1ZXTDJaQSJ9fQ.dXWh1oRcS9rHQMzpo2zmbRGFHYdK9e-OSiCi6m_xhlYtAIsx0WqB_kLa8mTHw7WbhhIaW6FlH53ytMifdXJlvK1tzs7GLNOr_UU8m32refAa6O7l4dKzLM6u4mc2LeFJcTJ8Yc_A0WvwLTV9RTJ0l9UIEp0wPIdMR60cs7j1zB5DlPSh7WrpZ2fVq2pW1CWlSJJMBguIQvliV5_i6KJ4JB8_sGcR0nCfdZXJUV90gIPHuGSPaF247lkYsO_0YURw5ZhbyARFCcQyEYRU-8xoqXTGpSWmy4C7C8hcPL_m6btGFZNHTw_xFcroi0EqeBHRki41fsnkGyUiZRwGAoiPCg\"\n" + 
				"		}\n" + 
				"	},\n" + 
				"	\"request\": {\n" + 
				"		\"type\": \"LaunchRequest\",\n" + 
				"		\"requestId\": \"amzn1.echo-api.request.35d4a4e5-434c-4757-8ee0-e8dabedba097\",\n" + 
				"		\"timestamp\": \"2018-06-13T20:02:05Z\",\n" + 
				"		\"locale\": \"en-US\",\n" + 
				"		\"shouldLinkResultBeReturned\": false\n" + 
				"	}\n" + 
				"}";
	}
	
}
