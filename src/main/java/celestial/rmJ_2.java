/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmO_2;
import celestial.rqu_3;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.ruv_3;
import java.io.IOException;

public class rmJ_2
implements ruS_2<rmO_2> {
    private int id_class;
    private String id_break;
    private int id_byte;
    private ruv_3 id_protected;

    public int id_byte() {
        return this.id_class;
    }

    public rmJ_2() {
    }

    public rmJ_2(String string, int n, ruv_3 ruv_32) {
        this.id_class = rqu_3.id_class().getProtocolVersion();
        this.id_break = string;
        this.id_byte = n;
        this.id_protected = ruv_32;
    }

    @Override
    public void id_class(rmO_2 rmO_22) {
        rmO_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_throws(255);
        this.id_byte = ruu_32.readUnsignedShort();
        this.id_protected = ruv_3.id_class(ruu_32.id_case());
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.writeShort(this.id_byte);
        ruu_32.id_protected(this.id_protected.id_class());
    }

    public ruv_3 id_break() {
        return this.id_protected;
    }
}

