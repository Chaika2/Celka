/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Codec
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rKd_1;
import celestial.rKm_1;
import celestial.rRR;
import celestial.rUV;
import celestial.rUo_1;
import celestial.rUt_1;
import celestial.rUv_1;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rYG;
import celestial.rYY;
import celestial.rYf_1;
import celestial.raB_2;
import celestial.raF_2;
import celestial.raI_2;
import celestial.raK_2;
import celestial.raZ_2;
import celestial.rae_3;
import celestial.ran_3;
import celestial.raq_3;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.reP_2;
import celestial.reV_2;
import celestial.reY_2;
import celestial.rey_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.riH_2;
import celestial.riL_2;
import celestial.riT_2;
import celestial.riU_2;
import celestial.rij_3;
import celestial.rin_3;
import celestial.rio_3;
import celestial.rjh_3;
import celestial.roC_2;
import celestial.roN_2;
import celestial.rqO_2;
import celestial.rqm_3;
import celestial.rrPt_1;
import celestial.rrSI;
import celestial.rrrA;
import celestial.rrrH;
import celestial.rrrI;
import celestial.rrrf_1;
import celestial.rrri_1;
import celestial.rrrn_1;
import celestial.rrrq_1;
import celestial.rrru_1;
import celestial.rrrv_1;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrrZ<C extends rUv_1> {
    public static final BiMap<String, rrrZ<?>> id_class = HashBiMap.create();
    private static final Map<rrrZ<?>, rKm_1> id_else = Maps.newHashMap();
    private static final Logger id_synchronized = LogManager.getLogger();
    public static final rrrZ<rrrI> id_break = rrrZ.id_class("Pillager_Outpost", new riT_2(rrrI.id_class), rKm_1.SURFACE_STRUCTURES);
    public static final rrrZ<raI_2> id_byte = rrrZ.id_class("Mineshaft", new raK_2(raI_2.id_class), rKm_1.UNDERGROUND_STRUCTURES);
    public static final rrrZ<rUt_1> id_protected = rrrZ.id_class("Mansion", new rrri_1(rUt_1.id_class), rKm_1.SURFACE_STRUCTURES);
    public static final rrrZ<rUt_1> id_throws = rrrZ.id_class("Jungle_Pyramid", new raq_3(rUt_1.id_class), rKm_1.SURFACE_STRUCTURES);
    public static final rrrZ<rUt_1> id_case = rrrZ.id_class("Desert_Pyramid", new reY_2(rUt_1.id_class), rKm_1.SURFACE_STRUCTURES);
    public static final rrrZ<rUt_1> id_catch = rrrZ.id_class("Igloo", new ran_3(rUt_1.id_class), rKm_1.SURFACE_STRUCTURES);
    public static final rrrZ<rUo_1> id_private = rrrZ.id_class("Ruined_Portal", new rij_3(rUo_1.id_class), rKm_1.SURFACE_STRUCTURES);
    public static final rrrZ<rio_3> id_implements = rrrZ.id_class("Shipwreck", new riU_2(rio_3.id_class), rKm_1.SURFACE_STRUCTURES);
    public static final rrrq_1 id_finally = rrrZ.id_class("Swamp_Hut", new rrrq_1(rUt_1.id_class), rKm_1.SURFACE_STRUCTURES);
    public static final rrrZ<rUt_1> id_extends = rrrZ.id_class("Stronghold", new rrru_1(rUt_1.id_class), rKm_1.STRONGHOLDS);
    public static final rrrZ<rUt_1> id_native = rrrZ.id_class("Monument", new riL_2(rUt_1.id_class), rKm_1.SURFACE_STRUCTURES);
    public static final rrrZ<rin_3> id_volatile = rrrZ.id_class("Ocean_Ruin", new riH_2(rin_3.id_class), rKm_1.SURFACE_STRUCTURES);
    public static final rrrZ<rUt_1> id_final = rrrZ.id_class("Fortress", new raZ_2(rUt_1.id_class), rKm_1.UNDERGROUND_DECORATION);
    public static final rrrZ<rUt_1> id_package = rrrZ.id_class("EndCity", new raB_2(rUt_1.id_class), rKm_1.SURFACE_STRUCTURES);
    public static final rrrZ<rUV> id_int = rrrZ.id_class("Buried_Treasure", new reV_2(rUV.id_class), rKm_1.UNDERGROUND_STRUCTURES);
    public static final rrrZ<rrrI> id_new = rrrZ.id_class("Village", new rrrf_1(rrrI.id_class), rKm_1.SURFACE_STRUCTURES);
    public static final rrrZ<rUt_1> id_continue = rrrZ.id_class("Nether_Fossil", new rae_3(rUt_1.id_class), rKm_1.UNDERGROUND_DECORATION);
    public static final rrrZ<rrrI> id_super = rrrZ.id_class("Bastion_Remnant", new rey_3(rrrI.id_class), rKm_1.SURFACE_STRUCTURES);
    public static final List<rrrZ<?>> id_this = ImmutableList.of(id_break, id_new, id_continue);
    private static final rqO_2 id_return = new rqO_2("jigsaw");
    private static final Map<rqO_2, rqO_2> id_public = ImmutableMap.builder().put((Object)new rqO_2("nvi"), (Object)id_return).put((Object)new rqO_2("pcp"), (Object)id_return).put((Object)new rqO_2("bastionremnant"), (Object)id_return).put((Object)new rqO_2("runtime"), (Object)id_return).build();
    private final Codec<reP_2<C, rrrZ<C>>> id_goto;

    public List<rYf_1> id_byte() {
        return ImmutableList.of();
    }

    public rrrZ(Codec<C> codec) {
        this.id_goto = codec.fieldOf("config").xmap(rUv_12 -> new reP_2<rUv_1, rrrZ>(this, (rUv_1)rUv_12), reP_22 -> reP_22.id_throws).codec();
    }

    private rrrH<C> id_class(int n, int n2, rfi_3 rfi_32, int n3, long l) {
        return this.id_class().create(this, n, n2, rfi_32, n3, l);
    }

    public rrrH<?> id_class(rVm_1 rVm_12, rKd_1 rKd_12, rYY rYY2, rrPt_1 rrPt_12, long l, rfj_3 rfj_32, rYG rYG2, int n, rqm_3 rqm_32, rrSI rrSI2, C c) {
        rfj_3 rfj_33 = this.id_class(rrSI2, l, rqm_32, rfj_32.id_break, rfj_32.id_byte);
        if (rfj_32.id_break == rfj_33.id_break && rfj_32.id_byte == rfj_33.id_byte && this.id_class(rKd_12, rYY2, l, rqm_32, rfj_32.id_break, rfj_32.id_byte, rYG2, rfj_33, c)) {
            rrrH<C> rrrH2 = this.id_class(rfj_32.id_break, rfj_32.id_byte, rfi_3.id_class(), n, l);
            rrrH2.id_class(rVm_12, rKd_12, rrPt_12, rfj_32.id_break, rfj_32.id_byte, rYG2, c);
            if (rrrH2.id_throws()) {
                return rrrH2;
            }
        }
        return rrrH.id_class;
    }

    protected boolean id_class(rKd_1 rKd_12, rYY rYY2, long l, rqm_3 rqm_32, int n, int n2, rYG rYG2, rfj_3 rfj_32, C c) {
        return true;
    }

    public final rfj_3 id_class(rrSI rrSI2, long l, rqm_3 rqm_32, int n, int n2) {
        int n3;
        int n4;
        int n5 = rrSI2.id_class();
        int n6 = rrSI2.id_break();
        int n7 = Math.floorDiv(n, n5);
        int n8 = Math.floorDiv(n2, n5);
        rqm_32.id_class(l, n7, n8, rrSI2.id_byte());
        if (this.id_break()) {
            n4 = rqm_32.nextInt(n5 - n6);
            n3 = rqm_32.nextInt(n5 - n6);
        } else {
            n4 = (rqm_32.nextInt(n5 - n6) + rqm_32.nextInt(n5 - n6)) / 2;
            n3 = (rqm_32.nextInt(n5 - n6) + rqm_32.nextInt(n5 - n6)) / 2;
        }
        return new rfj_3(n7 * n5 + n4, n8 * n5 + n3);
    }

    public abstract rrrv_1<C> id_class();

    private static <F extends rrrZ<?>> F id_class(String string, F f, rKm_1 rKm_12) {
        id_class.put((Object)string.toLowerCase(Locale.ROOT), f);
        id_else.put(f, rKm_12);
        return (F)rVL.id_class(rVL.t, string.toLowerCase(Locale.ROOT), f);
    }

    public reP_2<C, ? extends rrrZ<C>> id_class(C c) {
        return new reP_2<C, rrrZ>(this, c);
    }

    public rfH_2 id_class(rRR rRR2, rrrA rrrA2, rfH_2 rfH_22, int n, boolean bl, long l, rrSI rrSI2) {
        int n2 = rrSI2.id_class();
        int n3 = rfH_22.b_() >> 4;
        int n4 = rfH_22.d_() >> 4;
        rqm_3 rqm_32 = new rqm_3();
        block0: for (int i = 0; i <= n; ++i) {
            for (int j = -i; j <= i; ++j) {
                boolean bl2 = j == -i || j == i;
                for (int k = -i; k <= i; ++k) {
                    boolean bl3;
                    boolean bl4 = bl3 = k == -i || k == i;
                    if (!bl2 && !bl3) continue;
                    int n5 = n3 + n2 * j;
                    int n6 = n4 + n2 * k;
                    rfj_3 rfj_32 = this.id_class(rrSI2, l, rqm_32, n5, n6);
                    roC_2 roC_22 = rRR2.id_class(rfj_32.id_break, rfj_32.id_byte, roN_2.id_break);
                    rrrH<?> rrrH2 = rrrA2.id_class(rjh_3.id_class(roC_22.id_private(), 0), this, roC_22);
                    if (rrrH2 != null && rrrH2.id_throws()) {
                        if (bl && rrrH2.id_private()) {
                            rrrH2.id_implements();
                            return rrrH2.id_class();
                        }
                        if (!bl) {
                            return rrrH2.id_class();
                        }
                    }
                    if (i == 0) break;
                }
                if (i == 0) continue block0;
            }
        }
        return null;
    }

    public static rrrH<?> id_class(rrPt_1 rrPt_12, rcd_3 rcd_32, long l) {
        String string = rcd_32.id_native("id");
        if ("INVALID".equals(string)) {
            return rrrH.id_class;
        }
        rrrZ<?> rrrZ2 = rVL.t.id_class(new rqO_2(string.toLowerCase(Locale.ROOT)));
        if (rrrZ2 == null) {
            id_synchronized.error("Unknown feature id: {}", (Object)string);
            return null;
        }
        int n = rcd_32.id_private("ChunkX");
        int n2 = rcd_32.id_private("ChunkZ");
        int n3 = rcd_32.id_private("references");
        rfi_3 rfi_32 = rcd_32.id_throws("BB") ? new rfi_3(rcd_32.id_final("BB")) : rfi_3.id_class();
        rcy_3 rcy_32 = rcd_32.id_protected("Children", 10);
        try {
            rrrH<?> rrrH2 = rrrZ2.id_class(n, n2, rfi_32, n3, l);
            for (int i = 0; i < rcy_32.size(); ++i) {
                rcd_3 rcd_33 = rcy_32.id_class(i);
                String string2 = rcd_33.id_native("id").toLowerCase(Locale.ROOT);
                rqO_2 rqO_22 = new rqO_2(string2);
                rqO_2 rqO_23 = id_public.getOrDefault(rqO_22, rqO_22);
                raF_2 raF_22 = rVL.I.id_class(rqO_23);
                if (raF_22 == null) {
                    id_synchronized.error("Unknown structure piece id: {}", (Object)rqO_23);
                    continue;
                }
                try {
                    rrrn_1 rrrn_12 = raF_22.load(rrPt_12, rcd_33);
                    rrrH2.id_protected().add(rrrn_12);
                    continue;
                }
                catch (Exception exception) {
                    id_synchronized.error("Exception loading structure piece with id {}", (Object)rqO_23, (Object)exception);
                }
            }
            return rrrH2;
        }
        catch (Exception exception) {
            id_synchronized.error("Failed Start with id {}", (Object)string, (Object)exception);
            return null;
        }
    }

    protected boolean id_break() {
        return true;
    }

    public static void id_throws() {
    }

    public String id_catch() {
        return (String)id_class.inverse().get((Object)this);
    }

    public Codec<reP_2<C, rrrZ<C>>> id_case() {
        return this.id_goto;
    }

    public rKm_1 id_protected() {
        return id_else.get(this);
    }

    public List<rYf_1> id_private() {
        return ImmutableList.of();
    }
}

