/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.AH;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rmv_3
implements ruS_2<AH> {
    private int id_class;
    private rqO_2 id_break;
    private ruu_3 id_byte;

    @Override
    public void id_class(AH aH) {
        aH.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_volatile();
        int n = ruu_32.readableBytes();
        if (n < 0 || n > 0x100000) {
            throw new IOException("Payload may not be larger than 1048576 bytes");
        }
        this.id_byte = new ruu_3(ruu_32.readBytes(n));
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.writeBytes(this.id_byte.copy());
    }
}

