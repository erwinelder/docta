package cz.cvut.docta.question.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "choose_answer_question",
    foreignKeys = [
        ForeignKey(
            entity = QuestionEntity::class,
            parentColumns = ["id"],
            childColumns = ["questionId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class ChooseAnswerQuestionEntity(
    @PrimaryKey
    val questionId: Long,
    val text: String,
    val correctOptionId: Long?
)