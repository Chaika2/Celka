/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.DataFixUtils
 *  it.unimi.dsi.fastutil.longs.LongSets
 *  it.unimi.dsi.fastutil.longs.LongSets$EmptySet
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 */
package celestial;

import celestial.Cy_1;
import celestial.Hh_1;
import celestial.JC;
import celestial.Ml_1;
import celestial.Oh_1;
import celestial.PX;
import celestial.QY;
import celestial.Qn_1;
import celestial.Qw_1;
import celestial.Vq_1;
import celestial.aH_2;
import celestial.an_3;
import celestial.cb_3;
import celestial.ch_3;
import celestial.cm_3;
import celestial.fJ_2;
import celestial.gm_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rCZ;
import celestial.rCn_1;
import celestial.rKv_1;
import celestial.rRh_1;
import celestial.rRo_1;
import celestial.rRq_1;
import celestial.rVL;
import celestial.rXE;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfj_3;
import celestial.rgF_2;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjV_2;
import celestial.rja_3;
import celestial.rjo_3;
import celestial.rng_3;
import celestial.roJ_2;
import celestial.roN_2;
import celestial.rpN_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqu_3;
import celestial.rrEg_1;
import celestial.rrEm_1;
import celestial.rrMd_1;
import celestial.rrMh_1;
import celestial.rrQX;
import celestial.rrWC;
import celestial.rrWU;
import celestial.rrWe_1;
import celestial.rrWl_1;
import celestial.rrWn_1;
import celestial.rrbb_3;
import celestial.rrse_3;
import celestial.rrxr_3;
import celestial.rud_3;
import celestial.yX_2;
import celestial.yb_3;
import celestial.yk_3;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.DataFixUtils;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class uV_2
extends ch_3 {
    private static final Map<rKv_1, String> id_class = rqR_2.id_class(new EnumMap(rKv_1.class), (T enumMap) -> {
        enumMap.put(rKv_1.WORLD_SURFACE_WG, "SW");
        enumMap.put(rKv_1.WORLD_SURFACE, "S");
        enumMap.put(rKv_1.OCEAN_FLOOR_WG, "OW");
        enumMap.put(rKv_1.OCEAN_FLOOR, "O");
        enumMap.put(rKv_1.MOTION_BLOCKING, "M");
        enumMap.put(rKv_1.MOTION_BLOCKING_NO_LEAVES, "ML");
    });
    private final QY id_throws;
    private final cm_3 id_case;
    private rjG_2 id_catch;
    private rjG_2 id_private;
    private rfj_3 id_implements;
    private roJ_2 id_finally;
    private CompletableFuture<roJ_2> id_extends;
    private String id_native = null;
    private List<String> id_volatile = null;
    private List<String> id_final = null;
    private long id_package = 0L;
    private long id_int = 0L;
    private final List<Float> id_new = new ArrayList<Float>();
    private final List<Float> id_continue = new ArrayList<Float>();

    protected void id_byte(Ml_1 ml_1) {
        List<String> list = this.id_final;
        if (list == null || System.currentTimeMillis() > this.id_int) {
            this.id_final = list = this.id_case();
            this.id_int = System.currentTimeMillis() + 100L;
        }
        rrWn_1[] rrWn_1Array = new rrWn_1[list.size()];
        rrWC[] rrWCArray = new rrWC[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            String string = list.get(i);
            if (Strings.isNullOrEmpty((String)string)) continue;
            int n = 9;
            int n2 = this.id_case.id_break(string);
            int n3 = this.id_throws.id_else().id_super() - 2 - n2;
            int n4 = 2 + n * i;
            rrWCArray[i] = new rrWC(n3 - 1, n4 - 1, n3 + n2 + 1, n4 + n - 1);
            rrWn_1Array[i] = new rrWn_1(n3, n4);
        }
        rrWl_1.id_class(ml_1.id_byte().id_class(), rrWCArray, -1873784752);
        this.id_case.id_class(list, rrWn_1Array, 0xE0E0E0, ml_1.id_byte().id_class(), false, this.id_case.id_class());
    }

    public uV_2(QY qY) {
        this.id_throws = qY;
        this.id_case = (cm_3)qY.id_class[15];
    }

    private static long id_class(long l) {
        return l / 1024L / 1024L;
    }

    private int id_class(int n, int n2, float f) {
        int n3 = n >> 24 & 0xFF;
        int n4 = n >> 16 & 0xFF;
        int n5 = n >> 8 & 0xFF;
        int n6 = n & 0xFF;
        int n7 = n2 >> 24 & 0xFF;
        int n8 = n2 >> 16 & 0xFF;
        int n9 = n2 >> 8 & 0xFF;
        int n10 = n2 & 0xFF;
        int n11 = rfU_2.id_class((int)rfU_2.id_catch(f, n3, n7), 0, 255);
        int n12 = rfU_2.id_class((int)rfU_2.id_catch(f, n4, n8), 0, 255);
        int n13 = rfU_2.id_class((int)rfU_2.id_catch(f, n5, n9), 0, 255);
        int n14 = rfU_2.id_class((int)rfU_2.id_catch(f, n6, n10), 0, 255);
        return n11 << 24 | n12 << 16 | n13 << 8 | n14;
    }

    private String id_class(Map.Entry<rCZ<?>, Comparable<?>> entry) {
        rCZ<?> rCZ2 = entry.getKey();
        Comparable<?> comparable = entry.getValue();
        Object object = rqR_2.id_class(rCZ2, comparable);
        if (Boolean.TRUE.equals(comparable)) {
            object = rgF_2.GREEN + (String)object;
        } else if (Boolean.FALSE.equals(comparable)) {
            object = rgF_2.RED + (String)object;
        }
        return rCZ2.id_throws() + ": " + (String)object;
    }

    public void id_class() {
        this.id_extends = null;
        this.id_finally = null;
    }

    public void id_class(Ml_1 ml_1) {
        RenderSystem.pushMatrix();
        an_3 an_32 = this.id_throws.id_catch();
        this.id_catch = an_32.id_break(20.0, 0.0f, false);
        this.id_private = an_32.id_break(20.0, 0.0f, true);
        this.id_break(ml_1);
        this.id_byte(ml_1);
        RenderSystem.popMatrix();
        if (((Qw_1)this.id_throws.id_class[20]).o) {
            int n = this.id_throws.id_else().id_super();
            this.id_class(ml_1, this.id_throws.k(), 0, n / 2, true);
            rng_3 rng_32 = this.id_throws.id_this();
            if (rng_32 != null) {
                this.id_class(ml_1, rng_32.i(), n - Math.min(n / 2, 240), n / 2, false);
            }
        }
    }

    private void id_class(Ml_1 ml_1, rpN_2 rpN_22, int n, int n2, boolean bl) {
        if (!bl) {
            int n3;
            int n4 = (int)(512.0 / this.id_throws.id_else().id_return());
            n = Math.max(n, n4);
            n2 = this.id_throws.id_else().id_super() - n;
            RenderSystem.disableDepthTest();
            int n5 = rpN_22.id_class();
            int n6 = rpN_22.id_break();
            long[] lArray = rpN_22.id_byte();
            int n7 = n;
            int n8 = Math.max(0, lArray.length - n2);
            int n9 = lArray.length - n8;
            int n10 = rpN_22.id_class(n5 + n8);
            long l = 0L;
            int n11 = Integer.MAX_VALUE;
            int n12 = Integer.MIN_VALUE;
            for (n3 = 0; n3 < n9; ++n3) {
                int n13 = (int)(lArray[rpN_22.id_class(n10 + n3)] / 1000000L);
                n11 = Math.min(n11, n13);
                n12 = Math.max(n12, n13);
                l += (long)n13;
            }
            n3 = this.id_throws.id_else().id_this();
            uV_2.id_class(ml_1, n, n3 - 60, n + n9, n3, -1873784752);
            lD_2 lD_22 = yb_3.id_class().id_byte();
            RenderSystem.enableBlend();
            RenderSystem.disableTexture();
            RenderSystem.defaultBlendFunc();
            lD_22.id_class(7, ju_3.id_this);
            Object object = rjo_3.id_class().id_byte();
            while (n10 != n6) {
                int n14 = rpN_22.id_class(lArray[n10], bl ? 30 : 60, bl ? 60 : 20);
                int n15 = bl ? 100 : 60;
                int n16 = this.id_break(rfU_2.id_class(n14, 0, n15), 0, n15 / 2, n15);
                int n17 = n16 >> 24 & 0xFF;
                int n18 = n16 >> 16 & 0xFF;
                int n19 = n16 >> 8 & 0xFF;
                int n20 = n16 & 0xFF;
                lD_22.id_class((rjV_2)object, (float)(n7 + 1), (float)n3, 0.0f).id_break(n18, n19, n20, n17).id_class();
                lD_22.id_class((rjV_2)object, (float)(n7 + 1), (float)(n3 - n14 + 1), 0.0f).id_break(n18, n19, n20, n17).id_class();
                lD_22.id_class((rjV_2)object, (float)n7, (float)(n3 - n14 + 1), 0.0f).id_break(n18, n19, n20, n17).id_class();
                lD_22.id_class((rjV_2)object, (float)n7, (float)n3, 0.0f).id_break(n18, n19, n20, n17).id_class();
                ++n7;
                n10 = rpN_22.id_class(n10 + 1);
            }
            lD_22.id_finally();
            yk_3.id_class(lD_22);
            RenderSystem.enableTexture();
            RenderSystem.disableBlend();
            if (bl) {
                uV_2.id_class(ml_1, n + 1, n3 - 30 + 1, n + 14, n3 - 30 + 10, -1873784752);
                this.id_case.id_break(ml_1, "60 FPS", (float)(n + 2), (float)(n3 - 30 + 2), 0xE0E0E0);
                this.id_class(ml_1, n, n + n9 - 1, n3 - 30, -1);
                uV_2.id_class(ml_1, n + 1, n3 - 60 + 1, n + 14, n3 - 60 + 10, -1873784752);
                this.id_case.id_break(ml_1, "30 FPS", (float)(n + 2), (float)(n3 - 60 + 2), 0xE0E0E0);
                this.id_class(ml_1, n, n + n9 - 1, n3 - 60, -1);
            } else {
                uV_2.id_class(ml_1, n + 1, n3 - 60 + 1, n + 14, n3 - 60 + 10, -1873784752);
                this.id_case.id_break(ml_1, "20 TPS", (float)(n + 2), (float)(n3 - 60 + 2), 0xE0E0E0);
                this.id_class(ml_1, n, n + n9 - 1, n3 - 60, -1);
            }
            this.id_class(ml_1, n, n + n9 - 1, n3 - 1, -1);
            this.id_break(ml_1, n, n3 - 60, n3, -1);
            this.id_break(ml_1, n + n9 - 1, n3 - 60, n3, -1);
            if (bl && ((Qw_1)this.id_throws.id_class[20]).id_protected > 0 && ((Qw_1)this.id_throws.id_class[20]).id_protected <= 250) {
                this.id_class(ml_1, n, n + n9 - 1, n3 - 1 - (int)(1800.0 / (double)((Qw_1)this.id_throws.id_class[20]).id_protected), -16711681);
            }
            object = n11 + " ms min";
            String string = l / (long)n9 + " ms avg";
            String string2 = n12 + " ms max";
            this.id_case.id_class(ml_1, (String)object, (float)(n + 2), (float)(n3 - 60 - 9), 0xE0E0E0);
            this.id_case.id_class(ml_1, string, (float)(n + n9 / 2 - this.id_case.id_break(string) / 2), (float)(n3 - 60 - 9), 0xE0E0E0);
            this.id_case.id_class(ml_1, string2, (float)(n + n9 - this.id_case.id_break(string2)), (float)(n3 - 60 - 9), 0xE0E0E0);
            RenderSystem.enableDepthTest();
        }
    }

    protected void id_break(Ml_1 ml_1) {
        List<String> list = this.id_volatile;
        if (list == null || System.currentTimeMillis() > this.id_package) {
            list = this.id_protected();
            list.add("");
            boolean bl = this.id_throws.id_this() != null;
            list.add("Debug: Pie [shift]: " + (((Qw_1)this.id_throws.id_class[20]).Y ? "visible" : "hidden") + (bl ? " FPS + TPS" : " FPS") + " [alt]: " + (((Qw_1)this.id_throws.id_class[20]).o ? "visible" : "hidden"));
            list.add("For help: press F3 + Q");
            this.id_volatile = list;
            this.id_package = System.currentTimeMillis() + 100L;
        }
        rrWn_1[] rrWn_1Array = new rrWn_1[list.size()];
        rrWC[] rrWCArray = new rrWC[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            String string = list.get(i);
            if (Strings.isNullOrEmpty((String)string)) continue;
            int n = 9;
            int n2 = this.id_case.id_break(string);
            int n3 = 2;
            int n4 = 2 + n * i;
            rrWCArray[i] = new rrWC(1, n4 - 1, 2 + n2 + 1, n4 + n - 1);
            rrWn_1Array[i] = new rrWn_1(2, n4);
        }
        rrWl_1.id_class(ml_1.id_byte().id_class(), rrWCArray, -1873784752);
        this.id_case.id_class(list, rrWn_1Array, 0xE0E0E0, ml_1.id_byte().id_class(), false, this.id_case.id_class());
    }

    private int id_break(int n, int n2, int n3, int n4) {
        return n < n3 ? this.id_class(-16711936, -256, (float)n / (float)n3) : this.id_class(-256, -65536, (float)(n - n3) / (float)(n4 - n3));
    }

    protected List<String> id_throws() {
        Vq_1 vq_1;
        int n;
        rRq_1 rRq_12;
        rYB rYB2;
        rng_3 rng_32 = this.id_throws.id_this();
        rud_3 rud_32 = this.id_throws.id_void().id_class();
        float f = 0.0f;
        float f2 = 0.0f;
        String string = rng_32 != null ? String.format("Integrated server @ %.0f ms ticks, %.0f tx, %.0f rx", Float.valueOf(rng_32.a()), Float.valueOf(f), Float.valueOf(f2)) : String.format("\"%s\" server, %.0f tx, %.0f rx", ((cb_3)this.id_throws.id_class[57]).id_short(), Float.valueOf(f), Float.valueOf(f2));
        boolean bl = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_new();
        rfH_2 rfH_22 = this.id_throws.id_catch().Bs();
        if (bl) {
            rfH_22 = rfH_2.id_protected;
        }
        if (this.id_throws.E()) {
            return Lists.newArrayList((Object[])new String[]{"Minecraft " + rqu_3.id_class().getName() + " (" + this.id_throws.id_class() + "/" + Qn_1.id_class() + ")", (String)this.id_throws.id_class[79], string, ((yX_2)this.id_throws.id_class[8]).id_catch(), ((yX_2)this.id_throws.id_class[8]).id_implements(), "P: " + ((Cy_1)this.id_throws.id_class[12]).id_protected() + ". T: " + ((gm_3)this.id_throws.id_class[56]).id_case(), ((gm_3)this.id_throws.id_class[56]).id_for(), "", String.format("Chunk-relative: %d %d %d", rfH_22.b_() & 0xF, rfH_22.c_() & 0xF, rfH_22.d_() & 0xF)});
        }
        cb_3 cb_32 = (cb_3)this.id_throws.id_class[57];
        PX pX = cb_32.id_switch();
        rpr_3 rpr_32 = cb_32.id_int(pX.id_throws());
        String string2 = switch (rpr_32) {
            case rpr_3.NORTH -> "Towards negative Z";
            case rpr_3.SOUTH -> "Towards positive Z";
            case rpr_3.WEST -> "Towards negative X";
            case rpr_3.EAST -> "Towards positive X";
            default -> "Invalid";
        };
        rfj_3 rfj_32 = new rfj_3(rfH_22);
        if (!Objects.equals(this.id_implements, rfj_32)) {
            this.id_implements = rfj_32;
            this.id_class();
        }
        LongSets.EmptySet emptySet = (rYB2 = this.id_implements()) instanceof rrEm_1 ? ((rrEm_1)rYB2).x() : LongSets.EMPTY_SET;
        ArrayList arrayList = Lists.newArrayList((Object[])new String[]{"Minecraft " + rqu_3.id_class().getName() + " (" + this.id_throws.id_class() + "/" + Qn_1.id_class() + (String)("release".equalsIgnoreCase(this.id_throws.Q()) ? "" : "/" + this.id_throws.Q()) + ")", (String)this.id_throws.id_class[79], string, ((yX_2)this.id_throws.id_class[8]).id_catch(), ((yX_2)this.id_throws.id_class[8]).id_implements(), "P: " + ((Cy_1)this.id_throws.id_class[12]).id_protected() + ". T: " + ((gm_3)this.id_throws.id_class[56]).id_case(), ((gm_3)this.id_throws.id_class[56]).id_for()});
        String string3 = this.id_private();
        if (string3 != null) {
            arrayList.add(string3);
        }
        arrayList.add(((gm_3)this.id_throws.id_class[56]).E().id_class() + " FC: " + emptySet.size());
        arrayList.add("");
        double d = this.id_throws.id_catch().rx();
        double d2 = this.id_throws.id_catch().re();
        double d3 = this.id_throws.id_catch().BO();
        if (bl) {
            d = 0.0;
            d2 = 0.0;
            d3 = 0.0;
        }
        arrayList.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", d, d2, d3));
        arrayList.add(String.format("Block: %d %d %d", rfH_22.b_(), rfH_22.c_(), rfH_22.d_()));
        arrayList.add(String.format("Chunk: %d %d %d in %d %d %d", rfH_22.b_() & 0xF, rfH_22.c_() & 0xF, rfH_22.d_() & 0xF, rfH_22.b_() >> 4, rfH_22.c_() >> 4, rfH_22.d_() >> 4));
        arrayList.add(String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", rpr_32, string2, Float.valueOf(rfU_2.id_catch(pX.id_throws())), Float.valueOf(rfU_2.id_catch(pX.id_protected()))));
        if ((gm_3)this.id_throws.id_class[56] != null) {
            if (((gm_3)this.id_throws.id_class[56]).id_int(rfH_22)) {
                rRq_12 = this.id_extends();
                if (((roJ_2)rRq_12).id_catch()) {
                    arrayList.add("Waiting for chunk...");
                } else {
                    Object object;
                    int n2 = ((gm_3)this.id_throws.id_class[56]).id_native().id_class().id_break(rfH_22, 0);
                    int n3 = ((gm_3)this.id_throws.id_class[56]).id_class(rRo_1.SKY, rfH_22);
                    n = ((gm_3)this.id_throws.id_class[56]).id_class(rRo_1.BLOCK, rfH_22);
                    arrayList.add("Client Light: " + n2 + " (" + n3 + " sky, " + n + " block)");
                    roJ_2 roJ_22 = this.id_finally();
                    if (roJ_22 != null) {
                        object = rYB2.id_goto().id_class();
                        arrayList.add("Server Light: (" + ((rrse_3)object).id_class(rRo_1.SKY).id_class(rfH_22) + " sky, " + ((rrse_3)object).id_class(rRo_1.BLOCK).id_class(rfH_22) + " block)");
                    } else {
                        arrayList.add("Server Light: (?? sky, ?? block)");
                    }
                    object = new StringBuilder("CH");
                    for (rKv_1 object2 : rKv_1.values()) {
                        if (!object2.id_byte()) continue;
                        ((StringBuilder)object).append(" ").append(id_class.get(object2)).append(": ").append(((roJ_2)rRq_12).id_class(object2, rfH_22.b_(), rfH_22.d_()));
                    }
                    arrayList.add(((StringBuilder)object).toString());
                    ((StringBuilder)object).setLength(0);
                    ((StringBuilder)object).append("SH");
                    for (rKv_1 rKv_12 : rKv_1.values()) {
                        if (!rKv_12.id_protected()) continue;
                        ((StringBuilder)object).append(" ").append(id_class.get(rKv_12)).append(": ");
                        if (roJ_22 != null) {
                            ((StringBuilder)object).append(roJ_22.id_class(rKv_12, rfH_22.b_(), rfH_22.d_()));
                            continue;
                        }
                        ((StringBuilder)object).append("??");
                    }
                    arrayList.add(((StringBuilder)object).toString());
                    if (rfH_22.c_() >= 0 && rfH_22.c_() < 256) {
                        arrayList.add("Biome: " + ((gm_3)this.id_throws.id_class[56]).id_new().id_break(rVL.n).id_break(((gm_3)this.id_throws.id_class[56]).id_implements(rfH_22)));
                        long l = 0L;
                        float f3 = 0.0f;
                        if (roJ_22 != null) {
                            f3 = rYB2.id_interface();
                            l = roJ_22.id_this();
                        }
                        rRh_1 rRh_12 = new rRh_1(rYB2.id_abstract(), rYB2.P(), l, f3);
                        arrayList.add(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", Float.valueOf(rRh_12.id_break()), Float.valueOf(rRh_12.id_byte()), ((gm_3)this.id_throws.id_class[56]).P() / 24000L));
                    }
                }
            } else {
                arrayList.add("Outside of world...");
            }
        } else {
            arrayList.add("Outside of world...");
        }
        rRq_12 = this.id_catch();
        if (rRq_12 != null) {
            rrEg_1 rrEg_12 = ((rrEm_1)rRq_12).id_else().id_volatile();
            if (rrEg_12 != null) {
                Object2IntMap<aH_2> object2IntMap = rrEg_12.id_break();
                n = rrEg_12.id_class();
                arrayList.add("SC: " + n + ", " + Stream.of(aH_2.values()).map(aH_22 -> Character.toUpperCase(aH_22.id_break().charAt(0)) + ": " + object2IntMap.getInt(aH_22)).collect(Collectors.joining(", ")));
            } else {
                arrayList.add("SC: N/A");
            }
        }
        if ((vq_1 = ((Hh_1)this.id_throws.id_class[16]).id_throws()) != null) {
            arrayList.add("Shader: " + vq_1.id_class());
        }
        arrayList.add(this.id_throws.c().id_case() + String.format(" (Mood %d%%)", Math.round(((cb_3)this.id_throws.id_class[57]).id_double() * 100.0f)));
        return arrayList;
    }

    private roJ_2 id_finally() {
        if (this.id_extends == null) {
            rrEm_1 rrEm_12 = this.id_catch();
            if (rrEm_12 != null) {
                this.id_extends = rrEm_12.id_else().id_class(this.id_implements.id_break, this.id_implements.id_byte, roN_2.id_volatile, false).thenApply(either -> (roJ_2)either.map(roC_22 -> (roJ_2)roC_22, rrEM2 -> null));
            }
            if (this.id_extends == null) {
                this.id_extends = CompletableFuture.completedFuture(this.id_extends());
            }
        }
        return this.id_extends.getNow(null);
    }

    private rrEm_1 id_catch() {
        rng_3 rng_32 = this.id_throws.id_this();
        return rng_32 != null ? rng_32.id_class(((gm_3)this.id_throws.id_class[56]).E()) : null;
    }

    private roJ_2 id_extends() {
        if (this.id_finally == null) {
            this.id_finally = ((gm_3)this.id_throws.id_class[56]).id_throws(this.id_implements.id_break, this.id_implements.id_byte);
        }
        return this.id_finally;
    }

    protected List<String> id_case() {
        long l = Runtime.getRuntime().maxMemory();
        long l2 = Runtime.getRuntime().totalMemory();
        long l3 = Runtime.getRuntime().freeMemory();
        long l4 = l2 - l3;
        ArrayList arrayList = Lists.newArrayList((Object[])new String[]{String.format("Java: %s %dbit", System.getProperty("java.version"), this.id_throws.id_strictfp() ? 64 : 32), String.format("Mem: % 2d%% %03d/%03dMB", l4 * 100L / l, uV_2.id_class(l4), uV_2.id_class(l)), String.format("Allocated: % 2d%% %03dMB", l2 * 100L / l, uV_2.id_class(l2)), "", String.format("CPU: %s", Oh_1.id_break()), "", String.format("Display: %dx%d (%s)", QY.id_instanceof().id_else().id_extends(), QY.id_instanceof().id_else().id_native(), Oh_1.id_class()), Oh_1.id_byte(), Oh_1.id_protected()});
        long l5 = rrWe_1.id_class();
        long l6 = rrWe_1.id_break();
        long l7 = rrWe_1.id_byte();
        String string = "Native: " + uV_2.id_class(l5) + "/" + uV_2.id_class(l6) + "+" + uV_2.id_class(l7) + "MB";
        arrayList.add(3, string);
        arrayList.set(4, "Allocation: " + rrWU.id_case() + "MB/s");
        if (rrxr_3.id_byte.id_byte()) {
            arrayList.add("");
            for (Object object3 : (Set)rrxr_3.id_private(rrxr_3.id_byte, true, false)) {
                if (((String)object3).startsWith("Minecraft ")) continue;
                arrayList.add(object3);
            }
        }
        boolean bl = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_new();
        if (!this.id_throws.E()) {
            rqO_2 rqO_23;
            Object object;
            Iterator iterator2;
            Object object2;
            Object object3;
            if (this.id_catch.id_byte() == rjM_2.BLOCK) {
                object3 = bl ? rfH_2.id_protected : ((rff_3)this.id_catch).id_class();
                object2 = ((gm_3)this.id_throws.id_class[56]).id_byte((rfH_2)object3);
                arrayList.add("");
                arrayList.add(rgF_2.UNDERLINE + "Targeted Block: " + ((rja_3)object3).b_() + ", " + ((rja_3)object3).c_() + ", " + ((rja_3)object3).d_());
                arrayList.add(String.valueOf(rVL.id_strictfp.id_break(((JC)object2).id_break())));
                for (Iterator iterator2 : ((rCn_1)object2).id_goto().entrySet()) {
                    arrayList.add(this.id_class((Map.Entry<rCZ<?>, Comparable<?>>)((Object)iterator2)));
                }
                object = rrxr_3.X.id_byte() ? (Collection)rrxr_3.id_private(((JC)object2).id_break(), rrxr_3.X, new Object[0]) : this.id_throws.id_void().id_extends().id_class().id_class(((JC)object2).id_break());
                iterator2 = object.iterator();
                while (iterator2.hasNext()) {
                    rqO_23 = (rqO_2)iterator2.next();
                    arrayList.add("#" + rqO_23);
                }
            }
            if (this.id_private.id_byte() == rjM_2.BLOCK) {
                object3 = bl ? rfH_2.id_protected : ((rff_3)this.id_private).id_class();
                object2 = ((gm_3)this.id_throws.id_class[56]).id_break((rfH_2)object3);
                arrayList.add("");
                arrayList.add(rgF_2.UNDERLINE + "Targeted Fluid: " + ((rja_3)object3).b_() + ", " + ((rja_3)object3).c_() + ", " + ((rja_3)object3).d_());
                arrayList.add(String.valueOf(rVL.id_default.id_break(((rXE)object2).id_class())));
                for (Iterator iterator2 : ((rCn_1)object2).id_goto().entrySet()) {
                    arrayList.add(this.id_class((Map.Entry<rCZ<?>, Comparable<?>>)((Object)iterator2)));
                }
                object = rrxr_3.U.id_byte() ? (Collection)rrxr_3.id_private(((rXE)object2).id_class(), rrxr_3.U, new Object[0]) : this.id_throws.id_void().id_extends().id_byte().id_class(((rXE)object2).id_class());
                iterator2 = object.iterator();
                while (iterator2.hasNext()) {
                    rqO_23 = (rqO_2)iterator2.next();
                    arrayList.add("#" + rqO_23);
                }
            }
            if ((object3 = (an_3)this.id_throws.id_class[63]) != null) {
                this.id_new.add(Float.valueOf(((Float)((an_3)object3).id_throws[15]).floatValue()));
                this.id_continue.add(Float.valueOf(((Float)((an_3)object3).id_throws[16]).floatValue()));
                arrayList.add("");
                arrayList.add(rgF_2.UNDERLINE + "Targeted Entity");
                arrayList.add(String.valueOf(rVL.id_transient.id_break(((an_3)object3).BC())));
                if (rrxr_3.w.id_byte()) {
                    object2 = (Collection)rrxr_3.id_private(((an_3)object3).BC(), rrxr_3.w, new Object[0]);
                    object2.forEach(rqO_22 -> arrayList.add("#" + rqO_22));
                }
            } else {
                this.id_new.clear();
                this.id_continue.clear();
            }
        }
        return arrayList;
    }

    private rYB id_implements() {
        return (rYB)DataFixUtils.orElse(Optional.ofNullable(this.id_throws.id_this()).flatMap(rng_32 -> Optional.ofNullable(rng_32.id_class(((gm_3)this.id_throws.id_class[56]).E()))), (Object)((gm_3)this.id_throws.id_class[56]));
    }

    protected List<String> id_protected() {
        Object object;
        if ((String)this.id_throws.id_class[79] != this.id_native) {
            int n;
            object = new StringBuffer((String)this.id_throws.id_class[79]);
            int n2 = rrbb_3.rN();
            int n3 = ((String)this.id_throws.id_class[79]).indexOf("T: ");
            if (n3 >= 0) {
                ((StringBuffer)object).insert(n3, "(" + n2 + " chunk updates) ");
            }
            if ((n = ((String)this.id_throws.id_class[79]).indexOf(" fps ")) >= 0) {
                ((StringBuffer)object).replace(0, n + 4, rrbb_3.rk());
            }
            if (rrbb_3.rq()) {
                ((StringBuffer)object).append(" sf");
            }
            if (rrbb_3.rB()) {
                ((StringBuffer)object).append(" fr");
            }
            if (rrbb_3.p()) {
                ((StringBuffer)object).append(" af");
            }
            if (rrbb_3.T()) {
                ((StringBuffer)object).append(" aa");
            }
            if (rrbb_3.ry()) {
                ((StringBuffer)object).append(" reg");
            }
            if (rrbb_3.rs()) {
                ((StringBuffer)object).append(" sh");
            }
            String string = ((StringBuffer)object).toString();
            this.id_throws.id_class[79] = string;
            this.id_native = (String)this.id_throws.id_class[79];
        }
        object = this.id_throws();
        StringBuilder stringBuilder = new StringBuilder();
        fJ_2 fJ_22 = rrbb_3.rF();
        stringBuilder.append(", A: ");
        if (rrMh_1.id_class()) {
            stringBuilder.append(fJ_22.id_private() + rrMd_1.id_throws());
            stringBuilder.append("/");
        }
        stringBuilder.append(fJ_22.id_catch() + rrMd_1.id_protected());
        String string = stringBuilder.toString();
        for (int i = 0; i < object.size(); ++i) {
            Object object2 = (String)object.get(i);
            if (object2 == null || !((String)object2).startsWith("P: ")) continue;
            object2 = (String)object2 + string;
            object.set(i, object2);
            break;
        }
        return object;
    }

    private String id_private() {
        rrEm_1 rrEm_12 = this.id_catch();
        return rrEm_12 != null ? rrEm_12.id_for() : null;
    }
}

