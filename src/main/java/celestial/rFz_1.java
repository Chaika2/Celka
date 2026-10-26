/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rqL_2;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFz_1
implements ruS_2<At_1> {
    private rqO_2 id_class;
    private rqL_2 id_break;

    public rqL_2 id_byte() {
        return this.id_break;
    }

    public rFz_1() {
    }

    public rFz_1(rqO_2 rqO_22, rqL_2 rqL_22) {
        this.id_class = rqO_22;
        this.id_break = rqL_22;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        byte by = ruu_32.readByte();
        if ((by & 1) > 0) {
            this.id_break = ruu_32.id_class(rqL_2.class);
        }
        if ((by & 2) > 0) {
            this.id_class = ruu_32.id_volatile();
        }
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        if (this.id_break != null) {
            if (this.id_class != null) {
                ruu_32.writeByte(3);
                ruu_32.id_class(this.id_break);
                ruu_32.id_class(this.id_class);
            } else {
                ruu_32.writeByte(1);
                ruu_32.id_class(this.id_break);
            }
        } else if (this.id_class != null) {
            ruu_32.writeByte(2);
            ruu_32.id_class(this.id_class);
        } else {
            ruu_32.writeByte(0);
        }
    }

    public rqO_2 id_break() {
        return this.id_class;
    }
}

