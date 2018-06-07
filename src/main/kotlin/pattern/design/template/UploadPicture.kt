package pattern.design.template

class UploadPicture : UploadMedia<Picture>() {
    override fun addWatermark() {
        println("-> Add watermark using imagemagick lib")
    }

    override fun postMedia(media: Picture) {
        println("-> Upload media with detail :")
        println("   - caption : ${media.caption}")
        println("   - picture path : ${media.picturePath}")
    }
}