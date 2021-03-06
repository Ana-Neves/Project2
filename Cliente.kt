import java.time.LocalDateTime

class Cliente {

        var nome:String?= null
            get() = if(field.isNullOrEmpty()) "Nome não informado" else
                field
            set(value) {
                field = if(value.isNullOrEmpty()) null else value
            }

        var email:String?= null
            get() = if(field.isNullOrEmpty()) "Email não informado" else
                field
            set(value) {
                field = if(value.isNullOrEmpty()) null else value
            }

    var cpf:String?= null
        get() = if(field.isNullOrEmpty()) "Cpf não informado" else
            field
        set(value) {
            field = if(value.isNullOrEmpty()) null else value
        }

    var dataNascimento: LocalDateTime?= null
    set(value) {
        if(value == null) {
            field = LocalDateTime.now()
        }else{
            field = value
        }
    }

}
