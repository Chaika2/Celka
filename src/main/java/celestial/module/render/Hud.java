/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 *  com.mojang.datafixers.util.Pair
 */
package celestial.module.render;

import celestial.Ax_1;
import celestial.FP;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.cb_3;
import celestial.ch_3;
import celestial.cq_3;
import celestial.event.EventTarget;
import celestial.fj_3;
import celestial.jI_2;
import celestial.j_1;
import celestial.manager.FontManager;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rJT;
import celestial.rLK;
import celestial.rLY;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rgF_2;
import celestial.rhz_3;
import celestial.rqO_2;
import celestial.rqs_3;
import celestial.rrAl_1;
import celestial.rrIQ;
import celestial.rrIk_1;
import celestial.rrLZ;
import celestial.rrQJ;
import celestial.rrQK;
import celestial.rrQX;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrZr_1;
import celestial.rrfD_2;
import celestial.rrfT_2;
import celestial.rrfj_3;
import celestial.rrfp_3;
import celestial.rrnB_2;
import celestial.rrqH_2;
import celestial.ruS_2;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import celestial.vm_3;
import com.google.common.collect.Ordering;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.io.File;
import java.io.FileWriter;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class Hud
extends Module {
    public static Object[] id_break;
    public Object[] id_byte;

    private boolean id_char() {
        this.id_import();
        return ((rrIk_1)this.id_byte[2]).id_class();
    }

    public Hud() {
        super("HUD", "\u041f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c\u0441\u043a\u0438\u0439 \u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441", Category.RENDER);
        List<rrqH_2> var18;
        this.id_import();
        rrIk_1 var5 = new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", true);
        this.id_byte[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u0424\u043f\u0441", true);
        this.id_byte[1] = var6;
        rrIk_1 var7 = new rrIk_1("\u0411\u043f\u0441", true);
        this.id_byte[2] = var7;
        rrIk_1 var8 = new rrIk_1("\u0422\u043f\u0441", true);
        this.id_byte[3] = var8;
        rrIk_1 var9 = new rrIk_1("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b", true);
        this.id_byte[4] = var9;
        rrIk_1 var10 = new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", true);
        this.id_byte[5] = var10;
        rrIk_1 var11 = new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", true);
        this.id_byte[6] = var11;
        rrIk_1 var12 = new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", true);
        this.id_byte[7] = var12;
        rrIk_1 var13 = new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", true);
        this.id_byte[8] = var13;
        rrIk_1 var14 = new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", true);
        this.id_byte[9] = var14;
        rrIk_1 var15 = new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", false);
        this.id_byte[10] = var15;
        rrIk_1 var16 = new rrIk_1("\u041e\u043f\u0442\u0438\u043c\u0438\u0437\u0430\u0446\u0438\u044f", false);
        this.id_byte[11] = var16;
        rrIQ var17 = (rrIQ)new rrIQ("\u0420\u0435\u0436\u0438\u043c", "\u041f\u043b\u0430\u0432\u0430\u044e\u0449\u0438\u0439", "\u041f\u043b\u0430\u0432\u0430\u044e\u0449\u0438\u0439", "\u0421\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u044b\u0439").id_class(this::id_this);
        this.id_byte[12] = var17;
        this.id_byte[13] = var18 = List.of(new rrqH_2(() -> new StringBuilder("Coords: ").append((Object)rgF_2.GRAY).append((int)((cb_3)Hud.id_import.id_class[57]).rx()).append(" ").append((int)((cb_3)Hud.id_import.id_class[57]).re()).append(" ").append((int)((cb_3)Hud.id_import.id_class[57]).BO()), this::id_continue), new rrqH_2(() -> new StringBuilder("BPS: ").append((Object)rgF_2.GRAY).append(rrfj_3.id_case()), this::id_char), new rrqH_2(() -> new StringBuilder("FPS: ").append((Object)rgF_2.GRAY).append((Integer)QY.id_break[9]), this::id_instanceof), new rrqH_2(() -> new StringBuilder("TPS: ").append((Object)rgF_2.GRAY).append(rrfp_3.id_protected()), this::id_interface));
        AnimValue var19 = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[1]), 0.5f, false);
        this.id_byte[14] = var19;
        AnimValue var20 = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[1]), 0.5f, false);
        this.id_byte[15] = var20;
        this.id_class(new GroupSetting("\u0412\u0430\u0442\u0435\u0440\u043c\u0430\u0440\u043a", new Setting[]{(rrIk_1)this.id_byte[0]}), new GroupSetting("\u0411\u0438\u043d\u0434\u044b \u043c\u043e\u0434\u0443\u043b\u0435\u0439", new Setting[]{(rrIk_1)this.id_byte[7]}), new GroupSetting("\u0411\u0438\u043d\u0434\u044b \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432", new Setting[]{(rrIk_1)this.id_byte[8]}), new GroupSetting("\u042d\u0444\u0444\u0435\u043a\u0442\u044b", (rrIk_1)this.id_byte[5], (rrIQ)this.id_byte[12]), new GroupSetting("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0438", new Setting[]{(rrIk_1)this.id_byte[9]}), new GroupSetting("\u0420\u0430\u0441\u043f\u0438\u0441\u0430\u043d\u0438\u044f", new Setting[]{(rrIk_1)this.id_byte[10]}), new GroupSetting("\u0411\u0440\u043e\u043d\u044f", new Setting[]{(rrIk_1)this.id_byte[6]}), new GroupSetting("\u0418\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044f", (rrIk_1)this.id_byte[4], (rrIk_1)this.id_byte[1], (rrIk_1)this.id_byte[2], (rrIk_1)this.id_byte[3]), new GroupSetting("\u0414\u0440\u0443\u0433\u043e\u0435", new Setting[]{(rrIk_1)this.id_byte[11]}));
    }

    public boolean id_this() {
        this.id_import();
        return ((rrIk_1)this.id_byte[5]).id_class();
    }

    public boolean id_interface() {
        this.id_import();
        return ((rrIk_1)this.id_byte[3]).id_class();
    }

    private void id_class(Ml_1 var1, rrZO var2, float var3, float var4) {
        this.id_import();
        ((AnimValue)this.id_byte[14]).id_break(this.id_default());
        var4 -= ((AnimValue)this.id_byte[14]).id_byte();
        for (rrqH_2 var6 : (List)this.id_byte[13]) {
            var6.id_byte();
            AnimValue var7 = var6.id_throws();
            if (!var7.id_case()) continue;
            float var8 = var7.id_byte();
            var2.id_class(var1, id_strictfp, ((StringBuilder)((Supplier)var6.id_class[0]).get()).toString(), var3, var4, ColorHelper.id_class((float)(((List)this.id_byte[13]).indexOf(var6) * 20), (int)(255.0f * var8)));
            var4 -= var6.id_break();
        }
    }

    private void id_class(Ml_1 var1, float var2, float var3, float var4) {
        this.id_import();
        if (!((cb_3)Hud.id_import.id_class[57]).id_implements() && !((cb_3)Hud.id_import.id_class[57]).id_native() && ((Ax_1)Hud.id_import.id_class[55]).id_class()) {
            ((AnimValue)this.id_byte[15]).id_break(((cq_3)Hud.id_import.id_class[19]).id_int());
            var4 += ((AnimValue)this.id_byte[15]).id_byte();
            int var5 = (int)(var3 / 2.0f + 8.0f);
            int var6 = 16;
            rqs_3<rdn_3> var7 = ((rhz_3)((cb_3)Hud.id_import.id_class[57]).id_implements[1]).id_break;
            int var8 = var7.size();
            int var9 = var8 - 1;
            for (int var10 = 0; var10 < var8; ++var10) {
                rXQ var11 = rJT.id_finally[var10];
                rdn_3 var12 = var7.get(var9 - var10);
                float var13 = var5 + var10 * var6;
                if (var12.id_class()) {
                    Pair var14 = Pair.of((Object)rJT.id_class, (Object)rJT.id_implements[var11.id_break()]);
                    fj_3 var15 = id_import.id_class((rqO_2)var14.getFirst()).apply((rqO_2)var14.getSecond());
                    id_import.A().id_class(var15.id_extends().id_protected());
                    ch_3.id_class(var1, var13, var4, ((cq_3)Hud.id_import.id_class[19]).h_(), 16, 16, var15);
                    continue;
                }
                ((cq_3)Hud.id_import.id_class[19]).id_class(var13, var4, var2, (cb_3)Hud.id_import.id_class[57], var12, false);
                RenderSystem.disableDepthTest();
            }
            RenderSystem.enableDepthTest();
        }
    }

    private void id_class(Ml_1 var1, rrZO var2, float var3, float var4, int var5, int var6, int var7, int var8) {
        this.id_import();
        String var9 = (String)rrQJ.id_class[1];
        rrfD_2.id_class(var1, var3, var4, ((Float)this.id_byte[17]).floatValue(), (float)var2.id_class() + 6.5f, 225, var5, var6, var7, var8, false);
        var2.id_byte(var1, var9, var3 + 2.0f, var4 + 4.5f, ColorHelper.id_class(0.0f, 180));
        var2.id_byte(var1, (String)this.id_byte[16], var3 + 2.0f, var4 + 4.0f, rrZF.d_);
    }

    private void id_class(Ml_1 var1, Collection<rLY> var2, rrZO var3, float var4, float var5, float var6, float var7) {
        List var8 = Ordering.natural().sortedCopy(var2);
        for (int var9 = 0; var9 < var8.size(); ++var9) {
            rLY var10 = (rLY)var8.get(var9);
            int var11 = ColorHelper.id_class((float)(var9 * 20), 225);
            String var12 = "";
            if (var10.id_byte() >= 1 && var10.id_byte() <= 9) {
                var12 = jI_2.id_class("enchantment.level." + (var10.id_byte() + 1), new Object[0]);
            }
            StringBuilder var13 = new StringBuilder().append(var10.id_final()).append(" ").append(var12).append("\n").append((Object)rgF_2.GRAY).append(rLK.id_class(var10, 1.0f));
            String var14 = var13.toString();
            String var15 = var10.id_final() + " " + var12;
            float var16 = var7 * (float)var9;
            rrfD_2.id_class(var1, var4, var5 + var16, var3.id_break(var15) + 25.0f, var6, 225, var11, var11, var11, var11, false);
            var3.id_class(var1, var14, (double)(var4 + 22.0f), (double)(var5 + var16 + 5.0f), rrZF.d_, false, false);
            rrfD_2.id_class(var1, var10.id_class(), var4 + 2.0f, var5 + var16 + 2.0f, 1.0f);
        }
    }

    public void id_class(Ml_1 var1, float var2) {
        this.id_import();
        if (this.aJ_() && ((rrIk_1)this.id_byte[6]).id_class().booleanValue()) {
            float var3 = id_const.id_super();
            float var4 = id_const.id_this();
            this.id_class(var1, var2, var3, var4 - 45.0f);
        }
    }

    @EventTarget
    public void id_class(rrnB_2 var1) {
        this.id_import();
        Ml_1 var2 = var1.id_class();
        float var3 = (int)id_const.id_final();
        int var4 = ColorHelper.id_class(0.0f, 225);
        int var5 = ColorHelper.id_class(90.0f, 225);
        int var6 = ColorHelper.id_class(270.0f, 225);
        int var7 = ColorHelper.id_class(180.0f, 225);
        if (((rrIk_1)this.id_byte[0]).id_class().booleanValue() && !((Qw_1)Hud.id_import.id_class[20]).R) {
            this.id_class(var2, (rrZO)id_break[1], 5.0f, 5.0f, var4, var5, var6, var7);
        }
        if (((rrIk_1)this.id_byte[5]).id_class().booleanValue() && this.id_public()) {
            this.id_break(var2, (rrZO)id_break[2], 5.0f, var3 / 2.0f);
        }
        var2.id_class();
        ((rrZO)id_break[0]).id_break(id_strictfp);
        this.id_class(var2, (rrZO)id_break[0], 2.0f, var3 - (float)((List)this.id_byte[13]).size() - 2.0f);
        ((rrZO)id_break[0]).id_byte(id_strictfp);
        var2.id_break();
    }

    @EventTarget
    public void onMove(rrAl_1 event) {
        try {
            Class<?> c = event.getClass();
            long t = System.currentTimeMillis();
            int tid = event.id_finally();
            boolean cancel = event.id_byte();
            String msg = "[CEL-DBG] t=" + t + " move tid=" + tid + " cancel=" + cancel + " class=" + c.getName() + "\n";
            File f = new File("run/logs/latest.log");
            FileWriter fw = new FileWriter(f, true);
            fw.write(msg);
            fw.close();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @EventTarget
    public void onPacket(rrLZ event) {
        try {
            ruS_2<?> pkt = event.id_class();
            if (pkt != null && pkt.getClass().getName().contains("rmV_2")) {
                long t = System.currentTimeMillis();
                String msg = "[CEL-DBG] t=" + t + " outgoing rmV_2\n";
                File f = new File("run/logs/latest.log");
                FileWriter fw = new FileWriter(f, true);
                fw.write(msg);
                fw.close();
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @EventTarget
    public void id_class(j_1 var1) {
        this.id_import();
        rrZr_1 var2 = (rrZr_1)rrQJ.id_class[5];
        String var3 = (String)rrQJ.id_class[1];
        CharSequence[] var4 = new String[]{String.valueOf((Object)rgF_2.RESET) + String.valueOf(var3), String.valueOf((Object)rgF_2.RESET) + var2.id_break(), String.valueOf((Object)rgF_2.RESET) + "UID: " + var2.id_protected(), String.valueOf((Object)rgF_2.RESET) + rrfT_2.id_class()};
        String var9 = String.join((CharSequence)(String.valueOf((Object)rgF_2.GRAY) + " \u00bb "), var4);
        this.id_byte[16] = var9;
        Float var10 = Float.valueOf(((rrZO)id_break[1]).id_break((String)this.id_byte[16]) + 5.0f);
        this.id_byte[17] = var10;
    }

    private float id_default() {
        float var1 = 0.0f;
        if ((vm_3)Hud.id_import.id_class[73] instanceof FP) {
            var1 += 7.0f;
        }
        return (float)((double)var1 * id_const.id_return());
    }

    private void id_break(Ml_1 var1, rrZO var2, float var3, float var4) {
        Collection<rLY> var5 = ((cb_3)Hud.id_import.id_class[57]).So();
        if (!var5.isEmpty()) {
            float var6 = var2.id_class() + 18;
            float var7 = var6 + 7.0f;
            this.id_class(var1, var5, var2, var3, var4 - (float)var5.size() * var7 / 2.0f + 10.0f, var6, var7);
        }
    }

    public boolean id_goto() {
        this.id_import();
        return ((rrIk_1)this.id_byte[11]).id_class();
    }

    public boolean id_continue() {
        this.id_import();
        if (!((rrIk_1)this.id_byte[4]).id_class().booleanValue()) {
            return false;
        }
        return !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_new();
    }

    public boolean id_else() {
        this.id_import();
        return ((rrIk_1)this.id_byte[8]).id_class();
    }

    private void id_import() {
        if (this.id_byte == null) {
            this.id_byte = new Object[18];
            this.id_byte[17] = Float.valueOf(0.0f);
        }
    }

    public boolean id_instanceof() {
        this.id_import();
        return ((rrIk_1)this.id_byte[1]).id_class();
    }

    public float id_new() {
        this.id_import();
        if (!this.aJ_()) {
            return 0.0f;
        }
        return !this.id_instanceof() && !this.id_continue() && !this.id_interface() ? 0.0f : ((AnimValue)this.id_byte[14]).id_byte();
    }

    public boolean id_return() {
        this.id_import();
        return ((rrIk_1)this.id_byte[9]).id_class();
    }

    public boolean id_super() {
        this.id_import();
        return ((rrIk_1)this.id_byte[10]).id_class();
    }

    public boolean id_throw() {
        this.id_import();
        return ((String)((rrIQ)this.id_byte[12]).id_byte()).equals("\u041f\u043b\u0430\u0432\u0430\u044e\u0449\u0438\u0439");
    }

    public boolean id_try() {
        this.id_import();
        return ((rrIk_1)this.id_byte[7]).id_class();
    }

    public float id_while() {
        return 0.0f;
    }

    public boolean id_public() {
        this.id_import();
        return ((String)((rrIQ)this.id_byte[12]).id_byte()).equals("\u0421\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u044b\u0439");
    }

    static {
        Object[] var0 = new Object[]{FontManager.id_class("montserrat", 13.0f, false), FontManager.id_class("montserrat", 13.0f, false), FontManager.id_class("montserrat", 13.0f, false), 8};
        id_break = var0;
    }
}

