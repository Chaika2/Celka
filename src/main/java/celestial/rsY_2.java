/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rAB;
import celestial.rAr_1;
import celestial.rLi_1;
import celestial.rVL;
import celestial.rdI_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rsR_2;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class rsY_2
implements rsR_2 {
    private final rdn_3 id_class;
    private final int id_break;
    private final int id_byte;
    private final int id_protected;
    private final int id_throws;
    private final rdb_3 id_case;
    private final int id_catch;
    private final float id_private;

    public rsY_2(rdb_3 rdb_32, int n, rdb_3 rdb_33, int n2, int n3, int n4, int n5) {
        this.id_class = new rdn_3(rdb_33);
        this.id_byte = n3;
        this.id_protected = n4;
        this.id_throws = n5;
        this.id_case = rdb_32;
        this.id_catch = n;
        this.id_break = n2;
        this.id_private = 0.05f;
    }

    @Override
    public rdI_2 id_class(an_3 an_32, Random random) {
        rdn_3 rdn_32 = new rdn_3(rdy_3.dP, this.id_byte);
        List list = rVL.id_double.id_case().filter(rLi_12 -> !rLi_12.id_class().isEmpty() && rAr_1.id_class(rLi_12)).collect(Collectors.toList());
        rLi_1 rLi_13 = (rLi_1)list.get(random.nextInt(list.size()));
        rdn_3 rdn_33 = rAB.id_class(new rdn_3(this.id_class.id_break(), this.id_break), rLi_13);
        return new rdI_2(rdn_32, new rdn_3(this.id_case, this.id_catch), rdn_33, this.id_protected, this.id_throws, this.id_private);
    }
}

