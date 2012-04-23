/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class TinyConsole */

#ifndef _Included_TinyConsole
#define _Included_TinyConsole
#ifdef __cplusplus
extern "C" {
#endif
#undef TinyConsole_MENU
#define TinyConsole_MENU 0L
#undef TinyConsole_START
#define TinyConsole_START 100L
#undef TinyConsole_STARTPROS
#define TinyConsole_STARTPROS 101L
#undef TinyConsole_SLEEP
#define TinyConsole_SLEEP 200L
#undef TinyConsole_SLEEPPROS
#define TinyConsole_SLEEPPROS 201L
#undef TinyConsole_WAKE
#define TinyConsole_WAKE 300L
#undef TinyConsole_WAKEPROS
#define TinyConsole_WAKEPROS 301L
/*
 * Class:     TinyConsole
 * Method:    convertBytes
 * Signature: (BBBBBBBB)D
 */
JNIEXPORT jdouble JNICALL Java_TinyConsole_convertBytes
  (JNIEnv *, jobject, jbyte, jbyte, jbyte, jbyte, jbyte, jbyte, jbyte, jbyte);

/*
 * Class:     TinyConsole
 * Method:    convertDouble
 * Signature: (F[B)V
 */
JNIEXPORT void JNICALL Java_TinyConsole_convertDouble
  (JNIEnv *, jobject, jfloat, jbyteArray);

#ifdef __cplusplus
}
#endif
#endif
