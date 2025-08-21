import type { TurboModule } from 'react-native';
import type { Double, Int32 } from 'react-native/Libraries/Types/CodegenTypes';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  preloadSource(viewTag: Int32, id: Int32, url: string): void;
  loadSource(viewTag: Int32, id: Int32): void;
  releaseSource(viewTag: Int32, id: Int32): void;
  play(viewTag: Int32): void;
  pause(viewTag: Int32): void;
  seekTo(viewTag: Int32, position: Double): void;
  setOrigin(viewTag: Int32, origin: string): void;
  togglePip(viewTag: Int32): void;
}

export default TurboModuleRegistry.getEnforcing<Spec>('IVSPlayerModule');
