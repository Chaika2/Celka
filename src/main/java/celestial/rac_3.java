/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.raF_2;
import celestial.raQ_2;
import celestial.ras_3;
import celestial.rax_3;
import celestial.rcd_3;
import celestial.rrPt_1;
import celestial.rrrn_1;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class rac_3
extends rax_3 {
    public raQ_2 id_class;
    public List<raQ_2> id_break;
    public List<raQ_2> id_byte;
    public final List<rrrn_1> id_protected = Lists.newArrayList();

    public rac_3(Random random, int n, int n2) {
        super(random, n, n2);
        this.id_break = Lists.newArrayList();
        for (raQ_2 raQ_22 : ras_3.id_class) {
            raQ_22.id_byte = 0;
            this.id_break.add(raQ_22);
        }
        this.id_byte = Lists.newArrayList();
        for (raQ_2 raQ_22 : ras_3.id_break) {
            raQ_22.id_byte = 0;
            this.id_byte.add(raQ_22);
        }
    }

    public rac_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_super, rcd_32);
    }
}

