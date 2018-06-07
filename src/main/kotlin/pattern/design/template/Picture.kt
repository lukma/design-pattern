package pattern.design.template

data class Picture(
        override val caption: String,
        val picturePath: String) : Media(caption)