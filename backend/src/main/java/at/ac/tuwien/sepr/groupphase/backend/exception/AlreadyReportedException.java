package at.ac.tuwien.sepr.groupphase.backend.exception;

public class AlreadyReportedException extends RuntimeException {

    public AlreadyReportedException(String message) {
        super(message);
    }
}
