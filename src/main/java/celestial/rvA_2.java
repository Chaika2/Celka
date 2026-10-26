/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.an_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvA_2
implements ruS_2<At_1> {
    private int id_class;
    private int id_break;

    public int id_byte() {
        return this.id_break;
    }

    public rvA_2() {
    }

    public rvA_2(an_3 an_32, an_3 an_33) {
        this.id_class = an_32.V();
        this.id_break = an_33 != null ? an_33.V() : 0;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readInt();
        this.id_break = ruu_32.readInt();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeInt(this.id_class);
        ruu_32.writeInt(this.id_break);
    }

    public int id_break() {
        return this.id_class;
    }
}

