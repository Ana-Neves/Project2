import java.time.LocalDateTime
import java.util.*

    class Vendedor {

        var nome: String? = null
            get() = if (field.isNullOrEmpty()) "Vendedor não informado" else
                field
            set(value) {
                field = if (value.isNullOrEmpty()) null else value
            }

        var idade: String? = null
            get() = if (field.isNullOrEmpty()) "Idade não informado" else
                field
            set(value) {
                field = if (value?.length == 2) value else null
            }


        var email: String? = null
            get() = if (field.isNullOrEmpty()) "Email não informado" else
                field
            set(value) {
                field = if (value.isNullOrEmpty()) null else value
            }


        var dataNascimento: LocalDateTime? = null
            set(value) {
                if (value == null) {
                    field = LocalDateTime.now()
                } else {
                    field = value
                }
            }

                var cpf: String? = null
                get() = if (field.isNullOrEmpty()) "Cpf não informado" else
                    field
                set(value) {
                    field = if (value?.length == 10) value else null
                }


    }
