package umg.progra3.ejemploLombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor // Genera constructor con campos finales
@AllArgsConstructor      // Genera constructor con todos los campos
public class Persona {
    private final String firstName;
    private final String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private final Date dateOfBirth;

}
