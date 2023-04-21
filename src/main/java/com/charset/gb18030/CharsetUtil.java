package com.charset.gb18030;
import java.nio.charset.Charset;

public class CharsetUtil {

  public static CustomCharsetProvider provider = new CustomCharsetProvider();

  public static boolean ifCustomCharset(String charset) {
    return CustomCharsetProvider.GB_18030_2022.equals(charset);
  }

  public static Charset charset(String charsetName){
    try {
      if (ifCustomCharset(charsetName)) {
        return provider.charsetForName(charsetName);
      }else {
        return Charset.forName(charsetName);
      }
    } catch (Exception e){
      throw new IllegalArgumentException("Illegal charset name: " + charsetName, e);
    }
  }
}
