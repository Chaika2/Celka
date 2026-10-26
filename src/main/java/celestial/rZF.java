/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZF
implements ruS_2<rmH_2> {
    private boolean id_class;
    private boolean id_break;

    public boolean id_byte() {
        return this.id_break;
    }

    public rZF() {
    }

    public rZF(boolean bl, boolean bl2) {
        this.id_class = bl;
        this.id_break = bl2;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readBoolean();
        this.id_break = ruu_32.readBoolean();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeBoolean(this.id_class);
        ruu_32.writeBoolean(this.id_break);
    }

    public boolean id_break() {
        return this.id_class;
    }
}

