/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.render;

import celestial.Aw_1;
import celestial.Y;
import celestial.an_3;
import celestial.cG_2;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.jI_2;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rLD;
import celestial.rLY;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rnO_2;
import celestial.rrFT;
import celestial.rrFp_1;
import celestial.rrFq_1;
import celestial.rrFy_1;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrIy_1;
import celestial.rrLr_1;
import celestial.rrLu_1;
import celestial.rrfu_3;
import celestial.rrnv_3;
import celestial.rrtJ_2;
import celestial.rrtO_2;
import celestial.rrtd_3;
import celestial.rrth_3;
import celestial.rrwg_3;
import celestial.ruS_2;
import celestial.rvQ_2;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import celestial.uR_2;
import celestial.util.MinecraftAccessor;
import com.mojang.authlib.GameProfile;
import java.util.Set;
import java.util.UUID;
import org.apache.commons.lang3.tuple.Pair;

public class Notifications
extends Module
implements rrnv_3 {
    public static Object[] id_break;
    public Object[] id_byte;

    public Notifications() {
        super("Notifications", "\u041e\u0442\u043a\u043b\u0430\u0434\u043a\u0430 \u043e \u043a\u0430\u043a\u0438\u0445 \u043b\u0438\u0431\u043e \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u044f\u0445", Category.RENDER);
        Pair var14;
        this.id_return();
        rrIk_1 var5 = new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", true);
        this.id_byte[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", false);
        this.id_byte[1] = var6;
        rrIk_1 var7 = new rrIk_1("\u0412\u0430\u0441", false);
        this.id_byte[2] = var7;
        rrIk_1 var8 = new rrIk_1("\u0414\u0440\u0443\u0437\u0435\u0439", false);
        this.id_byte[3] = var8;
        rrIk_1 var9 = new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", false);
        this.id_byte[4] = var9;
        rrIk_1 var10 = new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", false);
        this.id_byte[5] = var10;
        rrIk_1 var11 = new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", false);
        this.id_byte[6] = var11;
        rrIk_1 var12 = new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", false);
        this.id_byte[7] = var12;
        rrIk_1 var13 = new rrIk_1("\u0423\u0432\u0435\u0434\u043e\u043c\u043b\u044f\u0442\u044c \u043e\u0431 \u043e\u043a\u043e\u043d\u0447\u0430\u043d\u0438\u0438\n\u0432\u0430\u0436\u043d\u044b\u0445 \u044d\u0444\u0444\u0435\u043a\u0442\u043e\u0432", true);
        this.id_byte[8] = var13;
        this.id_byte[9] = var14 = rrwg_3.id_class(new rrIk_1("\u0412\u043e\u0441\u043f\u0440\u043e\u0438\u0437\u0432\u043e\u0434\u0438\u0442\u044c \u0437\u0432\u0443\u043a", true), new rrIm_1("\u041f\u0438\u0442\u0447 \u0437\u0432\u0443\u043a\u0430", Float.valueOf(1.0f), Float.valueOf(0.1f), Float.valueOf(2.0f), Float.valueOf(0.1f)));
        this.id_class(new GroupSetting("\u041f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435 \u043c\u043e\u0434\u0443\u043b\u0435\u0439", new Setting[]{(rrIk_1)this.id_byte[0]}), new GroupSetting("\u0423\u043f\u043e\u043c\u0438\u043d\u0430\u043d\u0438\u0435 \u0432 \u0447\u0430\u0442\u0435", (rrIk_1)this.id_byte[1], (Setting)new rrIc_1("\u0423\u043f\u043e\u043c\u0438\u043d\u0430\u043d\u0438\u0435 \u043a\u043e\u0433\u043e", (rrIk_1)this.id_byte[2], (rrIk_1)this.id_byte[3]).id_class(() -> ((rrIk_1)this.id_byte[1]).id_class())), new GroupSetting("\u0421\u043f\u0435\u043a \u0432 \u0447\u0430\u0442\u0435", new Setting[]{(rrIk_1)this.id_byte[4]}), new GroupSetting("\u0412\u0430\u0440\u043f \u0432 \u0447\u0430\u0442\u0435", new Setting[]{(rrIk_1)this.id_byte[5]}), new GroupSetting("/pvp \u0432 \u0447\u0430\u0442\u0435", new Setting[]{(rrIk_1)this.id_byte[6]}), new GroupSetting("\u0421\u043d\u043e\u0441 \u0449\u0438\u0442\u0430", new Setting[]{(rrIk_1)this.id_byte[7]}), new GroupSetting("\u0414\u0440\u0443\u0433\u043e\u0435", new Setting[]{(rrIk_1)this.id_byte[8]}), new GroupSetting("\u041e\u0431\u0449\u0438\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438", (Setting)((Pair)this.id_byte[9]).getLeft(), (Setting)((Pair)this.id_byte[9]).getRight()));
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_return();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) && ((rrIk_1)this.id_byte[8]).id_class().booleanValue()) {
            for (rLY var4 : ((cb_3)Notifications.id_import.id_class[57]).So()) {
                int var5 = var4.id_break();
                if (var5 != 200 || !((Set)id_break[0]).contains(var4.id_class())) continue;
                Object var6 = jI_2.id_class("ru_ru", var4.id_class().id_byte(), new Object[0]);
                int var7 = var4.id_byte() + 1;
                if (var7 > 1) {
                    var6 = (String)var6 + " " + var7;
                }
                rVi_1 var8 = new rgN_2("\u042d\u0444\u0444\u0435\u043a\u0442 '").id_break((String)var6).id_class(rgF_2.GRAY).id_break("' \u0437\u0430\u043a\u043e\u043d\u0447\u0438\u0442\u0441\u044f \u0447\u0435\u0440\u0435\u0437 ").id_class(new rgN_2("10 \u0441\u0435\u043a\u0443\u043d\u0434").id_class(rgF_2.RED));
                rrfu_3.id_class(var8);
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtd_3(this.id_case(), var8.id_class(rgF_2.WHITE), 4000));
            }
        }
    }

    @EventTarget
    public void id_class(rrFy_1 var1) {
        this.id_return();
        if (((rrIk_1)this.id_byte[1]).id_class().booleanValue()) {
            boolean var8;
            boolean var7;
            Aw_1 var2 = var1.id_class();
            Set<String> var3 = var1.id_break();
            String var4 = ((cb_3)Notifications.id_import.id_class[57]).sv().getName();
            rgN_2 var5 = new rgN_2(this.id_final());
            rgP_2 var6 = uR_2.id_break(var2, rnO_2.PREFIX, rnO_2.NAME);
            boolean bl = var7 = ((rrIk_1)this.id_byte[2]).id_class() != false && var3.contains(var4);
            boolean bl2 = ((rrIk_1)this.id_byte[3]).id_class() != false && var3.size() > (var7 ? 1 : 0) ? true : (var8 = false);
            if (var7) {
                rVi_1 var9 = new rgN_2("\u0418\u0433\u0440\u043e\u043a '").id_class(var6).id_break("' \u0443\u043f\u043e\u043c\u044f\u043d\u0443\u043b ").id_class(new rgN_2("\u0432\u0430\u0441").id_class(rgF_2.RED));
                rrtd_3 var10 = new rrtd_3(var5, var9.id_case(), 4000);
                rrfu_3.id_class(var9.id_class(rgF_2.GRAY));
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var10);
                MinecraftAccessor.a_(var9.id_byte(), false);
            }
            if (var8) {
                var3.remove(var4);
                rVi_1 var11 = new rgN_2("\u0418\u0433\u0440\u043e\u043a '").id_class(var6).id_break("' \u0443\u043f\u043e\u043c\u044f\u043d\u0443\u043b \u0434\u0440\u0443\u0437\u0435\u0439: ").id_class(new rgN_2(String.join((CharSequence)", ", var3)).id_class(rgF_2.RED));
                rrtd_3 var12 = new rrtd_3(var5, var11.id_case(), 4000);
                rrfu_3.id_class(var11.id_class(rgF_2.GRAY));
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var12);
                MinecraftAccessor.a_(var11.id_byte(), false);
            }
        }
    }

    @EventTarget
    public void id_class(rrFp_1 var1) {
        this.id_return();
        if (((rrIk_1)this.id_byte[6]).id_class().booleanValue()) {
            rgN_2 var2 = new rgN_2(this.id_final());
            Aw_1 var3 = var1.id_class();
            rgP_2 var4 = uR_2.id_break(var3, rnO_2.PREFIX, rnO_2.NAME);
            rVi_1 var5 = new rgN_2("\u0418\u0433\u0440\u043e\u043a '").id_class(var4).id_break("' \u0437\u043e\u0432\u0451\u0442 \u043d\u0430 ").id_class(new rgN_2("/pvp").id_class(rgF_2.RED));
            rrtd_3 var6 = new rrtd_3(var2, var5.id_case(), 4000);
            rrfu_3.id_class(var5.id_class(rgF_2.GRAY));
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var6);
            MinecraftAccessor.a_(var5.id_byte(), false);
        }
    }

    @EventTarget
    public void id_class(rrFq_1 var1) {
        this.id_return();
        if (((rrIk_1)this.id_byte[4]).id_class().booleanValue()) {
            rgN_2 var2 = new rgN_2(this.id_final());
            Aw_1 var3 = var1.id_class();
            GameProfile var4 = var3.id_class();
            UUID var5 = var4.getId();
            rgP_2 var6 = uR_2.id_break(var3, rnO_2.PREFIX, rnO_2.NAME);
            rVi_1 var7 = new rgN_2("\u0418\u0433\u0440\u043e\u043a '").id_class(var6).id_break("' \u0437\u043e\u0432\u0451\u0442 ").id_class(new rgN_2("\u0441\u043f\u0435\u043a\u0430\u0442\u044c").id_class(rgF_2.RED));
            rrtJ_2 var8 = new rrtJ_2(var2, var7.id_case(), 4000);
            rhd_3 var9 = ((gm_3)Notifications.id_import.id_class[56]).id_class(var5);
            if (var9 != null) {
                rrfu_3.id_class(var7.id_class(rgF_2.GRAY));
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var8);
                MinecraftAccessor.a_(var7.id_byte(), false);
            }
        }
    }

    @EventTarget
    public void id_class(rrLu_1 var1) {
        an_3 var7;
        rvQ_2 var2;
        this.id_return();
        ruS_2<?> ruS_22 = var1.id_class();
        if (ruS_22 instanceof rvQ_2 && (var2 = (rvQ_2)ruS_22).id_break() == 30 && ((rrIk_1)this.id_byte[7]).id_class().booleanValue() && (var7 = var2.id_class((gm_3)Notifications.id_import.id_class[56])) != (cb_3)Notifications.id_import.id_class[57] && var7 instanceof cG_2) {
            cG_2 var4 = (cG_2)var7;
            rgN_2 var5 = new rgN_2(this.id_final());
            rgN_2 var10000 = new rgN_2("\u0429\u0438\u0442 \u0438\u0433\u0440\u043e\u043a\u0430 '");
            Aw_1 var10001 = var4.id_continue();
            rVi_1 var6 = var10000.id_class(uR_2.id_break(var10001, rnO_2.PREFIX, rnO_2.NAME)).id_break("' \u0441\u043b\u043e\u043c\u0430\u043d");
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtd_3(var5, var6, 2000));
        }
    }

    @EventTarget
    public void id_class(rrLr_1 var1) {
        this.id_return();
        rrtO_2 var2 = var1.id_class();
        if (((rrIk_1)((Pair)this.id_byte[9]).getLeft()).id_class().booleanValue() && var2.id_class()) {
            rrIy_1.id_class(var2.id_throws(), 1.0f, ((Float)((rrIm_1)((Pair)this.id_byte[9]).getRight()).id_byte()).floatValue());
        }
    }

    @EventTarget
    public void id_class(rrFT var1) {
        this.id_return();
        if (((rrIk_1)this.id_byte[5]).id_class().booleanValue()) {
            Aw_1 var2 = var1.id_class();
            rgN_2 var3 = new rgN_2(this.id_final());
            rgP_2 var4 = uR_2.id_break(var2, rnO_2.PREFIX, rnO_2.NAME);
            rVi_1 var5 = new rgN_2("\u0418\u0433\u0440\u043e\u043a '").id_class(var4).id_break("' \u0437\u043e\u0432\u0451\u0442 \u043d\u0430 \u0432\u0430\u0440\u043f ").id_class(new rgN_2("'" + var1.id_break() + "'").id_class(rgF_2.RED));
            rrtd_3 var6 = new rrtd_3(var3, var5.id_case(), 4000);
            rrfu_3.id_class(var5.id_class(rgF_2.GRAY));
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var6);
            MinecraftAccessor.a_(var5.id_byte(), false);
        }
    }

    public boolean id_new() {
        this.id_return();
        return ((rrIk_1)this.id_byte[0]).id_class();
    }

    private void id_return() {
        if (this.id_byte == null) {
            this.id_byte = new Object[10];
        }
    }

    static {
        Object[] var0 = new Object[]{Set.of(rLD.id_throws, rLD.id_class, rLD.id_final)};
        id_break = var0;
    }
}

