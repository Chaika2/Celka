/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqR_2;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

public class rqo_3
implements BooleanSupplier {
    public final /* synthetic */ Path id_class;
    public final /* synthetic */ Path id_break;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rqo_3(Path path, Path path2) {
        this.id_class = path;
        this.id_break = path2;
    }

    public String toString() {
        return "rename " + this.id_class + " to " + this.id_break;
    }

    @Override
    public boolean getAsBoolean() {
        try {
            Files.move(this.id_class, this.id_break, new CopyOption[0]);
            return true;
        }
        catch (IOException iOException) {
            rqR_2.id_catch.error("Failed to rename", (Throwable)iOException);
            return false;
        }
    }
}

