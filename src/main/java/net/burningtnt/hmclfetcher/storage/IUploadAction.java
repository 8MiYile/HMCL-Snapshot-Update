package net.burningtnt.hmclfetcher.storage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public interface IUploadAction {
    void upload() throws IOException, URISyntaxException;

    URI getResult() throws URISyntaxException;
}
