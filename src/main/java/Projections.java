import Java8.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Projections {
    String getName();
    String getEmail();
}

