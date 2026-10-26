/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rJP;
import celestial.rVL;
import celestial.rgP_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvp_3
implements ruS_2<At_1> {
    private int id_class;
    private int id_break;
    private rgP_2 id_byte;

    public rJP<?> id_byte() {
        return (rJP)rVL.G.id_class(this.id_break);
    }

    public rvp_3() {
    }

    public rvp_3(int n, rJP<?> rJP2, rgP_2 rgP_22) {
        this.id_class = n;
        this.id_break = rVL.G.id_class(rJP2);
        this.id_byte = rgP_22;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_case();
        this.id_byte = ruu_32.id_throws();
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_protected(this.id_break);
        ruu_32.id_class(this.id_byte);
    }

    public rgP_2 id_protected() {
        return this.id_byte;
    }
}

