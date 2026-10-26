/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.XA;
import celestial.XC;
import celestial.XN;
import celestial.Xj_1;
import celestial.aI_2;
import celestial.hD_2;
import celestial.hI_2;
import celestial.hY_2;
import celestial.hj_3;
import celestial.hl_3;
import celestial.rWI;
import celestial.rlb_3;
import celestial.rqO_2;

public class hK_2 {
    private hD_2 id_class = hD_2.id_class;
    private hl_3 id_break = hl_3.id_class;
    private XN id_byte = XN.id_class;
    private XA id_protected = XA.id_class;
    private XC id_throws = XC.id_class;
    private hj_3 id_case = hj_3.id_class;
    private hI_2 id_catch = hI_2.id_class;
    private Xj_1 id_private = Xj_1.id_class;
    private rWI id_implements = rWI.id_class;
    private hY_2 id_finally = hY_2.id_class;
    private hY_2 id_extends = hY_2.id_class;
    private String id_native;
    private rqO_2 id_volatile;

    public hK_2 id_class(hI_2 hI_22) {
        this.id_catch = hI_22;
        return this;
    }

    public hK_2 id_class(hj_3 hj_32) {
        this.id_case = hj_32;
        return this;
    }

    public hK_2 id_class(XC xC) {
        this.id_throws = xC;
        return this;
    }

    public hK_2 id_class(XA xA) {
        this.id_protected = xA;
        return this;
    }

    public hK_2 id_class(String string) {
        this.id_native = string;
        return this;
    }

    public hK_2 id_class(hY_2 hY_22) {
        this.id_finally = hY_22;
        return this;
    }

    public hK_2 id_class(rWI rWI2) {
        this.id_implements = rWI2;
        return this;
    }

    public hK_2 id_class(Xj_1 xj_1) {
        this.id_private = xj_1;
        return this;
    }

    public hK_2 id_class(rqO_2 rqO_22) {
        this.id_volatile = rqO_22;
        return this;
    }

    public hK_2 id_class(rlb_3<aI_2<?>> rlb_32) {
        this.id_class = hD_2.id_class(rlb_32);
        return this;
    }

    public hK_2 id_class(aI_2<?> aI_22) {
        this.id_class = hD_2.id_break(aI_22);
        return this;
    }

    public static hK_2 id_class() {
        return new hK_2();
    }

    public hK_2 id_class(XN xN) {
        this.id_byte = xN;
        return this;
    }

    public hK_2 id_class(hl_3 hl_32) {
        this.id_break = hl_32;
        return this;
    }

    public hK_2 id_class(hD_2 hD_22) {
        this.id_class = hD_22;
        return this;
    }

    public hY_2 id_break() {
        return new hY_2(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends, this.id_native, this.id_volatile);
    }

    public hK_2 id_break(rqO_2 rqO_22) {
        this.id_volatile = rqO_22;
        return this;
    }

    public hK_2 id_break(hY_2 hY_22) {
        this.id_extends = hY_22;
        return this;
    }
}

