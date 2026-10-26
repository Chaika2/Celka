/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqR_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

public class rqK_2
implements BooleanSupplier {
    public final /* synthetic */ Path id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rqK_2(Path path) {
        this.id_class = path;
    }

    public String toString() {
        return "delete old " + this.id_class;
    }

    @Override
    public boolean getAsBoolean() {
        try {
            Files.deleteIfExists(this.id_class);
            return true;
        }
        catch (IOException iOException) {
            rqR_2.id_catch.warn("Failed to delete", (Throwable)iOException);
            return false;
        }
    }
}

