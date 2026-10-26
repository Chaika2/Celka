/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rcW_2;
import celestial.rcd_3;
import celestial.rqu_3;
import java.io.File;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrGc_1 {
    private static final Logger id_class = LogManager.getLogger();
    private final String id_break;
    private boolean id_byte;

    public void id_byte() {
        this.id_class(true);
    }

    public abstract rcd_3 id_byte(rcd_3 var1);

    public rrGc_1(String string) {
        this.id_break = string;
    }

    public void id_class(File file) {
        if (this.id_protected()) {
            rcd_3 rcd_32 = new rcd_3();
            rcd_32.id_class("data", this.id_byte(new rcd_3()));
            rcd_32.id_break("DataVersion", rqu_3.id_class().getWorldVersion());
            try {
                rcW_2.id_class(rcd_32, file);
            }
            catch (IOException iOException) {
                id_class.error("Could not save data {}", (Object)this, (Object)iOException);
            }
            this.id_class(false);
        }
    }

    public void id_class(boolean bl) {
        this.id_byte = bl;
    }

    public abstract void id_class(rcd_3 var1);

    public String id_throws() {
        return this.id_break;
    }

    public boolean id_protected() {
        return this.id_byte;
    }
}

