/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rcd_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rve_3
implements ruS_2<At_1> {
    private int id_class;
    private rcd_3 id_break;

    public rcd_3 id_byte() {
        return this.id_break;
    }

    public rve_3() {
    }

    public rve_3(int n, rcd_3 rcd_32) {
        this.id_class = n;
        this.id_break = rcd_32;
    }

    @Override
    public boolean id_class() {
        return true;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_implements();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_class(this.id_break);
    }
}

