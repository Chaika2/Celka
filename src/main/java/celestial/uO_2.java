/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.ff_3;
import celestial.fo_3;
import celestial.fu_3;
import celestial.rAL;
import celestial.rqO_2;
import celestial.uJ_2;
import celestial.ud_3;
import celestial.uh_3;

public class uO_2
extends ff_3 {
    private final rqO_2 id_class;
    private final HU id_break;
    private final HU id_byte;
    private final boolean id_protected;
    private final uh_3 id_throws;

    public uO_2(rqO_2 rqO_22, boolean bl) {
        this.id_class = rqO_22;
        this.id_protected = bl;
        this.id_throws = new uh_3(0, 0, 256, 256);
        fo_3.id_class(bl ? fu_3.RGBA : fu_3.INTENSITY, this.id_new(), 256, 256);
        this.id_break = HU.id_int(rqO_22);
        this.id_byte = HU.id_new(rqO_22);
    }

    public ud_3 id_class(uJ_2 uJ_22) {
        if (uJ_22.id_protected() != this.id_protected) {
            return null;
        }
        uh_3 uh_32 = this.id_throws.id_class(uJ_22);
        if (uh_32 != null) {
            this.id_super();
            uJ_22.id_class(uh_32.id_class, uh_32.id_break);
            float f = 256.0f;
            float f2 = 256.0f;
            float f3 = 0.01f;
            return new ud_3(this.id_break, this.id_byte, ((float)uh_32.id_class + 0.01f) / 256.0f, ((float)uh_32.id_class - 0.01f + (float)uJ_22.id_class()) / 256.0f, ((float)uh_32.id_break + 0.01f) / 256.0f, ((float)uh_32.id_break - 0.01f + (float)uJ_22.id_break()) / 256.0f, uJ_22.id_private(), uJ_22.id_implements(), uJ_22.id_finally(), uJ_22.id_extends());
        }
        return null;
    }

    public rqO_2 id_class() {
        return this.id_class;
    }

    @Override
    public void close() {
        this.id_continue();
    }

    @Override
    public void a_(rAL rAL2) {
    }
}

