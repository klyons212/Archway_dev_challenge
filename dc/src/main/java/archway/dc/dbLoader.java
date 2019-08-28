package archway.dc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;


@Component
public class dbLoader implements CommandLineRunner {

	private final patientRepo repo;

	@Autowired
	public dbLoader(patientRepo repo) {
		this.repo = repo;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repo.save(new record("Karam", "Lyons", "kal569@nyu.edu",123456789,"07/05/1997"));
	}
}
