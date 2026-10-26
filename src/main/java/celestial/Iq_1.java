/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 */
package celestial;

import celestial.HU;
import celestial.Hd_1;
import celestial.IT;
import celestial.In_1;
import celestial.It_1;
import celestial.Iw_1;
import celestial.MH;
import celestial.Ml_1;
import celestial.OQ;
import celestial.Ok_1;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rjj_3;
import celestial.rqO_2;
import celestial.rrJq_1;
import celestial.rrME;
import celestial.rrXx_1;
import celestial.rrbD_2;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rrxq_3;
import celestial.yX_2;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Iq_1 {
    public float id_class = 64.0f;
    public float id_break = 32.0f;
    private int id_continue;
    private int id_super;
    public float id_byte;
    public float id_protected;
    public float id_throws;
    public float id_case;
    public float id_catch;
    public float id_private;
    public boolean id_implements;
    public boolean id_finally = true;
    public final ObjectList<IT> id_extends = new ObjectArrayList();
    public final ObjectList<Iq_1> id_native = new ObjectArrayList();
    public List id_volatile = new ArrayList();
    public boolean id_final = false;
    public float id_package = 1.0f;
    public float id_int = 1.0f;
    public float id_new = 1.0f;
    private rqO_2 id_this = null;
    private String id_else = null;
    private rrXx_1 id_synchronized;
    private final yX_2 id_return = rrbb_3.z();

    public String id_byte() {
        return this.id_else;
    }

    public Iq_1 id_byte(String string) {
        if (string == null) {
            return null;
        }
        Iq_1 iq_1 = this.id_break(string);
        if (iq_1 != null) {
            return iq_1;
        }
        if (this.id_native != null) {
            for (int i = 0; i < this.id_native.size(); ++i) {
                Iq_1 iq_12 = (Iq_1)this.id_native.get(i);
                Iq_1 iq_13 = iq_12.id_byte(string);
                if (iq_13 == null) continue;
                return iq_13;
            }
        }
        return null;
    }

    private Iq_1() {
    }

    public Iq_1(In_1 in_1) {
        in_1.a_(this);
        this.id_break(in_1.id_return, in_1.id_public);
    }

    public Iq_1(In_1 in_1, int n, int n2) {
        this(in_1.id_return, in_1.id_public, n, n2);
        in_1.a_(this);
    }

    public Iq_1(int n, int n2, int n3, int n4) {
        this.id_break(n, n2);
        this.id_class(n3, n4);
    }

    public String toString() {
        return "id: " + this.id_else + ", boxes: " + (this.id_extends != null ? Integer.valueOf(this.id_extends.size()) : null) + ", submodels: " + (this.id_native != null ? Integer.valueOf(this.id_native.size()) : null);
    }

    public void id_class(Iq_1 iq_1) {
        this.id_case = iq_1.id_case;
        this.id_catch = iq_1.id_catch;
        this.id_private = iq_1.id_private;
        this.id_byte = iq_1.id_byte;
        this.id_protected = iq_1.id_protected;
        this.id_throws = iq_1.id_throws;
    }

    public void id_class(rqO_2 rqO_22) {
        this.id_this = rqO_22;
    }

    public void id_class(float f, float f2, float f3, int n, int n2, int n3, float f4) {
        this.id_volatile.add(new rrJq_1(this, this.id_continue, this.id_super, f, f2, f3, n, n2, n3, f4));
    }

    public IT id_class(Random random) {
        return (IT)this.id_extends.get(random.nextInt(this.id_extends.size()));
    }

    private void id_class(MH mH, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        rjV_2 rjV_22 = mH.id_class();
        rjj_3 rjj_32 = mH.id_break();
        boolean bl = rrbb_3.rs() && rrdZ.p && rrbb_3.id_final();
        for (IT iT : this.id_extends) {
            rrbD_2 rrbD_22;
            rrxq_3[][] rrxq_3Array = null;
            if (bl && (rrbD_22 = rrME.id_class()) != null) {
                rrxq_3Array = iT.id_class(rrbD_22.id_class());
            }
            int n3 = iT.id_catch.length;
            for (int i = 0; i < n3; ++i) {
                Iw_1 iw_1 = iT.id_catch[i];
                if (iw_1 == null) continue;
                if (rrxq_3Array != null) {
                    ok_1.id_class(rrxq_3Array[i]);
                }
                rje_3 rje_32 = ok_1.id_class(iw_1.id_break);
                rje_32.id_class(rjj_32);
                float f5 = rje_32.id_class();
                float f6 = rje_32.id_break();
                float f7 = rje_32.id_byte();
                for (int j = 0; j < 4; ++j) {
                    It_1 it_1 = iw_1.id_class[j];
                    float f8 = it_1.id_class.id_class() / 16.0f;
                    float f9 = it_1.id_class.id_break() / 16.0f;
                    float f10 = it_1.id_class.id_byte() / 16.0f;
                    float f11 = rjV_22.id_break(f8, f9, f10, 1.0f);
                    float f12 = rjV_22.id_byte(f8, f9, f10, 1.0f);
                    float f13 = rjV_22.id_protected(f8, f9, f10, 1.0f);
                    ok_1.id_class(f11, f12, f13, f, f2, f3, f4, it_1.id_break, it_1.id_byte, n2, n, f5, f6, f7);
                }
            }
        }
    }

    public void id_class(Ml_1 ml_1) {
        ml_1.id_class((double)(this.id_byte / 16.0f), (double)(this.id_protected / 16.0f), (double)(this.id_throws / 16.0f));
        if (this.id_private != 0.0f) {
            ml_1.id_class(rje_3.id_case.id_break(this.id_private));
        }
        if (this.id_catch != 0.0f) {
            ml_1.id_class(rje_3.id_protected.id_break(this.id_catch));
        }
        if (this.id_case != 0.0f) {
            ml_1.id_class(rje_3.id_break.id_break(this.id_case));
        }
    }

    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f) {
        this.id_class(ml_1, ok_1, n, n2, 1.0f, 1.0f, 1.0f, f);
    }

    public void id_class(rrXx_1 rrXx_12) {
        this.id_synchronized = rrXx_12;
    }

    public Iq_1 id_class() {
        Iq_1 iq_1 = new Iq_1();
        iq_1.id_class(this);
        return iq_1;
    }

    public Iq_1 id_class(int n) {
        if (this.id_native == null) {
            return null;
        }
        return n >= 0 && n < this.id_native.size() ? (Iq_1)this.id_native.get(n) : null;
    }

    public void id_class(int[][] nArray, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.id_extends.add((Object)new IT(nArray, f, f2, f3, f4, f5, f6, f7, f7, f7, this.id_implements, this.id_class, this.id_break));
    }

    public void id_class(String string) {
        this.id_else = string;
    }

    public Iq_1 id_class(float f, float f2, float f3, float f4, float f5, float f6, boolean bl) {
        this.id_class(this.id_continue, this.id_super, f, f2, f3, f4, f5, f6, 0.0f, 0.0f, 0.0f, bl, false);
        return this;
    }

    public void id_class(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.id_class(this.id_continue, this.id_super, f, f2, f3, f4, f5, f6, f7, f7, f7, this.id_implements, false);
    }

    public void id_class(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.id_class(this.id_continue, this.id_super, f, f2, f3, f4, f5, f6, f7, f8, f9, this.id_implements, false);
    }

    public void id_class(float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean bl) {
        this.id_class(this.id_continue, this.id_super, f, f2, f3, f4, f5, f6, f7, f7, f7, bl, false);
    }

    public Iq_1 id_class(float f, float f2, float f3, float f4, float f5, float f6) {
        this.id_class(this.id_continue, this.id_super, f, f2, f3, f4, f5, f6, 0.0f, 0.0f, 0.0f, this.id_implements, false);
        return this;
    }

    public Iq_1 id_class(String string, float f, float f2, float f3, int n, int n2, int n3, float f4, int n4, int n5) {
        this.id_class(n4, n5);
        this.id_class(this.id_continue, this.id_super, f, f2, f3, n, n2, n3, f4, f4, f4, this.id_implements, false);
        return this;
    }

    public Iq_1 id_class(int n, int n2) {
        this.id_continue = n;
        this.id_super = n2;
        return this;
    }

    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        if (!(!this.id_finally || this.id_extends.isEmpty() && this.id_native.isEmpty() && this.id_volatile.isEmpty())) {
            int n3;
            HU hU = null;
            Hd_1 hd_1 = null;
            if (this.id_this != null) {
                if (this.id_return.id_case) {
                    return;
                }
                hd_1 = ok_1.id_protected();
                if (hd_1 != null) {
                    Ok_1 ok_12 = ok_1.id_throws();
                    hU = hd_1.id_byte();
                    ok_1 = hd_1.id_class(this.id_this, ok_1);
                    if (ok_12 != null) {
                        ok_1 = OQ.id_class(ok_12, ok_1);
                    }
                }
            }
            if (this.id_synchronized != null) {
                this.id_synchronized.id_class();
            }
            ml_1.id_class();
            this.id_class(ml_1);
            this.id_class(ml_1.id_byte(), ok_1, n, n2, f, f2, f3, f4);
            int n4 = this.id_native.size();
            for (n3 = 0; n3 < n4; ++n3) {
                Iq_1 iq_1 = (Iq_1)this.id_native.get(n3);
                iq_1.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4);
            }
            n3 = this.id_volatile.size();
            for (int i = 0; i < n3; ++i) {
                rrJq_1 rrJq_12 = (rrJq_1)this.id_volatile.get(i);
                rrJq_12.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4);
            }
            ml_1.id_break();
            if (hU != null) {
                hd_1.getBuffer(hU);
            }
        }
    }

    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2) {
        this.id_class(ml_1, ok_1, n, n2, 1.0f, 1.0f, 1.0f, 1.0f);
    }

    public void id_class(float f, float f2, float f3) {
        this.id_byte = f;
        this.id_protected = f2;
        this.id_throws = f3;
    }

    private void id_class(int n, int n2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean bl, boolean bl2) {
        this.id_extends.add((Object)new IT(n, n2, f, f2, f3, f4, f5, f6, f7, f8, f9, bl, this.id_class, this.id_break));
    }

    public Iq_1 id_break(String string) {
        if (string == null) {
            return null;
        }
        if (this.id_native != null) {
            for (int i = 0; i < this.id_native.size(); ++i) {
                Iq_1 iq_1 = (Iq_1)this.id_native.get(i);
                if (!string.equals(iq_1.id_byte())) continue;
                return iq_1;
            }
        }
        return null;
    }

    public void id_break(Iq_1 iq_1) {
        this.id_native.add((Object)iq_1);
    }

    public Iq_1 id_break(int n, int n2) {
        this.id_class = n;
        this.id_break = n2;
        return this;
    }

    public rqO_2 id_break() {
        return this.id_this;
    }
}

