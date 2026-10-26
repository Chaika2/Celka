/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFp_1
implements ruS_2<At_1> {
    private long id_class;
    private long id_break;

    public long id_byte() {
        return this.id_break;
    }

    public rFp_1() {
    }

    public rFp_1(long l, long l2, boolean bl) {
        this.id_class = l;
        this.id_break = l2;
        if (!bl) {
            this.id_break = -this.id_break;
            if (this.id_break == 0L) {
                this.id_break = -1L;
            }
        }
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readLong();
        this.id_break = ruu_32.readLong();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeLong(this.id_class);
        ruu_32.writeLong(this.id_break);
    }

    public long id_break() {
        return this.id_class;
    }
}

