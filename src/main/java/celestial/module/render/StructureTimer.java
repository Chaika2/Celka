/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.render;

import celestial.Hh_1;
import celestial.Ml_1;
import celestial.Y;
import celestial.cb_3;
import celestial.cd_3;
import celestial.cq_3;
import celestial.event.EventTarget;
import celestial.j_1;
import celestial.manager.FontManager;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rRM;
import celestial.rRb_1;
import celestial.rVi_1;
import celestial.rfl_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rjU_2;
import celestial.rjV_2;
import celestial.rji_3;
import celestial.rrAM;
import celestial.rrFK;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrfD_2;
import celestial.rrfa_3;
import celestial.rrnE_2;
import celestial.rrnN_2;
import celestial.rrnQ_2;
import celestial.rryB;
import celestial.rryP;
import celestial.rryS;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class StructureTimer
extends Module {
    public Object[] id_break;

    public void id_byte(rryB var1) {
        this.id_protected(var1);
    }

    public StructureTimer() {
        super("Structure Timer", "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u0432\u0440\u0435\u043c\u044f \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u044f\n\u0442\u0440\u0430\u043f\u043e\u043a \u0438 \u043f\u043b\u0430\u0441\u0442\u043e\u0432", Category.RENDER);
        HashSet var6;
        ArrayList var5;
        this.id_else();
        this.id_break[0] = var5 = new ArrayList();
        this.id_break[1] = var6 = new HashSet();
    }

    public void id_class(List<rryB> var1) {
        this.id_else();
        Iterator var2 = ((Set)this.id_break[1]).iterator();
        while (var2.hasNext()) {
            rryB var3 = (rryB)var2.next();
            if (var1.contains(var3)) continue;
            this.id_throws(var3);
            var3.id_class(false);
            var2.remove();
        }
        for (rryB var4 : var1) {
            if (((Set)this.id_break[1]).add(var4)) {
                this.id_byte(var4);
                var4.id_class(true);
            }
            this.id_class(var4);
        }
    }

    @EventTarget
    public void id_class(rrnQ_2 var1) {
        this.id_catch(new rryP(var1.id_class(), var1.id_break()));
    }

    @EventTarget
    public void id_class(rrnE_2 var1) {
        this.id_else();
        if (!((List)this.id_break[0]).isEmpty()) {
            Ml_1 var2 = var1.id_class();
            rrZO var3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_private();
            rjV_2 var4 = ((Hh_1)StructureTimer.id_import.id_class[16]).id_volatile();
            int var5 = var3.id_class();
            var2.id_class();
            for (rryB var7 : (List)this.id_break[0]) {
                float var17;
                AnimValue var8 = var7.id_finally();
                int var9 = var7.id_implements();
                var8.id_class(var9 > 0 && !var7.id_final());
                float var10 = var8.id_byte();
                if (!var8.id_case()) continue;
                rjU_2 var11 = var7.id_class();
                rji_3 var12 = rrfa_3.id_class(var4, var11);
                float var13 = var12.id_class();
                float var14 = var12.id_break();
                String var15 = var7.id_case() + String.valueOf((Object)rgF_2.GRAY) + " \u00bb " + String.valueOf((Object)rgF_2.RED) + var9 + " \u0441\u0435\u043a.";
                float var16 = var3.id_break(var15) / 2.0f;
                if (!StructureTimer.id_class(var13 + var16, var14 - (var17 = 12.0f), var13 - var16, (float)var5 + var17)) continue;
                rrfD_2.id_class(var2, var7.id_break(), var13 - 8.0f, var14 - var17 + (float)(Math.sin((double)System.currentTimeMillis() / 400.0) * 1.5), var10, 0.5f, 0.0f, 0.0f, 0);
                var3.id_class(var2, var15, var13, var14, ColorHelper.id_break(rrZF.d_, (int)(var10 * 255.0f)), false);
            }
            var2.id_break();
        }
    }

    @EventTarget
    public void id_class(rrFK var1) {
        this.id_return();
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_else();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            if (((List)this.id_break[0]).isEmpty()) {
                return;
            }
            ArrayList<rryB> var2 = new ArrayList<rryB>();
            rfl_3 var3 = ((cb_3)StructureTimer.id_import.id_class[57]).rN().id_class(1.0);
            for (rryB var5 : (List)this.id_break[0]) {
                if (!var5.id_byte().id_byte(var3)) continue;
                var2.add(var5);
            }
            this.id_class(var2);
        }
    }

    @EventTarget
    public void id_class(j_1 var1) {
        this.id_else();
        if (!((List)this.id_break[0]).isEmpty()) {
            ((List)this.id_break[0]).removeIf(var1x -> {
                boolean var2;
                var1x.id_native();
                boolean bl = var2 = var1x.id_extends() && !var1x.id_finally().id_case();
                if (var2 && var1x.id_final()) {
                    this.id_break((rryB)var1x);
                }
                return var2;
            });
        }
    }

    public void id_class(rryB var1) {
        this.id_class(var1, ((cq_3)StructureTimer.id_import.id_class[19]).id_extends().id_catch().get(var1.id_catch()));
    }

    private static boolean id_class(float var0, float var1, float var2, float var3) {
        return var2 < id_const.id_volatile() && var0 > 0.0f && var1 < id_const.id_final() && var1 > -var3;
    }

    public void id_class(rryB var1, cd_3 var2) {
        if (var2 != null) {
            rgP_2 var3 = var2.id_implements();
            rVi_1 var4 = this.id_private(var1);
            if (!var4.equals(var3)) {
                var2.id_class(1.0f - var1.id_volatile());
            }
            var2.id_class(var4);
            if (var2.id_class() <= 0.0f) {
                this.id_break(var1);
            }
        }
    }

    @EventTarget
    public void id_class(rrAM var1) {
        this.id_return();
    }

    @EventTarget
    public void id_class(rrnN_2 var1) {
        this.id_catch(new rryS(var1.id_class(), var1.id_break()));
    }

    public void id_break(rryB var1) {
        ((cq_3)StructureTimer.id_import.id_class[19]).id_extends().id_catch().remove(var1.id_catch());
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        this.id_return();
    }

    public void id_throws(rryB var1) {
        this.id_break(var1);
    }

    private void id_catch(rryB var1) {
        this.id_else();
        ((List)this.id_break[0]).add(var1);
    }

    private void id_else() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
        }
    }

    private void id_return() {
        this.id_try();
        this.id_super();
    }

    private void id_super() {
        this.id_else();
        ((Set)this.id_break[1]).clear();
    }

    private void id_try() {
        this.id_else();
        for (rryB var2 : (List)this.id_break[0]) {
            this.id_break(var2);
        }
        ((List)this.id_break[0]).clear();
    }

    public void id_protected(rryB var1) {
        UUID var2 = var1.id_catch();
        ((cq_3)StructureTimer.id_import.id_class[19]).id_extends().id_catch().put(var2, new cd_3(var2, this.id_private(var1), rRb_1.WHITE, rRM.PROGRESS, 1.0f - var1.id_volatile(), false, false, false));
    }

    private rVi_1 id_private(rryB var1) {
        return new rgN_2(var1.id_case()).id_class(new rgN_2(", \u0438\u0441\u0447\u0435\u0437\u043d\u0435\u0442 \u0447\u0435\u0440\u0435\u0437 " + String.valueOf((Object)rgF_2.RED) + var1.id_implements() + " \u0441\u0435\u043a."));
    }
}

