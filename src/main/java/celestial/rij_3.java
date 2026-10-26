/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRq_1;
import celestial.rUo_1;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfw_3;
import celestial.riI_2;
import celestial.rig_3;
import celestial.rrrZ;
import celestial.rrrv_1;
import celestial.xc_3;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class rij_3
extends rrrZ<rUo_1> {
    public static final String[] id_else = new String[]{"ruined_portal/portal_1", "ruined_portal/portal_2", "ruined_portal/portal_3", "ruined_portal/portal_4", "ruined_portal/portal_5", "ruined_portal/portal_6", "ruined_portal/portal_7", "ruined_portal/portal_8", "ruined_portal/portal_9", "ruined_portal/portal_10"};
    public static final String[] id_synchronized = new String[]{"ruined_portal/giant_portal_1", "ruined_portal/giant_portal_2", "ruined_portal/giant_portal_3"};

    public rij_3(Codec<rUo_1> codec) {
        super(codec);
    }

    private static int id_class(Random random, int n, int n2) {
        return random.nextInt(n2 - n + 1) + n;
    }

    @Override
    public rrrv_1<rUo_1> id_class() {
        return rig_3::new;
    }

    public static int id_class(Random random, rKd_1 rKd_12, riI_2 riI_22, boolean bl, int n, int n2, rfi_3 rfi_32) {
        int n3;
        if (riI_22 == riI_2.IN_NETHER) {
            var7_7 = bl ? rij_3.id_class(random, 32, 100) : (random.nextFloat() < 0.5f ? rij_3.id_class(random, 27, 29) : rij_3.id_class(random, 29, 100));
        } else if (riI_22 == riI_2.IN_MOUNTAIN) {
            var8_8 = n - n2;
            var7_7 = rij_3.id_break(random, 70, var8_8);
        } else if (riI_22 == riI_2.UNDERGROUND) {
            var8_8 = n - n2;
            var7_7 = rij_3.id_break(random, 15, var8_8);
        } else {
            var7_7 = riI_22 == riI_2.PARTLY_BURIED ? n - n2 + rij_3.id_class(random, 2, 8) : n;
        }
        ImmutableList immutableList = ImmutableList.of((Object)new rfH_2(rfi_32.id_class, 0, rfi_32.id_byte), (Object)new rfH_2(rfi_32.id_protected, 0, rfi_32.id_byte), (Object)new rfH_2(rfi_32.id_class, 0, rfi_32.id_case), (Object)new rfH_2(rfi_32.id_protected, 0, rfi_32.id_case));
        List list = immutableList.stream().map(rfH_22 -> rKd_12.id_class(rfH_22.b_(), rfH_22.d_())).collect(Collectors.toList());
        rKv_1 rKv_12 = riI_22 == riI_2.ON_OCEAN_FLOOR ? rKv_1.OCEAN_FLOOR_WG : rKv_1.WORLD_SURFACE_WG;
        rfw_3 rfw_32 = new rfw_3();
        for (n3 = var7_7; n3 > 15; --n3) {
            int n4 = 0;
            rfw_32.id_class(0, n3, 0);
            for (rRq_1 rRq_12 : list) {
                xc_3 xc_32 = rRq_12.id_byte(rfw_32);
                if (xc_32 == null || !rKv_12.id_throws().test(xc_32) || ++n4 != 3) continue;
                return n3;
            }
        }
        return n3;
    }

    public static boolean id_class(rfH_2 rfH_22, rYG rYG2) {
        return rYG2.id_class(rfH_22) < 0.15f;
    }

    private static int id_break(Random random, int n, int n2) {
        return n < n2 ? rij_3.id_class(random, n, n2) : n2;
    }
}

