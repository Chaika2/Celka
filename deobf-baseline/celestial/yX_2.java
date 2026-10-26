package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class yX_2 implements AutoCloseable, rAn_1 {
   private static final Logger id_implements = LogManager.getLogger();
   private static final rqO_2 id_finally = new rqO_2("textures/environment/moon_phases.png");
   private static final rqO_2 id_extends = new rqO_2("textures/environment/sun.png");
   private static final rqO_2 id_native = new rqO_2("textures/environment/clouds.png");
   private static final rqO_2 id_volatile = new rqO_2("textures/environment/end_sky.png");
   private static final rqO_2 id_final = new rqO_2("textures/misc/forcefield.png");
   private static final rqO_2 id_package = new rqO_2("textures/environment/rain.png");
   private static final rqO_2 id_int = new rqO_2("textures/environment/snow.png");
   public static final rpr_3[] id_class = rpr_3.values();
   private final QY id_new;
   private final fY_2 id_continue;
   private final pg_3 id_super;
   private final yB_2 id_this;
   private gm_3 id_else;
   private Set<yQ_2> id_synchronized = new ObjectLinkedOpenHashSet();
   private ObjectList<yx_3> id_return = new ObjectArrayList(69696);
   private final Set<ryO_2> id_public = Sets.newHashSet();
   private yO_2 id_goto;
   private final jZ_2 id_while = ju_3.id_super;
   private jm_3 id_try;
   private jm_3 id_instanceof;
   private jm_3 id_throw;
   private boolean id_interface = true;
   private jm_3 id_char;
   private final HD id_abstract = new HD(100);
   private int id_long;
   private final Int2ObjectMap<la_3> id_float = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<la_3>> id_void = new Long2ObjectOpenHashMap();
   private final Map<rfH_2, NQ> id_static = Maps.newHashMap();
   private VC id_import;
   private Vq_1 id_short;
   private VC id_default;
   private VC id_const;
   private VC id_strictfp;
   private VC id_boolean;
   private VC id_transient;
   private Vq_1 id_for;
   private double id_double = Double.MIN_VALUE;
   private double id_switch = Double.MIN_VALUE;
   private double r = Double.MIN_VALUE;
   private int P = Integer.MIN_VALUE;
   private int B = Integer.MIN_VALUE;
   private int S = Integer.MIN_VALUE;
   private double s = Double.MIN_VALUE;
   private double E = Double.MIN_VALUE;
   private double G = Double.MIN_VALUE;
   private double b = Double.MIN_VALUE;
   private double M = Double.MIN_VALUE;
   private int O = Integer.MIN_VALUE;
   private int h = Integer.MIN_VALUE;
   private int X = Integer.MIN_VALUE;
   private rjU_2 J = rjU_2.id_class;
   private Vd_1 x;
   private yz_3 d;
   private final jZ_2 k = ju_3.id_private;
   private int W = -1;
   private int z;
   private int Q;
   private boolean N;
   private yt_3 c;
   private final rji_3[] u = new rji_3[8];
   private final rjJ_2 m = new rjJ_2(0.0, 0.0, 0.0);
   private double Z;
   private double v;
   private double F;
   private boolean L = true;
   private int A;
   private int n;
   private final float[] C = new float[1024];
   private final float[] l = new float[1024];
   public an_3 id_break;
   public Set id_byte = new LinkedHashSet();
   public Set id_protected = new LinkedHashSet();
   private Set<yQ_2> H = new ObjectLinkedOpenHashSet();
   private final Deque y = new ArrayDeque();
   private List<yx_3> p = new ArrayList<>(1024);
   private List<yx_3> q = new ArrayList<>(1024);
   private final ObjectList T = new ObjectArrayList(1024);
   private final List t = new ArrayList(1024);
   private final List w = new ArrayList(1024);
   private final ObjectList I = new ObjectArrayList(1024);
   private final List f = new ArrayList(1024);
   private final List j = new ArrayList(1024);
   private int V = 0;
   private int g = 0;
   private static final Set R = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(rpr_3.VALUES)));
   private int Y;
   private int o = 0;
   private final rrxF_2 K = new rrxF_2(xu_3.id_class.id_continue(), new rfH_2(0, 0, 0));
   public boolean id_throws = false;
   public boolean id_case = false;
   private boolean D = false;
   private static int U = 0;
   public int id_catch = -1;
   public static final int id_private = 201435902;
   private static boolean e = false;
   private final Map<String, List<an_3>> a = new HashMap<>();
   private final Map<HU, Map> i = new LinkedHashMap<>();
   private yt_3 rr;

   private void id_boolean() {
      if (U > 0) {
         this.id_return = new ObjectArrayList(this.id_return.size() + 16);
         this.p = new ArrayList<>(this.p.size() + 16);
         this.q = new ArrayList<>(this.q.size() + 16);
      } else {
         this.id_return.clear();
         this.p.clear();
         this.q.clear();
      }
   }

   public VC id_char() {
      return this.id_default;
   }

   private void id_byte(ly_3 var1) {
      lD_2 var2 = yb_3.id_class().id_byte();
      roE_2 var3 = this.id_else.id_instanceof();
      double var4 = (double)(((Qw_1)this.id_new.id_class[20]).id_break * 16);
      if (!(var1.id_break().id_break < var3.id_catch() - var4)
         || !(var1.id_break().id_break > var3.id_throws() + var4)
         || !(var1.id_break().id_protected < var3.id_private() - var4)
         || !(var1.id_break().id_protected > var3.id_case() + var4)) {
         if (rrbb_3.rs()) {
            rrdZ.u();
            rrdZ.id_class(rrdZ.Bj);
            rrdZ.id_class(rrdX.WORLD_BORDER);
         }

         double var6 = 1.0 - var3.id_class(var1.id_break().id_break, var1.id_break().id_protected) / var4;
         var6 = Math.pow(var6, 4.0);
         double var8 = var1.id_break().id_break;
         double var10 = var1.id_break().id_byte;
         double var12 = var1.id_break().id_protected;
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE, OP.ONE, MK.ZERO);
         this.id_continue.id_class(id_final);
         RenderSystem.depthMask(QY.d());
         RenderSystem.pushMatrix();
         int var14 = var3.id_protected().id_class();
         float var15 = (float)(var14 >> 16 & 0xFF) / 255.0F;
         float var16 = (float)(var14 >> 8 & 0xFF) / 255.0F;
         float var17 = (float)(var14 & 0xFF) / 255.0F;
         RenderSystem.color4f(var15, var16, var17, (float)var6);
         RenderSystem.polygonOffset(-3.0F, -3.0F);
         RenderSystem.enablePolygonOffset();
         RenderSystem.defaultAlphaFunc();
         RenderSystem.enableAlphaTest();
         RenderSystem.disableCull();
         float var18 = (float)(rqR_2.id_break() % 3000L) / 3000.0F;
         float var19 = 0.0F;
         float var20 = 0.0F;
         float var21 = 128.0F;
         var2.id_class(7, ju_3.id_synchronized);
         double var22 = Math.max((double)rfU_2.id_byte(var12 - var4), var3.id_case());
         double var24 = Math.min((double)rfU_2.id_throws(var12 + var4), var3.id_private());
         if (var8 > var3.id_catch() - var4) {
            float var26 = 0.0F;

            for (double var27 = var22; var27 < var24; var26 += 0.5F) {
               double var29 = Math.min(1.0, var24 - var27);
               float var31 = (float)var29 * 0.5F;
               this.id_class(var2, var8, var10, var12, var3.id_catch(), 256, var27, var18 + var26, var18 + 0.0F);
               this.id_class(var2, var8, var10, var12, var3.id_catch(), 256, var27 + var29, var18 + var31 + var26, var18 + 0.0F);
               this.id_class(var2, var8, var10, var12, var3.id_catch(), 0, var27 + var29, var18 + var31 + var26, var18 + 128.0F);
               this.id_class(var2, var8, var10, var12, var3.id_catch(), 0, var27, var18 + var26, var18 + 128.0F);
               var27++;
            }
         }

         if (var8 < var3.id_throws() + var4) {
            float var35 = 0.0F;

            for (double var38 = var22; var38 < var24; var35 += 0.5F) {
               double var41 = Math.min(1.0, var24 - var38);
               float var44 = (float)var41 * 0.5F;
               this.id_class(var2, var8, var10, var12, var3.id_throws(), 256, var38, var18 + var35, var18 + 0.0F);
               this.id_class(var2, var8, var10, var12, var3.id_throws(), 256, var38 + var41, var18 + var44 + var35, var18 + 0.0F);
               this.id_class(var2, var8, var10, var12, var3.id_throws(), 0, var38 + var41, var18 + var44 + var35, var18 + 128.0F);
               this.id_class(var2, var8, var10, var12, var3.id_throws(), 0, var38, var18 + var35, var18 + 128.0F);
               var38++;
            }
         }

         var22 = Math.max((double)rfU_2.id_byte(var8 - var4), var3.id_throws());
         var24 = Math.min((double)rfU_2.id_throws(var8 + var4), var3.id_catch());
         if (var12 > var3.id_private() - var4) {
            float var36 = 0.0F;

            for (double var39 = var22; var39 < var24; var36 += 0.5F) {
               double var42 = Math.min(1.0, var24 - var39);
               float var45 = (float)var42 * 0.5F;
               this.id_class(var2, var8, var10, var12, var39, 256, var3.id_private(), var18 + var36, var18 + 0.0F);
               this.id_class(var2, var8, var10, var12, var39 + var42, 256, var3.id_private(), var18 + var45 + var36, var18 + 0.0F);
               this.id_class(var2, var8, var10, var12, var39 + var42, 0, var3.id_private(), var18 + var45 + var36, var18 + 128.0F);
               this.id_class(var2, var8, var10, var12, var39, 0, var3.id_private(), var18 + var36, var18 + 128.0F);
               var39++;
            }
         }

         if (var12 < var3.id_case() + var4) {
            float var37 = 0.0F;

            for (double var40 = var22; var40 < var24; var37 += 0.5F) {
               double var43 = Math.min(1.0, var24 - var40);
               float var46 = (float)var43 * 0.5F;
               this.id_class(var2, var8, var10, var12, var40, 256, var3.id_case(), var18 + var37, var18 + 0.0F);
               this.id_class(var2, var8, var10, var12, var40 + var43, 256, var3.id_case(), var18 + var46 + var37, var18 + 0.0F);
               this.id_class(var2, var8, var10, var12, var40 + var43, 0, var3.id_case(), var18 + var46 + var37, var18 + 128.0F);
               this.id_class(var2, var8, var10, var12, var40, 0, var3.id_case(), var18 + var37, var18 + 128.0F);
               var40++;
            }
         }

         var2.id_finally();
         yk_3.id_class(var2);
         RenderSystem.enableCull();
         RenderSystem.disableAlphaTest();
         RenderSystem.polygonOffset(0.0F, 0.0F);
         RenderSystem.disablePolygonOffset();
         RenderSystem.enableAlphaTest();
         RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ONE, MK.ZERO);
         RenderSystem.disableBlend();
         RenderSystem.popMatrix();
         RenderSystem.depthMask(true);
         if (rrbb_3.rs()) {
            rrdZ.m();
            rrdZ.id_class(rrdX.NONE);
         }
      }
   }

   public void id_byte() {
      if (this.id_protected()) {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ZERO, MK.ONE);
         this.id_import.id_byte(this.id_new.id_else().id_extends(), this.id_new.id_else().id_native(), false);
         RenderSystem.disableBlend();
      }
   }

   public int id_int() {
      return this.z;
   }

   public VC id_long() {
      return this.id_strictfp;
   }

   public VC id_float() {
      return this.id_boolean;
   }

   public yX_2(QY var1, yB_2 var2) {
      this.id_new = var1;
      this.id_super = var1.id_case();
      this.id_this = var2;
      this.id_continue = var1.A();

      for (int var3 = 0; var3 < 32; var3++) {
         for (int var4 = 0; var4 < 32; var4++) {
            float var5 = (float)(var4 - 16);
            float var6 = (float)(var3 - 16);
            float var7 = rfU_2.id_byte(var5 * var5 + var6 * var6);
            this.C[var3 << 5 | var4] = -var6 / var7;
            this.l[var3 << 5 | var4] = var5 / var7;
         }
      }

      this.id_strictfp();
      this.id_const();
      this.id_default();
   }

   public gm_3 id_this() {
      return this.id_else;
   }

   public VC id_interface() {
      return this.id_import;
   }

   public void id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, xc_3 var4, int var5) {
      this.id_class(var2, (var5 & 8) != 0);
   }

   private void id_class(rfH_2 var1, boolean var2) {
      for (int var3 = var1.d_() - 1; var3 <= var1.d_() + 1; var3++) {
         for (int var4 = var1.b_() - 1; var4 <= var1.b_() + 1; var4++) {
            for (int var5 = var1.c_() - 1; var5 <= var1.c_() + 1; var5++) {
               this.id_class(var4 >> 4, var5 >> 4, var3 >> 4, var2);
            }
         }
      }
   }

   public static void id_class(
      lD_2 var0, double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15, float var16
   ) {
      var0.id_class(var1, var3, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var1, var3, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var1, var3, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var1, var3, var11).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var1, var9, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var1, var9, var11).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var1, var9, var11).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var1, var3, var11).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var9, var11).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var3, var11).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var3, var11).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var3, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var9, var11).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var9, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var9, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var3, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var1, var9, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var1, var3, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var1, var3, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var3, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var1, var3, var11).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var3, var11).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var3, var11).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var1, var9, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var1, var9, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var1, var9, var11).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var9, var5).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var9, var11).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var9, var11).id_class(var13, var14, var15, var16).id_class();
      var0.id_class(var7, var9, var11).id_class(var13, var14, var15, var16).id_class();
   }

   public static void id_class(
      Ml_1 var0,
      Ok_1 var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20
   ) {
      rjV_2 var21 = var0.id_byte().id_class();
      float var22 = (float)var2;
      float var23 = (float)var4;
      float var24 = (float)var6;
      float var25 = (float)var8;
      float var26 = (float)var10;
      float var27 = (float)var12;
      var1.id_class(var21, var22, var23, var24).id_class(var14, var19, var20, var17).id_class();
      var1.id_class(var21, var25, var23, var24).id_class(var14, var19, var20, var17).id_class();
      var1.id_class(var21, var22, var23, var24).id_class(var18, var15, var20, var17).id_class();
      var1.id_class(var21, var22, var26, var24).id_class(var18, var15, var20, var17).id_class();
      var1.id_class(var21, var22, var23, var24).id_class(var18, var19, var16, var17).id_class();
      var1.id_class(var21, var22, var23, var27).id_class(var18, var19, var16, var17).id_class();
      var1.id_class(var21, var25, var23, var24).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var26, var24).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var26, var24).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var22, var26, var24).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var22, var26, var24).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var22, var26, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var22, var26, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var22, var23, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var22, var23, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var23, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var23, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var23, var24).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var22, var26, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var26, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var23, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var26, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var26, var24).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var26, var27).id_class(var14, var15, var16, var17).id_class();
   }

   public void id_class(int var1, int var2, int var3) {
      for (int var4 = var3 - 1; var4 <= var3 + 1; var4++) {
         for (int var5 = var1 - 1; var5 <= var1 + 1; var5++) {
            for (int var6 = var2 - 1; var6 <= var2 + 1; var6++) {
               this.id_break(var5, var6, var4);
            }
         }
      }
   }

   public void id_class(int var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var7 = var3 - 1; var7 <= var6 + 1; var7++) {
         for (int var8 = var1 - 1; var8 <= var4 + 1; var8++) {
            for (int var9 = var2 - 1; var9 <= var5 + 1; var9++) {
               this.id_break(var8 >> 4, var9 >> 4, var7 >> 4);
            }
         }
      }
   }

   public void id_class(rfH_2 var1, xc_3 var2, xc_3 var3) {
      if (this.id_new.id_extends().id_class(var2, var3)) {
         this.id_class(var1.b_(), var1.c_(), var1.d_(), var1.b_(), var1.c_(), var1.d_());
      }
   }

   public void id_class(ly_3 var1) {
      if (rrxr_3.PD.id_byte()) {
         rrGL var2 = (rrGL)rrxr_3.id_private(this.id_else.id_break(), rrxr_3.PD);
         if (var2 != null) {
            var2.id_class(this.id_long, this.id_else, this.id_new, var1);
            return;
         }
      }

      float var27 = ((gm_3)this.id_new.id_class[56]).id_private(1.0F) / (QY.id_return() ? 1.0F : 2.0F);
      if (!rrbb_3.id_throw()) {
         var27 /= 2.0F;
      }

      if (!(var27 <= 0.0F) && rrbb_3.s()) {
         Random var3 = new Random((long)this.id_long * 312987231L);
         gm_3 var4 = (gm_3)this.id_new.id_class[56];
         rfH_2 var5 = new rfH_2(var1.id_break());
         rfH_2 var6 = null;
         int var7 = (int)(100.0F * var27 * var27) / (((Qw_1)this.id_new.id_class[20]).rE == Vm_1.DECREASED ? 2 : 1);

         for (int var8 = 0; var8 < var7; var8++) {
            int var9 = var3.nextInt(21) - 10;
            int var10 = var3.nextInt(21) - 10;
            rfH_2 var11 = var4.id_class(rKv_1.MOTION_BLOCKING, var5.id_break(var9, 0, var10)).id_break();
            rYG var12 = var4.id_implements(var11);
            if (var11.c_() > 0 && var11.c_() <= var5.c_() + 10 && var11.c_() >= var5.c_() - 10 && var12.id_byte() == rYJ.RAIN && var12.id_class(var11) >= 0.15F
               )
             {
               var6 = var11;
               if (((Qw_1)this.id_new.id_class[20]).rE == Vm_1.MINIMAL) {
                  break;
               }

               double var13 = var3.nextDouble();
               double var15 = var3.nextDouble();
               xc_3 var17 = var4.id_byte(var11);
               rXE var18 = var4.id_break(var11);
               rjC_2 var19 = var17.id_extends(var4, var11);
               double var20 = var19.id_class(rpB_2.Y, var13, var15);
               double var22 = (double)var18.id_class((rRq_1)var4, var11);
               double var24 = Math.max(var20, var22);
               rLO var26 = !var18.id_class(rlG_2.id_byte) && !var17.id_class(xu_3.bV) && !xn_3.id_private(var17) ? rLQ.id_for : rLQ.id_double;
               ((gm_3)this.id_new.id_class[56])
                  .id_class(var26, (double)var11.b_() + var13, (double)var11.c_() + var24, (double)var11.d_() + var15, 0.0, 0.0, 0.0);
            }
         }

         if (var6 != null && var3.nextInt(3) < this.n++) {
            this.n = 0;
            if (var6.c_() > var5.c_() + 1 && var4.id_class(rKv_1.MOTION_BLOCKING, var5).c_() > rfU_2.id_protected((float)var5.c_())) {
               ((gm_3)this.id_new.id_class[56]).id_class(var6, rqn_3.kt, rqL_2.WEATHER, 0.1F, 0.5F, false);
            } else {
               ((gm_3)this.id_new.id_class[56]).id_class(var6, rqn_3.kT, rqL_2.WEATHER, 0.2F, 1.0F, false);
            }
         }
      }
   }

   public static void id_class(Ml_1 var0, Ok_1 var1, rjC_2 var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12) {
      List var13 = var2.id_protected();
      int var14 = rfU_2.id_throws((double)var13.size() / 3.0);

      for (int var15 = 0; var15 < var13.size(); var15++) {
         rfl_3 var16 = (rfl_3)var13.get(var15);
         float var17 = ((float)var15 % (float)var14 + 1.0F) / (float)var14;
         float var18 = (float)(var15 / var14);
         float var19 = var17 * (float)(var18 == 0.0F ? 1 : 0);
         float var20 = var17 * (float)(var18 == 1.0F ? 1 : 0);
         float var21 = var17 * (float)(var18 == 2.0F ? 1 : 0);
         id_break(var0, var1, rjw_3.id_class(var16.id_protected(0.0, 0.0, 0.0)), var3, var5, var7, var19, var20, var21, 1.0F);
      }
   }

   private void id_class(Ml_1 var1, Ok_1 var2, an_3 var3, double var4, double var6, double var8, rfH_2 var10, xc_3 var11) {
      if (!rrbb_3.rC() || !rrMo_1.id_class(var11)) {
         id_break(
            var1,
            var2,
            var11.id_class(this.id_else, var10, rjm_3.id_class(var3)),
            (double)var10.b_() - var4,
            (double)var10.c_() - var6,
            (double)var10.d_() - var8,
            0.0F,
            0.0F,
            0.0F,
            0.4F
         );
      }
   }

   private void id_class(lD_2 var1, double var2, double var4, double var6, double var8, int var10, double var11, float var13, float var14) {
      var1.id_class(var8 - var2, (double)var10 - var4, var11 - var6).id_class(var13, var14).id_class();
   }

   public static void id_class(
      Ml_1 var0,
      lD_2 var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20
   ) {
      rjV_2 var21 = var0.id_byte().id_class();
      float var22 = (float)var2;
      float var23 = (float)var4;
      float var24 = (float)var6;
      float var25 = (float)var8;
      float var26 = (float)var10;
      float var27 = (float)var12;
      var1.id_class(var21, var22, var23, var24).id_class(var14, var19, var20, var17).id_class();
      var1.id_class(var21, var25, var23, var24).id_class(var14, var19, var20, var17).id_class();
      var1.id_class(var21, var22, var23, var24).id_class(var18, var15, var20, var17).id_class();
      var1.id_class(var21, var22, var26, var24).id_class(var18, var15, var20, var17).id_class();
      var1.id_class(var21, var22, var23, var24).id_class(var18, var19, var16, var17).id_class();
      var1.id_class(var21, var22, var23, var27).id_class(var18, var19, var16, var17).id_class();
      var1.id_class(var21, var25, var23, var24).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var26, var24).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var26, var24).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var22, var26, var24).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var22, var26, var24).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var22, var26, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var22, var26, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var22, var23, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var22, var23, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var23, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var23, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var23, var24).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var22, var26, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var26, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var23, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var26, var27).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var26, var24).id_class(var14, var15, var16, var17).id_class();
      var1.id_class(var21, var25, var26, var27).id_class(var14, var15, var16, var17).id_class();
   }

   public static void id_class(
      Ml_1 var0, Ok_1 var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14, float var15, float var16, float var17
   ) {
      id_class(var0, var1, var2, var4, var6, var8, var10, var12, var14, var15, var16, var17, var14, var15, var16);
   }

   public static void id_class(Ml_1 var0, lD_2 var1, rfl_3 var2, float var3, float var4, float var5, float var6) {
      id_class(
         var0, var1, var2.id_class, var2.id_break, var2.id_byte, var2.id_protected, var2.id_throws, var2.id_case, var3, var4, var5, var6, var3, var4, var5
      );
   }

   public static void id_class(Ml_1 var0, Ok_1 var1, rfl_3 var2, float var3, float var4, float var5, float var6) {
      id_class(
         var0, var1, var2.id_class, var2.id_break, var2.id_byte, var2.id_protected, var2.id_throws, var2.id_case, var3, var4, var5, var6, var3, var4, var5
      );
   }

   public void id_class(int var1, rfH_2 var2, int var3) {
      switch (var1) {
         case 1023:
         case 1028:
         case 1038:
            ly_3 var4 = ((Hh_1)this.id_new.id_class[16]).id_finally();
            if (var4.id_private()) {
               double var5 = (double)var2.b_() - var4.id_break().id_break;
               double var7 = (double)var2.c_() - var4.id_break().id_byte;
               double var9 = (double)var2.d_() - var4.id_break().id_protected;
               double var11 = Math.sqrt(var5 * var5 + var7 * var7 + var9 * var9);
               double var13 = var4.id_break().id_break;
               double var15 = var4.id_break().id_byte;
               double var17 = var4.id_break().id_protected;
               if (var11 > 0.0) {
                  var13 += var5 / var11 * 2.0;
                  var15 += var7 / var11 * 2.0;
                  var17 += var9 / var11 * 2.0;
               }

               if (var1 == 1023) {
                  this.id_else.id_class(var13, var15, var17, rqn_3.WE, rqL_2.HOSTILE, 1.0F, 1.0F, false);
               } else if (var1 == 1038) {
                  this.id_else.id_class(var13, var15, var17, rqn_3.BR, rqL_2.HOSTILE, 1.0F, 1.0F, false);
               } else {
                  this.id_else.id_class(var13, var15, var17, rqn_3.Bm, rqL_2.HOSTILE, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void id_class(Collection<ryO_2> var1, Collection<ryO_2> var2) {
      synchronized (this.id_public) {
         this.id_public.removeAll(var1);
         this.id_public.addAll(var2);
      }
   }

   private Vm_1 id_class(boolean var1) {
      Vm_1 var2 = ((Qw_1)this.id_new.id_class[20]).rE;
      if (var1 && var2 == Vm_1.MINIMAL && this.id_else.id_int.nextInt(10) == 0) {
         var2 = Vm_1.DECREASED;
      }

      if (var2 == Vm_1.DECREASED && this.id_else.id_int.nextInt(3) == 0) {
         var2 = Vm_1.MINIMAL;
      }

      return var2;
   }

   public static int id_class(rRp_1 var0, rfH_2 var1) {
      return id_class(var0, var0.id_byte(var1), var1);
   }

   public yQ_2 id_class(rfH_2 var1) {
      return this.id_goto.id_class(var1);
   }

   @Override
   public void id_class(rAL var1) {
      this.id_continue.id_class(id_final);
      RenderSystem.texParameter(3553, 10242, 10497);
      RenderSystem.texParameter(3553, 10243, 10497);
      RenderSystem.bindTexture(0);
      this.id_break();
      if (QY.d()) {
         this.id_import();
      }
   }

   private void id_class(ly_3 var1, yt_3 var2, boolean var3) {
      if (this.id_catch == 0) {
         this.id_break(var1, var2, var3);
         ((cq_3)this.id_new.id_class[19]).id_throws().id_break(201435902);
      }

      if (this.id_catch > -1) {
         this.id_catch--;
      }
   }

   public void id_class(rhd_3 var1, int var2, rfH_2 var3, int var4) {
      Random var5 = this.id_else.id_int;
      switch (var2) {
         case 1000:
            this.id_else.id_class(var3, rqn_3.Py, rqL_2.BLOCKS, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.id_else.id_class(var3, rqn_3.Pp, rqL_2.BLOCKS, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.id_else.id_class(var3, rqn_3.Pq, rqL_2.BLOCKS, 1.0F, 1.2F, false);
            break;
         case 1003:
            this.id_else.id_class(var3, rqn_3.BC, rqL_2.NEUTRAL, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.id_else.id_class(var3, rqn_3.SX, rqL_2.NEUTRAL, 1.0F, 1.2F, false);
            break;
         case 1005:
            this.id_else.id_class(var3, rqn_3.En, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1006:
            this.id_else.id_class(var3, rqn_3.WW, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1007:
            this.id_else.id_class(var3, rqn_3.WQ, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1008:
            this.id_else.id_class(var3, rqn_3.Ss, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1009:
            this.id_else.id_class(var3, rqn_3.Sk, rqL_2.BLOCKS, 0.5F, 2.6F + (var5.nextFloat() - var5.nextFloat()) * 0.8F, false);
            break;
         case 1010:
            if (rdb_3.id_break(var4) instanceof rdR_2) {
               if (rrxr_3.Bz.id_byte()) {
                  this.id_class(((rdR_2)rdb_3.id_break(var4)).id_return(), var3, (rdR_2)rdb_3.id_break(var4));
               } else {
                  this.id_class(((rdR_2)rdb_3.id_break(var4)).id_return(), var3);
               }
            } else {
               this.id_class(null, var3);
            }
            break;
         case 1011:
            this.id_else.id_class(var3, rqn_3.EA, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1012:
            this.id_else.id_class(var3, rqn_3.Wk, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1013:
            this.id_else.id_class(var3, rqn_3.Wz, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1014:
            this.id_else.id_class(var3, rqn_3.SS, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1015:
            this.id_else.id_class(var3, rqn_3.sB, rqL_2.HOSTILE, 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.id_else.id_class(var3, rqn_3.sP, rqL_2.HOSTILE, 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.id_else.id_class(var3, rqn_3.BA, rqL_2.HOSTILE, 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.id_else.id_class(var3, rqn_3.D, rqL_2.HOSTILE, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.id_else.id_class(var3, rqn_3.Wj, rqL_2.HOSTILE, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.id_else.id_class(var3, rqn_3.WV, rqL_2.HOSTILE, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.id_else.id_class(var3, rqn_3.Wg, rqL_2.HOSTILE, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.id_else.id_class(var3, rqn_3.ke, rqL_2.HOSTILE, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.id_else.id_class(var3, rqn_3.Wr, rqL_2.HOSTILE, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.id_else.id_class(var3, rqn_3.F, rqL_2.NEUTRAL, 0.05F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.id_else.id_class(var3, rqn_3.Wa, rqL_2.HOSTILE, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.id_else.id_class(var3, rqn_3.zE, rqL_2.NEUTRAL, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.id_else.id_class(var3, rqn_3.id_throw, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.id_else.id_class(var3, rqn_3.id_void, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.id_else.id_class(var3, rqn_3.id_abstract, rqL_2.BLOCKS, 0.3F, this.id_else.id_int.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.id_new.c().id_class(Np_1.id_byte(rqn_3.hK, var5.nextFloat() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.id_else.id_class(var3, rqn_3.ro, rqL_2.BLOCKS, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.id_else.id_class(var3, rqn_3.rY, rqL_2.BLOCKS, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.id_else.id_class(var3, rqn_3.rO, rqL_2.BLOCKS, 1.0F, 1.0F, false);
            break;
         case 1036:
            this.id_else.id_class(var3, rqn_3.ET, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1037:
            this.id_else.id_class(var3, rqn_3.Et, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1039:
            this.id_else.id_class(var3, rqn_3.Oj, rqL_2.HOSTILE, 0.3F, this.id_else.id_int.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.id_else.id_class(var3, rqn_3.WR, rqL_2.NEUTRAL, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.id_else.id_class(var3, rqn_3.EW, rqL_2.NEUTRAL, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.id_else.id_class(var3, rqn_3.sZ, rqL_2.BLOCKS, 1.0F, this.id_else.id_int.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.id_else.id_class(var3, rqn_3.rS, rqL_2.BLOCKS, 1.0F, this.id_else.id_int.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.id_else.id_class(var3, rqn_3.xN, rqL_2.BLOCKS, 1.0F, this.id_else.id_int.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1500:
            xU_2.id_class(this.id_else, var3, var4 > 0);
            break;
         case 1501:
            this.id_else.id_class(var3, rqn_3.GS, rqL_2.BLOCKS, 0.5F, 2.6F + (var5.nextFloat() - var5.nextFloat()) * 0.8F, false);

            for (int var40 = 0; var40 < 8; var40++) {
               this.id_else
                  .id_class(rLQ.id_short, (double)var3.b_() + var5.nextDouble(), (double)var3.c_() + 1.2, (double)var3.d_() + var5.nextDouble(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.id_else.id_class(var3, rqn_3.Xn, rqL_2.BLOCKS, 0.5F, 2.6F + (var5.nextFloat() - var5.nextFloat()) * 0.8F, false);

            for (int var39 = 0; var39 < 5; var39++) {
               double var42 = (double)var3.b_() + var5.nextDouble() * 0.6 + 0.2;
               double var44 = (double)var3.c_() + var5.nextDouble() * 0.6 + 0.2;
               double var45 = (double)var3.d_() + var5.nextDouble() * 0.6 + 0.2;
               this.id_else.id_class(rLQ.id_double, var42, var44, var45, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.id_else.id_class(var3, rqn_3.Bg, rqL_2.BLOCKS, 1.0F, 1.0F, false);

            for (int var38 = 0; var38 < 16; var38++) {
               double var41 = (double)var3.b_() + (5.0 + var5.nextDouble() * 6.0) / 16.0;
               double var43 = (double)var3.c_() + 0.8125;
               double var11 = (double)var3.d_() + (5.0 + var5.nextDouble() * 6.0) / 16.0;
               this.id_else.id_class(rLQ.id_double, var41, var43, var11, 0.0, 0.0, 0.0);
            }
            break;
         case 2000:
            rpr_3 var6 = rpr_3.id_class(var4);
            int var7 = var6.id_implements();
            int var8 = var6.id_finally();
            int var9 = var6.id_extends();
            double var10 = (double)var3.b_() + (double)var7 * 0.6 + 0.5;
            double var12 = (double)var3.c_() + (double)var8 * 0.6 + 0.5;
            double var14 = (double)var3.d_() + (double)var9 * 0.6 + 0.5;

            for (int var46 = 0; var46 < 10; var46++) {
               double var48 = var5.nextDouble() * 0.2 + 0.01;
               double var50 = var10 + (double)var7 * 0.01 + (var5.nextDouble() - 0.5) * (double)var9 * 0.5;
               double var51 = var12 + (double)var8 * 0.01 + (var5.nextDouble() - 0.5) * (double)var8 * 0.5;
               double var53 = var14 + (double)var9 * 0.01 + (var5.nextDouble() - 0.5) * (double)var7 * 0.5;
               double var54 = (double)var7 * var48 + var5.nextGaussian() * 0.01;
               double var55 = (double)var8 * var48 + var5.nextGaussian() * 0.01;
               double var62 = (double)var9 * var48 + var5.nextGaussian() * 0.01;
               this.id_class(rLQ.id_double, var50, var51, var53, var54, var55, var62);
            }
            break;
         case 2001:
            xc_3 var16 = xd_3.id_class(var4);
            if (!var16.id_catch()) {
               zr_3 var47 = var16.id_package();
               if (rrxr_3.c.id_byte()) {
                  var47 = (zr_3)rrxr_3.id_private(var16, rrxr_3.c, this.id_else, var3, null);
               }

               this.id_else.id_class(var3, var47.id_byte(), rqL_2.BLOCKS, (var47.id_class() + 1.0F) / 2.0F, var47.id_break() * 0.8F, false);
            }

            if (rrbb_3.M()) {
               ((Cy_1)this.id_new.id_class[12]).id_class(var3, var16);
            }
            break;
         case 2002:
         case 2007:
            rjU_2 var17 = rjU_2.id_protected(var3);

            for (int var18 = 0; var18 < 8; var18++) {
               this.id_class(
                  new rLk_1(rLQ.id_void, new rdn_3(rdy_3.kk)),
                  var17.id_break,
                  var17.id_byte,
                  var17.id_protected,
                  var5.nextGaussian() * 0.15,
                  var5.nextDouble() * 0.2,
                  var5.nextGaussian() * 0.15
               );
            }

            float var49 = (float)(var4 >> 16 & 0xFF) / 255.0F;
            float var19 = (float)(var4 >> 8 & 0xFF) / 255.0F;
            float var20 = (float)(var4 >> 0 & 0xFF) / 255.0F;
            rLO var21 = var2 == 2007 ? rLQ.id_float : rLQ.id_int;

            for (int var52 = 0; var52 < 100; var52++) {
               double var23 = var5.nextDouble() * 4.0;
               double var25 = var5.nextDouble() * Math.PI * 2.0;
               double var27 = Math.cos(var25) * var23;
               double var61 = 0.01 + var5.nextDouble() * 0.5;
               double var64 = Math.sin(var25) * var23;
               CH var66 = this.id_break(
                  var21,
                  var21.id_protected().id_throws(),
                  var17.id_break + var27 * 0.1,
                  var17.id_byte + 0.3,
                  var17.id_protected + var64 * 0.1,
                  var27,
                  var61,
                  var64
               );
               if (var66 != null) {
                  float var34 = 0.75F + var5.nextFloat() * 0.25F;
                  var66.id_class(var49 * var34, var19 * var34, var20 * var34);
                  var66.id_byte((float)var23);
               }
            }

            rrnd_3.id_class(var17, var4);
            this.id_else.id_class(var3, rqn_3.xt, rqL_2.NEUTRAL, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double var22 = (double)var3.b_() + 0.5;
            double var24 = (double)var3.c_();
            double var26 = (double)var3.d_() + 0.5;

            for (int var58 = 0; var58 < 8; var58++) {
               this.id_class(
                  new rLk_1(rLQ.id_void, new rdn_3(rdy_3.JT)),
                  var22,
                  var24,
                  var26,
                  var5.nextGaussian() * 0.15,
                  var5.nextDouble() * 0.2,
                  var5.nextGaussian() * 0.15
               );
            }

            for (double var59 = 0.0; var59 < Math.PI * 2; var59 += Math.PI / 20) {
               this.id_class(
                  rLQ.id_transient,
                  var22 + Math.cos(var59) * 5.0,
                  var24 - 0.4,
                  var26 + Math.sin(var59) * 5.0,
                  Math.cos(var59) * -5.0,
                  0.0,
                  Math.sin(var59) * -5.0
               );
               this.id_class(
                  rLQ.id_transient,
                  var22 + Math.cos(var59) * 5.0,
                  var24 - 0.4,
                  var26 + Math.sin(var59) * 5.0,
                  Math.cos(var59) * -7.0,
                  0.0,
                  Math.sin(var59) * -7.0
               );
            }
            break;
         case 2004:
            for (int var57 = 0; var57 < 20; var57++) {
               double var60 = (double)var3.b_() + 0.5 + (var5.nextDouble() - 0.5) * 2.0;
               double var63 = (double)var3.c_() + 0.5 + (var5.nextDouble() - 0.5) * 2.0;
               double var65 = (double)var3.d_() + 0.5 + (var5.nextDouble() - 0.5) * 2.0;
               this.id_else.id_class(rLQ.id_double, var60, var63, var65, 0.0, 0.0, 0.0);
               this.id_else.id_class(rLQ.id_try, var60, var63, var65, 0.0, 0.0, 0.0);
            }
            break;
         case 2005:
            rxW_2.id_class(this.id_else, var3, var4);
            break;
         case 2006:
            for (int var56 = 0; var56 < 200; var56++) {
               float var29 = var5.nextFloat() * 4.0F;
               float var30 = var5.nextFloat() * (float) (Math.PI * 2);
               double var31 = (double)(rfU_2.id_break(var30) * var29);
               double var33 = 0.01 + var5.nextDouble() * 0.5;
               double var35 = (double)(rfU_2.id_class(var30) * var29);
               CH var37 = this.id_break(
                  rLQ.id_implements, false, (double)var3.b_() + var31 * 0.1, (double)var3.c_() + 0.3, (double)var3.d_() + var35 * 0.1, var31, var33, var35
               );
               if (var37 != null) {
                  var37.id_byte(var29);
               }
            }

            if (var4 == 1) {
               this.id_else.id_class(var3, rqn_3.BZ, rqL_2.HOSTILE, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.id_else.id_class(rLQ.id_return, (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int var28 = 0; var28 < 8; var28++) {
               this.id_else
                  .id_class(rLQ.id_case, (double)var3.b_() + var5.nextDouble(), (double)var3.c_() + 1.2, (double)var3.d_() + var5.nextDouble(), 0.0, 0.0, 0.0);
            }
            break;
         case 3000:
            this.id_else.id_class(rLQ.id_synchronized, true, (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 0.0, 0.0, 0.0);
            this.id_else
               .id_class(var3, rqn_3.BV, rqL_2.BLOCKS, 10.0F, (1.0F + (this.id_else.id_int.nextFloat() - this.id_else.id_int.nextFloat()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.id_else.id_class(var3, rqn_3.BF, rqL_2.HOSTILE, 64.0F, 0.8F + this.id_else.id_int.nextFloat() * 0.3F, false);
      }
   }

   public void id_class(rLx_1 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.id_class(var1, var2, false, var3, var5, var7, var9, var11, var13);
   }

   public void id_class(rqA_2 var1, rfH_2 var2, rdR_2 var3) {
      NQ var4 = this.id_static.get(var2);
      if (var4 != null) {
         this.id_new.c().id_break(var4);
         this.id_static.remove(var2);
      }

      if (var1 != null) {
         rdR_2 var5 = rdR_2.id_class(var1);
         if (rrxr_3.Bz.id_byte()) {
            var5 = var3;
         }

         if (var5 != null) {
            ((cq_3)this.id_new.id_class[19]).id_class(var5.id_private());
         }

         Np_1 var6 = Np_1.id_class(var1, (double)var2.b_(), (double)var2.c_(), (double)var2.d_());
         this.id_static.put(var2, var6);
         this.id_new.c().id_class(var6);
      }

      this.id_class(this.id_else, var2, var1 != null);
   }

   public void id_class(rqA_2 var1, rfH_2 var2) {
      this.id_class(var1, var2, var1 == null ? null : rdR_2.id_class(var1));
   }

   private void id_class(int var1, int var2, int var3, boolean var4) {
      this.id_goto.id_class(var1, var2, var3, var4);
   }

   public void id_class(rLx_1 var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      try {
         this.id_break(var1, var2, var3, var4, var6, var8, var10, var12, var14);
      } catch (Throwable var19) {
         KY var17 = KY.id_class(var19, "Exception while adding particle");
         Ko_1 var18 = var17.id_class("Particle being added");
         var18.id_class("ID", rVL.id_switch.id_break(var1.id_protected()));
         var18.id_class("Parameters", var1.id_byte());
         var18.id_class("Position", () -> Ko_1.id_class(var4, var6, var8));
         throw new KU(var17);
      }
   }

   private <T extends rLx_1> void id_class(T var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.id_class(var1, var1.id_protected().id_throws(), var2, var4, var6, var8, var10, var12);
   }

   public static int id_class(rRp_1 var0, xc_3 var1, rfH_2 var2) {
      if (var1.id_throws(var0, var2)) {
         return 15728880;
      } else {
         int var3 = var0.id_class(rRo_1.SKY, var2);
         int var4 = var0.id_class(rRo_1.BLOCK, var2);
         int var5 = var1.id_continue(var0, var2);
         if (var4 < var5) {
            var4 = var5;
         }

         int var6 = var3 << 20 | var4 << 4;
         if (rrbb_3.rL() && var0 instanceof rRq_1 && (!e || !var1.id_implements(var0, var2))) {
            var6 = rrbg_3.id_class(var2, var6);
         }

         return var6;
      }
   }

   private yQ_2 id_class(rfH_2 var1, yQ_2 var2, rpr_3 var3, boolean var4, int var5) {
      yQ_2 var6 = var2.id_break(var3);
      if (var6 == null) {
         return null;
      } else if (var6.id_throws().c_() > var5) {
         return null;
      } else {
         if (var4) {
            rfH_2 var7 = var6.id_throws();
            int var8 = var1.b_() - var7.b_();
            int var9 = var1.d_() - var7.d_();
            int var10 = var8 * var8 + var9 * var9;
            if (var10 > this.g) {
               return null;
            }
         }

         return var6;
      }
   }

   public void id_class(ly_3 var1, yt_3 var2, boolean var3, int var4, boolean var5) {
      rjU_2 var6 = var1.id_break();
      if (((Qw_1)this.id_new.id_class[20]).id_break != this.W) {
         this.id_throws();
      }

      double var7 = ((cb_3)this.id_new.id_class[57]).rx() - this.id_double;
      double var9 = ((cb_3)this.id_new.id_class[57]).re() - this.id_switch;
      double var11 = ((cb_3)this.id_new.id_class[57]).BO() - this.r;
      if (this.P != (Integer)((cb_3)this.id_new.id_class[57]).id_throws[51]
         || this.B != (Integer)((cb_3)this.id_new.id_class[57]).id_throws[52]
         || this.S != (Integer)((cb_3)this.id_new.id_class[57]).id_throws[53]
         || var7 * var7 + var9 * var9 + var11 * var11 > 16.0) {
         this.id_double = ((cb_3)this.id_new.id_class[57]).rx();
         this.id_switch = ((cb_3)this.id_new.id_class[57]).re();
         this.r = ((cb_3)this.id_new.id_class[57]).BO();
         this.P = (Integer)((cb_3)this.id_new.id_class[57]).id_throws[51];
         this.B = (Integer)((cb_3)this.id_new.id_class[57]).id_throws[52];
         this.S = (Integer)((cb_3)this.id_new.id_class[57]).id_throws[53];
         this.id_goto.id_class(((cb_3)this.id_new.id_class[57]).rx(), ((cb_3)this.id_new.id_class[57]).BO());
      }

      if (rrbb_3.rL()) {
         rrbg_3.id_class(this);
      }

      this.d.id_class(var6);
      rfH_2 var13 = var1.id_byte();
      yQ_2 var14 = this.id_goto.id_class(var13);
      byte var15 = 16;
      rfH_2 var16 = new rfH_2(rfU_2.id_byte(var6.id_break / 16.0) * 16, rfU_2.id_byte(var6.id_byte / 16.0) * 16, rfU_2.id_byte(var6.id_protected / 16.0) * 16);
      float var17 = var1.id_protected();
      float var18 = var1.id_throws();
      this.L = this.L
         || !this.id_synchronized.isEmpty()
         || var6.id_break != this.s
         || var6.id_byte != this.E
         || var6.id_protected != this.G
         || (double)var17 != this.b
         || (double)var18 != this.M;
      this.s = var6.id_break;
      this.E = var6.id_byte;
      this.G = var6.id_protected;
      this.b = (double)var17;
      this.M = (double)var18;
      int var19 = this.id_continue();
      if (var19 != this.o) {
         this.o = var19;
         this.L = true;
      }

      an_3 var20 = var1.id_catch();
      int var21 = 256;
      if (!rrxd_3.id_class()) {
         this.L = true;
      }

      if (!var3 && this.L && rrbb_3.rt() && !rrdZ.id_new) {
         var21 = rrxd_3.id_class(this.id_else, var20, this.W);
      }

      yQ_2 var22 = this.id_goto.id_class(new rfH_2(var20.rx(), var20.re(), var20.BO()));
      if (rrdZ.id_new) {
         this.id_return = this.I;
         this.p = this.f;
         this.q = this.j;
         if (!var3 && this.L) {
            this.id_boolean();
            if (var22 != null && var22.id_throws().c_() > var21) {
               this.p.add(var22.id_package());
            }

            Iterator var23 = rrdC.id_class(this.id_else, 0.0, var20, this.W, this.id_goto);

            while (var23.hasNext()) {
               yQ_2 var24 = (yQ_2)var23.next();
               if (var24 != null && var24.id_throws().c_() <= var21) {
                  yx_3 var25 = var24.id_package();
                  if (!var24.id_class.get().id_class()) {
                     this.id_return.add(var25);
                  }

                  if (rrWM.id_class(var24.id_volatile())) {
                     this.p.add(var25);
                  }

                  if (var24.id_byte().id_break().size() > 0) {
                     this.q.add(var25);
                  }
               }
            }
         }
      } else {
         this.id_return = this.T;
         this.p = this.t;
         this.q = this.w;
      }

      if (!var3 && this.L && !rrdZ.id_new) {
         this.L = false;
         this.id_boolean();
         this.y.clear();
         Deque var41 = this.y;
         an_3.id_case(rfU_2.id_class((double)((Qw_1)this.id_new.id_class[20]).id_break / 8.0, 1.0, 2.5) * (double)((Qw_1)this.id_new.id_class[20]).id_byte);
         boolean var43 = (Boolean)this.id_new.id_class[82];
         rfH_2 var45 = var1.id_byte();
         int var26 = var45.c_();
         int var27 = var26 >> 4 << 4;
         if (var27 > var21) {
            var21 += 16;
            if (var27 > var21 && var21 < 256) {
               if (var22 != null) {
                  this.p.add(var22.id_package());
               }

               rjU_2 var28 = new rjU_2((double)var45.b_(), (double)var21, (double)var45.d_());
               rjU_2 var29 = new rjU_2(var28.id_class(), var28.id_break(), var28.id_byte());
               rje_3 var30 = var1.id_volatile();
               rje_3 var31 = new rje_3(var30.id_class(), 0.0F, var30.id_byte());
               if (!var31.id_protected()) {
                  var31 = new rje_3(1.0F, 0.0F, 0.0F);
               }

               double var32 = (double)(var31.id_class() * 16.0F);
               double var34 = (double)(var31.id_byte() * 16.0F);
               double var36 = (double)(this.W * 16);

               for (double var38 = var36 * var36; var29.id_implements(var28) < var38; var29 = var29.id_break(var32, 0.0, var34)) {
                  yQ_2 var40 = this.id_goto.id_class(new rfH_2(var29));
                  if (var40 == null) {
                     break;
                  }

                  if (var2.id_class(var40.id_break)) {
                     var40.id_class(var4);
                     var41.add(new yx_3(var40, null, 0));
                     break;
                  }
               }
            }
         }

         if (var41.isEmpty()) {
            if (var14 != null && var14.id_throws().c_() <= var21) {
               if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_()) {
                  var43 = false;
               } else if (var5 && this.id_else.id_byte(var13).id_implements(this.id_else, var13)) {
                  var43 = false;
               }

               var14.id_class(var4);
               var41.add(new yx_3(var14, null, 0));
            } else {
               int var49 = var16.c_() > 0 ? Math.min(var21, 248) : 8;
               if (var22 != null) {
                  this.p.add(var22.id_package());
               }

               int var52 = rfU_2.id_byte(var6.id_break / 16.0) * 16;
               int var54 = rfU_2.id_byte(var6.id_protected / 16.0) * 16;
               ArrayList var56 = Lists.newArrayList();

               for (int var58 = -this.W; var58 <= this.W; var58++) {
                  for (int var33 = -this.W; var33 <= this.W; var33++) {
                     yQ_2 var61 = this.id_goto.id_class(new rfH_2(var52 + (var58 << 4) + 8, var49, var54 + (var33 << 4) + 8));
                     if (var61 != null && var2.id_class(var61.id_break)) {
                        var61.id_class(var4);
                        yx_3 var35 = var61.id_package();
                        var35.id_class(null, 0, 0);
                        var56.add(var35);
                     }
                  }
               }

               var56.sort(Comparator.comparingDouble(var1x -> var13.id_private(var1x.id_class.id_throws().id_break(8, 8, 8))));
               var41.addAll(var56);
            }
         }

         boolean var50 = rrbb_3.id_return();

         while (!var41.isEmpty()) {
            yx_3 var53 = (yx_3)var41.poll();
            yQ_2 var55 = var53.id_class;
            rpr_3 var57 = var53.id_break;
            yZ_2 var59 = var55.id_class.get();
            if (!var59.id_class() || var55.id_catch()) {
               this.id_return.add(var53);
            }

            if (rrWM.id_class(var55.id_volatile())) {
               this.p.add(var53);
            }

            if (var59.id_break().size() > 0) {
               this.q.add(var53);
            }

            rpr_3[] var60 = var43 ? rrxd_3.id_class(var53.id_byte) : rpr_3.VALUES;

            for (rpr_3 var37 : var60) {
               if (!var43 || var57 == null || var59.id_class(var57.id_case(), var37)) {
                  yQ_2 var65 = this.id_class(var16, var55, var37, var50, var21);
                  if (var65 != null && var65.id_class(var4) && var2.id_class(var65.id_break)) {
                     int var39 = var53.id_byte | 1 << var37.ordinal();
                     yx_3 var66 = var65.id_package();
                     var66.id_class(var37, var39, var53.id_protected + 1);
                     var41.add(var66);
                  }
               }
            }
         }
      }

      Set var42 = this.id_synchronized;
      this.id_synchronized = this.H;
      this.H = var42;
      this.id_synchronized.clear();
      ObjectListIterator var44 = this.id_return.iterator();

      while (var44.hasNext()) {
         yx_3 var46 = (yx_3)var44.next();
         yQ_2 var47 = var46.id_class;
         if (var47.id_catch() || var42.contains(var47)) {
            this.L = true;
            rfH_2 var48 = var47.id_throws();
            boolean var51 = (double)rrWD.id_class(var16, (float)(var48.b_() + 8), (float)(var48.c_() + 8), (float)(var48.d_() + 8)) < 768.0;
            if (!var47.id_private() && !var51) {
               this.id_synchronized.add(var47);
            } else if (!var47.id_native()) {
               this.id_protected.add(var47);
            } else {
               this.d.id_class(var47);
               var47.id_case();
            }
         }
      }

      this.id_synchronized.addAll(var42);
   }

   public void id_class(Ml_1 var1) {
      if (!var1.id_protected()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   public void id_class(Ml_1 var1, float var2, long var3, boolean var5, ly_3 var6, Hh_1 var7, HQ var8, rjV_2 var9) {
      jz_3.id_break.id_class(this.id_else, this.id_new.A(), (cm_3)this.id_new.id_class[15], var6, (rjG_2)this.id_new.id_class[64]);
      this.id_super.id_class(this.id_else, var6, (an_3)this.id_new.id_class[63]);
      ((gm_3)this.id_new.id_class[56]).id_native().id_class().id_class(Integer.MAX_VALUE, true, true);
      rjU_2 var10 = var6.id_break();
      double var11 = var10.id_class();
      double var13 = var10.id_break();
      double var15 = var10.id_byte();
      rjV_2 var17 = var1.id_byte().id_class();
      boolean var18 = this.c != null;
      yt_3 var19;
      if (var18) {
         var19 = this.c;
         var19.id_class(this.m.id_class, this.m.id_break, this.m.id_byte);
      } else {
         var19 = new yt_3(var17, var9);
         var19.id_class(var11, var13, var15);
      }

      this.rr = var19;
      if (this.N) {
         this.id_class(var17, var9, var10.id_break, var10.id_byte, var10.id_protected, var18 ? new yt_3(var17, var9) : var19);
         this.N = false;
      }

      if (rrbb_3.rs()) {
         rrdZ.id_class(0, 0, this.id_new.id_else().id_extends(), this.id_new.id_else().id_native());
      } else {
         RenderSystem.viewport(0, 0, this.id_new.id_else().id_extends(), this.id_new.id_else().id_native());
      }

      HE.id_class(var6, var2, (gm_3)this.id_new.id_class[56], ((Qw_1)this.id_new.id_class[20]).id_break, var7.id_break(var2));
      RenderSystem.clear(16640, (Boolean)QY.id_break[2]);
      boolean var20 = rrbb_3.rs();
      if (var20) {
         rrdZ.id_throw();
         rrdZ.id_class(var1, var6, var2);
         rrdZ.id_interface();
      }

      var19.id_class = rrbb_3.rs() && !rrdZ.id_return();
      float var21 = var7.id_implements();
      boolean var22 = ((gm_3)this.id_new.id_class[56]).id_break().id_class(rfU_2.id_byte(var11), rfU_2.id_byte(var13))
         || ((cq_3)this.id_new.id_class[19]).id_extends().id_case();
      if ((rrbb_3.Z() || rrbb_3.v() || rrbb_3.n()) && !rrdZ.id_new) {
         HE.id_class(var6, HG.FOG_SKY, var21, var22, var2);
         if (var20) {
            rrdZ.id_short();
         }

         this.id_class(var1, var2);
         if (var20) {
            rrdZ.id_default();
         }
      } else {
         MT.id_final();
      }

      HE.id_class(var6, HG.FOG_TERRAIN, Math.max(var21 - 16.0F, 32.0F), var22, var2);
      this.id_class(var6, var19, ((cb_3)this.id_new.id_class[57]).id_native());
      this.id_class(var6, var19, var18, this.A++, ((cb_3)this.id_new.id_class[57]).id_native());
      int var23 = ((Qw_1)this.id_new.id_class[20]).id_protected;
      long var24;
      if ((double)var23 == QF.id_extends.id_case()) {
         var24 = 0L;
      } else {
         var24 = (long)(1000000000 / var23);
      }

      long var26 = rqR_2.id_byte() - var3;
      long var28 = this.id_abstract.id_class(var26);
      long var30 = var28 * 3L / 2L;
      long var32 = rfU_2.id_class(var30, var24, 33333333L);
      this.id_class(var3 + var32);
      if (((Qw_1)this.id_new.id_class[20]).rJ) {
         GL11.glFinish();
      }

      if (rrbb_3.id_synchronized() && HE.id_protected) {
         MT.id_byte(false);
      }

      this.id_class(HU.id_case(), var1, var11, var13, var15);
      this.id_new.A().id_break(fJ_2.id_class).id_class(false, ((Qw_1)this.id_new.id_class[20]).id_instanceof > 0);
      this.id_class(HU.id_catch(), var1, var11, var13, var15);
      this.id_new.A().id_break(fJ_2.id_class).id_else();
      this.id_class(HU.id_private(), var1, var11, var13, var15);
      if (var20) {
         rrdL.id_protected();
      }

      if (this.id_else.id_break().id_throws()) {
         HF.id_class(var1.id_byte().id_class());
      } else {
         HF.id_break(var1.id_byte().id_class());
      }

      if (var20) {
         rrdZ.id_for();
      }

      qh_3.id_throws();
      U++;
      this.z = 0;
      this.Q = 0;
      this.Y = 0;
      if (this.id_const != null) {
         this.id_const.id_break((Boolean)QY.id_break[2]);
         this.id_const.id_class(this.id_new.B());
         this.id_new.B().id_class(false);
      }

      if (this.id_boolean != null) {
         this.id_boolean.id_break((Boolean)QY.id_break[2]);
      }

      if (this.id_protected()) {
         this.id_import.id_break((Boolean)QY.id_break[2]);
         this.id_new.B().id_class(false);
      }

      boolean var34 = false;
      Hd_1 var35 = this.id_this.id_break();
      if (rrbb_3.rB()) {
         rrxL_2.id_class();
      }

      for (yx_3 var37 : this.p) {
         yQ_2 var38 = var37.id_class;
         roJ_2 var39 = var38.id_volatile();

         for (an_3 var41 : var39.id_final()[var38.id_throws().c_() / 16]) {
            boolean var42 = var41 == (cb_3)this.id_new.id_class[57] && !((cb_3)this.id_new.id_class[57]).id_native();
            if ((this.id_super.id_class(var41, var19, var11, var13, var15) || var41.id_else((cb_3)this.id_new.id_class[57]))
               && (var41 != var6.id_catch() || var6.id_implements() || var6.id_catch() instanceof iB_2 && ((iB_2)var6.id_catch()).Sc())
               && (var41 != (cb_3)this.id_new.id_class[57] || var6.id_catch() == var41 || var42)) {
               String var43 = var41.getClass().getName();
               Object var44 = this.a.get(var43);
               if (var44 == null) {
                  var44 = new ArrayList();
                  this.a.put(var43, (List<an_3>)var44);
               }

               var44.add(var41);
            }
         }
      }

      for (List var61 : this.a.values()) {
         for (an_3 var68 : var61) {
            this.z++;
            if ((Integer)var68.id_throws[41] == 0) {
               Double var55 = var68.rx();
               var68.id_throws[34] = var55;
               Double var56 = var68.re();
               var68.id_throws[35] = var56;
               Double var57 = var68.BO();
               var68.id_throws[36] = var57;
            }

            Object var74;
            if (this.id_protected() && this.id_new.id_class(var68)) {
               var34 = true;
               Hc_1 var80 = this.id_this.id_protected();
               var74 = var80;
               int var85 = var68.rK();
               short var89 = 255;
               int var92 = var85 >> 16 & 0xFF;
               int var45 = var85 >> 8 & 0xFF;
               int var46 = var85 & 0xFF;
               var80.id_class(var92, var45, var46, 255);
            } else {
               var74 = var35;
            }

            this.id_break = var68;
            if (var20) {
               rrdZ.id_class(var68);
            }

            this.id_class(var68, var11, var13, var15, var2, var1, (Hx_1)var74);
            this.id_break = null;
         }

         var61.clear();
      }

      this.id_class(var1);
      var35.id_class(HU.id_break(fJ_2.id_class));
      var35.id_class(HU.id_byte(fJ_2.id_class));
      var35.id_class(HU.id_protected(fJ_2.id_class));
      var35.id_class(HU.id_implements(fJ_2.id_class));
      if (var20) {
         rrdZ.r();
         rrdZ.E();
      }

      jX_2.id_class();
      boolean var60 = rrxr_3.Pg.id_byte();
      yt_3 var62 = var19;

      for (yx_3 var69 : this.q) {
         List var75 = var69.id_class.id_byte().id_break();
         if (!var75.isEmpty()) {
            for (ryO_2 var86 : var75) {
               if (var60) {
                  rfl_3 var90 = (rfl_3)rrxr_3.id_private(var86, rrxr_3.Pg);
                  if (var90 != null && !var62.id_class(var90)) {
                     continue;
                  }
               }

               if (var20) {
                  rrdZ.id_class(var86);
               }

               rfH_2 var93 = var86.id_char();
               Object var94 = var35;
               var1.id_class();
               var1.id_class((double)var93.b_() - var11, (double)var93.c_() - var13, (double)var93.d_() - var15);
               SortedSet var96 = (SortedSet)this.id_void.get(var93.id_package());
               if (var96 != null && !var96.isEmpty()) {
                  int var47 = ((la_3)var96.last()).id_break();
                  if (var47 >= 0) {
                     MH var48 = var1.id_byte();
                     Oz_1 var49 = new Oz_1(this.id_this.id_byte().getBuffer(IC.id_extends.get(var47)), var48.id_class(), var48.id_break());
                     var94 = (Hx_1)var2x -> {
                        Ok_1 var3x = var35.getBuffer(var2x);
                        return var2x.id_interface() ? OQ.id_class(var49, var3x) : var3x;
                     };
                  }
               }

               jz_3.id_break.id_class(var86, var2, var1, (Hx_1)var94);
               var1.id_break();
               this.Y++;
            }
         }
      }

      synchronized (this.id_public) {
         for (ryO_2 var76 : this.id_public) {
            if (var60) {
               rfl_3 var82 = (rfl_3)rrxr_3.id_private(var76, rrxr_3.Pg);
               if (var82 != null && !var62.id_class(var82)) {
                  continue;
               }
            }

            if (var20) {
               rrdZ.id_class(var76);
            }

            rfH_2 var87 = var76.id_char();
            var1.id_class();
            var1.id_class((double)var87.b_() - var11, (double)var87.c_() - var13, (double)var87.d_() - var15);
            jz_3.id_break.id_class(var76, var2, var1, var35);
            var1.id_break();
            this.Y++;
         }
      }

      this.id_class(var1);
      var35.id_class(HU.id_case());
      var35.id_class(lp_3.id_catch());
      var35.id_class(lp_3.id_private());
      var35.id_class(lp_3.id_byte());
      var35.id_class(lp_3.id_protected());
      var35.id_class(lp_3.id_throws());
      var35.id_class(lp_3.id_case());
      var35.id_class(lp_3.id_class());
      this.id_this.id_protected().id_break();
      if (rrbb_3.rB()) {
         rrxL_2.id_break();
      }

      if (var34) {
         this.id_short.id_class(var2);
         this.id_new.B().id_class(false);
      }

      if (var20) {
         rrdZ.G();
      }

      this.id_throws = true;
      ObjectIterator var66 = this.id_void.long2ObjectEntrySet().iterator();

      while (var66.hasNext()) {
         Entry var71 = (Entry)var66.next();
         rfH_2 var77 = rfH_2.id_protected(var71.getLongKey());
         double var83 = (double)var77.b_() - var11;
         double var91 = (double)var77.c_() - var13;
         double var95 = (double)var77.d_() - var15;
         if (!(var83 * var83 + var91 * var91 + var95 * var95 > 1024.0)) {
            SortedSet var97 = (SortedSet)var71.getValue();
            if (var97 != null && !var97.isEmpty()) {
               int var98 = ((la_3)var97.last()).id_break();
               var1.id_class();
               var1.id_class((double)var77.b_() - var11, (double)var77.c_() - var13, (double)var77.d_() - var15);
               MH var99 = var1.id_byte();
               Oz_1 var50 = new Oz_1(this.id_this.id_byte().getBuffer(IC.id_extends.get(var98)), var99.id_class(), var99.id_break());
               this.id_new.id_synchronized().id_class(this.id_else.id_byte(var77), var77, this.id_else, var1, var50);
               var1.id_break();
            }
         }
      }

      this.id_throws = false;
      rrxn_3.id_break();
      U--;
      this.id_class(var1);
      rjG_2 var67 = (rjG_2)this.id_new.id_class[64];
      if (var5 && var67 != null && var67.id_byte() == rjM_2.BLOCK) {
         rfH_2 var72 = ((rff_3)var67).id_class();
         xc_3 var78 = this.id_else.id_byte(var72);
         if (var20) {
            rrdL.id_extends();
         }

         boolean var84;
         if (rrxr_3.Z.id_byte() && rrxr_3.rA.id_byte()) {
            var84 = !rrxr_3.id_break(rrxr_3.rA, this, var6, var67, var2, var1, var35)
               && !rrxr_3.id_break(var78, rrxr_3.Z, this.id_else, var72)
               && this.id_else.id_instanceof().id_class(var72);
         } else {
            var84 = !var78.id_catch() && this.id_else.id_instanceof().id_class(var72);
         }

         if (var84) {
            Ok_1 var88 = var35.getBuffer(HU.id_return());
            this.id_class(var1, var88, var6.id_catch(), var11, var13, var15, var72, var78);
         }

         if (var20) {
            var35.id_class(HU.id_return());
            rrdL.id_native();
         }
      } else if (var67 != null && var67.id_byte() == rjM_2.ENTITY) {
         rrxr_3.rA.id_class(this, var6, var67, var2, var1, var35);
      }

      RenderSystem.pushMatrix();
      RenderSystem.multMatrix(var1.id_byte().id_class());
      boolean var73 = MT.E();
      MT.id_instanceof();
      if (var20) {
         rrdL.id_volatile();
      }

      ((yK_2)this.id_new.id_class[17]).id_class(var1, var35, var11, var13, var15);
      RenderSystem.popMatrix();
      var35.id_class(lp_3.id_finally());
      var35.id_class(lp_3.id_class());
      var35.id_class(lp_3.id_break());
      var35.id_class(HU.id_final());
      var35.id_class(HU.id_package());
      var35.id_class(HU.id_new());
      var35.id_class(HU.id_continue());
      var35.id_class(HU.id_int());
      var35.id_class(HU.id_super());
      var35.id_class(HU.id_this());
      var35.id_class(HU.id_volatile());
      this.id_this.id_byte().id_break();
      MT.id_break(var73);
      if (var20) {
         var35.id_break();
         rrdL.id_final();
         rrdZ.x();
         rrdL.id_class(var7, var1, var6, var2);
         rrdZ.d();
      }

      if (this.id_for != null) {
         var35.id_class(HU.id_return());
         var35.id_break();
         this.id_default.id_break((Boolean)QY.id_break[2]);
         this.id_default.id_class(this.id_new.B());
         this.id_class(HU.id_implements(), var1, var11, var13, var15);
         this.id_class(HU.id_synchronized(), var1, var11, var13, var15);
         this.id_strictfp.id_break((Boolean)QY.id_break[2]);
         this.id_strictfp.id_class(this.id_new.B());
         Hn_1.id_double.id_class();
         ((Cy_1)this.id_new.id_class[12]).id_class(var1, var35, var8, var6, var2, var19);
         Hn_1.id_double.id_break();
      } else {
         if (var20) {
            rrdZ.k();
         }

         this.id_class(HU.id_implements(), var1, var11, var13, var15);
         if (var20) {
            rrdZ.W();
         }

         var35.id_class(HU.id_return());
         var35.id_break();
         this.id_class(HU.id_synchronized(), var1, var11, var13, var15);
         if (var20) {
            rrdZ.M();
         }

         ((Cy_1)this.id_new.id_class[12]).id_class(var1, var35, var8, var6, var2, var19);
         if (var20) {
            rrdZ.O();
         }
      }

      MT.id_byte(true);
      RenderSystem.pushMatrix();
      rjV_2 var79 = var1.id_byte().id_class();
      RenderSystem.multMatrix(var79);
      rrAU.id_class(var1, var79, var2);
      if (((Qw_1)this.id_new.id_class[20]).id_throws() != Vd_1.OFF) {
         if (this.id_for != null) {
            this.id_transient.id_break((Boolean)QY.id_break[2]);
            Hn_1.r.id_class();
            this.id_class(var1, var2, var11, var13, var15);
            Hn_1.r.id_break();
         } else {
            this.id_class(var1, var2, var11, var13, var15);
         }
      }

      if (this.id_for != null) {
         Hn_1.id_switch.id_class();
         this.id_class(var8, var2, var11, var13, var15);
         this.id_byte(var6);
         Hn_1.id_switch.id_break();
         this.id_for.id_class(var2);
         this.id_new.B().id_class(false);
      } else {
         RenderSystem.depthMask(false);
         if (rrbb_3.rs()) {
            MT.id_class(rrdZ.id_this());
         }

         if (var20) {
            rrdZ.X();
         }

         this.id_class(var8, var2, var11, var13, var15);
         if (var20) {
            rrdZ.J();
         }

         this.id_byte(var6);
         RenderSystem.depthMask(true);
      }

      this.id_break(var6);
      RenderSystem.shadeModel(7424);
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
      HE.id_class();
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var1, var2, var9);
   }

   private void id_class(lD_2 var1, float var2, boolean var3) {
      var1.id_class(7, ju_3.id_super);
      int var4 = (this.V / 64 + 1) * 64 + 64;

      for (int var5 = -var4; var5 <= var4; var5 += 64) {
         for (int var6 = -var4; var6 <= var4; var6 += 64) {
            float var7 = (float)var5;
            float var8 = (float)(var5 + 64);
            if (var3) {
               var8 = (float)var5;
               var7 = (float)(var5 + 64);
            }

            var1.id_class((double)var7, (double)var2, (double)var6).id_class();
            var1.id_class((double)var8, (double)var2, (double)var6).id_class();
            var1.id_class((double)var8, (double)var2, (double)(var6 + 64)).id_class();
            var1.id_class((double)var7, (double)var2, (double)(var6 + 64)).id_class();
         }
      }
   }

   public void id_class(gm_3 var1) {
      this.id_double = Double.MIN_VALUE;
      this.id_switch = Double.MIN_VALUE;
      this.r = Double.MIN_VALUE;
      this.P = Integer.MIN_VALUE;
      this.B = Integer.MIN_VALUE;
      this.S = Integer.MIN_VALUE;
      this.id_super.id_class(var1);
      this.id_else = var1;
      if (rrbb_3.rL()) {
         rrbg_3.id_class();
      }

      rrxd_3.id_break();
      this.K.id_class(null, null);
      rrWr_1.id_class(this.id_else);
      rrdZ.id_class(this.id_else);
      if (var1 != null) {
         this.id_throws();
      } else {
         this.id_synchronized.clear();
         this.H.clear();
         this.id_boolean();
         if (this.id_goto != null) {
            this.id_goto.id_class();
            this.id_goto = null;
         }

         if (this.d != null) {
            this.d.id_case();
         }

         this.d = null;
         this.id_public.clear();
      }
   }

   private void id_class(lD_2 var1) {
      Random var2 = new Random(10842L);
      var1.id_class(7, ju_3.id_super);

      for (int var3 = 0; var3 < 1500; var3++) {
         double var4 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var8 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var10 = (double)(0.15F + var2.nextFloat() * 0.1F);
         double var12 = var4 * var4 + var6 * var6 + var8 * var8;
         if (var12 < 1.0 && var12 > 0.01) {
            var12 = 1.0 / Math.sqrt(var12);
            var4 *= var12;
            var6 *= var12;
            var8 *= var12;
            double var14 = var4 * 100.0;
            double var16 = var6 * 100.0;
            double var18 = var8 * 100.0;
            double var20 = Math.atan2(var4, var8);
            double var22 = Math.sin(var20);
            double var24 = Math.cos(var20);
            double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
            double var28 = Math.sin(var26);
            double var30 = Math.cos(var26);
            double var32 = var2.nextDouble() * Math.PI * 2.0;
            double var34 = Math.sin(var32);
            double var36 = Math.cos(var32);

            for (int var38 = 0; var38 < 4; var38++) {
               double var39 = (double)((var38 & 2) - 1) * var10;
               double var41 = (double)((var38 + 1 & 2) - 1) * var10;
               double var43 = var39 * var36 - var41 * var34;
               double var45 = var41 * var36 + var39 * var34;
               double var47 = var43 * var28 + 0.0 * var30;
               double var49 = 0.0 * var28 - var43 * var30;
               double var51 = var49 * var22 - var45 * var24;
               double var53 = var45 * var22 + var49 * var24;
               var1.id_class(var14 + var51, var16 + var47, var18 + var53).id_class();
            }
         }
      }
   }

   public void id_class(int var1, int var2) {
      this.id_volatile();
      if (this.id_short != null) {
         this.id_short.id_class(var1, var2);
      }

      if (this.id_for != null) {
         this.id_for.id_class(var1, var2);
      }
   }

   public void id_class(Ml_1 var1, float var2, double var3, double var5, double var7) {
      if (!rrbb_3.id_abstract()) {
         if (rrxr_3.Po.id_byte()) {
            rrGv_1 var9 = (rrGv_1)rrxr_3.id_private(this.id_else.id_break(), rrxr_3.Po);
            if (var9 != null) {
               var9.id_class(this.id_long, var2, var1, this.id_else, this.id_new, var3, var5, var7);
               return;
            }
         }

         float var31 = this.id_else.id_break().id_class();
         if (!Float.isNaN(var31)) {
            if (rrbb_3.rs()) {
               rrdZ.id_boolean();
            }

            RenderSystem.disableCull();
            RenderSystem.enableBlend();
            RenderSystem.enableAlphaTest();
            RenderSystem.enableDepthTest();
            RenderSystem.defaultAlphaFunc();
            RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ONE, MK.ONE_MINUS_SRC_ALPHA);
            RenderSystem.enableFog();
            RenderSystem.depthMask(true);
            float var10 = 12.0F;
            float var11 = 4.0F;
            double var12 = 2.0E-4;
            double var14 = (double)(((float)this.id_long + var2) * 0.03F);
            double var16 = (var3 + var14) / 12.0;
            double var18 = (double)(var31 - (float)var5 + 0.33F);
            var18 += ((Qw_1)this.id_new.id_class[20]).ru * 128.0;
            double var20 = var7 / 12.0 + 0.33F;
            var16 -= (double)(rfU_2.id_byte(var16 / 2048.0) * 2048);
            var20 -= (double)(rfU_2.id_byte(var20 / 2048.0) * 2048);
            float var22 = (float)(var16 - (double)rfU_2.id_byte(var16));
            float var23 = (float)(var18 / 4.0 - (double)rfU_2.id_byte(var18 / 4.0)) * 4.0F;
            float var24 = (float)(var20 - (double)rfU_2.id_byte(var20));
            rjU_2 var25 = this.id_else.id_break(var2);
            int var26 = (int)Math.floor(var16);
            int var27 = (int)Math.floor(var18 / 4.0);
            int var28 = (int)Math.floor(var20);
            if (var26 != this.O
               || var27 != this.h
               || var28 != this.X
               || ((Qw_1)this.id_new.id_class[20]).id_throws() != this.x
               || this.J.id_implements(var25) > 2.0E-4) {
               this.O = var26;
               this.h = var27;
               this.X = var28;
               this.J = var25;
               this.x = ((Qw_1)this.id_new.id_class[20]).id_throws();
               this.id_interface = true;
            }

            if (this.id_interface) {
               this.id_interface = false;
               lD_2 var29 = yb_3.id_class().id_byte();
               if (this.id_char != null) {
                  this.id_char.close();
               }

               this.id_char = new jm_3(ju_3.id_try);
               this.id_class(var29, var16, var18, var20, var25);
               var29.id_finally();
               this.id_char.id_class(var29);
            }

            this.id_continue.id_class(id_native);
            var1.id_class();
            var1.id_class(12.0F, 1.0F, 12.0F);
            var1.id_class((double)(-var22), (double)var23, (double)(-var24));
            if (this.id_char != null) {
               this.id_char.id_class();
               ju_3.id_try.id_class(0L);
               int var35 = this.x == Vd_1.FANCY ? 0 : 1;

               for (int var30 = var35; var30 < 2; var30++) {
                  if (var30 == 0) {
                     RenderSystem.colorMask(false, false, false, false);
                  } else {
                     RenderSystem.colorMask(true, true, true, true);
                  }

                  this.id_char.id_class(var1.id_byte().id_class(), 7);
               }

               jm_3.id_break();
               ju_3.id_try.id_protected();
            }

            var1.id_break();
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.disableAlphaTest();
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
            RenderSystem.disableFog();
            if (rrbb_3.rs()) {
               rrdZ.id_transient();
            }
         }
      }
   }

   public void id_class(Ml_1 var1, float var2) {
      if (rrxr_3.PK.id_byte()) {
         rrGF var3 = (rrGF)rrxr_3.id_private(this.id_else.id_break(), rrxr_3.PK);
         if (var3 != null) {
            var3.id_class(this.id_long, var2, var1, this.id_else, this.id_new);
            return;
         }
      }

      if (((gm_3)this.id_new.id_class[56]).id_break().id_byte() == gA_2.END) {
         this.id_break(var1);
      } else if (((gm_3)this.id_new.id_class[56]).id_break().id_byte() == gA_2.NORMAL) {
         RenderSystem.disableTexture();
         boolean var20 = rrbb_3.rs();
         if (var20) {
            rrdZ.c();
         }

         rjU_2 var4 = this.id_else.id_class(((Hh_1)this.id_new.id_class[16]).id_finally().id_byte(), var2);
         var4 = rrbN_2.id_class(
            var4, (gm_3)this.id_new.id_class[56], this.id_new.id_catch().rx(), this.id_new.id_catch().re() + 1.0, this.id_new.id_catch().BO()
         );
         if (var20) {
            rrdZ.id_class(var4);
         }

         float var5 = (float)var4.id_break;
         float var6 = (float)var4.id_byte;
         float var7 = (float)var4.id_protected;
         HE.id_break();
         lD_2 var8 = yb_3.id_class().id_byte();
         RenderSystem.depthMask(false);
         RenderSystem.enableFog();
         if (var20) {
            rrdZ.F();
         }

         RenderSystem.color3f(var5, var6, var7);
         if (var20) {
            rrdZ.id_throws(var1);
         }

         if (rrbb_3.Z()) {
            this.id_instanceof.id_class();
            this.id_while.id_class(0L);
            this.id_instanceof.id_class(var1.id_byte().id_class(), 7);
            jm_3.id_break();
            this.id_while.id_protected();
         }

         RenderSystem.disableFog();
         if (var20) {
            rrdZ.L();
         }

         RenderSystem.disableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         float[] var9 = this.id_else.id_break().id_class(this.id_else.id_protected(var2), var2);
         if (var9 != null && rrbb_3.v()) {
            RenderSystem.disableTexture();
            if (var20) {
               rrdZ.c();
            }

            if (var20) {
               rrdZ.id_class(rrdX.SUNSET);
            }

            RenderSystem.shadeModel(7425);
            var1.id_class();
            var1.id_class(rje_3.id_break.id_byte(90.0F));
            float var10 = rfU_2.id_class(this.id_else.id_throws(var2)) < 0.0F ? 180.0F : 0.0F;
            var1.id_class(rje_3.id_case.id_byte(var10));
            var1.id_class(rje_3.id_case.id_byte(90.0F));
            float var11 = var9[0];
            float var12 = var9[1];
            float var13 = var9[2];
            rjV_2 var14 = var1.id_byte().id_class();
            var8.id_class(6, ju_3.id_this);
            var8.id_class(var14, 0.0F, 100.0F, 0.0F).id_class(var11, var12, var13, var9[3]).id_class();
            byte var15 = 16;

            for (int var16 = 0; var16 <= 16; var16++) {
               float var17 = (float)var16 * (float) (Math.PI * 2) / 16.0F;
               float var18 = rfU_2.id_class(var17);
               float var19 = rfU_2.id_break(var17);
               var8.id_class(var14, var18 * 120.0F, var19 * 120.0F, -var19 * 40.0F * var9[3]).id_class(var9[0], var9[1], var9[2], 0.0F).id_class();
            }

            var8.id_finally();
            yk_3.id_class(var8);
            var1.id_break();
            RenderSystem.shadeModel(7424);
         }

         RenderSystem.enableTexture();
         if (var20) {
            rrdZ.N();
         }

         RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE, OP.ONE, MK.ZERO);
         var1.id_class();
         float var22 = 1.0F - this.id_else.id_private(var2);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, var22);
         var1.id_class(rje_3.id_protected.id_byte(-90.0F));
         rrbf_3.id_class(this.id_else, this.id_continue, var1, var2);
         if (var20) {
            rrdZ.id_class(var1);
         }

         var1.id_class(rje_3.id_break.id_byte(this.id_else.id_protected(var2) * 360.0F));
         if (var20) {
            rrdZ.id_break(var1);
         }

         rjV_2 var23 = var1.id_byte().id_class();
         float var24 = 30.0F;
         if (rrbb_3.F()) {
            if (var20) {
               rrdZ.id_class(rrdX.SUN);
            }

            this.id_continue.id_class(id_extends);
            var8.id_class(7, ju_3.id_synchronized);
            var8.id_class(var23, -var24, 100.0F, -var24).id_class(0.0F, 0.0F).id_class();
            var8.id_class(var23, var24, 100.0F, -var24).id_class(1.0F, 0.0F).id_class();
            var8.id_class(var23, var24, 100.0F, var24).id_class(1.0F, 1.0F).id_class();
            var8.id_class(var23, -var24, 100.0F, var24).id_class(0.0F, 1.0F).id_class();
            var8.id_finally();
            yk_3.id_class(var8);
         }

         var24 = 20.0F;
         if (rrbb_3.L()) {
            if (var20) {
               rrdZ.id_class(rrdX.MOON);
            }

            this.id_continue.id_class(id_finally);
            int var26 = this.id_else.id_char();
            int var28 = var26 % 4;
            int var30 = var26 / 4 % 2;
            float var31 = (float)var28 / 4.0F;
            float var34 = (float)var30 / 2.0F;
            float var35 = (float)(var28 + 1) / 4.0F;
            float var36 = (float)(var30 + 1) / 2.0F;
            var8.id_class(7, ju_3.id_synchronized);
            var8.id_class(var23, -var24, -100.0F, var24).id_class(var35, var36).id_class();
            var8.id_class(var23, var24, -100.0F, var24).id_class(var31, var36).id_class();
            var8.id_class(var23, var24, -100.0F, -var24).id_class(var31, var34).id_class();
            var8.id_class(var23, -var24, -100.0F, -var24).id_class(var35, var34).id_class();
            var8.id_finally();
            yk_3.id_class(var8);
         }

         RenderSystem.disableTexture();
         if (var20) {
            rrdZ.c();
         }

         float var27 = this.id_else.id_byte(var2) * var22;
         if (var27 > 0.0F && rrbb_3.n() && !rrbf_3.id_class(this.id_else)) {
            if (var20) {
               rrdZ.id_class(rrdX.STARS);
            }

            RenderSystem.color4f(var27, var27, var27, var27);
            this.id_try.id_class();
            this.id_while.id_class(0L);
            this.id_try.id_class(var1.id_byte().id_class(), 7);
            jm_3.id_break();
            this.id_while.id_protected();
         }

         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.disableBlend();
         RenderSystem.enableAlphaTest();
         RenderSystem.enableFog();
         if (var20) {
            rrdZ.F();
         }

         var1.id_break();
         RenderSystem.disableTexture();
         if (var20) {
            rrdZ.c();
         }

         RenderSystem.color3f(0.0F, 0.0F, 0.0F);
         double var29 = ((cb_3)this.id_new.id_class[57]).id_new(var2).id_byte - this.id_else.id_synchronized().id_volatile();
         boolean var32 = false;
         if (var29 < 0.0) {
            if (var20) {
               rrdZ.id_class(rrdX.VOID);
            }

            var1.id_class();
            var1.id_class(0.0, 12.0, 0.0);
            this.id_throw.id_class();
            this.id_while.id_class(0L);
            this.id_throw.id_class(var1.id_byte().id_class(), 7);
            jm_3.id_break();
            this.id_while.id_protected();
            var1.id_break();
            var32 = true;
         }

         if (this.id_else.id_break().id_break()) {
            RenderSystem.color3f(var5 * 0.2F + 0.04F, var6 * 0.2F + 0.04F, var7 * 0.6F + 0.1F);
         } else {
            RenderSystem.color3f(var5, var6, var7);
         }

         RenderSystem.enableTexture();
         RenderSystem.depthMask(true);
         RenderSystem.disableFog();
      }
   }

   private void id_class(HQ var1, float var2, double var3, double var5, double var7) {
      if (rrxr_3.PU.id_byte()) {
         rrGA var9 = (rrGA)rrxr_3.id_private(this.id_else.id_break(), rrxr_3.PU);
         if (var9 != null) {
            var9.id_class(this.id_long, var2, this.id_else, this.id_new, var1, var3, var5, var7);
            return;
         }
      }

      float var48 = ((gm_3)this.id_new.id_class[56]).id_private(var2);
      if (!(var48 <= 0.0F)) {
         if (rrbb_3.id_interface()) {
            return;
         }

         var1.id_byte();
         gm_3 var10 = (gm_3)this.id_new.id_class[56];
         int var11 = rfU_2.id_byte(var3);
         int var12 = rfU_2.id_byte(var5);
         int var13 = rfU_2.id_byte(var7);
         yb_3 var14 = yb_3.id_class();
         lD_2 var15 = var14.id_byte();
         RenderSystem.enableAlphaTest();
         RenderSystem.disableCull();
         RenderSystem.normal3f(0.0F, 1.0F, 0.0F);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.defaultAlphaFunc();
         RenderSystem.enableDepthTest();
         byte var16 = 5;
         if (rrbb_3.id_throw()) {
            var16 = 10;
         }

         RenderSystem.depthMask(QY.d());
         byte var17 = -1;
         float var18 = (float)this.id_long + var2;
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         rfw_3 var19 = new rfw_3();

         for (int var20 = var13 - var16; var20 <= var13 + var16; var20++) {
            for (int var21 = var11 - var16; var21 <= var11 + var16; var21++) {
               int var22 = (var20 - var13 + 16) * 32 + var21 - var11 + 16;
               double var23 = (double)this.C[var22] * 0.5;
               double var25 = (double)this.l[var22] * 0.5;
               var19.id_class(var21, 0, var20);
               rYG var27 = var10.id_implements(var19);
               if (var27.id_byte() != rYJ.NONE) {
                  int var28 = var10.id_class(rKv_1.MOTION_BLOCKING, var19).c_();
                  int var29 = var12 - var16;
                  int var30 = var12 + var16;
                  if (var29 < var28) {
                     var29 = var28;
                  }

                  if (var30 < var28) {
                     var30 = var28;
                  }

                  int var31 = var28;
                  if (var28 < var12) {
                     var31 = var12;
                  }

                  if (var29 != var30) {
                     Random var32 = new Random(
                        (long)var21 * (long)var21 * 3121L + (long)var21 * 45238971L ^ (long)var20 * (long)var20 * 418711L + (long)var20 * 13761L
                     );
                     var19.id_class(var21, var29, var20);
                     float var33 = var27.id_class(var19);
                     if (var33 >= 0.15F) {
                        if (var17 != 0) {
                           if (var17 >= 0) {
                              var14.id_break();
                           }

                           var17 = 0;
                           this.id_new.A().id_class(id_package);
                           var15.id_class(7, ju_3.id_continue);
                        }

                        int var34 = this.id_long + var21 * var21 * 3121 + var21 * 45238971 + var20 * var20 * 418711 + var20 * 13761 & 31;
                        float var35 = -((float)var34 + var2) / 32.0F * (3.0F + var32.nextFloat());
                        double var36 = (double)((float)var21 + 0.5F) - var3;
                        double var38 = (double)((float)var20 + 0.5F) - var7;
                        float var40 = rfU_2.id_class(var36 * var36 + var38 * var38) / (float)var16;
                        float var41 = ((1.0F - var40 * var40) * 0.5F + 0.5F) * var48;
                        var19.id_class(var21, var31, var20);
                        int var42 = id_class(var10, var19);
                        var15.id_class((double)var21 - var3 - var23 + 0.5, (double)var30 - var5, (double)var20 - var7 - var25 + 0.5)
                           .id_class(0.0F, (float)var29 * 0.25F + var35)
                           .id_class(1.0F, 1.0F, 1.0F, var41)
                           .id_break(var42)
                           .id_class();
                        var15.id_class((double)var21 - var3 + var23 + 0.5, (double)var30 - var5, (double)var20 - var7 + var25 + 0.5)
                           .id_class(1.0F, (float)var29 * 0.25F + var35)
                           .id_class(1.0F, 1.0F, 1.0F, var41)
                           .id_break(var42)
                           .id_class();
                        var15.id_class((double)var21 - var3 + var23 + 0.5, (double)var29 - var5, (double)var20 - var7 + var25 + 0.5)
                           .id_class(1.0F, (float)var30 * 0.25F + var35)
                           .id_class(1.0F, 1.0F, 1.0F, var41)
                           .id_break(var42)
                           .id_class();
                        var15.id_class((double)var21 - var3 - var23 + 0.5, (double)var29 - var5, (double)var20 - var7 - var25 + 0.5)
                           .id_class(0.0F, (float)var30 * 0.25F + var35)
                           .id_class(1.0F, 1.0F, 1.0F, var41)
                           .id_break(var42)
                           .id_class();
                     } else {
                        if (var17 != 1) {
                           if (var17 >= 0) {
                              var14.id_break();
                           }

                           var17 = 1;
                           this.id_new.A().id_class(id_int);
                           var15.id_class(7, ju_3.id_continue);
                        }

                        float var49 = -((float)(this.id_long & 511) + var2) / 512.0F;
                        float var50 = (float)(var32.nextDouble() + (double)var18 * 0.01 * (double)((float)var32.nextGaussian()));
                        float var51 = (float)(var32.nextDouble() + (double)(var18 * (float)var32.nextGaussian()) * 0.001);
                        double var37 = (double)((float)var21 + 0.5F) - var3;
                        double var39 = (double)((float)var20 + 0.5F) - var7;
                        float var52 = rfU_2.id_class(var37 * var37 + var39 * var39) / (float)var16;
                        float var53 = ((1.0F - var52 * var52) * 0.3F + 0.5F) * var48;
                        var19.id_class(var21, var31, var20);
                        int var43 = id_class(var10, var19);
                        int var44 = var43 >> 16 & 65535;
                        int var45 = (var43 & 65535) * 3;
                        int var46 = (var44 * 3 + 240) / 4;
                        int var47 = (var45 * 3 + 240) / 4;
                        var15.id_class((double)var21 - var3 - var23 + 0.5, (double)var30 - var5, (double)var20 - var7 - var25 + 0.5)
                           .id_class(0.0F + var50, (float)var29 * 0.25F + var49 + var51)
                           .id_class(1.0F, 1.0F, 1.0F, var53)
                           .id_byte(var47, var46)
                           .id_class();
                        var15.id_class((double)var21 - var3 + var23 + 0.5, (double)var30 - var5, (double)var20 - var7 + var25 + 0.5)
                           .id_class(1.0F + var50, (float)var29 * 0.25F + var49 + var51)
                           .id_class(1.0F, 1.0F, 1.0F, var53)
                           .id_byte(var47, var46)
                           .id_class();
                        var15.id_class((double)var21 - var3 + var23 + 0.5, (double)var29 - var5, (double)var20 - var7 + var25 + 0.5)
                           .id_class(1.0F + var50, (float)var30 * 0.25F + var49 + var51)
                           .id_class(1.0F, 1.0F, 1.0F, var53)
                           .id_byte(var47, var46)
                           .id_class();
                        var15.id_class((double)var21 - var3 - var23 + 0.5, (double)var29 - var5, (double)var20 - var7 - var25 + 0.5)
                           .id_class(0.0F + var50, (float)var30 * 0.25F + var49 + var51)
                           .id_class(1.0F, 1.0F, 1.0F, var53)
                           .id_byte(var47, var46)
                           .id_class();
                     }
                  }
               }
            }
         }

         if (var17 >= 0) {
            var14.id_break();
         }

         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         RenderSystem.defaultAlphaFunc();
         RenderSystem.disableAlphaTest();
         var1.id_break();
      }
   }

   private void id_class(la_3 var1) {
      long var2 = var1.id_class().id_package();
      Set var4 = (Set)this.id_void.get(var2);
      var4.remove(var1);
      if (var4.isEmpty()) {
         this.id_void.remove(var2);
      }
   }

   private void id_class(lD_2 var1, double var2, double var4, double var6, rjU_2 var8) {
      float var9 = 4.0F;
      float var10 = 0.00390625F;
      byte var11 = 8;
      byte var12 = 4;
      float var13 = 9.765625E-4F;
      float var14 = (float)rfU_2.id_byte(var2) * 0.00390625F;
      float var15 = (float)rfU_2.id_byte(var6) * 0.00390625F;
      float var16 = (float)var8.id_break;
      float var17 = (float)var8.id_byte;
      float var18 = (float)var8.id_protected;
      float var19 = var16 * 0.9F;
      float var20 = var17 * 0.9F;
      float var21 = var18 * 0.9F;
      float var22 = var16 * 0.7F;
      float var23 = var17 * 0.7F;
      float var24 = var18 * 0.7F;
      float var25 = var16 * 0.8F;
      float var26 = var17 * 0.8F;
      float var27 = var18 * 0.8F;
      var1.id_class(7, ju_3.id_try);
      float var28 = (float)Math.floor(var4 / 4.0) * 4.0F;
      if (rrbb_3.id_char()) {
         for (int var29 = -3; var29 <= 4; var29++) {
            for (int var30 = -3; var30 <= 4; var30++) {
               float var31 = (float)(var29 * 8);
               float var32 = (float)(var30 * 8);
               if (var28 > -5.0F) {
                  var1.id_class((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                     .id_class((var31 + 0.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .id_class(var22, var23, var24, 0.8F)
                     .id_class(0.0F, -1.0F, 0.0F)
                     .id_class();
                  var1.id_class((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                     .id_class((var31 + 8.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .id_class(var22, var23, var24, 0.8F)
                     .id_class(0.0F, -1.0F, 0.0F)
                     .id_class();
                  var1.id_class((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                     .id_class((var31 + 8.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .id_class(var22, var23, var24, 0.8F)
                     .id_class(0.0F, -1.0F, 0.0F)
                     .id_class();
                  var1.id_class((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                     .id_class((var31 + 0.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .id_class(var22, var23, var24, 0.8F)
                     .id_class(0.0F, -1.0F, 0.0F)
                     .id_class();
               }

               if (var28 <= 5.0F) {
                  var1.id_class((double)(var31 + 0.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 8.0F))
                     .id_class((var31 + 0.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .id_class(var16, var17, var18, 0.8F)
                     .id_class(0.0F, 1.0F, 0.0F)
                     .id_class();
                  var1.id_class((double)(var31 + 8.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 8.0F))
                     .id_class((var31 + 8.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .id_class(var16, var17, var18, 0.8F)
                     .id_class(0.0F, 1.0F, 0.0F)
                     .id_class();
                  var1.id_class((double)(var31 + 8.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 0.0F))
                     .id_class((var31 + 8.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .id_class(var16, var17, var18, 0.8F)
                     .id_class(0.0F, 1.0F, 0.0F)
                     .id_class();
                  var1.id_class((double)(var31 + 0.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 0.0F))
                     .id_class((var31 + 0.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .id_class(var16, var17, var18, 0.8F)
                     .id_class(0.0F, 1.0F, 0.0F)
                     .id_class();
               }

               if (var29 > -1) {
                  for (int var33 = 0; var33 < 8; var33++) {
                     var1.id_class((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                        .id_class((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .id_class(var19, var20, var21, 0.8F)
                        .id_class(-1.0F, 0.0F, 0.0F)
                        .id_class();
                     var1.id_class((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + 8.0F))
                        .id_class((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .id_class(var19, var20, var21, 0.8F)
                        .id_class(-1.0F, 0.0F, 0.0F)
                        .id_class();
                     var1.id_class((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + 0.0F))
                        .id_class((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .id_class(var19, var20, var21, 0.8F)
                        .id_class(-1.0F, 0.0F, 0.0F)
                        .id_class();
                     var1.id_class((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                        .id_class((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .id_class(var19, var20, var21, 0.8F)
                        .id_class(-1.0F, 0.0F, 0.0F)
                        .id_class();
                  }
               }

               if (var29 <= 1) {
                  for (int var38 = 0; var38 < 8; var38++) {
                     var1.id_class((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                        .id_class((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .id_class(var19, var20, var21, 0.8F)
                        .id_class(1.0F, 0.0F, 0.0F)
                        .id_class();
                     var1.id_class((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 4.0F), (double)(var32 + 8.0F))
                        .id_class((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .id_class(var19, var20, var21, 0.8F)
                        .id_class(1.0F, 0.0F, 0.0F)
                        .id_class();
                     var1.id_class((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 4.0F), (double)(var32 + 0.0F))
                        .id_class((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .id_class(var19, var20, var21, 0.8F)
                        .id_class(1.0F, 0.0F, 0.0F)
                        .id_class();
                     var1.id_class((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                        .id_class((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .id_class(var19, var20, var21, 0.8F)
                        .id_class(1.0F, 0.0F, 0.0F)
                        .id_class();
                  }
               }

               if (var30 > -1) {
                  for (int var39 = 0; var39 < 8; var39++) {
                     var1.id_class((double)(var31 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var39 + 0.0F))
                        .id_class((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .id_class(var25, var26, var27, 0.8F)
                        .id_class(0.0F, 0.0F, -1.0F)
                        .id_class();
                     var1.id_class((double)(var31 + 8.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var39 + 0.0F))
                        .id_class((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .id_class(var25, var26, var27, 0.8F)
                        .id_class(0.0F, 0.0F, -1.0F)
                        .id_class();
                     var1.id_class((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var39 + 0.0F))
                        .id_class((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .id_class(var25, var26, var27, 0.8F)
                        .id_class(0.0F, 0.0F, -1.0F)
                        .id_class();
                     var1.id_class((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var39 + 0.0F))
                        .id_class((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .id_class(var25, var26, var27, 0.8F)
                        .id_class(0.0F, 0.0F, -1.0F)
                        .id_class();
                  }
               }

               if (var30 <= 1) {
                  for (int var40 = 0; var40 < 8; var40++) {
                     var1.id_class((double)(var31 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .id_class((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .id_class(var25, var26, var27, 0.8F)
                        .id_class(0.0F, 0.0F, 1.0F)
                        .id_class();
                     var1.id_class((double)(var31 + 8.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .id_class((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .id_class(var25, var26, var27, 0.8F)
                        .id_class(0.0F, 0.0F, 1.0F)
                        .id_class();
                     var1.id_class((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .id_class((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .id_class(var25, var26, var27, 0.8F)
                        .id_class(0.0F, 0.0F, 1.0F)
                        .id_class();
                     var1.id_class((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .id_class((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .id_class(var25, var26, var27, 0.8F)
                        .id_class(0.0F, 0.0F, 1.0F)
                        .id_class();
                  }
               }
            }
         }
      } else {
         boolean var34 = true;
         byte var35 = 32;

         for (byte var36 = -32; var36 < 32; var36 += 32) {
            for (byte var37 = -32; var37 < 32; var37 += 32) {
               var1.id_class((double)var36, (double)var28, (double)(var37 + 32))
                  .id_class((float)var36 * 0.00390625F + var14, (float)(var37 + 32) * 0.00390625F + var15)
                  .id_class(var16, var17, var18, 0.8F)
                  .id_class(0.0F, -1.0F, 0.0F)
                  .id_class();
               var1.id_class((double)(var36 + 32), (double)var28, (double)(var37 + 32))
                  .id_class((float)(var36 + 32) * 0.00390625F + var14, (float)(var37 + 32) * 0.00390625F + var15)
                  .id_class(var16, var17, var18, 0.8F)
                  .id_class(0.0F, -1.0F, 0.0F)
                  .id_class();
               var1.id_class((double)(var36 + 32), (double)var28, (double)var37)
                  .id_class((float)(var36 + 32) * 0.00390625F + var14, (float)var37 * 0.00390625F + var15)
                  .id_class(var16, var17, var18, 0.8F)
                  .id_class(0.0F, -1.0F, 0.0F)
                  .id_class();
               var1.id_class((double)var36, (double)var28, (double)var37)
                  .id_class((float)var36 * 0.00390625F + var14, (float)var37 * 0.00390625F + var15)
                  .id_class(var16, var17, var18, 0.8F)
                  .id_class(0.0F, -1.0F, 0.0F)
                  .id_class();
            }
         }
      }
   }

   public void id_class(long var1) {
      var1 = (long)((double)var1 + 1.0E8);
      this.L = this.L | this.d.id_byte();
      long var3 = rqR_2.id_byte();
      boolean var5 = false;
      if (this.id_protected.size() > 0) {
         Iterator var6 = this.id_protected.iterator();

         while (var6.hasNext()) {
            yQ_2 var7 = (yQ_2)var6.next();
            if (!this.d.id_byte(var7)) {
               break;
            }

            var7.id_case();
            var6.remove();
            this.id_synchronized.remove(var7);
            this.id_byte.remove(var7);
         }
      }

      if (this.id_byte.size() > 0) {
         Iterator var16 = this.id_byte.iterator();
         if (var16.hasNext()) {
            yQ_2 var18 = (yQ_2)var16.next();
            if (this.d.id_protected(var18)) {
               var16.remove();
            }
         }
      }

      double var17 = 0.0;
      int var8 = rrbb_3.id_goto();
      if (!this.id_synchronized.isEmpty()) {
         Iterator var9 = this.id_synchronized.iterator();

         while (var9.hasNext()) {
            yQ_2 var10 = (yQ_2)var9.next();
            boolean var11 = var10.id_final();
            boolean var12;
            if (!var10.id_private() && !var11) {
               var12 = this.d.id_byte(var10);
            } else {
               var12 = this.d.id_break(var10);
            }

            if (!var12) {
               break;
            }

            var10.id_case();
            var9.remove();
            if (!var11) {
               double var13 = 2.0 * rrzb_3.id_break(var10);
               var17 += var13;
               if (var17 > (double)var8) {
                  break;
               }
            }
         }
      }
   }

   private void id_class(rjV_2 var1, rjV_2 var2, double var3, double var5, double var7, yt_3 var9) {
      this.c = var9;
      rjV_2 var10 = var2.id_case();
      var10.id_class(var1);
      var10.id_throws();
      this.m.id_class = var3;
      this.m.id_break = var5;
      this.m.id_byte = var7;
      this.u[0] = new rji_3(-1.0F, -1.0F, -1.0F, 1.0F);
      this.u[1] = new rji_3(1.0F, -1.0F, -1.0F, 1.0F);
      this.u[2] = new rji_3(1.0F, 1.0F, -1.0F, 1.0F);
      this.u[3] = new rji_3(-1.0F, 1.0F, -1.0F, 1.0F);
      this.u[4] = new rji_3(-1.0F, -1.0F, 1.0F, 1.0F);
      this.u[5] = new rji_3(1.0F, -1.0F, 1.0F, 1.0F);
      this.u[6] = new rji_3(1.0F, 1.0F, 1.0F, 1.0F);
      this.u[7] = new rji_3(-1.0F, 1.0F, 1.0F, 1.0F);

      for (int var11 = 0; var11 < 8; var11++) {
         this.u[var11].id_class(var10);
         this.u[var11].id_case();
      }
   }

   public void id_class(HU var1, Ml_1 var2, double var3, double var5, double var7) {
      var1.id_class();
      boolean var9 = rrbb_3.rs();
      if (var1 == HU.id_implements() && !rrdZ.id_new) {
         double var10 = var3 - this.Z;
         double var12 = var5 - this.v;
         double var14 = var7 - this.F;
         if (var10 * var10 + var12 * var12 + var14 * var14 > 1.0) {
            this.Z = var3;
            this.v = var5;
            this.F = var7;
            int var16 = 0;
            this.id_byte.clear();
            ObjectListIterator var17 = this.id_return.iterator();

            while (var17.hasNext()) {
               yx_3 var18 = (yx_3)var17.next();
               if (var16 < 15 && var18.id_class.id_byte().id_byte(var1)) {
                  this.id_byte.add(var18.id_class);
                  var16++;
               }
            }
         }
      }

      if (var9) {
         rrdL.id_class(var1);
      }

      boolean var29 = rrMh_1.id_class();
      RenderSystem.pushMatrix();
      RenderSystem.loadIdentity();
      RenderSystem.multMatrix(var2.id_byte().id_class());
      boolean var11 = var1 != HU.id_implements();
      ObjectListIterator var30 = this.id_return.listIterator(var11 ? 0 : this.id_return.size());
      if (rrbb_3.ry()) {
         int var31 = Integer.MIN_VALUE;
         int var33 = Integer.MIN_VALUE;
         rrxH_2 var34 = null;
         Map var36 = this.i.computeIfAbsent(var1, var0 -> new LinkedHashMap(16));
         Map var38 = null;
         List var39 = null;

         while (var11 ? var30.hasNext() : var30.hasPrevious()) {
            yx_3 var19 = var11 ? (yx_3)var30.next() : (yx_3)var30.previous();
            yQ_2 var20 = var19.id_class;
            if (!var20.id_byte().id_class(var1)) {
               jm_3 var21 = var20.id_class(var1);
               rrxH_2 var22 = var21.id_byte();
               if (var20.id_byte != var31 || var20.id_protected != var33) {
                  rrzS_2 var23 = rrzS_2.id_class(var20.id_byte, var20.id_protected);
                  var38 = var36.computeIfAbsent(var23, var0 -> new LinkedHashMap(8));
                  var31 = var20.id_byte;
                  var33 = var20.id_protected;
                  var34 = null;
               }

               if (var22 != var34) {
                  var39 = var38.computeIfAbsent(var22, var0 -> new ArrayList());
                  var34 = var22;
               }

               var39.add(var21);
               if (rrMh_1.id_class()) {
                  BitSet var44 = var20.id_byte().id_break(var1);
                  if (var44 != null) {
                     rrMh_1.id_class(var44);
                  }
               }
            }
         }

         for (java.util.Map.Entry var41 : var36.entrySet()) {
            rrzS_2 var42 = (rrzS_2)var41.getKey();
            Map var43 = (Map)var41.getValue();

            for (java.util.Map.Entry var24 : var43.entrySet()) {
               rrxH_2 var25 = (rrxH_2)var24.getKey();
               List var26 = (List)var24.getValue();

               for (jm_3 var28 : var26) {
                  var28.id_class(7);
               }

               this.id_class(var42.id_class(), 0, var42.id_break(), var3, var5, var7, var25);
               var26.clear();
            }
         }
      } else {
         while (var11 ? var30.hasNext() : var30.hasPrevious()) {
            yx_3 var13 = var11 ? (yx_3)var30.next() : (yx_3)var30.previous();
            yQ_2 var32 = var13.id_class;
            if (!var32.id_byte().id_class(var1)) {
               jm_3 var15 = var32.id_class(var1);
               MT.id_transient();
               rfH_2 var35 = var32.id_throws();
               MT.id_break((double)var35.b_() - var3, (double)var35.c_() - var5, (double)var35.d_() - var7);
               var15.id_class();
               ju_3.id_private.id_class(0L);
               MT.h();
               if (var9) {
                  rrdL.id_package();
               }

               var15.id_class(7);
               MT.id_for();
               if (var29) {
                  BitSet var37 = var32.id_byte().id_break(var1);
                  if (var37 != null) {
                     rrMh_1.id_class(var37);
                  }
               }
            }
         }
      }

      MT.X();
      RenderSystem.popMatrix();
      if (rrbb_3.w()) {
         this.id_new.A().id_class(fJ_2.id_class);
      }

      jm_3.id_break();
      RenderSystem.clearCurrentColor();
      ju_3.id_private.id_protected();
      if (var9) {
         rrdL.id_break(var1);
      }

      var1.id_break();
   }

   private void id_class(int var1, int var2, int var3, double var4, double var6, double var8, rrxH_2 var10) {
      MT.id_transient();
      MT.id_break((double)var1 - var4, (double)var2 - var6, (double)var3 - var8);
      var10.id_break();
      MT.h();
      MT.id_for();
   }

   public void id_class(an_3 var1, double var2, double var4, double var6, float var8, Ml_1 var9, Hx_1 var10) {
      double var11 = rfU_2.id_protected((double)var8, (Double)var1.id_throws[34], var1.rx());
      double var13 = rfU_2.id_protected((double)var8, (Double)var1.id_throws[35], var1.re());
      double var15 = rfU_2.id_protected((double)var8, (Double)var1.id_throws[36], var1.BO());
      float var17 = rfU_2.id_catch(var8, (Float)var1.id_throws[17], (Float)var1.id_throws[15]);
      this.id_super.id_class(var1, var11 - var2, var13 - var4, var15 - var6, var17, var8, var9, var10, this.id_super.id_class(var1, var8));
   }

   private void id_class(rYB var1, rfH_2 var2, boolean var3) {
      for (iB_2 var5 : var1.id_class(iB_2.class, new rfl_3(var2).id_class(3.0))) {
         var5.id_class(var2, var3);
      }
   }

   private void id_class(Ok_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      float var9 = 0.25F;
      var1.id_class((double)this.u[var2].id_class(), (double)this.u[var2].id_break(), (double)this.u[var2].id_byte())
         .id_class((float)var6, (float)var7, (float)var8, 0.25F)
         .id_class();
      var1.id_class((double)this.u[var3].id_class(), (double)this.u[var3].id_break(), (double)this.u[var3].id_byte())
         .id_class((float)var6, (float)var7, (float)var8, 0.25F)
         .id_class();
      var1.id_class((double)this.u[var4].id_class(), (double)this.u[var4].id_break(), (double)this.u[var4].id_byte())
         .id_class((float)var6, (float)var7, (float)var8, 0.25F)
         .id_class();
      var1.id_class((double)this.u[var5].id_class(), (double)this.u[var5].id_break(), (double)this.u[var5].id_byte())
         .id_class((float)var6, (float)var7, (float)var8, 0.25F)
         .id_class();
   }

   private void id_class(Ok_1 var1, int var2) {
      var1.id_class((double)this.u[var2].id_class(), (double)this.u[var2].id_break(), (double)this.u[var2].id_byte()).id_class();
   }

   private void id_default() {
      yb_3 var1 = yb_3.id_class();
      lD_2 var2 = var1.id_byte();
      if (this.id_throw != null) {
         this.id_throw.close();
      }

      this.id_throw = new jm_3(this.id_while);
      this.id_class(var2, -16.0F, true);
      var2.id_finally();
      this.id_throw.id_class(var2);
   }

   private void id_short() {
      if (this.id_for != null) {
         this.id_for.close();
         this.id_default.id_class();
         this.id_const.id_class();
         this.id_strictfp.id_class();
         this.id_boolean.id_class();
         this.id_transient.id_class();
         this.id_for = null;
         this.id_default = null;
         this.id_const = null;
         this.id_strictfp = null;
         this.id_boolean = null;
         this.id_transient = null;
      }
   }

   @Override
   public void close() {
      if (this.id_short != null) {
         this.id_short.close();
      }

      if (this.id_for != null) {
         this.id_for.close();
      }
   }

   public VC id_void() {
      return this.id_transient;
   }

   public void id_break() {
      if (this.id_short != null) {
         this.id_short.close();
      }

      rqO_2 var1 = new rqO_2("shaders/post/entity_outline.json");

      try {
         this.id_short = new Vq_1(this.id_new.A(), this.id_new.F(), this.id_new.B(), var1);
         this.id_short.id_class(this.id_new.id_else().id_extends(), this.id_new.id_else().id_native());
         this.id_import = this.id_short.id_class("id_final");
      } catch (IOException var3) {
         id_implements.warn("Failed to load shader: {}", var1, var3);
         this.id_short = null;
         this.id_import = null;
      } catch (JsonSyntaxException var4) {
         id_implements.warn("Failed to parse shader: {}", var1, var4);
         this.id_short = null;
         this.id_import = null;
      }
   }

   private void id_break(ly_3 var1, yt_3 var2, boolean var3) {
      int var4 = ((Qw_1)this.id_new.id_class[20]).rT;
      boolean var5 = ((Qw_1)this.id_new.id_class[20]).rd;

      try {
         ((Qw_1)this.id_new.id_class[20]).rT = 1000;
         ((Qw_1)this.id_new.id_class[20]).rd = false;
         yX_2 var6 = rrbb_3.z();
         int var7 = var6.id_continue();
         long var8 = System.currentTimeMillis();
         rrbb_3.id_byte("Loading visible chunks");
         long var10 = System.currentTimeMillis() + 5000L;
         int var12 = 0;
         boolean var13 = false;

         do {
            var13 = false;

            for (int var14 = 0; var14 < 100; var14++) {
               var6.id_volatile();
               var6.id_class(var1, var2, false, this.A++, var3);
               if (!var6.id_native()) {
                  var13 = true;
               }

               var12 += var6.id_super();

               while (!var6.id_native()) {
                  var6.id_class(System.nanoTime() + 1000000000L);
               }

               var12 -= var6.id_super();
               if (!var13) {
                  break;
               }
            }

            if (var6.id_continue() != var7) {
               var13 = true;
               var7 = var6.id_continue();
            }

            if (System.currentTimeMillis() > var10) {
               rrbb_3.id_case("Chunks loaded: " + var12);
               var10 = System.currentTimeMillis() + 5000L;
            }
         } while (var13);

         rrbb_3.id_case("Chunks loaded: " + var12);
         rrbb_3.id_case("Finished loading visible chunks");
         yz_3.id_break = 0;
      } finally {
         ((Qw_1)this.id_new.id_class[20]).rT = var4;
         ((Qw_1)this.id_new.id_class[20]).rd = var5;
      }
   }

   private void id_break(ly_3 var1) {
      yb_3 var2 = yb_3.id_class();
      lD_2 var3 = var2.id_byte();
      if ((Boolean)this.id_new.id_class[80] || (Boolean)this.id_new.id_class[81]) {
         double var4 = var1.id_break().id_class();
         double var6 = var1.id_break().id_break();
         double var8 = var1.id_break().id_byte();
         RenderSystem.depthMask(true);
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableTexture();

         for (ObjectListIterator var10 = this.id_return.iterator(); var10.hasNext(); RenderSystem.popMatrix()) {
            yx_3 var11 = (yx_3)var10.next();
            yQ_2 var12 = var11.id_class;
            RenderSystem.pushMatrix();
            rfH_2 var13 = var12.id_throws();
            RenderSystem.translated((double)var13.b_() - var4, (double)var13.c_() - var6, (double)var13.d_() - var8);
            if ((Boolean)this.id_new.id_class[80]) {
               var3.id_class(1, ju_3.id_this);
               RenderSystem.lineWidth(10.0F);
               int var14 = var11.id_protected == 0 ? 0 : rfU_2.id_case((float)var11.id_protected / 50.0F, 0.9F, 0.9F);
               int var15 = var14 >> 16 & 0xFF;
               int var16 = var14 >> 8 & 0xFF;
               int var17 = var14 & 0xFF;
               rpr_3 var18 = var11.id_break;
               if (var18 != null) {
                  var3.id_class(8.0, 8.0, 8.0).id_break(var15, var16, var17, 255).id_class();
                  var3.id_class((double)(8 - 16 * var18.id_implements()), (double)(8 - 16 * var18.id_finally()), (double)(8 - 16 * var18.id_extends()))
                     .id_break(var15, var16, var17, 255)
                     .id_class();
               }

               var2.id_break();
               RenderSystem.lineWidth(1.0F);
            }

            if ((Boolean)this.id_new.id_class[81] && !var12.id_byte().id_class()) {
               var3.id_class(1, ju_3.id_this);
               RenderSystem.lineWidth(10.0F);
               int var24 = 0;

               for (rpr_3 var30 : id_class) {
                  for (rpr_3 var22 : id_class) {
                     boolean var23 = var12.id_byte().id_class(var30, var22);
                     if (!var23) {
                        var24++;
                        var3.id_class((double)(8 + 8 * var30.id_implements()), (double)(8 + 8 * var30.id_finally()), (double)(8 + 8 * var30.id_extends()))
                           .id_break(1, 0, 0, 1)
                           .id_class();
                        var3.id_class((double)(8 + 8 * var22.id_implements()), (double)(8 + 8 * var22.id_finally()), (double)(8 + 8 * var22.id_extends()))
                           .id_break(1, 0, 0, 1)
                           .id_class();
                     }
                  }
               }

               var2.id_break();
               RenderSystem.lineWidth(1.0F);
               if (var24 > 0) {
                  var3.id_class(7, ju_3.id_this);
                  float var26 = 0.5F;
                  float var28 = 0.2F;
                  var3.id_class(0.5, 15.5, 0.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(15.5, 15.5, 0.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(15.5, 15.5, 15.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(0.5, 15.5, 15.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(0.5, 0.5, 15.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(15.5, 0.5, 15.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(15.5, 0.5, 0.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(0.5, 0.5, 0.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(0.5, 15.5, 0.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(0.5, 15.5, 15.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(0.5, 0.5, 15.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(0.5, 0.5, 0.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(15.5, 0.5, 0.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(15.5, 0.5, 15.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(15.5, 15.5, 15.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(15.5, 15.5, 0.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(0.5, 0.5, 0.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(15.5, 0.5, 0.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(15.5, 15.5, 0.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(0.5, 15.5, 0.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(0.5, 15.5, 15.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(15.5, 15.5, 15.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(15.5, 0.5, 15.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var3.id_class(0.5, 0.5, 15.5).id_class(0.9F, 0.9F, 0.0F, 0.2F).id_class();
                  var2.id_break();
               }
            }
         }

         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         RenderSystem.enableCull();
         RenderSystem.enableTexture();
      }

      if (this.c != null) {
         RenderSystem.disableCull();
         RenderSystem.disableTexture();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.lineWidth(10.0F);
         RenderSystem.pushMatrix();
         RenderSystem.translatef(
            (float)(this.m.id_class - var1.id_break().id_break),
            (float)(this.m.id_break - var1.id_break().id_byte),
            (float)(this.m.id_byte - var1.id_break().id_protected)
         );
         RenderSystem.depthMask(true);
         var3.id_class(7, ju_3.id_this);
         this.id_class(var3, 0, 1, 2, 3, 0, 1, 1);
         this.id_class(var3, 4, 5, 6, 7, 1, 0, 0);
         this.id_class(var3, 0, 1, 5, 4, 1, 1, 0);
         this.id_class(var3, 2, 3, 7, 6, 0, 0, 1);
         this.id_class(var3, 0, 4, 7, 3, 0, 1, 0);
         this.id_class(var3, 1, 5, 6, 2, 1, 0, 1);
         var2.id_break();
         RenderSystem.depthMask(false);
         var3.id_class(1, ju_3.id_super);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.id_class(var3, 0);
         this.id_class(var3, 1);
         this.id_class(var3, 1);
         this.id_class(var3, 2);
         this.id_class(var3, 2);
         this.id_class(var3, 3);
         this.id_class(var3, 3);
         this.id_class(var3, 0);
         this.id_class(var3, 4);
         this.id_class(var3, 5);
         this.id_class(var3, 5);
         this.id_class(var3, 6);
         this.id_class(var3, 6);
         this.id_class(var3, 7);
         this.id_class(var3, 7);
         this.id_class(var3, 4);
         this.id_class(var3, 0);
         this.id_class(var3, 4);
         this.id_class(var3, 1);
         this.id_class(var3, 5);
         this.id_class(var3, 2);
         this.id_class(var3, 6);
         this.id_class(var3, 3);
         this.id_class(var3, 7);
         var2.id_break();
         RenderSystem.popMatrix();
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         RenderSystem.enableCull();
         RenderSystem.enableTexture();
         RenderSystem.lineWidth(1.0F);
      }
   }

   private CH id_break(rLx_1 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      return this.id_break(var1, var2, false, var3, var5, var7, var9, var11, var13);
   }

   private void id_break(Ml_1 var1) {
      if (rrbb_3.Z()) {
         RenderSystem.disableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(false);
         this.id_continue.id_class(id_volatile);
         yb_3 var2 = yb_3.id_class();
         lD_2 var3 = var2.id_byte();

         for (int var4 = 0; var4 < 6; var4++) {
            var1.id_class();
            if (var4 == 1) {
               var1.id_class(rje_3.id_break.id_byte(90.0F));
            }

            if (var4 == 2) {
               var1.id_class(rje_3.id_break.id_byte(-90.0F));
            }

            if (var4 == 3) {
               var1.id_class(rje_3.id_break.id_byte(180.0F));
            }

            if (var4 == 4) {
               var1.id_class(rje_3.id_case.id_byte(90.0F));
            }

            if (var4 == 5) {
               var1.id_class(rje_3.id_case.id_byte(-90.0F));
            }

            rjV_2 var5 = var1.id_byte().id_class();
            var3.id_class(7, ju_3.id_public);
            int var6 = 40;
            int var7 = 40;
            int var8 = 40;
            if (rrbb_3.K()) {
               rjU_2 var9 = new rjU_2((double)var6 / 255.0, (double)var7 / 255.0, (double)var8 / 255.0);
               var9 = rrbN_2.id_break(var9, this.id_else, this.id_new.id_catch(), 0.0F);
               var6 = (int)(var9.id_break * 255.0);
               var7 = (int)(var9.id_byte * 255.0);
               var8 = (int)(var9.id_protected * 255.0);
            }

            var3.id_class(var5, -100.0F, -100.0F, -100.0F).id_class(0.0F, 0.0F).id_break(var6, var7, var8, 255).id_class();
            var3.id_class(var5, -100.0F, -100.0F, 100.0F).id_class(0.0F, 16.0F).id_break(var6, var7, var8, 255).id_class();
            var3.id_class(var5, 100.0F, -100.0F, 100.0F).id_class(16.0F, 16.0F).id_break(var6, var7, var8, 255).id_class();
            var3.id_class(var5, 100.0F, -100.0F, -100.0F).id_class(16.0F, 0.0F).id_break(var6, var7, var8, 255).id_class();
            var2.id_break();
            var1.id_break();
         }

         RenderSystem.depthMask(true);
         RenderSystem.enableTexture();
         RenderSystem.disableBlend();
         RenderSystem.enableAlphaTest();
      }
   }

   private static void id_break(Ml_1 var0, Ok_1 var1, rjC_2 var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12) {
      rjV_2 var13 = var0.id_byte().id_class();
      var2.id_class((var12x, var14, var16, var18, var20, var22) -> {
         var1.id_class(var13, (float)(var12x + var3), (float)(var14 + var5), (float)(var16 + var7)).id_class(var9, var10, var11, var12).id_class();
         var1.id_class(var13, (float)(var18 + var3), (float)(var20 + var5), (float)(var22 + var7)).id_class(var9, var10, var11, var12).id_class();
      });
   }

   public void id_break(int var1, rfH_2 var2, int var3) {
      if (var3 >= 0 && var3 < 10) {
         la_3 var5 = (la_3)this.id_float.get(var1);
         if (var5 != null) {
            this.id_class(var5);
         }

         if (var5 == null || var5.id_class().b_() != var2.b_() || var5.id_class().c_() != var2.c_() || var5.id_class().d_() != var2.d_()) {
            var5 = new la_3(var1, var2);
            this.id_float.put(var1, var5);
         }

         var5.id_class(var3);
         var5.id_break(this.id_long);
         ((SortedSet)this.id_void.computeIfAbsent(var5.id_class().id_package(), var0 -> Sets.newTreeSet())).add(var5);
      } else {
         la_3 var4 = (la_3)this.id_float.remove(var1);
         if (var4 != null) {
            this.id_class(var4);
         }
      }
   }

   public void id_break(int var1, int var2, int var3) {
      this.id_class(var1, var2, var3, false);
   }

   private CH id_break(rLx_1 var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      ly_3 var16 = ((Hh_1)this.id_new.id_class[16]).id_finally();
      if (this.id_new != null && var16.id_private() && (Cy_1)this.id_new.id_class[12] != null) {
         Vm_1 var17 = this.id_class(var3);
         if (var1 == rLQ.id_synchronized && !rrbb_3.id_switch()) {
            return null;
         } else if (var1 == rLQ.id_return && !rrbb_3.id_switch()) {
            return null;
         } else if (var1 == rLQ.id_boolean && !rrbb_3.id_switch()) {
            return null;
         } else if (var1 == rLQ.s && !rrbb_3.S()) {
            return null;
         } else if (var1 == rLQ.id_double && !rrbb_3.P()) {
            return null;
         } else if (var1 == rLQ.id_short && !rrbb_3.P()) {
            return null;
         } else if (var1 == rLQ.id_else && !rrbb_3.G()) {
            return null;
         } else if (var1 == rLQ.id_class && !rrbb_3.G()) {
            return null;
         } else if (var1 == rLQ.id_int && !rrbb_3.G()) {
            return null;
         } else if (var1 == rLQ.id_float && !rrbb_3.G()) {
            return null;
         } else if (var1 == rLQ.G && !rrbb_3.G()) {
            return null;
         } else if (var1 == rLQ.id_transient && !rrbb_3.E()) {
            return null;
         } else if (var1 == rLQ.id_try && !rrbb_3.r()) {
            return null;
         } else if (var1 == rLQ.id_instanceof && !rrbb_3.r()) {
            return null;
         } else if (var1 == rLQ.id_package && !rrbb_3.id_double()) {
            return null;
         } else if (var1 == rLQ.id_volatile && !rrbb_3.I()) {
            return null;
         } else if (var1 == rLQ.id_finally && !rrbb_3.I()) {
            return null;
         } else if (var1 == rLQ.id_goto && !rrbb_3.b()) {
            return null;
         } else if (var1 == rLQ.id_protected && !rrbb_3.M()) {
            return null;
         } else if ((var1 == rLQ.O || var1 == rLQ.M) && !rrbb_3.O()) {
            return null;
         } else {
            if (!var2) {
               double var18 = 1024.0;
               if (var1 == rLQ.id_catch) {
                  var18 = 38416.0;
               }

               if (var16.id_break().id_protected(var4, var6, var8) > var18) {
                  return null;
               }

               if (var17 == Vm_1.MINIMAL) {
                  return null;
               }
            }

            CH var20 = ((Cy_1)this.id_new.id_class[12]).id_class(var1, var4, var6, var8, var10, var12, var14);
            if (var1 == rLQ.id_throws) {
               rrbN_2.id_class(var20, this.id_else, var4, var6, var8, this.K);
            }

            if (var1 == rLQ.E) {
               rrbN_2.id_class(var20, this.id_else, var4, var6, var8, this.K);
            }

            if (var1 == rLQ.id_for) {
               rrbN_2.id_class(var20, this.id_else, var4, var6, var8, this.K);
            }

            if (var1 == rLQ.id_const) {
               rrbN_2.id_break(var20);
            }

            if (var1 == rLQ.id_transient) {
               rrbN_2.id_class(var20);
            }

            if (var1 == rLQ.id_package) {
               rrbN_2.id_class(var20, this.id_else, var4, var6, var8);
            }

            return var20;
         }
      } else {
         return null;
      }
   }

   public void id_throws() {
      if (this.id_else != null) {
         if (QY.d()) {
            this.id_import();
         } else {
            this.id_short();
         }

         this.id_else.id_throws();
         if (this.d == null) {
            this.d = new yz_3(this.id_else, this, rqR_2.id_case(), this.id_new.id_strictfp(), this.id_this.id_class());
         } else {
            this.d.id_class(this.id_else);
         }

         this.L = true;
         this.id_interface = true;
         yS_2.id_class(rrbb_3.id_void());
         lT_2.id_byte();
         if (rrbb_3.rL()) {
            rrbg_3.id_class();
         }

         rrMh_1.id_break();
         e = QY.L();
         this.W = ((Qw_1)this.id_new.id_class[20]).id_break;
         this.V = this.W * 16;
         this.g = this.V * this.V;
         this.id_strictfp();
         this.id_const();
         this.id_default();
         if (this.id_goto != null) {
            this.id_goto.id_class();
         }

         this.id_case();
         synchronized (this.id_public) {
            this.id_public.clear();
         }

         this.id_goto = new yO_2(this.d, this.id_else, ((Qw_1)this.id_new.id_class[20]).id_break, this);
         if (this.id_else != null) {
            an_3 var4 = this.id_new.id_catch();
            if (var4 != null) {
               this.id_goto.id_class(var4.rx(), var4.BO());
            }
         }
      }

      if ((cb_3)this.id_new.id_class[57] == null) {
         this.D = true;
      }
   }

   public void id_finally() {
      this.id_long++;
      if (this.id_long % 20 == 0) {
         ObjectIterator var1 = this.id_float.values().iterator();

         while (var1.hasNext()) {
            la_3 var2 = (la_3)var1.next();
            int var3 = var2.id_byte();
            if (this.id_long - var3 > 400) {
               var1.remove();
               this.id_class(var2);
            }
         }

         if (rrbb_3.ry()) {
            this.i.clear();
         }
      }
   }

   public String id_catch() {
      int var1 = this.id_goto.id_case.length;
      int var2 = this.id_private();
      return String.format("C: %d/%d %sD: %d, %s", var2, var1, this.id_new.id_class[82] ? "(s) " : "", this.W, this.d == null ? "null" : this.d.id_class());
   }

   public void id_extends() {
   }

   public int id_goto() {
      return ++this.A;
   }

   protected void id_case() {
      this.id_synchronized.clear();
      this.d.id_protected();
   }

   private void id_const() {
      yb_3 var1 = yb_3.id_class();
      lD_2 var2 = var1.id_byte();
      if (this.id_instanceof != null) {
         this.id_instanceof.close();
      }

      this.id_instanceof = new jm_3(this.id_while);
      this.id_class(var2, 16.0F, false);
      var2.id_finally();
      this.id_instanceof.id_class(var2);
   }

   public int id_continue() {
      if (this.id_else == null) {
         return 0;
      } else {
         AO var1 = this.id_else.id_native();
         return var1 == null ? 0 : var1.id_protected();
      }
   }

   public void id_else() {
      if (this.D) {
         this.id_throws();
         this.D = false;
      }
   }

   public String id_implements() {
      return "E: " + this.z + "/" + this.id_else.id_case() + ", B: " + this.Q + ", " + rrbb_3.id_break();
   }

   private void id_import() {
      this.id_short();
      rqO_2 var1 = new rqO_2("shaders/post/transparency.json");

      try {
         Vq_1 var2 = new Vq_1(this.id_new.A(), this.id_new.F(), this.id_new.B(), var1);
         var2.id_class(this.id_new.id_else().id_extends(), this.id_new.id_else().id_native());
         VC var10 = var2.id_class("translucent");
         VC var11 = var2.id_class("itemEntity");
         VC var12 = var2.id_class("particles");
         VC var14 = var2.id_class("weather");
         VC var7 = var2.id_class("clouds");
         this.id_for = var2;
         this.id_default = var10;
         this.id_const = var11;
         this.id_strictfp = var12;
         this.id_boolean = var14;
         this.id_transient = var7;
      } catch (Exception var9) {
         String var3 = var9 instanceof JsonSyntaxException ? "parse" : "load";
         String var4 = "Failed to " + var3 + " shader: " + var1;
         yd_3 var5 = new yd_3(var4, var9);
         if (this.id_new.id_char().id_protected().size() > 1) {
            rgN_2 var6;
            try {
               var6 = new rgN_2(this.id_new.F().id_class(var1).id_byte());
            } catch (IOException var8) {
               var6 = null;
            }

            ((Qw_1)this.id_new.id_class[20]).id_case = VW.FANCY;
            this.id_new.id_class(var5, var6);
         } else {
            KY var13 = this.id_new.id_class(new KY(var4, var5));
            ((Qw_1)this.id_new.id_class[20]).id_case = VW.FANCY;
            ((Qw_1)this.id_new.id_class[20]).id_break();
            id_implements.fatal(var4, var5);
            this.id_new.b();
            QY.id_byte(var13);
         }
      }
   }

   public List<yx_3> id_instanceof() {
      return this.q;
   }

   public int id_new() {
      return this.Y;
   }

   public int id_package() {
      return this.id_return.size();
   }

   public void id_return() {
      if (this.d != null) {
         this.d.id_private();
      }
   }

   public int id_super() {
      return this.id_synchronized.size();
   }

   public rrGK id_throw() {
      return rrGD.MODELS;
   }

   public List<yx_3> id_try() {
      return this.p;
   }

   public yB_2 id_while() {
      return this.id_this;
   }

   public yt_3 id_static() {
      return this.rr;
   }

   public int id_public() {
      return this.A;
   }

   public boolean id_protected() {
      return !rrbb_3.rs() && !rrbb_3.T() ? this.id_import != null && this.id_short != null && (cb_3)this.id_new.id_class[57] != null : false;
   }

   protected int id_private() {
      int var1 = 0;
      ObjectListIterator var2 = this.id_return.iterator();

      while (var2.hasNext()) {
         yx_3 var3 = (yx_3)var2.next();
         if (!var3.id_class.id_byte().id_class()) {
            var1++;
         }
      }

      return var1;
   }

   public VC id_abstract() {
      return this.id_const;
   }

   public int id_final() {
      return this.id_goto.id_case.length;
   }

   public void id_volatile() {
      this.L = true;
      this.id_interface = true;
   }

   public void id_synchronized() {
      if (this.d != null) {
         this.d.id_catch();
      }
   }

   public boolean id_native() {
      return this.id_synchronized.isEmpty() && this.d.id_throws();
   }

   private void id_strictfp() {
      yb_3 var1 = yb_3.id_class();
      lD_2 var2 = var1.id_byte();
      if (this.id_try != null) {
         this.id_try.close();
      }

      this.id_try = new jm_3(this.id_while);
      this.id_class(var2);
      var2.id_finally();
      this.id_try.id_class(var2);
   }
}
