/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Nc_1;
import celestial.Nf_1;
import celestial.Nq_1;
import celestial.Nt_1;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class NI
implements Nc_1<Nq_1> {
    private final List<Nc_1<Nq_1>> id_class = Lists.newArrayList();
    private final Random id_break = new Random();
    private final rqO_2 id_byte;
    private final rgP_2 id_protected;

    public Nq_1 id_byte() {
        int n = this.id_class();
        if (!this.id_class.isEmpty() && n != 0) {
            int n2 = this.id_break.nextInt(n);
            for (Nc_1<Nq_1> nc_1 : this.id_class) {
                if ((n2 -= nc_1.id_class()) >= 0) continue;
                return nc_1.id_break();
            }
            return Nf_1.id_class;
        }
        return Nf_1.id_class;
    }

    public NI(rqO_2 rqO_22, String string) {
        this.id_byte = rqO_22;
        this.id_protected = string == null ? null : new rgn_3(string);
    }

    @Override
    public void id_class(Nt_1 nt_1) {
        for (Nc_1<Nq_1> nc_1 : this.id_class) {
            nc_1.id_class(nt_1);
        }
    }

    public void id_class(Nc_1<Nq_1> nc_1) {
        this.id_class.add(nc_1);
    }

    @Override
    public int id_class() {
        int n = 0;
        for (Nc_1<Nq_1> nc_1 : this.id_class) {
            n += nc_1.id_class();
        }
        return n;
    }

    @Override
    public /* synthetic */ Object id_break() {
        return this.id_byte();
    }

    public rgP_2 id_protected() {
        return this.id_protected;
    }
}

