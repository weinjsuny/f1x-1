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
public enum CollInquiryQualifier implements org.f1x.api.message.types.ByteEnum {
	TRADEDATE((byte)'0'),
	GC_INSTRUMENT((byte)'1'),
	COLLATERALINSTRUMENT((byte)'2'),
	SUBSTITUTION_ELIGIBLE((byte)'3'),
	NOT_ASSIGNED((byte)'4'),
	PARTIALLY_ASSIGNED((byte)'5'),
	FULLY_ASSIGNED((byte)'6'),
	OUTSTANDING_TRADES((byte)'7');

	private final byte code;

	CollInquiryQualifier (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static CollInquiryQualifier parse(String s) {
		switch(s) {
			case "0" : return TRADEDATE;
			case "1" : return GC_INSTRUMENT;
			case "2" : return COLLATERALINSTRUMENT;
			case "3" : return SUBSTITUTION_ELIGIBLE;
			case "4" : return NOT_ASSIGNED;
			case "5" : return PARTIALLY_ASSIGNED;
			case "6" : return FULLY_ASSIGNED;
			case "7" : return OUTSTANDING_TRADES;
		}
		return null;
	}

}