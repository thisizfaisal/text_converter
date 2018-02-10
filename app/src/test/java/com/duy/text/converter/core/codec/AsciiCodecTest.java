/*
 * Copyright (c) 2018 by Tran Le Duy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duy.text.converter.core.codec;

import com.duy.text.converter.core.codec.interfaces.Codec;
import com.duy.text.converter.core.codec.interfaces.CodecMethod;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Duy on 2/10/2018.
 */
public class AsciiCodecTest {
    private static final String TO_BE_ENCODE = "hello";
    private static final String TO_BE_DECODE = "104 101 108 108 111";

    @Test
    public void encode() throws Exception {
        Codec codec = CodecMethod.ASCII.getCodec();
        String result = codec.encode(TO_BE_ENCODE);
        Assert.assertEquals(result, TO_BE_DECODE);
    }

    @Test
    public void decode() throws Exception {
        Codec codec = CodecMethod.ASCII.getCodec();
        String result = codec.decode(TO_BE_DECODE);
        Assert.assertEquals(result, TO_BE_ENCODE);
    }

}