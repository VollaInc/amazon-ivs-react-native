import type { HostComponent, ViewProps } from 'react-native';
import type { DirectEventHandler, Double, Int32 } from 'react-native/Libraries/Types/CodegenTypes';
import codegenNativeComponent from 'react-native/Libraries/Utilities/codegenNativeComponent';

export interface NativeProps extends ViewProps {
  resizeMode?: string;
  muted?: boolean;
  loop?: boolean;
  liveLowLatency?: boolean;
  rebufferToLive?: boolean;
  quality?: Readonly<{
    name?: string;
    codecs?: string;
    bitrate?: Int32;
    framerate?: Double;
    width?: Int32;
    height?: Int32;
  }>;
  initialBufferDuration?: Double;
  autoMaxQuality?: Readonly<{
    name?: string;
    codecs?: string;
    bitrate?: Int32;
    framerate?: Double;
    width?: Int32;
    height?: Int32;
  }>;
  autoQualityMode?: boolean;
  pipEnabled?: boolean;
  playbackRate?: Double;
  logLevel?: Int32;
  progressInterval?: Int32;
  volume?: Double;
  breakpoints?: ReadonlyArray<Double>;
  streamUrl?: string;
  maxBitrate?: Int32;
  
  // Events
  onSeek?: DirectEventHandler<Readonly<{ position: Double }>>;
  onData?: DirectEventHandler<Readonly<{ 
    qualities?: string;
    version?: string;
    sessionId?: string;
  }>>;
  onVideoStatistics?: DirectEventHandler<Readonly<{
    duration?: Double;
    framesDecoded?: Int32;
    framesDropped?: Int32;
    bitrate?: Double;
  }>>;
  onPlayerStateChange?: DirectEventHandler<Readonly<{ state: string }>>;
  onDurationChange?: DirectEventHandler<Readonly<{ duration?: Double }>>;
  onQualityChange?: DirectEventHandler<Readonly<{
    name?: string;
    codecs?: string;
    bitrate?: Int32;
    framerate?: Double;
    width?: Int32;
    height?: Int32;
  }>>;
  onPipChange?: DirectEventHandler<Readonly<{ active: boolean }>>;
  onRebuffering?: DirectEventHandler<Readonly<{}>>;
  onLoadStart?: DirectEventHandler<Readonly<{}>>;
  onLoad?: DirectEventHandler<Readonly<{ duration?: Double }>>;
  onLiveLatencyChange?: DirectEventHandler<Readonly<{ liveLatency: Double }>>;
  onTextCue?: DirectEventHandler<Readonly<{
    type?: string;
    line?: Int32;
    size?: Int32;
    position?: Int32;
    text?: string;
    textAlign?: string;
  }>>;
  onTextMetadataCue?: DirectEventHandler<Readonly<{
    type?: string;
    text?: string;
    textDescription?: string;
  }>>;
  onProgress?: DirectEventHandler<Readonly<{ position: Double }>>;
  onError?: DirectEventHandler<Readonly<{ error: string }>>;
  onTimePoint?: DirectEventHandler<Readonly<{ position: Double }>>;
}

export default codegenNativeComponent<NativeProps>('IVSPlayer');