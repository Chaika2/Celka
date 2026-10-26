/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCD;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rmH_2;
import celestial.rpa_3;
import celestial.rqd_3;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.ryM_2;
import java.io.IOException;

public class rZp_1
implements ruS_2<rmH_2> {
    private rfH_2 id_class;
    private ryM_2 id_break;
    private rCD id_byte;
    private String id_protected;
    private rfH_2 id_throws;
    private rfH_2 id_case;
    private rpa_3 id_catch;
    private rqd_3 id_private;
    private String id_implements;
    private boolean id_finally;
    private boolean id_extends;
    private boolean id_native;
    private float id_volatile;
    private long id_final;

    public ryM_2 id_byte() {
        return this.id_break;
    }

    public rZp_1() {
    }

    public rZp_1(rfH_2 rfH_22, ryM_2 ryM_22, rCD rCD2, String string, rfH_2 rfH_23, rfH_2 rfH_24, rpa_3 rpa_32, rqd_3 rqd_32, String string2, boolean bl, boolean bl2, boolean bl3, float f, long l) {
        this.id_class = rfH_22;
        this.id_break = ryM_22;
        this.id_byte = rCD2;
        this.id_protected = string;
        this.id_throws = rfH_23;
        this.id_case = rfH_24;
        this.id_catch = rpa_32;
        this.id_private = rqd_32;
        this.id_implements = string2;
        this.id_finally = bl;
        this.id_extends = bl2;
        this.id_native = bl3;
        this.id_volatile = f;
        this.id_final = l;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_byte();
        this.id_break = ruu_32.id_class(ryM_2.class);
        this.id_byte = ruu_32.id_class(rCD.class);
        this.id_protected = ruu_32.id_throws(Short.MAX_VALUE);
        int n = 48;
        this.id_throws = new rfH_2(rfU_2.id_class((int)ruu_32.readByte(), -48, 48), rfU_2.id_class((int)ruu_32.readByte(), -48, 48), rfU_2.id_class((int)ruu_32.readByte(), -48, 48));
        int n2 = 48;
        this.id_case = new rfH_2(rfU_2.id_class((int)ruu_32.readByte(), 0, 48), rfU_2.id_class((int)ruu_32.readByte(), 0, 48), rfU_2.id_class((int)ruu_32.readByte(), 0, 48));
        this.id_catch = ruu_32.id_class(rpa_3.class);
        this.id_private = ruu_32.id_class(rqd_3.class);
        this.id_implements = ruu_32.id_throws(12);
        this.id_volatile = rfU_2.id_class(ruu_32.readFloat(), 0.0f, 1.0f);
        this.id_final = ruu_32.id_catch();
        byte by = ruu_32.readByte();
        this.id_finally = (by & 1) != 0;
        this.id_extends = (by & 2) != 0;
        this.id_native = (by & 4) != 0;
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
        ruu_32.writeByte(this.id_throws.b_());
        ruu_32.writeByte(this.id_throws.c_());
        ruu_32.writeByte(this.id_throws.d_());
        ruu_32.writeByte(this.id_case.b_());
        ruu_32.writeByte(this.id_case.c_());
        ruu_32.writeByte(this.id_case.d_());
        ruu_32.id_class(this.id_catch);
        ruu_32.id_class(this.id_private);
        ruu_32.id_class(this.id_implements);
        ruu_32.writeFloat(this.id_volatile);
        ruu_32.id_class(this.id_final);
        int n = 0;
        if (this.id_finally) {
            n |= 1;
        }
        if (this.id_extends) {
            n |= 2;
        }
        if (this.id_native) {
            n |= 4;
        }
        ruu_32.writeByte(n);
    }

    public String id_throws() {
        return this.id_protected;
    }

    public String id_finally() {
        return this.id_implements;
    }

    public rfH_2 id_catch() {
        return this.id_case;
    }

    public boolean id_extends() {
        return this.id_finally;
    }

    public rfH_2 id_case() {
        return this.id_throws;
    }

    public rqd_3 id_implements() {
        return this.id_private;
    }

    public long id_package() {
        return this.id_final;
    }

    public rCD id_protected() {
        return this.id_byte;
    }

    public rpa_3 id_private() {
        return this.id_catch;
    }

    public float id_final() {
        return this.id_volatile;
    }

    public boolean id_volatile() {
        return this.id_native;
    }

    public boolean id_native() {
        return this.id_extends;
    }
}

