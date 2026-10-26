/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcd_3;
import celestial.rdn_3;

public class rRK {
    public static final rRK id_class = new rRK("");
    private final String id_break;

    public rRK(String string) {
        this.id_break = string;
    }

    public boolean id_class(rdn_3 rdn_32) {
        return this.id_break.isEmpty() || !rdn_32.id_class() && rdn_32.id_this() && this.id_break.equals(rdn_32.id_continue().getString());
    }

    public void id_class(rcd_3 rcd_32) {
        if (!this.id_break.isEmpty()) {
            rcd_32.id_class("Lock", this.id_break);
        }
    }

    public static rRK id_break(rcd_3 rcd_32) {
        return rcd_32.id_byte("Lock", 8) ? new rRK(rcd_32.id_native("Lock")) : id_class;
    }
}

