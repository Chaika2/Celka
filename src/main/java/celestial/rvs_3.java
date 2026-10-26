/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rdb_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvs_3
implements ruS_2<At_1> {
    private rdb_3 id_class;
    private int id_break;

    public int id_byte() {
        return this.id_break;
    }

    public rvs_3() {
    }

    public rvs_3(rdb_3 rdb_32, int n) {
        this.id_class = rdb_32;
        this.id_break = n;
    }

    @Override
    public void id_class(int n) {
        this.id_break = n;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = rdb_3.id_break(ruu_32.id_case());
        this.id_break = ruu_32.id_case();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    public rdb_3 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(rdb_3.id_class(this.id_class));
        ruu_32.id_protected(this.id_break);
    }
}

