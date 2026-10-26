/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HC;
import celestial.HE;
import celestial.HH;
import celestial.HK;
import celestial.HR;
import celestial.HT;
import celestial.HV;
import celestial.HY;
import celestial.Hf_1;
import celestial.Hg_1;
import celestial.Ho_1;
import celestial.Hp_1;
import celestial.Hq_1;
import celestial.Ht_1;
import celestial.Hw_1;
import celestial.Hy_1;
import celestial.MK;
import celestial.OP;
import celestial.QY;
import celestial.fJ_2;
import celestial.rqR_2;
import celestial.yX_2;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.OptionalDouble;

public abstract class Hn_1 {
    protected final String id_class;
    private final Runnable S;
    private final Runnable s;
    public static float id_break = 1.0f;
    protected static final Ho_1 id_byte = new Ho_1("no_transparency", () -> RenderSystem.disableBlend(), () -> {});
    protected static final Ho_1 id_protected = new Ho_1("additive_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(OP.ONE, MK.ONE);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });
    protected static final Ho_1 id_throws = new Ho_1("lightning_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });
    protected static final Ho_1 id_case = new Ho_1("glint_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate(OP.SRC_COLOR, MK.ONE, OP.ZERO, MK.ONE);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });
    protected static final Ho_1 id_catch = new Ho_1("crumbling_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate(OP.DST_COLOR, MK.SRC_COLOR, OP.ONE, MK.ZERO);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });
    protected static final Ho_1 id_private = new Ho_1("translucent_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ONE, MK.ONE_MINUS_SRC_ALPHA);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });
    protected static final HC id_implements = new HC(0.0f);
    protected static final HC id_finally = new HC(0.003921569f);
    protected static final HC id_extends = new HC(0.5f);
    protected static final HC id_native = new HC(0.1f);
    protected static final HV id_volatile = new HV(false);
    protected static final HV id_final = new HV(true);
    protected static final HR id_package = new HR(fJ_2.id_class, false, true);
    protected static final HR id_int = new HR(fJ_2.id_class, false, false);
    protected static final HR id_new = new HR();
    protected static final HY id_continue = new HY("default_texturing", () -> {}, () -> {});
    protected static final HY id_super = new HY("outline_texturing", () -> RenderSystem.setupOutline(), () -> RenderSystem.teardownOutline());
    protected static final HY id_this = new HY("glint_texturing", () -> {
        Hn_1.id_class(8.0f);
        RenderSystem.color4f(id_break, id_break, id_break, 1.0f);
    }, () -> {
        RenderSystem.matrixMode(5890);
        RenderSystem.popMatrix();
        RenderSystem.matrixMode(5888);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
    });
    protected static final HY id_else = new HY("entity_glint_texturing", () -> {
        Hn_1.id_class(0.16f);
        RenderSystem.color4f(id_break, id_break, id_break, 1.0f);
    }, () -> {
        RenderSystem.matrixMode(5890);
        RenderSystem.popMatrix();
        RenderSystem.matrixMode(5888);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
    });
    protected static final Ht_1 id_synchronized = new Ht_1(true);
    protected static final Ht_1 id_return = new Ht_1(false);
    protected static final Hf_1 id_public = new Hf_1(true);
    protected static final Hf_1 id_goto = new Hf_1(false);
    protected static final Hp_1 id_while = new Hp_1(true);
    protected static final Hp_1 id_try = new Hp_1(false);
    protected static final HH id_instanceof = new HH(true);
    protected static final HH id_throw = new HH(false);
    protected static final Hy_1 id_interface = new Hy_1("always", 519);
    protected static final Hy_1 id_char = new Hy_1("==", 514);
    protected static final Hy_1 id_abstract = new Hy_1("<=", 515);
    protected static final HK id_long = new HK(true, true);
    protected static final HK id_float = new HK(true, false);
    protected static final HK id_void = new HK(false, true);
    protected static final HT id_static = new HT("no_layering", () -> {}, () -> {});
    protected static final HT id_import = new HT("polygon_offset_layering", () -> {
        RenderSystem.polygonOffset(-1.0f, -10.0f);
        RenderSystem.enablePolygonOffset();
    }, () -> {
        RenderSystem.polygonOffset(0.0f, 0.0f);
        RenderSystem.disablePolygonOffset();
    });
    protected static final HT id_short = new HT("view_offset_z_layering", () -> {
        RenderSystem.pushMatrix();
        RenderSystem.scalef(0.99975586f, 0.99975586f, 0.99975586f);
    }, RenderSystem::popMatrix);
    protected static final Hq_1 id_default = new Hq_1("no_fog", () -> {}, () -> {});
    protected static final Hq_1 id_const = new Hq_1("fog", () -> {
        HE.id_break();
        RenderSystem.enableFog();
    }, () -> RenderSystem.disableFog());
    protected static final Hq_1 id_strictfp = new Hq_1("black_fog", () -> {
        RenderSystem.fog(2918, 0.0f, 0.0f, 0.0f, 1.0f);
        RenderSystem.enableFog();
    }, () -> {
        HE.id_break();
        RenderSystem.disableFog();
    });
    protected static final Hg_1 id_boolean = new Hg_1("main_target", () -> {}, () -> {});
    protected static final Hg_1 id_transient = new Hg_1("outline_target", () -> ((yX_2)QY.id_instanceof().id_class[8]).id_interface().id_class(false), () -> QY.id_instanceof().B().id_class(false));
    protected static final Hg_1 id_for = new Hg_1("translucent_target", () -> {
        if (QY.d()) {
            ((yX_2)QY.id_instanceof().id_class[8]).id_char().id_class(false);
        }
    }, () -> {
        if (QY.d()) {
            QY.id_instanceof().B().id_class(false);
        }
    });
    protected static final Hg_1 id_double = new Hg_1("particles_target", () -> {
        if (QY.d()) {
            ((yX_2)QY.id_instanceof().id_class[8]).id_long().id_class(false);
        }
    }, () -> {
        if (QY.d()) {
            QY.id_instanceof().B().id_class(false);
        }
    });
    protected static final Hg_1 id_switch = new Hg_1("weather_target", () -> {
        if (QY.d()) {
            ((yX_2)QY.id_instanceof().id_class[8]).id_float().id_class(false);
        }
    }, () -> {
        if (QY.d()) {
            QY.id_instanceof().B().id_class(false);
        }
    });
    protected static final Hg_1 r = new Hg_1("clouds_target", () -> {
        if (QY.d()) {
            ((yX_2)QY.id_instanceof().id_class[8]).id_void().id_class(false);
        }
    }, () -> {
        if (QY.d()) {
            QY.id_instanceof().B().id_class(false);
        }
    });
    protected static final Hg_1 P = new Hg_1("item_entity_target", () -> {
        if (QY.d()) {
            ((yX_2)QY.id_instanceof().id_class[8]).id_abstract().id_class(false);
        }
    }, () -> {
        if (QY.d()) {
            QY.id_instanceof().B().id_class(false);
        }
    });
    protected static final Hw_1 B = new Hw_1(OptionalDouble.of(1.0));

    public String id_byte() {
        return this.id_class;
    }

    public Hn_1(String string, Runnable runnable, Runnable runnable2) {
        this.id_class = string;
        this.S = runnable;
        this.s = runnable2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Hn_1 hn_1 = (Hn_1)object;
            return this.id_class.equals(hn_1.id_class);
        }
        return false;
    }

    public String toString() {
        return this.id_class;
    }

    public int hashCode() {
        return this.id_class.hashCode();
    }

    private static void id_class(float f) {
        RenderSystem.matrixMode(5890);
        RenderSystem.pushMatrix();
        RenderSystem.loadIdentity();
        long l = rqR_2.id_break() * 8L;
        float f2 = (float)(l % 110000L) / 110000.0f;
        float f3 = (float)(l % 30000L) / 30000.0f;
        RenderSystem.translatef(-f2, f3, 0.0f);
        RenderSystem.rotatef(10.0f, 0.0f, 0.0f, 1.0f);
        RenderSystem.scalef(f, f, f);
        RenderSystem.matrixMode(5888);
    }

    public void id_class() {
        this.S.run();
    }

    public void id_break() {
        this.s.run();
    }
}

