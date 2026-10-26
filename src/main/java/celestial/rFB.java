/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rgP_2;
import celestial.rnP_2;
import celestial.rnr_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFB
implements ruS_2<At_1> {
    private String id_class;
    private rgP_2 id_break;
    private rnr_3 id_byte;
    private int id_protected;

    public rgP_2 id_byte() {
        return this.id_break;
    }

    public rFB() {
    }

    public rFB(rnP_2 rnP_22, int n) {
        this.id_class = rnP_22.id_break();
        this.id_break = rnP_22.id_protected();
        this.id_byte = rnP_22.id_case();
        this.id_protected = n;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_throws(16);
        this.id_protected = ruu_32.readByte();
        if (this.id_protected == 0 || this.id_protected == 2) {
            this.id_break = ruu_32.id_throws();
            this.id_byte = ruu_32.id_class(rnr_3.class);
        }
    }

    public String id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.writeByte(this.id_protected);
        if (this.id_protected == 0 || this.id_protected == 2) {
            ruu_32.id_class(this.id_break);
            ruu_32.id_class(this.id_byte);
        }
    }

    public rnr_3 id_throws() {
        return this.id_byte;
    }

    public int id_protected() {
        return this.id_protected;
    }
}

