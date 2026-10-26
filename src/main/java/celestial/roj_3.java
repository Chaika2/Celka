/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 */
package celestial;

import celestial.rTv_1;
import celestial.rYB;
import celestial.rat_3;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rfj_3;
import celestial.roY_2;
import celestial.rqM_2;
import celestial.rqu_3;
import celestial.rrEi_1;
import com.mojang.datafixers.DataFixer;
import java.io.File;
import java.io.IOException;
import java.util.function.Supplier;

public class roj_3
implements AutoCloseable {
    private final roY_2 id_break;
    protected final DataFixer id_class;
    private rat_3 id_byte;

    public roj_3(File file, DataFixer dataFixer, boolean bl) {
        this.id_class = dataFixer;
        this.id_break = new roY_2(file, bl, "chunk");
    }

    public rcd_3 id_class(rfj_3 rfj_32) throws IOException {
        return this.id_break.id_class(rfj_32);
    }

    public void id_class(rfj_3 rfj_32, rcd_3 rcd_32) {
        this.id_break.id_class(rfj_32, rcd_32);
        if (this.id_byte != null) {
            this.id_byte.id_class(rfj_32.id_class());
        }
    }

    public void id_class() {
        this.id_break.id_class().join();
    }

    public static int id_class(rcd_3 rcd_32) {
        return rcd_32.id_byte("DataVersion", 99) ? rcd_32.id_private("DataVersion") : -1;
    }

    public rcd_3 id_class(rqM_2<rYB> rqM_22, Supplier<rrEi_1> supplier, rcd_3 rcd_32) {
        int n = roj_3.id_class(rcd_32);
        int n2 = 1493;
        if (n < 1493 && (rcd_32 = rco_3.id_class(this.id_class, rTv_1.CHUNK, rcd_32, n, 1493)).id_int("Level").id_new("hasLegacyStructureData")) {
            if (this.id_byte == null) {
                this.id_byte = rat_3.id_class(rqM_22, supplier.get());
            }
            rcd_32 = this.id_byte.id_class(rcd_32);
        }
        rcd_32 = rco_3.id_class(this.id_class, rTv_1.CHUNK, rcd_32, Math.max(1493, n));
        if (n < rqu_3.id_class().getWorldVersion()) {
            rcd_32.id_break("DataVersion", rqu_3.id_class().getWorldVersion());
        }
        return rcd_32;
    }

    @Override
    public void close() throws IOException {
        this.id_break.close();
    }
}

