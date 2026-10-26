/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package celestial;

import celestial.Ml_1;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.roN_2;
import celestial.row_3;
import celestial.rqR_2;
import celestial.vm_3;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class vo_3
extends vm_3 {
    private final row_3 id_class;
    private long id_throws = -1L;
    private static final Object2IntMap<roN_2> id_case = (Object2IntMap)rqR_2.id_class(new Object2IntOpenHashMap(), object2IntOpenHashMap -> {
        object2IntOpenHashMap.defaultReturnValue(0);
        object2IntOpenHashMap.put((Object)roN_2.id_class, 0x545454);
        object2IntOpenHashMap.put((Object)roN_2.id_break, 0x999999);
        object2IntOpenHashMap.put((Object)roN_2.id_byte, 6250897);
        object2IntOpenHashMap.put((Object)roN_2.id_protected, 8434258);
        object2IntOpenHashMap.put((Object)roN_2.id_throws, 0xD1D1D1);
        object2IntOpenHashMap.put((Object)roN_2.id_case, 7497737);
        object2IntOpenHashMap.put((Object)roN_2.id_catch, 7169628);
        object2IntOpenHashMap.put((Object)roN_2.id_private, 3159410);
        object2IntOpenHashMap.put((Object)roN_2.id_implements, 2213376);
        object2IntOpenHashMap.put((Object)roN_2.id_finally, 0xCCCCCC);
        object2IntOpenHashMap.put((Object)roN_2.id_extends, 15884384);
        object2IntOpenHashMap.put((Object)roN_2.id_native, 0xEEEEEE);
        object2IntOpenHashMap.put((Object)roN_2.id_volatile, 0xFFFFFF);
    });

    public vo_3(row_3 row_32) {
        super(rgN_2.id_byte);
        this.id_class = row_32;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        String string = rfU_2.id_class(this.id_class.id_throws(), 0, 100) + "%";
        long l = rqR_2.id_break();
        if (l - this.id_throws > 2000L) {
            this.id_throws = l;
        }
        int n3 = this.id_package / 2;
        int n4 = this.id_int / 2;
        int n5 = 30;
        vo_3.id_class(ml_1, this.id_class, n3, n4 + 30, 2, 0);
        vo_3.id_class(ml_1, this.id_super, string, n3, n4 - 4 - 30, 0xFFFFFF);
    }

    public static void id_class(Ml_1 ml_1, row_3 row_32, int n, int n2, int n3, int n4) {
        int n5 = n3 + n4;
        int n6 = row_32.id_byte();
        int n7 = n6 * n5 - n4;
        int n8 = row_32.id_protected();
        int n9 = n8 * n5 - n4;
        int n10 = n - n9 / 2;
        int n11 = n2 - n9 / 2;
        int n12 = n7 / 2 + 1;
        int n13 = -16772609;
        if (n4 != 0) {
            vo_3.id_class(ml_1, n - n12, n2 - n12, n - n12 + 1, n2 + n12, -16772609);
            vo_3.id_class(ml_1, n + n12 - 1, n2 - n12, n + n12, n2 + n12, -16772609);
            vo_3.id_class(ml_1, n - n12, n2 - n12, n + n12, n2 - n12 + 1, -16772609);
            vo_3.id_class(ml_1, n - n12, n2 + n12 - 1, n + n12, n2 + n12, -16772609);
        }
        for (int i = 0; i < n8; ++i) {
            for (int j = 0; j < n8; ++j) {
                roN_2 roN_22 = row_32.id_class(i, j);
                int n14 = n10 + i * n5;
                int n15 = n11 + j * n5;
                vo_3.id_class(ml_1, n14, n15, n14 + n3, n15 + n3, id_case.getInt((Object)roN_22) | 0xFF000000);
            }
        }
    }

    @Override
    public boolean E_() {
        return false;
    }

    @Override
    public void w_() {
        super.w_();
    }
}

