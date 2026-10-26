/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rST;
import celestial.rSl_1;
import celestial.rSu_1;
import celestial.rYB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rSq_1 {
    private static final Logger id_class = LogManager.getLogger();
    private final rSu_1 id_break;
    private final rSl_1[] id_byte = new rSl_1[rST.id_byte()];
    private rSl_1 id_protected;

    public rSq_1(rSu_1 rSu_12) {
        this.id_break = rSu_12;
        this.id_class(rST.id_extends);
    }

    public void id_class(rST<?> rST2) {
        if (this.id_protected == null || rST2 != this.id_protected.id_protected()) {
            if (this.id_protected != null) {
                this.id_protected.id_catch();
            }
            this.id_protected = this.id_break(rST2);
            if (!((rYB)this.id_break.id_throws[7]).id_continue) {
                this.id_break.BQ().id_break(rSu_1.id_class, rST2.id_break());
            }
            id_class.debug("Dragon is now in phase {} on the {}", rST2, (Object)(((rYB)this.id_break.id_throws[7]).id_continue ? "client" : "server"));
            this.id_protected.id_byte();
        }
    }

    public rSl_1 id_class() {
        return this.id_protected;
    }

    public <T extends rSl_1> T id_break(rST<T> rST2) {
        int n = rST2.id_break();
        if (this.id_byte[n] == null) {
            this.id_byte[n] = rST2.id_class(this.id_break);
        }
        return (T)this.id_byte[n];
    }
}

