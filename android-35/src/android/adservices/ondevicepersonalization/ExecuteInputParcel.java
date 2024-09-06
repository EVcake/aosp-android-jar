/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.adservices.ondevicepersonalization;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.os.Parcelable;

import com.android.ondevicepersonalization.internal.util.AnnotationValidations;
import com.android.ondevicepersonalization.internal.util.ByteArrayParceledSlice;
import com.android.ondevicepersonalization.internal.util.DataClass;

/**
 * Parcelable version of {@link ExecuteInput}.
 * @hide
 */
@DataClass(genAidl = false, genHiddenBuilder = true)
public final class ExecuteInputParcel implements Parcelable {
    /**
     * The package name of the calling app.
     */
    @NonNull String mAppPackageName = "";

    /**
     * Serialized app params.
     * @hide
     */
    @Nullable ByteArrayParceledSlice mSerializedAppParams = null;



    // Code below generated by codegen v1.0.23.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/packages/modules/OnDevicePersonalization/framework/java/android/adservices/ondevicepersonalization/ExecuteInputParcel.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    @DataClass.Generated.Member
    /* package-private */ ExecuteInputParcel(
            @NonNull String appPackageName,
            @Nullable ByteArrayParceledSlice serializedAppParams) {
        this.mAppPackageName = appPackageName;
        AnnotationValidations.validate(
                NonNull.class, null, mAppPackageName);
        this.mSerializedAppParams = serializedAppParams;

        // onConstructed(); // You can define this method to get a callback
    }

    /**
     * The package name of the calling app.
     */
    @DataClass.Generated.Member
    public @NonNull String getAppPackageName() {
        return mAppPackageName;
    }

    /**
     * Serialized app params.
     *
     * @hide
     */
    @DataClass.Generated.Member
    public @Nullable ByteArrayParceledSlice getSerializedAppParams() {
        return mSerializedAppParams;
    }

    @Override
    @DataClass.Generated.Member
    public void writeToParcel(@NonNull android.os.Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        byte flg = 0;
        if (mSerializedAppParams != null) flg |= 0x2;
        dest.writeByte(flg);
        dest.writeString(mAppPackageName);
        if (mSerializedAppParams != null) dest.writeTypedObject(mSerializedAppParams, flags);
    }

    @Override
    @DataClass.Generated.Member
    public int describeContents() { return 0; }

    /** @hide */
    @SuppressWarnings({"unchecked", "RedundantCast"})
    @DataClass.Generated.Member
    /* package-private */ ExecuteInputParcel(@NonNull android.os.Parcel in) {
        // You can override field unparcelling by defining methods like:
        // static FieldType unparcelFieldName(Parcel in) { ... }

        byte flg = in.readByte();
        String appPackageName = in.readString();
        ByteArrayParceledSlice serializedAppParams = (flg & 0x2) == 0 ? null : (ByteArrayParceledSlice) in.readTypedObject(ByteArrayParceledSlice.CREATOR);

        this.mAppPackageName = appPackageName;
        AnnotationValidations.validate(
                NonNull.class, null, mAppPackageName);
        this.mSerializedAppParams = serializedAppParams;

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public static final @NonNull Parcelable.Creator<ExecuteInputParcel> CREATOR
            = new Parcelable.Creator<ExecuteInputParcel>() {
        @Override
        public ExecuteInputParcel[] newArray(int size) {
            return new ExecuteInputParcel[size];
        }

        @Override
        public ExecuteInputParcel createFromParcel(@NonNull android.os.Parcel in) {
            return new ExecuteInputParcel(in);
        }
    };

    /**
     * A builder for {@link ExecuteInputParcel}
     * @hide
     */
    @SuppressWarnings("WeakerAccess")
    @DataClass.Generated.Member
    public static final class Builder {

        private @NonNull String mAppPackageName;
        private @Nullable ByteArrayParceledSlice mSerializedAppParams;

        private long mBuilderFieldsSet = 0L;

        public Builder() {
        }

        /**
         * The package name of the calling app.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setAppPackageName(@NonNull String value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x1;
            mAppPackageName = value;
            return this;
        }

        /**
         * Serialized app params.
         *
         * @hide
         */
        @DataClass.Generated.Member
        public @NonNull Builder setSerializedAppParams(@NonNull ByteArrayParceledSlice value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x2;
            mSerializedAppParams = value;
            return this;
        }

        /** Builds the instance. This builder should not be touched after calling this! */
        public @NonNull ExecuteInputParcel build() {
            checkNotUsed();
            mBuilderFieldsSet |= 0x4; // Mark builder used

            if ((mBuilderFieldsSet & 0x1) == 0) {
                mAppPackageName = "";
            }
            if ((mBuilderFieldsSet & 0x2) == 0) {
                mSerializedAppParams = null;
            }
            ExecuteInputParcel o = new ExecuteInputParcel(
                    mAppPackageName,
                    mSerializedAppParams);
            return o;
        }

        private void checkNotUsed() {
            if ((mBuilderFieldsSet & 0x4) != 0) {
                throw new IllegalStateException(
                        "This Builder should not be reused. Use a new Builder instance instead");
            }
        }
    }

    @DataClass.Generated(
            time = 1708120245903L,
            codegenVersion = "1.0.23",
            sourceFile = "packages/modules/OnDevicePersonalization/framework/java/android/adservices/ondevicepersonalization/ExecuteInputParcel.java",
            inputSignatures = " @android.annotation.NonNull java.lang.String mAppPackageName\n @android.annotation.Nullable com.android.ondevicepersonalization.internal.util.ByteArrayParceledSlice mSerializedAppParams\nclass ExecuteInputParcel extends java.lang.Object implements [android.os.Parcelable]\n@com.android.ondevicepersonalization.internal.util.DataClass(genAidl=false, genHiddenBuilder=true)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}