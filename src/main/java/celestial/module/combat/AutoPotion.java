/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.combat;

import celestial.Ax_1;
import celestial.Y;
import celestial.cb_3;
import celestial.cq_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rAB;
import celestial.rLR;
import celestial.rLY;
import celestial.rdn_3;
import celestial.rhz_3;
import celestial.rjG_2;
import celestial.rpm_3;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrLu_1;
import celestial.rrQX;
import celestial.rrTI;
import celestial.rrTT;
import celestial.rrTg_1;
import celestial.rrTj_1;
import celestial.rrTp_1;
import celestial.rrTq_1;
import celestial.rrfH_2;
import celestial.rrfP_2;
import celestial.rrfZ_2;
import celestial.rrfo_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfw_3;
import celestial.rrjc_3;
import celestial.rrnF_2;
import celestial.rrnH_2;
import java.util.HashMap;
import java.util.Map;

public class AutoPotion
extends Module
implements rrnF_2 {
    public static Object[] id_break;
    public Object[] id_byte;

    public AutoPotion() {
        super("Auto Pot", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043a\u0438\u0434\u0430\u0435\u0442 \u0437\u0435\u043b\u044c\u044f", Category.COMBAT);
        this.id_return();
        rrIk_1 var5 = new rrIk_1("\u0422\u043e\u043b\u044c\u043a\u043e \u0432 \u041f\u0412\u041f", false);
        this.id_byte[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u0410\u0432\u0442\u043e. \u0432\u044b\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435", false);
        this.id_byte[1] = var6;
        rrTT var7 = new rrTT(this);
        this.id_byte[2] = var7;
        rrfP_2 var8 = new rrfP_2();
        this.id_byte[3] = var8;
        rrfw_3 var9 = new rrfw_3();
        this.id_byte[4] = var9;
        this.id_class(new rrIc_1("\u041a\u0438\u0434\u0430\u0442\u044c", (rrIk_1)id_break[2], (rrIk_1)id_break[1], (rrIk_1)id_break[0]), (rrIk_1)this.id_byte[0], (rrIk_1)this.id_byte[1]);
    }

    @EventTarget(id_class=100)
    public void id_class(q_1 var1) {
        this.id_return();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            if (!this.id_goto()) {
                this.id_super();
                return;
            }
            HashMap<Integer, rrnH_2> var2 = new HashMap<Integer, rrnH_2>();
            for (rrnH_2 var6 : rrnH_2.values()) {
                int var7;
                if (!var6.id_break().get().booleanValue() || !((rrfw_3)this.id_byte[4]).id_class(600.0) || this.id_break(var6) || (var7 = this.id_class(var6)) == -1) continue;
                var2.put(var7, var6);
            }
            boolean var9 = var2.isEmpty();
            ((rrfP_2)this.id_byte[3]).id_class(var9);
            if (var9) {
                this.id_super();
                return;
            }
            rrTg_1 var10 = () -> ((cb_3)AutoPotion.id_import.id_class[57]).id_goto().id_case(90.0f);
            ((rrTT)this.id_byte[2]).id_class((rrTj_1)var10, (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]));
            if (!((cb_3)AutoPotion.id_import.id_class[57]).z().id_break(var10.getNeedRotation(), 0.05f)) {
                return;
            }
            for (Map.Entry var12 : var2.entrySet()) {
                int var13 = (Integer)var12.getKey();
                int var8 = this.id_break(var13);
                if (var8 != -1) {
                    ((rrfw_3)this.id_byte[4]).id_class();
                }
                if (var8 <= 8) continue;
                ((Ax_1)AutoPotion.id_import.id_class[55]).id_class(var8);
            }
            rrfo_3.id_class(((rhz_3)((cb_3)AutoPotion.id_import.id_class[57]).id_implements[1]).id_protected);
            if (((rrIk_1)this.id_byte[1]).id_class().booleanValue()) {
                this.id_byte(false);
            }
        }
    }

    @EventTarget
    public void id_class(rrLu_1 var1) {
        this.id_return();
        ((rrfP_2)this.id_byte[3]).id_class(var1);
    }

    private int id_class(rrnH_2 var1) {
        rdn_3 var2 = ((cb_3)AutoPotion.id_import.id_class[57]).ss();
        rdn_3 var3 = ((cb_3)AutoPotion.id_import.id_class[57]).Sn();
        if (rrfH_2.id_break(var2.id_break())) {
            for (rLY var5 : rAB.id_class(var2)) {
                if (var5.id_class() != var1.id_byte()) continue;
                return -2;
            }
        }
        if (rrfH_2.id_break(var3.id_break())) {
            for (rLY var11 : rAB.id_class(var3)) {
                if (var11.id_class() != var1.id_byte()) continue;
                return -3;
            }
        }
        for (int var9 = 0; var9 < 9; ++var9) {
            rdn_3 var12 = ((rhz_3)((cb_3)AutoPotion.id_import.id_class[57]).id_implements[1]).id_extends(var9);
            if (!rrfH_2.id_break(var12.id_break())) continue;
            for (rLY var7 : rAB.id_class(var12)) {
                if (var7.id_class() != var1.id_byte()) continue;
                return var9;
            }
        }
        for (int var10 = 9; var10 < 36; ++var10) {
            rdn_3 var13 = ((rhz_3)((cb_3)AutoPotion.id_import.id_class[57]).id_implements[1]).id_extends(var10);
            if (!rrfH_2.id_break(var13.id_break())) continue;
            for (rLY var15 : rAB.id_class(var13)) {
                if (var15.id_class() != var1.id_byte()) continue;
                return var10;
            }
        }
        return -1;
    }

    @Override
    public float id_break() {
        return -1.0f;
    }

    private int id_break(int var1) {
        this.id_return();
        if (var1 == -2) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return var1;
        }
        if (var1 == -3) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            return var1;
        }
        if (var1 >= 0 && var1 < 9) {
            ((rrfP_2)this.id_byte[3]).id_class(((rhz_3)((cb_3)AutoPotion.id_import.id_class[57]).id_implements[1]).id_protected);
            rrfo_3.id_class(var1);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            rrfo_3.id_class(((rhz_3)((cb_3)AutoPotion.id_import.id_class[57]).id_implements[1]).id_protected);
            return var1;
        }
        if (var1 >= 9 && var1 <= 36) {
            ((rrfP_2)this.id_byte[3]).id_class(((rhz_3)((cb_3)AutoPotion.id_import.id_class[57]).id_implements[1]).id_protected);
            ((Ax_1)AutoPotion.id_import.id_class[55]).id_class(var1);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return var1;
        }
        return -1;
    }

    private boolean id_break(rrnH_2 var1) {
        rLR var2 = var1.id_byte();
        int var3 = 10;
        return ((cb_3)AutoPotion.id_import.id_class[57]).id_break(var2) && ((cb_3)AutoPotion.id_import.id_class[57]).id_byte(var2).id_break() > 20 * var3;
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        this.id_super();
    }

    @Override
    public rrTp_1 id_catch() {
        return (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3]);
    }

    private boolean id_goto() {
        this.id_return();
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_()) {
            return false;
        }
        if (((rrIk_1)this.id_byte[0]).id_class().booleanValue() && !rrfZ_2.id_byte()) {
            return false;
        }
        if ((rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) && ((cq_3)AutoPotion.id_import.id_class[19]).id_volatile().matches("\\d+")) {
            return false;
        }
        if (!(rrjc_3.id_break(0.5f) && !((cb_3)AutoPotion.id_import.id_class[57]).BL() || rrjc_3.id_class(2.0f))) {
            return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().E().id_long().id_break() >= 150L;
        }
        return false;
    }

    private void id_return() {
        if (this.id_byte == null) {
            this.id_byte = new Object[5];
        }
    }

    private void id_super() {
        this.id_return();
        ((rrTT)this.id_byte[2]).id_final();
    }

    @Override
    public float id_private() {
        return -1.0f;
    }

    @Override
    public rrTq_1 aB_() {
        return new rrTq_1(rjG_2.id_catch(), ((cb_3)AutoPotion.id_import.id_class[57]).id_goto());
    }

    static {
        Object[] var0 = new Object[]{new rrIk_1("\u0421\u0438\u043b\u0443", true), new rrIk_1("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", true), new rrIk_1("\u0417\u0430\u0449\u0438\u0442\u0443 \u043e\u0442 \u043e\u0433\u043d\u044f", true)};
        id_break = var0;
    }
}

