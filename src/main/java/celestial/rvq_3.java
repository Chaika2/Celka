/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rkw_3;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvq_3
implements ruS_2<At_1> {
    private int id_class;
    private rqO_2 id_break;

    public int id_byte() {
        return this.id_class;
    }

    public rvq_3() {
    }

    public rvq_3(int n, rkw_3<?> rkw_32) {
        this.id_class = n;
        this.id_break = rkw_32.id_case();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readByte();
        this.id_break = ruu_32.id_volatile();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeByte(this.id_class);
        ruu_32.id_class(this.id_break);
    }

    public rqO_2 id_break() {
        return this.id_break;
    }
}

