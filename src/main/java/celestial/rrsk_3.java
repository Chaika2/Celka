/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rCN;
import celestial.rRI;
import celestial.rRY;
import celestial.rVL;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rrsW_2;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class rrsk_3 {
    public static final Codec<rrsk_3> id_byte = rVL.rS.dispatch(rrsk_3::id_class, rrsW_2::id_class);

    protected void id_class(rRY rRY2, rfH_2 rfH_22, rCN rCN2, Set<rfH_2> set, rfi_3 rfi_32) {
        this.id_class(rRY2, rfH_22, (xc_3)xu_3.BD.id_continue().id_class(rCN2, true), set, rfi_32);
    }

    protected void id_class(rRY rRY2, rfH_2 rfH_22, xc_3 xc_32, Set<rfH_2> set, rfi_3 rfi_32) {
        rRY2.id_class(rfH_22, xc_32, 19);
        set.add(rfH_22);
        rfi_32.id_break(new rfi_3(rfH_22, rfH_22));
    }

    protected abstract rrsW_2<?> id_class();

    public abstract void id_class(rRI var1, Random var2, List<rfH_2> var3, List<rfH_2> var4, Set<rfH_2> var5, rfi_3 var6);
}

