module.exports = {
  dependency: {
    platforms: {
      android: {
        componentDescriptors: ['IVSPlayerComponentDescriptor'],
        cmakeListsPath: '../android/build/generated/source/codegen/jni/CMakeLists.txt',
      },
    },
  },
};