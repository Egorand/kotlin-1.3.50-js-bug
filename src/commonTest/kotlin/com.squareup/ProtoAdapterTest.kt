package com.squareup

import kotlin.test.Test
import kotlin.test.assertEquals

class ProtoAdapterTest {
  @Test fun decode() {
    assertEquals(true, ProtoAdapter.BOOL.decode())
  }
}
