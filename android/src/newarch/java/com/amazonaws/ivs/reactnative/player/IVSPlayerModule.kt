package com.amazonaws.ivs.reactnative.player

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.UIManagerHelper

@ReactModule(name = IVSPlayerModule.NAME)
class IVSPlayerModule(private val reactContext: ReactApplicationContext) : 
    NativeIVSPlayerSpec(reactContext) {

    override fun getName(): String = NAME

    @ReactMethod
    override fun preloadSource(viewTag: Double, id: Double, url: String) {
        val uiManager = UIManagerHelper.getUIManagerForReactTag(reactContext, viewTag.toInt())
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag.toInt())
            if (view is IVSPlayerView) {
                view.preloadSource(id.toInt(), url)
            }
        }
    }

    @ReactMethod
    override fun loadSource(viewTag: Double, id: Double) {
        val uiManager = UIManagerHelper.getUIManagerForReactTag(reactContext, viewTag.toInt())
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag.toInt())
            if (view is IVSPlayerView) {
                view.loadSource(id.toInt())
            }
        }
    }

    @ReactMethod
    override fun releaseSource(viewTag: Double, id: Double) {
        val uiManager = UIManagerHelper.getUIManagerForReactTag(reactContext, viewTag.toInt())
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag.toInt())
            if (view is IVSPlayerView) {
                view.releaseSource(id.toInt())
            }
        }
    }

    @ReactMethod
    override fun play(viewTag: Double) {
        val uiManager = UIManagerHelper.getUIManagerForReactTag(reactContext, viewTag.toInt())
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag.toInt())
            if (view is IVSPlayerView) {
                view.play()
            }
        }
    }

    @ReactMethod
    override fun pause(viewTag: Double) {
        val uiManager = UIManagerHelper.getUIManagerForReactTag(reactContext, viewTag.toInt())
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag.toInt())
            if (view is IVSPlayerView) {
                view.pause()
            }
        }
    }

    @ReactMethod
    override fun seekTo(viewTag: Double, position: Double) {
        val uiManager = UIManagerHelper.getUIManagerForReactTag(reactContext, viewTag.toInt())
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag.toInt())
            if (view is IVSPlayerView) {
                view.seekTo(position.toLong())
            }
        }
    }

    @ReactMethod
    override fun setOrigin(viewTag: Double, origin: String) {
        val uiManager = UIManagerHelper.getUIManagerForReactTag(reactContext, viewTag.toInt())
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag.toInt())
            if (view is IVSPlayerView) {
                view.setOrigin(origin)
            }
        }
    }

    @ReactMethod
    override fun togglePip(viewTag: Double) {
        val uiManager = UIManagerHelper.getUIManagerForReactTag(reactContext, viewTag.toInt())
        uiManager?.addUIBlock { nativeViewHierarchyManager ->
            val view = nativeViewHierarchyManager.resolveView(viewTag.toInt())
            if (view is IVSPlayerView) {
                view.togglePip()
            }
        }
    }

    companion object {
        const val NAME = "IVSPlayerModule"
    }
}