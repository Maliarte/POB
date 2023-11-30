import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class CalculadoraDiarias {
       
 public static int calcularQuantidadeDiarias(LocalDate dataEntrada, LocalDate dataSaida) {
    int diarias = 0;

    LocalDateTime dataEntradaCompleta = LocalDateTime.of(dataEntrada, LocalTime.NOON);

    // Verificar se a hora de entrada é após o meio dia
    if (LocalDateTime.now().isAfter(dataEntradaCompleta)) {
        diarias++;
    }

    // Calcular a diferença entre as datas, considerando dias completos
    long diferencaDias = ChronoUnit.DAYS.between(dataEntradaCompleta, dataSaida.atTime(LocalTime.NOON));

    // Adicionar os dias completos
    diarias += diferencaDias;

    return diarias;
   }
}