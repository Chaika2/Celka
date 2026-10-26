/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rFm_1;
import celestial.rgP_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFu_1
implements ruS_2<At_1> {
    private rFm_1 id_class;
    private rgP_2 id_break;
    private int id_byte;
    private int id_protected;
    private int id_throws;

    public rgP_2 id_byte() {
        return this.id_break;
    }

    public rFu_1(rFm_1 rFm_12, rgP_2 rgP_22, int n, int n2, int n3) {
        this.id_class = rFm_12;
        this.id_break = rgP_22;
        this.id_byte = n;
        this.id_protected = n2;
        this.id_throws = n3;
    }

    public rFu_1(int n, int n2, int n3) {
        this(rFm_1.TIMES, null, n, n2, n3);
    }

    public rFu_1() {
    }

    public rFu_1(rFm_1 rFm_12, rgP_2 rgP_22) {
        this(rFm_12, rgP_22, -1, -1, -1);
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_class(rFm_1.class);
        if (this.id_class == rFm_1.TITLE || this.id_class == rFm_1.SUBTITLE || this.id_class == rFm_1.ACTIONBAR) {
            this.id_break = ruu_32.id_throws();
        }
        if (this.id_class == rFm_1.TIMES) {
            this.id_byte = ruu_32.readInt();
            this.id_protected = ruu_32.readInt();
            this.id_throws = ruu_32.readInt();
        }
    }

    public rFm_1 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        if (this.id_class == rFm_1.TITLE || this.id_class == rFm_1.SUBTITLE || this.id_class == rFm_1.ACTIONBAR) {
            ruu_32.id_class(this.id_break);
        }
        if (this.id_class == rFm_1.TIMES) {
            ruu_32.writeInt(this.id_byte);
            ruu_32.writeInt(this.id_protected);
            ruu_32.writeInt(this.id_throws);
        }
    }

    public int id_throws() {
        return this.id_protected;
    }

    public int id_case() {
        return this.id_throws;
    }

    public int id_protected() {
        return this.id_byte;
    }
}

