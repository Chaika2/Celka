/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmk_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rmN_2
implements ruS_2<rmk_3> {
    private int id_class;
    private ruu_3 id_break;

    public rmN_2() {
    }

    public rmN_2(int n, ruu_3 ruu_32) {
        this.id_class = n;
        this.id_break = ruu_32;
    }

    @Override
    public void id_class(rmk_3 rmk_32) {
        rmk_32.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        if (ruu_32.readBoolean()) {
            int n = ruu_32.readableBytes();
            if (n < 0 || n > 0x100000) {
                throw new IOException("Payload may not be larger than 1048576 bytes");
            }
            this.id_break = new ruu_3(ruu_32.readBytes(n));
        } else {
            this.id_break = null;
        }
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        if (this.id_break != null) {
            ruu_32.writeBoolean(true);
            ruu_32.writeBytes(this.id_break.copy());
        } else {
            ruu_32.writeBoolean(false);
        }
    }
}

