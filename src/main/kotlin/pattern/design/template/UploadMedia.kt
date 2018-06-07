package pattern.design.template

abstract class UploadMedia<T> {
    var isDeleteLocalFile = false

    fun runUpload(media: T) {
        checkToken()
        addWatermark()
        postMedia(media)
        if (isDeleteLocalFile) {
            deleteLocalFile()
        }
        addContentToList()
    }

    fun checkToken() {
        println("-> Check token is valid")
    }

    abstract fun addWatermark()

    abstract fun postMedia(media: T)

    fun addContentToList() {
        println("-> Add new content to list")
    }

    fun deleteLocalFile() {
        println("-> Delete local file")
    }
}