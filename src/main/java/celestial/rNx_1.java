/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.eL_2;
import celestial.ev_3;
import celestial.rNl_1;
import celestial.rQz_1;
import celestial.rVL;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rxy_3;
import celestial.rzO_2;
import celestial.rzh_3;
import celestial.rzr_3;
import celestial.rzx_3;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rNx_1
extends rzO_2 {
    private static final Logger id_break = LogManager.getLogger();
    public final List<ev_3> id_byte;

    public static rzh_3<?> id_byte() {
        return rNx_1.id_class(rQz_1Array -> new rNx_1((rQz_1[])rQz_1Array, (Collection<ev_3>)ImmutableList.of()));
    }

    public rNx_1(rQz_1[] rQz_1Array, Collection<ev_3> collection) {
        super(rQz_1Array);
        this.id_byte = ImmutableList.copyOf(collection);
    }

    private static rdn_3 id_class(rdn_3 rdn_32, ev_3 ev_32, Random random) {
        int n = rfU_2.id_class(random, ev_32.id_throws(), ev_32.id_class());
        if (rdn_32.id_break() == rdy_3.XM) {
            rdn_32 = new rdn_3(rdy_3.dm);
            rxy_3.id_class(rdn_32, new eL_2(ev_32, n));
        } else {
            rdn_32.id_class(ev_32, n);
        }
        return rdn_32;
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_protected;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        ev_3 ev_33;
        Random random = rzr_32.id_class();
        if (this.id_byte.isEmpty()) {
            boolean bl = rdn_32.id_break() == rdy_3.XM;
            List list = rVL.id_boolean.id_case().filter(ev_3::id_implements).filter(ev_32 -> bl || ev_32.id_class(rdn_32)).collect(Collectors.toList());
            if (list.isEmpty()) {
                id_break.warn("Couldn't find a compatible enchantment for {}", (Object)rdn_32);
                return rdn_32;
            }
            ev_33 = (ev_3)list.get(random.nextInt(list.size()));
        } else {
            ev_33 = this.id_byte.get(random.nextInt(this.id_byte.size()));
        }
        return rNx_1.id_class(rdn_32, ev_33, random);
    }
}

