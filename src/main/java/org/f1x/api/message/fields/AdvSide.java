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
public enum AdvSide implements org.f1x.api.message.types.ByteEnum {
	BUY((byte)'B'),
	SELL((byte)'S'),
	CROSS((byte)'X'),
	TRADE((byte)'T');

	private final byte code;

	AdvSide (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static AdvSide parse(String s) {
		switch(s) {
			case "B" : return BUY;
			case "S" : return SELL;
			case "X" : return CROSS;
			case "T" : return TRADE;
		}
		return null;
	}

}