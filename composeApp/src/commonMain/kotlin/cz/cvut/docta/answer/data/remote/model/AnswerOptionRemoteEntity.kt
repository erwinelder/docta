package cz.cvut.docta.answer.data.remote.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import cz.cvut.docta.course.data.remote.model.CourseRemoteEntity
import cz.cvut.docta.question.data.remote.model.entity.AnswerOptionsQuestionRemoteEntity

@Entity(
    tableName = "answer_option_remote",
    foreignKeys = [
        ForeignKey(
            entity = CourseRemoteEntity::class,
            parentColumns = ["code"],
            childColumns = ["courseCode"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = AnswerOptionsQuestionRemoteEntity::class,
            parentColumns = ["questionId"],
            childColumns = ["questionId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class AnswerOptionRemoteEntity(
    val updateTime: Long,
    val deleted: Boolean,
    val courseCode: String,
    val questionId: Long,
    @PrimaryKey
    val id: Long,
    val text: String
)