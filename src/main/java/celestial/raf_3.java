/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.raR_2;
import celestial.raU_2;
import celestial.raV_2;
import celestial.rag_3;
import celestial.rao_3;
import celestial.rfi_3;
import celestial.rpr_3;
import celestial.rrrn_1;
import java.util.List;
import java.util.Random;

public class raf_3 {
    private static raR_2 id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4, raU_2 raU_22) {
        int n5 = random.nextInt(100);
        if (n5 >= 80) {
            rfi_3 rfi_32 = rag_3.id_class(list, random, n, n2, n3, rpr_32);
            if (rfi_32 != null) {
                return new rag_3(n4, rfi_32, rpr_32, raU_22);
            }
        } else if (n5 >= 70) {
            rfi_3 rfi_33 = rao_3.id_class(list, random, n, n2, n3, rpr_32);
            if (rfi_33 != null) {
                return new rao_3(n4, rfi_33, rpr_32, raU_22);
            }
        } else {
            rfi_3 rfi_34 = raV_2.id_class(list, random, n, n2, n3, rpr_32);
            if (rfi_34 != null) {
                return new raV_2(n4, random, rfi_34, rpr_32, raU_22);
            }
        }
        return null;
    }

    public static raR_2 id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        if (n4 > 8) {
            return null;
        }
        if (Math.abs(n - rrrn_12.id_catch().id_class) <= 80 && Math.abs(n3 - rrrn_12.id_catch().id_byte) <= 80) {
            raU_2 raU_22 = ((raR_2)rrrn_12).id_class;
            raR_2 raR_22 = raf_3.id_class(list, random, n, n2, n3, rpr_32, n4 + 1, raU_22);
            if (raR_22 != null) {
                list.add(raR_22);
                raR_22.id_class(rrrn_12, list, random);
            }
            return raR_22;
        }
        return null;
    }
}

