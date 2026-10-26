/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.util.Supplier
 */
package celestial;

import celestial.Ko_1;
import celestial.ao_3;
import celestial.rFy_1;
import celestial.rVL;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rpa_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.ryW_2;
import celestial.xc_3;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public abstract class ryO_2
implements ao_3 {
    private static final Logger id_class = LogManager.getLogger();
    private final ryW_2<?> id_break;
    protected rYB id_extends;
    protected rfH_2 id_native = rfH_2.id_protected;
    protected boolean id_volatile;
    private xc_3 id_byte;
    private boolean id_protected;

    public rfH_2 id_char() {
        return this.id_native;
    }

    public void id_byte(rfH_2 rfH_22) {
        this.id_native = rfH_22.id_int();
    }

    public void id_int() {
        this.id_volatile = false;
    }

    public boolean id_long() {
        return this.id_volatile;
    }

    public void id_float() {
        this.id_byte = null;
    }

    public ryO_2(ryW_2<?> ryW_22) {
        this.id_break = ryW_22;
    }

    public boolean id_interface() {
        return this.id_extends != null;
    }

    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        this.id_native = new rfH_2(rcd_32.id_private("x"), rcd_32.id_private("y"), rcd_32.id_private("z"));
    }

    public void id_class(Ko_1 ko_1) {
        ko_1.id_class("Name", () -> rVL.r.id_break(this.id_void()) + " // " + this.getClass().getCanonicalName());
        if (this.id_extends != null) {
            Ko_1.id_class(ko_1, this.id_native, this.id_abstract());
            Ko_1.id_class(ko_1, this.id_native, this.id_extends.id_byte(this.id_native));
        }
    }

    public rcd_3 id_class(rcd_3 rcd_32) {
        return this.id_break(rcd_32);
    }

    public ryW_2<?> id_void() {
        return this.id_break;
    }

    public static ryO_2 id_break(xc_3 xc_32, rcd_3 rcd_32) {
        String string = rcd_32.id_native("id");
        return rVL.r.id_break(new rqO_2(string)).map(ryW_22 -> {
            try {
                return ryW_22.id_class();
            }
            catch (Throwable throwable) {
                id_class.error("Failed to create block entity {}", (Object)string, (Object)throwable);
                return null;
            }
        }).map(ryO_22 -> {
            try {
                ryO_22.id_class(xc_32, rcd_32);
                return ryO_22;
            }
            catch (Throwable throwable) {
                id_class.error("Failed to load data for block entity {}", (Object)string, (Object)throwable);
                return null;
            }
        }).orElseGet(() -> {
            id_class.warn("Skipping BlockEntity with id {}", (Object)string);
            return null;
        });
    }

    private rcd_3 id_break(rcd_3 rcd_32) {
        rqO_2 rqO_22 = ryW_2.id_class(this.id_void());
        if (rqO_22 == null) {
            throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
        }
        rcd_32.id_class("id", rqO_22.toString());
        rcd_32.id_break("x", this.id_native.b_());
        rcd_32.id_break("y", this.id_native.c_());
        rcd_32.id_break("z", this.id_native.d_());
        return rcd_32;
    }

    public void id_break(rpa_3 rpa_32) {
    }

    public void id_break() {
        if (this.id_extends != null) {
            this.id_byte = this.id_extends.id_byte(this.id_native);
            this.id_extends.id_break(this.id_native, this);
            if (!this.id_byte.id_catch()) {
                this.id_extends.id_byte(this.id_native, this.id_byte.id_break());
            }
        }
    }

    public void id_break(rqd_3 rqd_32) {
    }

    public void id_break(rYB rYB2, rfH_2 rfH_22) {
        this.id_extends = rYB2;
        this.id_native = rfH_22.id_int();
    }

    public double id_implements() {
        return 64.0;
    }

    public rYB id_while() {
        return this.id_extends;
    }

    public void id_static() {
        if (!this.id_protected) {
            this.id_protected = true;
            id_class.warn("Block entity invalid: {} @ {}", new Supplier[]{() -> rVL.r.id_break(this.id_void()), this::id_char});
        }
    }

    public xc_3 id_abstract() {
        if (this.id_byte == null) {
            this.id_byte = this.id_extends.id_byte(this.id_native);
        }
        return this.id_byte;
    }

    public void aa_() {
        this.id_volatile = true;
    }

    public boolean ac_() {
        return false;
    }

    public boolean a_(int n, int n2) {
        return false;
    }

    public rFy_1 Y_() {
        return null;
    }

    public rcd_3 Z_() {
        return this.id_break(new rcd_3());
    }
}

