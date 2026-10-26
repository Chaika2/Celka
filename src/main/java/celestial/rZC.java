/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHV;
import celestial.rfH_2;
import celestial.rmH_2;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZC
implements ruS_2<rmH_2> {
    private rfH_2 id_class;
    private rqO_2 id_break;
    private rqO_2 id_byte;
    private rqO_2 id_protected;
    private String id_throws;
    private rHV id_case;

    public rqO_2 id_byte() {
        return this.id_break;
    }

    public rZC() {
    }

    public rZC(rfH_2 rfH_22, rqO_2 rqO_22, rqO_2 rqO_23, rqO_2 rqO_24, String string, rHV rHV2) {
        this.id_class = rfH_22;
        this.id_break = rqO_22;
        this.id_byte = rqO_23;
        this.id_protected = rqO_24;
        this.id_throws = string;
        this.id_case = rHV2;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_byte();
        this.id_break = ruu_32.id_volatile();
        this.id_byte = ruu_32.id_volatile();
        this.id_protected = ruu_32.id_volatile();
        this.id_throws = ruu_32.id_throws(Short.MAX_VALUE);
        this.id_case = rHV.id_class(ruu_32.id_throws(Short.MAX_VALUE)).orElse(rHV.ALIGNED);
    }

    public rfH_2 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.id_class(this.id_byte);
        ruu_32.id_class(this.id_protected);
        ruu_32.id_class(this.id_throws);
        ruu_32.id_class(this.id_case.id_class());
    }

    public rqO_2 id_throws() {
        return this.id_protected;
    }

    public rHV id_catch() {
        return this.id_case;
    }

    public String id_case() {
        return this.id_throws;
    }

    public rqO_2 id_protected() {
        return this.id_byte;
    }
}

