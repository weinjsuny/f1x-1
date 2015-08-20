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
public enum QuoteStatus implements org.f1x.api.message.types.IntEnum {
	ACCEPTED(0),
	CANCELED_FOR_SYMBOL(1),
	CANCELED_FOR_SECURITY_TYPE(2),
	CANCELED_FOR_UNDERLYING(3),
	CANCELED_ALL(4),
	REJECTED(5),
	REMOVED_FROM_MARKET(6),
	EXPIRED(7),
	QUERY(8),
	QUOTE_NOT_FOUND(9),
	PENDING(10),
	PASS(11),
	LOCKED_MARKET_WARNING(12),
	CROSS_MARKET_WARNING(13),
	CANCELED_DUE_TO_LOCK_MARKET(14),
	CANCELED_DUE_TO_CROSS_MARKET(15);

	private final int code;

	QuoteStatus (int code) {
		this.code  = code;
	}

	public int getCode() { return code; }

	public static QuoteStatus parse(String s) {
		switch(s) {
			case "0" : return ACCEPTED;
			case "1" : return CANCELED_FOR_SYMBOL;
			case "2" : return CANCELED_FOR_SECURITY_TYPE;
			case "3" : return CANCELED_FOR_UNDERLYING;
			case "4" : return CANCELED_ALL;
			case "5" : return REJECTED;
			case "6" : return REMOVED_FROM_MARKET;
			case "7" : return EXPIRED;
			case "8" : return QUERY;
			case "9" : return QUOTE_NOT_FOUND;
			case "10" : return PENDING;
			case "11" : return PASS;
			case "12" : return LOCKED_MARKET_WARNING;
			case "13" : return CROSS_MARKET_WARNING;
			case "14" : return CANCELED_DUE_TO_LOCK_MARKET;
			case "15" : return CANCELED_DUE_TO_CROSS_MARKET;
		}
		return null;
	}

}