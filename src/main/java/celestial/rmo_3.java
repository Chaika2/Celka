/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rmo_3
implements ruS_2<rmH_2> {
    private rdn_3 id_class;
    private boolean id_break;
    private int id_byte;

    public boolean id_byte() {
        return this.id_break;
    }

    public rmo_3() {
    }

    public rmo_3(rdn_3 rdn_32, boolean bl, int n) {
        this.id_class = rdn_32.id_implements();
        this.id_break = bl;
        this.id_byte = n;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_extends();
        this.id_break = ruu_32.readBoolean();
        this.id_byte = ruu_32.id_case();
    }

    public rdn_3 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.writeBoolean(this.id_break);
        ruu_32.id_protected(this.id_byte);
    }

    public int id_protected() {
        return this.id_byte;
    }
}

