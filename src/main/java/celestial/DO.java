/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.DD;
import celestial.DG;
import celestial.DK;
import celestial.Do_1;
import celestial.Uh_1;
import celestial.rqO_2;
import celestial.xd_3;

public class DO {
    private final rqO_2 id_break;
    public final /* synthetic */ DG id_class;

    public DO(DG dG, rqO_2 rqO_22, xd_3 xd_32) {
        this.id_class = dG;
        this.id_break = Uh_1.id_abstract.id_class(rqO_22, Do_1.id_new(xd_32), dG.id_break);
    }

    public DO id_class(DD dD, xd_3 ... xd_3Array) {
        for (xd_3 xd_32 : xd_3Array) {
            dD.id_class(DK.id_class(xd_32.id_case()), Do_1.id_new(xd_32), this.id_class.id_break);
        }
        return this.id_class(xd_3Array);
    }

    public DO id_class(xd_3 ... xd_3Array) {
        for (xd_3 xd_32 : xd_3Array) {
            this.id_class.id_class.accept(DG.id_byte(xd_32, this.id_break));
        }
        return this;
    }

    public DO id_break(xd_3 ... xd_3Array) {
        for (xd_3 xd_32 : xd_3Array) {
            this.id_class.id_class(xd_32);
        }
        return this.id_class(xd_3Array);
    }
}

