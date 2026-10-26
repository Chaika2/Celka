/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.iB_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.rvr_3;
import celestial.ryR_2;
import java.io.IOException;

public class rZa_1
implements ruS_2<At_1> {
    public rvr_3 id_class;
    public int id_break;
    public int id_byte;
    public int id_protected;
    public rgP_2 id_throws;

    public rZa_1(ryR_2 ryR_22, rvr_3 rvr_32, rgP_2 rgP_22) {
        this.id_class = rvr_32;
        iB_2 iB_22 = ryR_22.id_byte();
        switch (rvr_32) {
            case END_COMBAT: {
                this.id_protected = ryR_22.id_protected();
                this.id_byte = iB_22 == null ? -1 : iB_22.V();
                break;
            }
            case ENTITY_DIED: {
                this.id_break = ryR_22.id_case().V();
                this.id_byte = iB_22 == null ? -1 : iB_22.V();
                this.id_throws = rgP_22;
            }
        }
    }

    public rZa_1(ryR_2 ryR_22, rvr_3 rvr_32) {
        this(ryR_22, rvr_32, rgN_2.id_byte);
    }

    public rZa_1() {
    }

    @Override
    public boolean id_class() {
        return this.id_class == rvr_3.ENTITY_DIED;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_class(rvr_3.class);
        if (this.id_class == rvr_3.END_COMBAT) {
            this.id_protected = ruu_32.id_case();
            this.id_byte = ruu_32.readInt();
        } else if (this.id_class == rvr_3.ENTITY_DIED) {
            this.id_break = ruu_32.id_case();
            this.id_byte = ruu_32.readInt();
            this.id_throws = ruu_32.id_throws();
        }
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        if (this.id_class == rvr_3.END_COMBAT) {
            ruu_32.id_protected(this.id_protected);
            ruu_32.writeInt(this.id_byte);
        } else if (this.id_class == rvr_3.ENTITY_DIED) {
            ruu_32.id_protected(this.id_break);
            ruu_32.writeInt(this.id_byte);
            ruu_32.id_class(this.id_throws);
        }
    }
}

