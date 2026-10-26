/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rWN;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rxA_2;
import celestial.rxV_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Map;

public class rkq_3
extends rWN {
    private static final rkg_3 id_class = rkg_3.id_class(rdy_3.xa, rdy_3.Oi, rdy_3.JF, rdy_3.dh, rdy_3.dX, rdy_3.dd, rdy_3.dJ, rdy_3.dk, rdy_3.dx);
    private static final rkg_3 id_break = rkg_3.id_class(rdy_3.OJ);
    private static final rkg_3 id_byte = rkg_3.id_class(rdy_3.XW);
    private static final Map<rdb_3, rxV_2> id_protected = rqR_2.id_class(Maps.newHashMap(), hashMap -> {
        hashMap.put(rdy_3.xa, rxV_2.LARGE_BALL);
        hashMap.put(rdy_3.Oi, rxV_2.BURST);
        hashMap.put(rdy_3.JF, rxV_2.STAR);
        hashMap.put(rdy_3.dh, rxV_2.CREEPER);
        hashMap.put(rdy_3.dX, rxV_2.CREEPER);
        hashMap.put(rdy_3.dd, rxV_2.CREEPER);
        hashMap.put(rdy_3.dJ, rxV_2.CREEPER);
        hashMap.put(rdy_3.dk, rxV_2.CREEPER);
        hashMap.put(rdy_3.dx, rxV_2.CREEPER);
    });
    private static final rkg_3 id_throws = rkg_3.id_class(rdy_3.hr);

    @Override
    public rdn_3 id_byte() {
        return new rdn_3(rdy_3.du);
    }

    public rkq_3(rqO_2 rqO_22) {
        super(rqO_22);
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n * n2 >= 2;
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        rdn_3 rdn_32 = new rdn_3(rdy_3.du);
        rcd_3 rcd_32 = rdn_32.id_class("Explosion");
        rxV_2 rxV_22 = rxV_2.SMALL_BALL;
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_33 = rXk_12.id_extends(i);
            if (rdn_33.id_class()) continue;
            if (id_class.id_class(rdn_33)) {
                rxV_22 = id_protected.get(rdn_33.id_break());
                continue;
            }
            if (id_byte.id_class(rdn_33)) {
                rcd_32.id_class("Flicker", true);
                continue;
            }
            if (id_break.id_class(rdn_33)) {
                rcd_32.id_class("Trail", true);
                continue;
            }
            if (!(rdn_33.id_break() instanceof rxA_2)) continue;
            arrayList.add(((rxA_2)rdn_33.id_break()).id_byte().id_case());
        }
        rcd_32.id_class("Colors", arrayList);
        rcd_32.id_class("Type", (byte)rxV_22.id_class());
        return rdn_32;
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_32 = rXk_12.id_extends(i);
            if (rdn_32.id_class()) continue;
            if (id_class.id_class(rdn_32)) {
                if (bl3) {
                    return false;
                }
                bl3 = true;
                continue;
            }
            if (id_byte.id_class(rdn_32)) {
                if (bl5) {
                    return false;
                }
                bl5 = true;
                continue;
            }
            if (id_break.id_class(rdn_32)) {
                if (bl4) {
                    return false;
                }
                bl4 = true;
                continue;
            }
            if (id_throws.id_class(rdn_32)) {
                if (bl) {
                    return false;
                }
                bl = true;
                continue;
            }
            if (!(rdn_32.id_break() instanceof rxA_2)) {
                return false;
            }
            bl2 = true;
        }
        return bl && bl2;
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_private;
    }
}

