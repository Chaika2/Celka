/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.raG_2;
import celestial.raJ_2;
import celestial.raM_2;
import celestial.raN_2;
import celestial.raO_2;
import celestial.raQ_2;
import celestial.raW_2;
import celestial.raX_2;
import celestial.rab_3;
import celestial.rah_3;
import celestial.rak_3;
import celestial.ram_3;
import celestial.rau_3;
import celestial.rax_3;
import celestial.raz_3;
import celestial.rpr_3;
import celestial.rrrn_1;
import java.util.List;
import java.util.Random;

public class ras_3 {
    public static final raQ_2[] id_class = new raQ_2[]{new raQ_2(rau_3.class, 30, 0, true), new raQ_2(rax_3.class, 10, 4), new raQ_2(raX_2.class, 10, 4), new raQ_2(raN_2.class, 10, 3), new raQ_2(ram_3.class, 5, 2), new raQ_2(rak_3.class, 5, 1)};
    public static final raQ_2[] id_break = new raQ_2[]{new raQ_2(rah_3.class, 25, 0, true), new raQ_2(raJ_2.class, 15, 5), new raQ_2(rab_3.class, 5, 10), new raQ_2(raG_2.class, 5, 10), new raQ_2(raM_2.class, 10, 3, true), new raQ_2(raO_2.class, 7, 2), new raQ_2(raW_2.class, 5, 2)};

    public static raz_3 id_class(raQ_2 raQ_22, List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        Class<? extends raz_3> clazz = raQ_22.id_class;
        raz_3 raz_32 = null;
        if (clazz == rau_3.class) {
            raz_32 = rau_3.id_class(list, random, n, n2, n3, rpr_32, n4);
        } else if (clazz == rax_3.class) {
            raz_32 = rax_3.id_class(list, n, n2, n3, rpr_32, n4);
        } else if (clazz == raX_2.class) {
            raz_32 = raX_2.id_class(list, n, n2, n3, rpr_32, n4);
        } else if (clazz == raN_2.class) {
            raz_32 = raN_2.id_class(list, n, n2, n3, n4, rpr_32);
        } else if (clazz == ram_3.class) {
            raz_32 = ram_3.id_class(list, n, n2, n3, n4, rpr_32);
        } else if (clazz == rak_3.class) {
            raz_32 = rak_3.id_class(list, random, n, n2, n3, rpr_32, n4);
        } else if (clazz == rah_3.class) {
            raz_32 = rah_3.id_class(list, n, n2, n3, rpr_32, n4);
        } else if (clazz == rab_3.class) {
            raz_32 = rab_3.id_class(list, random, n, n2, n3, rpr_32, n4);
        } else if (clazz == raG_2.class) {
            raz_32 = raG_2.id_class(list, random, n, n2, n3, rpr_32, n4);
        } else if (clazz == raM_2.class) {
            raz_32 = raM_2.id_class(list, n, n2, n3, rpr_32, n4);
        } else if (clazz == raO_2.class) {
            raz_32 = raO_2.id_class(list, n, n2, n3, rpr_32, n4);
        } else if (clazz == raJ_2.class) {
            raz_32 = raJ_2.id_class(list, n, n2, n3, rpr_32, n4);
        } else if (clazz == raW_2.class) {
            raz_32 = raW_2.id_class(list, n, n2, n3, rpr_32, n4);
        }
        return raz_32;
    }
}

