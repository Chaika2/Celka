/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rke_3;
import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZH
implements ruS_2<rmH_2> {
    private rke_3 id_class;
    private boolean id_break;
    private boolean id_byte;

    public boolean id_byte() {
        return this.id_break;
    }

    public rZH() {
    }

    public rZH(rke_3 rke_32, boolean bl, boolean bl2) {
        this.id_class = rke_32;
        this.id_break = bl;
        this.id_byte = bl2;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_class(rke_3.class);
        this.id_break = ruu_32.readBoolean();
        this.id_byte = ruu_32.readBoolean();
    }

    public rke_3 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.writeBoolean(this.id_break);
        ruu_32.writeBoolean(this.id_byte);
    }

    public boolean id_protected() {
        return this.id_byte;
    }
}

