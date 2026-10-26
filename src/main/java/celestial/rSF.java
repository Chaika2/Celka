/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rST;
import celestial.rSp_1;
import celestial.rSu_1;
import celestial.rjU_2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rSF
extends rSp_1 {
    private static final Logger id_break = LogManager.getLogger();
    private rjU_2 id_byte;
    private int id_protected;

    @Override
    public void id_byte() {
        this.id_byte = null;
        this.id_protected = 0;
    }

    public rSF(rSu_1 rSu_12) {
        super(rSu_12);
    }

    public void id_class(rjU_2 rjU_22) {
        this.id_byte = rjU_22;
    }

    @Override
    public void id_break() {
        if (this.id_byte == null) {
            id_break.warn("Aborting charge player as no target was set.");
            this.id_class.L().id_class(rST.id_class);
        } else if (this.id_protected > 0 && this.id_protected++ >= 10) {
            this.id_class.L().id_class(rST.id_class);
        } else {
            double d = this.id_byte.id_protected(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
            if (d < 100.0 || d > 22500.0 || ((Boolean)this.id_class.id_throws[23]).booleanValue() || ((Boolean)this.id_class.id_throws[24]).booleanValue()) {
                ++this.id_protected;
            }
        }
    }

    @Override
    public float id_throws() {
        return 3.0f;
    }

    @Override
    public rjU_2 id_case() {
        return this.id_byte;
    }

    public rST<rSF> id_protected() {
        return rST.id_implements;
    }
}

