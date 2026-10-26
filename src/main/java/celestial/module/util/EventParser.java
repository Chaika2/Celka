/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.util;

import celestial.Aw_1;
import celestial.Bn_1;
import celestial.Bp_1;
import celestial.Bt_1;
import celestial.By_1;
import celestial.event.EventTarget;
import celestial.j_1;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgp_3;
import celestial.rgv_3;
import celestial.rgy_3;
import celestial.rja_3;
import celestial.rqR_2;
import celestial.rrHj_1;
import celestial.rrIQ;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrfp_3;
import celestial.rrfu_3;
import celestial.rrjD_2;
import celestial.rrja_3;
import celestial.rrje_3;
import celestial.rrtd_3;
import celestial.rrth_3;
import celestial.setting.Setting;
import celestial.util.MinecraftAccessor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.tuple.Pair;

public class EventParser
extends Module
implements rrja_3 {
    public Object[] id_break;

    private void id_byte(rrjD_2 var1, boolean var2) {
        this.id_while();
        boolean var3 = ((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0])).id_class(var1, var2);
        if (var3) {
            ((Map)this.id_break[0]).put(var1.id_byte(), rqR_2.id_break());
        }
    }

    public EventParser() {
        super("Event Parser", "\u041e\u0442\u0441\u043b\u0435\u0436\u0438\u0432\u0430\u0435\u0442 \u043f\u043e\u044f\u0432\u043b\u0435\u043d\u0438\u0435 \u0441\u043e\u0431\u044b\u0442\u0438\u0439\n\u0438 \u0443\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0435\u0442 \u043f\u0443\u0442\u044c \u043a \u043d\u0438\u043c", Category.UTIL);
        ConcurrentHashMap var5;
        this.id_while();
        this.id_break[0] = var5 = new ConcurrentHashMap();
        rrIQ var6 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439", "\u0420\u0443\u0447\u043d\u043e\u0439");
        this.id_break[1] = var6;
        rrIk_1 var7 = (rrIk_1)new rrIk_1("\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0443\u0434\u0430\u043b\u044f\u0442\u044c\n\u0442\u043e\u0447\u043a\u0443 \u0447\u0435\u0440\u0435\u0437 \u0432\u0440\u0435\u043c\u044f", true).id_class("auto_remove", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_while();
            ((Map)this.id_break[0]).clear();
        });
        this.id_break[2] = var7;
        rrIm_1 var8 = (rrIm_1)new rrIm_1("\u041c\u0438\u043d\u0443\u0442 \u0434\u043b\u044f \u0443\u0434\u0430\u043b\u0435\u043d\u0438\u044f", Float.valueOf(10.0f), Float.valueOf(1.0f), Float.valueOf(30.0f), Float.valueOf(1.0f)).id_class(() -> {
            this.id_while();
            return ((rrIk_1)this.id_break[2]).id_class();
        });
        this.id_break[3] = var8;
        this.id_class((rrIQ)this.id_break[1], (rrIk_1)this.id_break[2], (rrIm_1)this.id_break[3]);
        ((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0])).id_class(this);
    }

    @Override
    public void id_class(rrjD_2 var1, boolean var2) {
        this.id_while();
        if (var2) {
            ((Map)this.id_break[0]).remove(var1.id_byte());
        }
    }

    private void id_class(Bt_1 var1) {
        if (var1 instanceof Bn_1) {
            Bn_1 var2 = (Bn_1)var1;
            String var3 = var2.id_throws();
            String var4 = var2.id_protected();
            Aw_1 var5 = var2.id_byte();
            rja_3 var6 = var2.e_();
            rrjD_2 var7 = new rrjD_2(var3, var6.id_else(), rrfp_3.id_throws());
            if (this.id_continue()) {
                this.id_byte(var7, true);
            } else if (this.id_new()) {
                By_1 var9;
                String var10;
                rgN_2 var8 = new rgN_2("\u0421\u043e\u0431\u044b\u0442\u0438\u0435: " + String.valueOf((Object)rgF_2.RED) + var4);
                if (var2 instanceof By_1 && (var10 = (var9 = (By_1)((Object)var2)).id_class()) != null) {
                    var8.id_break("\n\u0423\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430: " + String.valueOf((Object)rgF_2.RED) + var10);
                }
                if (var5 != null) {
                    var8.id_break("\n\u041f\u0440\u0438\u0437\u0432\u0430\u043b: " + String.valueOf((Object)rgF_2.RED) + var5.id_class().getName());
                }
                var8.id_break("\n\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b: " + String.valueOf((Object)rgF_2.RED) + var6.b_() + " " + var6.c_() + " " + var6.d_());
                rVi_1 var11 = rgv_3.id_class(new rgN_2("\u041d\u0430\u0436\u043c\u0438\u0442\u0435, \u0447\u0442\u043e\u0431\u044b \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u043f\u0443\u0442\u044c \u043a \u0441\u043e\u0431\u044b\u0442\u0438\u044e " + String.valueOf((Object)rgF_2.RED) + "'" + var3 + "'"), new rgy_3(rgp_3.id_class, var8), new rgl_3(() -> this.id_byte(var7.id_class(), true)));
                rrfu_3.id_class(var11.id_break(rgF_2.GRAY));
            }
        } else {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtd_3(this.id_final(), "\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u043e \u043d\u043e\u0432\u043e\u0435 \u0441\u043e\u0431\u044b\u0442\u0438\u0435 '" + var1.id_throws() + "'", 5000));
        }
        MinecraftAccessor.a_(rrfu_3.id_class(this) + "\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u043e \u043d\u043e\u0432\u043e\u0435 \u0441\u043e\u0431\u044b\u0442\u0438\u0435 '" + var1.id_throws() + "'", false);
    }

    @EventTarget
    public void id_class(Bp_1 var1) {
        Bt_1 var2 = var1.id_break();
        if (var2 != null) {
            switch (((int[])rrHj_1.id_class[0])[var1.id_class().ordinal()]) {
                case 1: {
                    this.id_class(var2);
                    break;
                }
                case 2: {
                    this.id_break(var2);
                }
            }
        }
    }

    @EventTarget
    public void id_class(j_1 var1) {
        this.id_while();
        if (((rrIk_1)this.id_break[2]).id_class().booleanValue() && !((Map)this.id_break[0]).isEmpty()) {
            int var2 = ((Float)((rrIm_1)this.id_break[3]).id_byte()).intValue();
            long var3 = rqR_2.id_break();
            long var5 = (long)(var2 * 60) * 1000L;
            ((Map)this.id_break[0]).entrySet().removeIf(var4 -> {
                long var5x = var3 - (Long)((Map.Entry)var4).getValue();
                if (var5x >= var5) {
                    ((rrje_3)((Object)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]))).id_break((String)((Map.Entry)var4).getKey(), true);
                    return true;
                }
                return false;
            });
        }
    }

    private void id_break(Bt_1 var1) {
        ((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0])).id_break(var1.id_throws(), true);
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_while();
        super.id_throws(var1);
        ((Map)this.id_break[0]).clear();
    }

    public boolean id_continue() {
        this.id_while();
        return ((String)((rrIQ)this.id_break[1]).id_byte()).equals("\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439");
    }

    public boolean id_new() {
        this.id_while();
        return ((String)((rrIQ)this.id_break[1]).id_byte()).equals("\u0420\u0443\u0447\u043d\u043e\u0439");
    }

    @Override
    public void id_super() {
        this.id_while();
        ((Map)this.id_break[0]).clear();
    }

    private void id_while() {
        if (this.id_break == null) {
            this.id_break = new Object[4];
        }
    }
}

