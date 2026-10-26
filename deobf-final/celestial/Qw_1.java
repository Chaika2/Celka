package celestial;

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
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
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
   private static final Splitter PY = Splitter.on(':').limit(2);
   public double class_ = 0.5;
   public int break_ = -1;
   public float byte_ = 1.0F;
   public int protected_ = 120;
   public Vd_1 throws_ = Vd_1.FANCY;
   public VW case_ = VW.FANCY;
   public Vh_1 catch_ = Vh_1.MAX;
   public List<String> private_ = Lists.newArrayList();
   public List<String> implements_ = Lists.newArrayList();
   public rhJ_2 finally_ = rhJ_2.FULL;
   public double extends_ = 1.0;
   public double native_ = 0.0;
   public double volatile_ = 0.5;
   public String final_;
   public boolean package_;
   public boolean int_;
   public boolean new_ = true;
   private final Set<rhQ_2> Po = Sets.newHashSet(rhQ_2.values());
   public rpZ_2 continue_ = rpZ_2.RIGHT;
   public int super_;
   public int this_;
   public boolean else_ = false;
   public boolean synchronized_ = true;
   public double return_ = 1.0;
   public double public_ = 1.0;
   public double goto_ = 0.44366196F;
   public double while_ = 1.0;
   public double try_ = 0.0;
   public int instanceof_ = 4;
   private final Map<rqL_2, Float> PK = Maps.newEnumMap(rqL_2.class);
   public boolean throw_ = true;
   public VX interface_ = VX.CROSSHAIR;
   public boolean char_ = false;
   public int abstract_ = 2;
   public double long_ = 1.0;
   public boolean float_ = true;
   public int void_ = 1;
   public boolean static_ = false;
   public boolean import_ = true;
   public boolean short_ = true;
   public boolean default_ = true;
   public boolean const_ = true;
   public boolean strictfp_ = true;
   public boolean boolean_ = true;
   public boolean transient_;
   public boolean for_;
   public boolean double_;
   public boolean switch_;
   public boolean r = true;
   public boolean P;
   public boolean B = true;
   public boolean S;
   public boolean s;
   public double E = 0.3F;
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
   public final Vu_1 c = new Vu_1("key.dropItemsWithSameType", 90, "key.categories.inventory", Arrays.asList(Vi_1.MOUSE.class_(2)));
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
   public final Vu_1 H = new Vu_1("key.smoothCamera", Ve_1.class_.break_(), "key.categories.misc");
   public final Vu_1 y = new Vu_1("key.fullscreen", 300, "key.categories.misc");
   public final Vu_1 p = new Vu_1("key.spectatorOutlines", Ve_1.class_.break_(), "key.categories.misc");
   public final Vu_1 q = new Vu_1("key.advancements", 76, "key.categories.misc");
   public final Vu_1 T = new Vu_1("key.openitemsmenu", 293, "key.categories.misc");
   public final Vu_1[] t = new Vu_1[]{
      new Vu_1("key.hotbar.1", 49, "key.categories.inventory"),
      new Vu_1("key.hotbar.2", 50, "key.categories.inventory"),
      new Vu_1("key.hotbar.3", 51, "key.categories.inventory"),
      new Vu_1("key.hotbar.4", 52, "key.categories.inventory"),
      new Vu_1("key.hotbar.5", 53, "key.categories.inventory"),
      new Vu_1("key.hotbar.6", 54, "key.categories.inventory"),
      new Vu_1("key.hotbar.7", 55, "key.categories.inventory"),
      new Vu_1("key.hotbar.8", 56, "key.categories.inventory"),
      new Vu_1("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final Vu_1 w = new Vu_1("key.saveToolbarActivator", 67, "key.categories.creative");
   public final Vu_1 I = new Vu_1("key.loadToolbarActivator", 88, "key.categories.creative");
   public Vu_1[] f = (Vu_1[])ArrayUtils.addAll(
      new Vu_1[]{
         this.m,
         this.u,
         this.h,
         this.X,
         this.J,
         this.x,
         this.d,
         this.k,
         this.W,
         this.c,
         this.N,
         this.z,
         this.v,
         this.F,
         this.Z,
         this.L,
         this.A,
         this.n,
         this.l,
         this.C,
         this.H,
         this.y,
         this.T,
         this.p,
         this.Q,
         this.w,
         this.I,
         this.q
      },
      this.t
   );
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
   public float e = 1.0F;
   public double a = 1.0;
   public rrcB_2 i = (rrcB_2)rrcB_2.staticFields98d16a36ad1c33518cd334d8bca22c4a[0];
   public double rr = 0.0;
   public boolean rP;
   public boolean rB = true;
   public double rS = 40.0;
   public int rs = 2;
   public Vm_1 rE = Vm_1.ALL;
   public String rG = "en_us";
   public boolean rb;
   public int rM = 1;
   public float rO = 0.8F;
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

   public void byte_() {
      if ((cb_3)this.j.class_[57] != null) {
         int var1 = 0;

         for (rhQ_2 var3 : this.Po) {
            var1 |= var3.class_();
         }

         ((Aq_1)((cb_3)this.j.class_[57]).break_[0]).class_(new rmw_3(this.rG, this.break_, this.finally_, this.short_, var1, this.continue_));
      }
   }

   private static int byte_(int var0, int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2] == var0) {
            return var2;
         }
      }

      return -1;
   }

   public String byte_(QF var1) {
      String var2 = jI_2.class_(var1.byte_()) + ": ";
      if (var2 == null) {
         var2 = var1.byte_();
      }

      if (var1 == QF.int_) {
         int var11 = (int)QF.int_.class_(this);
         String var12 = jI_2.class_("of.options.renderDistance.tiny");
         byte var5 = 2;
         if (var11 >= 4) {
            var12 = jI_2.class_("of.options.renderDistance.short");
            var5 = 4;
         }

         if (var11 >= 8) {
            var12 = jI_2.class_("of.options.renderDistance.normal");
            var5 = 8;
         }

         if (var11 >= 16) {
            var12 = jI_2.class_("of.options.renderDistance.far");
            var5 = 16;
         }

         if (var11 >= 32) {
            var12 = rrba_3.class_("of.options.renderDistance.extreme");
            var5 = 32;
         }

         if (var11 >= 48) {
            var12 = rrba_3.class_("of.options.renderDistance.insane");
            var5 = 48;
         }

         if (var11 >= 64) {
            var12 = rrba_3.class_("of.options.renderDistance.ludicrous");
            var5 = 64;
         }

         int var6 = this.break_ - var5;
         String var7 = var12;
         if (var6 > 0) {
            var7 = var12 + "+";
         }

         return var2 + var11 + " " + var7;
      } else if (var1 == QF.B) {
         switch (this.rM) {
            case 1:
               return var2 + rrba_3.protected_();
            case 2:
               return var2 + rrba_3.throws_();
            case 3:
               return var2 + rrba_3.byte_();
            default:
               return var2 + rrba_3.byte_();
         }
      } else if (var1 == QF.S) {
         return var2 + this.rO;
      } else if (var1 == QF.s) {
         return rrMu_1.break_(var1, (double)this.rh);
      } else if (var1 == QF.E) {
         return this.rJ ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.H) {
         return this.rx ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.G) {
         switch (this.rc) {
            case 1:
               return var2 + rrba_3.protected_();
            case 2:
               return var2 + rrba_3.throws_();
            case 3:
               return var2 + rrba_3.byte_();
            default:
               return var2 + rrba_3.case_();
         }
      } else if (var1 == QF.M) {
         switch (this.rm) {
            case 1:
               return var2 + rrba_3.protected_();
            case 2:
               return var2 + rrba_3.throws_();
            case 3:
            default:
               return var2 + rrba_3.case_();
            case 4:
               return var2 + rrba_3.class_("of.general.smart");
         }
      } else if (var1 == QF.rG) {
         switch (this.rv) {
            case 1:
               return var2 + rrba_3.protected_();
            case 2:
               return var2 + rrba_3.throws_();
            default:
               return var2 + rrba_3.case_();
         }
      } else if (var1 == QF.O) {
         switch (this.rZ) {
            case 1:
               return var2 + rrba_3.protected_();
            case 2:
               return var2 + rrba_3.throws_();
            case 3:
               return var2 + rrba_3.byte_();
            default:
               return var2 + rrba_3.case_();
         }
      } else if (var1 == QF.h) {
         switch (this.PO) {
            case 1:
               return var2 + rrba_3.class_("of.options.animation.dynamic");
            case 2:
               return var2 + rrba_3.byte_();
            default:
               return var2 + rrba_3.break_();
         }
      } else if (var1 == QF.X) {
         switch (this.Ph) {
            case 1:
               return var2 + rrba_3.class_("of.options.animation.dynamic");
            case 2:
               return var2 + rrba_3.byte_();
            default:
               return var2 + rrba_3.break_();
         }
      } else if (var1 == QF.J) {
         return this.PX ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.x) {
         return this.PJ ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.N) {
         return this.Px ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.c) {
         return this.Pd ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.u) {
         return this.Pk ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.m) {
         return this.PW ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.y) {
         return this.Pz ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.p) {
         return this.PQ ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.T) {
         return this.Pc ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.t) {
         return this.Pu ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.w) {
         return this.Pm ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.I) {
         return this.PZ ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.f) {
         return this.Pv ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.V) {
         return this.PF ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.R) {
         return this.PL ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rB) {
         return this.PA ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.q) {
         return this.PN ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.k) {
         return this.rA ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.W) {
         return this.rC ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.z) {
         short var10 = 900;
         if (this.rL <= var10) {
            return var2 + rrba_3.class_("of.options.save.45s");
         } else if (this.rL <= 2 * var10) {
            return var2 + rrba_3.class_("of.options.save.90s");
         } else if (this.rL <= 4 * var10) {
            return var2 + rrba_3.class_("of.options.save.3min");
         } else if (this.rL <= 8 * var10) {
            return var2 + rrba_3.class_("of.options.save.6min");
         } else {
            return this.rL <= 16 * var10 ? var2 + rrba_3.class_("of.options.save.12min") : var2 + rrba_3.class_("of.options.save.24min");
         }
      } else if (var1 == QF.Q) {
         switch (this.rF) {
            case 1:
               return var2 + rrba_3.protected_();
            case 2:
               return var2 + rrba_3.throws_();
            default:
               return var2 + rrba_3.byte_();
         }
      } else if (var1 == QF.a) {
         switch (this.ro) {
            case 1:
               return var2 + rrba_3.protected_();
            case 2:
               return var2 + rrba_3.throws_();
            default:
               return var2 + rrba_3.byte_();
         }
      } else if (var1 == QF.Z) {
         return this.rl ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.v) {
         return this.rH ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.F) {
         return this.ry ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.L) {
         return this.rp ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.A) {
         switch (this.rq) {
            case 1:
               return var2 + rrba_3.protected_();
            case 2:
               return var2 + rrba_3.throws_();
            default:
               return var2 + rrba_3.case_();
         }
      } else if (var1 == QF.n) {
         return var2 + this.rT;
      } else if (var1 == QF.C) {
         return this.rt ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.l) {
         if (this.rw == 1) {
            return var2 + rrba_3.class_("of.options.time.dayOnly");
         } else {
            return this.rw == 2 ? var2 + rrba_3.class_("of.options.time.nightOnly") : var2 + rrba_3.case_();
         }
      } else if (var1 == QF.rr) {
         return rrMu_1.break_(var1, (double)this.rQ);
      } else if (var1 == QF.rP) {
         return rrMu_1.break_(var1, (double)this.rN);
      } else if (var1 == QF.j) {
         return this.rn ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.g) {
         return this.rI ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.Y) {
         return this.rf ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.o) {
         return this.rj ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.D) {
         return this.rV ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.U) {
         return this.rg ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rM) {
         return this.rR ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.e) {
         return this.rY ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.i) {
         return this.rK ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rS) {
         return this.rD ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rs) {
         return this.rU ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rO) {
         return this.re ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rh) {
         return this.ra ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rX) {
         if (this.ri == 1) {
            return var2 + rrba_3.protected_();
         } else {
            return this.ri == 2 ? var2 + rrba_3.throws_() : var2 + rrba_3.case_();
         }
      } else if (var1 == QF.rb) {
         return this.rd ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rc) {
         return this.rk ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rm) {
         return this.rW ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rJ) {
         return this.Pr ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rd) {
         return this.PP ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rx) {
         int var9 = byte_(this.PB, Pa);
         return var2 + class_(Pi, var9);
      } else if (var1 == QF.rQ) {
         return this.PG <= 1 ? var2 + rrba_3.case_() : var2 + this.PG + "x";
      } else if (var1 == QF.rk) {
         return this.PS ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rN) {
         return this.Ps ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.ru) {
         return this.PE ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rE) {
         return this.else_ ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.rz) {
         return this.int_ ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 == QF.extends_) {
         double var8 = QF.extends_.class_(this);
         if (var8 == 0.0) {
            return var2 + rrba_3.class_("of.options.framerateLimit.vsync");
         } else {
            return var8 == QF.extends_.case_() ? var2 + jI_2.class_("options.framerateLimit.max") : var2 + (int)var8 + " fps";
         }
      } else if (var1 == QF.rZ) {
         if (this.Pb == 3) {
            return var2 + rrba_3.byte_();
         } else {
            return this.Pb == 5 ? var2 + rrba_3.class_("of.general.compact") : var2 + rrba_3.case_();
         }
      } else if (var1 == QF.rv) {
         return this.PM ? var2 + rrba_3.break_() : var2 + rrba_3.byte_();
      } else if (var1 instanceof VF var3) {
         double var4 = var3.class_(this);
         return var4 == 0.0 ? var2 + jI_2.class_("options.off") : var2 + (int)(var4 * 100.0) + "%";
      } else {
         return null;
      }
   }

   public Qw_1(QY var1, File var2) {
      this.package_();
      this.j = var1;
      this.PD = new File(var2, "options.txt");
      if (var1.strictfp_() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
         QF.int_.break_(32.0F);
         long var3 = 1000000L;
         if (Runtime.getRuntime().maxMemory() >= 1500L * var3) {
            QF.int_.break_(48.0F);
         }

         if (Runtime.getRuntime().maxMemory() >= 2500L * var3) {
            QF.int_.break_(64.0F);
         }
      } else {
         QF.int_.break_(16.0F);
      }

      this.break_ = var1.strictfp_() ? 12 : 8;
      this.rb = rqR_2.implements_() == rqi_3.WINDOWS;
      this.Br = new File(var2, "optionsof.txt");
      this.protected_ = (int)QF.extends_.case_();
      this.Pf = new Vu_1("of.key.zoom", 67, "key.categories.misc");
      this.f = (Vu_1[])ArrayUtils.add(this.f, this.Pf);
      rrWj_1.class_(this.f, new Vu_1[]{this.Pf});
      this.break_ = 8;
      this.class_();
      rrbb_3.class_(this);
   }

   public double class_(QF var1) {
      if (var1 == QF.b) {
         return this.ru;
      } else if (var1 == QF.d) {
         return this.rz;
      } else if (var1 == QF.rr) {
         return (double)this.rQ;
      } else if (var1 == QF.rP) {
         return (double)this.rN;
      } else if (var1 == QF.s) {
         return (double)this.rh;
      } else if (var1 != QF.extends_) {
         return Float.MAX_VALUE;
      } else {
         return (double)this.protected_ == QF.extends_.case_() && this.strictfp_ ? 0.0 : (double)this.protected_;
      }
   }

   public void class_(QF var1, double var2) {
      if (var1 == QF.b) {
         this.ru = var2;
      }

      if (var1 == QF.d) {
         this.rz = var2;
         ((yX_2)this.j.class_[8]).throws_();
      }

      if (var1 == QF.rr) {
         int var4 = (int)var2;
         if (var4 > 0 && rrbb_3.rs()) {
            rrbb_3.byte_(rrba_3.class_("of.message.aa.shaders1"), rrba_3.class_("of.message.aa.shaders2"));
            return;
         }

         if (var4 > 0 && rrbb_3.instanceof_()) {
            rrbb_3.byte_(rrba_3.class_("of.message.aa.gf1"), rrba_3.class_("of.message.aa.gf2"));
            return;
         }

         this.rQ = var4;
         this.rQ = rrbb_3.class_(this.rQ, 0, 16);
      }

      if (var1 == QF.rP) {
         int var5 = (int)var2;
         this.rN = var5;
         this.rN = rrbb_3.class_(this.rN, 1, 16);
         this.j.x();
         rrdZ.while_();
      }

      if (var1 == QF.s) {
         int var6 = (int)var2;
         this.rh = rrbb_3.class_(var6, 0, 3);
         this.native_();
      }
   }

   private static String class_(String[] var0, int var1) {
      if (var1 < 0 || var1 >= var0.length) {
         var1 = 0;
      }

      return jI_2.class_(var0[var1]);
   }

   public void class_(rAt_1 var1) {
      LinkedHashSet var2 = Sets.newLinkedHashSet();
      Iterator var3 = this.private_.iterator();

      while (var3.hasNext()) {
         String var4 = (String)var3.next();
         rAp_1 var5 = var1.class_(var4);
         if (var5 == null && !var4.startsWith("file/")) {
            var5 = var1.class_("file/" + var4);
         }

         if (var5 == null) {
            PV.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", var4);
            var3.remove();
         } else if (!var5.byte_().class_() && !this.implements_.contains(var4)) {
            PV.warn("Removed resource pack {} from options because it is no longer compatible", var4);
            var3.remove();
         } else if (var5.byte_().class_() && this.implements_.contains(var4)) {
            PV.info("Removed resource pack {} from incompatibility list because it's now compatible", var4);
            this.implements_.remove(var4);
         } else {
            var2.add(var5.throws_());
         }
      }

      var1.class_(var2);
   }

   public void class_(VZ var1) {
      rrLw_1 var2 = rrLw_1.class_(this.PU, var1);
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2).byte_()) {
         this.PU = var2.break_();
      }
   }

   public void class_(boolean var1) {
      int var2 = var1 ? 0 : 2;
      this.PO = var2;
      this.Ph = var2;
      this.PX = var1;
      this.PJ = var1;
      this.Px = var1;
      this.Pd = var1;
      this.Pk = var1;
      this.PW = var1;
      this.Pz = var1;
      this.PQ = var1;
      this.PN = var1;
      this.Pc = var1;
      this.Pu = var1;
      this.Pm = var1;
      this.PZ = var1;
      this.Pv = var1;
      this.rE = var1 ? Vm_1.ALL : Vm_1.MINIMAL;
      this.PF = var1;
      this.PL = var1;
      this.PA = var1;
   }

   private static int class_(int var0, int[] var1) {
      int var2 = byte_(var0, var1);
      if (var2 < 0) {
         return var1[0];
      } else {
         if (++var2 >= var1.length) {
            var2 = 0;
         }

         return var1[var2];
      }
   }

   public int class_(int var1) {
      return this.B ? var1 : (int)(this.volatile_ * 255.0) << 24 & 0xFF000000;
   }

   public void class_(Vu_1 var1, Va_1 var2) {
      var1.break_(var2, true);
      this.break_();
   }

   public void class_(QF var1, int var2) {
      if (var1 == QF.B) {
         switch (this.rM) {
            case 1:
               this.rM = 2;
               if (!rrbb_3.case_()) {
                  this.rM = 3;
               }
               break;
            case 2:
               this.rM = 3;
               break;
            case 3:
               this.rM = 1;
               break;
            default:
               this.rM = 1;
         }
      }

      if (var1 == QF.S) {
         this.rO += 0.2F;
         if (this.rO > 0.81F) {
            this.rO = 0.2F;
         }
      }

      if (var1 == QF.E) {
         this.rJ = !this.rJ;
      }

      if (var1 == QF.H) {
         this.rx = !this.rx;
         rrbb_3.volatile_();
      }

      if (var1 == QF.G) {
         this.rc++;
         if (this.rc > 3) {
            this.rc = 0;
         }

         this.implements_();
      }

      if (var1 == QF.M) {
         this.rm = class_(this.rm, Pe);
         ((yX_2)this.j.class_[8]).throws_();
      }

      if (var1 == QF.rG) {
         this.rv++;
         if (this.rv > 2) {
            this.rv = 0;
         }
      }

      if (var1 == QF.O) {
         this.rZ++;
         if (this.rZ > 3) {
            this.rZ = 0;
         }
      }

      if (var1 == QF.h) {
         this.PO++;
         if (this.PO == 1) {
            this.PO++;
         }

         if (this.PO > 2) {
            this.PO = 0;
         }
      }

      if (var1 == QF.X) {
         this.Ph++;
         if (this.Ph == 1) {
            this.Ph++;
         }

         if (this.Ph > 2) {
            this.Ph = 0;
         }
      }

      if (var1 == QF.J) {
         this.PX = !this.PX;
      }

      if (var1 == QF.x) {
         this.PJ = !this.PJ;
      }

      if (var1 == QF.N) {
         this.Px = !this.Px;
      }

      if (var1 == QF.c) {
         this.Pd = !this.Pd;
      }

      if (var1 == QF.u) {
         this.Pk = !this.Pk;
      }

      if (var1 == QF.m) {
         this.PW = !this.PW;
      }

      if (var1 == QF.y) {
         this.Pz = !this.Pz;
      }

      if (var1 == QF.p) {
         this.PQ = !this.PQ;
      }

      if (var1 == QF.T) {
         this.Pc = !this.Pc;
      }

      if (var1 == QF.t) {
         this.Pu = !this.Pu;
      }

      if (var1 == QF.w) {
         this.Pm = !this.Pm;
      }

      if (var1 == QF.I) {
         this.PZ = !this.PZ;
      }

      if (var1 == QF.f) {
         this.Pv = !this.Pv;
      }

      if (var1 == QF.V) {
         this.PF = !this.PF;
      }

      if (var1 == QF.R) {
         this.PL = !this.PL;
      }

      if (var1 == QF.rB) {
         this.PA = !this.PA;
      }

      if (var1 == QF.q) {
         this.PN = !this.PN;
      }

      if (var1 == QF.k) {
         this.rA = !this.rA;
      }

      if (var1 == QF.W) {
         this.rC = !this.rC;
      }

      if (var1 == QF.z) {
         short var3 = 900;
         this.rL = Math.max(this.rL / var3 * var3, var3);
         this.rL *= 2;
         if (this.rL > 32 * var3) {
            this.rL = var3;
         }
      }

      if (var1 == QF.Q) {
         this.rF++;
         if (this.rF > 3) {
            this.rF = 1;
         }

         ((yX_2)this.j.class_[8]).throws_();
      }

      if (var1 == QF.a) {
         this.ro++;
         if (this.ro > 3) {
            this.ro = 1;
         }

         if (this.ro == 2) {
            ((yX_2)this.j.class_[8]).throws_();
         } else {
            this.j.x();
         }
      }

      if (var1 == QF.Z) {
         this.rl = !this.rl;
      }

      if (var1 == QF.v) {
         this.rH = !this.rH;
      }

      if (var1 == QF.F) {
         this.ry = !this.ry;
      }

      if (var1 == QF.L) {
         this.rp = !this.rp;
      }

      if (var1 == QF.A) {
         this.rq++;
         if (this.rq > 2) {
            this.rq = 0;
         }
      }

      if (var1 == QF.n) {
         this.rT++;
         if (this.rT > 5) {
            this.rT = 1;
         }
      }

      if (var1 == QF.C) {
         this.rt = !this.rt;
      }

      if (var1 == QF.l) {
         this.rw++;
         if (this.rw > 2) {
            this.rw = 0;
         }
      }

      if (var1 == QF.j) {
         this.rn = !this.rn;
      }

      if (var1 == QF.g) {
         this.rI = !this.rI;
         ((yX_2)this.j.class_[8]).throws_();
      }

      if (var1 == QF.Y) {
         this.rf = !this.rf;
         rrbN_2.break_();
         ((yX_2)this.j.class_[8]).throws_();
      }

      if (var1 == QF.o) {
         this.rj = !this.rj;
         rrME.break_();
      }

      if (var1 == QF.D) {
         this.rV = !this.rV;
         rrWv_1.class_();
      }

      if (var1 == QF.U) {
         this.rg = !this.rg;
         rrbN_2.class_();
         ((yX_2)this.j.class_[8]).throws_();
      }

      if (var1 == QF.i) {
         this.rK = !this.rK;
         this.j.x();
      }

      if (var1 == QF.rM) {
         this.rR = !this.rR;
         rrbf_3.break_();
      }

      if (var1 == QF.e) {
         this.rY = !this.rY;
      }

      if (var1 == QF.rS) {
         this.rD = !this.rD;
         rrMs_1.class_();
         ((yX_2)this.j.class_[8]).throws_();
      }

      if (var1 == QF.rs) {
         this.rU = !this.rU;
         this.j.x();
      }

      if (var1 == QF.rO) {
         this.re = !this.re;
         rfU_2.finally_ = this.re;
      }

      if (var1 == QF.rh) {
         this.ra = !this.ra;
      }

      if (var1 == QF.rX) {
         if (this.ri == 0) {
            this.ri = 1;
         } else if (this.ri == 1) {
            this.ri = 2;
         } else if (this.ri == 2) {
            this.ri = 0;
         } else {
            this.ri = 0;
         }

         ((yX_2)this.j.class_[8]).throws_();
      }

      if (var1 == QF.rb) {
         this.rd = !this.rd;
      }

      if (var1 == QF.rc) {
         this.rk = !this.rk;
         ((yX_2)this.j.class_[8]).throws_();
      }

      if (var1 == QF.rm) {
         this.rW = !this.rW;
         ((yX_2)this.j.class_[8]).throws_();
      }

      if (var1 == QF.rJ) {
         this.Pr = !this.Pr;
      }

      if (var1 == QF.rd) {
         this.PP = !this.PP;
         ((yX_2)this.j.class_[8]).throws_();
      }

      if (var1 == QF.rx) {
         this.PB = class_(this.PB, Pa);
         rrbg_3.break_((yX_2)this.j.class_[8]);
      }

      if (var1 == QF.rQ) {
         this.PG++;
         if (this.PG > 4) {
            this.PG = 1;
         }
      }

      if (var1 == QF.rk) {
         this.PS = !this.PS;
         this.j.x();
      }

      if (var1 == QF.rN) {
         this.Ps = !this.Ps;
         rrbl_3.class_();
      }

      if (var1 == QF.ru) {
         this.PE = !this.PE;
      }

      if (var1 == QF.rE) {
         this.else_ = !this.else_;
      }

      if (var1 == QF.rz) {
         this.int_ = !this.int_;
      }

      if (var1 == QF.rZ) {
         if (this.Pb == 0) {
            this.Pb = 5;
         } else if (this.Pb == 5) {
            this.Pb = 3;
         } else {
            this.Pb = 0;
         }
      }

      if (var1 == QF.rv) {
         this.PM = !this.PM;
      }
   }

   public float class_(rqL_2 var1) {
      return this.PK.getOrDefault(var1, var1.break_());
   }

   public float class_(float var1) {
      return this.B ? var1 : (float)this.volatile_;
   }

   private static float class_(String var0) {
      if ("true".equals(var0)) {
         return 1.0F;
      } else {
         return "false".equals(var0) ? 0.0F : Float.parseFloat(var0);
      }
   }

   private rcd_3 class_(rcd_3 var1) {
      int var2 = 0;

      try {
         var2 = Integer.parseInt(var1.native_("version"));
      } catch (RuntimeException var4) {
      }

      return rco_3.class_(this.j.protected_(), rTv_1.OPTIONS, var1, var2);
   }

   public void class_() {
      try {
         if (!this.PD.exists()) {
            return;
         }

         this.PK.clear();
         rcd_3 var1 = new rcd_3();

         try (BufferedReader var2 = Files.newReader(this.PD, Charsets.UTF_8)) {
            var2.lines().forEach(var1x -> {
               try {
                  Iterator var2x = PY.split(var1x).iterator();
                  var1.class_((String)var2x.next(), (String)var2x.next());
               } catch (Exception var3) {
                  PV.warn("Skipping bad option: {}", var1x);
               }
            });
         }

         rcd_3 var22 = this.class_(var1);
         if (!var22.throws_("graphicsMode") && var22.throws_("fancyGraphics")) {
            if ("true".equals(var22.native_("fancyGraphics"))) {
               this.case_ = VW.FANCY;
            } else {
               this.case_ = VW.FAST;
            }
         }

         for (String var4 : var22.protected_()) {
            String var5 = var22.native_(var4);
            String var6 = var5;
            int var7 = var5.indexOf(43);
            boolean var8 = false;
            if (var7 != -1) {
               var5 = var5.substring(0, var7);
               var6 = var6.substring(var7 + 1);
               var8 = true;
            }

            try {
               if ("autoJump".equals(var4)) {
                  QF.throw_.class_(this, var5);
               }

               if ("autoSuggestions".equals(var4)) {
                  QF.interface_.class_(this, var5);
               }

               if ("chatColors".equals(var4)) {
                  QF.abstract_.class_(this, var5);
               }

               if ("chatLinks".equals(var4)) {
                  QF.float_.class_(this, var5);
               }

               if ("chatLinksPrompt".equals(var4)) {
                  QF.void_.class_(this, var5);
               }

               if ("enableVsync".equals(var4)) {
                  QF.import_.class_(this, var5);
                  if (this.strictfp_) {
                     this.protected_ = (int)QF.extends_.case_();
                  }

                  this.extends_();
               }

               if ("entityShadows".equals(var4)) {
                  QF.short_.class_(this, var5);
               }

               if ("forceUnicodeFont".equals(var4)) {
                  QF.default_.class_(this, var5);
               }

               if ("discrete_mouse_scroll".equals(var4)) {
                  QF.static_.class_(this, var5);
               }

               if ("invertYMouse".equals(var4)) {
                  QF.const_.class_(this, var5);
               }

               if ("reducedDebugInfo".equals(var4)) {
                  QF.strictfp_.class_(this, var5);
               }

               if ("showSubtitles".equals(var4)) {
                  QF.boolean_.class_(this, var5);
               }

               if ("snooperEnabled".equals(var4)) {
                  QF.transient_.class_(this, var5);
               }

               if ("touchscreen".equals(var4)) {
                  QF.switch_.class_(this, var5);
               }

               if ("fullscreen".equals(var4)) {
                  QF.r.class_(this, var5);
               }

               if ("bobViewEffect".equals(var4)) {
                  QF.P.class_(this, Double.parseDouble(var5));
               }

               if ("toggleCrouch".equals(var4)) {
                  this.G = "true".equals(var5);
               }

               if ("toggleSprint".equals(var4)) {
                  this.b = "true".equals(var5);
               }

               if ("streamerMode".equals(var4)) {
                  this.O = "true".equals(var5);
               }

               if ("mouseSensitivity".equals(var4)) {
                  this.class_ = (double)class_(var5);
               }

               if ("fov".equals(var4)) {
                  this.U = (double)(class_(var5) * 40.0F + 70.0F);
               }

               if ("fovEffectScale".equals(var4)) {
                  this.e = class_(var5);
               }

               if ("gamma".equals(var4)) {
                  this.a = (double)class_(var5);
               }

               if ("autoBuyRefreshDelay".equals(var4)) {
                  this.rr = (double)class_(var5);
               }

               if ("autoBuyAntiDelay".equals(var4)) {
                  this.rB = Boolean.parseBoolean(var5);
               }

               if ("autoBuyParsedPriceDecreasePercentage".equals(var4)) {
                  this.rS = (double)class_(var5);
               }

               if ("renderDistance".equals(var4)) {
                  this.break_ = Integer.parseInt(var5);
               }

               if ("entityDistanceScaling".equals(var4)) {
                  this.byte_ = Float.parseFloat(var5);
               }

               if ("guiScale".equals(var4)) {
                  this.rs = Integer.parseInt(var5);
               }

               if ("particles".equals(var4)) {
                  this.rE = Vm_1.class_(Integer.parseInt(var5));
               }

               if ("maxFps".equals(var4)) {
                  this.protected_ = Integer.parseInt(var5);
                  if (this.strictfp_) {
                     this.protected_ = (int)QF.extends_.case_();
                  }

                  if (this.protected_ <= 0) {
                     this.protected_ = (int)QF.extends_.case_();
                  }

                  if (this.j.else_() != null) {
                     this.j.else_().class_(this.protected_);
                  }
               }

               if ("difficulty".equals(var4)) {
                  this.V = rRO.class_(Integer.parseInt(var5));
               }

               if ("graphicsMode".equals(var4)) {
                  this.case_ = VW.class_(Integer.parseInt(var5));
                  this.implements_();
               }

               if ("ao".equals(var4)) {
                  if ("true".equals(var5)) {
                     this.catch_ = Vh_1.MAX;
                  } else if ("false".equals(var5)) {
                     this.catch_ = Vh_1.OFF;
                  } else {
                     this.catch_ = Vh_1.class_(Integer.parseInt(var5));
                  }
               }

               if ("renderClouds".equals(var4)) {
                  if ("true".equals(var5)) {
                     this.throws_ = Vd_1.FANCY;
                  } else if ("false".equals(var5)) {
                     this.throws_ = Vd_1.OFF;
                  } else if ("fast".equals(var5)) {
                     this.throws_ = Vd_1.FAST;
                  }
               }

               if ("attackIndicator".equals(var4)) {
                  this.interface_ = VX.class_(Integer.parseInt(var5));
               }

               if ("resourcePacks".equals(var4)) {
                  this.private_ = rpY_2.class_(Pg, var5, PR);
                  if (this.private_ == null) {
                     this.private_ = Lists.newArrayList();
                  }
               }

               if ("incompatibleResourcePacks".equals(var4)) {
                  this.implements_ = rpY_2.class_(Pg, var5, PR);
                  if (this.implements_ == null) {
                     this.implements_ = Lists.newArrayList();
                  }
               }

               if ("lastServer".equals(var4)) {
                  this.K = var5;
               }

               if ("lang".equals(var4)) {
                  this.rG = var5;
               }

               if ("chatVisibility".equals(var4)) {
                  this.finally_ = rhJ_2.class_(Integer.parseInt(var5));
               }

               if ("chatOpacity".equals(var4)) {
                  this.extends_ = (double)class_(var5);
               }

               if ("chatLineSpacing".equals(var4)) {
                  this.native_ = (double)class_(var5);
               }

               if ("textBackgroundOpacity".equals(var4)) {
                  this.volatile_ = (double)class_(var5);
               }

               if ("backgroundForChatOnly".equals(var4)) {
                  this.B = "true".equals(var5);
               }

               if ("fullscreenResolution".equals(var4)) {
                  this.final_ = var5;
               }

               if ("hideServerAddress".equals(var4)) {
                  this.package_ = "true".equals(var5);
               }

               if ("advancedItemTooltips".equals(var4)) {
                  this.int_ = "true".equals(var5);
               }

               if ("pauseOnLostFocus".equals(var4)) {
                  this.new_ = "true".equals(var5);
               }

               if ("overrideHeight".equals(var4)) {
                  this.this_ = Integer.parseInt(var5);
               }

               if ("overrideWidth".equals(var4)) {
                  this.super_ = Integer.parseInt(var5);
               }

               if ("heldItemTooltips".equals(var4)) {
                  this.else_ = "true".equals(var5);
               }

               if ("removeChatSpam".equals(var4)) {
                  this.synchronized_ = "true".equals(var5);
               }

               if ("chatHeightFocused".equals(var4)) {
                  this.while_ = (double)class_(var5);
               }

               if ("chatDelay".equals(var4)) {
                  this.try_ = (double)class_(var5);
               }

               if ("chatHeightUnfocused".equals(var4)) {
                  this.goto_ = (double)class_(var5);
               }

               if ("chatScale".equals(var4)) {
                  this.return_ = (double)class_(var5);
               }

               if ("chatWidth".equals(var4)) {
                  this.public_ = (double)class_(var5);
               }

               if ("mipmapLevels".equals(var4)) {
                  this.instanceof_ = Integer.parseInt(var5);
               }

               if ("useNativeTransport".equals(var4)) {
                  this.throw_ = "true".equals(var5);
               }

               if ("mainHand".equals(var4)) {
                  this.continue_ = "left".equals(var5) ? rpZ_2.LEFT : rpZ_2.RIGHT;
               }

               if ("biomeBlendRadius".equals(var4)) {
                  this.abstract_ = Integer.parseInt(var5);
               }

               if ("mouseWheelSensitivity".equals(var4)) {
                  this.long_ = (double)class_(var5);
               }

               if ("rawMouseInput".equals(var4)) {
                  this.float_ = "true".equals(var5);
               }

               if ("glDebugVerbosity".equals(var4)) {
                  this.void_ = Integer.parseInt(var5);
               }

               if ("hideMatchedNames".equals(var4)) {
                  this.M = "true".equals(var5);
               }

               if ("joinedFirstServer".equals(var4)) {
                  this.char_ = "true".equals(var5);
               }

               if ("syncChunkWrites".equals(var4)) {
                  this.rb = "true".equals(var5);
               }

               for (Vu_1 var12 : this.f) {
                  if (var4.equals("key_" + var12.catch_())) {
                     if (!var8) {
                        var12.break_(Ve_1.class_(var5), true);
                     } else {
                        ArrayList var13 = new ArrayList();

                        for (String var17 : var6.split(":")) {
                           var13.add(Ve_1.class_(var17));
                        }

                        var12.class_(Ve_1.class_(var5), var13);
                     }
                  }
               }

               for (rqL_2 var29 : rqL_2.values()) {
                  if (var4.equals("soundCategory_" + var29.class_())) {
                     this.PK.put(var29, class_(var5));
                  }
               }

               for (rhQ_2 var30 : rhQ_2.values()) {
                  if (var4.equals("modelPart_" + var30.break_())) {
                     this.class_(var30, "true".equals(var5));
                  }
               }
            } catch (Exception var20) {
               PV.warn("Skipping bad option: {}:{}", var4, var5);
               var20.printStackTrace();
            }
         }

         Vu_1.byte_();
      } catch (Exception var21) {
         PV.error("Failed to load options", var21);
      }

      this.catch_();
   }

   public void class_(rhQ_2 var1, boolean var2) {
      if (var2) {
         this.Po.add(var1);
      } else {
         this.Po.remove(var1);
      }

      this.byte_();
   }

   public void class_(rhQ_2 var1) {
      if (this.protected_().contains(var1)) {
         this.Po.remove(var1);
      } else {
         this.Po.add(var1);
      }

      this.byte_();
   }

   public void class_(rqL_2 var1, float var2) {
      this.PK.put(var1, var2);
      this.j.c().class_(var1, var2);
   }

   public void class_(Vu_1 var1, Va_1 var2, Collection<Va_1> var3) {
      var1.class_(var2, var3);
      this.break_();
   }

   private static int break_(int var0, int[] var1) {
      int var2 = byte_(var0, var1);
      return var2 < 0 ? var1[0] : var0;
   }

   public int break_(float var1) {
      return (int)(this.class_(var1) * 255.0F) << 24 & 0xFF000000;
   }

   public rgP_2 break_(QF var1) {
      String var2 = this.byte_(var1);
      return new rgN_2(var2);
   }

   public void break_() {
      if (!rrxr_3.finally_.byte_() || !rrxr_3.break_(rrxr_3.finally_)) {
         try (PrintWriter var1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.PD), StandardCharsets.UTF_8))) {
            var1.println("version:" + rqu_3.class_().getWorldVersion());
            var1.println("streamerMode:" + this.O);
            var1.println("autoJump:" + QF.throw_.break_(this));
            var1.println("autoSuggestions:" + QF.interface_.break_(this));
            var1.println("chatColors:" + QF.abstract_.break_(this));
            var1.println("chatLinks:" + QF.float_.break_(this));
            var1.println("chatLinksPrompt:" + QF.void_.break_(this));
            var1.println("enableVsync:" + QF.import_.break_(this));
            var1.println("entityShadows:" + QF.short_.break_(this));
            var1.println("forceUnicodeFont:" + QF.default_.break_(this));
            var1.println("discrete_mouse_scroll:" + QF.static_.break_(this));
            var1.println("invertYMouse:" + QF.const_.break_(this));
            var1.println("reducedDebugInfo:" + QF.strictfp_.break_(this));
            var1.println("snooperEnabled:" + QF.transient_.break_(this));
            var1.println("showSubtitles:" + QF.boolean_.break_(this));
            var1.println("touchscreen:" + QF.switch_.break_(this));
            var1.println("fullscreen:" + QF.r.break_(this));
            var1.println("bobViewEffect:" + QF.P.class_(this));
            var1.println("toggleCrouch:" + this.G);
            var1.println("toggleSprint:" + this.b);
            var1.println("mouseSensitivity:" + this.class_);
            var1.println("fov:" + (this.U - 70.0) / 40.0);
            var1.println("fovEffectScale:" + this.e);
            var1.println("gamma:" + this.a);
            var1.println("autoBuyRefreshDelay:" + this.rr);
            var1.println("autoBuyAntiDelay:" + this.rB);
            var1.println("autoBuyParsedPriceDecreasePercentage:" + this.rS);
            var1.println("renderDistance:" + this.break_);
            var1.println("entityDistanceScaling:" + this.byte_);
            var1.println("guiScale:" + this.rs);
            var1.println("particles:" + this.rE.break_());
            var1.println("maxFps:" + this.protected_);
            var1.println("difficulty:" + this.V.class_());
            var1.println("graphicsMode:" + this.case_.class_());
            var1.println("ao:" + this.catch_.class_());
            var1.println("biomeBlendRadius:" + this.abstract_);
            switch (this.throws_) {
               case FANCY:
                  var1.println("renderClouds:true");
                  break;
               case FAST:
                  var1.println("renderClouds:fast");
                  break;
               case OFF:
                  var1.println("renderClouds:false");
            }

            var1.println("resourcePacks:" + Pg.toJson(this.private_));
            var1.println("incompatibleResourcePacks:" + Pg.toJson(this.implements_));
            var1.println("lastServer:" + this.K);
            var1.println("lang:" + this.rG);
            var1.println("chatVisibility:" + this.finally_.class_());
            var1.println("chatOpacity:" + this.extends_);
            var1.println("chatLineSpacing:" + this.native_);
            var1.println("textBackgroundOpacity:" + this.volatile_);
            var1.println("backgroundForChatOnly:" + this.B);
            if (this.j.else_().case_().isPresent()) {
               var1.println("fullscreenResolution:" + this.j.else_().case_().get().catch_());
            }

            var1.println("hideServerAddress:" + this.package_);
            var1.println("advancedItemTooltips:" + this.int_);
            var1.println("pauseOnLostFocus:" + this.new_);
            var1.println("overrideWidth:" + this.super_);
            var1.println("overrideHeight:" + this.this_);
            var1.println("heldItemTooltips:" + this.else_);
            var1.println("removeChatSpam:" + this.synchronized_);
            var1.println("chatHeightFocused:" + this.while_);
            var1.println("chatDelay: " + this.try_);
            var1.println("chatHeightUnfocused:" + this.goto_);
            var1.println("chatScale:" + this.return_);
            var1.println("chatWidth:" + (float)this.public_);
            var1.println("mipmapLevels:" + this.instanceof_);
            var1.println("useNativeTransport:" + this.throw_);
            var1.println("mainHand:" + (this.continue_ == rpZ_2.LEFT ? "left" : "right"));
            var1.println("attackIndicator:" + this.interface_.class_());
            var1.println("mouseWheelSensitivity:" + this.long_);
            var1.println("rawMouseInput:" + QF.package_.break_(this));
            var1.println("glDebugVerbosity:" + this.void_);
            var1.println("hideMatchedNames:" + this.M);
            var1.println("joinedFirstServer:" + this.char_);
            var1.println("syncChunkWrites:" + this.rb);

            for (Vu_1 var5 : this.f) {
               String var6 = "key_" + var5.catch_() + ":" + var5.final_();
               if (!var5.implements_().isEmpty()) {
                  var6 = var6 + "+" + var5.package_();
               }

               var1.println(var6);
            }

            for (rqL_2 var16 : rqL_2.values()) {
               var1.println("soundCategory_" + var16.class_() + ":" + this.class_(var16));
            }

            for (rhQ_2 var17 : rhQ_2.values()) {
               var1.println("modelPart_" + var17.break_() + ":" + this.Po.contains(var17));
            }
         } catch (Exception var9) {
            PV.error("Failed to save options", var9);
         }

         this.private_();
         this.byte_();
      }
   }

   public boolean break_(rhQ_2 var1) {
      return this.protected_().contains(var1);
   }

   public Vd_1 throws_() {
      return this.break_ >= 4 ? this.throws_ : Vd_1.OFF;
   }

   public void finally_() {
      this.break_ = 8;
      this.byte_ = 1.0F;
      this.E = 0.3F;
      this.protected_ = (int)QF.extends_.case_();
      this.strictfp_ = false;
      this.extends_();
      this.instanceof_ = 4;
      this.case_ = VW.FANCY;
      this.catch_ = Vh_1.MAX;
      this.throws_ = Vd_1.FANCY;
      this.U = 70.0;
      this.a = 0.0;
      this.rs = 2;
      this.rE = Vm_1.ALL;
      this.else_ = false;
      this.transient_ = false;
      this.rM = 1;
      this.rO = 0.8F;
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
      this.abstract_ = 2;
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
      rrdZ.class_("OFF");
      rrdZ.So = 0;
      rrdZ.while_();
      rrdZ.break_();
      this.j.x();
      this.break_();
   }

   public void catch_() {
      try {
         File var1 = this.Br;
         if (!var1.exists()) {
            var1 = this.PD;
         }

         if (!var1.exists()) {
            return;
         }

         BufferedReader var2 = new BufferedReader(new InputStreamReader(new FileInputStream(var1), StandardCharsets.UTF_8));
         String var3 = "";

         while ((var3 = var2.readLine()) != null) {
            try {
               String[] var4 = var3.split(":");
               if (var4[0].equals("ofRenderDistanceChunks") && var4.length >= 2) {
                  this.break_ = Integer.valueOf(var4[1]);
                  this.break_ = rrbb_3.class_(this.break_, 2, 1024);
               }

               if (var4[0].equals("ofFogType") && var4.length >= 2) {
                  this.rM = Integer.valueOf(var4[1]);
                  this.rM = rrbb_3.class_(this.rM, 1, 3);
               }

               if (var4[0].equals("ofFogStart") && var4.length >= 2) {
                  this.rO = Float.valueOf(var4[1]);
                  if (this.rO < 0.2F) {
                     this.rO = 0.2F;
                  }

                  if (this.rO > 0.81F) {
                     this.rO = 0.8F;
                  }
               }

               if (var4[0].equals("ofMipmapType") && var4.length >= 2) {
                  this.rh = Integer.valueOf(var4[1]);
                  this.rh = rrbb_3.class_(this.rh, 0, 3);
               }

               if (var4[0].equals("ofOcclusionFancy") && var4.length >= 2) {
                  this.rX = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSmoothFps") && var4.length >= 2) {
                  this.rJ = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSmoothWorld") && var4.length >= 2) {
                  this.rx = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAoLevel") && var4.length >= 2) {
                  this.rz = (double)Float.valueOf(var4[1]).floatValue();
                  this.rz = rrbb_3.class_(this.rz, 0.0, 1.0);
               }

               if (var4[0].equals("ofClouds") && var4.length >= 2) {
                  this.rc = Integer.valueOf(var4[1]);
                  this.rc = rrbb_3.class_(this.rc, 0, 3);
                  this.implements_();
               }

               if (var4[0].equals("ofCloudsHeight") && var4.length >= 2) {
                  this.ru = (double)Float.valueOf(var4[1]).floatValue();
                  this.ru = rrbb_3.class_(this.ru, 0.0, 1.0);
               }

               if (var4[0].equals("ofTrees") && var4.length >= 2) {
                  this.rm = Integer.valueOf(var4[1]);
                  this.rm = break_(this.rm, Pe);
               }

               if (var4[0].equals("ofDroppedItems") && var4.length >= 2) {
                  this.rv = Integer.valueOf(var4[1]);
                  this.rv = rrbb_3.class_(this.rv, 0, 2);
               }

               if (var4[0].equals("ofRain") && var4.length >= 2) {
                  this.rZ = Integer.valueOf(var4[1]);
                  this.rZ = rrbb_3.class_(this.rZ, 0, 3);
               }

               if (var4[0].equals("ofAnimatedWater") && var4.length >= 2) {
                  this.PO = Integer.valueOf(var4[1]);
                  this.PO = rrbb_3.class_(this.PO, 0, 2);
               }

               if (var4[0].equals("ofAnimatedLava") && var4.length >= 2) {
                  this.Ph = Integer.valueOf(var4[1]);
                  this.Ph = rrbb_3.class_(this.Ph, 0, 2);
               }

               if (var4[0].equals("ofAnimatedFire") && var4.length >= 2) {
                  this.PX = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedPortal") && var4.length >= 2) {
                  this.PJ = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedRedstone") && var4.length >= 2) {
                  this.Px = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedExplosion") && var4.length >= 2) {
                  this.Pd = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedFlame") && var4.length >= 2) {
                  this.Pk = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedSmoke") && var4.length >= 2) {
                  this.PW = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofVoidParticles") && var4.length >= 2) {
                  this.Pz = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofWaterParticles") && var4.length >= 2) {
                  this.PQ = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofPortalParticles") && var4.length >= 2) {
                  this.Pc = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofPotionParticles") && var4.length >= 2) {
                  this.Pu = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofFireworkParticles") && var4.length >= 2) {
                  this.Pm = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofBlockParticles") && var4.length >= 2) {
                  this.PZ = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofBubbleColumnParticles") && var4.length >= 2) {
                  this.Pv = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofDrippingWaterLava") && var4.length >= 2) {
                  this.PF = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedTerrain") && var4.length >= 2) {
                  this.PL = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedTextures") && var4.length >= 2) {
                  this.PA = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofRainSplash") && var4.length >= 2) {
                  this.PN = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofLagometer") && var4.length >= 2) {
                  this.rA = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofShowFps") && var4.length >= 2) {
                  this.rC = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAutoSaveTicks") && var4.length >= 2) {
                  this.rL = Integer.valueOf(var4[1]);
                  this.rL = rrbb_3.class_(this.rL, 40, 40000);
               }

               if (var4[0].equals("ofBetterGrass") && var4.length >= 2) {
                  this.rF = Integer.valueOf(var4[1]);
                  this.rF = rrbb_3.class_(this.rF, 1, 3);
               }

               if (var4[0].equals("ofConnectedTextures") && var4.length >= 2) {
                  this.ro = Integer.valueOf(var4[1]);
                  this.ro = rrbb_3.class_(this.ro, 1, 3);
               }

               if (var4[0].equals("ofWeather") && var4.length >= 2) {
                  this.rl = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSky") && var4.length >= 2) {
                  this.rH = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofStars") && var4.length >= 2) {
                  this.ry = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSunMoon") && var4.length >= 2) {
                  this.rp = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofVignette") && var4.length >= 2) {
                  this.rq = Integer.valueOf(var4[1]);
                  this.rq = rrbb_3.class_(this.rq, 0, 2);
               }

               if (var4[0].equals("ofChunkUpdates") && var4.length >= 2) {
                  this.rT = Integer.valueOf(var4[1]);
                  this.rT = rrbb_3.class_(this.rT, 1, 5);
               }

               if (var4[0].equals("ofChunkUpdatesDynamic") && var4.length >= 2) {
                  this.rt = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofTime") && var4.length >= 2) {
                  this.rw = Integer.valueOf(var4[1]);
                  this.rw = rrbb_3.class_(this.rw, 0, 2);
               }

               if (var4[0].equals("ofAaLevel") && var4.length >= 2) {
                  this.rQ = Integer.valueOf(var4[1]);
                  this.rQ = rrbb_3.class_(this.rQ, 0, 16);
               }

               if (var4[0].equals("ofAfLevel") && var4.length >= 2) {
                  this.rN = Integer.valueOf(var4[1]);
                  this.rN = rrbb_3.class_(this.rN, 1, 16);
               }

               if (var4[0].equals("ofProfiler") && var4.length >= 2) {
                  this.rn = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofBetterSnow") && var4.length >= 2) {
                  this.rI = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSwampColors") && var4.length >= 2) {
                  this.rf = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofRandomEntities") && var4.length >= 2) {
                  this.rj = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomFonts") && var4.length >= 2) {
                  this.rV = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomColors") && var4.length >= 2) {
                  this.rg = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomItems") && var4.length >= 2) {
                  this.rK = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomSky") && var4.length >= 2) {
                  this.rR = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofShowCapes") && var4.length >= 2) {
                  this.rY = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofNaturalTextures") && var4.length >= 2) {
                  this.rD = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofEmissiveTextures") && var4.length >= 2) {
                  this.rU = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofLazyChunkLoading") && var4.length >= 2) {
                  this.rd = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofRenderRegions") && var4.length >= 2) {
                  this.rk = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSmartAnimations") && var4.length >= 2) {
                  this.rW = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofDynamicFov") && var4.length >= 2) {
                  this.Pr = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAlternateBlocks") && var4.length >= 2) {
                  this.PP = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofDynamicLights") && var4.length >= 2) {
                  this.PB = Integer.valueOf(var4[1]);
                  this.PB = break_(this.PB, Pa);
               }

               if (var4[0].equals("ofScreenshotSize") && var4.length >= 2) {
                  this.PG = Integer.valueOf(var4[1]);
                  this.PG = rrbb_3.class_(this.PG, 1, 4);
               }

               if (var4[0].equals("ofCustomEntityModels") && var4.length >= 2) {
                  this.PS = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomGuis") && var4.length >= 2) {
                  this.Ps = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofShowGlErrors") && var4.length >= 2) {
                  this.PE = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofFastMath") && var4.length >= 2) {
                  this.re = Boolean.valueOf(var4[1]);
                  rfU_2.finally_ = this.re;
               }

               if (var4[0].equals("ofFastRender") && var4.length >= 2) {
                  this.ra = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofTranslucentBlocks") && var4.length >= 2) {
                  this.ri = Integer.valueOf(var4[1]);
                  this.ri = rrbb_3.class_(this.ri, 0, 2);
               }

               if (var4[0].equals("ofChatBackground") && var4.length >= 2) {
                  this.Pb = Integer.valueOf(var4[1]);
               }

               if (var4[0].equals("ofChatShadow") && var4.length >= 2) {
                  this.PM = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("key_" + this.Pf.catch_())) {
                  this.Pf.break_(Ve_1.class_(var4[1]), false);
               }
            } catch (Exception var5) {
               rrbb_3.byte_("Skipping bad option: " + var3);
               var5.printStackTrace();
            }
         }

         rrWj_1.class_(this.f, new Vu_1[]{this.Pf});
         Vu_1.byte_();
         var2.close();
      } catch (Exception var6) {
         rrbb_3.protected_("Failed to load options");
         var6.printStackTrace();
      }
   }

   public void extends_() {
      if (this.j.else_() != null) {
         this.j.else_().class_(this.strictfp_);
      }
   }

   public boolean case_() {
      return this.throw_;
   }

   public void implements_() {
      switch (this.rc) {
         case 1:
            this.throws_ = Vd_1.FAST;
            break;
         case 2:
            this.throws_ = Vd_1.FANCY;
            break;
         case 3:
            this.throws_ = Vd_1.OFF;
            break;
         default:
            if (this.case_ != VW.FAST) {
               this.throws_ = Vd_1.FANCY;
            } else {
               this.throws_ = Vd_1.FAST;
            }
      }

      if (this.case_ == VW.FABULOUS) {
         yX_2 var1 = (yX_2)QY.instanceof_().class_[8];
         if (var1 != null) {
            VC var2 = var1.void_();
            if (var2 != null) {
               var2.break_((Boolean)QY.break_[2]);
            }
         }
      }
   }

   private void package_() {
      if (rrxr_3.BB.protected_() && rrxr_3.PL.byte_()) {
         Object var1 = rrxr_3.class_(rrxr_3.BB);
         rrxr_3.private_(this.h, rrxr_3.PL, var1);
         rrxr_3.private_(this.X, rrxr_3.PL, var1);
         rrxr_3.private_(this.J, rrxr_3.PL, var1);
         rrxr_3.private_(this.x, rrxr_3.PL, var1);
         rrxr_3.private_(this.d, rrxr_3.PL, var1);
         rrxr_3.private_(this.k, rrxr_3.PL, var1);
         rrxr_3.private_(this.W, rrxr_3.PL, var1);
         rrxr_3.private_(this.m, rrxr_3.PL, var1);
         rrxr_3.private_(this.v, rrxr_3.PL, var1);
         rrxr_3.private_(this.F, rrxr_3.PL, var1);
         rrxr_3.private_(this.L, rrxr_3.PL, var1);
         rrxr_3.private_(this.C, rrxr_3.PL, var1);
         rrxr_3.private_(this.H, rrxr_3.PL, var1);
      }
   }

   public Set<rhQ_2> protected_() {
      return ImmutableSet.copyOf(this.Po);
   }

   public void private_() {
      try {
         PrintWriter var1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.Br), StandardCharsets.UTF_8));
         var1.println("ofFogType:" + this.rM);
         var1.println("ofFogStart:" + this.rO);
         var1.println("ofMipmapType:" + this.rh);
         var1.println("ofOcclusionFancy:" + this.rX);
         var1.println("ofSmoothFps:" + this.rJ);
         var1.println("ofSmoothWorld:" + this.rx);
         var1.println("ofAoLevel:" + this.rz);
         var1.println("ofClouds:" + this.rc);
         var1.println("ofCloudsHeight:" + this.ru);
         var1.println("ofTrees:" + this.rm);
         var1.println("ofDroppedItems:" + this.rv);
         var1.println("ofRain:" + this.rZ);
         var1.println("ofAnimatedWater:" + this.PO);
         var1.println("ofAnimatedLava:" + this.Ph);
         var1.println("ofAnimatedFire:" + this.PX);
         var1.println("ofAnimatedPortal:" + this.PJ);
         var1.println("ofAnimatedRedstone:" + this.Px);
         var1.println("ofAnimatedExplosion:" + this.Pd);
         var1.println("ofAnimatedFlame:" + this.Pk);
         var1.println("ofAnimatedSmoke:" + this.PW);
         var1.println("ofVoidParticles:" + this.Pz);
         var1.println("ofWaterParticles:" + this.PQ);
         var1.println("ofPortalParticles:" + this.Pc);
         var1.println("ofPotionParticles:" + this.Pu);
         var1.println("ofFireworkParticles:" + this.Pm);
         var1.println("ofBlockParticles:" + this.PZ);
         var1.println("ofBubbleColumnParticles:" + this.Pv);
         var1.println("ofDrippingWaterLava:" + this.PF);
         var1.println("ofAnimatedTerrain:" + this.PL);
         var1.println("ofAnimatedTextures:" + this.PA);
         var1.println("ofRainSplash:" + this.PN);
         var1.println("ofLagometer:" + this.rA);
         var1.println("ofShowFps:" + this.rC);
         var1.println("ofAutoSaveTicks:" + this.rL);
         var1.println("ofBetterGrass:" + this.rF);
         var1.println("ofConnectedTextures:" + this.ro);
         var1.println("ofWeather:" + this.rl);
         var1.println("ofSky:" + this.rH);
         var1.println("ofStars:" + this.ry);
         var1.println("ofSunMoon:" + this.rp);
         var1.println("ofVignette:" + this.rq);
         var1.println("ofChunkUpdates:" + this.rT);
         var1.println("ofChunkUpdatesDynamic:" + this.rt);
         var1.println("ofTime:" + this.rw);
         var1.println("ofAaLevel:" + this.rQ);
         var1.println("ofAfLevel:" + this.rN);
         var1.println("ofProfiler:" + this.rn);
         var1.println("ofBetterSnow:" + this.rI);
         var1.println("ofSwampColors:" + this.rf);
         var1.println("ofRandomEntities:" + this.rj);
         var1.println("ofCustomFonts:" + this.rV);
         var1.println("ofCustomColors:" + this.rg);
         var1.println("ofCustomItems:" + this.rK);
         var1.println("ofCustomSky:" + this.rR);
         var1.println("ofShowCapes:" + this.rY);
         var1.println("ofNaturalTextures:" + this.rD);
         var1.println("ofEmissiveTextures:" + this.rU);
         var1.println("ofLazyChunkLoading:" + this.rd);
         var1.println("ofRenderRegions:" + this.rk);
         var1.println("ofSmartAnimations:" + this.rW);
         var1.println("ofDynamicFov:" + this.Pr);
         var1.println("ofAlternateBlocks:" + this.PP);
         var1.println("ofDynamicLights:" + this.PB);
         var1.println("ofScreenshotSize:" + this.PG);
         var1.println("ofCustomEntityModels:" + this.PS);
         var1.println("ofCustomGuis:" + this.Ps);
         var1.println("ofShowGlErrors:" + this.PE);
         var1.println("ofFastMath:" + this.re);
         var1.println("ofFastRender:" + this.ra);
         var1.println("ofTranslucentBlocks:" + this.ri);
         var1.println("ofChatBackground:" + this.Pb);
         var1.println("ofChatShadow:" + this.PM);
         var1.println("key_" + this.Pf.catch_() + ":" + this.Pf.final_());
         var1.close();
      } catch (Exception var2) {
         rrbb_3.protected_("Failed to save options");
         var2.printStackTrace();
      }
   }

   public void final_() {
      this.O = !this.O;
   }

   public VZ volatile_() {
      return this.PU;
   }

   public void native_() {
      this.j.break_(this.instanceof_);
      this.j.x();
   }
}
