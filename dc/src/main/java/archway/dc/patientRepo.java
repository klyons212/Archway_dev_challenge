package archway.dc;


import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

public interface patientRepo extends CrudRepository<record, Long> {

}
