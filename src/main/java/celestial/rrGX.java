/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcd_3;
import celestial.rco_3;
import celestial.rfH_2;

public class rrGX {
    private final rfH_2 id_class;
    private final int id_break;
    private final int id_byte;

    public int id_byte() {
        return this.id_break;
    }

    public rrGX(rfH_2 rfH_22, int n, int n2) {
        this.id_class = rfH_22;
        this.id_break = n;
        this.id_byte = n2;
    }

    public static String id_class(rfH_2 rfH_22) {
        return "frame-" + rfH_22.b_() + "," + rfH_22.c_() + "," + rfH_22.d_();
    }

    public static rrGX id_class(rcd_3 rcd_32) {
        rfH_2 rfH_22 = rco_3.id_break(rcd_32.id_int("Pos"));
        int n = rcd_32.id_private("Rotation");
        int n2 = rcd_32.id_private("EntityId");
        return new rrGX(rfH_22, n, n2);
    }

    public rcd_3 id_class() {
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("Pos", rco_3.id_class(this.id_class));
        rcd_32.id_break("Rotation", this.id_break);
        rcd_32.id_break("EntityId", this.id_byte);
        return rcd_32;
    }

    public rfH_2 id_break() {
        return this.id_class;
    }

    public String id_throws() {
        return rrGX.id_class(this.id_class);
    }

    public int id_protected() {
        return this.id_byte;
    }
}

