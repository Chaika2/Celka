/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rmR_2
implements ruS_2<rmH_2> {
    private int id_class;
    private rdn_3 id_break = rdn_3.id_break;

    public rdn_3 id_byte() {
        return this.id_break;
    }

    public rmR_2() {
    }

    public rmR_2(int n, rdn_3 rdn_32) {
        this.id_class = n;
        this.id_break = rdn_32.id_implements();
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readShort();
        this.id_break = ruu_32.id_extends();
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeShort(this.id_class);
        ruu_32.id_class(this.id_break);
    }
}

