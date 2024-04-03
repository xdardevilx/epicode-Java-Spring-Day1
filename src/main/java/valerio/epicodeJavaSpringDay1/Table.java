package valerio.epicodeJavaSpringDay1;


import lombok.Getter;
import lombok.Setter;
import valerio.epicodeJavaSpringDay1.Enum.TableStatus;

@Getter
@Setter
public class Table {
    private int number;
    private int covered;
    private TableStatus status;

    public Table() {
    }

    ;

    public Table(int number, int covered, TableStatus status) {
        this.number = number;
        this.covered = covered;
        this.status = status;
    }
}
