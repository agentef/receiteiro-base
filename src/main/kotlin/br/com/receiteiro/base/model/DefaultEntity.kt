@file:Suppress("unused")

package br.com.receiteiro.base.model

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@MappedSuperclass
open class DefaultEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id = 0

        @CreationTimestamp
        var createdAt: LocalDateTime? = LocalDateTime.now()

        @UpdateTimestamp
        var updatedAt: LocalDateTime? = LocalDateTime.now()

        @Version
        var version: Int = 1

}
