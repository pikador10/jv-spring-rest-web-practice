package mate.academy.spring.model.dto.response;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class OrderResponseDto {
    private Long id;
    private List<Long> ticketsId;
    @NonNull
    private LocalDateTime orderDate;
    private Long userId;
}
