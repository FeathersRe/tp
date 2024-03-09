package longah.exception;

public enum ExceptionMessage {
    // [Cause of Exception]([Message to be printed])
    // Data Storage Exceptions
    STORAGE_FILE_NOT_FOUND("File not found."),
    STORAGE_FILE_NOT_CREATED("File not created."),
    STORAGE_FILE_NOT_READ("File not read."),
    STORAGE_FILE_NOT_WRITTEN("File not written."),
    INVALID_STORAGE_CONTENT("Invalid content in storage file, line ignored.");

    private final String message;

    /**
     * Constructor for ExceptionMessage.
     * 
     * @param message The message to be printed when the exception is called.
     */
    ExceptionMessage(String message) {
        this.message = message;
    }

    /**
     * Returns the message of the exception.
     * 
     * @return The message of the exception.
     */
    public String getMessage() {
        return message;
    }
}
