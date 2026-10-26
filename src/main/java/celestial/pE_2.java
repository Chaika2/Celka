/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.an_3;
import celestial.cb_3;
import celestial.eX_2;
import celestial.gm_3;
import celestial.pG_2;
import celestial.pb_3;
import celestial.ps_3;
import celestial.rfH_2;
import celestial.rja_3;
import celestial.rqG_2;
import celestial.yD_2;
import celestial.yK_2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class pE_2
implements yD_2 {
    private static final Logger id_class = LogManager.getLogger();
    private final QY id_break;
    private final Map<rfH_2, pb_3> id_byte = Maps.newHashMap();
    private final Map<UUID, pG_2> id_protected = Maps.newHashMap();
    private UUID id_throws;

    private boolean id_byte(pG_2 pG_22) {
        cb_3 cb_32 = (cb_3)this.id_break.id_class[57];
        rfH_2 rfH_22 = new rfH_2(cb_32.rx(), pG_22.id_private.id_break(), cb_32.BO());
        rfH_2 rfH_23 = new rfH_2(pG_22.id_private);
        return rfH_22.id_class(rfH_23, 30.0);
    }

    private Collection<UUID> id_byte(rfH_2 rfH_22) {
        return this.id_protected.values().stream().filter(pG_22 -> pG_22.id_class(rfH_22)).map(pG_2::id_class).collect(Collectors.toSet());
    }

    private Map<rfH_2, List<String>> id_byte() {
        HashMap hashMap = Maps.newHashMap();
        for (pG_2 pG_22 : this.id_protected.values()) {
            for (rfH_2 rfH_23 : Iterables.concat(pG_22.id_int, pG_22.id_new)) {
                if (this.id_byte.containsKey(rfH_23)) continue;
                hashMap.computeIfAbsent(rfH_23, rfH_22 -> Lists.newArrayList()).add(pG_22.id_byte);
            }
        }
        return hashMap;
    }

    private Set<String> id_byte(pb_3 pb_32) {
        return this.id_byte(pb_32.id_class).stream().map(rqG_2::id_class).collect(Collectors.toSet());
    }

    public pE_2(QY qY) {
        this.id_break = qY;
    }

    public void id_class(pb_3 pb_32) {
        this.id_byte.put(pb_32.id_class, pb_32);
    }

    @Override
    public void id_class() {
        this.id_byte.clear();
        this.id_protected.clear();
        this.id_throws = null;
    }

    public void id_class(rfH_2 rfH_22) {
        this.id_byte.remove(rfH_22);
    }

    public void id_class(pG_2 pG_22) {
        this.id_protected.put(pG_22.id_class, pG_22);
    }

    public void id_class(rfH_2 rfH_22, int n) {
        pb_3 pb_32 = this.id_byte.get(rfH_22);
        if (pb_32 == null) {
            id_class.warn("Strange, setFreeTicketCount was called for an unknown POI: " + rfH_22);
        } else {
            pb_32.id_byte = n;
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        RenderSystem.pushMatrix();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableTexture();
        this.id_break();
        this.id_class(d, d2, d3);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
        RenderSystem.popMatrix();
        if (!((cb_3)this.id_break.id_class[57]).id_native()) {
            this.id_protected();
        }
    }

    private void id_class(rfH_2 rfH_22, List<String> list) {
        float f = 0.05f;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        yK_2.id_class(rfH_22, 0.05f, 0.2f, 0.2f, 1.0f, 0.3f);
        pE_2.id_class("" + list, rfH_22, 0, -256);
        pE_2.id_class("Ghost POI", rfH_22, 1, -65536);
    }

    private void id_class(pG_2 pG_22, double d, double d2, double d3) {
        if (pG_22.id_finally != null) {
            ps_3.id_class(pG_22.id_finally, 0.5f, false, false, d, d2, d3);
        }
    }

    private void id_class(double d, double d2, double d3) {
        rfH_2 rfH_22 = new rfH_2(d, d2, d3);
        this.id_protected.values().forEach(pG_22 -> {
            if (this.id_byte((pG_2)pG_22)) {
                this.id_break((pG_2)pG_22, d, d2, d3);
            }
        });
        for (rfH_2 rfH_24 : this.id_byte.keySet()) {
            if (!rfH_22.id_class(rfH_24, 30.0)) continue;
            pE_2.id_break(rfH_24);
        }
        this.id_byte.values().forEach(pb_32 -> {
            if (rfH_22.id_class(pb_32.id_class, 30.0)) {
                this.id_break((pb_3)pb_32);
            }
        });
        this.id_byte().forEach((rfH_23, list) -> {
            if (rfH_22.id_class((rja_3)rfH_23, 30.0)) {
                this.id_class((rfH_2)rfH_23, (List<String>)list);
            }
        });
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

    private static void id_class(String string, pb_3 pb_32, int n, int n2) {
        rfH_2 rfH_22 = pb_32.id_class;
        pE_2.id_class(string, rfH_22, n, n2);
    }

    private void id_break() {
        this.id_protected.entrySet().removeIf(entry -> {
            an_3 an_32 = ((gm_3)this.id_break.id_class[56]).id_break(((pG_2)entry.getValue()).id_break);
            return an_32 == null || (Boolean)an_32.id_throws[27] != false;
        });
    }

    private static void id_break(rfH_2 rfH_22) {
        float f = 0.05f;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        yK_2.id_class(rfH_22, 0.05f, 0.2f, 0.2f, 1.0f, 0.3f);
    }

    private boolean id_break(pG_2 pG_22) {
        return Objects.equals(this.id_throws, pG_22.id_class);
    }

    private void id_break(pG_2 pG_22, double d, double d2, double d3) {
        boolean bl = this.id_break(pG_22);
        int n = 0;
        pE_2.id_class(pG_22.id_private, n, pG_22.id_byte, -1, 0.03f);
        ++n;
        if (bl) {
            pE_2.id_class(pG_22.id_private, n, pG_22.id_protected + " " + pG_22.id_throws + " xp", -1, 0.02f);
            ++n;
        }
        if (bl) {
            int n2 = pG_22.id_case < pG_22.id_catch ? -23296 : -1;
            pE_2.id_class(pG_22.id_private, n, "health: " + String.format("%.1f", Float.valueOf(pG_22.id_case)) + " / " + String.format("%.1f", Float.valueOf(pG_22.id_catch)), n2, 0.02f);
            ++n;
        }
        if (bl && !pG_22.id_implements.equals("")) {
            pE_2.id_class(pG_22.id_private, n, pG_22.id_implements, -98404, 0.02f);
            ++n;
        }
        if (bl) {
            for (String string : pG_22.id_volatile) {
                pE_2.id_class(pG_22.id_private, n, string, -16711681, 0.02f);
                ++n;
            }
        }
        if (bl) {
            for (String string : pG_22.id_native) {
                pE_2.id_class(pG_22.id_private, n, string, -16711936, 0.02f);
                ++n;
            }
        }
        if (pG_22.id_extends) {
            pE_2.id_class(pG_22.id_private, n, "Wants Golem", -23296, 0.02f);
            ++n;
        }
        if (bl) {
            for (String string : pG_22.id_package) {
                if (string.startsWith(pG_22.id_byte)) {
                    pE_2.id_class(pG_22.id_private, n, string, -1, 0.02f);
                } else {
                    pE_2.id_class(pG_22.id_private, n, string, -23296, 0.02f);
                }
                ++n;
            }
        }
        if (bl) {
            for (String string : Lists.reverse(pG_22.id_final)) {
                pE_2.id_class(pG_22.id_private, n, string, -3355444, 0.02f);
                ++n;
            }
        }
        if (bl) {
            this.id_class(pG_22, d, d2, d3);
        }
    }

    private void id_break(pb_3 pb_32) {
        int n = 0;
        Set<String> set = this.id_byte(pb_32);
        if (set.size() < 4) {
            pE_2.id_class("Owners: " + set, pb_32, n, -256);
        } else {
            pE_2.id_class(set.size() + " ticket holders", pb_32, n, -256);
        }
        ++n;
        Set<String> set2 = this.id_protected(pb_32);
        if (set2.size() < 4) {
            pE_2.id_class("Candidates: " + set2, pb_32, n, -23296);
        } else {
            pE_2.id_class(set2.size() + " potential owners", pb_32, n, -23296);
        }
        pE_2.id_class("Free tickets: " + pb_32.id_byte, pb_32, ++n, -256);
        pE_2.id_class(pb_32.id_break, pb_32, ++n, -1);
    }

    private Set<String> id_protected(pb_3 pb_32) {
        return this.id_protected(pb_32.id_class).stream().map(rqG_2::id_class).collect(Collectors.toSet());
    }

    private Collection<UUID> id_protected(rfH_2 rfH_22) {
        return this.id_protected.values().stream().filter(pG_22 -> pG_22.id_break(rfH_22)).map(pG_2::id_class).collect(Collectors.toSet());
    }

    private void id_protected() {
        yK_2.id_class(this.id_break.id_catch(), 8).ifPresent(an_32 -> {
            this.id_throws = an_32.ro();
        });
    }
}

