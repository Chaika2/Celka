/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmH_2;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rmY_2
implements ruS_2<rmH_2> {
    public static final rqO_2 id_class = new rqO_2("brand");
    private rqO_2 id_break;
    private ruu_3 id_byte;

    public rmY_2() {
    }

    public rmY_2(rqO_2 rqO_22, ruu_3 ruu_32) {
        this.id_break = rqO_22;
        this.id_byte = ruu_32;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
        if (this.id_byte != null) {
            this.id_byte.release();
        }
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_break = ruu_32.id_volatile();
        int n = ruu_32.readableBytes();
        if (n < 0 || n > Short.MAX_VALUE) {
            throw new IOException("Payload may not be larger than 32767 bytes");
        }
        this.id_byte = new ruu_3(ruu_32.readBytes(n));
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_break);
        ruu_32.writeBytes(this.id_byte);
    }
}

