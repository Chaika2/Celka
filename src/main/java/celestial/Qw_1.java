/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.base.Splitter
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.reflect.TypeToken
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Aq_1;
import celestial.QF;
import celestial.QI;
import celestial.QY;
import celestial.VA;
import celestial.VC;
import celestial.VF;
import celestial.VW;
import celestial.VX;
import celestial.VZ;
import celestial.Va_1;
import celestial.Vd_1;
import celestial.Ve_1;
import celestial.Vh_1;
import celestial.Vi_1;
import celestial.Vm_1;
import celestial.Vu_1;
import celestial.cb_3;
import celestial.jI_2;
import celestial.rAp_1;
import celestial.rAt_1;
import celestial.rRO;
import celestial.rTv_1;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rhJ_2;
import celestial.rhQ_2;
import celestial.rmw_3;
import celestial.rpY_2;
import celestial.rpZ_2;
import celestial.rqL_2;
import celestial.rqR_2;
import celestial.rqi_3;
import celestial.rqu_3;
import celestial.rrLw_1;
import celestial.rrME;
import celestial.rrMs_1;
import celestial.rrMu_1;
import celestial.rrQX;
import celestial.rrWj_1;
import celestial.rrWv_1;
import celestial.rrbN_2;
import celestial.rrba_3;
import celestial.rrbb_3;
import celestial.rrbf_3;
import celestial.rrbg_3;
import celestial.rrbl_3;
import celestial.rrcB_2;
import celestial.rrdZ;
import celestial.rrxr_3;
import celestial.yX_2;
import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Qw_1 {
    private static final Logger PV = LogManager.getLogger();
    private static final Gson Pg = new Gson();
    private static final TypeToken<List<String>> PR = new QI();
    private static final Splitter PY = Splitter.on((char)':').limit(2);
    public double id_class = 0.5;
    public int id_break = -1;
    public float id_byte = 1.0f;
    public int id_protected = 120;
    public Vd_1 id_throws = Vd_1.FANCY;
    public VW id_case = VW.FANCY;
    public Vh_1 id_catch = Vh_1.MAX;
    public List<String> id_private = Lists.newArrayList();
    public List<String> id_implements = Lists.newArrayList();
    public rhJ_2 id_finally = rhJ_2.FULL;
    public double id_extends = 1.0;
    public double id_native = 0.0;
    public double id_volatile = 0.5;
    public String id_final;
    public boolean id_package;
    public boolean id_int;
    public boolean id_new = true;
    private final Set<rhQ_2> Po = Sets.newHashSet((Object[])rhQ_2.values());
    public rpZ_2 id_continue = rpZ_2.RIGHT;
    public int id_super;
    public int id_this;
    public boolean id_else = false;
    public boolean id_synchronized = true;
    public double id_return = 1.0;
    public double id_public = 1.0;
    public double id_goto = 0.44366195797920227;
    public double id_while = 1.0;
    public double id_try = 0.0;
    public int id_instanceof = 4;
    private final Map<rqL_2, Float> PK = Maps.newEnumMap(rqL_2.class);
    public boolean id_throw = true;
    public VX id_interface = VX.CROSSHAIR;
    public boolean id_char = false;
    public int id_abstract = 2;
    public double id_long = 1.0;
    public boolean id_float = true;
    public int id_void = 1;
    public boolean id_static = false;
    public boolean id_import = true;
    public boolean id_short = true;
    public boolean id_default = true;
    public boolean id_const = true;
    public boolean id_strictfp = true;
    public boolean id_boolean = true;
    public boolean id_transient;
    public boolean id_for;
    public boolean id_double;
    public boolean id_switch;
    public boolean r = true;
    public boolean P;
    public boolean B = true;
    public boolean S;
    public boolean s;
    public double E = 0.3f;
    public boolean G;
    public boolean b;
    public boolean M = true;
    public boolean O;
    public final Vu_1 h = new Vu_1("key.forward", 87, "key.categories.movement");
    public final Vu_1 X = new Vu_1("key.left", 65, "key.categories.movement");
    public final Vu_1 J = new Vu_1("key.back", 83, "key.categories.movement");
    public final Vu_1 x = new Vu_1("key.right", 68, "key.categories.movement");
    public final Vu_1 d = new Vu_1("key.jump", 32, "key.categories.movement");
    public final Vu_1 k = new VA("key.sneak", 340, "key.categories.movement", () -> this.G);
    public final Vu_1 W = new VA("key.sprint", 341, "key.categories.movement", () -> this.b);
    public final Vu_1 z = new Vu_1("key.inventory", 69, "key.categories.inventory");
    public final Vu_1 Q = new Vu_1("key.swapOffhand", 70, "key.categories.inventory");
    public final Vu_1 N = new Vu_1("key.drop", 81, "key.categories.inventory");
    public final Vu_1 c = new Vu_1("key.dropItemsWithSameType", 90, "key.categories.inventory", Arrays.asList(Vi_1.MOUSE.id_class(2)));
    public final Vu_1 u = new Vu_1("key.use", Vi_1.MOUSE, 1, "key.categories.gameplay");
    public final Vu_1 m = new Vu_1("key.attack", Vi_1.MOUSE, 0, "key.categories.gameplay");
    public final Vu_1 Z = new Vu_1("key.pickItem", Vi_1.MOUSE, 2, "key.categories.gameplay");
    public final Vu_1 v = new Vu_1("key.chat", 84, "key.categories.multiplayer");
    public final Vu_1 F = new Vu_1("key.playerlist", 258, "key.categories.multiplayer");
    public final Vu_1 L = new Vu_1("key.command", 47, "key.categories.multiplayer");
    public final Vu_1 A = new Vu_1("key.socialInteractions", 80, "key.categories.multiplayer");
    public final Vu_1 n = new Vu_1("key.screenshot", 291, "key.categories.misc");
    public final Vu_1 C = new Vu_1("key.togglePerspective", 294, "key.categories.misc");
    public final Vu_1 l = new Vu_1("key.freeLook", 295, "key.categories.misc");
    public final Vu_1 H = new Vu_1("key.smoothCamera", Ve_1.id_class.id_break(), "key.categories.misc");
    public final Vu_1 y = new Vu_1("key.fullscreen", 300, "key.categories.misc");
    public final Vu_1 p = new Vu_1("key.spectatorOutlines", Ve_1.id_class.id_break(), "key.categories.misc");
    public final Vu_1 q = new Vu_1("key.advancements", 76, "key.categories.misc");
    public final Vu_1 T = new Vu_1("key.openitemsmenu", 293, "key.categories.misc");
    public final Vu_1[] t = new Vu_1[]{new Vu_1("key.hotbar.1", 49, "key.categories.inventory"), new Vu_1("key.hotbar.2", 50, "key.categories.inventory"), new Vu_1("key.hotbar.3", 51, "key.categories.inventory"), new Vu_1("key.hotbar.4", 52, "key.categories.inventory"), new Vu_1("key.hotbar.5", 53, "key.categories.inventory"), new Vu_1("key.hotbar.6", 54, "key.categories.inventory"), new Vu_1("key.hotbar.7", 55, "key.categories.inventory"), new Vu_1("key.hotbar.8", 56, "key.categories.inventory"), new Vu_1("key.hotbar.9", 57, "key.categories.inventory")};
    public final Vu_1 w = new Vu_1("key.saveToolbarActivator", 67, "key.categories.creative");
    public final Vu_1 I = new Vu_1("key.loadToolbarActivator", 88, "key.categories.creative");
    public Vu_1[] f = (Vu_1[])ArrayUtils.addAll((Object[])new Vu_1[]{this.m, this.u, this.h, this.X, this.J, this.x, this.d, this.k, this.W, this.c, this.N, this.z, this.v, this.F, this.Z, this.L, this.A, this.n, this.l, this.C, this.H, this.y, this.T, this.p, this.Q, this.w, this.I, this.q}, (Object[])this.t);
    protected QY j;
    private final File PD;
    public rRO V = rRO.NORMAL;
    public boolean g;
    private VZ PU = VZ.FIRST_PERSON;
    public boolean R;
    public boolean Y;
    public boolean o;
    public String K = "";
    public boolean D;
    public double U = 70.0;
    public float e = 1.0f;
    public double a = 1.0;
    public rrcB_2 i = (rrcB_2)((Object)rrcB_2.staticFields98d16a36ad1c33518cd334d8bca22c4a[0]);
    public double rr = 0.0;
    public boolean rP;
    public boolean rB = true;
    public double rS = 40.0;
    public int rs = 2;
    public Vm_1 rE = Vm_1.ALL;
    public String rG = "en_us";
    public boolean rb;
    public int rM = 1;
    public float rO = 0.8f;
    public int rh = 0;
    public boolean rX = false;
    public boolean rJ = false;
    public boolean rx = rrbb_3.rM();
    public boolean rd = rrbb_3.rM();
    public boolean rk = false;
    public boolean rW = false;
    public double rz = 1.0;
    public int rQ = 0;
    public int rN = 1;
    public int rc = 0;
    public double ru = 0.0;
    public int rm = 0;
    public int rZ = 0;
    public int rv = 0;
    public int rF = 3;
    public int rL = 4000;
    public boolean rA = false;
    public boolean rn = false;
    public boolean rC = false;
    public boolean rl = true;
    public boolean rH = true;
    public boolean ry = true;
    public boolean rp = true;
    public int rq = 0;
    public int rT = 1;
    public boolean rt = false;
    public int rw = 0;
    public boolean rI = false;
    public boolean rf = true;
    public boolean rj = true;
    public boolean rV = true;
    public boolean rg = true;
    public boolean rR = true;
    public boolean rY = true;
    public int ro = 2;
    public boolean rK = true;
    public boolean rD = false;
    public boolean rU = true;
    public boolean re = false;
    public boolean ra = true;
    public int ri = 0;
    public boolean Pr = false;
    public boolean PP = true;
    public int PB = 3;
    public boolean PS = true;
    public boolean Ps = true;
    public boolean PE = true;
    public int PG = 1;
    public int Pb = 0;
    public boolean PM = true;
    public int PO = 0;
    public int Ph = 0;
    public boolean PX = true;
    public boolean PJ = true;
    public boolean Px = true;
    public boolean Pd = true;
    public boolean Pk = true;
    public boolean PW = true;
    public boolean Pz = true;
    public boolean PQ = true;
    public boolean PN = true;
    public boolean Pc = true;
    public boolean Pu = true;
    public boolean Pm = true;
    public boolean PZ = true;
    public boolean Pv = true;
    public boolean PF = true;
    public boolean PL = true;
    public boolean PA = true;
    public static final int Pn = 0;
    public static final int PC = 1;
    public static final int Pl = 2;
    public static final int PH = 3;
    public static final int Py = 4;
    public static final int Pp = 5;
    public static final int Pq = 0;
    public static final int PT = 1;
    public static final int Pt = 2;
    public static final String Pw = "Default";
    public static final double PI = 4.0571431;
    private static final int[] Pe = new int[]{0, 1, 4, 2};
    private static final int[] Pa = new int[]{3, 1, 2};
    private static final String[] Pi = new String[]{"options.off", "options.graphics.fast", "options.graphics.fancy"};
    public Vu_1 Pf;
    private File Br;
    public final Vu_1[] Pj = new Vu_1[]{this.X, this.x, this.h, this.J, this.d};

    public void id_byte() {
        if ((cb_3)this.j.id_class[57] != null) {
            int n = 0;
            for (rhQ_2 rhQ_22 : this.Po) {
                n |= rhQ_22.id_class();
            }
            ((Aq_1)((cb_3)this.j.id_class[57]).id_break[0]).id_class(new rmw_3(this.rG, this.id_break, this.id_finally, this.id_short, n, this.id_continue));
        }
    }

    private static int id_byte(int n, int[] nArray) {
        for (int i = 0; i < nArray.length; ++i) {
            if (nArray[i] != n) continue;
            return i;
        }
        return -1;
    }

    public String id_byte(QF qF) {
        Object object = jI_2.id_class(qF.id_byte(), new Object[0]) + ": ";
        if (object == null) {
            object = qF.id_byte();
        }
        if (qF == QF.id_int) {
            int n = (int)QF.id_int.id_class(this);
            String string = jI_2.id_class("of.options.renderDistance.tiny", new Object[0]);
            int n2 = 2;
            if (n >= 4) {
                string = jI_2.id_class("of.options.renderDistance.short", new Object[0]);
                n2 = 4;
            }
            if (n >= 8) {
                string = jI_2.id_class("of.options.renderDistance.normal", new Object[0]);
                n2 = 8;
            }
            if (n >= 16) {
                string = jI_2.id_class("of.options.renderDistance.far", new Object[0]);
                n2 = 16;
            }
            if (n >= 32) {
                string = rrba_3.id_class("of.options.renderDistance.extreme");
                n2 = 32;
            }
            if (n >= 48) {
                string = rrba_3.id_class("of.options.renderDistance.insane");
                n2 = 48;
            }
            if (n >= 64) {
                string = rrba_3.id_class("of.options.renderDistance.ludicrous");
                n2 = 64;
            }
            int n3 = this.id_break - n2;
            Object object2 = string;
            if (n3 > 0) {
                object2 = string + "+";
            }
            return (String)object + n + " " + (String)object2;
        }
        if (qF == QF.B) {
            switch (this.rM) {
                case 1: {
                    return (String)object + rrba_3.id_protected();
                }
                case 2: {
                    return (String)object + rrba_3.id_throws();
                }
                case 3: {
                    return (String)object + rrba_3.id_byte();
                }
            }
            return (String)object + rrba_3.id_byte();
        }
        if (qF == QF.S) {
            return (String)object + this.rO;
        }
        if (qF == QF.s) {
            return rrMu_1.id_break(qF, this.rh);
        }
        if (qF == QF.E) {
            return this.rJ ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.H) {
            return this.rx ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.G) {
            switch (this.rc) {
                case 1: {
                    return (String)object + rrba_3.id_protected();
                }
                case 2: {
                    return (String)object + rrba_3.id_throws();
                }
                case 3: {
                    return (String)object + rrba_3.id_byte();
                }
            }
            return (String)object + rrba_3.id_case();
        }
        if (qF == QF.M) {
            switch (this.rm) {
                case 1: {
                    return (String)object + rrba_3.id_protected();
                }
                case 2: {
                    return (String)object + rrba_3.id_throws();
                }
                default: {
                    return (String)object + rrba_3.id_case();
                }
                case 4: 
            }
            return (String)object + rrba_3.id_class("of.general.smart");
        }
        if (qF == QF.rG) {
            switch (this.rv) {
                case 1: {
                    return (String)object + rrba_3.id_protected();
                }
                case 2: {
                    return (String)object + rrba_3.id_throws();
                }
            }
            return (String)object + rrba_3.id_case();
        }
        if (qF == QF.O) {
            switch (this.rZ) {
                case 1: {
                    return (String)object + rrba_3.id_protected();
                }
                case 2: {
                    return (String)object + rrba_3.id_throws();
                }
                case 3: {
                    return (String)object + rrba_3.id_byte();
                }
            }
            return (String)object + rrba_3.id_case();
        }
        if (qF == QF.h) {
            switch (this.PO) {
                case 1: {
                    return (String)object + rrba_3.id_class("of.options.animation.dynamic");
                }
                case 2: {
                    return (String)object + rrba_3.id_byte();
                }
            }
            return (String)object + rrba_3.id_break();
        }
        if (qF == QF.X) {
            switch (this.Ph) {
                case 1: {
                    return (String)object + rrba_3.id_class("of.options.animation.dynamic");
                }
                case 2: {
                    return (String)object + rrba_3.id_byte();
                }
            }
            return (String)object + rrba_3.id_break();
        }
        if (qF == QF.J) {
            return this.PX ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.x) {
            return this.PJ ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.N) {
            return this.Px ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.c) {
            return this.Pd ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.u) {
            return this.Pk ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.m) {
            return this.PW ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.y) {
            return this.Pz ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.p) {
            return this.PQ ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.T) {
            return this.Pc ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.t) {
            return this.Pu ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.w) {
            return this.Pm ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.I) {
            return this.PZ ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.f) {
            return this.Pv ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.V) {
            return this.PF ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.R) {
            return this.PL ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rB) {
            return this.PA ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.q) {
            return this.PN ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.k) {
            return this.rA ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.W) {
            return this.rC ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.z) {
            int n = 900;
            if (this.rL <= n) {
                return (String)object + rrba_3.id_class("of.options.save.45s");
            }
            if (this.rL <= 2 * n) {
                return (String)object + rrba_3.id_class("of.options.save.90s");
            }
            if (this.rL <= 4 * n) {
                return (String)object + rrba_3.id_class("of.options.save.3min");
            }
            if (this.rL <= 8 * n) {
                return (String)object + rrba_3.id_class("of.options.save.6min");
            }
            return this.rL <= 16 * n ? (String)object + rrba_3.id_class("of.options.save.12min") : (String)object + rrba_3.id_class("of.options.save.24min");
        }
        if (qF == QF.Q) {
            switch (this.rF) {
                case 1: {
                    return (String)object + rrba_3.id_protected();
                }
                case 2: {
                    return (String)object + rrba_3.id_throws();
                }
            }
            return (String)object + rrba_3.id_byte();
        }
        if (qF == QF.a) {
            switch (this.ro) {
                case 1: {
                    return (String)object + rrba_3.id_protected();
                }
                case 2: {
                    return (String)object + rrba_3.id_throws();
                }
            }
            return (String)object + rrba_3.id_byte();
        }
        if (qF == QF.Z) {
            return this.rl ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.v) {
            return this.rH ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.F) {
            return this.ry ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.L) {
            return this.rp ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.A) {
            switch (this.rq) {
                case 1: {
                    return (String)object + rrba_3.id_protected();
                }
                case 2: {
                    return (String)object + rrba_3.id_throws();
                }
            }
            return (String)object + rrba_3.id_case();
        }
        if (qF == QF.n) {
            return (String)object + this.rT;
        }
        if (qF == QF.C) {
            return this.rt ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.l) {
            if (this.rw == 1) {
                return (String)object + rrba_3.id_class("of.options.time.dayOnly");
            }
            return this.rw == 2 ? (String)object + rrba_3.id_class("of.options.time.nightOnly") : (String)object + rrba_3.id_case();
        }
        if (qF == QF.rr) {
            return rrMu_1.id_break(qF, this.rQ);
        }
        if (qF == QF.rP) {
            return rrMu_1.id_break(qF, this.rN);
        }
        if (qF == QF.j) {
            return this.rn ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.g) {
            return this.rI ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.Y) {
            return this.rf ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.o) {
            return this.rj ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.D) {
            return this.rV ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.U) {
            return this.rg ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rM) {
            return this.rR ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.e) {
            return this.rY ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.i) {
            return this.rK ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rS) {
            return this.rD ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rs) {
            return this.rU ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rO) {
            return this.re ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rh) {
            return this.ra ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rX) {
            if (this.ri == 1) {
                return (String)object + rrba_3.id_protected();
            }
            return this.ri == 2 ? (String)object + rrba_3.id_throws() : (String)object + rrba_3.id_case();
        }
        if (qF == QF.rb) {
            return this.rd ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rc) {
            return this.rk ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rm) {
            return this.rW ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rJ) {
            return this.Pr ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rd) {
            return this.PP ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rx) {
            int n = Qw_1.id_byte(this.PB, Pa);
            return (String)object + Qw_1.id_class(Pi, n);
        }
        if (qF == QF.rQ) {
            return this.PG <= 1 ? (String)object + rrba_3.id_case() : (String)object + this.PG + "x";
        }
        if (qF == QF.rk) {
            return this.PS ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rN) {
            return this.Ps ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.ru) {
            return this.PE ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rE) {
            return this.id_else ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.rz) {
            return this.id_int ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF == QF.id_extends) {
            double d = QF.id_extends.id_class(this);
            if (d == 0.0) {
                return (String)object + rrba_3.id_class("of.options.framerateLimit.vsync");
            }
            return d == QF.id_extends.id_case() ? (String)object + jI_2.id_class("options.framerateLimit.max", new Object[0]) : (String)object + (int)d + " fps";
        }
        if (qF == QF.rZ) {
            if (this.Pb == 3) {
                return (String)object + rrba_3.id_byte();
            }
            return this.Pb == 5 ? (String)object + rrba_3.id_class("of.general.compact") : (String)object + rrba_3.id_case();
        }
        if (qF == QF.rv) {
            return this.PM ? (String)object + rrba_3.id_break() : (String)object + rrba_3.id_byte();
        }
        if (qF instanceof VF) {
            VF vF = (VF)qF;
            double d = vF.id_class(this);
            return d == 0.0 ? (String)object + jI_2.id_class("options.off", new Object[0]) : (String)object + (int)(d * 100.0) + "%";
        }
        return null;
    }

    public Qw_1(QY qY, File file) {
        this.id_package();
        this.j = qY;
        this.PD = new File(file, "options.txt");
        if (qY.id_strictfp() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
            QF.id_int.id_break(32.0f);
            long l = 1000000L;
            if (Runtime.getRuntime().maxMemory() >= 1500L * l) {
                QF.id_int.id_break(48.0f);
            }
            if (Runtime.getRuntime().maxMemory() >= 2500L * l) {
                QF.id_int.id_break(64.0f);
            }
        } else {
            QF.id_int.id_break(16.0f);
        }
        this.id_break = qY.id_strictfp() ? 12 : 8;
        this.rb = rqR_2.id_implements() == rqi_3.WINDOWS;
        this.Br = new File(file, "optionsof.txt");
        this.id_protected = (int)QF.id_extends.id_case();
        this.Pf = new Vu_1("of.key.zoom", 67, "key.categories.misc");
        this.f = (Vu_1[])ArrayUtils.add((Object[])this.f, (Object)this.Pf);
        rrWj_1.id_class(this.f, new Vu_1[]{this.Pf});
        this.id_break = 8;
        this.id_class();
        rrbb_3.id_class(this);
    }

    public double id_class(QF qF) {
        if (qF == QF.b) {
            return this.ru;
        }
        if (qF == QF.d) {
            return this.rz;
        }
        if (qF == QF.rr) {
            return this.rQ;
        }
        if (qF == QF.rP) {
            return this.rN;
        }
        if (qF == QF.s) {
            return this.rh;
        }
        if (qF == QF.id_extends) {
            return (double)this.id_protected == QF.id_extends.id_case() && this.id_strictfp ? 0.0 : (double)this.id_protected;
        }
        return 3.4028234663852886E38;
    }

    public void id_class(QF qF, double d) {
        int n;
        if (qF == QF.b) {
            this.ru = d;
        }
        if (qF == QF.d) {
            this.rz = d;
            ((yX_2)this.j.id_class[8]).id_throws();
        }
        if (qF == QF.rr) {
            n = (int)d;
            if (n > 0 && rrbb_3.rs()) {
                rrbb_3.id_byte(rrba_3.id_class("of.message.aa.shaders1"), rrba_3.id_class("of.message.aa.shaders2"));
                return;
            }
            if (n > 0 && rrbb_3.id_instanceof()) {
                rrbb_3.id_byte(rrba_3.id_class("of.message.aa.gf1"), rrba_3.id_class("of.message.aa.gf2"));
                return;
            }
            this.rQ = n;
            this.rQ = rrbb_3.id_class(this.rQ, 0, 16);
        }
        if (qF == QF.rP) {
            this.rN = n = (int)d;
            this.rN = rrbb_3.id_class(this.rN, 1, 16);
            this.j.x();
            rrdZ.id_while();
        }
        if (qF == QF.s) {
            n = (int)d;
            this.rh = rrbb_3.id_class(n, 0, 3);
            this.id_native();
        }
    }

    private static String id_class(String[] stringArray, int n) {
        if (n < 0 || n >= stringArray.length) {
            n = 0;
        }
        return jI_2.id_class(stringArray[n], new Object[0]);
    }

    public void id_class(rAt_1 rAt_12) {
        LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
        Iterator<String> iterator = this.id_private.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            rAp_1 rAp_12 = rAt_12.id_class(string);
            if (rAp_12 == null && !string.startsWith("file/")) {
                rAp_12 = rAt_12.id_class("file/" + string);
            }
            if (rAp_12 == null) {
                PV.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", (Object)string);
                iterator.remove();
                continue;
            }
            if (!rAp_12.id_byte().id_class() && !this.id_implements.contains(string)) {
                PV.warn("Removed resource pack {} from options because it is no longer compatible", (Object)string);
                iterator.remove();
                continue;
            }
            if (rAp_12.id_byte().id_class() && this.id_implements.contains(string)) {
                PV.info("Removed resource pack {} from incompatibility list because it's now compatible", (Object)string);
                this.id_implements.remove(string);
                continue;
            }
            linkedHashSet.add(rAp_12.id_throws());
        }
        rAt_12.id_class(linkedHashSet);
    }

    public void id_class(VZ vZ) {
        rrLw_1 rrLw_12 = rrLw_1.id_class(this.PU, vZ);
        if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLw_12).id_byte()) {
            this.PU = rrLw_12.id_break();
        }
    }

    public void id_class(boolean bl) {
        int n;
        this.PO = n = bl ? 0 : 2;
        this.Ph = n;
        this.PX = bl;
        this.PJ = bl;
        this.Px = bl;
        this.Pd = bl;
        this.Pk = bl;
        this.PW = bl;
        this.Pz = bl;
        this.PQ = bl;
        this.PN = bl;
        this.Pc = bl;
        this.Pu = bl;
        this.Pm = bl;
        this.PZ = bl;
        this.Pv = bl;
        this.rE = bl ? Vm_1.ALL : Vm_1.MINIMAL;
        this.PF = bl;
        this.PL = bl;
        this.PA = bl;
    }

    private static int id_class(int n, int[] nArray) {
        int n2 = Qw_1.id_byte(n, nArray);
        if (n2 < 0) {
            return nArray[0];
        }
        if (++n2 >= nArray.length) {
            n2 = 0;
        }
        return nArray[n2];
    }

    public int id_class(int n) {
        return this.B ? n : (int)(this.id_volatile * 255.0) << 24 & 0xFF000000;
    }

    public void id_class(Vu_1 vu_1, Va_1 va_1) {
        vu_1.id_break(va_1, true);
        this.id_break();
    }

    public void id_class(QF qF, int n) {
        if (qF == QF.B) {
            switch (this.rM) {
                case 1: {
                    this.rM = 2;
                    if (rrbb_3.id_case()) break;
                    this.rM = 3;
                    break;
                }
                case 2: {
                    this.rM = 3;
                    break;
                }
                case 3: {
                    this.rM = 1;
                    break;
                }
                default: {
                    this.rM = 1;
                }
            }
        }
        if (qF == QF.S) {
            this.rO += 0.2f;
            if (this.rO > 0.81f) {
                this.rO = 0.2f;
            }
        }
        if (qF == QF.E) {
            boolean bl = this.rJ = !this.rJ;
        }
        if (qF == QF.H) {
            this.rx = !this.rx;
            rrbb_3.id_volatile();
        }
        if (qF == QF.G) {
            ++this.rc;
            if (this.rc > 3) {
                this.rc = 0;
            }
            this.id_implements();
        }
        if (qF == QF.M) {
            this.rm = Qw_1.id_class(this.rm, Pe);
            ((yX_2)this.j.id_class[8]).id_throws();
        }
        if (qF == QF.rG) {
            ++this.rv;
            if (this.rv > 2) {
                this.rv = 0;
            }
        }
        if (qF == QF.O) {
            ++this.rZ;
            if (this.rZ > 3) {
                this.rZ = 0;
            }
        }
        if (qF == QF.h) {
            ++this.PO;
            if (this.PO == 1) {
                ++this.PO;
            }
            if (this.PO > 2) {
                this.PO = 0;
            }
        }
        if (qF == QF.X) {
            ++this.Ph;
            if (this.Ph == 1) {
                ++this.Ph;
            }
            if (this.Ph > 2) {
                this.Ph = 0;
            }
        }
        if (qF == QF.J) {
            boolean bl = this.PX = !this.PX;
        }
        if (qF == QF.x) {
            boolean bl = this.PJ = !this.PJ;
        }
        if (qF == QF.N) {
            boolean bl = this.Px = !this.Px;
        }
        if (qF == QF.c) {
            boolean bl = this.Pd = !this.Pd;
        }
        if (qF == QF.u) {
            boolean bl = this.Pk = !this.Pk;
        }
        if (qF == QF.m) {
            boolean bl = this.PW = !this.PW;
        }
        if (qF == QF.y) {
            boolean bl = this.Pz = !this.Pz;
        }
        if (qF == QF.p) {
            boolean bl = this.PQ = !this.PQ;
        }
        if (qF == QF.T) {
            boolean bl = this.Pc = !this.Pc;
        }
        if (qF == QF.t) {
            boolean bl = this.Pu = !this.Pu;
        }
        if (qF == QF.w) {
            boolean bl = this.Pm = !this.Pm;
        }
        if (qF == QF.I) {
            boolean bl = this.PZ = !this.PZ;
        }
        if (qF == QF.f) {
            boolean bl = this.Pv = !this.Pv;
        }
        if (qF == QF.V) {
            boolean bl = this.PF = !this.PF;
        }
        if (qF == QF.R) {
            boolean bl = this.PL = !this.PL;
        }
        if (qF == QF.rB) {
            boolean bl = this.PA = !this.PA;
        }
        if (qF == QF.q) {
            boolean bl = this.PN = !this.PN;
        }
        if (qF == QF.k) {
            boolean bl = this.rA = !this.rA;
        }
        if (qF == QF.W) {
            boolean bl = this.rC = !this.rC;
        }
        if (qF == QF.z) {
            int n2 = 900;
            this.rL = Math.max(this.rL / n2 * n2, n2);
            this.rL *= 2;
            if (this.rL > 32 * n2) {
                this.rL = n2;
            }
        }
        if (qF == QF.Q) {
            ++this.rF;
            if (this.rF > 3) {
                this.rF = 1;
            }
            ((yX_2)this.j.id_class[8]).id_throws();
        }
        if (qF == QF.a) {
            ++this.ro;
            if (this.ro > 3) {
                this.ro = 1;
            }
            if (this.ro == 2) {
                ((yX_2)this.j.id_class[8]).id_throws();
            } else {
                this.j.x();
            }
        }
        if (qF == QF.Z) {
            boolean bl = this.rl = !this.rl;
        }
        if (qF == QF.v) {
            boolean bl = this.rH = !this.rH;
        }
        if (qF == QF.F) {
            boolean bl = this.ry = !this.ry;
        }
        if (qF == QF.L) {
            boolean bl = this.rp = !this.rp;
        }
        if (qF == QF.A) {
            ++this.rq;
            if (this.rq > 2) {
                this.rq = 0;
            }
        }
        if (qF == QF.n) {
            ++this.rT;
            if (this.rT > 5) {
                this.rT = 1;
            }
        }
        if (qF == QF.C) {
            boolean bl = this.rt = !this.rt;
        }
        if (qF == QF.l) {
            ++this.rw;
            if (this.rw > 2) {
                this.rw = 0;
            }
        }
        if (qF == QF.j) {
            boolean bl = this.rn = !this.rn;
        }
        if (qF == QF.g) {
            this.rI = !this.rI;
            ((yX_2)this.j.id_class[8]).id_throws();
        }
        if (qF == QF.Y) {
            this.rf = !this.rf;
            rrbN_2.id_break();
            ((yX_2)this.j.id_class[8]).id_throws();
        }
        if (qF == QF.o) {
            this.rj = !this.rj;
            rrME.id_break();
        }
        if (qF == QF.D) {
            this.rV = !this.rV;
            rrWv_1.id_class();
        }
        if (qF == QF.U) {
            this.rg = !this.rg;
            rrbN_2.id_class();
            ((yX_2)this.j.id_class[8]).id_throws();
        }
        if (qF == QF.i) {
            this.rK = !this.rK;
            this.j.x();
        }
        if (qF == QF.rM) {
            this.rR = !this.rR;
            rrbf_3.id_break();
        }
        if (qF == QF.e) {
            boolean bl = this.rY = !this.rY;
        }
        if (qF == QF.rS) {
            this.rD = !this.rD;
            rrMs_1.id_class();
            ((yX_2)this.j.id_class[8]).id_throws();
        }
        if (qF == QF.rs) {
            this.rU = !this.rU;
            this.j.x();
        }
        if (qF == QF.rO) {
            rfU_2.id_finally = this.re = !this.re;
        }
        if (qF == QF.rh) {
            boolean bl = this.ra = !this.ra;
        }
        if (qF == QF.rX) {
            this.ri = this.ri == 0 ? 1 : (this.ri == 1 ? 2 : (this.ri == 2 ? 0 : 0));
            ((yX_2)this.j.id_class[8]).id_throws();
        }
        if (qF == QF.rb) {
            boolean bl = this.rd = !this.rd;
        }
        if (qF == QF.rc) {
            this.rk = !this.rk;
            ((yX_2)this.j.id_class[8]).id_throws();
        }
        if (qF == QF.rm) {
            this.rW = !this.rW;
            ((yX_2)this.j.id_class[8]).id_throws();
        }
        if (qF == QF.rJ) {
            boolean bl = this.Pr = !this.Pr;
        }
        if (qF == QF.rd) {
            this.PP = !this.PP;
            ((yX_2)this.j.id_class[8]).id_throws();
        }
        if (qF == QF.rx) {
            this.PB = Qw_1.id_class(this.PB, Pa);
            rrbg_3.id_break((yX_2)this.j.id_class[8]);
        }
        if (qF == QF.rQ) {
            ++this.PG;
            if (this.PG > 4) {
                this.PG = 1;
            }
        }
        if (qF == QF.rk) {
            this.PS = !this.PS;
            this.j.x();
        }
        if (qF == QF.rN) {
            this.Ps = !this.Ps;
            rrbl_3.id_class();
        }
        if (qF == QF.ru) {
            boolean bl = this.PE = !this.PE;
        }
        if (qF == QF.rE) {
            boolean bl = this.id_else = !this.id_else;
        }
        if (qF == QF.rz) {
            boolean bl = this.id_int = !this.id_int;
        }
        if (qF == QF.rZ) {
            this.Pb = this.Pb == 0 ? 5 : (this.Pb == 5 ? 3 : 0);
        }
        if (qF == QF.rv) {
            this.PM = !this.PM;
        }
    }

    public float id_class(rqL_2 rqL_22) {
        return this.PK.getOrDefault((Object)rqL_22, Float.valueOf(rqL_22.id_break())).floatValue();
    }

    public float id_class(float f) {
        return this.B ? f : (float)this.id_volatile;
    }

    private static float id_class(String string) {
        if ("true".equals(string)) {
            return 1.0f;
        }
        return "false".equals(string) ? 0.0f : Float.parseFloat(string);
    }

    private rcd_3 id_class(rcd_3 rcd_32) {
        int n = 0;
        try {
            n = Integer.parseInt(rcd_32.id_native("version"));
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        return rco_3.id_class(this.j.id_protected(), rTv_1.OPTIONS, rcd_32, n);
    }

    public void id_class() {
        try {
            if (!this.PD.exists()) {
                return;
            }
            this.PK.clear();
            rcd_3 rcd_32 = new rcd_3();
            try (Object object = Files.newReader((File)this.PD, (Charset)Charsets.UTF_8);){
                ((BufferedReader)object).lines().forEach(string -> {
                    try {
                        Iterator iterator = PY.split((CharSequence)string).iterator();
                        rcd_32.id_class((String)iterator.next(), (String)iterator.next());
                    }
                    catch (Exception exception) {
                        PV.warn("Skipping bad option: {}", string);
                    }
                });
            }
            object = this.id_class(rcd_32);
            if (!((rcd_3)object).id_throws("graphicsMode") && ((rcd_3)object).id_throws("fancyGraphics")) {
                this.id_case = "true".equals(((rcd_3)object).id_native("fancyGraphics")) ? VW.FANCY : VW.FAST;
            }
            for (String string2 : ((rcd_3)object).id_protected()) {
                String string3;
                String string4 = string3 = ((rcd_3)object).id_native(string2);
                int n = string3.indexOf(43);
                boolean bl = false;
                if (n != -1) {
                    string3 = string3.substring(0, n);
                    string4 = string4.substring(n + 1);
                    bl = true;
                }
                try {
                    if ("autoJump".equals(string2)) {
                        QF.id_throw.id_class(this, string3);
                    }
                    if ("autoSuggestions".equals(string2)) {
                        QF.id_interface.id_class(this, string3);
                    }
                    if ("chatColors".equals(string2)) {
                        QF.id_abstract.id_class(this, string3);
                    }
                    if ("chatLinks".equals(string2)) {
                        QF.id_float.id_class(this, string3);
                    }
                    if ("chatLinksPrompt".equals(string2)) {
                        QF.id_void.id_class(this, string3);
                    }
                    if ("enableVsync".equals(string2)) {
                        QF.id_import.id_class(this, string3);
                        if (this.id_strictfp) {
                            this.id_protected = (int)QF.id_extends.id_case();
                        }
                        this.id_extends();
                    }
                    if ("entityShadows".equals(string2)) {
                        QF.id_short.id_class(this, string3);
                    }
                    if ("forceUnicodeFont".equals(string2)) {
                        QF.id_default.id_class(this, string3);
                    }
                    if ("discrete_mouse_scroll".equals(string2)) {
                        QF.id_static.id_class(this, string3);
                    }
                    if ("invertYMouse".equals(string2)) {
                        QF.id_const.id_class(this, string3);
                    }
                    if ("reducedDebugInfo".equals(string2)) {
                        QF.id_strictfp.id_class(this, string3);
                    }
                    if ("showSubtitles".equals(string2)) {
                        QF.id_boolean.id_class(this, string3);
                    }
                    if ("snooperEnabled".equals(string2)) {
                        QF.id_transient.id_class(this, string3);
                    }
                    if ("touchscreen".equals(string2)) {
                        QF.id_switch.id_class(this, string3);
                    }
                    if ("fullscreen".equals(string2)) {
                        QF.r.id_class(this, string3);
                    }
                    if ("bobViewEffect".equals(string2)) {
                        QF.P.id_class(this, Double.parseDouble(string3));
                    }
                    if ("toggleCrouch".equals(string2)) {
                        this.G = "true".equals(string3);
                    }
                    if ("toggleSprint".equals(string2)) {
                        this.b = "true".equals(string3);
                    }
                    if ("streamerMode".equals(string2)) {
                        this.O = "true".equals(string3);
                    }
                    if ("mouseSensitivity".equals(string2)) {
                        this.id_class = Qw_1.id_class(string3);
                    }
                    if ("fov".equals(string2)) {
                        this.U = Qw_1.id_class(string3) * 40.0f + 70.0f;
                    }
                    if ("fovEffectScale".equals(string2)) {
                        this.e = Qw_1.id_class(string3);
                    }
                    if ("gamma".equals(string2)) {
                        this.a = Qw_1.id_class(string3);
                    }
                    if ("autoBuyRefreshDelay".equals(string2)) {
                        this.rr = Qw_1.id_class(string3);
                    }
                    if ("autoBuyAntiDelay".equals(string2)) {
                        this.rB = Boolean.parseBoolean(string3);
                    }
                    if ("autoBuyParsedPriceDecreasePercentage".equals(string2)) {
                        this.rS = Qw_1.id_class(string3);
                    }
                    if ("renderDistance".equals(string2)) {
                        this.id_break = Integer.parseInt(string3);
                    }
                    if ("entityDistanceScaling".equals(string2)) {
                        this.id_byte = Float.parseFloat(string3);
                    }
                    if ("guiScale".equals(string2)) {
                        this.rs = Integer.parseInt(string3);
                    }
                    if ("particles".equals(string2)) {
                        this.rE = Vm_1.id_class(Integer.parseInt(string3));
                    }
                    if ("maxFps".equals(string2)) {
                        this.id_protected = Integer.parseInt(string3);
                        if (this.id_strictfp) {
                            this.id_protected = (int)QF.id_extends.id_case();
                        }
                        if (this.id_protected <= 0) {
                            this.id_protected = (int)QF.id_extends.id_case();
                        }
                        if (this.j.id_else() != null) {
                            this.j.id_else().id_class(this.id_protected);
                        }
                    }
                    if ("difficulty".equals(string2)) {
                        this.V = rRO.id_class(Integer.parseInt(string3));
                    }
                    if ("graphicsMode".equals(string2)) {
                        this.id_case = VW.id_class(Integer.parseInt(string3));
                        this.id_implements();
                    }
                    if ("ao".equals(string2)) {
                        this.id_catch = "true".equals(string3) ? Vh_1.MAX : ("false".equals(string3) ? Vh_1.OFF : Vh_1.id_class(Integer.parseInt(string3)));
                    }
                    if ("renderClouds".equals(string2)) {
                        if ("true".equals(string3)) {
                            this.id_throws = Vd_1.FANCY;
                        } else if ("false".equals(string3)) {
                            this.id_throws = Vd_1.OFF;
                        } else if ("fast".equals(string3)) {
                            this.id_throws = Vd_1.FAST;
                        }
                    }
                    if ("attackIndicator".equals(string2)) {
                        this.id_interface = VX.id_class(Integer.parseInt(string3));
                    }
                    if ("resourcePacks".equals(string2)) {
                        this.id_private = rpY_2.id_class(Pg, string3, PR);
                        if (this.id_private == null) {
                            this.id_private = Lists.newArrayList();
                        }
                    }
                    if ("incompatibleResourcePacks".equals(string2)) {
                        this.id_implements = rpY_2.id_class(Pg, string3, PR);
                        if (this.id_implements == null) {
                            this.id_implements = Lists.newArrayList();
                        }
                    }
                    if ("lastServer".equals(string2)) {
                        this.K = string3;
                    }
                    if ("lang".equals(string2)) {
                        this.rG = string3;
                    }
                    if ("chatVisibility".equals(string2)) {
                        this.id_finally = rhJ_2.id_class(Integer.parseInt(string3));
                    }
                    if ("chatOpacity".equals(string2)) {
                        this.id_extends = Qw_1.id_class(string3);
                    }
                    if ("chatLineSpacing".equals(string2)) {
                        this.id_native = Qw_1.id_class(string3);
                    }
                    if ("textBackgroundOpacity".equals(string2)) {
                        this.id_volatile = Qw_1.id_class(string3);
                    }
                    if ("backgroundForChatOnly".equals(string2)) {
                        this.B = "true".equals(string3);
                    }
                    if ("fullscreenResolution".equals(string2)) {
                        this.id_final = string3;
                    }
                    if ("hideServerAddress".equals(string2)) {
                        this.id_package = "true".equals(string3);
                    }
                    if ("advancedItemTooltips".equals(string2)) {
                        this.id_int = "true".equals(string3);
                    }
                    if ("pauseOnLostFocus".equals(string2)) {
                        this.id_new = "true".equals(string3);
                    }
                    if ("overrideHeight".equals(string2)) {
                        this.id_this = Integer.parseInt(string3);
                    }
                    if ("overrideWidth".equals(string2)) {
                        this.id_super = Integer.parseInt(string3);
                    }
                    if ("heldItemTooltips".equals(string2)) {
                        this.id_else = "true".equals(string3);
                    }
                    if ("removeChatSpam".equals(string2)) {
                        this.id_synchronized = "true".equals(string3);
                    }
                    if ("chatHeightFocused".equals(string2)) {
                        this.id_while = Qw_1.id_class(string3);
                    }
                    if ("chatDelay".equals(string2)) {
                        this.id_try = Qw_1.id_class(string3);
                    }
                    if ("chatHeightUnfocused".equals(string2)) {
                        this.id_goto = Qw_1.id_class(string3);
                    }
                    if ("chatScale".equals(string2)) {
                        this.id_return = Qw_1.id_class(string3);
                    }
                    if ("chatWidth".equals(string2)) {
                        this.id_public = Qw_1.id_class(string3);
                    }
                    if ("mipmapLevels".equals(string2)) {
                        this.id_instanceof = Integer.parseInt(string3);
                    }
                    if ("useNativeTransport".equals(string2)) {
                        this.id_throw = "true".equals(string3);
                    }
                    if ("mainHand".equals(string2)) {
                        rpZ_2 rpZ_22 = this.id_continue = "left".equals(string3) ? rpZ_2.LEFT : rpZ_2.RIGHT;
                    }
                    if ("biomeBlendRadius".equals(string2)) {
                        this.id_abstract = Integer.parseInt(string3);
                    }
                    if ("mouseWheelSensitivity".equals(string2)) {
                        this.id_long = Qw_1.id_class(string3);
                    }
                    if ("rawMouseInput".equals(string2)) {
                        this.id_float = "true".equals(string3);
                    }
                    if ("glDebugVerbosity".equals(string2)) {
                        this.id_void = Integer.parseInt(string3);
                    }
                    if ("hideMatchedNames".equals(string2)) {
                        this.M = "true".equals(string3);
                    }
                    if ("joinedFirstServer".equals(string2)) {
                        this.id_char = "true".equals(string3);
                    }
                    if ("syncChunkWrites".equals(string2)) {
                        this.rb = "true".equals(string3);
                    }
                    for (Vu_1 vu_1 : this.f) {
                        if (!string2.equals("key_" + vu_1.id_catch())) continue;
                        if (bl) {
                            ArrayList<Va_1> arrayList = new ArrayList<Va_1>();
                            for (String string5 : string4.split(":")) {
                                arrayList.add(Ve_1.id_class(string5));
                            }
                            vu_1.id_class(Ve_1.id_class(string3), arrayList);
                            continue;
                        }
                        vu_1.id_break(Ve_1.id_class(string3), true);
                    }
                    for (rqL_2 rqL_22 : rqL_2.values()) {
                        if (!string2.equals("soundCategory_" + rqL_22.id_class())) continue;
                        this.PK.put(rqL_22, Float.valueOf(Qw_1.id_class(string3)));
                    }
                    for (rhQ_2 rhQ_22 : rhQ_2.values()) {
                        if (!string2.equals("modelPart_" + rhQ_22.id_break())) continue;
                        this.id_class(rhQ_22, "true".equals(string3));
                    }
                }
                catch (Exception exception) {
                    PV.warn("Skipping bad option: {}:{}", (Object)string2, (Object)string3);
                    exception.printStackTrace();
                }
            }
            Vu_1.id_byte();
        }
        catch (Exception exception) {
            PV.error("Failed to load options", (Throwable)exception);
        }
        this.id_catch();
    }

    public void id_class(rhQ_2 rhQ_22, boolean bl) {
        if (bl) {
            this.Po.add(rhQ_22);
        } else {
            this.Po.remove((Object)rhQ_22);
        }
        this.id_byte();
    }

    public void id_class(rhQ_2 rhQ_22) {
        if (this.id_protected().contains((Object)rhQ_22)) {
            this.Po.remove((Object)rhQ_22);
        } else {
            this.Po.add(rhQ_22);
        }
        this.id_byte();
    }

    public void id_class(rqL_2 rqL_22, float f) {
        this.PK.put(rqL_22, Float.valueOf(f));
        this.j.c().id_class(rqL_22, f);
    }

    public void id_class(Vu_1 vu_1, Va_1 va_1, Collection<Va_1> collection) {
        vu_1.id_class(va_1, collection);
        this.id_break();
    }

    private static int id_break(int n, int[] nArray) {
        int n2 = Qw_1.id_byte(n, nArray);
        return n2 < 0 ? nArray[0] : n;
    }

    public int id_break(float f) {
        return (int)(this.id_class(f) * 255.0f) << 24 & 0xFF000000;
    }

    public rgP_2 id_break(QF qF) {
        String string = this.id_byte(qF);
        rgN_2 rgN_22 = new rgN_2(string);
        return rgN_22;
    }

    public void id_break() {
        if (!rrxr_3.id_finally.id_byte() || !rrxr_3.id_break(rrxr_3.id_finally, new Object[0])) {
            try (PrintWriter printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(this.PD), StandardCharsets.UTF_8));){
                printWriter.println("version:" + rqu_3.id_class().getWorldVersion());
                printWriter.println("streamerMode:" + this.O);
                printWriter.println("autoJump:" + QF.id_throw.id_break(this));
                printWriter.println("autoSuggestions:" + QF.id_interface.id_break(this));
                printWriter.println("chatColors:" + QF.id_abstract.id_break(this));
                printWriter.println("chatLinks:" + QF.id_float.id_break(this));
                printWriter.println("chatLinksPrompt:" + QF.id_void.id_break(this));
                printWriter.println("enableVsync:" + QF.id_import.id_break(this));
                printWriter.println("entityShadows:" + QF.id_short.id_break(this));
                printWriter.println("forceUnicodeFont:" + QF.id_default.id_break(this));
                printWriter.println("discrete_mouse_scroll:" + QF.id_static.id_break(this));
                printWriter.println("invertYMouse:" + QF.id_const.id_break(this));
                printWriter.println("reducedDebugInfo:" + QF.id_strictfp.id_break(this));
                printWriter.println("snooperEnabled:" + QF.id_transient.id_break(this));
                printWriter.println("showSubtitles:" + QF.id_boolean.id_break(this));
                printWriter.println("touchscreen:" + QF.id_switch.id_break(this));
                printWriter.println("fullscreen:" + QF.r.id_break(this));
                printWriter.println("bobViewEffect:" + QF.P.id_class(this));
                printWriter.println("toggleCrouch:" + this.G);
                printWriter.println("toggleSprint:" + this.b);
                printWriter.println("mouseSensitivity:" + this.id_class);
                printWriter.println("fov:" + (this.U - 70.0) / 40.0);
                printWriter.println("fovEffectScale:" + this.e);
                printWriter.println("gamma:" + this.a);
                printWriter.println("autoBuyRefreshDelay:" + this.rr);
                printWriter.println("autoBuyAntiDelay:" + this.rB);
                printWriter.println("autoBuyParsedPriceDecreasePercentage:" + this.rS);
                printWriter.println("renderDistance:" + this.id_break);
                printWriter.println("entityDistanceScaling:" + this.id_byte);
                printWriter.println("guiScale:" + this.rs);
                printWriter.println("particles:" + this.rE.id_break());
                printWriter.println("maxFps:" + this.id_protected);
                printWriter.println("difficulty:" + this.V.id_class());
                printWriter.println("graphicsMode:" + this.id_case.id_class());
                printWriter.println("ao:" + this.id_catch.id_class());
                printWriter.println("biomeBlendRadius:" + this.id_abstract);
                switch (this.id_throws) {
                    case FANCY: {
                        printWriter.println("renderClouds:true");
                        break;
                    }
                    case FAST: {
                        printWriter.println("renderClouds:fast");
                        break;
                    }
                    case OFF: {
                        printWriter.println("renderClouds:false");
                    }
                }
                printWriter.println("resourcePacks:" + Pg.toJson(this.id_private));
                printWriter.println("incompatibleResourcePacks:" + Pg.toJson(this.id_implements));
                printWriter.println("lastServer:" + this.K);
                printWriter.println("lang:" + this.rG);
                printWriter.println("chatVisibility:" + this.id_finally.id_class());
                printWriter.println("chatOpacity:" + this.id_extends);
                printWriter.println("chatLineSpacing:" + this.id_native);
                printWriter.println("textBackgroundOpacity:" + this.id_volatile);
                printWriter.println("backgroundForChatOnly:" + this.B);
                if (this.j.id_else().id_case().isPresent()) {
                    printWriter.println("fullscreenResolution:" + this.j.id_else().id_case().get().id_catch());
                }
                printWriter.println("hideServerAddress:" + this.id_package);
                printWriter.println("advancedItemTooltips:" + this.id_int);
                printWriter.println("pauseOnLostFocus:" + this.id_new);
                printWriter.println("overrideWidth:" + this.id_super);
                printWriter.println("overrideHeight:" + this.id_this);
                printWriter.println("heldItemTooltips:" + this.id_else);
                printWriter.println("removeChatSpam:" + this.id_synchronized);
                printWriter.println("chatHeightFocused:" + this.id_while);
                printWriter.println("chatDelay: " + this.id_try);
                printWriter.println("chatHeightUnfocused:" + this.id_goto);
                printWriter.println("chatScale:" + this.id_return);
                printWriter.println("chatWidth:" + (float)this.id_public);
                printWriter.println("mipmapLevels:" + this.id_instanceof);
                printWriter.println("useNativeTransport:" + this.id_throw);
                printWriter.println("mainHand:" + (this.id_continue == rpZ_2.LEFT ? "left" : "right"));
                printWriter.println("attackIndicator:" + this.id_interface.id_class());
                printWriter.println("mouseWheelSensitivity:" + this.id_long);
                printWriter.println("rawMouseInput:" + QF.id_package.id_break(this));
                printWriter.println("glDebugVerbosity:" + this.id_void);
                printWriter.println("hideMatchedNames:" + this.M);
                printWriter.println("joinedFirstServer:" + this.id_char);
                printWriter.println("syncChunkWrites:" + this.rb);
                for (Vu_1 vu_1 : this.f) {
                    String string = "key_" + vu_1.id_catch() + ":" + vu_1.id_final();
                    if (!vu_1.id_implements().isEmpty()) {
                        string = string + "+" + vu_1.id_package();
                    }
                    printWriter.println(string);
                }
                for (rqL_2 rqL_22 : rqL_2.values()) {
                    printWriter.println("soundCategory_" + rqL_22.id_class() + ":" + this.id_class(rqL_22));
                }
                for (rhQ_2 rhQ_22 : rhQ_2.values()) {
                    printWriter.println("modelPart_" + rhQ_22.id_break() + ":" + this.Po.contains((Object)rhQ_22));
                }
            }
            catch (Exception exception) {
                PV.error("Failed to save options", (Throwable)exception);
            }
            this.id_private();
            this.id_byte();
        }
    }

    public boolean id_break(rhQ_2 rhQ_22) {
        return this.id_protected().contains((Object)rhQ_22);
    }

    public Vd_1 id_throws() {
        return this.id_break >= 4 ? this.id_throws : Vd_1.OFF;
    }

    public void id_finally() {
        this.id_break = 8;
        this.id_byte = 1.0f;
        this.E = 0.3f;
        this.id_protected = (int)QF.id_extends.id_case();
        this.id_strictfp = false;
        this.id_extends();
        this.id_instanceof = 4;
        this.id_case = VW.FANCY;
        this.id_catch = Vh_1.MAX;
        this.id_throws = Vd_1.FANCY;
        this.U = 70.0;
        this.a = 0.0;
        this.rs = 2;
        this.rE = Vm_1.ALL;
        this.id_else = false;
        this.id_transient = false;
        this.rM = 1;
        this.rO = 0.8f;
        this.rh = 0;
        this.rX = false;
        this.rW = false;
        this.rJ = false;
        rrbb_3.rb();
        this.rx = rrbb_3.rM();
        this.rd = false;
        this.rk = false;
        this.re = false;
        this.ra = false;
        this.ri = 0;
        this.Pr = true;
        this.PP = true;
        this.PB = 3;
        this.PG = 1;
        this.PS = true;
        this.Ps = true;
        this.PE = true;
        this.Pb = 0;
        this.PM = true;
        this.rz = 1.0;
        this.rQ = 0;
        this.rN = 1;
        this.rc = 0;
        this.ru = 0.0;
        this.rm = 0;
        this.rZ = 0;
        this.rF = 3;
        this.rL = 4000;
        this.rA = false;
        this.rC = false;
        this.rn = false;
        this.rl = true;
        this.rH = true;
        this.ry = true;
        this.rp = true;
        this.rq = 0;
        this.rT = 1;
        this.rt = false;
        this.rw = 0;
        this.rI = false;
        this.rf = true;
        this.rj = true;
        this.id_abstract = 2;
        this.rV = true;
        this.rg = true;
        this.rK = true;
        this.rR = true;
        this.rY = true;
        this.ro = 2;
        this.rD = false;
        this.rU = true;
        this.PO = 0;
        this.Ph = 0;
        this.PX = true;
        this.PJ = true;
        this.Px = true;
        this.Pd = true;
        this.Pk = true;
        this.PW = true;
        this.Pz = true;
        this.PQ = true;
        this.PN = true;
        this.Pc = true;
        this.Pu = true;
        this.Pm = true;
        this.PF = true;
        this.PZ = true;
        this.Pv = true;
        this.PL = true;
        this.PA = true;
        this.O = false;
        rrdZ.id_class("OFF");
        rrdZ.So = 0;
        rrdZ.id_while();
        rrdZ.id_break();
        this.j.x();
        this.id_break();
    }

    public void id_catch() {
        try {
            File file = this.Br;
            if (!file.exists()) {
                file = this.PD;
            }
            if (!file.exists()) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)new FileInputStream(file), StandardCharsets.UTF_8));
            String string = "";
            while ((string = bufferedReader.readLine()) != null) {
                try {
                    String[] stringArray = string.split(":");
                    if (stringArray[0].equals("ofRenderDistanceChunks") && stringArray.length >= 2) {
                        this.id_break = Integer.valueOf(stringArray[1]);
                        this.id_break = rrbb_3.id_class(this.id_break, 2, 1024);
                    }
                    if (stringArray[0].equals("ofFogType") && stringArray.length >= 2) {
                        this.rM = Integer.valueOf(stringArray[1]);
                        this.rM = rrbb_3.id_class(this.rM, 1, 3);
                    }
                    if (stringArray[0].equals("ofFogStart") && stringArray.length >= 2) {
                        this.rO = Float.valueOf(stringArray[1]).floatValue();
                        if (this.rO < 0.2f) {
                            this.rO = 0.2f;
                        }
                        if (this.rO > 0.81f) {
                            this.rO = 0.8f;
                        }
                    }
                    if (stringArray[0].equals("ofMipmapType") && stringArray.length >= 2) {
                        this.rh = Integer.valueOf(stringArray[1]);
                        this.rh = rrbb_3.id_class(this.rh, 0, 3);
                    }
                    if (stringArray[0].equals("ofOcclusionFancy") && stringArray.length >= 2) {
                        this.rX = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofSmoothFps") && stringArray.length >= 2) {
                        this.rJ = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofSmoothWorld") && stringArray.length >= 2) {
                        this.rx = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofAoLevel") && stringArray.length >= 2) {
                        this.rz = Float.valueOf(stringArray[1]).floatValue();
                        this.rz = rrbb_3.id_class(this.rz, 0.0, 1.0);
                    }
                    if (stringArray[0].equals("ofClouds") && stringArray.length >= 2) {
                        this.rc = Integer.valueOf(stringArray[1]);
                        this.rc = rrbb_3.id_class(this.rc, 0, 3);
                        this.id_implements();
                    }
                    if (stringArray[0].equals("ofCloudsHeight") && stringArray.length >= 2) {
                        this.ru = Float.valueOf(stringArray[1]).floatValue();
                        this.ru = rrbb_3.id_class(this.ru, 0.0, 1.0);
                    }
                    if (stringArray[0].equals("ofTrees") && stringArray.length >= 2) {
                        this.rm = Integer.valueOf(stringArray[1]);
                        this.rm = Qw_1.id_break(this.rm, Pe);
                    }
                    if (stringArray[0].equals("ofDroppedItems") && stringArray.length >= 2) {
                        this.rv = Integer.valueOf(stringArray[1]);
                        this.rv = rrbb_3.id_class(this.rv, 0, 2);
                    }
                    if (stringArray[0].equals("ofRain") && stringArray.length >= 2) {
                        this.rZ = Integer.valueOf(stringArray[1]);
                        this.rZ = rrbb_3.id_class(this.rZ, 0, 3);
                    }
                    if (stringArray[0].equals("ofAnimatedWater") && stringArray.length >= 2) {
                        this.PO = Integer.valueOf(stringArray[1]);
                        this.PO = rrbb_3.id_class(this.PO, 0, 2);
                    }
                    if (stringArray[0].equals("ofAnimatedLava") && stringArray.length >= 2) {
                        this.Ph = Integer.valueOf(stringArray[1]);
                        this.Ph = rrbb_3.id_class(this.Ph, 0, 2);
                    }
                    if (stringArray[0].equals("ofAnimatedFire") && stringArray.length >= 2) {
                        this.PX = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofAnimatedPortal") && stringArray.length >= 2) {
                        this.PJ = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofAnimatedRedstone") && stringArray.length >= 2) {
                        this.Px = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofAnimatedExplosion") && stringArray.length >= 2) {
                        this.Pd = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofAnimatedFlame") && stringArray.length >= 2) {
                        this.Pk = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofAnimatedSmoke") && stringArray.length >= 2) {
                        this.PW = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofVoidParticles") && stringArray.length >= 2) {
                        this.Pz = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofWaterParticles") && stringArray.length >= 2) {
                        this.PQ = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofPortalParticles") && stringArray.length >= 2) {
                        this.Pc = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofPotionParticles") && stringArray.length >= 2) {
                        this.Pu = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofFireworkParticles") && stringArray.length >= 2) {
                        this.Pm = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofBlockParticles") && stringArray.length >= 2) {
                        this.PZ = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofBubbleColumnParticles") && stringArray.length >= 2) {
                        this.Pv = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofDrippingWaterLava") && stringArray.length >= 2) {
                        this.PF = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofAnimatedTerrain") && stringArray.length >= 2) {
                        this.PL = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofAnimatedTextures") && stringArray.length >= 2) {
                        this.PA = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofRainSplash") && stringArray.length >= 2) {
                        this.PN = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofLagometer") && stringArray.length >= 2) {
                        this.rA = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofShowFps") && stringArray.length >= 2) {
                        this.rC = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofAutoSaveTicks") && stringArray.length >= 2) {
                        this.rL = Integer.valueOf(stringArray[1]);
                        this.rL = rrbb_3.id_class(this.rL, 40, 40000);
                    }
                    if (stringArray[0].equals("ofBetterGrass") && stringArray.length >= 2) {
                        this.rF = Integer.valueOf(stringArray[1]);
                        this.rF = rrbb_3.id_class(this.rF, 1, 3);
                    }
                    if (stringArray[0].equals("ofConnectedTextures") && stringArray.length >= 2) {
                        this.ro = Integer.valueOf(stringArray[1]);
                        this.ro = rrbb_3.id_class(this.ro, 1, 3);
                    }
                    if (stringArray[0].equals("ofWeather") && stringArray.length >= 2) {
                        this.rl = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofSky") && stringArray.length >= 2) {
                        this.rH = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofStars") && stringArray.length >= 2) {
                        this.ry = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofSunMoon") && stringArray.length >= 2) {
                        this.rp = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofVignette") && stringArray.length >= 2) {
                        this.rq = Integer.valueOf(stringArray[1]);
                        this.rq = rrbb_3.id_class(this.rq, 0, 2);
                    }
                    if (stringArray[0].equals("ofChunkUpdates") && stringArray.length >= 2) {
                        this.rT = Integer.valueOf(stringArray[1]);
                        this.rT = rrbb_3.id_class(this.rT, 1, 5);
                    }
                    if (stringArray[0].equals("ofChunkUpdatesDynamic") && stringArray.length >= 2) {
                        this.rt = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofTime") && stringArray.length >= 2) {
                        this.rw = Integer.valueOf(stringArray[1]);
                        this.rw = rrbb_3.id_class(this.rw, 0, 2);
                    }
                    if (stringArray[0].equals("ofAaLevel") && stringArray.length >= 2) {
                        this.rQ = Integer.valueOf(stringArray[1]);
                        this.rQ = rrbb_3.id_class(this.rQ, 0, 16);
                    }
                    if (stringArray[0].equals("ofAfLevel") && stringArray.length >= 2) {
                        this.rN = Integer.valueOf(stringArray[1]);
                        this.rN = rrbb_3.id_class(this.rN, 1, 16);
                    }
                    if (stringArray[0].equals("ofProfiler") && stringArray.length >= 2) {
                        this.rn = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofBetterSnow") && stringArray.length >= 2) {
                        this.rI = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofSwampColors") && stringArray.length >= 2) {
                        this.rf = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofRandomEntities") && stringArray.length >= 2) {
                        this.rj = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofCustomFonts") && stringArray.length >= 2) {
                        this.rV = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofCustomColors") && stringArray.length >= 2) {
                        this.rg = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofCustomItems") && stringArray.length >= 2) {
                        this.rK = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofCustomSky") && stringArray.length >= 2) {
                        this.rR = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofShowCapes") && stringArray.length >= 2) {
                        this.rY = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofNaturalTextures") && stringArray.length >= 2) {
                        this.rD = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofEmissiveTextures") && stringArray.length >= 2) {
                        this.rU = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofLazyChunkLoading") && stringArray.length >= 2) {
                        this.rd = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofRenderRegions") && stringArray.length >= 2) {
                        this.rk = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofSmartAnimations") && stringArray.length >= 2) {
                        this.rW = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofDynamicFov") && stringArray.length >= 2) {
                        this.Pr = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofAlternateBlocks") && stringArray.length >= 2) {
                        this.PP = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofDynamicLights") && stringArray.length >= 2) {
                        this.PB = Integer.valueOf(stringArray[1]);
                        this.PB = Qw_1.id_break(this.PB, Pa);
                    }
                    if (stringArray[0].equals("ofScreenshotSize") && stringArray.length >= 2) {
                        this.PG = Integer.valueOf(stringArray[1]);
                        this.PG = rrbb_3.id_class(this.PG, 1, 4);
                    }
                    if (stringArray[0].equals("ofCustomEntityModels") && stringArray.length >= 2) {
                        this.PS = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofCustomGuis") && stringArray.length >= 2) {
                        this.Ps = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofShowGlErrors") && stringArray.length >= 2) {
                        this.PE = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofFastMath") && stringArray.length >= 2) {
                        rfU_2.id_finally = this.re = Boolean.valueOf(stringArray[1]).booleanValue();
                    }
                    if (stringArray[0].equals("ofFastRender") && stringArray.length >= 2) {
                        this.ra = Boolean.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofTranslucentBlocks") && stringArray.length >= 2) {
                        this.ri = Integer.valueOf(stringArray[1]);
                        this.ri = rrbb_3.id_class(this.ri, 0, 2);
                    }
                    if (stringArray[0].equals("ofChatBackground") && stringArray.length >= 2) {
                        this.Pb = Integer.valueOf(stringArray[1]);
                    }
                    if (stringArray[0].equals("ofChatShadow") && stringArray.length >= 2) {
                        this.PM = Boolean.valueOf(stringArray[1]);
                    }
                    if (!stringArray[0].equals("key_" + this.Pf.id_catch())) continue;
                    this.Pf.id_break(Ve_1.id_class(stringArray[1]), false);
                }
                catch (Exception exception) {
                    rrbb_3.id_byte("Skipping bad option: " + string);
                    exception.printStackTrace();
                }
            }
            rrWj_1.id_class(this.f, new Vu_1[]{this.Pf});
            Vu_1.id_byte();
            bufferedReader.close();
        }
        catch (Exception exception) {
            rrbb_3.id_protected("Failed to load options");
            exception.printStackTrace();
        }
    }

    public void id_extends() {
        if (this.j.id_else() != null) {
            this.j.id_else().id_class(this.id_strictfp);
        }
    }

    public boolean id_case() {
        return this.id_throw;
    }

    public void id_implements() {
        VC vC;
        yX_2 yX_22;
        switch (this.rc) {
            case 1: {
                this.id_throws = Vd_1.FAST;
                break;
            }
            case 2: {
                this.id_throws = Vd_1.FANCY;
                break;
            }
            case 3: {
                this.id_throws = Vd_1.OFF;
                break;
            }
            default: {
                this.id_throws = this.id_case != VW.FAST ? Vd_1.FANCY : Vd_1.FAST;
            }
        }
        if (this.id_case == VW.FABULOUS && (yX_22 = (yX_2)QY.id_instanceof().id_class[8]) != null && (vC = yX_22.id_void()) != null) {
            vC.id_break((Boolean)QY.id_break[2]);
        }
    }

    private void id_package() {
        if (rrxr_3.BB.id_protected() && rrxr_3.PL.id_byte()) {
            Object object = rrxr_3.id_class(rrxr_3.BB);
            rrxr_3.id_private(this.h, rrxr_3.PL, object);
            rrxr_3.id_private(this.X, rrxr_3.PL, object);
            rrxr_3.id_private(this.J, rrxr_3.PL, object);
            rrxr_3.id_private(this.x, rrxr_3.PL, object);
            rrxr_3.id_private(this.d, rrxr_3.PL, object);
            rrxr_3.id_private(this.k, rrxr_3.PL, object);
            rrxr_3.id_private(this.W, rrxr_3.PL, object);
            rrxr_3.id_private(this.m, rrxr_3.PL, object);
            rrxr_3.id_private(this.v, rrxr_3.PL, object);
            rrxr_3.id_private(this.F, rrxr_3.PL, object);
            rrxr_3.id_private(this.L, rrxr_3.PL, object);
            rrxr_3.id_private(this.C, rrxr_3.PL, object);
            rrxr_3.id_private(this.H, rrxr_3.PL, object);
        }
    }

    public Set<rhQ_2> id_protected() {
        return ImmutableSet.copyOf(this.Po);
    }

    public void id_private() {
        try {
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(this.Br), StandardCharsets.UTF_8));
            printWriter.println("ofFogType:" + this.rM);
            printWriter.println("ofFogStart:" + this.rO);
            printWriter.println("ofMipmapType:" + this.rh);
            printWriter.println("ofOcclusionFancy:" + this.rX);
            printWriter.println("ofSmoothFps:" + this.rJ);
            printWriter.println("ofSmoothWorld:" + this.rx);
            printWriter.println("ofAoLevel:" + this.rz);
            printWriter.println("ofClouds:" + this.rc);
            printWriter.println("ofCloudsHeight:" + this.ru);
            printWriter.println("ofTrees:" + this.rm);
            printWriter.println("ofDroppedItems:" + this.rv);
            printWriter.println("ofRain:" + this.rZ);
            printWriter.println("ofAnimatedWater:" + this.PO);
            printWriter.println("ofAnimatedLava:" + this.Ph);
            printWriter.println("ofAnimatedFire:" + this.PX);
            printWriter.println("ofAnimatedPortal:" + this.PJ);
            printWriter.println("ofAnimatedRedstone:" + this.Px);
            printWriter.println("ofAnimatedExplosion:" + this.Pd);
            printWriter.println("ofAnimatedFlame:" + this.Pk);
            printWriter.println("ofAnimatedSmoke:" + this.PW);
            printWriter.println("ofVoidParticles:" + this.Pz);
            printWriter.println("ofWaterParticles:" + this.PQ);
            printWriter.println("ofPortalParticles:" + this.Pc);
            printWriter.println("ofPotionParticles:" + this.Pu);
            printWriter.println("ofFireworkParticles:" + this.Pm);
            printWriter.println("ofBlockParticles:" + this.PZ);
            printWriter.println("ofBubbleColumnParticles:" + this.Pv);
            printWriter.println("ofDrippingWaterLava:" + this.PF);
            printWriter.println("ofAnimatedTerrain:" + this.PL);
            printWriter.println("ofAnimatedTextures:" + this.PA);
            printWriter.println("ofRainSplash:" + this.PN);
            printWriter.println("ofLagometer:" + this.rA);
            printWriter.println("ofShowFps:" + this.rC);
            printWriter.println("ofAutoSaveTicks:" + this.rL);
            printWriter.println("ofBetterGrass:" + this.rF);
            printWriter.println("ofConnectedTextures:" + this.ro);
            printWriter.println("ofWeather:" + this.rl);
            printWriter.println("ofSky:" + this.rH);
            printWriter.println("ofStars:" + this.ry);
            printWriter.println("ofSunMoon:" + this.rp);
            printWriter.println("ofVignette:" + this.rq);
            printWriter.println("ofChunkUpdates:" + this.rT);
            printWriter.println("ofChunkUpdatesDynamic:" + this.rt);
            printWriter.println("ofTime:" + this.rw);
            printWriter.println("ofAaLevel:" + this.rQ);
            printWriter.println("ofAfLevel:" + this.rN);
            printWriter.println("ofProfiler:" + this.rn);
            printWriter.println("ofBetterSnow:" + this.rI);
            printWriter.println("ofSwampColors:" + this.rf);
            printWriter.println("ofRandomEntities:" + this.rj);
            printWriter.println("ofCustomFonts:" + this.rV);
            printWriter.println("ofCustomColors:" + this.rg);
            printWriter.println("ofCustomItems:" + this.rK);
            printWriter.println("ofCustomSky:" + this.rR);
            printWriter.println("ofShowCapes:" + this.rY);
            printWriter.println("ofNaturalTextures:" + this.rD);
            printWriter.println("ofEmissiveTextures:" + this.rU);
            printWriter.println("ofLazyChunkLoading:" + this.rd);
            printWriter.println("ofRenderRegions:" + this.rk);
            printWriter.println("ofSmartAnimations:" + this.rW);
            printWriter.println("ofDynamicFov:" + this.Pr);
            printWriter.println("ofAlternateBlocks:" + this.PP);
            printWriter.println("ofDynamicLights:" + this.PB);
            printWriter.println("ofScreenshotSize:" + this.PG);
            printWriter.println("ofCustomEntityModels:" + this.PS);
            printWriter.println("ofCustomGuis:" + this.Ps);
            printWriter.println("ofShowGlErrors:" + this.PE);
            printWriter.println("ofFastMath:" + this.re);
            printWriter.println("ofFastRender:" + this.ra);
            printWriter.println("ofTranslucentBlocks:" + this.ri);
            printWriter.println("ofChatBackground:" + this.Pb);
            printWriter.println("ofChatShadow:" + this.PM);
            printWriter.println("key_" + this.Pf.id_catch() + ":" + this.Pf.id_final());
            printWriter.close();
        }
        catch (Exception exception) {
            rrbb_3.id_protected("Failed to save options");
            exception.printStackTrace();
        }
    }

    public void id_final() {
        this.O = !this.O;
    }

    public VZ id_volatile() {
        return this.PU;
    }

    public void id_native() {
        this.j.id_break(this.id_instanceof);
        this.j.x();
    }
}

