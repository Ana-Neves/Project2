import java.time.LocalDateTime
import java.util.*

    class Venda {

        var estoque: String? = null
            get() = if(field.isNullOrEmpty()) "Estoque não informado" else
                field
            set(value) {
                field = if(value.isNullOrEmpty()) null else value
            }

        var tempoDaEntrega: LocalDateTime? = null
            set(value) {
            if (value == null){
              field= LocalDateTime.now()
            }else{
                field = value
            }
            }

        var produto: String? = null
            get() = if(field.isNullOrEmpty()) "Produto não informado" else
                field
            set(value) {
                field = if(value.isNullOrEmpty()) null else value
            }
}