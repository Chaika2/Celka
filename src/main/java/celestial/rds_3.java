/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rxA_2;
import java.util.List;

public interface rds_3 {
    public static rdn_3 id_class(rdn_3 rdn_32, List<rxA_2> list) {
        int n;
        float f;
        rdn_3 rdn_33 = rdn_3.id_break;
        int[] nArray = new int[3];
        int n2 = 0;
        int n3 = 0;
        rds_3 rds_32 = null;
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 instanceof rds_3) {
            rds_32 = (rds_3)((Object)rdb_32);
            rdn_33 = rdn_32.id_implements();
            rdn_33.id_throws(1);
            if (rds_32.c_(rdn_32)) {
                int n4 = rds_32.d_(rdn_33);
                float f2 = (float)(n4 >> 16 & 0xFF) / 255.0f;
                float f3 = (float)(n4 >> 8 & 0xFF) / 255.0f;
                f = (float)(n4 & 0xFF) / 255.0f;
                n2 = (int)((float)n2 + Math.max(f2, Math.max(f3, f)) * 255.0f);
                nArray[0] = (int)((float)nArray[0] + f2 * 255.0f);
                nArray[1] = (int)((float)nArray[1] + f3 * 255.0f);
                nArray[2] = (int)((float)nArray[2] + f * 255.0f);
                ++n3;
            }
            for (rxA_2 rxA_22 : list) {
                float[] fArray = rxA_22.id_byte().id_protected();
                int n5 = (int)(fArray[0] * 255.0f);
                int n6 = (int)(fArray[1] * 255.0f);
                n = (int)(fArray[2] * 255.0f);
                n2 += Math.max(n5, Math.max(n6, n));
                nArray[0] = nArray[0] + n5;
                nArray[1] = nArray[1] + n6;
                nArray[2] = nArray[2] + n;
                ++n3;
            }
        }
        if (rds_32 == null) {
            return rdn_3.id_break;
        }
        int n7 = nArray[0] / n3;
        int n8 = nArray[1] / n3;
        int n9 = nArray[2] / n3;
        f = (float)n2 / (float)n3;
        float f4 = Math.max(n7, Math.max(n8, n9));
        n7 = (int)((float)n7 * f / f4);
        n8 = (int)((float)n8 * f / f4);
        n9 = (int)((float)n9 * f / f4);
        n = (n7 << 8) + n8;
        n = (n << 8) + n9;
        rds_32.id_class(rdn_33, n);
        return rdn_33;
    }

    default public void id_class(rdn_3 rdn_32, int n) {
        rdn_32.id_class("display").id_break("color", n);
    }

    default public void e_(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_break("display");
        if (rcd_32 != null && rcd_32.id_throws("color")) {
            rcd_32.id_continue("color");
        }
    }

    default public boolean c_(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_break("display");
        return rcd_32 != null && rcd_32.id_byte("color", 99);
    }

    default public int d_(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_break("display");
        return rcd_32 != null && rcd_32.id_byte("color", 99) ? rcd_32.id_private("color") : 10511680;
    }
}

