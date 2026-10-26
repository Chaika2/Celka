/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.At_1;
import celestial.rZM;
import celestial.rfH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.xc_3;
import celestial.xd_3;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rvj_3
implements ruS_2<At_1> {
    private static final Logger id_break = LogManager.getLogger();
    private rfH_2 id_byte;
    private xc_3 id_protected;
    public rZM id_class;
    private boolean id_throws;

    public rfH_2 id_byte() {
        return this.id_byte;
    }

    public rvj_3() {
    }

    public rvj_3(rfH_2 rfH_22, xc_3 xc_32, rZM rZM2, boolean bl, String string) {
        this.id_byte = rfH_22.id_int();
        this.id_protected = xc_32;
        this.id_class = rZM2;
        this.id_throws = bl;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_byte = ruu_32.id_byte();
        this.id_protected = xd_3.id_char.id_class(ruu_32.id_case());
        this.id_class = ruu_32.id_class(rZM.class);
        this.id_throws = ruu_32.readBoolean();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    public xc_3 id_break() {
        return this.id_protected;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_byte);
        ruu_32.id_protected(xd_3.id_finally(this.id_protected));
        ruu_32.id_class(this.id_class);
        ruu_32.writeBoolean(this.id_throws);
    }

    public rZM id_throws() {
        return this.id_class;
    }

    public boolean id_protected() {
        return this.id_throws;
    }
}

