/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rnP_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import java.util.Objects;

public class rvM_2
implements ruS_2<At_1> {
    private int id_class;
    private String id_break;

    public String id_byte() {
        return Objects.equals(this.id_break, "") ? null : this.id_break;
    }

    public rvM_2() {
    }

    public rvM_2(int n, rnP_2 rnP_22) {
        this.id_class = n;
        this.id_break = rnP_22 == null ? "" : rnP_22.id_break();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readByte();
        this.id_break = ruu_32.id_throws(16);
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeByte(this.id_class);
        ruu_32.id_class(this.id_break);
    }

    public int id_break() {
        return this.id_class;
    }
}

