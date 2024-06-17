package service; // Ajuste para o pacote correto

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import model.Reserva;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import repository.ReservaRepository;
import service.ReservaService;
import com.projeto.salareserva.SalaReservaApplication;

@SpringBootTest(classes = SalaReservaApplication.class) // Especifica a classe principal
@ExtendWith(SpringExtension.class)
public class ReservaServiceTest {

    @Mock
    private ReservaRepository reservaRepository;

    @InjectMocks
    private ReservaService reservaService;

    @Test
    public void testGetAllReservas() {
        // Criar dados de teste
        Reserva reserva1 = new Reserva(1L, 1L, 1L, LocalDate.of(2023, 6, 1), LocalTime.of(10, 0));
        Reserva reserva2 = new Reserva(2L, 2L, 2L, LocalDate.of(2023, 6, 2), LocalTime.of(11, 0));
        List<Reserva> reservas = Arrays.asList(reserva1, reserva2);

        // Configurar o comportamento do mock do repository
        when(reservaRepository.findAll()).thenReturn(reservas);

        // Chamar o método a ser testado
        List<Reserva> result = reservaService.getAllReservas();

        // Verificar se o resultado está correto
        assertEquals(2, result.size());
        assertEquals(reservas, result);
    }

    // Adicionar mais testes conforme necessário
}
