/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.io.IOException;
import java.nio.file.Path;

public class rnm_3
extends IOException {
    private rnm_3(Path path, String string) {
        super(path.toAbsolutePath() + ": " + string);
    }

    public static rnm_3 id_class(Path path) {
        return new rnm_3(path, "already locked (possibly by other Minecraft instance?)");
    }
}

