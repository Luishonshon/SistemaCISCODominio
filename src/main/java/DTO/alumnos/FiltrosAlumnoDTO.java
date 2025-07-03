
package DTO.alumnos;

/**
 *
 * @author erwbyel
 */
public class FiltrosAlumnoDTO {
    private int limit;
    private int offset;

    public FiltrosAlumnoDTO(int limit, int offset) {
        this.limit = limit;
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public int getOffset() {
        return offset;
    }
}
