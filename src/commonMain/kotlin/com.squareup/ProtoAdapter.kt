package com.squareup

expect abstract class ProtoAdapter<T>() {
  abstract fun decode(): T
  companion object {
    val BOOL: ProtoAdapter<Boolean>
  }
}

val COMMON_BOOL: ProtoAdapter<Boolean> = object : ProtoAdapter<Boolean>() {
  override fun decode(): Boolean = true
}
