package com.charset.gb18030;

import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomCharsetProvider extends CharsetProvider {

  public static final String GB_18030_2022 = "GB18030-2022";

  @Override
  public Iterator<Charset> charsets() {
    List<Charset> result = new ArrayList<>(Collections.singletonList(new GB18030()));
    return result.iterator();
  }

  @Override
  public Charset charsetForName(String cs) {
    if (GB_18030_2022.equalsIgnoreCase(cs)) {
      return new GB18030();
    }
    throw new RuntimeException("custom charset do not support " + cs);
  }


}
