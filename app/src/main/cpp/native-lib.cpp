#include <jni.h>
#include <string>

extern "C"
jstring
Java_com_example_michaelryan_hellodroid_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {

    return env->NewStringUTF("Welcome to GO Spray");
}
