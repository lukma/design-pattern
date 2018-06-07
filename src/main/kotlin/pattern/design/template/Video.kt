package pattern.design.template

data class Video(
        override val caption: String,
        val videoPath: String,
        val coverPath: String) : Media(caption)