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
public enum QuotePriceType implements org.f1x.api.message.types.IntEnum {
	PERCENT(1),
	PER_SHARE(2),
	FIXED_AMOUNT(3),
	DISCOUNT(4),
	PREMIUM(5),
	BASIS_POINTS_RELATIVE_TO_BENCHMARK(6),
	TED_PRICE(7),
	TED_YIELD(8),
	YIELD_SPREAD(9),
	YIELD(10);

	private final int code;

	QuotePriceType (int code) {
		this.code  = code;
	}

	public int getCode() { return code; }

	public static QuotePriceType parse(String s) {
		switch(s) {
			case "1" : return PERCENT;
			case "2" : return PER_SHARE;
			case "3" : return FIXED_AMOUNT;
			case "4" : return DISCOUNT;
			case "5" : return PREMIUM;
			case "6" : return BASIS_POINTS_RELATIVE_TO_BENCHMARK;
			case "7" : return TED_PRICE;
			case "8" : return TED_YIELD;
			case "9" : return YIELD_SPREAD;
			case "10" : return YIELD;
		}
		return null;
	}

}