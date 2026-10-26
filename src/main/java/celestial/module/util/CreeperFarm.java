/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.C_throws;
import celestial.Ml_1;
import celestial.PI;
import celestial.Pf_1;
import celestial.Qg_1;
import celestial.Y;
import celestial.aI_2;
import celestial.an_3;
import celestial.bO_2;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.manager.FontManager;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rY_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfl_3;
import celestial.rgF_2;
import celestial.rjU_2;
import celestial.rqR_2;
import celestial.rql_3;
import celestial.rqy_3;
import celestial.rrFK;
import celestial.rrHt_1;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrLQ;
import celestial.rrLh_1;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrfu_3;
import celestial.rrjb_3;
import celestial.rrnB_2;
import celestial.rrnx_3;
import celestial.rsE_2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreeperFarm
extends Module {
    public Object[] id_break;

    private bO_2 id_long() {
        return C_throws.id_byte().id_break();
    }

    public CreeperFarm() {
        super("Creeper Farm", "Baritone \u0434\u043b\u044f \u043e\u0445\u043e\u0442\u044b \u043d\u0430 \u043a\u0440\u0438\u043f\u0435\u0440\u043e\u0432", Category.UTIL);
        ArrayList var6;
        ArrayList var5;
        this.id_instanceof();
        this.id_break[1] = var5 = new ArrayList();
        this.id_break[2] = var6 = new ArrayList();
        this.id_break[3] = -1L;
        this.id_break[5] = -1L;
        rrIk_1 var9 = new rrIk_1("\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u043f\u0440\u044b\u0436\u043e\u043a", true);
        this.id_break[9] = var9;
        rrIk_1 var10 = new rrIk_1("\u0410\u0442\u0430\u043a\u043e\u0432\u0430\u0442\u044c \u043e\u0434\u043d\u043e\u0432\u0440\u0435\u043c\u0435\u043d\u043d\u043e\n\u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u0441\u0443\u0449\u0435\u0441\u0442\u0432", true);
        this.id_break[10] = var10;
        rrIk_1 var11 = new rrIk_1("\u041e\u0442\u043a\u043b\u044e\u0447\u0430\u0442\u044c\u0441\u044f \u043f\u0440\u0438 \u043f\u043e\u043b\u043d\u043e\u043c\n\u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435", true);
        this.id_break[11] = var11;
        rrIk_1 var12 = new rrIk_1("\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u043f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434\n\u043d\u0430 \u0440\u0435\u0436\u0438\u043c", true);
        this.id_break[12] = var12;
        rrIm_1 var13 = (rrIm_1)new rrIm_1("\u0421\u0435\u043a\u0443\u043d\u0434 \u0434\u043b\u044f \u043f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434\u0430", Float.valueOf(60.0f), Float.valueOf(10.0f), Float.valueOf(600.0f), Float.valueOf(5.0f)).id_class(() -> ((rrIk_1)this.id_break[12]).id_class());
        this.id_break[13] = var13;
        this.id_class((rrIk_1)this.id_break[9], (rrIk_1)this.id_break[10], (rrIk_1)this.id_break[11], (rrIk_1)this.id_break[12], (rrIm_1)this.id_break[13]);
    }

    private void id_interface() {
        this.id_instanceof();
        if ((cb_3)CreeperFarm.id_import.id_class[57] != null && !((List)this.id_break[1]).isEmpty()) {
            rjU_2 var1 = ((cb_3)CreeperFarm.id_import.id_class[57]).Ps();
            rY_2 var2 = null;
            double var3 = Double.MAX_VALUE;
            for (int var5 = ((List)this.id_break[1]).size() - 1; var5 >= 0; --var5) {
                rY_2 var6 = (rY_2)((List)this.id_break[1]).get(var5);
                rfl_3 var7 = var6.id_break();
                if (var7.id_case(var1)) {
                    this.id_class(var6);
                    return;
                }
                double var8 = var1.id_case(var7.id_case());
                if (!(var8 < var3)) continue;
                var3 = var8;
                var2 = var6;
            }
            this.id_class(var2);
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_instanceof();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            boolean var2;
            boolean bl = var2 = !this.id_long().id_byte();
            if (var2) {
                if ((Long)this.id_break[5] == -1L) {
                    this.id_break[5] = rqR_2.id_break();
                }
            } else if ((Long)this.id_break[5] != -1L) {
                this.id_break[4] = (Long)this.id_break[4] + (rqR_2.id_break() - (Long)this.id_break[5]);
                this.id_break[5] = -1L;
            }
            this.id_else();
        }
    }

    @EventTarget
    public void id_class(rrLh_1 var1) {
        this.id_instanceof();
        String var2 = var1.id_class();
        Matcher var3 = ((Pattern)rrjb_3.id_class[7]).matcher(var2);
        if (var3.find()) {
            long var13 = 0L;
            var13 += Long.parseLong(var3.group(1).replaceAll("[^0-9]", ""));
            String var6 = var3.group(2);
            if (var6 != null) {
                var13 += Long.parseLong(var6.replaceAll("[^0-9]", ""));
            }
            this.id_break[8] = (Long)this.id_break[8] + var13;
        } else {
            Matcher var4 = ((Pattern)rrjb_3.id_class[8]).matcher(var2);
            if (var4.find()) {
                long var5 = Long.parseLong(var4.group(2).replaceAll("[^0-9]", ""));
                this.id_break[8] = (Long)this.id_break[8] + var5;
            }
        }
    }

    @EventTarget
    public void id_class(rrFK var1) {
        this.id_byte(false);
    }

    public void id_class(rY_2 var1) {
        this.id_instanceof();
        if (var1 == null) {
            throw new IllegalArgumentException("Selection cannot be null");
        }
        this.id_break[0] = var1;
        this.id_long().id_class(var1);
    }

    @EventTarget
    public void id_class(rrnx_3 var1) {
        this.id_instanceof();
        if (var1.id_break().BC() == aI_2.id_volatile) {
            this.id_break[6] = (Long)this.id_break[6] + 1L;
        }
    }

    @EventTarget
    public void id_class(rrLQ var1) {
        rsE_2 var2;
        rdn_3 var9;
        this.id_instanceof();
        an_3 an_32 = var1.id_class();
        if (an_32 instanceof rsE_2 && (var9 = (var2 = (rsE_2)an_32).id_protected()).id_break() == rdy_3.hr && var1.id_break().size() > 1 && (rY_2)this.id_break[0] != null && ((rY_2)this.id_break[0]).id_break().id_byte(var2.rN())) {
            this.id_break[7] = (Long)this.id_break[7] + (long)var9.id_char();
        }
    }

    @EventTarget
    public void id_class(rrnB_2 var1) {
        this.id_instanceof();
        if ((List)this.id_break[2] != null && !((List)this.id_break[2]).isEmpty()) {
            Ml_1 var2 = var1.id_class();
            Qg_1 var3 = id_import.id_else();
            rrZO var4 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class();
            int var5 = (int)(var3.id_volatile() / 2.0f);
            int var6 = (int)(var3.id_final() / 2.0f + 30.0f);
            for (int var7 = 0; var7 < ((List)this.id_break[2]).size(); ++var7) {
                rrHt_1 var8 = (rrHt_1)((List)this.id_break[2]).get(var7);
                if (var7 == 0) {
                    var4.id_class(var2, var8.id_break(), (double)((float)var5 - var8.id_class()), (double)var6, 15, 255);
                } else {
                    var4.id_break(var2, var8.id_break(), (float)var5 - var8.id_class(), var6, rrZF.d_, false);
                }
                var6 += 10;
            }
        }
    }

    @Override
    public void id_class(boolean var1) {
        this.id_instanceof();
        this.id_interface();
        if ((rY_2)this.id_break[0] == null) {
            String var10000 = rrfu_3.id_class(this);
            String var10001 = "\u041d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u044c \u043e\u0431\u043b\u0430\u0441\u0442\u044c \u0444\u0435\u0440\u043c\u044b \u043a\u0440\u0438\u043f\u0435\u0440\u043e\u0432. \u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0439\u0442\u0435 \u043a\u043e\u043c\u0430\u043d\u0434\u0443 %scf";
            rrfu_3.id_byte(var10000 + var10001.formatted(C_throws.id_break().id_protected.id_class[0]));
            this.id_byte(false);
        } else {
            super.id_class(var1);
            this.id_break[3] = rqR_2.id_break();
            this.id_break[4] = 0L;
            this.id_break[5] = -1L;
            Supplier<Object> var2 = () -> {
                Pf_1 var1x;
                PI var0 = C_throws.id_byte().id_native().id_protected();
                if (!(var0 == null || (var1x = var0.id_class()) != null && var1x.id_break())) {
                    return false;
                }
                return true;
            };
            this.id_long().id_class((rY_2)this.id_break[0], var2, (rrIk_1)this.id_break[9], (rrIk_1)this.id_break[10], (rrIk_1)this.id_break[11], (rrIk_1)this.id_break[12], (rrIm_1)this.id_break[13]);
            this.id_else();
        }
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        this.id_throw();
        this.id_abstract();
    }

    public List<rY_2> id_continue() {
        this.id_instanceof();
        return (List)this.id_break[1];
    }

    private void id_else() {
        List<rrHt_1> var17;
        this.id_instanceof();
        rrZO var1 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class();
        long var2 = rqR_2.id_break();
        long var4 = var2 - (Long)this.id_break[3];
        var4 = (Long)this.id_break[5] != -1L ? (long)((double)var4 - ((Double)this.id_break[4] + ((double)var2 - (Double)this.id_break[5]))) : (long)((double)var4 - (Double)this.id_break[4]);
        String var6 = this.id_final();
        rgF_2 var10000 = rgF_2.GRAY;
        Duration var10001 = Duration.ofMillis(Math.max(0L, var4));
        String var7 = "\u0412\u0440\u0435\u043c\u044f \u0440\u0430\u0431\u043e\u0442\u044b: " + String.valueOf((Object)var10000) + rql_3.id_class(var10001, rqy_3.HOURS, rqy_3.MINUTES, rqy_3.SECONDS);
        String var8 = "\u0423\u0431\u0438\u0442\u043e \u043a\u0440\u0438\u043f\u0435\u0440\u043e\u0432: " + String.valueOf((Object)rgF_2.GRAY) + (Long)this.id_break[6];
        long var9 = (Long)this.id_break[7] / (long)rdy_3.hr.id_implements();
        var10000 = rgF_2.GRAY;
        long var20 = (Long)this.id_break[7];
        String var11 = "\u0412\u044b\u0431\u0438\u0442\u043e \u043f\u043e\u0440\u043e\u0445\u0430: " + String.valueOf((Object)var10000) + var20 + " \u0448\u0442. (" + var9 + " " + rql_3.id_class(var9, "\u0441\u0442\u0430\u043a", "\u0441\u0442\u0430\u043a\u0430", "\u0441\u0442\u0430\u043a\u043e\u0432") + ")";
        String var12 = "\u0417\u0430\u0440\u0430\u0431\u043e\u0442\u0430\u043d\u043e: " + String.valueOf((Object)rgF_2.GRAY) + rql_3.id_class((Long)this.id_break[8], ' ') + "$";
        this.id_break[2] = var17 = List.of(new rrHt_1(var6, var1.id_break(var6) / 2.0f), new rrHt_1(var7, var1.id_break(var7) / 2.0f), new rrHt_1(var11, var1.id_break(var11) / 2.0f), new rrHt_1(var8, var1.id_break(var8) / 2.0f), new rrHt_1(var12, var1.id_break(var12) / 2.0f));
    }

    private void id_instanceof() {
        if (this.id_break == null) {
            this.id_break = new Object[14];
            this.id_break[3] = 0L;
            this.id_break[4] = 0L;
            this.id_break[5] = 0L;
            this.id_break[6] = 0L;
            this.id_break[7] = 0L;
            this.id_break[8] = 0L;
        }
    }

    public rY_2 id_new() {
        this.id_instanceof();
        return (rY_2)this.id_break[0];
    }

    public void id_super() {
        if (this.aJ_()) {
            this.id_byte(true);
        }
    }

    private void id_throw() {
        this.id_instanceof();
        this.id_break[6] = 0L;
        this.id_break[7] = 0L;
        this.id_break[8] = 0L;
        this.id_break[3] = -1L;
        this.id_break[4] = 0L;
        this.id_break[5] = -1L;
    }

    private void id_abstract() {
        this.id_long().id_protected();
    }
}

