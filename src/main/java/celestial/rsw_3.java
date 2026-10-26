/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.an_3;
import celestial.rdI_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rds_3;
import celestial.rdy_3;
import celestial.rsR_2;
import celestial.rxA_2;
import celestial.rxL_2;
import celestial.rxn_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;

public class rsw_3
implements rsR_2 {
    private final rdb_3 id_class;
    private final int id_break;
    private final int id_byte;
    private final int id_protected;

    public rsw_3(rdb_3 rdb_32, int n) {
        this(rdb_32, n, 12, 1);
    }

    public rsw_3(rdb_3 rdb_32, int n, int n2, int n3) {
        this.id_class = rdb_32;
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
    }

    private static rxA_2 id_class(Random random) {
        return rxA_2.id_class(rxL_2.id_class(random.nextInt(16)));
    }

    @Override
    public rdI_2 id_class(an_3 an_32, Random random) {
        rdn_3 rdn_32 = new rdn_3(rdy_3.dP, this.id_break);
        rdn_3 rdn_33 = new rdn_3(this.id_class);
        if (this.id_class instanceof rxn_3) {
            ArrayList arrayList = Lists.newArrayList();
            arrayList.add(rsw_3.id_class(random));
            if (random.nextFloat() > 0.7f) {
                arrayList.add(rsw_3.id_class(random));
            }
            if (random.nextFloat() > 0.8f) {
                arrayList.add(rsw_3.id_class(random));
            }
            rdn_33 = rds_3.id_class(rdn_33, arrayList);
        }
        return new rdI_2(rdn_32, rdn_33, this.id_byte, this.id_protected, 0.2f);
    }
}

