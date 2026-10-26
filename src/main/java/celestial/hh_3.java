/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JS;
import celestial.XC;
import celestial.hO_2;
import celestial.rlb_3;
import celestial.xd_3;

public class hh_3 {
    private xd_3 id_class;
    private rlb_3<xd_3> id_break;
    private JS id_byte = JS.id_class;
    private XC id_protected = XC.id_class;

    private hh_3() {
    }

    public hh_3 id_class(JS jS) {
        this.id_byte = jS;
        return this;
    }

    public hh_3 id_class(rlb_3<xd_3> rlb_32) {
        this.id_break = rlb_32;
        return this;
    }

    public hh_3 id_class(xd_3 xd_32) {
        this.id_class = xd_32;
        return this;
    }

    public static hh_3 id_class() {
        return new hh_3();
    }

    public hO_2 id_break() {
        return new hO_2(this.id_break, this.id_class, this.id_byte, this.id_protected);
    }
}

