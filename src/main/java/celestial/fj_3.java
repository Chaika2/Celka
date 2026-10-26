/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.Hd_1;
import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.MT;
import celestial.Ok_1;
import celestial.fF_2;
import celestial.fJ_2;
import celestial.fN_2;
import celestial.fV_2;
import celestial.fg_3;
import celestial.fo_3;
import celestial.fz_3;
import celestial.ja_3;
import celestial.ji_3;
import celestial.rAF;
import celestial.rAL;
import celestial.rqO_2;
import celestial.rrGl_1;
import celestial.rrMh_1;
import celestial.rrWd_1;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rrdn_1;
import celestial.rrko_1;
import celestial.rrzJ_2;
import celestial.yE_2;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class fj_3
implements AutoCloseable,
rrGl_1 {
    private final fJ_2 id_int;
    public final fV_2 id_new;
    public final ji_3 id_continue;
    protected final fN_2[] id_class;
    public final int[] id_super;
    public final int[] id_this;
    private final fg_3 id_else;
    private final int id_synchronized;
    private final int id_return;
    private final float id_public;
    private final float id_goto;
    private final float id_while;
    private final float id_try;
    public int id_instanceof;
    public int id_throw;
    private int id_interface = -1;
    public float id_break;
    public float id_byte;
    public int id_protected;
    public int id_throws;
    public int id_case = -1;
    public fj_3 id_catch = null;
    public boolean id_private = false;
    public static final String id_implements = ".sprite_single";
    public int id_finally = 0;
    public fj_3 id_extends = null;
    public fj_3 id_native = null;
    public rrdn_1 id_volatile = null;
    public fj_3 id_final = null;
    public boolean id_package = false;
    private int id_char = -1;
    private boolean id_abstract = false;
    private boolean id_long = false;
    private boolean id_float;
    private boolean id_void;
    private boolean id_static;
    private rAL id_import;

    public float id_byte(float f) {
        float f2 = (float)this.id_protected / (float)this.id_protected();
        return (f -= this.id_break) * f2;
    }

    public boolean id_int() {
        return this.id_continue.id_class() > 1;
    }

    public fj_3(rqO_2 rqO_22) {
        this.id_int = null;
        this.id_new = new fV_2(rqO_22, 0, 0, null);
        this.id_continue = null;
        this.id_class = null;
        this.id_super = new int[0];
        this.id_this = new int[0];
        this.id_else = null;
        this.id_synchronized = 0;
        this.id_return = 0;
        this.id_public = 0.0f;
        this.id_goto = 0.0f;
        this.id_while = 0.0f;
        this.id_try = 0.0f;
    }

    protected fj_3(fJ_2 fJ_22, fV_2 fV_22, int n, int n2, int n3, int n4, int n5, fN_2 fN_22, rrdn_1 rrdn_12) {
        Object object;
        int n6;
        fN_2 fN_23;
        this.id_int = fJ_22;
        ji_3 ji_32 = fV_22.id_protected;
        int n7 = fV_22.id_break;
        int n8 = fV_22.id_byte;
        this.id_synchronized = n4;
        this.id_return = n5;
        this.id_public = (float)n4 / (float)n2;
        this.id_goto = (float)(n4 + n7) / (float)n2;
        this.id_while = (float)n5 / (float)n3;
        this.id_try = (float)(n5 + n8) / (float)n3;
        if (fV_22.id_throws > 1.0 && (fN_23 = rrzJ_2.id_class(fN_22, n6 = (int)Math.round((double)fN_22.id_class() * fV_22.id_throws))) != fN_22) {
            fN_22.close();
            fN_22 = fN_23;
        }
        this.id_volatile = rrdn_12;
        rrko_1 rrko_12 = this.id_int.id_class(this.id_volatile);
        if (this.id_volatile == null && !fV_22.id_class().id_break().endsWith("_leaves")) {
            this.id_class(fN_22);
        }
        fN_23 = fN_22;
        int n9 = fN_22.id_class() / ji_32.id_break(n7);
        int n10 = fN_22.id_break() / ji_32.id_class(n8);
        if (ji_32.id_class() > 0) {
            int n11 = (Integer)ji_32.id_protected().stream().max(Integer::compareTo).get() + 1;
            this.id_super = new int[n11];
            this.id_this = new int[n11];
            Arrays.fill(this.id_super, -1);
            Arrays.fill(this.id_this, -1);
            object = ji_32.id_protected().iterator();
            while (object.hasNext()) {
                int n12;
                var19_24 = object.next();
                if (var19_24 >= n9 * n10) {
                    throw new RuntimeException("invalid frameindex " + var19_24);
                }
                int n13 = var19_24 / n9;
                this.id_super[var19_24] = n12 = var19_24 % n9;
                this.id_this[var19_24] = n13;
            }
        } else {
            ArrayList arrayList = Lists.newArrayList();
            int n14 = n9 * n10;
            this.id_super = new int[n14];
            this.id_this = new int[n14];
            for (var19_24 = 0; var19_24 < n10; ++var19_24) {
                int n15 = 0;
                while (n15 < n9) {
                    int n16 = var19_24 * n9 + n15;
                    this.id_super[n16] = n15++;
                    this.id_this[n16] = var19_24;
                    arrayList.add(new ja_3(n16, -1));
                }
            }
            ji_32 = new ji_3(arrayList, n7, n8, ji_32.id_break(), ji_32.id_byte());
        }
        this.id_new = new fV_2(fV_22.id_class, n7, n8, ji_32);
        this.id_continue = ji_32;
        try {
            try {
                this.id_class = fz_3.id_class(fN_22, n, rrko_12);
            }
            catch (Throwable throwable) {
                object = KY.id_class(throwable, "Generating mipmaps for frame");
                Ko_1 ko_1 = ((KY)object).id_class("Frame being iterated");
                ko_1.id_class("First frame", () -> {
                    StringBuilder stringBuilder = new StringBuilder();
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(fN_23.id_class()).append("x").append(fN_23.id_break());
                    return stringBuilder.toString();
                });
                throw new KU((KY)object);
            }
        }
        catch (Throwable throwable) {
            object = KY.id_class(throwable, "Applying mipmap");
            Ko_1 ko_1 = ((KY)object).id_class("Sprite being mipmapped");
            ko_1.id_class("Sprite name", () -> this.id_finally().toString());
            ko_1.id_class("Sprite size", () -> this.id_protected() + " x " + this.id_throws());
            ko_1.id_class("Sprite frames", () -> this.id_native() + " frames");
            ko_1.id_class("Mipmap levels", n);
            throw new KU((KY)object);
        }
        this.id_else = ji_32.id_byte() ? new fg_3(this, fV_22, n) : null;
        this.id_finally = n;
        this.id_break = Math.min(this.id_public, this.id_goto);
        this.id_byte = Math.min(this.id_while, this.id_try);
        this.id_protected = n2;
        this.id_throws = n3;
    }

    private fj_3(fj_3 fj_32) {
        this.id_int = fj_32.id_int;
        fV_2 fV_22 = fj_32.id_new;
        rqO_2 rqO_22 = fV_22.id_class();
        rqO_2 rqO_23 = new rqO_2(rqO_22.id_byte(), rqO_22.id_break() + id_implements);
        int n = fV_22.id_break();
        int n2 = fV_22.id_byte();
        ji_3 ji_32 = fV_22.id_protected();
        this.id_new = new fV_2(rqO_23, n, n2, ji_32);
        this.id_continue = fj_32.id_continue;
        this.id_long = true;
        this.id_class = fj_32.id_class;
        this.id_super = fj_32.id_super;
        this.id_this = fj_32.id_this;
        this.id_else = fj_32.id_else != null ? new fg_3(this, fj_32.id_else.id_break) : null;
        this.id_synchronized = 0;
        this.id_return = 0;
        this.id_public = 0.0f;
        this.id_goto = 1.0f;
        this.id_while = 0.0f;
        this.id_try = 1.0f;
        this.id_instanceof = fj_32.id_instanceof;
        this.id_throw = fj_32.id_throw;
        this.id_interface = fj_32.id_interface;
        this.id_break = fj_32.id_break;
        this.id_byte = fj_32.id_byte;
        this.id_protected = fj_32.id_protected;
        this.id_throws = fj_32.id_throws;
        this.id_private = true;
        this.id_finally = fj_32.id_finally;
        this.id_char = fj_32.id_char;
        this.id_abstract = fj_32.id_abstract;
    }

    protected fj_3(fJ_2 fJ_22, fV_2 fV_22, int n, int n2, int n3, int n4, int n5, fN_2 fN_22) {
        this(fJ_22, fV_22, n, n2, n3, n4, n5, fN_22, null);
    }

    public String toString() {
        int n = this.id_super.length;
        return "TextureAtlasSprite{name='" + this.id_new.id_class + "', frameCount=" + n + ", x=" + this.id_synchronized + ", y=" + this.id_return + ", height=" + this.id_new.id_byte + ", width=" + this.id_new.id_break + ", u0=" + this.id_public + ", u1=" + this.id_goto + ", v0=" + this.id_while + ", v1=" + this.id_try + "}";
    }

    public void id_this() {
        if (this.id_case < 0) {
            this.id_case = fo_3.id_class();
            fo_3.id_class(this.id_case, this.id_finally, this.id_protected(), this.id_throws());
            boolean bl = this.id_int.id_break(this.id_volatile);
            if (bl) {
                rrzJ_2.id_throws();
            } else {
                MT.id_class(3553, 34046, 1.0f);
                int n = this.id_finally > 0 ? 9984 : 9728;
                MT.id_break(3553, 10241, n);
                MT.id_break(3553, 10240, 9728);
            }
        }
        rrzJ_2.id_protected(this.id_case);
    }

    private float id_class() {
        float f = (float)this.id_new.id_break / (this.id_goto - this.id_public);
        float f2 = (float)this.id_new.id_byte / (this.id_try - this.id_while);
        return Math.max(f2, f);
    }

    public double id_class(float f) {
        float f2 = this.id_goto - this.id_public;
        return (f - this.id_public) / f2 * 16.0f;
    }

    public boolean id_class(int n, int n2, int n3) {
        return (this.id_class[0].id_class(n2 + this.id_super[n] * this.id_new.id_break, n3 + this.id_this[n] * this.id_new.id_byte) >> 24 & 0xFF) == 0;
    }

    public Ok_1 id_class(Ok_1 ok_1) {
        Hd_1 hd_1;
        if (this.id_finally() == rrzJ_2.id_goto && (hd_1 = ok_1.id_protected()) != null) {
            return hd_1.id_protected();
        }
        return new yE_2(ok_1, this);
    }

    private void id_class(int[] nArray) {
        if (nArray != null) {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            long l = 0L;
            long l2 = 0L;
            long l3 = 0L;
            long l4 = 0L;
            for (n6 = 0; n6 < nArray.length; ++n6) {
                n5 = nArray[n6];
                n4 = n5 >> 24 & 0xFF;
                if (n4 < 16) continue;
                n3 = n5 >> 16 & 0xFF;
                n2 = n5 >> 8 & 0xFF;
                n = n5 & 0xFF;
                l += (long)n3;
                l2 += (long)n2;
                l3 += (long)n;
                ++l4;
            }
            if (l4 > 0L) {
                n6 = (int)(l / l4);
                n5 = (int)(l2 / l4);
                n4 = (int)(l3 / l4);
                n3 = n6 << 16 | n5 << 8 | n4;
                for (n2 = 0; n2 < nArray.length; ++n2) {
                    n = nArray[n2];
                    int n7 = n >> 24 & 0xFF;
                    if (n7 > 16) continue;
                    nArray[n2] = n3;
                }
            }
        }
    }

    private void id_class(fN_2 fN_22) {
        int[] nArray = new int[fN_22.id_class() * fN_22.id_break()];
        fN_22.id_private().get(nArray);
        this.id_class(nArray);
        fN_22.id_private().put(nArray);
    }

    public void id_class(int n, int n2, fN_2[] fN_2Array) {
        boolean bl = false;
        boolean bl2 = this.id_private;
        for (int i = 0; i < fN_2Array.length && this.id_protected() >> i > 0 && this.id_throws() >> i > 0; ++i) {
            fN_2Array[i].id_class(i, this.id_synchronized >> i, this.id_return >> i, n >> i, n2 >> i, this.id_new.id_break >> i, this.id_new.id_byte >> i, bl, bl2, fN_2Array.length > 1, false);
        }
    }

    public void id_class(rAL rAL2) {
        this.id_import = rAL2;
        this.id_class(this.id_int.id_extends());
        this.id_class(this.id_int.id_finally());
    }

    public float id_class(double d) {
        float f = this.id_goto - this.id_public;
        return this.id_public + f * (float)d / 16.0f;
    }

    private void id_class(boolean bl) {
        this.id_float = bl;
        this.id_static = false;
        this.id_void = false;
        if (this.id_catch != null) {
            this.id_else();
            this.id_catch = null;
        }
        if (this.id_extends != null) {
            if (this.id_extends.id_catch != null) {
                this.id_extends.id_else();
            }
            this.id_extends.close();
            this.id_extends = null;
        }
        if (this.id_native != null) {
            if (this.id_native.id_catch != null) {
                this.id_native.id_else();
            }
            this.id_native.close();
            this.id_native = null;
        }
        this.id_static = rrbb_3.w();
        this.id_void = rrbb_3.rs();
        if (this.id_float && this.id_static && !this.id_private) {
            this.id_catch = this.id_while();
        }
        if (this.id_void && !this.id_private) {
            if (this.id_extends == null && rrdZ.SV) {
                this.id_extends = this.id_class(rrdn_1.NORMAL, -8421377, this.id_continue);
            }
            if (this.id_native == null && rrdZ.Sg) {
                this.id_native = this.id_class(rrdn_1.SPECULAR, 0, this.id_continue);
            }
        }
    }

    private static boolean id_class(ji_3 ji_32, ji_3 ji_33) {
        if (ji_32 == ji_33) {
            return true;
        }
        if (ji_32 != null && ji_33 != null) {
            if (ji_32.id_break() != ji_33.id_break()) {
                return false;
            }
            if (ji_32.id_byte() != ji_33.id_byte()) {
                return false;
            }
            if (ji_32.id_class() != ji_33.id_class()) {
                return false;
            }
            for (int i = 0; i < ji_32.id_class(); ++i) {
                if (ji_32.id_byte(i) == ji_33.id_byte(i)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public void id_class(rrWd_1 rrWd_12) {
        if (this.id_interface < 0) {
            fj_3 fj_32;
            if (this.id_int != null && (fj_32 = this.id_int.id_byte(this.id_finally())) != null) {
                this.id_interface = fj_32.id_new();
            }
            if (this.id_interface < 0) {
                this.id_interface = rrWd_12.id_class();
            }
        }
    }

    public void id_class(int n) {
        this.id_char = n;
        if (this.id_catch != null) {
            this.id_catch.id_class(n);
        }
        if (this.id_extends != null) {
            this.id_extends.id_class(n);
        }
        if (this.id_native != null) {
            this.id_native.id_class(n);
        }
    }

    public fj_3 id_class(rrdn_1 rrdn_12, int n, ji_3 ji_32) {
        Object object;
        AutoCloseable autoCloseable;
        String string = rrdn_12.id_class();
        rqO_2 rqO_22 = new rqO_2(this.id_finally().id_byte(), this.id_finally().id_break() + string);
        rqO_2 rqO_23 = this.id_int.id_class(rqO_22);
        fj_3 fj_32 = null;
        if (this.id_import.id_break(rqO_23)) {
            try {
                autoCloseable = this.id_import.id_class(rqO_23);
                try {
                    fN_2 fN_22;
                    rAF rAF2 = this.id_import.id_class(rqO_23);
                    object = new fF_2(rqO_23.toString(), rAF2.id_break());
                    ji_3 ji_33 = autoCloseable.id_class(ji_3.id_class);
                    if (ji_33 == null) {
                        ji_33 = ji_3.id_break;
                    }
                    Pair<Integer, Integer> pair = ji_33.id_class(((fF_2)object).id_class, ((fF_2)object).id_break);
                    fV_2 fV_22 = new fV_2(rqO_22, (Integer)pair.getFirst(), (Integer)pair.getSecond(), ji_33);
                    fN_2 fN_23 = fN_2.id_class(autoCloseable.id_break());
                    if (fN_23.id_class() != this.id_protected() && (fN_22 = rrzJ_2.id_class(fN_23, this.id_protected())) != fN_23) {
                        double d = 1.0 * (double)this.id_protected() / (double)fN_23.id_class();
                        fN_23.close();
                        fN_23 = fN_22;
                        fV_22 = new fV_2(rqO_22, (int)((double)((Integer)pair.getFirst()).intValue() * d), (int)((double)((Integer)pair.getSecond()).intValue() * d), ji_33);
                    }
                    fj_32 = new fj_3(this.id_int, fV_22, this.id_finally, this.id_protected, this.id_throws, this.id_synchronized, this.id_return, fN_23, rrdn_12);
                }
                finally {
                    if (autoCloseable != null) {
                        autoCloseable.close();
                    }
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if (fj_32 == null) {
            autoCloseable = new fN_2(this.id_protected(), this.id_throws(), false);
            int n2 = rrzJ_2.id_case(n);
            ((fN_2)autoCloseable).id_class(0, 0, ((fN_2)autoCloseable).id_class(), ((fN_2)autoCloseable).id_break(), n2);
            object = new fV_2(rqO_22, this.id_protected(), this.id_throws(), ji_3.id_break);
            fj_32 = new fj_3(this.id_int, (fV_2)object, this.id_finally, this.id_protected, this.id_throws, this.id_synchronized, this.id_return, (fN_2)autoCloseable, rrdn_12);
        }
        if (this.id_float && this.id_static && !this.id_private) {
            fj_32.id_catch = fj_32.id_while();
        }
        fj_32.id_long = fj_3.id_class(fj_32.id_continue, ji_32);
        return fj_32;
    }

    @Override
    public void close() {
        for (fN_2 fN_22 : this.id_class) {
            if (fN_22 == null) continue;
            fN_22.close();
        }
        if (this.id_else != null) {
            this.id_else.close();
        }
        if (this.id_catch != null) {
            // empty if block
        }
        if (this.id_extends != null) {
            this.id_extends.close();
        }
        if (this.id_native != null) {
            this.id_native.close();
        }
    }

    public double id_break(float f) {
        float f2 = this.id_try - this.id_while;
        return (f - this.id_while) / f2 * 16.0f;
    }

    public int id_break(int n, int n2, int n3) {
        return this.id_class[0].id_class(n2 + this.id_super[n] * this.id_protected(), n3 + this.id_this[n] * this.id_throws());
    }

    public float id_break(double d) {
        float f = this.id_try - this.id_while;
        return this.id_while + f * (float)d / 16.0f;
    }

    private void id_break(int n) {
        int n2 = this.id_super[n] * this.id_new.id_break;
        int n3 = this.id_this[n] * this.id_new.id_byte;
        this.id_class(n2, n3, this.id_class);
    }

    public float id_throws(float f) {
        float f2 = this.id_goto - this.id_public;
        return (f - this.id_public) / f2 * 16.0f;
    }

    public int id_throws() {
        return this.id_new.id_byte;
    }

    public rqO_2 id_finally() {
        return this.id_new.id_class;
    }

    public float id_catch() {
        return this.id_goto;
    }

    public fJ_2 id_extends() {
        return this.id_int;
    }

    public int id_goto() {
        return this.id_return;
    }

    public float id_case() {
        return this.id_public;
    }

    public float id_case(float f) {
        float f2 = this.id_try - this.id_while;
        return (f - this.id_while) / f2 * 16.0f;
    }

    public int id_continue() {
        return this.id_char;
    }

    public void id_else() {
        if (this.id_case >= 0) {
            fo_3.id_class(this.id_case);
            this.id_case = -1;
        }
    }

    public float id_implements() {
        return this.id_try;
    }

    public int id_new() {
        return this.id_interface;
    }

    public void id_package() {
        if (this.id_continue != null) {
            boolean bl = this.id_abstract = rrMh_1.id_class() ? rrMh_1.id_break(this) : true;
            if (this.id_continue.id_class() <= 1) {
                this.id_abstract = false;
            }
            if (this.id_catch != null && this.id_catch.id_long) {
                this.id_catch.id_throw = this.id_throw;
                this.id_catch.id_instanceof = this.id_instanceof;
            }
            if (this.id_extends != null && this.id_extends.id_long) {
                this.id_extends.id_throw = this.id_throw;
                this.id_extends.id_instanceof = this.id_instanceof;
            }
            if (this.id_native != null && this.id_native.id_long) {
                this.id_native.id_throw = this.id_throw;
                this.id_native.id_instanceof = this.id_instanceof;
            }
            ++this.id_throw;
            if (this.id_throw >= this.id_continue.id_byte(this.id_instanceof)) {
                int n = this.id_continue.id_protected(this.id_instanceof);
                int n2 = this.id_continue.id_class() == 0 ? this.id_native() : this.id_continue.id_class();
                this.id_instanceof = (this.id_instanceof + 1) % n2;
                this.id_throw = 0;
                int n3 = this.id_continue.id_protected(this.id_instanceof);
                if (!this.id_abstract) {
                    return;
                }
                if (n != n3 && n3 >= 0 && n3 < this.id_native()) {
                    this.id_break(n3);
                }
            } else if (this.id_else != null) {
                if (!this.id_abstract) {
                    return;
                }
                if (!RenderSystem.isOnRenderThread()) {
                    RenderSystem.recordRenderCall(() -> this.id_else.id_class());
                } else {
                    this.id_else.id_class();
                }
            }
        }
    }

    public ji_3 id_return() {
        return this.id_continue;
    }

    public boolean id_super() {
        return this.id_abstract;
    }

    public boolean id_try() {
        return this.id_float;
    }

    public fj_3 id_while() {
        fj_3 fj_32 = new fj_3(this);
        fj_32.id_private = true;
        return fj_32;
    }

    public int id_public() {
        return this.id_synchronized;
    }

    public int id_protected() {
        return this.id_new.id_break;
    }

    public float id_protected(float f) {
        float f2 = (float)this.id_throws / (float)this.id_throws();
        return (f -= this.id_byte) * f2;
    }

    public float id_private() {
        return this.id_while;
    }

    public float id_final() {
        return 4.0f / this.id_class();
    }

    public void id_volatile() {
        this.id_break(0);
    }

    public fN_2[] id_synchronized() {
        return this.id_class;
    }

    public int id_native() {
        return this.id_super.length;
    }
}

