package pg.table.vacancy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import pg.table.csv.CsvData;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor(staticName = "dummy")
@Builder
public class JobRequirement implements CsvData {
    public static final String TABLE = "Wymagania";
    public static final String COLUMNS = "wymaganie_id,stanowisko_id,nazwa,opis,stopien_zaawansowania";
    private UUID id;
    private Vacancy vacancy;
    private String name;
    private String description;
    private Integer experienceLevel;


    @Override
    public String toString() {
        return "%s,%s,%s,%s,%d".formatted(
                id,
                vacancy.getId(),
                name,
                description,
                experienceLevel
        );
    }

    @Override
    public String getColumns() {
        return COLUMNS;
    }
}