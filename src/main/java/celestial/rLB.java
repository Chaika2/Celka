/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLr_1;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rLB
implements ruS_2<rLr_1> {
    private long id_class;

    public rLB() {
    }

    public rLB(long l) {
        this.id_class = l;
    }

    @Override
    public void id_class(rLr_1 rLr_12) {
        rLr_12.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readLong();
    }

    public long id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeLong(this.id_class);
    }
}

