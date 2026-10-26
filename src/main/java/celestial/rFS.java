/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFS
implements ruS_2<At_1> {
    private rqO_2 id_class;

    public rFS() {
    }

    public rFS(rqO_2 rqO_22) {
        this.id_class = rqO_22;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        if (ruu_32.readBoolean()) {
            this.id_class = ruu_32.id_volatile();
        }
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    public rqO_2 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeBoolean(this.id_class != null);
        if (this.id_class != null) {
            ruu_32.id_class(this.id_class);
        }
    }
}

