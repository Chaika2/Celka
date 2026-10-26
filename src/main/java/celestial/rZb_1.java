/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rZM;
import celestial.rfH_2;
import celestial.rmH_2;
import celestial.rpr_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZb_1
implements ruS_2<rmH_2> {
    private rfH_2 id_class;
    private rpr_3 id_break;
    private rZM id_byte;

    public rpr_3 id_byte() {
        return this.id_break;
    }

    public rZb_1() {
    }

    public rZb_1(rZM rZM2, rfH_2 rfH_22, rpr_3 rpr_32) {
        this.id_byte = rZM2;
        this.id_class = rfH_22.id_int();
        this.id_break = rpr_32;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_byte = ruu_32.id_class(rZM.class);
        this.id_class = ruu_32.id_byte();
        this.id_break = rpr_3.id_class(ruu_32.readUnsignedByte());
    }

    public rfH_2 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_byte);
        ruu_32.id_class(this.id_class);
        ruu_32.writeByte(this.id_break.id_byte());
    }

    public rZM id_protected() {
        return this.id_byte;
    }
}

