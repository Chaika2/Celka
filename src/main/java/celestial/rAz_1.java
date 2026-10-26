/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAC;
import celestial.rAT;
import celestial.rAW;
import celestial.rAZ;
import celestial.rAk_1;
import celestial.rAm_1;
import celestial.rAp_1;
import celestial.rAq_1;
import java.io.File;
import java.io.FileFilter;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class rAz_1
implements rAm_1 {
    private static final FileFilter id_class = file -> {
        boolean bl = file.isFile() && file.getName().endsWith(".zip");
        boolean bl2 = file.isDirectory() && new File(file, "pack.mcmeta").isFile();
        return bl || bl2;
    };
    private final File id_break;
    private final rAZ id_byte;

    public rAz_1(File file, rAZ rAZ2) {
        this.id_break = file;
        this.id_byte = rAZ2;
    }

    private Supplier<rAC> id_class(File file) {
        return file.isDirectory() ? () -> new rAW(file) : () -> new rAk_1(file);
    }

    @Override
    public void id_class(Consumer<rAp_1> consumer, rAq_1 rAq_12) {
        File[] fileArray;
        if (!this.id_break.isDirectory()) {
            this.id_break.mkdirs();
        }
        if ((fileArray = this.id_break.listFiles(id_class)) != null) {
            for (File file : fileArray) {
                String string = "file/" + file.getName();
                rAp_1 rAp_12 = rAp_1.id_class(string, false, this.id_class(file), rAq_12, rAT.TOP, this.id_byte);
                if (rAp_12 == null) continue;
                consumer.accept(rAp_12);
            }
        }
    }
}

