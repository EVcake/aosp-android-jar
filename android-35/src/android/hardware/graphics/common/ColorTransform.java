/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java --structured --version 3 --hash 37aa15ac89ae27f3f89099d79609f5aaa1717de5 -t --stability vintf --min_sdk_version platform_apis -pout/soong/.intermediates/hardware/interfaces/common/aidl/android.hardware.common_interface/2/preprocessed.aidl --ninja -d out/soong/.intermediates/hardware/interfaces/graphics/common/aidl/android.hardware.graphics.common-V3-java-source/gen/android/hardware/graphics/common/ColorTransform.java.d -o out/soong/.intermediates/hardware/interfaces/graphics/common/aidl/android.hardware.graphics.common-V3-java-source/gen -Nhardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3/android/hardware/graphics/common/ColorTransform.aidl
 */
package android.hardware.graphics.common;
/** @hide */
public @interface ColorTransform {
  public static final int IDENTITY = 0;
  public static final int ARBITRARY_MATRIX = 1;
  public static final int VALUE_INVERSE = 2;
  public static final int GRAYSCALE = 3;
  public static final int CORRECT_PROTANOPIA = 4;
  public static final int CORRECT_DEUTERANOPIA = 5;
  public static final int CORRECT_TRITANOPIA = 6;
}