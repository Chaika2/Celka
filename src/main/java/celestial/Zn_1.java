/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Ax_1;
import celestial.Fu_1;
import celestial.HF;
import celestial.Hd_1;
import celestial.Hx_1;
import celestial.MH;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.cb_3;
import celestial.ev_3;
import celestial.fZ_2;
import celestial.rJE;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgS_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rph_3;
import celestial.rqO_2;
import celestial.tm_3;
import celestial.yb_3;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Random;

public class Zn_1
extends Fu_1<rJE> {
    private static final rqO_2 id_boolean = new rqO_2("textures/gui/container/enchanting_table.png");
    private static final rqO_2 id_transient = new rqO_2("textures/entity/enchanting_table_book.png");
    private static final tm_3 id_for = new tm_3();
    private final Random id_double = new Random();
    public int id_class;
    public float id_throws;
    public float id_case;
    public float id_catch;
    public float id_private;
    public float id_implements;
    public float id_finally;
    private rdn_3 id_switch = rdn_3.id_break;

    public Zn_1(rJE rJE2, rhz_3 rhz_32, rgP_2 rgP_22) {
        super(rJE2, rhz_32, rgP_22);
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        HF.id_byte();
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(id_boolean);
        int n3 = (this.id_package - this.id_synchronized) / 2;
        int n4 = (this.id_int - this.id_return) / 2;
        this.id_break(ml_1, n3, n4, 0, 0, this.id_synchronized, this.id_return);
        RenderSystem.matrixMode(5889);
        RenderSystem.pushMatrix();
        RenderSystem.loadIdentity();
        int n5 = (int)this.id_volatile.id_else().id_return();
        RenderSystem.viewport((this.id_package - 320) / 2 * n5, (this.id_int - 240) / 2 * n5, 320 * n5, 240 * n5);
        RenderSystem.translatef(-0.34f, 0.23f, 0.0f);
        RenderSystem.multMatrix(rjV_2.id_class(90.0, 1.3333334f, 9.0f, 80.0f));
        RenderSystem.matrixMode(5888);
        ml_1.id_class();
        MH mH = ml_1.id_byte();
        mH.id_class().id_class();
        mH.id_break().id_byte();
        ml_1.id_class(0.0, (double)3.3f, 1984.0);
        float f2 = 5.0f;
        ml_1.id_class(5.0f, 5.0f, 5.0f);
        ml_1.id_class(rje_3.id_case.id_byte(180.0f));
        ml_1.id_class(rje_3.id_break.id_byte(20.0f));
        float f3 = rfU_2.id_catch(f, this.id_finally, this.id_implements);
        ml_1.id_class((double)((1.0f - f3) * 0.2f), (double)((1.0f - f3) * 0.1f), (double)((1.0f - f3) * 0.25f));
        float f4 = -(1.0f - f3) * 90.0f - 90.0f;
        ml_1.id_class(rje_3.id_protected.id_byte(f4));
        ml_1.id_class(rje_3.id_break.id_byte(180.0f));
        float f5 = rfU_2.id_catch(f, this.id_case, this.id_throws) + 0.25f;
        float f6 = rfU_2.id_catch(f, this.id_case, this.id_throws) + 0.75f;
        f5 = (f5 - (float)rfU_2.id_break((double)f5)) * 1.6f - 0.3f;
        f6 = (f6 - (float)rfU_2.id_break((double)f6)) * 1.6f - 0.3f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        RenderSystem.enableRescaleNormal();
        id_for.id_class(0.0f, f5, f6, f3);
        Hd_1 hd_1 = Hx_1.id_class(yb_3.id_class().id_byte());
        Ok_1 ok_1 = hd_1.getBuffer(id_for.id_class(id_transient));
        id_for.id_class(ml_1, ok_1, 0xF000F0, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
        hd_1.id_break();
        ml_1.id_break();
        RenderSystem.matrixMode(5889);
        RenderSystem.viewport(0, 0, this.id_volatile.id_else().id_extends(), this.id_volatile.id_else().id_native());
        RenderSystem.popMatrix();
        RenderSystem.matrixMode(5888);
        HF.id_protected();
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        rph_3.id_class().id_class(((rJE)this.id_instanceof).id_break());
        int n6 = ((rJE)this.id_instanceof).id_class();
        for (int i = 0; i < 3; ++i) {
            int n7 = n3 + 60;
            int n8 = n7 + 20;
            this.id_class(false);
            this.id_volatile.A().id_class(id_boolean);
            int n9 = ((rJE)this.id_instanceof).id_class[i];
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            if (n9 == 0) {
                this.id_break(ml_1, n7, n4 + 14 + 19 * i, 0, 185, 108, 19);
                continue;
            }
            String string = "" + n9;
            int n10 = 86 - this.id_super.id_break(string);
            rgS_2 rgS_22 = rph_3.id_class().id_class(this.id_super, n10);
            int n11 = 6839882;
            if (!(n6 >= i + 1 && (Integer)((cb_3)this.id_volatile.id_class[57]).id_implements[19] >= n9 || ((rhx_3)((cb_3)this.id_volatile.id_class[57]).id_implements[18]).id_protected)) {
                this.id_break(ml_1, n7, n4 + 14 + 19 * i, 0, 185, 108, 19);
                this.id_break(ml_1, n7 + 1, n4 + 15 + 19 * i, 16 * i, 239, 16, 16);
                this.id_super.id_class(rgS_22, n8, n4 + 16 + 19 * i, n10, (n11 & 0xFEFEFE) >> 1);
                n11 = 4226832;
            } else {
                int n12 = n - (n3 + 60);
                int n13 = n2 - (n4 + 14 + 19 * i);
                if (n12 >= 0 && n13 >= 0 && n12 < 108 && n13 < 19) {
                    this.id_break(ml_1, n7, n4 + 14 + 19 * i, 0, 204, 108, 19);
                    n11 = 0xFFFF80;
                } else {
                    this.id_break(ml_1, n7, n4 + 14 + 19 * i, 0, 166, 108, 19);
                }
                this.id_break(ml_1, n7 + 1, n4 + 15 + 19 * i, 16 * i, 223, 16, 16);
                this.id_super.id_class(rgS_22, n8, n4 + 16 + 19 * i, n10, n11);
                n11 = 8453920;
            }
            this.id_super.id_class(ml_1, string, (float)(n8 + 86 - this.id_super.id_break(string)), (float)(n4 + 16 + 19 * i + 7), n11);
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        f = this.id_volatile.X();
        this.id_class(ml_1);
        super.id_class(ml_1, n, n2, f);
        this.id_break(ml_1, n, n2);
        boolean bl = ((rhx_3)((cb_3)this.id_volatile.id_class[57]).id_implements[18]).id_protected;
        int n3 = ((rJE)this.id_instanceof).id_class();
        for (int i = 0; i < 3; ++i) {
            int n4 = ((rJE)this.id_instanceof).id_class[i];
            ev_3 ev_32 = ev_3.id_byte(((rJE)this.id_instanceof).id_break[i]);
            int n5 = ((rJE)this.id_instanceof).id_byte[i];
            int n6 = i + 1;
            if (!this.id_class(60, 14 + 19 * i, 108, 17, n, n2) || n4 <= 0 || n5 < 0 || ev_32 == null) continue;
            ArrayList arrayList = Lists.newArrayList();
            arrayList.add(new rgn_3("container.enchant.clue", ev_32.id_protected(n5)).id_class(rgF_2.WHITE));
            if (!bl) {
                arrayList.add(rgN_2.id_byte);
                if ((Integer)((cb_3)this.id_volatile.id_class[57]).id_implements[19] < n4) {
                    arrayList.add(new rgn_3("container.enchant.level.requirement", ((rJE)this.id_instanceof).id_class[i]).id_class(rgF_2.RED));
                } else {
                    rgn_3 rgn_32 = n6 == 1 ? new rgn_3("container.enchant.lapis.one") : new rgn_3("container.enchant.lapis.many", n6);
                    arrayList.add(rgn_32.id_class(n3 >= n6 ? rgF_2.GRAY : rgF_2.RED));
                    rgn_3 rgn_33 = n6 == 1 ? new rgn_3("container.enchant.level.one") : new rgn_3("container.enchant.level.many", n6);
                    arrayList.add(rgn_33.id_class(rgF_2.GRAY));
                }
            }
            this.id_class(ml_1, arrayList, n, n2);
            break;
        }
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        int n2 = (this.id_package - this.id_synchronized) / 2;
        int n3 = (this.id_int - this.id_return) / 2;
        for (int i = 0; i < 3; ++i) {
            double d3 = d - (double)(n2 + 60);
            double d4 = d2 - (double)(n3 + 14 + 19 * i);
            if (!(d3 >= 0.0) || !(d4 >= 0.0) || !(d3 < 108.0) || !(d4 < 19.0) || !((rJE)this.id_instanceof).id_break((rhd_3)((cb_3)this.id_volatile.id_class[57]), i)) continue;
            ((Ax_1)this.id_volatile.id_class[55]).id_class(((rJE)this.id_instanceof).id_case, i);
            return true;
        }
        return super.id_break(d, d2, n);
    }

    public void id_finally() {
        rdn_3 rdn_32 = ((rJE)this.id_instanceof).id_class(0).id_class();
        if (!rdn_3.id_break(rdn_32, this.id_switch)) {
            this.id_switch = rdn_32;
            do {
                this.id_catch += (float)(this.id_double.nextInt(4) - this.id_double.nextInt(4));
            } while (this.id_throws <= this.id_catch + 1.0f && this.id_throws >= this.id_catch - 1.0f);
        }
        ++this.id_class;
        this.id_case = this.id_throws;
        this.id_finally = this.id_implements;
        boolean bl = false;
        for (int i = 0; i < 3; ++i) {
            if (((rJE)this.id_instanceof).id_class[i] == 0) continue;
            bl = true;
        }
        this.id_implements = bl ? (this.id_implements += 0.2f) : (this.id_implements -= 0.2f);
        this.id_implements = rfU_2.id_class(this.id_implements, 0.0f, 1.0f);
        float f = (this.id_catch - this.id_throws) * 0.4f;
        float f2 = 0.2f;
        f = rfU_2.id_class(f, -0.2f, 0.2f);
        this.id_private += (f - this.id_private) * 0.9f;
        this.id_throws += this.id_private;
    }

    @Override
    public void id_private() {
        super.id_private();
        this.id_finally();
    }
}

