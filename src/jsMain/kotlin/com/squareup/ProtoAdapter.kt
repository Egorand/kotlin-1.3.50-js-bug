package com.squareup

actual abstract class ProtoAdapter<T> {
  actual abstract fun decode(): T
  actual companion object {
    actual val BOOL: ProtoAdapter<Boolean> = COMMON_BOOL
  }
}
