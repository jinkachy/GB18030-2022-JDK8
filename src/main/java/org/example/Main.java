package org.example;

import com.charset.gb18030.CharsetUtil;
import com.charset.gb18030.CustomCharsetProvider;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class Main {
    public static void main(String[] args) throws CharacterCodingException {
        Charset charset = CharsetUtil.charset("GB18030-2022");
        CharsetEncoder encoder = charset.newEncoder();
        String str = "Hello, world!什么东西";
        ByteBuffer buffer = encoder.encode(CharBuffer.wrap(str));

        CharsetDecoder decoder = charset.newDecoder();
        CharBuffer charBuffer = decoder.decode(buffer);
        String decodedStr = charBuffer.toString();
        System.out.println(decodedStr);
    }
}