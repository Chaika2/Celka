/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Af_1;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rLG
implements ruS_2<Af_1> {
    private long id_class;

    public rLG() {
    }

    public rLG(long l) {
        this.id_class = l;
    }

    @Override
    public void id_class(Af_1 af_1) {
        af_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readLong();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeLong(this.id_class);
    }
}

