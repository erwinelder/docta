package cz.cvut.docta.answer.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "question_answer_pair")
data class QuestionAnswerPairEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val questionText: String,
    val answerText: String
)