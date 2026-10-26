/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.VQ;
import celestial.rTv_1;
import celestial.rcW_2;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rqu_3;
import com.mojang.datafixers.DataFixer;
import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Vk_1 {
    private static final Logger id_class = LogManager.getLogger();
    private final File id_break;
    private final DataFixer id_byte;
    private final VQ[] id_protected = new VQ[9];
    private boolean id_throws;

    public Vk_1(File file, DataFixer dataFixer) {
        this.id_break = new File(file, "hotbar.nbt");
        this.id_byte = dataFixer;
        for (int i = 0; i < 9; ++i) {
            this.id_protected[i] = new VQ();
        }
    }

    public VQ id_class(int n) {
        if (!this.id_throws) {
            this.id_break();
            this.id_throws = true;
        }
        return this.id_protected[n];
    }

    public void id_class() {
        try {
            rcd_3 rcd_32 = new rcd_3();
            rcd_32.id_break("DataVersion", rqu_3.id_class().getWorldVersion());
            for (int i = 0; i < 9; ++i) {
                rcd_32.id_class(String.valueOf(i), this.id_class(i).id_class());
            }
            rcW_2.id_break(rcd_32, this.id_break);
        }
        catch (Exception exception) {
            id_class.error("Failed to save creative mode options", (Throwable)exception);
        }
    }

    private void id_break() {
        try {
            rcd_3 rcd_32 = rcW_2.id_break(this.id_break);
            if (rcd_32 == null) {
                return;
            }
            if (!rcd_32.id_byte("DataVersion", 99)) {
                rcd_32.id_break("DataVersion", 1343);
            }
            rcd_32 = rco_3.id_class(this.id_byte, rTv_1.HOTBAR, rcd_32, rcd_32.id_private("DataVersion"));
            for (int i = 0; i < 9; ++i) {
                this.id_protected[i].id_class(rcd_32.id_protected(String.valueOf(i), 10));
            }
        }
        catch (Exception exception) {
            id_class.error("Failed to load creative mode options", (Throwable)exception);
        }
    }
}

