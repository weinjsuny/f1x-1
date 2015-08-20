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
public enum AllocSettlInstType implements org.f1x.api.message.types.ByteEnum {
	USE_DEFAULT_INSTRUCTIONS((byte)'0'),
	DERIVE_FROM_PARAMETERS_PROVIDED((byte)'1'),
	FULL_DETAILS_PROVIDED((byte)'2'),
	SSI_DB_IDS_PROVIDED((byte)'3'),
	PHONE_FOR_INSTRUCTIONS((byte)'4');

	private final byte code;

	AllocSettlInstType (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static AllocSettlInstType parse(String s) {
		switch(s) {
			case "0" : return USE_DEFAULT_INSTRUCTIONS;
			case "1" : return DERIVE_FROM_PARAMETERS_PROVIDED;
			case "2" : return FULL_DETAILS_PROVIDED;
			case "3" : return SSI_DB_IDS_PROVIDED;
			case "4" : return PHONE_FOR_INSTRUCTIONS;
		}
		return null;
	}

}