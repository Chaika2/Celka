/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXt_1;
import celestial.rrdJ;
import celestial.rrkt_1;
import celestial.rrky_1;

public class rrkz_1 {
    private String id_class;
    private rrkt_1 id_break;
    private rrXt_1 id_byte;
    private rrky_1 id_protected;

    public String id_byte() {
        return this.id_class;
    }

    public rrkz_1(String string, rrkt_1 rrkt_12, rrXt_1 rrXt_12) {
        this.id_class = string;
        this.id_break = rrkt_12;
        this.id_byte = rrXt_12;
        this.id_protected = rrkt_12.id_class(string);
    }

    public String toString() {
        return this.id_break.name().toLowerCase() + " " + this.id_class;
    }

    public void id_class() {
        if (this.id_protected.id_case()) {
            try {
                this.id_break.id_class(this.id_byte, this.id_protected);
            }
            catch (RuntimeException runtimeException) {
                rrdJ.id_class("Error updating custom uniform: " + this.id_protected.id_byte());
                rrdJ.id_class(runtimeException.getClass().getName() + ": " + runtimeException.getMessage());
                this.id_protected.id_catch();
                rrdJ.id_class("Custom uniform disabled: " + this.id_protected.id_byte());
            }
        }
    }

    public void id_class(int n) {
        this.id_protected.id_byte(n);
    }

    public void id_break() {
        this.id_protected.id_private();
    }

    public rrXt_1 id_throws() {
        return this.id_byte;
    }

    public rrky_1 id_case() {
        return this.id_protected;
    }

    public rrkt_1 id_protected() {
        return this.id_break;
    }
}

