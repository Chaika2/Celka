/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvv_3
implements ruS_2<At_1> {
    private long id_class;

    public rvv_3() {
    }

    public rvv_3(long l) {
        this.id_class = l;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readLong();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    public long id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeLong(this.id_class);
    }
}

