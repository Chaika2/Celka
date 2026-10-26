/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rkw_3;
import celestial.rmH_2;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZE
implements ruS_2<rmH_2> {
    private int id_class;
    private rqO_2 id_break;
    private boolean id_byte;

    public rqO_2 id_byte() {
        return this.id_break;
    }

    public rZE() {
    }

    public rZE(int n, rkw_3<?> rkw_32, boolean bl) {
        this.id_class = n;
        this.id_break = rkw_32.id_case();
        this.id_byte = bl;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readByte();
        this.id_break = ruu_32.id_volatile();
        this.id_byte = ruu_32.readBoolean();
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeByte(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.writeBoolean(this.id_byte);
    }

    public boolean id_protected() {
        return this.id_byte;
    }
}

