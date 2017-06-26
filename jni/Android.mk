LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := SoVideo
LOCAL_SRC_FILES := SoVideo.cpp

include $(BUILD_SHARED_LIBRARY)
