/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.QY;
import celestial.cT_2;
import celestial.cV_2;
import celestial.rAN;
import celestial.rfU_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rrbb_3;
import celestial.rrks_1;
import celestial.rrxr_3;
import celestial.rrxz_3;
import celestial.rrzE_2;
import celestial.ryj_3;
import celestial.vm_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;
import java.util.function.Consumer;

public class cj_3
extends cT_2 {
    public static final rqO_2 id_class = new rqO_2("textures/gui/title/mojangstudios.png");
    private static final int id_throws = ryj_3.id_class(255, 239, 50, 61);
    private static final int id_case = id_throws & 0xFFFFFF;
    private final QY id_catch;
    private final rAN id_private;
    private final Consumer<Optional<Throwable>> id_implements;
    private final boolean id_finally;
    private float id_extends;
    private long id_native = -1L;
    private long id_volatile = -1L;
    private int id_final = id_case;
    private int id_package = id_case;
    private int id_int = 0xFFFFFF;
    private int id_new = 0xFFFFFF;
    private rrxz_3 id_continue = null;
    private boolean id_super = false;

    public cj_3(QY qY, rAN rAN2, Consumer<Optional<Throwable>> consumer, boolean bl) {
        this.id_catch = qY;
        this.id_private = rAN2;
        this.id_implements = consumer;
        this.id_finally = false;
    }

    private static int id_class(String string, int n) {
        if (string == null) {
            return n;
        }
        string = string.trim();
        try {
            return Integer.parseInt(string, 16) & 0xFFFFFF;
        }
        catch (NumberFormatException numberFormatException) {
            return n;
        }
    }

    private static int id_class(Properties properties, String string, int n) {
        String string2 = properties.getProperty(string);
        if (string2 == null) {
            return n;
        }
        int n2 = cj_3.id_class(string2 = string2.trim(), n);
        if (n2 < 0) {
            rrbb_3.id_protected("Invalid color: " + string + " = " + string2);
            return n2;
        }
        rrbb_3.id_byte(string + " = " + string2);
        return n2;
    }

    public static void id_class(QY qY) {
        qY.A().id_class(id_class, new cV_2());
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        float f2;
        int n3;
        float f3;
        int n4 = this.id_catch.id_else().id_super();
        int n5 = this.id_catch.id_else().id_this();
        long l = rqR_2.id_break();
        if (this.id_finally && (this.id_private.id_byte() || (vm_3)this.id_catch.id_class[73] != null) && this.id_volatile == -1L) {
            this.id_volatile = l;
        }
        float f4 = this.id_native > -1L ? (float)(l - this.id_native) / 1000.0f : -1.0f;
        float f5 = f3 = this.id_volatile > -1L ? (float)(l - this.id_volatile) / 500.0f : -1.0f;
        if (f4 >= 1.0f) {
            this.id_super = true;
            if ((vm_3)this.id_catch.id_class[73] != null) {
                ((vm_3)this.id_catch.id_class[73]).id_class(ml_1, 0, 0, f);
            }
            n3 = rfU_2.id_case((1.0f - rfU_2.id_class(f4 - 1.0f, 0.0f, 1.0f)) * 255.0f);
            cj_3.id_class(ml_1, 0, 0, n4, n5, this.id_final | n3 << 24);
            f2 = 1.0f - rfU_2.id_class(f4 - 1.0f, 0.0f, 1.0f);
        } else if (this.id_finally) {
            if ((vm_3)this.id_catch.id_class[73] != null && f3 < 1.0f) {
                ((vm_3)this.id_catch.id_class[73]).id_class(ml_1, n, n2, f);
            }
            n3 = rfU_2.id_throws(rfU_2.id_class((double)f3, 0.15, 1.0) * 255.0);
            cj_3.id_class(ml_1, 0, 0, n4, n5, this.id_final | n3 << 24);
            f2 = rfU_2.id_class(f3, 0.0f, 1.0f);
        } else {
            cj_3.id_class(ml_1, 0, 0, n4, n5, this.id_final | 0xFF000000);
            f2 = 1.0f;
        }
        n3 = (int)((double)this.id_catch.id_else().id_super() * 0.5);
        int n6 = (int)((double)this.id_catch.id_else().id_this() * 0.5);
        double d = Math.min((double)this.id_catch.id_else().id_super() * 0.75, (double)this.id_catch.id_else().id_this()) * 0.25;
        int n7 = (int)(d * 0.5);
        double d2 = d * 4.0;
        int n8 = (int)(d2 * 0.5);
        this.id_catch.A().id_class(id_class);
        RenderSystem.enableBlend();
        RenderSystem.blendEquation(32774);
        RenderSystem.blendFunc(770, 1);
        RenderSystem.alphaFunc(516, 0.0f);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, f2);
        boolean bl = true;
        if (this.id_continue != null) {
            this.id_continue.id_implements();
            if (!this.id_continue.id_byte() && this.id_super) {
                bl = false;
            }
        }
        if (bl) {
            cj_3.id_class(ml_1, n3 - n8, n6 - n7, n8, (int)d, -0.0625f, 0.0f, 120, 60, 120, 120);
            cj_3.id_class(ml_1, n3, n6 - n7, n8, (int)d, 0.0625f, 60.0f, 120, 60, 120, 120);
        }
        RenderSystem.defaultBlendFunc();
        RenderSystem.defaultAlphaFunc();
        RenderSystem.disableBlend();
        int n9 = (int)((double)this.id_catch.id_else().id_this() * 0.8325);
        float f6 = this.id_private.id_break();
        this.id_extends = rfU_2.id_class(this.id_extends * 0.95f + f6 * 0.050000012f, 0.0f, 1.0f);
        rrxr_3.id_extends.id_class(new Object[0]);
        if (f4 < 1.0f) {
            this.id_class(ml_1, n4 / 2 - n8, n9 - 5, n4 / 2 + n8, n9 + 5, 1.0f - rfU_2.id_class(f4, 0.0f, 1.0f));
        }
        if (f4 >= 2.0f) {
            this.id_catch.id_class((cT_2)null);
        }
        if (this.id_native == -1L && this.id_private.id_protected() && (!this.id_finally || f3 >= 2.0f)) {
            this.id_native = rqR_2.id_break();
            try {
                this.id_private.id_throws();
                this.id_implements.accept(Optional.empty());
            }
            catch (Throwable throwable) {
                this.id_implements.accept(Optional.of(throwable));
            }
            if ((vm_3)this.id_catch.id_class[73] != null) {
                ((vm_3)this.id_catch.id_class[73]).id_break(this.id_catch, this.id_catch.id_else().id_super(), this.id_catch.id_else().id_this());
            }
        }
    }

    private void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, float f) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = rfU_2.id_case((float)(n3 - n - 2) * this.id_extends);
        int n10 = Math.round(f * 255.0f);
        if (this.id_package != this.id_final) {
            n8 = this.id_package >> 16 & 0xFF;
            n7 = this.id_package >> 8 & 0xFF;
            n6 = this.id_package & 0xFF;
            n5 = ryj_3.id_class(n10, n8, n7, n6);
            cj_3.id_class(ml_1, n, n2, n3, n4, n5);
        }
        n8 = this.id_int >> 16 & 0xFF;
        n7 = this.id_int >> 8 & 0xFF;
        n6 = this.id_int & 0xFF;
        n5 = ryj_3.id_class(n10, n8, n7, n6);
        cj_3.id_class(ml_1, n + 1, n2, n3 - 1, n2 + 1, n5);
        cj_3.id_class(ml_1, n + 1, n4, n3 - 1, n4 - 1, n5);
        cj_3.id_class(ml_1, n, n2, n + 1, n4, n5);
        cj_3.id_class(ml_1, n3, n2, n3 - 1, n4, n5);
        int n11 = this.id_new >> 16 & 0xFF;
        int n12 = this.id_new >> 8 & 0xFF;
        int n13 = this.id_new & 0xFF;
        n5 = ryj_3.id_class(n10, n11, n12, n13);
        cj_3.id_class(ml_1, n + 2, n2 + 2, n + n9, n4 - 2, n5);
    }

    @Override
    public boolean id_class() {
        return true;
    }

    public boolean id_throws() {
        return this.id_super;
    }

    public void id_protected() {
        this.id_final = id_case;
        this.id_package = id_case;
        this.id_int = 0xFFFFFF;
        this.id_new = 0xFFFFFF;
        if (rrbb_3.K()) {
            try {
                String string = "optifine/color.properties";
                rqO_2 rqO_22 = new rqO_2(string);
                if (!rrbb_3.id_byte(rqO_22)) {
                    return;
                }
                InputStream inputStream = rrbb_3.id_class(rqO_22);
                rrbb_3.id_byte("Loading " + string);
                rrzE_2 rrzE_22 = new rrzE_2();
                rrzE_22.load(inputStream);
                inputStream.close();
                this.id_final = cj_3.id_class(rrzE_22, "screen.loading", this.id_final);
                this.id_int = cj_3.id_class(rrzE_22, "screen.loading.outline", this.id_int);
                this.id_package = cj_3.id_class(rrzE_22, "screen.loading.bar", this.id_package);
                this.id_new = cj_3.id_class(rrzE_22, "screen.loading.progress", this.id_new);
                this.id_continue = rrks_1.id_break(rrzE_22.getProperty("screen.loading.blend"));
            }
            catch (Exception exception) {
                rrbb_3.id_protected(exception.getClass().getName() + ": " + exception.getMessage());
            }
        }
    }
}

