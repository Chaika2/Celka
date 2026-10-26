/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DataFixer
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rTv_1;
import celestial.rcW_2;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rqu_3;
import celestial.rrGc_1;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrEi_1 {
    private static final Logger id_class = LogManager.getLogger();
    private final Map<String, rrGc_1> id_break = Maps.newHashMap();
    private final DataFixer id_byte;
    private final File id_protected;

    private <T extends rrGc_1> T id_byte(Supplier<T> supplier, String string) {
        try {
            File file = this.id_class(string);
            if (file.exists()) {
                rrGc_1 rrGc_12 = (rrGc_1)supplier.get();
                rcd_3 rcd_32 = this.id_class(string, rqu_3.id_class().getWorldVersion());
                rrGc_12.id_class(rcd_32.id_int("data"));
                return (T)rrGc_12;
            }
        }
        catch (Exception exception) {
            id_class.error("Error loading saved data: {}", (Object)string, (Object)exception);
        }
        return (T)((rrGc_1)null);
    }

    public rrEi_1(File file, DataFixer dataFixer) {
        this.id_byte = dataFixer;
        this.id_protected = file;
    }

    public void id_class() {
        for (rrGc_1 rrGc_12 : this.id_break.values()) {
            if (rrGc_12 == null) continue;
            rrGc_12.id_class(this.id_class(rrGc_12.id_throws()));
        }
    }

    private boolean id_class(PushbackInputStream pushbackInputStream) throws IOException {
        int n;
        byte[] byArray = new byte[2];
        boolean bl = false;
        int n2 = pushbackInputStream.read(byArray, 0, 2);
        if (n2 == 2 && (n = (byArray[1] & 0xFF) << 8 | byArray[0] & 0xFF) == 35615) {
            bl = true;
        }
        if (n2 != 0) {
            pushbackInputStream.unread(byArray, 0, n2);
        }
        return bl;
    }

    public void id_class(rrGc_1 rrGc_12) {
        this.id_break.put(rrGc_12.id_throws(), rrGc_12);
    }

    public rcd_3 id_class(String string, int n) throws IOException {
        rcd_3 rcd_32;
        File file = this.id_class(string);
        try (FileInputStream fileInputStream = new FileInputStream(file);
             PushbackInputStream pushbackInputStream = new PushbackInputStream(fileInputStream, 2);){
            rcd_3 rcd_33;
            if (this.id_class(pushbackInputStream)) {
                rcd_33 = rcW_2.id_class(pushbackInputStream);
            } else {
                try (DataInputStream dataInputStream = new DataInputStream(pushbackInputStream);){
                    rcd_33 = rcW_2.id_class(dataInputStream);
                }
            }
            int n2 = rcd_33.id_byte("DataVersion", 99) ? rcd_33.id_private("DataVersion") : 1343;
            rcd_32 = rco_3.id_class(this.id_byte, rTv_1.SAVED_DATA, rcd_33, n2, n);
        }
        return rcd_32;
    }

    public <T extends rrGc_1> T id_class(Supplier<T> supplier, String string) {
        T t = this.id_break(supplier, string);
        if (t != null) {
            return t;
        }
        rrGc_1 rrGc_12 = (rrGc_1)supplier.get();
        this.id_class(rrGc_12);
        return (T)rrGc_12;
    }

    private File id_class(String string) {
        return new File(this.id_protected, string + ".dat");
    }

    public <T extends rrGc_1> T id_break(Supplier<T> supplier, String string) {
        rrGc_1 rrGc_12 = this.id_break.get(string);
        if (rrGc_12 == null && !this.id_break.containsKey(string)) {
            rrGc_12 = this.id_byte(supplier, string);
            this.id_break.put(string, rrGc_12);
        }
        return (T)rrGc_12;
    }
}

