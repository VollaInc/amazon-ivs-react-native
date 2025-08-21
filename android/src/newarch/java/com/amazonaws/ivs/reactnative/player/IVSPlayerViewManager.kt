package com.amazonaws.ivs.reactnative.player

import android.view.View
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.IVSPlayerManagerInterface
import com.facebook.react.viewmanagers.IVSPlayerManagerDelegate

@ReactModule(name = IVSPlayerViewManager.NAME)
class IVSPlayerViewManager : SimpleViewManager<IVSPlayerView>(),
    IVSPlayerManagerInterface<IVSPlayerView> {

    private val mDelegate: ViewManagerDelegate<IVSPlayerView>

    init {
        mDelegate = IVSPlayerManagerDelegate(this)
    }

    override fun getDelegate(): ViewManagerDelegate<IVSPlayerView> = mDelegate

    override fun getName(): String = NAME

    override fun createViewInstance(context: ThemedReactContext): IVSPlayerView {
        return IVSPlayerView(context)
    }

    @ReactProp(name = "streamUrl")
    override fun setStreamUrl(view: IVSPlayerView, value: String?) {
        view.setStreamUrl(value)
    }

    @ReactProp(name = "muted")
    override fun setMuted(view: IVSPlayerView, value: Boolean) {
        view.setMuted(value)
    }

    @ReactProp(name = "loop")
    override fun setLoop(view: IVSPlayerView, value: Boolean) {
        view.setLoop(value)
    }

    @ReactProp(name = "volume")
    override fun setVolume(view: IVSPlayerView, value: Double) {
        view.setVolume(value.toFloat())
    }

    @ReactProp(name = "playbackRate")
    override fun setPlaybackRate(view: IVSPlayerView, value: Double) {
        view.setPlaybackRate(value.toFloat())
    }

    @ReactProp(name = "liveLowLatency")
    override fun setLiveLowLatency(view: IVSPlayerView, value: Boolean) {
        view.setLiveLowLatency(value)
    }

    @ReactProp(name = "rebufferToLive")
    override fun setRebufferToLive(view: IVSPlayerView, value: Boolean) {
        view.setRebufferToLive(value)
    }

    @ReactProp(name = "pipEnabled")
    override fun setPipEnabled(view: IVSPlayerView, value: Boolean) {
        view.setPipEnabled(value)
    }

    @ReactProp(name = "resizeMode")
    override fun setResizeMode(view: IVSPlayerView, value: String?) {
        view.setResizeMode(value)
    }

    @ReactProp(name = "quality")
    override fun setQuality(view: IVSPlayerView, value: ReadableMap?) {
        view.setQuality(value)
    }

    @ReactProp(name = "autoMaxQuality")
    override fun setAutoMaxQuality(view: IVSPlayerView, value: ReadableMap?) {
        view.setAutoMaxQuality(value)
    }

    @ReactProp(name = "autoQualityMode")
    override fun setAutoQualityMode(view: IVSPlayerView, value: Boolean) {
        view.setAutoQualityMode(value)
    }

    @ReactProp(name = "initialBufferDuration")
    override fun setInitialBufferDuration(view: IVSPlayerView, value: Double) {
        view.setInitialBufferDuration(value)
    }

    @ReactProp(name = "breakpoints")
    override fun setBreakpoints(view: IVSPlayerView, value: ReadableArray?) {
        view.setBreakpoints(value)
    }

    @ReactProp(name = "maxBitrate")
    override fun setMaxBitrate(view: IVSPlayerView, value: Int) {
        view.setMaxBitrate(value)
    }

    @ReactProp(name = "logLevel")
    override fun setLogLevel(view: IVSPlayerView, value: Int) {
        view.setLogLevel(value)
    }

    @ReactProp(name = "progressInterval")
    override fun setProgressInterval(view: IVSPlayerView, value: Int) {
        view.setProgressInterval(value)
    }

    override fun getExportedCustomBubblingEventTypeConstants(): Map<String, Any> {
        return mapOf(
            "onSeek" to mapOf("registrationName" to "onSeek"),
            "onData" to mapOf("registrationName" to "onData"),
            "onVideoStatistics" to mapOf("registrationName" to "onVideoStatistics"),
            "onPlayerStateChange" to mapOf("registrationName" to "onPlayerStateChange"),
            "onDurationChange" to mapOf("registrationName" to "onDurationChange"),
            "onQualityChange" to mapOf("registrationName" to "onQualityChange"),
            "onPipChange" to mapOf("registrationName" to "onPipChange"),
            "onRebuffering" to mapOf("registrationName" to "onRebuffering"),
            "onLoadStart" to mapOf("registrationName" to "onLoadStart"),
            "onLoad" to mapOf("registrationName" to "onLoad"),
            "onLiveLatencyChange" to mapOf("registrationName" to "onLiveLatencyChange"),
            "onTextCue" to mapOf("registrationName" to "onTextCue"),
            "onTextMetadataCue" to mapOf("registrationName" to "onTextMetadataCue"),
            "onProgress" to mapOf("registrationName" to "onProgress"),
            "onError" to mapOf("registrationName" to "onError"),
            "onTimePoint" to mapOf("registrationName" to "onTimePoint")
        )
    }

    companion object {
        const val NAME = "IVSPlayer"
    }
}