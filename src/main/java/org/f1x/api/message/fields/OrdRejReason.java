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
public enum OrdRejReason implements org.f1x.api.message.types.IntEnum {
	BROKER_EXCHANGE_OPTION(0),
	UNKNOWN_SYMBOL(1),
	EXCHANGE_CLOSED(2),
	ORDER_EXCEEDS_LIMIT(3),
	TOO_LATE_TO_ENTER(4),
	UNKNOWN_ORDER(5),
	DUPLICATE_ORDER(6),
	DUPLICATE_OF_A_VERBALLY_COMMUNICATED_ORDER(7),
	STALE_ORDER(8),
	TRADE_ALONG_REQUIRED(9),
	INVALID_INVESTOR_ID(10),
	UNSUPPORTED_ORDER_CHARACTERISTIC(11),
	SURVEILLENCE_OPTION(12),
	INCORRECT_QUANTITY(13),
	INCORRECT_ALLOCATED_QUANTITY(14),
	UNKNOWN_ACCOUNT(15),
	OTHER(99);

	private final int code;

	OrdRejReason (int code) {
		this.code  = code;
	}

	public int getCode() { return code; }

	public static OrdRejReason parse(String s) {
		switch(s) {
			case "0" : return BROKER_EXCHANGE_OPTION;
			case "1" : return UNKNOWN_SYMBOL;
			case "2" : return EXCHANGE_CLOSED;
			case "3" : return ORDER_EXCEEDS_LIMIT;
			case "4" : return TOO_LATE_TO_ENTER;
			case "5" : return UNKNOWN_ORDER;
			case "6" : return DUPLICATE_ORDER;
			case "7" : return DUPLICATE_OF_A_VERBALLY_COMMUNICATED_ORDER;
			case "8" : return STALE_ORDER;
			case "9" : return TRADE_ALONG_REQUIRED;
			case "10" : return INVALID_INVESTOR_ID;
			case "11" : return UNSUPPORTED_ORDER_CHARACTERISTIC;
			case "12" : return SURVEILLENCE_OPTION;
			case "13" : return INCORRECT_QUANTITY;
			case "14" : return INCORRECT_ALLOCATED_QUANTITY;
			case "15" : return UNKNOWN_ACCOUNT;
			case "99" : return OTHER;
		}
		return null;
	}

}