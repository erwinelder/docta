package cz.cvut.docta.question.data.remote.model.entity_with_details

data class AnswerOptionsQuestionRemoteWithDetails(
    val updateTime: Long,
    val deleted: Boolean,
    val courseCode: String,
    val id: Long,
    val difficulty: String,
    val questionId: Long,
    val text: String,
    val correctOptionId: Long
)