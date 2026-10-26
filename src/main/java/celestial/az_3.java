/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.eA_2;
import celestial.eC_2;
import celestial.eF_2;
import celestial.eY_2;
import celestial.ev_3;
import celestial.iB_2;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rxS_2;
import celestial.rye_3;
import java.util.Map;
import java.util.Random;

public class az_3
extends ev_3 {
    public az_3(eF_2 eF_22, rXQ ... rXQArray) {
        super(eF_22, eC_2.ARMOR_CHEST, rXQArray);
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return rdn_32.id_break() instanceof rxS_2 ? true : super.id_class(rdn_32);
    }

    public static boolean id_class(int n, Random random) {
        if (n <= 0) {
            return false;
        }
        return random.nextFloat() < 0.15f * (float)n;
    }

    @Override
    public int id_class(int n) {
        return 10 + 20 * (n - 1);
    }

    @Override
    public int id_class() {
        return 3;
    }

    @Override
    public int id_break(int n) {
        return super.id_class(n) + 50;
    }

    public static int id_break(int n, Random random) {
        return n > 10 ? n - 10 : 1 + random.nextInt(4);
    }

    @Override
    public void id_break(iB_2 iB_23, an_3 an_32, int n) {
        Random random = iB_23.Sa();
        Map.Entry<rXQ, rdn_3> entry = eA_2.id_break(eY_2.id_private, iB_23);
        if (az_3.id_class(n, random)) {
            if (an_32 != null) {
                an_32.id_break(rye_3.id_class(iB_23), az_3.id_break(n, random));
            }
            if (entry != null) {
                entry.getValue().id_class(2, iB_23, iB_22 -> iB_22.id_break((rXQ)((Object)((Object)entry.getKey()))));
            }
        }
    }
}

