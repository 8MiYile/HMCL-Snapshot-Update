package net.burningtnt.hmclfetcher.publish.uploaders;

import java.io.Serial;

public class UploadRejectedException extends Exception {
    @Serial
    private static final long serialVersionUID = -33875993124229948L;

    public UploadRejectedException() {
    }

    public UploadRejectedException(String message) {
        super(message);
    }

    public UploadRejectedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UploadRejectedException(Throwable cause) {
        super(cause);
    }

    public UploadRejectedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
