package pattern.design.template

class UploadVideo : UploadMedia<Video>() {
    override fun addWatermark() {
        println("-> Add watermark using ffmpeg lib")
    }

    override fun postMedia(media: Video) {
        println("-> Upload media with detail :")
        println("   - caption : ${media.caption}")
        println("   - video path : ${media.videoPath}")
        println("   - cover path : ${media.coverPath}")
    }
}