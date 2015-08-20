/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.f1x.api.message.fields;

// Generated by org.f1x.tools.DictionaryGenerator from QuickFIX dictionary
public enum ClearingFeeIndicator implements org.f1x.api.message.types.StringEnum {
	CBOE_MEMBER("B"),
	NON_MEMBER_AND_CUSTOMER("C"),
	EQUITY_MEMBER_AND_CLEARING_MEMBER("E"),
	FULL_AND_ASSOCIATE_MEMBER_TRADING_FOR_OWN_ACCOUNT_AND_AS_FLOOR_BROKERS("F"),
	FIRMS_106H_AND_106J("H"),
	GIM_IDEM_AND_COM_MEMBERSHIP_INTEREST_HOLDERS("I"),
	LESSEE_AND_106F_EMPLOYEES("L"),
	ALL_OTHER_OWNERSHIP_TYPES("M");

	private final String code;

	ClearingFeeIndicator (String code) {
		this.code  = code;
		bytes = code.getBytes();
	}

	public String getCode() { return code; }

	private final byte[] bytes;
	public byte[] getBytes() { return bytes; }


	public static ClearingFeeIndicator parse(String s) {
		switch(s) {
			case "B" : return CBOE_MEMBER;
			case "C" : return NON_MEMBER_AND_CUSTOMER;
			case "E" : return EQUITY_MEMBER_AND_CLEARING_MEMBER;
			case "F" : return FULL_AND_ASSOCIATE_MEMBER_TRADING_FOR_OWN_ACCOUNT_AND_AS_FLOOR_BROKERS;
			case "H" : return FIRMS_106H_AND_106J;
			case "I" : return GIM_IDEM_AND_COM_MEMBERSHIP_INTEREST_HOLDERS;
			case "L" : return LESSEE_AND_106F_EMPLOYEES;
			case "M" : return ALL_OTHER_OWNERSHIP_TYPES;
		}
		return null;
	}

}