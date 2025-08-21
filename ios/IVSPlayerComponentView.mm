#import "IVSPlayerComponentView.h"

#ifdef RCT_NEW_ARCH_ENABLED
#import <react/renderer/components/IVSPlayerSpec/ComponentDescriptors.h>
#import <react/renderer/components/IVSPlayerSpec/EventEmitters.h>
#import <react/renderer/components/IVSPlayerSpec/Props.h>
#import <react/renderer/components/IVSPlayerSpec/RCTComponentViewHelpers.h>

#import "RCTFabricComponentsPlugins.h"

using namespace facebook::react;

@interface IVSPlayerComponentView () <RCTIVSPlayerViewProtocol>
@end

#endif

@implementation IVSPlayerComponentView {
    UIView *_view;
}

+ (ComponentDescriptorProvider)componentDescriptorProvider
{
    return concreteComponentDescriptorProvider<IVSPlayerComponentDescriptor>();
}

- (instancetype)initWithFrame:(CGRect)frame
{
    if (self = [super initWithFrame:frame]) {
        static const auto defaultProps = std::make_shared<const IVSPlayerProps>();
        _props = defaultProps;
        
        _view = [[UIView alloc] init];
        _view.backgroundColor = [UIColor blackColor];
        
        self.contentView = _view;
    }
    
    return self;
}

#ifdef RCT_NEW_ARCH_ENABLED
- (void)updateProps:(Props::Shared const &)props oldProps:(Props::Shared const &)oldProps
{
    const auto &oldViewProps = *std::static_pointer_cast<IVSPlayerProps const>(_props);
    const auto &newViewProps = *std::static_pointer_cast<IVSPlayerProps const>(props);
    
    if (oldViewProps.muted != newViewProps.muted) {
        // Update muted state
    }
    
    if (oldViewProps.loop != newViewProps.loop) {
        // Update loop state
    }
    
    if (oldViewProps.streamUrl != newViewProps.streamUrl) {
        // Update stream URL
    }
    
    if (oldViewProps.volume != newViewProps.volume) {
        // Update volume
    }
    
    if (oldViewProps.playbackRate != newViewProps.playbackRate) {
        // Update playback rate
    }
    
    [super updateProps:props oldProps:oldProps];
}

- (void)preloadSource:(double)viewTag id:(double)sourceId url:(NSString *)url
{
    // Implement preload source
}

- (void)loadSource:(double)viewTag id:(double)sourceId
{
    // Implement load source
}

- (void)releaseSource:(double)viewTag id:(double)sourceId
{
    // Implement release source
}

- (void)play:(double)viewTag
{
    // Implement play
}

- (void)pause:(double)viewTag
{
    // Implement pause
}

- (void)seekTo:(double)viewTag position:(double)position
{
    // Implement seek
}

- (void)setOrigin:(double)viewTag origin:(NSString *)origin
{
    // Implement set origin
}

- (void)togglePip:(double)viewTag
{
    // Implement toggle PiP
}

Class<RCTComponentViewProtocol> IVSPlayerCls(void)
{
    return IVSPlayerComponentView.class;
}

#endif

@end