/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rTv_1;
import celestial.rcW_2;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rhd_3;
import celestial.rqR_2;
import celestial.rrGk_1;
import celestial.rrGr_1;
import com.mojang.datafixers.DataFixer;
import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrGx_1 {
    private static final Logger id_break = LogManager.getLogger();
    private final File id_byte;
    protected final DataFixer id_class;

    public rrGx_1(rrGk_1 rrGk_12, DataFixer dataFixer) {
        this.id_class = dataFixer;
        this.id_byte = rrGk_12.id_class(rrGr_1.id_byte).toFile();
        this.id_byte.mkdirs();
    }

    public void id_class(rhd_3 rhd_32) {
        try {
            rcd_3 rcd_32 = rhd_32.id_case(new rcd_3());
            File file = File.createTempFile(rhd_32.rz() + "-", ".dat", this.id_byte);
            rcW_2.id_class(rcd_32, file);
            File file2 = new File(this.id_byte, rhd_32.rz() + ".dat");
            File file3 = new File(this.id_byte, rhd_32.rz() + ".dat_old");
            rqR_2.id_class(file2, file, file3);
        }
        catch (Exception exception) {
            id_break.warn("Failed to save player data for {}", (Object)rhd_32.g().getString());
        }
    }

    public String[] id_class() {
        String[] stringArray = this.id_byte.list();
        if (stringArray == null) {
            stringArray = new String[]{};
        }
        for (int i = 0; i < stringArray.length; ++i) {
            if (!stringArray[i].endsWith(".dat")) continue;
            stringArray[i] = stringArray[i].substring(0, stringArray[i].length() - 4);
        }
        return stringArray;
    }

    public rcd_3 id_break(rhd_3 rhd_32) {
        rcd_3 rcd_32 = null;
        try {
            File file = new File(this.id_byte, rhd_32.rz() + ".dat");
            if (file.exists() && file.isFile()) {
                rcd_32 = rcW_2.id_class(file);
            }
        }
        catch (Exception exception) {
            id_break.warn("Failed to load player data for {}", (Object)rhd_32.g().getString());
        }
        if (rcd_32 != null) {
            int n = rcd_32.id_byte("DataVersion", 3) ? rcd_32.id_private("DataVersion") : -1;
            rhd_32.id_throws(rco_3.id_class(this.id_class, rTv_1.PLAYER, rcd_32, n));
        }
        return rcd_32;
    }
}

