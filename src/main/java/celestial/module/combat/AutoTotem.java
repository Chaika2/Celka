/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.combat;

import celestial.Ax_1;
import celestial.Wv_1;
import celestial.Y;
import celestial.an_3;
import celestial.ao_3;
import celestial.cb_3;
import celestial.cq_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rSa_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rrCW;
import celestial.rrCk_1;
import celestial.rrCz_1;
import celestial.rrIQ;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrfY_2;
import celestial.rrjQ_2;
import celestial.rrjc_3;
import celestial.rrju_3;
import celestial.rrnb_3;
import celestial.rrwg_3;
import celestial.rsX_2;
import celestial.setting.Setting;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import org.apache.commons.lang3.tuple.Pair;

public class AutoTotem
extends Module {
    public Object[] id_break;
    public static Object[] id_byte;

    private void id_char() {
        if (this.id_break == null) {
            this.id_break = new Object[9];
            this.id_break[8] = 0;
        }
    }

    private boolean id_long() {
        return ((rrIk_1)((Pair)id_byte[4]).getLeft()).id_class();
    }

    private float id_float() {
        this.id_char();
        return ((Float)((rrIm_1)this.id_break[4]).id_byte()).floatValue();
    }

    public AutoTotem() {
        super("Auto Totem", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0431\u0435\u0440\u0435\u0442 \u0442\u043e\u0442\u0435\u043c \u0432 \u0440\u0443\u043a\u0443", Category.COMBAT);
        this.id_char();
        rrIQ var5 = (rrIQ)new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Funtime", "Funtime", "Advanced").id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_char();
            if ((rrCk_1)this.id_break[0] != null && this.aJ_()) {
                ((rrCk_1)this.id_break[0]).aK_();
            }
            rrCz_1 var9x = switch ((String)var2.getLeft()) {
                case "Funtime" -> (rrCz_1)this.id_break[6];
                case "Advanced" -> (rrCW)this.id_break[7];
                default -> null;
            };
            this.id_break[0] = var9x;
            if ((rrCk_1)this.id_break[0] != null && this.aJ_()) {
                ((rrCk_1)this.id_break[0]).aI_();
            }
        });
        this.id_break[1] = var5;
        rrIk_1 var6 = new rrIk_1("\u0421\u043e\u0445\u0440\u0430\u043d\u044f\u0442\u044c \u0437\u0430\u0447\u0430\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0435", true);
        this.id_break[2] = var6;
        rrIk_1 var7 = new rrIk_1("\u041d\u0435 \u043c\u0435\u043d\u044f\u0442\u044c \u0448\u0430\u0440", true);
        this.id_break[3] = var7;
        rrIm_1 var8 = new rrIm_1("\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435", Float.valueOf(5.0f), Float.valueOf(1.0f), Float.valueOf(20.0f), Float.valueOf(0.5f));
        this.id_break[4] = var8;
        rrIk_1 var9 = new rrIk_1("\u0421\u0447\u0435\u0442\u0447\u0438\u043a \u0442\u043e\u0442\u0435\u043c\u043e\u0432", true);
        this.id_break[5] = var9;
        rrCz_1 var10 = new rrCz_1(this);
        this.id_break[6] = var10;
        rrCW var11 = new rrCW(this);
        this.id_break[7] = var11;
        this.id_class(new rrIc_1("\u0421\u0440\u0430\u0431\u0430\u0442\u044b\u0432\u0430\u0442\u044c \u043d\u0430", (rrIk_1)((Pair)id_byte[1]).getLeft(), (rrIk_1)((Pair)id_byte[0]).getLeft(), (rrIk_1)((Pair)id_byte[3]).getLeft(), (rrIk_1)((Pair)id_byte[4]).getLeft(), (rrIk_1)((Pair)id_byte[2]).getLeft()), (rrIQ)this.id_break[1], (Setting)((Pair)id_byte[0]).getRight(), (Setting)((Pair)id_byte[1]).getRight(), (Setting)((Pair)id_byte[2]).getRight(), (Setting)((Pair)id_byte[3]).getRight(), (Setting)((Pair)id_byte[4]).getRight(), (rrIm_1)this.id_break[4], (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[5]);
        rrCz_1 var12 = (rrCz_1)this.id_break[6];
        this.id_break[0] = var12;
    }

    public Pair<rdn_3, Integer> id_this() {
        if (((cb_3)AutoTotem.id_import.id_class[57]).sK().id_class(rdy_3.kL)) {
            return Pair.of(null, (Object)-1);
        }
        for (int var1 = 0; var1 < 45; ++var1) {
            rdn_3 var2 = ((rhz_3)((cb_3)AutoTotem.id_import.id_class[57]).id_implements[1]).id_extends(var1);
            if (var2.id_break() != rdy_3.kL || this.id_class(var2)) continue;
            return Pair.of((Object)var2, (Object)var1);
        }
        return Pair.of(null, (Object)-1);
    }

    public void id_class(float var1) {
        this.id_char();
        if (this.aJ_() && ((rrIk_1)this.id_break[5]).id_class().booleanValue()) {
            if ((cb_3)AutoTotem.id_import.id_class[57] == null || (gm_3)AutoTotem.id_import.id_class[56] == null) {
                return;
            }
            if (((cb_3)AutoTotem.id_import.id_class[57]).id_implements() || ((cb_3)AutoTotem.id_import.id_class[57]).id_native() || ((cb_3)AutoTotem.id_import.id_class[57]).rg() || !((Ax_1)AutoTotem.id_import.id_class[55]).id_class()) {
                return;
            }
            int var2 = (Integer)((cb_3)AutoTotem.id_import.id_class[57]).id_implements[19] >= 1 && !((cb_3)AutoTotem.id_import.id_class[57]).L() ? 54 : 47;
            ((cq_3)AutoTotem.id_import.id_class[19]).id_class(id_const.id_package() - 9.0f, id_const.id_this() - var2, var1, (cb_3)AutoTotem.id_import.id_class[57], (rdn_3)id_byte[5], true);
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_char();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            this.id_break[8] = rrfY_2.id_class(rdy_3.kL, var0 -> !var0.id_protected("AttributeModifiers"));
        }
    }

    private boolean id_class(rdn_3 var1) {
        this.id_char();
        if (!((rrIk_1)this.id_break[2]).id_class().booleanValue()) {
            return false;
        }
        return var1.id_protected("AttributeModifiers") && (Integer)this.id_break[8] > 0;
    }

    @Override
    public void id_class(boolean var1) {
        if (this.id_new().aI_()) {
            super.id_class(var1);
        }
    }

    @EventTarget
    public void id_class(rrnb_3 var1) {
        rSa_1 var3;
        ao_3 ao_32;
        if ((cb_3)AutoTotem.id_import.id_class[57] != null && (gm_3)AutoTotem.id_import.id_class[56] != null && !((cb_3)AutoTotem.id_import.id_class[57]).id_implements() && !((cb_3)AutoTotem.id_import.id_class[57]).rg() && !this.id_for() && (ao_32 = var1.id_class()) instanceof rSa_1 && ((cb_3)AutoTotem.id_import.id_class[57]).id_implements(var3 = (rSa_1)ao_32) <= this.id_default()) {
            this.id_new().id_byte();
        }
    }

    private float id_default() {
        return ((Float)((rrIm_1)((Pair)id_byte[0]).getRight()).id_byte()).floatValue();
    }

    private boolean id_void() {
        return !this.id_throw() ? false : rrjc_3.id_class(var0 -> rrjc_3.id_protected(var0) instanceof Wv_1, (rrju_3)((Object)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[2]), this.id_instanceof()).findAny().isPresent();
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_char();
        if (this.id_new().aK_()) {
            super.id_throws(var1);
        }
        this.id_break[8] = 0;
    }

    private boolean id_goto() {
        return ((rrIk_1)((Pair)id_byte[0]).getLeft()).id_class();
    }

    public boolean id_continue() {
        for (rpm_3 var4 : rpm_3.values()) {
            rdn_3 var5 = ((cb_3)AutoTotem.id_import.id_class[57]).id_protected(var4);
            if (this.id_class(var5) || var5.id_break() != rdy_3.kL) continue;
            return true;
        }
        return false;
    }

    private boolean id_for() {
        this.id_char();
        return ((rrIk_1)this.id_break[3]).id_class() == false ? false : rrjQ_2.id_class(((cb_3)AutoTotem.id_import.id_class[57]).Sn());
    }

    private float id_import() {
        return ((Float)((rrIm_1)((Pair)id_byte[3]).getRight()).id_byte()).floatValue();
    }

    private float id_instanceof() {
        return ((Float)((rrIm_1)((Pair)id_byte[2]).getRight()).id_byte()).floatValue();
    }

    public rrCk_1 id_new() {
        this.id_char();
        return (rrCk_1)this.id_break[0];
    }

    public boolean id_super() {
        if (!((cb_3)AutoTotem.id_import.id_class[57]).id_implements() && !((cb_3)AutoTotem.id_import.id_class[57]).rg() && ((cb_3)AutoTotem.id_import.id_class[57]).BM()) {
            if (((cb_3)AutoTotem.id_import.id_class[57]).Ss() + ((cb_3)AutoTotem.id_import.id_class[57]).Sd() <= this.id_float()) {
                return true;
            }
            if (!this.id_for()) {
                if (this.id_public()) {
                    return true;
                }
                if (this.id_static()) {
                    return true;
                }
                if (this.id_void()) {
                    return true;
                }
                if (this.id_while()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private boolean id_throw() {
        return ((rrIk_1)((Pair)id_byte[2]).getLeft()).id_class();
    }

    private float id_try() {
        return ((Float)((rrIm_1)((Pair)id_byte[1]).getRight()).id_byte()).floatValue();
    }

    private boolean id_while() {
        if (!this.id_long()) {
            return false;
        }
        return ((Float)((cb_3)AutoTotem.id_import.id_class[57]).id_throws[31]).floatValue() >= this.id_transient();
    }

    private boolean id_static() {
        return !this.id_strictfp() ? false : rrjc_3.id_class(rrjc_3::id_byte, (rrju_3)((Object)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[2]), this.id_try()).findAny().isPresent();
    }

    private boolean id_public() {
        for (Int2ObjectMap.Entry var2 : ((gm_3)AutoTotem.id_import.id_class[56]).id_return().int2ObjectEntrySet()) {
            an_3 var3 = (an_3)var2.getValue();
            if (!(var3 instanceof rSa_1 && this.id_goto() ? ((cb_3)AutoTotem.id_import.id_class[57]).id_implements(var3) <= this.id_default() : var3 instanceof rsX_2 && this.id_abstract() && ((cb_3)AutoTotem.id_import.id_class[57]).id_implements(var3) <= this.id_import())) continue;
            return true;
        }
        return false;
    }

    private boolean id_abstract() {
        return ((rrIk_1)((Pair)id_byte[3]).getLeft()).id_class();
    }

    private float id_transient() {
        return ((Float)((rrIm_1)((Pair)id_byte[4]).getRight()).id_byte()).floatValue();
    }

    private boolean id_strictfp() {
        return ((rrIk_1)((Pair)id_byte[1]).getLeft()).id_class();
    }

    static {
        Object[] var0 = new Object[]{rrwg_3.id_class(new rrIk_1("\u041a\u0440\u0438\u0441\u0442\u0430\u043b\u043b", true), new rrIm_1("\u0420\u0430\u0434\u0438\u0443\u0441 \u0434\u043e \u043a\u0440\u0438\u0441\u0442\u0430\u043b\u043b\u0430", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f))), rrwg_3.id_class(new rrIk_1("\u041e\u0431\u0441\u0438\u0434\u0438\u0430\u043d", false), new rrIm_1("\u0420\u0430\u0434\u0438\u0443\u0441 \u0434\u043e \u043e\u0431\u0441\u0438\u0434\u0438\u0430\u043d\u0430", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f))), rrwg_3.id_class(new rrIk_1("\u042f\u043a\u043e\u0440\u044c", false), new rrIm_1("\u0420\u0430\u0434\u0438\u0443\u0441 \u0434\u043e \u044f\u043a\u043e\u0440\u044f", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f))), rrwg_3.id_class(new rrIk_1("\u0414\u0438\u043d\u0430\u043c\u0438\u0442", false), new rrIm_1("\u0420\u0430\u0434\u0438\u0443\u0441 \u0434\u043e \u0434\u0438\u043d\u0430\u043c\u0438\u0442\u0430", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f))), rrwg_3.id_class(new rrIk_1("\u041f\u0430\u0434\u0435\u043d\u0438\u0435", false), new rrIm_1("\u0414\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u044c \u043f\u0430\u0434\u0435\u043d\u0438\u044f", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f))), new rdn_3(rdy_3.kL)};
        id_byte = var0;
    }
}

