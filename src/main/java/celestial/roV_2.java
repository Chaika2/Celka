/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVL;
import celestial.rVv_1;
import celestial.rYY;
import celestial.rYZ;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rfj_3;
import celestial.roD_2;
import celestial.roH_2;
import celestial.rog_3;

public class roV_2 {
    public static rog_3 id_class(rcd_3 rcd_32) {
        int n = rcd_32.id_private("xPos");
        int n2 = rcd_32.id_private("zPos");
        rog_3 rog_32 = new rog_3(n, n2);
        rog_32.id_catch = rcd_32.id_volatile("Blocks");
        rog_32.id_case = new roD_2(rcd_32.id_volatile("Data"), 7);
        rog_32.id_throws = new roD_2(rcd_32.id_volatile("SkyLight"), 7);
        rog_32.id_protected = new roD_2(rcd_32.id_volatile("BlockLight"), 7);
        rog_32.id_byte = rcd_32.id_volatile("HeightMap");
        rog_32.id_break = rcd_32.id_new("TerrainPopulated");
        rog_32.id_private = rcd_32.id_protected("Entities", 10);
        rog_32.id_implements = rcd_32.id_protected("TileEntities", 10);
        rog_32.id_finally = rcd_32.id_protected("TileTicks", 10);
        try {
            rog_32.id_class = rcd_32.id_implements("LastUpdate");
        }
        catch (ClassCastException classCastException) {
            rog_32.id_class = rcd_32.id_private("LastUpdate");
        }
        return rog_32;
    }

    public static void id_class(rVv_1 rVv_12, rog_3 rog_32, rcd_3 rcd_32, rYY rYY2) {
        rcd_32.id_break("xPos", rog_32.id_extends);
        rcd_32.id_break("zPos", rog_32.id_native);
        rcd_32.id_class("LastUpdate", rog_32.id_class);
        int[] nArray = new int[rog_32.id_byte.length];
        for (int i = 0; i < rog_32.id_byte.length; ++i) {
            nArray[i] = rog_32.id_byte[i];
        }
        rcd_32.id_class("HeightMap", nArray);
        rcd_32.id_class("TerrainPopulated", rog_32.id_break);
        rcy_3 rcy_32 = new rcy_3();
        for (int i = 0; i < 8; ++i) {
            int n;
            boolean bl = true;
            for (int j = 0; j < 16 && bl; ++j) {
                block3: for (int k = 0; k < 16 && bl; ++k) {
                    for (int i2 = 0; i2 < 16; ++i2) {
                        int n2 = j << 11 | i2 << 7 | k + (i << 4);
                        n = rog_32.id_catch[n2];
                        if (n == 0) continue;
                        bl = false;
                        continue block3;
                    }
                }
            }
            if (bl) continue;
            byte[] byArray = new byte[4096];
            roH_2 roH_22 = new roH_2();
            roH_2 roH_23 = new roH_2();
            roH_2 roH_24 = new roH_2();
            for (n = 0; n < 16; ++n) {
                for (int j = 0; j < 16; ++j) {
                    for (int k = 0; k < 16; ++k) {
                        int n3 = n << 11 | k << 7 | j + (i << 4);
                        byte by = rog_32.id_catch[n3];
                        byArray[j << 8 | k << 4 | n] = (byte)(by & 0xFF);
                        roH_22.id_class(n, j, k, rog_32.id_case.id_class(n, j + (i << 4), k));
                        roH_23.id_class(n, j, k, rog_32.id_throws.id_class(n, j + (i << 4), k));
                        roH_24.id_class(n, j, k, rog_32.id_protected.id_class(n, j + (i << 4), k));
                    }
                }
            }
            rcd_3 rcd_33 = new rcd_3();
            rcd_33.id_class("Y", (byte)(i & 0xFF));
            rcd_33.id_class("Blocks", byArray);
            rcd_33.id_class("Data", roH_22.id_class());
            rcd_33.id_class("SkyLight", roH_23.id_class());
            rcd_33.id_class("BlockLight", roH_24.id_class());
            rcy_32.add(rcd_33);
        }
        rcd_32.id_class("Sections", rcy_32);
        rcd_32.id_class("Biomes", new rYZ(rVv_12.id_break(rVL.n), new rfj_3(rog_32.id_extends, rog_32.id_native), rYY2).id_class());
        rcd_32.id_class("Entities", rog_32.id_private);
        rcd_32.id_class("TileEntities", rog_32.id_implements);
        if (rog_32.id_finally != null) {
            rcd_32.id_class("TileTicks", rog_32.id_finally);
        }
        rcd_32.id_class("convertedFromAlphaFormat", true);
    }
}

