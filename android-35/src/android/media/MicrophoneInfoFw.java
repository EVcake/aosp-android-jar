/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation --min_sdk_version current -pout/soong/.intermediates/system/hardware/interfaces/media/android.media.audio.common.types_interface/3/preprocessed.aidl --ninja -d out/soong/.intermediates/frameworks/av/av-types-aidl-java-source/gen/android/media/MicrophoneInfoFw.java.d -o out/soong/.intermediates/frameworks/av/av-types-aidl-java-source/gen -Nframeworks/av/aidl frameworks/av/aidl/android/media/MicrophoneInfoFw.aidl
 */
package android.media;
/** {@hide} */
public class MicrophoneInfoFw implements android.os.Parcelable
{
  public android.media.audio.common.MicrophoneInfo info;
  public android.media.audio.common.MicrophoneDynamicInfo dynamic;
  public int portId = 0;
  public static final android.os.Parcelable.Creator<MicrophoneInfoFw> CREATOR = new android.os.Parcelable.Creator<MicrophoneInfoFw>() {
    @Override
    public MicrophoneInfoFw createFromParcel(android.os.Parcel _aidl_source) {
      MicrophoneInfoFw _aidl_out = new MicrophoneInfoFw();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public MicrophoneInfoFw[] newArray(int _aidl_size) {
      return new MicrophoneInfoFw[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeTypedObject(info, _aidl_flag);
    _aidl_parcel.writeTypedObject(dynamic, _aidl_flag);
    _aidl_parcel.writeInt(portId);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      info = _aidl_parcel.readTypedObject(android.media.audio.common.MicrophoneInfo.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      dynamic = _aidl_parcel.readTypedObject(android.media.audio.common.MicrophoneDynamicInfo.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      portId = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(info);
    _mask |= describeContents(dynamic);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }
}