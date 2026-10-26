/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.Hh_1;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.cb_3;
import celestial.eX_2;
import celestial.gm_3;
import celestial.ly_3;
import celestial.ps_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rja_3;
import celestial.rqG_2;
import celestial.yD_2;
import celestial.yK_2;
import celestial.yf_3;
import celestial.yj_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class yI_2
implements yD_2 {
    private final QY id_class;
    private final Map<rfH_2, yj_3> id_break = Maps.newHashMap();
    private final Map<UUID, yf_3> id_byte = Maps.newHashMap();
    private UUID id_protected;

    private void id_byte() {
        long l = ((gm_3)this.id_class.id_class[56]).r() - 20L;
        this.id_break.entrySet().removeIf(entry -> ((yj_3)entry.getValue()).id_case < l);
    }

    private void id_byte(yf_3 yf_32) {
        boolean bl = this.id_protected(yf_32);
        int n = 0;
        yI_2.id_class(yf_32.id_byte, n++, yf_32.toString(), -1, 0.03f);
        if (yf_32.id_throws == null) {
            yI_2.id_class(yf_32.id_byte, n++, "No hive", -98404, 0.02f);
        } else {
            yI_2.id_class(yf_32.id_byte, n++, "Hive: " + this.id_class(yf_32, yf_32.id_throws), -256, 0.02f);
        }
        if (yf_32.id_case == null) {
            yI_2.id_class(yf_32.id_byte, n++, "No flower", -98404, 0.02f);
        } else {
            yI_2.id_class(yf_32.id_byte, n++, "Flower: " + this.id_class(yf_32, yf_32.id_case), -256, 0.02f);
        }
        for (String string : yf_32.id_private) {
            yI_2.id_class(yf_32.id_byte, n++, string, -16711936, 0.02f);
        }
        if (bl) {
            this.id_break(yf_32);
        }
        if (yf_32.id_catch > 0) {
            int n2 = yf_32.id_catch < 600 ? -3355444 : -23296;
            yI_2.id_class(yf_32.id_byte, n++, "Travelling: " + yf_32.id_catch + " ticks", n2, 0.02f);
        }
    }

    public yI_2(QY qY) {
        this.id_class = qY;
    }

    private static void id_class(eX_2 eX_22, int n, String string, int n2, float f) {
        double d = 2.4;
        double d2 = 0.25;
        rfH_2 rfH_22 = new rfH_2(eX_22);
        double d3 = (double)rfH_22.b_() + 0.5;
        double d4 = eX_22.id_break() + 2.4 + (double)n * 0.25;
        double d5 = (double)rfH_22.d_() + 0.5;
        float f2 = 0.5f;
        yK_2.id_class(string, d3, d4, d5, n2, f, false, 0.5f, true);
    }

    private static void id_class(String string, rfH_2 rfH_22, int n, int n2) {
        double d = 1.3;
        double d2 = 0.2;
        double d3 = (double)rfH_22.b_() + 0.5;
        double d4 = (double)rfH_22.c_() + 1.3 + (double)n * 0.2;
        double d5 = (double)rfH_22.d_() + 0.5;
        yK_2.id_class(string, d3, d4, d5, n2, 0.02f, true, 0.0f, true);
    }

    private static void id_class(rfH_2 rfH_22, float f, float f2, float f3, float f4, float f5) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        yK_2.id_class(rfH_22, f, f2, f3, f4, f5);
    }

    private static void id_class(String string, yj_3 yj_32, int n, int n2) {
        rfH_2 rfH_22 = yj_32.id_class;
        yI_2.id_class(string, rfH_22, n, n2);
    }

    private void id_class(yj_3 yj_32, Collection<UUID> collection) {
        int n = 0;
        if (!collection.isEmpty()) {
            yI_2.id_class("Blacklisted by " + yI_2.id_class(collection), yj_32, n++, -65536);
        }
        yI_2.id_class("Out: " + yI_2.id_class(this.id_break(yj_32.id_class)), yj_32, n++, -3355444);
        if (yj_32.id_byte == 0) {
            yI_2.id_class("In: -", yj_32, n++, -256);
        } else if (yj_32.id_byte == 1) {
            yI_2.id_class("In: 1 bee", yj_32, n++, -256);
        } else {
            yI_2.id_class("In: " + yj_32.id_byte + " bees", yj_32, n++, -256);
        }
        yI_2.id_class("Honey: " + yj_32.id_protected, yj_32, n++, -23296);
        yI_2.id_class(yj_32.id_break + (yj_32.id_throws ? " (sedated)" : ""), yj_32, n++, -1);
    }

    private String id_class(yf_3 yf_32, rfH_2 rfH_22) {
        float f = rfU_2.id_class(rfH_22.id_class(yf_32.id_byte.id_class(), yf_32.id_byte.id_break(), yf_32.id_byte.id_byte(), true));
        double d = (double)Math.round(f * 10.0f) / 10.0;
        return rfH_22.id_this() + " (dist " + d + ")";
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        RenderSystem.pushMatrix();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableTexture();
        this.id_byte();
        this.id_break();
        this.id_protected();
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
        RenderSystem.popMatrix();
        if (!((cb_3)this.id_class.id_class[57]).id_native()) {
            this.id_implements();
        }
    }

    public void id_class(yf_3 yf_32) {
        this.id_byte.put(yf_32.id_class, yf_32);
    }

    public void id_class(yj_3 yj_32) {
        this.id_break.put(yj_32.id_class, yj_32);
    }

    @Override
    public void id_class() {
        this.id_break.clear();
        this.id_byte.clear();
        this.id_protected = null;
    }

    private void id_class(rfH_2 rfH_22, List<String> list) {
        float f = 0.05f;
        yI_2.id_class(rfH_22, 0.05f, 0.2f, 0.2f, 1.0f, 0.3f);
        yI_2.id_class("" + list, rfH_22, 0, -256);
        yI_2.id_class("Ghost Hive", rfH_22, 1, -65536);
    }

    private static void id_class(rfH_2 rfH_22) {
        float f = 0.05f;
        yI_2.id_class(rfH_22, 0.05f, 0.2f, 0.2f, 1.0f, 0.3f);
    }

    private static String id_class(Collection<UUID> collection) {
        if (collection.isEmpty()) {
            return "-";
        }
        return collection.size() > 3 ? collection.size() + " bees" : collection.stream().map(rqG_2::id_class).collect(Collectors.toSet()).toString();
    }

    private Collection<UUID> id_break(rfH_2 rfH_22) {
        return this.id_byte.values().stream().filter(yf_32 -> yf_32.id_class(rfH_22)).map(yf_3::id_class).collect(Collectors.toSet());
    }

    private void id_break() {
        this.id_byte.entrySet().removeIf(entry -> ((gm_3)this.id_class.id_class[56]).id_break(((yf_3)entry.getValue()).id_break) == null);
    }

    private void id_break(yf_3 yf_32) {
        if (yf_32.id_protected != null) {
            ps_3.id_class(yf_32.id_protected, 0.5f, false, false, this.id_catch().id_break().id_class(), this.id_catch().id_break().id_break(), this.id_catch().id_break().id_byte());
        }
    }

    private Map<rfH_2, Set<UUID>> id_throws() {
        HashMap hashMap = Maps.newHashMap();
        this.id_byte.values().forEach(yf_32 -> yf_32.id_implements.forEach(rfH_23 -> hashMap.computeIfAbsent(rfH_23, rfH_22 -> Sets.newHashSet()).add(yf_32.id_class())));
        return hashMap;
    }

    private boolean id_throws(yf_3 yf_32) {
        cb_3 cb_32 = (cb_3)this.id_class.id_class[57];
        rfH_2 rfH_22 = new rfH_2(cb_32.rx(), yf_32.id_byte.id_break(), cb_32.BO());
        rfH_2 rfH_23 = new rfH_2(yf_32.id_byte);
        return rfH_22.id_class(rfH_23, 30.0);
    }

    private ly_3 id_catch() {
        return ((Hh_1)this.id_class.id_class[16]).id_finally();
    }

    private void id_case() {
        HashMap hashMap = Maps.newHashMap();
        this.id_byte.values().stream().filter(yf_3::id_byte).forEach(yf_32 -> hashMap.computeIfAbsent(yf_32.id_case, rfH_22 -> Sets.newHashSet()).add(yf_32.id_class()));
        hashMap.entrySet().forEach(entry -> {
            rfH_2 rfH_22 = (rfH_2)entry.getKey();
            Set set = (Set)entry.getValue();
            Set set2 = set.stream().map(rqG_2::id_class).collect(Collectors.toSet());
            int n = 1;
            yI_2.id_class(set2.toString(), rfH_22, n++, -256);
            yI_2.id_class("Flower", rfH_22, n++, -1);
            float f = 0.05f;
            yI_2.id_class(rfH_22, 0.05f, 0.8f, 0.8f, 0.0f, 0.3f);
        });
    }

    private void id_implements() {
        yK_2.id_class(this.id_class.id_catch(), 8).ifPresent(an_32 -> {
            this.id_protected = an_32.ro();
        });
    }

    private void id_protected() {
        rfH_2 rfH_22 = this.id_catch().id_byte();
        this.id_byte.values().forEach(yf_32 -> {
            if (this.id_throws((yf_3)yf_32)) {
                this.id_byte((yf_3)yf_32);
            }
        });
        this.id_case();
        for (rfH_2 rfH_24 : this.id_break.keySet()) {
            if (!rfH_22.id_class(rfH_24, 30.0)) continue;
            yI_2.id_class(rfH_24);
        }
        Map<rfH_2, Set<UUID>> map = this.id_throws();
        this.id_break.values().forEach(yj_32 -> {
            if (rfH_22.id_class(yj_32.id_class, 30.0)) {
                Set set = (Set)map.get(yj_32.id_class);
                this.id_class((yj_3)yj_32, set == null ? Sets.newHashSet() : set);
            }
        });
        this.id_private().forEach((rfH_23, list) -> {
            if (rfH_22.id_class((rja_3)rfH_23, 30.0)) {
                this.id_class((rfH_2)rfH_23, (List<String>)list);
            }
        });
    }

    private boolean id_protected(yf_3 yf_32) {
        return Objects.equals(this.id_protected, yf_32.id_class);
    }

    private Map<rfH_2, List<String>> id_private() {
        HashMap hashMap = Maps.newHashMap();
        for (yf_3 yf_32 : this.id_byte.values()) {
            if (yf_32.id_throws == null || this.id_break.containsKey(yf_32.id_throws)) continue;
            hashMap.computeIfAbsent(yf_32.id_throws, rfH_22 -> Lists.newArrayList()).add(yf_32.id_break());
        }
        return hashMap;
    }
}

