/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.At_1;
import celestial.iJ_2;
import celestial.ic_3;
import celestial.id_3;
import celestial.ix_3;
import celestial.rVL;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.rvz_3;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class rvW_2
implements ruS_2<At_1> {
    private int id_class;
    private final List<rvz_3> id_break = Lists.newArrayList();

    public List<rvz_3> id_byte() {
        return this.id_break;
    }

    public rvW_2() {
    }

    public rvW_2(int n, Collection<ic_3> collection) {
        this.id_class = n;
        for (ic_3 ic_32 : collection) {
            this.id_break.add(new rvz_3(this, ic_32.id_class(), ic_32.id_break(), ic_32.id_byte()));
        }
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        int n = ruu_32.readInt();
        for (int i = 0; i < n; ++i) {
            rqO_2 rqO_22 = ruu_32.id_volatile();
            iJ_2 iJ_22 = rVL.O.id_class(rqO_22);
            double d = ruu_32.readDouble();
            ArrayList arrayList = Lists.newArrayList();
            int n2 = ruu_32.id_case();
            for (int j = 0; j < n2; ++j) {
                UUID uUID = ruu_32.id_private();
                arrayList.add(new ix_3(uUID, "Unknown synced attribute modifier", ruu_32.readDouble(), id_3.id_class(ruu_32.readByte())));
            }
            this.id_break.add(new rvz_3(this, iJ_22, d, arrayList));
        }
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.writeInt(this.id_break.size());
        for (rvz_3 rvz_32 : this.id_break) {
            ruu_32.id_class(rVL.O.id_break(rvz_32.id_class()));
            ruu_32.writeDouble(rvz_32.id_break());
            ruu_32.id_protected(rvz_32.id_byte().size());
            for (ix_3 ix_32 : rvz_32.id_byte()) {
                ruu_32.id_class(ix_32.id_class());
                ruu_32.writeDouble(ix_32.id_protected());
                ruu_32.writeByte(ix_32.id_byte().id_class());
            }
        }
    }

    public int id_break() {
        return this.id_class;
    }
}

