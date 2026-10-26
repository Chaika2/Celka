/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
package celestial;

import celestial.LK;
import celestial.LY;
import celestial.Lf_1;
import celestial.Lo_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.Vu_1;
import celestial.cm_3;
import celestial.mI_2;
import celestial.rgn_3;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class LR
extends Lf_1<Lo_1> {
    public final mI_2 id_class;
    public int id_throws;

    public LR(mI_2 mI_22, QY qY) {
        super(qY, mI_22.id_package + 45, mI_22.id_int, 43, mI_22.id_int - 32, 20);
        this.id_class = mI_22;
        Vu_1[] vu_1Array = (Vu_1[])ArrayUtils.clone((Object[])((Qw_1)qY.id_class[20]).f);
        Arrays.sort(vu_1Array);
        String string = null;
        for (Vu_1 vu_1 : vu_1Array) {
            rgn_3 rgn_32;
            int n;
            String string2 = vu_1.id_throws();
            if (!string2.equals(string)) {
                string = string2;
                this.id_break(new LY(this, new rgn_3(string2)));
            }
            if ((n = ((cm_3)qY.id_class[15]).id_class(rgn_32 = new rgn_3(vu_1.id_catch()))) > this.id_throws) {
                this.id_throws = n;
            }
            this.id_break(new LK(this, vu_1, rgn_32));
        }
    }

    @Override
    protected int id_protected() {
        return super.id_protected() + 15;
    }

    @Override
    public int F_() {
        return super.F_() + 32;
    }
}

