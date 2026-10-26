/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Streams
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package celestial;

import celestial.kv_3;
import celestial.rHP;
import celestial.rYB;
import celestial.rca_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rlH_2;
import celestial.rlI_2;
import celestial.rlR_2;
import celestial.rlT_2;
import celestial.rle_3;
import celestial.rlg_3;
import celestial.rlj_3;
import celestial.rll_3;
import celestial.rlp_3;
import celestial.rlq_3;
import celestial.rpa_3;
import celestial.rqR_2;
import celestial.rqd_3;
import celestial.rrEm_1;
import celestial.rrPl_1;
import celestial.ruP_2;
import celestial.ryG_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Streams;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class rHr_1 {
    public static rll_3 id_class = new rlg_3();

    public static void id_class(rrEm_1 rrEm_12, rfH_2 rfH_23, rlT_2 rlT_22, int n) {
        rlT_22.id_class();
        rfH_2 rfH_24 = rfH_23.id_break(-n, 0, -n);
        rfH_2 rfH_25 = rfH_23.id_break(n, 0, n);
        rfH_2.id_break(rfH_24, rfH_25).filter(rfH_22 -> rrEm_12.id_byte((rfH_2)rfH_22).id_class(xu_3.Js)).forEach(rfH_22 -> {
            ryG_2 ryG_22 = (ryG_2)rrEm_12.id_class((rfH_2)rfH_22);
            rfH_2 rfH_23 = ryG_22.id_char();
            rfi_3 rfi_32 = rlH_2.id_break(ryG_22);
            rlH_2.id_class(rfi_32, rfH_23.c_(), rrEm_12);
        });
    }

    private static void id_class(rrEm_1 rrEm_12, rfH_2 rfH_22, String string) {
        ruP_2.id_class(rrEm_12, rfH_22, string, -2130771968, Integer.MAX_VALUE);
    }

    public static void id_class(rle_3 rle_32, String string) {
        rrEm_1 rrEm_12 = rle_32.id_throws();
        rfH_2 rfH_22 = rle_32.id_protected();
        rfH_2 rfH_23 = new rfH_2(-1, 1, -1);
        rfH_2 rfH_24 = rrPl_1.id_class(rfH_22.id_break(rfH_23), rpa_3.NONE, rle_32.id_final(), rfH_22);
        rrEm_12.id_break(rfH_24, xu_3.Xs.id_continue().id_class(rle_32.id_final()));
        xc_3 xc_32 = rrEm_12.id_byte(rfH_24);
        rdn_3 rdn_32 = rHr_1.id_class(rle_32.id_byte(), rle_32.id_extends(), string);
        kv_3.id_class((rYB)rrEm_12, rfH_24, xc_32, rdn_32);
    }

    public static void id_class(rle_3 rle_32, xd_3 xd_32) {
        rrEm_1 rrEm_12 = rle_32.id_throws();
        rfH_2 rfH_22 = rle_32.id_protected();
        rfH_2 rfH_23 = new rfH_2(-1, -1, -1);
        rfH_2 rfH_24 = rrPl_1.id_class(rfH_22.id_break(rfH_23), rpa_3.NONE, rle_32.id_final(), rfH_22);
        rrEm_12.id_break(rfH_24, xu_3.Sv.id_continue().id_class(rle_32.id_final()));
        rfH_2 rfH_25 = rfH_24.id_break(0, 1, 0);
        rrEm_12.id_break(rfH_25, xd_32.id_continue());
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                rfH_2 rfH_26 = rfH_24.id_break(i, -1, j);
                rrEm_12.id_break(rfH_26, xu_3.rw.id_continue());
            }
        }
    }

    public static void id_class(rle_3 rle_32) {
        Throwable throwable = rle_32.id_finally();
        String string = (rle_32.id_extends() ? "" : "(optional) ") + rle_32.id_byte() + " failed! " + rqR_2.id_protected(throwable);
        rHr_1.id_class(rle_32.id_throws(), rle_32.id_extends() ? rgF_2.RED : rgF_2.YELLOW, string);
        if (throwable instanceof rlq_3) {
            rlq_3 rlq_32 = (rlq_3)throwable;
            rHr_1.id_class(rle_32.id_throws(), rlq_32.id_break(), rlq_32.id_class());
        }
        id_class.id_class(rle_32);
    }

    public static Collection<rlp_3> id_class(Collection<rlj_3> collection) {
        HashMap hashMap = Maps.newHashMap();
        collection.forEach(rlj_32 -> {
            String string2 = rlj_32.id_throws();
            Collection collection = hashMap.computeIfAbsent(string2, string -> Lists.newArrayList());
            collection.add(rlj_32);
        });
        return hashMap.keySet().stream().flatMap(string -> {
            Collection collection = (Collection)hashMap.get(string);
            Consumer<rrEm_1> consumer = rlR_2.id_byte(string);
            MutableInt mutableInt = new MutableInt();
            return Streams.stream((Iterable)Iterables.partition((Iterable)collection, (int)100)).map(list -> new rlp_3(string + ":" + mutableInt.incrementAndGet(), collection, consumer));
        }).collect(Collectors.toList());
    }

    public static Collection<rle_3> id_class(Collection<rlp_3> collection, rfH_2 rfH_22, rqd_3 rqd_32, rrEm_1 rrEm_12, rlT_2 rlT_22, int n) {
        rlI_2 rlI_22 = new rlI_2(collection, rfH_22, rqd_32, rrEm_12, rlT_22, n);
        rlI_22.id_break();
        return rlI_22.id_class();
    }

    public static void id_class(rle_3 rle_32, rfH_2 rfH_22, rlT_2 rlT_22) {
        rle_32.id_class();
        rlT_22.id_class(rle_32);
        rle_32.id_class(new rHP());
        rle_32.id_class(rfH_22, 2);
    }

    public static void id_class(rrEm_1 rrEm_12) {
        ruP_2.id_class(rrEm_12);
    }

    private static rdn_3 id_class(String string2, boolean bl, String string3) {
        rdn_3 rdn_32 = new rdn_3(rdy_3.xi);
        rcy_3 rcy_32 = new rcy_3();
        StringBuffer stringBuffer = new StringBuffer();
        Arrays.stream(string2.split("\\.")).forEach(string -> stringBuffer.append((String)string).append('\n'));
        if (!bl) {
            stringBuffer.append("(optional)\n");
        }
        stringBuffer.append("-------------------\n");
        rcy_32.add(rca_3.id_class(stringBuffer.toString() + string3));
        rdn_32.id_class("pages", rcy_32);
        return rdn_32;
    }

    private static void id_class(rrEm_1 rrEm_12, rgF_2 rgF_22, String string) {
        rrEm_12.id_class(rhN_22 -> true).forEach(rhN_22 -> rhN_22.id_class((rgP_2)new rgN_2(string).id_class(rgF_22), rqR_2.id_break));
    }

    public static Collection<rle_3> id_break(Collection<rlj_3> collection, rfH_2 rfH_22, rqd_3 rqd_32, rrEm_1 rrEm_12, rlT_2 rlT_22, int n) {
        return rHr_1.id_class(rHr_1.id_class(collection), rfH_22, rqd_32, rrEm_12, rlT_22, n);
    }
}

