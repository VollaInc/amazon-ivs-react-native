#import <React/RCTBridgeModule.h>

#ifdef RCT_NEW_ARCH_ENABLED
#import "IVSPlayerSpec.h"

@interface IVSPlayerModule : NSObject <NativeIVSPlayerSpec>
#else
@interface IVSPlayerModule : NSObject <RCTBridgeModule>
#endif

@end