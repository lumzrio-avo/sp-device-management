package campus.demo.controller;
import campus.demo.entity.Device;
import campus.demo.repository.DeviceRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class DeviceController {
    private final DeviceRepository repository;

    public DeviceController(DeviceRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/device")
    public List<Device> list() {
        return repository.findAll();
    }

    @PostMapping("/device")
    public Device add(@RequestBody Device device) {
        return repository.save(device);
    }

    @DeleteMapping("/device/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
