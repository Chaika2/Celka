/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.JL;
import celestial.rFy_1;
import celestial.rHE;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rpA_2;
import celestial.rxL_2;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xS_2;
import celestial.xc_3;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class rHb_1
extends ryO_2
implements rpA_2 {
    private rgP_2 id_class;
    private rxL_2 id_break = rxL_2.WHITE;
    private rcy_3 id_byte;
    private boolean id_protected;
    private List<Pair<rHE, rxL_2>> id_throws;

    public static void id_byte(rdn_3 rdn_32) {
        rcy_3 rcy_32;
        rcd_3 rcd_32 = rdn_32.id_break("BlockEntityTag");
        if (rcd_32 != null && rcd_32.id_byte("Patterns", 9) && !(rcy_32 = rcd_32.id_protected("Patterns", 10)).isEmpty()) {
            rcy_32.id_byte(rcy_32.size() - 1);
            if (rcy_32.isEmpty()) {
                rdn_32.id_byte("BlockEntityTag");
            }
        }
    }

    public rHb_1() {
        super(ryW_2.id_super);
    }

    public rHb_1(rxL_2 rxL_22) {
        this();
        this.id_break = rxL_22;
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.id_byte != null) {
            rcd_32.id_class("Patterns", this.id_byte);
        }
        if (this.id_class != null) {
            rcd_32.id_class("CustomName", rgB_2.id_class(this.id_class));
        }
        return rcd_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        if (rcd_32.id_byte("CustomName", 8)) {
            this.id_class = rgB_2.id_class(rcd_32.id_native("CustomName"));
        }
        this.id_break = this.id_interface() ? ((JL)this.id_abstract().id_break()).id_break() : null;
        this.id_byte = rcd_32.id_protected("Patterns", 10);
        this.id_throws = null;
        this.id_protected = true;
    }

    public rdn_3 id_class(xc_3 xc_32) {
        rdn_3 rdn_32 = new rdn_3(xS_2.id_class(this.id_class(() -> xc_32)));
        if (this.id_byte != null && !this.id_byte.isEmpty()) {
            rdn_32.id_class("BlockEntityTag").id_class("Patterns", this.id_byte.id_protected());
        }
        if (this.id_class != null) {
            rdn_32.id_class(this.id_class);
        }
        return rdn_32;
    }

    public static List<Pair<rHE, rxL_2>> id_class(rxL_2 rxL_22, rcy_3 rcy_32) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(Pair.of((Object)((Object)rHE.BASE), (Object)rxL_22));
        if (rcy_32 != null) {
            for (int i = 0; i < rcy_32.size(); ++i) {
                rcd_3 rcd_32 = rcy_32.id_class(i);
                rHE rHE2 = rHE.id_class(rcd_32.id_native("Pattern"));
                if (rHE2 == null) continue;
                int n = rcd_32.id_private("Color");
                arrayList.add(Pair.of((Object)((Object)rHE2), (Object)rxL_2.id_class(n)));
            }
        }
        return arrayList;
    }

    public void id_class(rdn_3 rdn_32, rxL_2 rxL_22) {
        this.id_byte = rHb_1.id_class(rdn_32);
        this.id_break = rxL_22;
        this.id_throws = null;
        this.id_protected = true;
        this.id_class = rdn_32.id_this() ? rdn_32.id_continue() : null;
    }

    public static rcy_3 id_class(rdn_3 rdn_32) {
        rcy_3 rcy_32 = null;
        rcd_3 rcd_32 = rdn_32.id_break("BlockEntityTag");
        if (rcd_32 != null && rcd_32.id_byte("Patterns", 9)) {
            rcy_32 = rcd_32.id_protected("Patterns", 10).id_protected();
        }
        return rcy_32;
    }

    public rxL_2 id_class(Supplier<xc_3> supplier) {
        if (this.id_break == null) {
            this.id_break = ((JL)supplier.get().id_break()).id_break();
        }
        return this.id_break;
    }

    public void id_class(rgP_2 rgP_22) {
        this.id_class = rgP_22;
    }

    @Override
    public rgP_2 g() {
        return this.id_class != null ? this.id_class : new rgn_3("block.minecraft.banner");
    }

    public static int id_break(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_break("BlockEntityTag");
        return rcd_32 != null && rcd_32.id_throws("Patterns") ? rcd_32.id_protected("Patterns", 10).size() : 0;
    }

    public List<Pair<rHE, rxL_2>> id_throws() {
        if (this.id_throws == null && this.id_protected) {
            this.id_throws = rHb_1.id_class(this.id_class(this::id_abstract), this.id_byte);
        }
        return this.id_throws;
    }

    @Override
    public rgP_2 rD() {
        return this.id_class;
    }

    @Override
    public rFy_1 Y_() {
        return new rFy_1(this.id_native, 6, this.Z_());
    }

    @Override
    public rcd_3 Z_() {
        return this.id_class(new rcd_3());
    }
}

