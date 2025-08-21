package com.amazonaws.ivs.reactnative.player

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.UIManagerModule

@ReactModule(name = IVSPlayerModule.NAME)
class IVSPlayerModule(private val reactContext: ReactApplicationContext) : 
    ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String = NAME

    @ReactMethod
    fun preloadSource(viewTag: Int, id: Int, url: String) {
        val uiManager = reactContext.getNativeModule(UIManagerModule::class.java)
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag)
            if (view is IVSPlayerView) {
                view.preloadSource(id, url)
            }
        }
    }

    @ReactMethod
    fun loadSource(viewTag: Int, id: Int) {
        val uiManager = reactContext.getNativeModule(UIManagerModule::class.java)
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag)
            if (view is IVSPlayerView) {
                view.loadSource(id)
            }
        }
    }

    @ReactMethod
    fun releaseSource(viewTag: Int, id: Int) {
        val uiManager = reactContext.getNativeModule(UIManagerModule::class.java)
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag)
            if (view is IVSPlayerView) {
                view.releaseSource(id)
            }
        }
    }

    @ReactMethod
    fun play(viewTag: Int) {
        val uiManager = reactContext.getNativeModule(UIManagerModule::class.java)
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag)
            if (view is IVSPlayerView) {
                view.play()
            }
        }
    }

    @ReactMethod
    fun pause(viewTag: Int) {
        val uiManager = reactContext.getNativeModule(UIManagerModule::class.java)
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag)
            if (view is IVSPlayerView) {
                view.pause()
            }
        }
    }

    @ReactMethod
    fun seekTo(viewTag: Int, position: Double) {
        val uiManager = reactContext.getNativeModule(UIManagerModule::class.java)
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag)
            if (view is IVSPlayerView) {
                view.seekTo(position.toLong())
            }
        }
    }

    @ReactMethod
    fun setOrigin(viewTag: Int, origin: String) {
        val uiManager = reactContext.getNativeModule(UIManagerModule::class.java)
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag)
            if (view is IVSPlayerView) {
                view.setOrigin(origin)
            }
        }
    }

    @ReactMethod
    fun togglePip(viewTag: Int) {
        val uiManager = reactContext.getNativeModule(UIManagerModule::class.java)
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag)
            if (view is IVSPlayerView) {
                view.togglePip()
            }
        }
    }

    companion object {
        const val NAME = "IVSPlayerModule"
    }
}