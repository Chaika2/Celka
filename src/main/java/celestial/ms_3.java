/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 */
package celestial;

import celestial.Ax_1;
import celestial.Lm_1;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.Qw_1;
import celestial.VR;
import celestial.cC_2;
import celestial.cb_3;
import celestial.ch_3;
import celestial.cm_3;
import celestial.cp_3;
import celestial.gJ_2;
import celestial.gM_2;
import celestial.jV_2;
import celestial.jj_3;
import celestial.mE_2;
import celestial.mG_2;
import celestial.mP_2;
import celestial.mS_2;
import celestial.mX_2;
import celestial.mr_3;
import celestial.rJI;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rWr_1;
import celestial.rZH;
import celestial.rdn_3;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhz_3;
import celestial.rkI_2;
import celestial.rke_3;
import celestial.rkg_3;
import celestial.rkw_3;
import celestial.rqO_2;
import celestial.vm_3;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ms_3
extends ch_3
implements cC_2,
cp_3,
mS_2,
rkI_2<rkg_3> {
    protected static final rqO_2 id_class = new rqO_2("textures/gui/recipe_book.png");
    private static final rgP_2 id_implements = new rgn_3("gui.recipebook.search_hint").id_class(rgF_2.ITALIC).id_class(rgF_2.GRAY);
    private static final rgP_2 id_finally = new rgn_3("gui.recipebook.toggleRecipes.craftable");
    private static final rgP_2 id_extends = new rgn_3("gui.recipebook.toggleRecipes.all");
    private int id_native;
    private int id_volatile;
    private int id_final;
    protected final mr_3 id_throws = new mr_3();
    private final List<mX_2> id_package = Lists.newArrayList();
    private mX_2 id_int;
    protected Lm_1 id_case;
    protected rJI<?> id_catch;
    protected QY id_private;
    private Lu_1 id_new;
    private String id_continue = "";
    private VR id_super;
    private final mE_2 id_this = new mE_2();
    private final rWr_1 id_else = new rWr_1();
    private int id_synchronized;
    private boolean id_return;

    public void id_byte(Ml_1 ml_1, int n, int n2, int n3, int n4) {
        if (this.id_private()) {
            this.id_this.id_class(ml_1, n3, n4);
            if (this.id_case.B_()) {
                rgP_2 rgP_22 = this.id_volatile();
                if ((vm_3)this.id_private.id_class[73] != null) {
                    ((vm_3)this.id_private.id_class[73]).id_class(ml_1, rgP_22, n3, n4);
                }
            }
            this.id_protected(ml_1, n, n2, n3, n4);
        }
    }

    protected void id_byte(boolean bl) {
        this.id_super.id_class(this.id_catch.id_implements(), bl);
        if (!bl) {
            this.id_this.id_byte();
        }
        this.id_extends();
    }

    private boolean id_int() {
        return this.id_native == 86;
    }

    @Override
    public boolean id_class(char c, int n) {
        if (this.id_return) {
            return false;
        }
        if (this.id_private() && !((cb_3)this.id_private.id_class[57]).id_native()) {
            if (this.id_new.id_class(c, n)) {
                this.id_package();
                return true;
            }
            return cC_2.super.id_class(c, n);
        }
        return false;
    }

    private void id_class(String string) {
        if ("excitedze".equals(string)) {
            jV_2 jV_22 = this.id_private.u();
            jj_3 jj_32 = jV_22.id_class("en_pt");
            if (jV_22.id_break().id_class(jj_32) == 0) {
                return;
            }
            jV_22.id_class(jj_32);
            ((Qw_1)this.id_private.id_class[20]).rG = jj_32.getCode();
            this.id_private.id_private();
            ((Qw_1)this.id_private.id_class[20]).id_break();
        }
    }

    public void id_class(boolean bl) {
        this.id_native = bl ? 0 : 86;
        int n = (this.id_volatile - 147) / 2 - this.id_native;
        int n2 = (this.id_final - 166) / 2;
        this.id_else.id_class();
        ((rhz_3)((cb_3)this.id_private.id_class[57]).id_implements[1]).id_class(this.id_else);
        this.id_catch.id_class(this.id_else);
        String string = this.id_new != null ? this.id_new.id_private() : "";
        this.id_new = new Lu_1((cm_3)this.id_private.id_class[15], n + 25, n2 + 14, 80, 14, new rgn_3("itemGroup.search"));
        this.id_new.id_implements(50);
        this.id_new.id_protected(false);
        this.id_new.id_private(true);
        this.id_new.id_finally(0xFFFFFF);
        this.id_new.id_class(string);
        this.id_this.id_class(this.id_private, n, n2);
        this.id_this.id_class(this);
        this.id_case = new Lm_1(n + 110, n2 + 12, 26, 16, this.id_super.id_class(this.id_catch));
        this.id_class();
        this.id_package.clear();
        for (gM_2 gM_22 : gM_2.id_class(this.id_catch.id_implements())) {
            this.id_package.add(new mX_2(gM_22));
        }
        if (this.id_int != null) {
            this.id_int = this.id_package.stream().filter(mX_22 -> mX_22.id_class().equals((Object)this.id_int.id_class())).findFirst().orElse(null);
        }
        if (this.id_int == null) {
            this.id_int = this.id_package.get(0);
        }
        this.id_int.id_byte(true);
        this.id_protected(false);
        this.id_protected();
    }

    @Override
    public void id_class(List<rkw_3<?>> list) {
        for (rkw_3<?> rkw_32 : list) {
            ((cb_3)this.id_private.id_class[57]).id_class(rkw_32);
        }
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        this.id_return = false;
        if (this.id_private() && !((cb_3)this.id_private.id_class[57]).id_native()) {
            if (n == 256 && !this.id_int()) {
                this.id_byte(false);
                return true;
            }
            if (this.id_new.id_class(n, n2, n3)) {
                this.id_package();
                return true;
            }
            if (this.id_new.aO_() && this.id_new.id_int() && n != 256) {
                return true;
            }
            if (((Qw_1)this.id_private.id_class[20]).v.id_class(n, n2) && !this.id_new.aO_()) {
                this.id_return = true;
                this.id_new.id_byte(true);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean id_class(double d, double d2, int n, int n2, int n3, int n4, int n5) {
        if (!this.id_private()) {
            return true;
        }
        boolean bl = d < (double)n || d2 < (double)n2 || d >= (double)(n + n3) || d2 >= (double)(n2 + n4);
        boolean bl2 = (double)(n - 147) < d && d < (double)n && (double)n2 < d2 && d2 < (double)(n2 + n4);
        return bl && !bl2 && !this.id_int.B_();
    }

    public void id_class(Ml_1 ml_1, int n, int n2, boolean bl, float f) {
        this.id_throws.id_class(ml_1, this.id_private, n, n2, bl, f);
    }

    public void id_class(int n, int n2, QY qY, boolean bl, rJI<?> rJI2) {
        rJI<?> rJI3;
        this.id_private = qY;
        this.id_volatile = n;
        this.id_final = n2;
        this.id_catch = rJI2;
        ((cb_3)qY.id_class[57]).id_implements[4] = rJI3 = rJI2;
        this.id_super = ((cb_3)qY.id_class[57]).Z();
        this.id_synchronized = ((rhz_3)((cb_3)qY.id_class[57]).id_implements[1]).id_implements();
        if (this.id_private()) {
            this.id_class(bl);
        }
        ((Qj_1)qY.id_class[23]).id_class(true);
    }

    private static /* synthetic */ boolean id_class(ObjectSet objectSet, mG_2 mG_22) {
        return !objectSet.contains((Object)mG_22);
    }

    @Override
    public void id_class(Iterator<rkg_3> iterator, int n, int n2, int n3, int n4) {
        rkg_3 rkg_32 = iterator.next();
        if (!rkg_32.id_protected()) {
            rJY rJY2 = (rJY)this.id_catch.id_throws.get(n);
            this.id_throws.id_class(rkg_32, rJY2.id_throws, rJY2.id_case);
        }
    }

    public void id_class(rkw_3<?> rkw_32, List<rJY> list) {
        rdn_3 rdn_32 = rkw_32.id_byte();
        this.id_throws.id_class(rkw_32);
        this.id_throws.id_class(rkg_3.id_class(rdn_32), list.get((int)0).id_throws, list.get((int)0).id_case);
        this.id_class(this.id_catch.id_byte(), this.id_catch.id_protected(), this.id_catch.id_break(), rkw_32, rkw_32.id_class().iterator(), 0);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        if (this.id_private()) {
            RenderSystem.pushMatrix();
            RenderSystem.translatef(0.0f, 0.0f, 100.0f);
            this.id_private.A().id_class(id_class);
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            int n3 = (this.id_volatile - 147) / 2 - this.id_native;
            int n4 = (this.id_final - 166) / 2;
            this.id_break(ml_1, n3, n4, 1, 1, 147, 166);
            if (!this.id_new.aO_() && this.id_new.id_private().isEmpty()) {
                ms_3.id_break(ml_1, (cm_3)this.id_private.id_class[15], id_implements, n3 + 25, n4 + 14, -1);
            } else {
                this.id_new.id_class(ml_1, n, n2, f);
            }
            for (mX_2 mX_22 : this.id_package) {
                mX_22.id_class(ml_1, n, n2, f);
            }
            this.id_case.id_class(ml_1, n, n2, f);
            this.id_this.id_class(ml_1, n3, n4, n, n2, f);
            RenderSystem.popMatrix();
        }
    }

    public int id_class(boolean bl, int n, int n2) {
        int n3 = this.id_private() && !bl ? 177 + (n - n2 - 200) / 2 : (n - n2) / 2;
        return n3;
    }

    protected void id_class() {
        this.id_case.id_class(152, 41, 28, 18, id_class);
    }

    public void id_class(rJY rJY2) {
        if (rJY2 != null && rJY2.id_protected < this.id_catch.id_throws()) {
            this.id_throws.id_class();
            if (this.id_private()) {
                this.id_native();
            }
        }
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        this.id_return = false;
        return cC_2.super.id_break(n, n2, n3);
    }

    @Override
    public boolean id_break(double d, double d2) {
        return false;
    }

    @Override
    public boolean id_break(boolean bl) {
        return false;
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (this.id_private() && !((cb_3)this.id_private.id_class[57]).id_native()) {
            if (this.id_this.id_class(d, d2, n, (this.id_volatile - 147) / 2 - this.id_native, (this.id_final - 166) / 2, 147, 166)) {
                rkw_3<?> rkw_32 = this.id_this.id_class();
                mG_2 mG_22 = this.id_this.id_break();
                if (rkw_32 != null && mG_22 != null) {
                    if (!mG_22.id_class(rkw_32) && this.id_throws.id_byte() == rkw_32) {
                        return false;
                    }
                    this.id_throws.id_class();
                    ((Ax_1)this.id_private.id_class[55]).id_class(((rJr_1)((cb_3)this.id_private.id_class[57]).id_implements[4]).id_case, rkw_32, vm_3.id_synchronized());
                    if (!this.id_int()) {
                        this.id_byte(false);
                    }
                }
                return true;
            }
            if (this.id_new.id_break(d, d2, n)) {
                return true;
            }
            if (this.id_case.id_break(d, d2, n)) {
                boolean bl = this.id_final();
                this.id_case.id_byte(bl);
                this.id_extends();
                this.id_protected(false);
                return true;
            }
            for (mX_2 mX_22 : this.id_package) {
                if (!mX_22.id_break(d, d2, n)) continue;
                if (this.id_int != mX_22) {
                    this.id_int.id_byte(false);
                    this.id_int = mX_22;
                    this.id_int.id_byte(true);
                    this.id_protected(true);
                }
                return true;
            }
            return false;
        }
        return false;
    }

    protected rgP_2 id_throws() {
        return id_finally;
    }

    public void id_finally() {
        this.id_protected();
        if (this.id_private()) {
            this.id_protected(false);
        }
    }

    public void id_catch() {
        this.id_byte(!this.id_private());
    }

    protected void id_extends() {
        if (this.id_private.id_void() != null) {
            rke_3 rke_32 = this.id_catch.id_implements();
            boolean bl = this.id_super.id_break().id_class(rke_32);
            boolean bl2 = this.id_super.id_break().id_break(rke_32);
            this.id_private.id_void().id_class(new rZH(rke_32, bl, bl2));
        }
    }

    public void id_case() {
        this.id_new = null;
        this.id_int = null;
        ((Qj_1)this.id_private.id_class[23]).id_class(false);
    }

    public void id_implements() {
        if (this.id_private()) {
            if (this.id_synchronized != ((rhz_3)((cb_3)this.id_private.id_class[57]).id_implements[1]).id_implements()) {
                this.id_native();
                this.id_synchronized = ((rhz_3)((cb_3)this.id_private.id_class[57]).id_implements[1]).id_implements();
            }
            this.id_new.id_catch();
        }
    }

    private void id_package() {
        String string = this.id_new.id_private().toLowerCase(Locale.ROOT);
        this.id_class(string);
        if (!string.equals(this.id_continue)) {
            this.id_protected(false);
            this.id_continue = string;
        }
    }

    private void id_protected(Ml_1 ml_1, int n, int n2, int n3, int n4) {
        rdn_3 rdn_32 = null;
        for (int i = 0; i < this.id_throws.id_break(); ++i) {
            mP_2 mP_22 = this.id_throws.id_class(i);
            int n5 = mP_22.id_class() + n;
            int n6 = mP_22.id_break() + n2;
            if (n3 < n5 || n4 < n6 || n3 >= n5 + 16 || n4 >= n6 + 16) continue;
            rdn_32 = mP_22.id_byte();
        }
        if (rdn_32 != null && (vm_3)this.id_private.id_class[73] != null) {
            ((vm_3)this.id_private.id_class[73]).id_class(ml_1, (List<rgP_2>)((vm_3)this.id_private.id_class[73]).id_class(rdn_32), n3, n4);
        }
    }

    private void id_protected(boolean bl) {
        List<mG_2> list = this.id_super.id_class(this.id_int.id_class());
        list.forEach(mG_22 -> mG_22.id_class(this.id_else, this.id_catch.id_byte(), this.id_catch.id_protected(), this.id_super));
        ArrayList arrayList = Lists.newArrayList(list);
        arrayList.removeIf(mG_22 -> !mG_22.id_class());
        arrayList.removeIf(mG_22 -> !mG_22.id_byte());
        String string = this.id_new.id_private();
        if (!string.isEmpty()) {
            ObjectLinkedOpenHashSet objectLinkedOpenHashSet = new ObjectLinkedOpenHashSet(this.id_private.id_class(gJ_2.id_byte).id_class(string.toLowerCase(Locale.ROOT)));
            arrayList.removeIf(arg_0 -> ms_3.id_class((ObjectSet)objectLinkedOpenHashSet, arg_0));
        }
        if (this.id_super.id_class(this.id_catch)) {
            arrayList.removeIf(mG_22 -> !mG_22.id_break());
        }
        this.id_this.id_class(arrayList, bl);
    }

    private void id_protected() {
        int n = (this.id_volatile - 147) / 2 - this.id_native - 30;
        int n2 = (this.id_final - 166) / 2 + 3;
        int n3 = 27;
        int n4 = 0;
        for (mX_2 mX_22 : this.id_package) {
            gM_2 gM_22 = mX_22.id_class();
            if (gM_22 != gM_2.CRAFTING_SEARCH && gM_22 != gM_2.FURNACE_SEARCH) {
                if (!mX_22.id_class(this.id_super)) continue;
                mX_22.id_class(n, n2 + 27 * n4++);
                mX_22.id_class(this.id_private);
                continue;
            }
            mX_22.id_new = true;
            mX_22.id_class(n, n2 + 27 * n4++);
        }
    }

    public boolean id_private() {
        return this.id_super.id_class(this.id_catch.id_implements());
    }

    private boolean id_final() {
        rke_3 rke_32 = this.id_catch.id_implements();
        boolean bl = !this.id_super.id_break(rke_32);
        this.id_super.id_break(rke_32, bl);
        return bl;
    }

    private rgP_2 id_volatile() {
        return this.id_case.id_catch() ? this.id_throws() : id_extends;
    }

    private void id_native() {
        this.id_else.id_class();
        ((rhz_3)((cb_3)this.id_private.id_class[57]).id_implements[1]).id_class(this.id_else);
        this.id_catch.id_class(this.id_else);
        this.id_protected(false);
    }
}

