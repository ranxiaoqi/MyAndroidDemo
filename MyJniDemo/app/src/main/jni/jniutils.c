#include "my_example_myjnidemo_JniUtils.h"
/*
 * Class:     my_example_myjnidemo_JniUtils
 * Method:    getTestString
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_my_example_myjnidemo_JniUtils_getTestString
  (JNIEnv *env, jobject obj){
     return (*env)->NewStringUTF(env,"This just a test for Android Studio NDK JNI developer!");
  }