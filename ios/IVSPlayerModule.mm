#import "IVSPlayerModule.h"
#import <React/RCTBridge.h>
#import <React/RCTUIManager.h>

@implementation IVSPlayerModule

RCT_EXPORT_MODULE()

- (void)preloadSource:(double)viewTag id:(double)sourceId url:(NSString *)url
{
    [self.bridge.uiManager addUIBlock:^(RCTUIManager *uiManager, NSDictionary<NSNumber *, UIView *> *viewRegistry) {
        UIView *view = viewRegistry[@(viewTag)];
        if (view && [view respondsToSelector:@selector(preloadSource:id:url:)]) {
            [(id)view preloadSource:viewTag id:sourceId url:url];
        }
    }];
}

- (void)loadSource:(double)viewTag id:(double)sourceId
{
    [self.bridge.uiManager addUIBlock:^(RCTUIManager *uiManager, NSDictionary<NSNumber *, UIView *> *viewRegistry) {
        UIView *view = viewRegistry[@(viewTag)];
        if (view && [view respondsToSelector:@selector(loadSource:id:)]) {
            [(id)view loadSource:viewTag id:sourceId];
        }
    }];
}

- (void)releaseSource:(double)viewTag id:(double)sourceId
{
    [self.bridge.uiManager addUIBlock:^(RCTUIManager *uiManager, NSDictionary<NSNumber *, UIView *> *viewRegistry) {
        UIView *view = viewRegistry[@(viewTag)];
        if (view && [view respondsToSelector:@selector(releaseSource:id:)]) {
            [(id)view releaseSource:viewTag id:sourceId];
        }
    }];
}

- (void)play:(double)viewTag
{
    [self.bridge.uiManager addUIBlock:^(RCTUIManager *uiManager, NSDictionary<NSNumber *, UIView *> *viewRegistry) {
        UIView *view = viewRegistry[@(viewTag)];
        if (view && [view respondsToSelector:@selector(play:)]) {
            [(id)view play:viewTag];
        }
    }];
}

- (void)pause:(double)viewTag
{
    [self.bridge.uiManager addUIBlock:^(RCTUIManager *uiManager, NSDictionary<NSNumber *, UIView *> *viewRegistry) {
        UIView *view = viewRegistry[@(viewTag)];
        if (view && [view respondsToSelector:@selector(pause:)]) {
            [(id)view pause:viewTag];
        }
    }];
}

- (void)seekTo:(double)viewTag position:(double)position
{
    [self.bridge.uiManager addUIBlock:^(RCTUIManager *uiManager, NSDictionary<NSNumber *, UIView *> *viewRegistry) {
        UIView *view = viewRegistry[@(viewTag)];
        if (view && [view respondsToSelector:@selector(seekTo:position:)]) {
            [(id)view seekTo:viewTag position:position];
        }
    }];
}

- (void)setOrigin:(double)viewTag origin:(NSString *)origin
{
    [self.bridge.uiManager addUIBlock:^(RCTUIManager *uiManager, NSDictionary<NSNumber *, UIView *> *viewRegistry) {
        UIView *view = viewRegistry[@(viewTag)];
        if (view && [view respondsToSelector:@selector(setOrigin:origin:)]) {
            [(id)view setOrigin:viewTag origin:origin];
        }
    }];
}

- (void)togglePip:(double)viewTag
{
    [self.bridge.uiManager addUIBlock:^(RCTUIManager *uiManager, NSDictionary<NSNumber *, UIView *> *viewRegistry) {
        UIView *view = viewRegistry[@(viewTag)];
        if (view && [view respondsToSelector:@selector(togglePip:)]) {
            [(id)view togglePip:viewTag];
        }
    }];
}

#ifdef RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeIVSPlayerSpecJSI>(params);
}
#endif

@end