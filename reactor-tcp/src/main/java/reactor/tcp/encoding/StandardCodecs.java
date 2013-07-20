/*
 * Copyright (c) 2011-2013 GoPivotal, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package reactor.tcp.encoding;

/**
 * A selection of standard codecs.
 *
 * @author Jon Brisbin
 */
public abstract class StandardCodecs {

	private StandardCodecs() {
	}

	/**
	 * A {@link ByteArrayCodec}.
	 *
	 */
	public static final ByteArrayCodec                 BYTE_ARRAY_CODEC = new ByteArrayCodec();

	/**
	 * A {@link StringCodec}.
	 */
	public static final StringCodec                    STRING_CODEC     = new StringCodec();

	/**
	 * A {@link DelimitedCodec} that works with {@code String} data delimited by a line-feed
	 * ({@code '\n'}) character
	 */
	public static final DelimitedCodec<String, String> LINE_FEED_CODEC  = new DelimitedCodec<String, String>(STRING_CODEC);
}