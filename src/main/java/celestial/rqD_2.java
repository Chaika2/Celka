/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

public class rqD_2
implements BooleanSupplier {
    public final /* synthetic */ Path id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rqD_2(Path path) {
        this.id_class = path;
    }

    public String toString() {
        return "verify that " + this.id_class + " is deleted";
    }

    @Override
    public boolean getAsBoolean() {
        return !Files.exists(this.id_class, new LinkOption[0]);
    }
}

