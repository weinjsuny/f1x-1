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
public enum ConfirmType implements org.f1x.api.message.types.ByteEnum {
	STATUS((byte)'1'),
	CONFIRMATION((byte)'2'),
	CONFIRMATION_REQUEST_REJECTED((byte)'3');

	private final byte code;

	ConfirmType (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static ConfirmType parse(String s) {
		switch(s) {
			case "1" : return STATUS;
			case "2" : return CONFIRMATION;
			case "3" : return CONFIRMATION_REQUEST_REJECTED;
		}
		return null;
	}

}