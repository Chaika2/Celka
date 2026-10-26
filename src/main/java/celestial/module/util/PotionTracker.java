/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.an_3;
import celestial.cG_2;
import celestial.cM_2;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.iB_2;
import celestial.j_1;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rAB;
import celestial.rLY;
import celestial.rVa_1;
import celestial.rdn_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rrHD;
import celestial.rrLC;
import celestial.rrLD;
import celestial.rrLI;
import celestial.rrLo_1;
import celestial.rrfu_3;
import celestial.rrjZ_2;
import celestial.rrnM_2;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class PotionTracker
extends Module {
    public static Object[] id_break;
    public Object[] id_byte;

    public PotionTracker() {
        super("Potion Tracker", "\u041e\u0442\u0441\u043b\u0435\u0436\u0438\u0432\u0430\u0435\u0442 \u043d\u0430\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u0435\u043c\u044b\u0435\n\u0437\u0435\u043b\u044c\u044f \u043d\u0430 \u0438\u0433\u0440\u043e\u043a\u043e\u0432", Category.UTIL);
        HashMap var5;
        this.id_continue();
        this.id_byte[0] = var5 = new HashMap();
    }

    @EventTarget
    public void id_class(rrnM_2 var1) {
        cG_2 var2;
        List var3;
        this.id_continue();
        if (!((Map)this.id_byte[0]).isEmpty() && (var3 = (List)((Map)this.id_byte[0]).get((var2 = var1.id_class()).sv().getId())) != null && !var3.isEmpty()) {
            for (rLY var5 : var3) {
                var2.id_break(var5);
            }
        }
    }

    @EventTarget
    public void id_class(rrLI var1) {
        this.id_continue();
        if (!((Map)this.id_byte[0]).isEmpty()) {
            iB_2 var2 = var1.id_byte();
            rLY var3 = var1.id_break();
            if (var2 instanceof cM_2) {
                cM_2 var4 = (cM_2)var2;
                List var5 = (List)((Map)this.id_byte[0]).get(var4.sv().getId());
                if (var5 == null || var5.isEmpty()) {
                    return;
                }
                for (rLY var7 : var5) {
                    if (!var7.id_class().equals(var3.id_class())) continue;
                    var5.remove(var7);
                    var5.add(var3);
                    break;
                }
            }
        }
    }

    @EventTarget
    public void id_class(rrLC var1) {
        cM_2 var4;
        List var5;
        this.id_continue();
        rLY var2 = var1.id_break();
        iB_2 iB_22 = var1.id_class();
        if (iB_22 instanceof cM_2 && (var5 = ((Map)this.id_byte[0]).computeIfAbsent((var4 = (cM_2)iB_22).sv().getId(), var0 -> new ArrayList())).stream().noneMatch(var1x -> var1x.id_class() == var2.id_class())) {
            var5.add(var2);
        }
    }

    @EventTarget
    public void id_class(rrLo_1 var1) {
        this.id_continue();
        if (!((Map)this.id_byte[0]).isEmpty()) {
            iB_2 var2 = var1.id_break();
            rLY var3 = var1.id_class();
            if (var2 instanceof cM_2) {
                cM_2 var4 = (cM_2)var2;
                List var5 = (List)((Map)this.id_byte[0]).get(var4.sv().getId());
                if (var5 == null || var5.isEmpty()) {
                    return;
                }
                var5.remove(var3);
            }
        }
    }

    @EventTarget
    public void id_class(j_1 var1) {
        this.id_continue();
        if (!((Map)this.id_byte[0]).isEmpty()) {
            for (Map.Entry var3 : ((Map)this.id_byte[0]).entrySet()) {
                UUID var4 = (UUID)var3.getKey();
                List var5 = (List)var3.getValue();
                var5.removeIf(var1x -> {
                    if (var1x.id_break() > 0) {
                        if ((gm_3)PotionTracker.id_import.id_class[56] != null && ((gm_3)PotionTracker.id_import.id_class[56]).id_class(var4) == null) {
                            var1x.id_catch();
                        }
                        return false;
                    }
                    return true;
                });
            }
            ((Map)this.id_byte[0]).entrySet().removeIf(var0 -> ((List)var0.getValue()).isEmpty());
        }
    }

    @EventTarget
    public void id_class(rrLD var1) {
        List<rLY> var2 = var1.id_protected();
        iB_2 var3 = var1.id_break();
        rdn_3 var4 = var1.id_byte();
        double var5 = var1.id_class();
        if (!var2.isEmpty()) {
            cG_2 var7;
            var2.sort((rrHD)id_break[0]);
            if (var3 instanceof cG_2 && !(var7 = (cG_2)var3).sc() && var7.Pu()) {
                int var8 = var2.size();
                rgN_2 var9 = new rgN_2("");
                rgN_2 var10 = new rgN_2("\n");
                double var11 = 0.0;
                double var13 = 0.0;
                for (int var15 = 0; var15 < var8; ++var15) {
                    rLY var16 = var2.get(var15);
                    int var17 = var16.id_break();
                    var11 += (double)((int)(var5 * (double)var17 + 0.5));
                    var13 += (double)var17;
                    if (var17 <= 0) continue;
                    var10.id_break(String.valueOf((Object)rgF_2.GRAY) + " \u2022 ").id_break(String.valueOf((Object)rgF_2.RED) + rAB.id_class(var16, rgF_2.GRAY));
                    if (var15 == var8 - 1) continue;
                    var10.id_break("\n");
                }
                var9.id_class(rgF_2.GRAY);
                if (var7 == (cb_3)PotionTracker.id_import.id_class[57]) {
                    var9.id_break("\u0412\u044b \u043f\u043e\u043b\u0443\u0447\u0438\u043b\u0438 ");
                } else {
                    var9.id_class(rrjZ_2.id_byte((an_3)var7)).id_break(" \u043f\u043e\u043b\u0443\u0447\u0438\u043b ");
                }
                double var19 = var11 / var13;
                String var20 = (int)(var19 * 100.0) + "%";
                rVa_1 var18 = var19 >= 0.7 ? new rVa_1(Color.GREEN.getRGB()) : (var19 >= 0.4 ? new rVa_1(Color.YELLOW.getRGB()) : new rVa_1(Color.RED.getRGB()));
                var9.id_class(var4.id_continue()).id_break("\n" + String.valueOf((Object)rgF_2.GRAY) + " \u2022 \u0423\u0441\u043f\u0435\u0448\u043d\u043e\u0441\u0442\u044c: ").id_class(rrfu_3.id_class().id_class(var20).id_class(var18).id_break()).id_class(var10);
                rrfu_3.id_class(var9);
            }
        }
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_continue();
        super.id_throws(var1);
        ((Map)this.id_byte[0]).clear();
    }

    private void id_continue() {
        if (this.id_byte == null) {
            this.id_byte = new Object[1];
        }
    }

    static {
        Object[] var0 = new Object[]{new rrHD()};
        id_break = var0;
    }
}

