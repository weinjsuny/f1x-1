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
public enum GTBookingInst implements org.f1x.api.message.types.ByteEnum {
	BOOK_OUT_ALL_TRADES_ON_DAY_OF_EXECUTION((byte)'0'),
	ACCUMULATE_EXECUTIONS_UNTIL_ORDER_IS_FILLED_OR_EXPIRES((byte)'1'),
	ACCUMULATE_UNTIL_VERBALLY_NOTIFIED_OTHERWISE((byte)'2');

	private final byte code;

	GTBookingInst (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static GTBookingInst parse(String s) {
		switch(s) {
			case "0" : return BOOK_OUT_ALL_TRADES_ON_DAY_OF_EXECUTION;
			case "1" : return ACCUMULATE_EXECUTIONS_UNTIL_ORDER_IS_FILLED_OR_EXPIRES;
			case "2" : return ACCUMULATE_UNTIL_VERBALLY_NOTIFIED_OTHERWISE;
		}
		return null;
	}

}