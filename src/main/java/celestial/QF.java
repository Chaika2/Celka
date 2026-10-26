/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HM;
import celestial.LZ;
import celestial.MT;
import celestial.QY;
import celestial.Qg_1;
import celestial.Qw_1;
import celestial.VC;
import celestial.VF;
import celestial.VJ;
import celestial.VN;
import celestial.VW;
import celestial.VX;
import celestial.Vd_1;
import celestial.Vh_1;
import celestial.Vm_1;
import celestial.Vv_1;
import celestial.cI_2;
import celestial.cN_2;
import celestial.cm_3;
import celestial.cq_3;
import celestial.rfU_2;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhJ_2;
import celestial.rpl_3;
import celestial.rrMA;
import celestial.rrMT;
import celestial.rrbb_3;
import celestial.yX_2;
import com.mojang.blaze3d.platform.GLX;
import java.util.List;
import java.util.Optional;

public abstract class QF {
    public static final VF id_class = new VF("options.biomeBlendRadius", 0.0, 7.0, 1.0f, qw_1 -> qw_1.id_abstract, (qw_1, d) -> {
        qw_1.id_abstract = rfU_2.id_class((int)d.doubleValue(), 0, 7);
        ((yX_2)QY.id_instanceof().id_class[8]).id_throws();
    }, (qw_1, vF) -> {
        double d = vF.id_class((Qw_1)qw_1);
        int n = (int)d * 2 + 1;
        return vF.id_class(new rgn_3("options.biomeBlendRadius." + n));
    });
    public static final VF id_break = new VF("options.chat.height.focused", 0.0, 1.0, 0.0f, qw_1 -> qw_1.id_while, (qw_1, d) -> {
        qw_1.id_while = d;
        ((cq_3)QY.id_instanceof().id_class[19]).id_throws().id_class();
    }, (qw_1, vF) -> {
        double d = vF.id_break(vF.id_class((Qw_1)qw_1));
        return vF.id_class(cI_2.id_byte(d));
    });
    public static final VF id_byte = new VF("options.chat.height.unfocused", 0.0, 1.0, 0.0f, qw_1 -> qw_1.id_goto, (qw_1, d) -> {
        qw_1.id_goto = d;
        ((cq_3)QY.id_instanceof().id_class[19]).id_throws().id_class();
    }, (qw_1, vF) -> {
        double d = vF.id_break(vF.id_class((Qw_1)qw_1));
        return vF.id_class(cI_2.id_byte(d));
    });
    public static final VF id_protected = new VF("options.chat.opacity", 0.0, 1.0, 0.0f, qw_1 -> qw_1.id_extends, (qw_1, d) -> {
        qw_1.id_extends = d;
        ((cq_3)QY.id_instanceof().id_class[19]).id_throws().id_class();
    }, (qw_1, vF) -> {
        double d = vF.id_break(vF.id_class((Qw_1)qw_1));
        return vF.id_class(d * 0.9 + 0.1);
    });
    public static final VF id_throws = new VF("options.chat.scale", 0.0, 1.0, 0.0f, qw_1 -> qw_1.id_return, (qw_1, d) -> {
        qw_1.id_return = d;
        ((cq_3)QY.id_instanceof().id_class[19]).id_throws().id_class();
    }, (qw_1, vF) -> {
        double d = vF.id_break(vF.id_class((Qw_1)qw_1));
        return d == 0.0 ? cN_2.id_class(vF.id_class(), false) : vF.id_class(d);
    });
    public static final VF id_case = new VF("options.chat.width", 0.0, 1.0, 0.0f, qw_1 -> qw_1.id_public / 4.0571431, (qw_1, d) -> {
        d = d * 4.0571431;
        qw_1.id_public = d;
        ((cq_3)QY.id_instanceof().id_class[19]).id_throws().id_class();
    }, (qw_1, vF) -> {
        double d = vF.id_break(vF.id_class((Qw_1)qw_1));
        return vF.id_class(cI_2.id_break(d * 4.0571431));
    });
    public static final VF id_catch = new VF("options.chat.line_spacing", 0.0, 1.0, 0.0f, qw_1 -> qw_1.id_native, (qw_1, d) -> {
        qw_1.id_native = d;
    }, (qw_1, vF) -> vF.id_class(vF.id_break(vF.id_class((Qw_1)qw_1))));
    public static final VF id_private = new VF("options.chat.delay_instant", 0.0, 6.0, 0.1f, qw_1 -> qw_1.id_try, (qw_1, d) -> {
        qw_1.id_try = d;
    }, (qw_1, vF) -> {
        double d = vF.id_class((Qw_1)qw_1);
        return d <= 0.0 ? new rgn_3("options.chat.delay_none") : new rgn_3("options.chat.delay", String.format("%.1f", d));
    });
    public static final VF id_implements = new VF("options.fov", 30.0, 160.0, 1.0f, qw_1 -> qw_1.U, (qw_1, d) -> {
        qw_1.U = d;
    }, (qw_1, vF) -> {
        double d = vF.id_class((Qw_1)qw_1);
        if (d == 70.0) {
            return vF.id_class(new rgn_3("options.fov.min"));
        }
        return d == vF.id_case() ? vF.id_class(new rgn_3("options.fov.max")) : vF.id_byte((int)d);
    });
    private static final rgP_2 rF = new rgn_3("options.fovEffectScale.tooltip");
    public static final VF id_finally = new VF("options.fovEffectScale", 0.0, 1.0, 0.0f, qw_1 -> Math.pow(qw_1.e, 2.0), (qw_1, d) -> {
        qw_1.e = rfU_2.id_class(d);
    }, (qw_1, vF) -> {
        vF.id_class(((cm_3)QY.id_instanceof().id_class[15]).id_break(rF, 200));
        double d = vF.id_break(vF.id_class((Qw_1)qw_1));
        return d == 0.0 ? vF.id_class(new rgn_3("options.fovEffectScale.off")) : vF.id_class(d);
    });
    public static final VF id_extends = new VF("options.framerateLimit", 0.0, 500.0, 5.0f, qw_1 -> qw_1.id_strictfp ? 0.0 : (double)qw_1.id_protected, (qw_1, d) -> {
        qw_1.id_protected = (int)d.doubleValue();
        qw_1.id_strictfp = false;
        if (qw_1.id_protected <= 0) {
            qw_1.id_protected = 300;
            qw_1.id_strictfp = true;
        }
        qw_1.id_extends();
        QY.id_instanceof().id_else().id_class(qw_1.id_protected);
    }, (qw_1, vF) -> {
        if (qw_1.id_strictfp) {
            return vF.id_class(new rgn_3("of.options.framerateLimit.vsync"));
        }
        double d = vF.id_class((Qw_1)qw_1);
        return d == vF.id_case() ? vF.id_class(new rgn_3("options.framerateLimit.max")) : vF.id_class(new rgn_3("options.framerate", (int)d));
    });
    public static final VF id_native = new VF("options.gamma", 0.0, 1.0, 0.0f, qw_1 -> qw_1.a, (qw_1, d) -> {
        qw_1.a = d;
    }, (qw_1, vF) -> {
        double d = vF.id_break(vF.id_class((Qw_1)qw_1));
        if (d == 0.0) {
            return vF.id_class(new rgn_3("options.gamma.min"));
        }
        if (d == 1.0) {
            qw_1.a = 100.0;
            return vF.id_class(new rgn_3("options.gamma.max"));
        }
        return vF.id_break((int)(d * 100.0));
    });
    public static final VF id_volatile = new VF("options.mipmapLevels", 0.0, 4.0, 1.0f, qw_1 -> qw_1.id_instanceof, (qw_1, d) -> {
        qw_1.id_instanceof = (int)d.doubleValue();
        qw_1.id_native();
    }, (qw_1, vF) -> {
        double d = vF.id_class((Qw_1)qw_1);
        if (d >= 4.0) {
            return vF.id_class(new rgn_3("of.general.max"));
        }
        return d == 0.0 ? cN_2.id_class(vF.id_class(), false) : vF.id_byte((int)d);
    });
    public static final VF id_final = new Vv_1("options.mouseWheelSensitivity", 0.01, 10.0, 0.01f, qw_1 -> qw_1.id_long, (qw_1, d) -> {
        qw_1.id_long = d;
    }, (qw_1, vF) -> {
        double d = vF.id_break(vF.id_class((Qw_1)qw_1));
        return vF.id_class(new rgN_2(String.format("%.2f", vF.id_byte(d))));
    });
    public static final VJ id_package = new VJ("options.rawMouseInput", qw_1 -> qw_1.id_float, (qw_1, bl) -> {
        qw_1.id_float = bl;
        Qg_1 qg_1 = QY.id_instanceof().id_else();
        if (qg_1 != null) {
            qg_1.id_break((boolean)bl);
        }
    });
    public static final VF id_int = new VF("options.renderDistance", 2.0, 16.0, 1.0f, qw_1 -> qw_1.id_break, (qw_1, d) -> {
        qw_1.id_break = (int)d.doubleValue();
        ((yX_2)QY.id_instanceof().id_class[8]).id_volatile();
    }, (qw_1, vF) -> {
        double d = vF.id_class((Qw_1)qw_1);
        return vF.id_class(new rgn_3("options.chunks", (int)d));
    });
    public static final VF id_new = new VF("options.entityDistanceScaling", 0.5, 5.0, 0.25f, qw_1 -> qw_1.id_byte, (qw_1, d) -> {
        qw_1.id_byte = (float)d.doubleValue();
    }, (qw_1, vF) -> {
        double d = vF.id_class((Qw_1)qw_1);
        return vF.id_class(d);
    });
    public static final VF id_continue = new VF("options.sensitivity", 0.0, 1.0, 0.0f, qw_1 -> qw_1.id_class, (qw_1, d) -> {
        qw_1.id_class = d;
    }, (qw_1, vF) -> {
        double d = vF.id_break(vF.id_class((Qw_1)qw_1));
        if (d == 0.0) {
            return vF.id_class(new rgn_3("options.sensitivity.min"));
        }
        return d == 1.0 ? vF.id_class(new rgn_3("options.sensitivity.max")) : vF.id_class(2.0 * d);
    });
    public static final VF id_super = new VF("options.accessibility.text_background_opacity", 0.0, 1.0, 0.0f, qw_1 -> qw_1.id_volatile, (qw_1, d) -> {
        qw_1.id_volatile = d;
        ((cq_3)QY.id_instanceof().id_class[19]).id_throws().id_class();
    }, (qw_1, vF) -> vF.id_class(vF.id_break(vF.id_class((Qw_1)qw_1))));
    public static final VN id_this = new VN("options.ao", (qw_1, n) -> {
        qw_1.id_catch = Vh_1.id_class(qw_1.id_catch.id_class() + n);
        ((yX_2)QY.id_instanceof().id_class[8]).id_throws();
    }, (qw_1, vN) -> vN.id_class(new rgn_3(qw_1.id_catch.id_break())));
    public static final VN id_else = new VN("options.attackIndicator", (qw_1, n) -> {
        qw_1.id_interface = VX.id_class(qw_1.id_interface.id_class() + n);
    }, (qw_1, vN) -> vN.id_class(new rgn_3(qw_1.id_interface.id_break())));
    public static final VN id_synchronized = new VN("options.chat.visibility", (qw_1, n) -> {
        qw_1.id_finally = rhJ_2.id_class((qw_1.id_finally.id_class() + n) % 3);
    }, (qw_1, vN) -> vN.id_class(new rgn_3(qw_1.id_finally.id_break())));
    private static final rgP_2 rL = new rgn_3("options.graphics.fast.tooltip");
    private static final rgP_2 rA = new rgn_3("options.graphics.fabulous.tooltip", new rgn_3("options.graphics.fabulous").id_class(rgF_2.ITALIC));
    private static final rgP_2 rn = new rgn_3("options.graphics.fancy.tooltip");
    public static final VN id_return = new VN("options.graphics", (qw_1, n) -> {
        QY qY = QY.id_instanceof();
        HM hM = qY.id_new();
        if (qw_1.id_case == VW.FANCY && hM.id_byte()) {
            hM.id_protected();
        } else {
            qw_1.id_case = qw_1.id_case.id_byte();
            if (qw_1.id_case == VW.FABULOUS && (rrbb_3.rs() || !GLX.isUsingFBOs() || !MT.r() || hM.id_private())) {
                qw_1.id_case = VW.FAST;
            }
            qw_1.id_implements();
            ((yX_2)qY.id_class[8]).id_throws();
        }
    }, (qw_1, vN) -> {
        switch (qw_1.id_case) {
            case FAST: {
                vN.id_class(((cm_3)QY.id_instanceof().id_class[15]).id_break(rL, 200));
                break;
            }
            case FANCY: {
                vN.id_class(((cm_3)QY.id_instanceof().id_class[15]).id_break(rn, 200));
                break;
            }
            case FABULOUS: {
                vN.id_class(((cm_3)QY.id_instanceof().id_class[15]).id_break(rA, 200));
            }
        }
        rgn_3 rgn_32 = new rgn_3(qw_1.id_case.id_break());
        return qw_1.id_case == VW.FABULOUS ? vN.id_class(rgn_32.id_class(rgF_2.ITALIC)) : vN.id_class(rgn_32);
    });
    public static final VN id_public = new VN("options.guiScale", (qw_1, n) -> {
        qw_1.rs = rfU_2.id_break(qw_1.rs + n, QY.id_instanceof().id_else().id_class(0, QY.id_instanceof().id_continue()) + 1);
    }, (qw_1, vN) -> qw_1.rs == 0 ? vN.id_class(new rgn_3("options.guiScale.auto")) : vN.id_byte(qw_1.rs));
    public static final VN id_goto = new VN("options.mainHand", (qw_1, n) -> {
        qw_1.id_continue = qw_1.id_continue.id_class();
    }, (qw_1, vN) -> vN.id_class(qw_1.id_continue.id_break()));
    public static final VN id_while = new VN("options.particles", (qw_1, n) -> {
        qw_1.rE = Vm_1.id_class(qw_1.rE.id_break() + n);
    }, (qw_1, vN) -> vN.id_class(new rgn_3(qw_1.rE.id_class())));
    public static final VN id_try = new VN("options.renderClouds", (qw_1, n) -> {
        VC vC;
        qw_1.id_throws = Vd_1.id_class(qw_1.id_throws.id_class() + n);
        if (QY.d() && (vC = ((yX_2)QY.id_instanceof().id_class[8]).id_void()) != null) {
            vC.id_break((Boolean)QY.id_break[2]);
        }
    }, (qw_1, vN) -> vN.id_class(new rgn_3(qw_1.id_throws.id_break())));
    public static final VN id_instanceof = new VN("options.accessibility.text_background", (qw_1, n) -> {
        qw_1.B = !qw_1.B;
    }, (qw_1, vN) -> vN.id_class(new rgn_3(qw_1.B ? "options.accessibility.text_background.chat" : "options.accessibility.text_background.everywhere")));
    private static final rgP_2 rC = new rgn_3("options.hideMatchedNames.tooltip");
    public static final VJ id_throw = new VJ("options.autoJump", qw_1 -> qw_1.id_static, (qw_1, bl) -> {
        qw_1.id_static = bl;
    });
    public static final VJ id_interface = new VJ("options.autoSuggestCommands", qw_1 -> qw_1.id_import, (qw_1, bl) -> {
        qw_1.id_import = bl;
    });
    public static final VJ id_char = new VJ("options.hideMatchedNames", rC, qw_1 -> qw_1.M, (qw_1, bl) -> {
        qw_1.M = bl;
    });
    public static final VJ id_abstract = new VJ("options.chat.color", qw_1 -> qw_1.id_short, (qw_1, bl) -> {
        qw_1.id_short = bl;
    });
    public static final VJ id_long = new VJ("options.chat.removeSpam", qw_1 -> qw_1.id_synchronized, (qw_1, bl) -> {
        qw_1.id_synchronized = bl;
    });
    public static final VJ id_float = new VJ("options.chat.links", qw_1 -> qw_1.id_default, (qw_1, bl) -> {
        qw_1.id_default = bl;
    });
    public static final VJ id_void = new VJ("options.chat.links.prompt", qw_1 -> qw_1.id_const, (qw_1, bl) -> {
        qw_1.id_const = bl;
    });
    public static final VJ id_static = new VJ("options.discrete_mouse_scroll", qw_1 -> qw_1.id_double, (qw_1, bl) -> {
        qw_1.id_double = bl;
    });
    public static final VJ id_import = new VJ("options.vsync", qw_1 -> qw_1.id_strictfp, (qw_1, bl) -> {
        qw_1.id_strictfp = bl;
        if (QY.id_instanceof().id_else() != null) {
            QY.id_instanceof().id_else().id_class(qw_1.id_strictfp);
        }
    });
    public static final VJ id_short = new VJ("options.entityShadows", qw_1 -> qw_1.id_boolean, (qw_1, bl) -> {
        qw_1.id_boolean = bl;
    });
    public static final VJ id_default = new VJ("options.forceUnicodeFont", qw_1 -> qw_1.id_transient, (qw_1, bl) -> {
        qw_1.id_transient = bl;
        QY qY = QY.id_instanceof();
        if (qY.id_else() != null) {
            qY.id_byte((boolean)bl);
        }
    });
    public static final VJ id_const = new VJ("options.invertMouse", qw_1 -> qw_1.id_for, (qw_1, bl) -> {
        qw_1.id_for = bl;
    });
    public static final VJ id_strictfp = new VJ("options.reducedDebugInfo", qw_1 -> qw_1.id_switch, (qw_1, bl) -> {
        qw_1.id_switch = bl;
    });
    public static final VJ id_boolean = new VJ("options.showSubtitles", qw_1 -> qw_1.P, (qw_1, bl) -> {
        qw_1.P = bl;
    });
    public static final VJ id_transient = new VJ("options.snooper", qw_1 -> {
        if (qw_1.r) {
            // empty if block
        }
        return false;
    }, (qw_1, bl) -> {
        qw_1.r = bl;
    });
    public static final VN id_for = new VN("key.sneak", (qw_1, n) -> {
        qw_1.G = !qw_1.G;
    }, (qw_1, vN) -> vN.id_class(new rgn_3(qw_1.G ? "options.key.toggle" : "options.key.hold")));
    public static final VN id_double = new VN("key.sprint", (qw_1, n) -> {
        qw_1.b = !qw_1.b;
    }, (qw_1, vN) -> vN.id_class(new rgn_3(qw_1.b ? "options.key.toggle" : "options.key.hold")));
    public static final VJ id_switch = new VJ("options.touchscreen", qw_1 -> qw_1.S, (qw_1, bl) -> {
        qw_1.S = bl;
    });
    public static final VJ r = new VJ("options.fullscreen", qw_1 -> qw_1.s, (qw_1, bl) -> {
        qw_1.s = bl;
        QY qY = QY.id_instanceof();
        if (qY.id_else() != null && qY.id_else().id_finally() != qw_1.s) {
            qY.id_else().id_private();
            qw_1.s = qY.id_else().id_finally();
        }
    });
    public static final VF P = (VF)new VF("options.viewBobbingEffect", 0.0, 1.0, 0.0f, qw_1 -> qw_1.E, (qw_1, d) -> {
        qw_1.E = d;
    }, (qw_1, vF) -> {
        double d = vF.id_class((Qw_1)qw_1);
        return d == 0.0 ? vF.id_class(new rgn_3("options.fovEffectScale.off")) : vF.id_class(vF.id_break(d));
    }).id_class(1.0f);
    private final rgP_2 rl;
    private Optional<List<rpl_3>> rH = Optional.empty();
    private final String ry;
    public static final VN B = new rrMA("of.options.FOG_FANCY");
    public static final VN S = new rrMA("of.options.FOG_START");
    public static final VF s = new rrMT("of.options.MIPMAP_TYPE", 0.0, 3.0, 1.0f);
    public static final VN E = new rrMA("of.options.SMOOTH_FPS");
    public static final VN G = new rrMA("of.options.CLOUDS");
    public static final VF b = new rrMT("of.options.CLOUD_HEIGHT");
    public static final VN M = new rrMA("of.options.TREES");
    public static final VN O = new rrMA("of.options.RAIN");
    public static final VN h = new rrMA("of.options.ANIMATED_WATER");
    public static final VN X = new rrMA("of.options.ANIMATED_LAVA");
    public static final VN J = new rrMA("of.options.ANIMATED_FIRE");
    public static final VN x = new rrMA("of.options.ANIMATED_PORTAL");
    public static final VF d = new rrMT("of.options.AO_LEVEL");
    public static final VN k = new rrMA("of.options.LAGOMETER");
    public static final VN W = new rrMA("of.options.SHOW_FPS");
    public static final VN z = new rrMA("of.options.AUTOSAVE_TICKS");
    public static final VN Q = new rrMA("of.options.BETTER_GRASS");
    public static final VN N = new rrMA("of.options.ANIMATED_REDSTONE");
    public static final VN c = new rrMA("of.options.ANIMATED_EXPLOSION");
    public static final VN u = new rrMA("of.options.ANIMATED_FLAME");
    public static final VN m = new rrMA("of.options.ANIMATED_SMOKE");
    public static final VN Z = new rrMA("of.options.WEATHER");
    public static final VN v = new rrMA("of.options.SKY");
    public static final VN F = new rrMA("of.options.STARS");
    public static final VN L = new rrMA("of.options.SUN_MOON");
    public static final VN A = new rrMA("of.options.VIGNETTE");
    public static final VN n = new rrMA("of.options.CHUNK_UPDATES");
    public static final VN C = new rrMA("of.options.CHUNK_UPDATES_DYNAMIC");
    public static final VN l = new rrMA("of.options.TIME");
    public static final VN H = new rrMA("of.options.SMOOTH_WORLD");
    public static final VN y = new rrMA("of.options.VOID_PARTICLES");
    public static final VN p = new rrMA("of.options.WATER_PARTICLES");
    public static final VN q = new rrMA("of.options.RAIN_SPLASH");
    public static final VN T = new rrMA("of.options.PORTAL_PARTICLES");
    public static final VN t = new rrMA("of.options.POTION_PARTICLES");
    public static final VN w = new rrMA("of.options.FIREWORK_PARTICLES");
    public static final VN I = new rrMA("of.options.BLOCK_PARTICLES");
    public static final VN f = new rrMA("of.options.BUBBLE_COLUMN_PARTICLES");
    public static final VN j = new rrMA("of.options.PROFILER");
    public static final VN V = new rrMA("of.options.DRIPPING_WATER_LAVA");
    public static final VN g = new rrMA("of.options.BETTER_SNOW");
    public static final VN R = new rrMA("of.options.ANIMATED_TERRAIN");
    public static final VN Y = new rrMA("of.options.SWAMP_COLORS");
    public static final VN o = new rrMA("of.options.RANDOM_ENTITIES");
    public static final VN K = new rrMA("of.options.SMOOTH_BIOMES");
    public static final VN D = new rrMA("of.options.CUSTOM_FONTS");
    public static final VN U = new rrMA("of.options.CUSTOM_COLORS");
    public static final VN e = new rrMA("of.options.SHOW_CAPES");
    public static final VN a = new rrMA("of.options.CONNECTED_TEXTURES");
    public static final VN i = new rrMA("of.options.CUSTOM_ITEMS");
    public static final VF rr = new rrMT("of.options.AA_LEVEL", 0.0, 16.0, new double[]{0.0, 2.0, 4.0, 6.0, 8.0, 12.0, 16.0});
    public static final VF rP = new rrMT("of.options.AF_LEVEL", 1.0, 16.0, new double[]{1.0, 2.0, 4.0, 8.0, 16.0});
    public static final VN rB = new rrMA("of.options.ANIMATED_TEXTURES");
    public static final VN rS = new rrMA("of.options.NATURAL_TEXTURES");
    public static final VN rs = new rrMA("of.options.EMISSIVE_TEXTURES");
    public static final VN rE = new rrMA("of.options.HELD_ITEM_TOOLTIPS");
    public static final VN rG = new rrMA("of.options.DROPPED_ITEMS");
    public static final VN rb = new rrMA("of.options.LAZY_CHUNK_LOADING");
    public static final VN rM = new rrMA("of.options.CUSTOM_SKY");
    public static final VN rO = new rrMA("of.options.FAST_MATH");
    public static final VN rh = new rrMA("of.options.FAST_RENDER");
    public static final VN rX = new rrMA("of.options.TRANSLUCENT_BLOCKS");
    public static final VN rJ = new rrMA("of.options.DYNAMIC_FOV");
    public static final VN rx = new rrMA("of.options.DYNAMIC_LIGHTS");
    public static final VN rd = new rrMA("of.options.ALTERNATE_BLOCKS");
    public static final VN rk = new rrMA("of.options.CUSTOM_ENTITY_MODELS");
    public static final VN rW = new rrMA("of.options.ADVANCED_ITEMS_OVERLAY");
    public static final VN rz = new rrMA("of.options.ADVANCED_TOOLTIPS");
    public static final VN rQ = new rrMA("of.options.SCREENSHOT_SIZE");
    public static final VN rN = new rrMA("of.options.CUSTOM_GUIS");
    public static final VN rc = new rrMA("of.options.RENDER_REGIONS");
    public static final VN ru = new rrMA("of.options.SHOW_GL_ERRORS");
    public static final VN rm = new rrMA("of.options.SMART_ANIMATIONS");
    public static final VN rZ = new rrMA("of.options.CHAT_BACKGROUND");
    public static final VN rv = new rrMA("of.options.CHAT_SHADOW");
    private float rp;

    public rgP_2 id_byte(int n) {
        return this.id_class(new rgN_2(Integer.toString(n)));
    }

    public String id_byte() {
        return this.ry;
    }

    public QF(String string) {
        this.rl = new rgn_3(string);
        this.ry = string;
    }

    protected rgP_2 id_class(double d) {
        return new rgn_3("options.percent_value", this.id_class(), (int)(d * 100.0));
    }

    protected rgP_2 id_class(int n) {
        return new rgn_3("options.pixel_value", this.id_class(), n);
    }

    public rgP_2 id_class(rgP_2 rgP_22) {
        return new rgn_3("options.generic_value", this.id_class(), rgP_22);
    }

    public <T extends QF> T id_class(float f) {
        this.rp = f;
        return (T)this;
    }

    public rgP_2 id_class() {
        return this.rl;
    }

    public abstract LZ id_class(Qw_1 var1, int var2, int var3, int var4);

    public void id_class(List<rpl_3> list) {
        this.rH = Optional.of(list);
    }

    public Optional<List<rpl_3>> id_break() {
        return this.rH;
    }

    public rgP_2 id_break(int n) {
        return new rgn_3("options.percent_add_value", this.id_class(), n);
    }

    public float id_protected() {
        return this.rp;
    }
}

