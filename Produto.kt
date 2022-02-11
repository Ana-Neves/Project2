import java.time.LocalDateTime
import java.util.*

class Produto {

        var nome:String?= null
        get() = if(field.isNullOrEmpty()) "Nome não informado" else
            field
        set(value) {
            field = if(value.isNullOrEmpty()) null else value
        }

        var vencimento: LocalDateTime?= null
            set(value) {
                if (value == null){
                    field = LocalDateTime.now()
                }else {
                    field= value
                }
            }

        var dataDeLancamento: LocalDateTime?= null
            set(value) {
                if (value == null) {
                    field = LocalDateTime.now()
                }else{
                    field= value
                }
            }

        var preco: String?= null
            get() = if(field.isNullOrEmpty()) "Preço não informado" else
                field
            set(value) {
                field = if(value?.length == 5) value else null
            }
    }
