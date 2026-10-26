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
   private static final Logger implements_ = LogManager.getLogger();
   private static final rqO_2 finally_ = new rqO_2("textures/environment/moon_phases.png");
   private static final rqO_2 extends_ = new rqO_2("textures/environment/sun.png");
   private static final rqO_2 native_ = new rqO_2("textures/environment/clouds.png");
   private static final rqO_2 volatile_ = new rqO_2("textures/environment/end_sky.png");
   private static final rqO_2 final_ = new rqO_2("textures/misc/forcefield.png");
   private static final rqO_2 package_ = new rqO_2("textures/environment/rain.png");
   private static final rqO_2 int_ = new rqO_2("textures/environment/snow.png");
   public static final rpr_3[] class_ = rpr_3.values();
   private final QY new_;
   private final fY_2 continue_;
   private final pg_3 super_;
   private final yB_2 this_;
   private gm_3 else_;
   private Set<yQ_2> synchronized_ = new ObjectLinkedOpenHashSet();
   private ObjectList<yx_3> return_ = new ObjectArrayList(69696);
   private final Set<ryO_2> public_ = Sets.newHashSet();
   private yO_2 goto_;
   private final jZ_2 while_ = ju_3.super_;
   private jm_3 try_;
   private jm_3 instanceof_;
   private jm_3 throw_;
   private boolean interface_ = true;
   private jm_3 char_;
   private final HD abstract_ = new HD(100);
   private int long_;
   private final Int2ObjectMap<la_3> float_ = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<la_3>> void_ = new Long2ObjectOpenHashMap();
   private final Map<rfH_2, NQ> static_ = Maps.newHashMap();
   private VC import_;
   private Vq_1 short_;
   private VC default_;
   private VC const_;
   private VC strictfp_;
   private VC boolean_;
   private VC transient_;
   private Vq_1 for_;
   private double double_ = Double.MIN_VALUE;
   private double switch_ = Double.MIN_VALUE;
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
   private rjU_2 J = rjU_2.class_;
   private Vd_1 x;
   private yz_3 d;
   private final jZ_2 k = ju_3.private_;
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
   public an_3 break_;
   public Set byte_ = new LinkedHashSet();
   public Set protected_ = new LinkedHashSet();
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
   private final rrxF_2 K = new rrxF_2(xu_3.class_.continue_(), new rfH_2(0, 0, 0));
   public boolean throws_ = false;
   public boolean case_ = false;
   private boolean D = false;
   private static int U = 0;
   public int catch_ = -1;
   public static final int private_ = 201435902;
   private static boolean e = false;
   private final Map<String, List<an_3>> a = new HashMap<>();
   private final Map<HU, Map> i = new LinkedHashMap<>();
   private yt_3 rr;

   private void boolean_() {
      if (U > 0) {
         this.return_ = new ObjectArrayList(this.return_.size() + 16);
         this.p = new ArrayList<>(this.p.size() + 16);
         this.q = new ArrayList<>(this.q.size() + 16);
      } else {
         this.return_.clear();
         this.p.clear();
         this.q.clear();
      }
   }

   public VC char_() {
      return this.default_;
   }

   private void byte_(ly_3 var1) {
      lD_2 var2 = yb_3.class_().byte_();
      roE_2 var3 = this.else_.instanceof_();
      double var4 = (double)(((Qw_1)this.new_.class_[20]).break_ * 16);
      if (!(var1.break_().break_ < var3.catch_() - var4)
         || !(var1.break_().break_ > var3.throws_() + var4)
         || !(var1.break_().protected_ < var3.private_() - var4)
         || !(var1.break_().protected_ > var3.case_() + var4)) {
         if (rrbb_3.rs()) {
            rrdZ.u();
            rrdZ.class_(rrdZ.Bj);
            rrdZ.class_(rrdX.WORLD_BORDER);
         }

         double var6 = 1.0 - var3.class_(var1.break_().break_, var1.break_().protected_) / var4;
         var6 = Math.pow(var6, 4.0);
         double var8 = var1.break_().break_;
         double var10 = var1.break_().byte_;
         double var12 = var1.break_().protected_;
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE, OP.ONE, MK.ZERO);
         this.continue_.class_(final_);
         RenderSystem.depthMask(QY.d());
         RenderSystem.pushMatrix();
         int var14 = var3.protected_().class_();
         float var15 = (float)(var14 >> 16 & 0xFF) / 255.0F;
         float var16 = (float)(var14 >> 8 & 0xFF) / 255.0F;
         float var17 = (float)(var14 & 0xFF) / 255.0F;
         RenderSystem.color4f(var15, var16, var17, (float)var6);
         RenderSystem.polygonOffset(-3.0F, -3.0F);
         RenderSystem.enablePolygonOffset();
         RenderSystem.defaultAlphaFunc();
         RenderSystem.enableAlphaTest();
         RenderSystem.disableCull();
         float var18 = (float)(rqR_2.break_() % 3000L) / 3000.0F;
         float var19 = 0.0F;
         float var20 = 0.0F;
         float var21 = 128.0F;
         var2.class_(7, ju_3.synchronized_);
         double var22 = Math.max((double)rfU_2.byte_(var12 - var4), var3.case_());
         double var24 = Math.min((double)rfU_2.throws_(var12 + var4), var3.private_());
         if (var8 > var3.catch_() - var4) {
            float var26 = 0.0F;

            for (double var27 = var22; var27 < var24; var26 += 0.5F) {
               double var29 = Math.min(1.0, var24 - var27);
               float var31 = (float)var29 * 0.5F;
               this.class_(var2, var8, var10, var12, var3.catch_(), 256, var27, var18 + var26, var18 + 0.0F);
               this.class_(var2, var8, var10, var12, var3.catch_(), 256, var27 + var29, var18 + var31 + var26, var18 + 0.0F);
               this.class_(var2, var8, var10, var12, var3.catch_(), 0, var27 + var29, var18 + var31 + var26, var18 + 128.0F);
               this.class_(var2, var8, var10, var12, var3.catch_(), 0, var27, var18 + var26, var18 + 128.0F);
               var27++;
            }
         }

         if (var8 < var3.throws_() + var4) {
            float var35 = 0.0F;

            for (double var38 = var22; var38 < var24; var35 += 0.5F) {
               double var41 = Math.min(1.0, var24 - var38);
               float var44 = (float)var41 * 0.5F;
               this.class_(var2, var8, var10, var12, var3.throws_(), 256, var38, var18 + var35, var18 + 0.0F);
               this.class_(var2, var8, var10, var12, var3.throws_(), 256, var38 + var41, var18 + var44 + var35, var18 + 0.0F);
               this.class_(var2, var8, var10, var12, var3.throws_(), 0, var38 + var41, var18 + var44 + var35, var18 + 128.0F);
               this.class_(var2, var8, var10, var12, var3.throws_(), 0, var38, var18 + var35, var18 + 128.0F);
               var38++;
            }
         }

         var22 = Math.max((double)rfU_2.byte_(var8 - var4), var3.throws_());
         var24 = Math.min((double)rfU_2.throws_(var8 + var4), var3.catch_());
         if (var12 > var3.private_() - var4) {
            float var36 = 0.0F;

            for (double var39 = var22; var39 < var24; var36 += 0.5F) {
               double var42 = Math.min(1.0, var24 - var39);
               float var45 = (float)var42 * 0.5F;
               this.class_(var2, var8, var10, var12, var39, 256, var3.private_(), var18 + var36, var18 + 0.0F);
               this.class_(var2, var8, var10, var12, var39 + var42, 256, var3.private_(), var18 + var45 + var36, var18 + 0.0F);
               this.class_(var2, var8, var10, var12, var39 + var42, 0, var3.private_(), var18 + var45 + var36, var18 + 128.0F);
               this.class_(var2, var8, var10, var12, var39, 0, var3.private_(), var18 + var36, var18 + 128.0F);
               var39++;
            }
         }

         if (var12 < var3.case_() + var4) {
            float var37 = 0.0F;

            for (double var40 = var22; var40 < var24; var37 += 0.5F) {
               double var43 = Math.min(1.0, var24 - var40);
               float var46 = (float)var43 * 0.5F;
               this.class_(var2, var8, var10, var12, var40, 256, var3.case_(), var18 + var37, var18 + 0.0F);
               this.class_(var2, var8, var10, var12, var40 + var43, 256, var3.case_(), var18 + var46 + var37, var18 + 0.0F);
               this.class_(var2, var8, var10, var12, var40 + var43, 0, var3.case_(), var18 + var46 + var37, var18 + 128.0F);
               this.class_(var2, var8, var10, var12, var40, 0, var3.case_(), var18 + var37, var18 + 128.0F);
               var40++;
            }
         }

         var2.finally_();
         yk_3.class_(var2);
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
            rrdZ.class_(rrdX.NONE);
         }
      }
   }

   public void byte_() {
      if (this.protected_()) {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ZERO, MK.ONE);
         this.import_.byte_(this.new_.else_().extends_(), this.new_.else_().native_(), false);
         RenderSystem.disableBlend();
      }
   }

   public int int_() {
      return this.z;
   }

   public VC long_() {
      return this.strictfp_;
   }

   public VC float_() {
      return this.boolean_;
   }

   public yX_2(QY var1, yB_2 var2) {
      this.new_ = var1;
      this.super_ = var1.case_();
      this.this_ = var2;
      this.continue_ = var1.A();

      for (int var3 = 0; var3 < 32; var3++) {
         for (int var4 = 0; var4 < 32; var4++) {
            float var5 = (float)(var4 - 16);
            float var6 = (float)(var3 - 16);
            float var7 = rfU_2.byte_(var5 * var5 + var6 * var6);
            this.C[var3 << 5 | var4] = -var6 / var7;
            this.l[var3 << 5 | var4] = var5 / var7;
         }
      }

      this.strictfp_();
      this.const_();
      this.default_();
   }

   public gm_3 this_() {
      return this.else_;
   }

   public VC interface_() {
      return this.import_;
   }

   public void class_(rRq_1 var1, rfH_2 var2, xc_3 var3, xc_3 var4, int var5) {
      this.class_(var2, (var5 & 8) != 0);
   }

   private void class_(rfH_2 var1, boolean var2) {
      for (int var3 = var1.d_() - 1; var3 <= var1.d_() + 1; var3++) {
         for (int var4 = var1.b_() - 1; var4 <= var1.b_() + 1; var4++) {
            for (int var5 = var1.c_() - 1; var5 <= var1.c_() + 1; var5++) {
               this.class_(var4 >> 4, var5 >> 4, var3 >> 4, var2);
            }
         }
      }
   }

   public static void class_(
      lD_2 var0, double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15, float var16
   ) {
      var0.class_(var1, var3, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var1, var3, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var1, var3, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var1, var3, var11).class_(var13, var14, var15, var16).class_();
      var0.class_(var1, var9, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var1, var9, var11).class_(var13, var14, var15, var16).class_();
      var0.class_(var1, var9, var11).class_(var13, var14, var15, var16).class_();
      var0.class_(var1, var3, var11).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var9, var11).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var3, var11).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var3, var11).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var3, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var9, var11).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var9, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var9, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var3, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var1, var9, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var1, var3, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var1, var3, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var3, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var1, var3, var11).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var3, var11).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var3, var11).class_(var13, var14, var15, var16).class_();
      var0.class_(var1, var9, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var1, var9, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var1, var9, var11).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var9, var5).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var9, var11).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var9, var11).class_(var13, var14, var15, var16).class_();
      var0.class_(var7, var9, var11).class_(var13, var14, var15, var16).class_();
   }

   public static void class_(
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
      rjV_2 var21 = var0.byte_().class_();
      float var22 = (float)var2;
      float var23 = (float)var4;
      float var24 = (float)var6;
      float var25 = (float)var8;
      float var26 = (float)var10;
      float var27 = (float)var12;
      var1.class_(var21, var22, var23, var24).class_(var14, var19, var20, var17).class_();
      var1.class_(var21, var25, var23, var24).class_(var14, var19, var20, var17).class_();
      var1.class_(var21, var22, var23, var24).class_(var18, var15, var20, var17).class_();
      var1.class_(var21, var22, var26, var24).class_(var18, var15, var20, var17).class_();
      var1.class_(var21, var22, var23, var24).class_(var18, var19, var16, var17).class_();
      var1.class_(var21, var22, var23, var27).class_(var18, var19, var16, var17).class_();
      var1.class_(var21, var25, var23, var24).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var26, var24).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var26, var24).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var22, var26, var24).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var22, var26, var24).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var22, var26, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var22, var26, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var22, var23, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var22, var23, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var23, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var23, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var23, var24).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var22, var26, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var26, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var23, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var26, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var26, var24).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var26, var27).class_(var14, var15, var16, var17).class_();
   }

   public void class_(int var1, int var2, int var3) {
      for (int var4 = var3 - 1; var4 <= var3 + 1; var4++) {
         for (int var5 = var1 - 1; var5 <= var1 + 1; var5++) {
            for (int var6 = var2 - 1; var6 <= var2 + 1; var6++) {
               this.break_(var5, var6, var4);
            }
         }
      }
   }

   public void class_(int var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var7 = var3 - 1; var7 <= var6 + 1; var7++) {
         for (int var8 = var1 - 1; var8 <= var4 + 1; var8++) {
            for (int var9 = var2 - 1; var9 <= var5 + 1; var9++) {
               this.break_(var8 >> 4, var9 >> 4, var7 >> 4);
            }
         }
      }
   }

   public void class_(rfH_2 var1, xc_3 var2, xc_3 var3) {
      if (this.new_.extends_().class_(var2, var3)) {
         this.class_(var1.b_(), var1.c_(), var1.d_(), var1.b_(), var1.c_(), var1.d_());
      }
   }

   public void class_(ly_3 var1) {
      if (rrxr_3.PD.byte_()) {
         rrGL var2 = (rrGL)rrxr_3.private_(this.else_.break_(), rrxr_3.PD);
         if (var2 != null) {
            var2.class_(this.long_, this.else_, this.new_, var1);
            return;
         }
      }

      float var27 = ((gm_3)this.new_.class_[56]).private_(1.0F) / (QY.return_() ? 1.0F : 2.0F);
      if (!rrbb_3.throw_()) {
         var27 /= 2.0F;
      }

      if (!(var27 <= 0.0F) && rrbb_3.s()) {
         Random var3 = new Random((long)this.long_ * 312987231L);
         gm_3 var4 = (gm_3)this.new_.class_[56];
         rfH_2 var5 = new rfH_2(var1.break_());
         rfH_2 var6 = null;
         int var7 = (int)(100.0F * var27 * var27) / (((Qw_1)this.new_.class_[20]).rE == Vm_1.DECREASED ? 2 : 1);

         for (int var8 = 0; var8 < var7; var8++) {
            int var9 = var3.nextInt(21) - 10;
            int var10 = var3.nextInt(21) - 10;
            rfH_2 var11 = var4.class_(rKv_1.MOTION_BLOCKING, var5.break_(var9, 0, var10)).break_();
            rYG var12 = var4.implements_(var11);
            if (var11.c_() > 0 && var11.c_() <= var5.c_() + 10 && var11.c_() >= var5.c_() - 10 && var12.byte_() == rYJ.RAIN && var12.class_(var11) >= 0.15F) {
               var6 = var11;
               if (((Qw_1)this.new_.class_[20]).rE == Vm_1.MINIMAL) {
                  break;
               }

               double var13 = var3.nextDouble();
               double var15 = var3.nextDouble();
               xc_3 var17 = var4.byte_(var11);
               rXE var18 = var4.break_(var11);
               rjC_2 var19 = var17.extends_(var4, var11);
               double var20 = var19.class_(rpB_2.Y, var13, var15);
               double var22 = (double)var18.class_((rRq_1)var4, var11);
               double var24 = Math.max(var20, var22);
               rLO var26 = !var18.class_(rlG_2.byte_) && !var17.class_(xu_3.bV) && !xn_3.private_(var17) ? rLQ.for_ : rLQ.double_;
               ((gm_3)this.new_.class_[56]).class_(var26, (double)var11.b_() + var13, (double)var11.c_() + var24, (double)var11.d_() + var15, 0.0, 0.0, 0.0);
            }
         }

         if (var6 != null && var3.nextInt(3) < this.n++) {
            this.n = 0;
            if (var6.c_() > var5.c_() + 1 && var4.class_(rKv_1.MOTION_BLOCKING, var5).c_() > rfU_2.protected_((float)var5.c_())) {
               ((gm_3)this.new_.class_[56]).class_(var6, rqn_3.kt, rqL_2.WEATHER, 0.1F, 0.5F, false);
            } else {
               ((gm_3)this.new_.class_[56]).class_(var6, rqn_3.kT, rqL_2.WEATHER, 0.2F, 1.0F, false);
            }
         }
      }
   }

   public static void class_(Ml_1 var0, Ok_1 var1, rjC_2 var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12) {
      List var13 = var2.protected_();
      int var14 = rfU_2.throws_((double)var13.size() / 3.0);

      for (int var15 = 0; var15 < var13.size(); var15++) {
         rfl_3 var16 = (rfl_3)var13.get(var15);
         float var17 = ((float)var15 % (float)var14 + 1.0F) / (float)var14;
         float var18 = (float)(var15 / var14);
         float var19 = var17 * (float)(var18 == 0.0F ? 1 : 0);
         float var20 = var17 * (float)(var18 == 1.0F ? 1 : 0);
         float var21 = var17 * (float)(var18 == 2.0F ? 1 : 0);
         break_(var0, var1, rjw_3.class_(var16.protected_(0.0, 0.0, 0.0)), var3, var5, var7, var19, var20, var21, 1.0F);
      }
   }

   private void class_(Ml_1 var1, Ok_1 var2, an_3 var3, double var4, double var6, double var8, rfH_2 var10, xc_3 var11) {
      if (!rrbb_3.rC() || !rrMo_1.class_(var11)) {
         break_(
            var1,
            var2,
            var11.class_(this.else_, var10, rjm_3.class_(var3)),
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

   private void class_(lD_2 var1, double var2, double var4, double var6, double var8, int var10, double var11, float var13, float var14) {
      var1.class_(var8 - var2, (double)var10 - var4, var11 - var6).class_(var13, var14).class_();
   }

   public static void class_(
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
      rjV_2 var21 = var0.byte_().class_();
      float var22 = (float)var2;
      float var23 = (float)var4;
      float var24 = (float)var6;
      float var25 = (float)var8;
      float var26 = (float)var10;
      float var27 = (float)var12;
      var1.class_(var21, var22, var23, var24).class_(var14, var19, var20, var17).class_();
      var1.class_(var21, var25, var23, var24).class_(var14, var19, var20, var17).class_();
      var1.class_(var21, var22, var23, var24).class_(var18, var15, var20, var17).class_();
      var1.class_(var21, var22, var26, var24).class_(var18, var15, var20, var17).class_();
      var1.class_(var21, var22, var23, var24).class_(var18, var19, var16, var17).class_();
      var1.class_(var21, var22, var23, var27).class_(var18, var19, var16, var17).class_();
      var1.class_(var21, var25, var23, var24).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var26, var24).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var26, var24).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var22, var26, var24).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var22, var26, var24).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var22, var26, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var22, var26, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var22, var23, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var22, var23, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var23, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var23, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var23, var24).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var22, var26, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var26, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var23, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var26, var27).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var26, var24).class_(var14, var15, var16, var17).class_();
      var1.class_(var21, var25, var26, var27).class_(var14, var15, var16, var17).class_();
   }

   public static void class_(
      Ml_1 var0, Ok_1 var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14, float var15, float var16, float var17
   ) {
      class_(var0, var1, var2, var4, var6, var8, var10, var12, var14, var15, var16, var17, var14, var15, var16);
   }

   public static void class_(Ml_1 var0, lD_2 var1, rfl_3 var2, float var3, float var4, float var5, float var6) {
      class_(var0, var1, var2.class_, var2.break_, var2.byte_, var2.protected_, var2.throws_, var2.case_, var3, var4, var5, var6, var3, var4, var5);
   }

   public static void class_(Ml_1 var0, Ok_1 var1, rfl_3 var2, float var3, float var4, float var5, float var6) {
      class_(var0, var1, var2.class_, var2.break_, var2.byte_, var2.protected_, var2.throws_, var2.case_, var3, var4, var5, var6, var3, var4, var5);
   }

   public void class_(int var1, rfH_2 var2, int var3) {
      switch (var1) {
         case 1023:
         case 1028:
         case 1038:
            ly_3 var4 = ((Hh_1)this.new_.class_[16]).finally_();
            if (var4.private_()) {
               double var5 = (double)var2.b_() - var4.break_().break_;
               double var7 = (double)var2.c_() - var4.break_().byte_;
               double var9 = (double)var2.d_() - var4.break_().protected_;
               double var11 = Math.sqrt(var5 * var5 + var7 * var7 + var9 * var9);
               double var13 = var4.break_().break_;
               double var15 = var4.break_().byte_;
               double var17 = var4.break_().protected_;
               if (var11 > 0.0) {
                  var13 += var5 / var11 * 2.0;
                  var15 += var7 / var11 * 2.0;
                  var17 += var9 / var11 * 2.0;
               }

               if (var1 == 1023) {
                  this.else_.class_(var13, var15, var17, rqn_3.WE, rqL_2.HOSTILE, 1.0F, 1.0F, false);
               } else if (var1 == 1038) {
                  this.else_.class_(var13, var15, var17, rqn_3.BR, rqL_2.HOSTILE, 1.0F, 1.0F, false);
               } else {
                  this.else_.class_(var13, var15, var17, rqn_3.Bm, rqL_2.HOSTILE, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void class_(Collection<ryO_2> var1, Collection<ryO_2> var2) {
      synchronized (this.public_) {
         this.public_.removeAll(var1);
         this.public_.addAll(var2);
      }
   }

   private Vm_1 class_(boolean var1) {
      Vm_1 var2 = ((Qw_1)this.new_.class_[20]).rE;
      if (var1 && var2 == Vm_1.MINIMAL && this.else_.int_.nextInt(10) == 0) {
         var2 = Vm_1.DECREASED;
      }

      if (var2 == Vm_1.DECREASED && this.else_.int_.nextInt(3) == 0) {
         var2 = Vm_1.MINIMAL;
      }

      return var2;
   }

   public static int class_(rRp_1 var0, rfH_2 var1) {
      return class_(var0, var0.byte_(var1), var1);
   }

   public yQ_2 class_(rfH_2 var1) {
      return this.goto_.class_(var1);
   }

   @Override
   public void class_(rAL var1) {
      this.continue_.class_(final_);
      RenderSystem.texParameter(3553, 10242, 10497);
      RenderSystem.texParameter(3553, 10243, 10497);
      RenderSystem.bindTexture(0);
      this.break_();
      if (QY.d()) {
         this.import_();
      }
   }

   private void class_(ly_3 var1, yt_3 var2, boolean var3) {
      if (this.catch_ == 0) {
         this.break_(var1, var2, var3);
         ((cq_3)this.new_.class_[19]).throws_().break_(201435902);
      }

      if (this.catch_ > -1) {
         this.catch_--;
      }
   }

   public void class_(rhd_3 var1, int var2, rfH_2 var3, int var4) {
      Random var5 = this.else_.int_;
      switch (var2) {
         case 1000:
            this.else_.class_(var3, rqn_3.Py, rqL_2.BLOCKS, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.else_.class_(var3, rqn_3.Pp, rqL_2.BLOCKS, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.else_.class_(var3, rqn_3.Pq, rqL_2.BLOCKS, 1.0F, 1.2F, false);
            break;
         case 1003:
            this.else_.class_(var3, rqn_3.BC, rqL_2.NEUTRAL, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.else_.class_(var3, rqn_3.SX, rqL_2.NEUTRAL, 1.0F, 1.2F, false);
            break;
         case 1005:
            this.else_.class_(var3, rqn_3.En, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1006:
            this.else_.class_(var3, rqn_3.WW, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1007:
            this.else_.class_(var3, rqn_3.WQ, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1008:
            this.else_.class_(var3, rqn_3.Ss, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1009:
            this.else_.class_(var3, rqn_3.Sk, rqL_2.BLOCKS, 0.5F, 2.6F + (var5.nextFloat() - var5.nextFloat()) * 0.8F, false);
            break;
         case 1010:
            if (rdb_3.break_(var4) instanceof rdR_2) {
               if (rrxr_3.Bz.byte_()) {
                  this.class_(((rdR_2)rdb_3.break_(var4)).return_(), var3, (rdR_2)rdb_3.break_(var4));
               } else {
                  this.class_(((rdR_2)rdb_3.break_(var4)).return_(), var3);
               }
            } else {
               this.class_(null, var3);
            }
            break;
         case 1011:
            this.else_.class_(var3, rqn_3.EA, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1012:
            this.else_.class_(var3, rqn_3.Wk, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1013:
            this.else_.class_(var3, rqn_3.Wz, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1014:
            this.else_.class_(var3, rqn_3.SS, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1015:
            this.else_.class_(var3, rqn_3.sB, rqL_2.HOSTILE, 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.else_.class_(var3, rqn_3.sP, rqL_2.HOSTILE, 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.else_.class_(var3, rqn_3.BA, rqL_2.HOSTILE, 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.else_.class_(var3, rqn_3.D, rqL_2.HOSTILE, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.else_.class_(var3, rqn_3.Wj, rqL_2.HOSTILE, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.else_.class_(var3, rqn_3.WV, rqL_2.HOSTILE, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.else_.class_(var3, rqn_3.Wg, rqL_2.HOSTILE, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.else_.class_(var3, rqn_3.ke, rqL_2.HOSTILE, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.else_.class_(var3, rqn_3.Wr, rqL_2.HOSTILE, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.else_.class_(var3, rqn_3.F, rqL_2.NEUTRAL, 0.05F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.else_.class_(var3, rqn_3.Wa, rqL_2.HOSTILE, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.else_.class_(var3, rqn_3.zE, rqL_2.NEUTRAL, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.else_.class_(var3, rqn_3.throw_, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.else_.class_(var3, rqn_3.void_, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.else_.class_(var3, rqn_3.abstract_, rqL_2.BLOCKS, 0.3F, this.else_.int_.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.new_.c().class_(Np_1.byte_(rqn_3.hK, var5.nextFloat() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.else_.class_(var3, rqn_3.ro, rqL_2.BLOCKS, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.else_.class_(var3, rqn_3.rY, rqL_2.BLOCKS, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.else_.class_(var3, rqn_3.rO, rqL_2.BLOCKS, 1.0F, 1.0F, false);
            break;
         case 1036:
            this.else_.class_(var3, rqn_3.ET, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1037:
            this.else_.class_(var3, rqn_3.Et, rqL_2.BLOCKS, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1039:
            this.else_.class_(var3, rqn_3.Oj, rqL_2.HOSTILE, 0.3F, this.else_.int_.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.else_.class_(var3, rqn_3.WR, rqL_2.NEUTRAL, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.else_.class_(var3, rqn_3.EW, rqL_2.NEUTRAL, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.else_.class_(var3, rqn_3.sZ, rqL_2.BLOCKS, 1.0F, this.else_.int_.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.else_.class_(var3, rqn_3.rS, rqL_2.BLOCKS, 1.0F, this.else_.int_.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.else_.class_(var3, rqn_3.xN, rqL_2.BLOCKS, 1.0F, this.else_.int_.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1500:
            xU_2.class_(this.else_, var3, var4 > 0);
            break;
         case 1501:
            this.else_.class_(var3, rqn_3.GS, rqL_2.BLOCKS, 0.5F, 2.6F + (var5.nextFloat() - var5.nextFloat()) * 0.8F, false);

            for (int var40 = 0; var40 < 8; var40++) {
               this.else_
                  .class_(rLQ.short_, (double)var3.b_() + var5.nextDouble(), (double)var3.c_() + 1.2, (double)var3.d_() + var5.nextDouble(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.else_.class_(var3, rqn_3.Xn, rqL_2.BLOCKS, 0.5F, 2.6F + (var5.nextFloat() - var5.nextFloat()) * 0.8F, false);

            for (int var39 = 0; var39 < 5; var39++) {
               double var42 = (double)var3.b_() + var5.nextDouble() * 0.6 + 0.2;
               double var44 = (double)var3.c_() + var5.nextDouble() * 0.6 + 0.2;
               double var45 = (double)var3.d_() + var5.nextDouble() * 0.6 + 0.2;
               this.else_.class_(rLQ.double_, var42, var44, var45, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.else_.class_(var3, rqn_3.Bg, rqL_2.BLOCKS, 1.0F, 1.0F, false);

            for (int var38 = 0; var38 < 16; var38++) {
               double var41 = (double)var3.b_() + (5.0 + var5.nextDouble() * 6.0) / 16.0;
               double var43 = (double)var3.c_() + 0.8125;
               double var11 = (double)var3.d_() + (5.0 + var5.nextDouble() * 6.0) / 16.0;
               this.else_.class_(rLQ.double_, var41, var43, var11, 0.0, 0.0, 0.0);
            }
            break;
         case 2000:
            rpr_3 var6 = rpr_3.class_(var4);
            int var7 = var6.implements_();
            int var8 = var6.finally_();
            int var9 = var6.extends_();
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
               this.class_(rLQ.double_, var50, var51, var53, var54, var55, var62);
            }
            break;
         case 2001:
            xc_3 var16 = xd_3.class_(var4);
            if (!var16.catch_()) {
               zr_3 var47 = var16.package_();
               if (rrxr_3.c.byte_()) {
                  var47 = (zr_3)rrxr_3.private_(var16, rrxr_3.c, this.else_, var3, null);
               }

               this.else_.class_(var3, var47.byte_(), rqL_2.BLOCKS, (var47.class_() + 1.0F) / 2.0F, var47.break_() * 0.8F, false);
            }

            if (rrbb_3.M()) {
               ((Cy_1)this.new_.class_[12]).class_(var3, var16);
            }
            break;
         case 2002:
         case 2007:
            rjU_2 var17 = rjU_2.protected_(var3);

            for (int var18 = 0; var18 < 8; var18++) {
               this.class_(
                  new rLk_1(rLQ.void_, new rdn_3(rdy_3.kk)),
                  var17.break_,
                  var17.byte_,
                  var17.protected_,
                  var5.nextGaussian() * 0.15,
                  var5.nextDouble() * 0.2,
                  var5.nextGaussian() * 0.15
               );
            }

            float var49 = (float)(var4 >> 16 & 0xFF) / 255.0F;
            float var19 = (float)(var4 >> 8 & 0xFF) / 255.0F;
            float var20 = (float)(var4 >> 0 & 0xFF) / 255.0F;
            rLO var21 = var2 == 2007 ? rLQ.float_ : rLQ.int_;

            for (int var52 = 0; var52 < 100; var52++) {
               double var23 = var5.nextDouble() * 4.0;
               double var25 = var5.nextDouble() * Math.PI * 2.0;
               double var27 = Math.cos(var25) * var23;
               double var61 = 0.01 + var5.nextDouble() * 0.5;
               double var64 = Math.sin(var25) * var23;
               CH var66 = this.break_(
                  var21, var21.protected_().throws_(), var17.break_ + var27 * 0.1, var17.byte_ + 0.3, var17.protected_ + var64 * 0.1, var27, var61, var64
               );
               if (var66 != null) {
                  float var34 = 0.75F + var5.nextFloat() * 0.25F;
                  var66.class_(var49 * var34, var19 * var34, var20 * var34);
                  var66.byte_((float)var23);
               }
            }

            rrnd_3.class_(var17, var4);
            this.else_.class_(var3, rqn_3.xt, rqL_2.NEUTRAL, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double var22 = (double)var3.b_() + 0.5;
            double var24 = (double)var3.c_();
            double var26 = (double)var3.d_() + 0.5;

            for (int var58 = 0; var58 < 8; var58++) {
               this.class_(
                  new rLk_1(rLQ.void_, new rdn_3(rdy_3.JT)),
                  var22,
                  var24,
                  var26,
                  var5.nextGaussian() * 0.15,
                  var5.nextDouble() * 0.2,
                  var5.nextGaussian() * 0.15
               );
            }

            for (double var59 = 0.0; var59 < Math.PI * 2; var59 += Math.PI / 20) {
               this.class_(
                  rLQ.transient_,
                  var22 + Math.cos(var59) * 5.0,
                  var24 - 0.4,
                  var26 + Math.sin(var59) * 5.0,
                  Math.cos(var59) * -5.0,
                  0.0,
                  Math.sin(var59) * -5.0
               );
               this.class_(
                  rLQ.transient_,
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
               this.else_.class_(rLQ.double_, var60, var63, var65, 0.0, 0.0, 0.0);
               this.else_.class_(rLQ.try_, var60, var63, var65, 0.0, 0.0, 0.0);
            }
            break;
         case 2005:
            rxW_2.class_(this.else_, var3, var4);
            break;
         case 2006:
            for (int var56 = 0; var56 < 200; var56++) {
               float var29 = var5.nextFloat() * 4.0F;
               float var30 = var5.nextFloat() * (float) (Math.PI * 2);
               double var31 = (double)(rfU_2.break_(var30) * var29);
               double var33 = 0.01 + var5.nextDouble() * 0.5;
               double var35 = (double)(rfU_2.class_(var30) * var29);
               CH var37 = this.break_(
                  rLQ.implements_, false, (double)var3.b_() + var31 * 0.1, (double)var3.c_() + 0.3, (double)var3.d_() + var35 * 0.1, var31, var33, var35
               );
               if (var37 != null) {
                  var37.byte_(var29);
               }
            }

            if (var4 == 1) {
               this.else_.class_(var3, rqn_3.BZ, rqL_2.HOSTILE, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.else_.class_(rLQ.return_, (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int var28 = 0; var28 < 8; var28++) {
               this.else_
                  .class_(rLQ.case_, (double)var3.b_() + var5.nextDouble(), (double)var3.c_() + 1.2, (double)var3.d_() + var5.nextDouble(), 0.0, 0.0, 0.0);
            }
            break;
         case 3000:
            this.else_.class_(rLQ.synchronized_, true, (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 0.0, 0.0, 0.0);
            this.else_.class_(var3, rqn_3.BV, rqL_2.BLOCKS, 10.0F, (1.0F + (this.else_.int_.nextFloat() - this.else_.int_.nextFloat()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.else_.class_(var3, rqn_3.BF, rqL_2.HOSTILE, 64.0F, 0.8F + this.else_.int_.nextFloat() * 0.3F, false);
      }
   }

   public void class_(rLx_1 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.class_(var1, var2, false, var3, var5, var7, var9, var11, var13);
   }

   public void class_(rqA_2 var1, rfH_2 var2, rdR_2 var3) {
      NQ var4 = this.static_.get(var2);
      if (var4 != null) {
         this.new_.c().break_(var4);
         this.static_.remove(var2);
      }

      if (var1 != null) {
         rdR_2 var5 = rdR_2.class_(var1);
         if (rrxr_3.Bz.byte_()) {
            var5 = var3;
         }

         if (var5 != null) {
            ((cq_3)this.new_.class_[19]).class_(var5.private_());
         }

         Np_1 var6 = Np_1.class_(var1, (double)var2.b_(), (double)var2.c_(), (double)var2.d_());
         this.static_.put(var2, var6);
         this.new_.c().class_(var6);
      }

      this.class_(this.else_, var2, var1 != null);
   }

   public void class_(rqA_2 var1, rfH_2 var2) {
      this.class_(var1, var2, var1 == null ? null : rdR_2.class_(var1));
   }

   private void class_(int var1, int var2, int var3, boolean var4) {
      this.goto_.class_(var1, var2, var3, var4);
   }

   public void class_(rLx_1 var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      try {
         this.break_(var1, var2, var3, var4, var6, var8, var10, var12, var14);
      } catch (Throwable var19) {
         KY var17 = KY.class_(var19, "Exception while adding particle");
         Ko_1 var18 = var17.class_("Particle being added");
         var18.class_("ID", rVL.switch_.break_(var1.protected_()));
         var18.class_("Parameters", var1.byte_());
         var18.class_("Position", () -> Ko_1.class_(var4, var6, var8));
         throw new KU(var17);
      }
   }

   private <T extends rLx_1> void class_(T var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.class_(var1, var1.protected_().throws_(), var2, var4, var6, var8, var10, var12);
   }

   public static int class_(rRp_1 var0, xc_3 var1, rfH_2 var2) {
      if (var1.throws_(var0, var2)) {
         return 15728880;
      } else {
         int var3 = var0.class_(rRo_1.SKY, var2);
         int var4 = var0.class_(rRo_1.BLOCK, var2);
         int var5 = var1.continue_(var0, var2);
         if (var4 < var5) {
            var4 = var5;
         }

         int var6 = var3 << 20 | var4 << 4;
         if (rrbb_3.rL() && var0 instanceof rRq_1 && (!e || !var1.implements_(var0, var2))) {
            var6 = rrbg_3.class_(var2, var6);
         }

         return var6;
      }
   }

   private yQ_2 class_(rfH_2 var1, yQ_2 var2, rpr_3 var3, boolean var4, int var5) {
      yQ_2 var6 = var2.break_(var3);
      if (var6 == null) {
         return null;
      } else if (var6.throws_().c_() > var5) {
         return null;
      } else {
         if (var4) {
            rfH_2 var7 = var6.throws_();
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

   public void class_(ly_3 var1, yt_3 var2, boolean var3, int var4, boolean var5) {
      rjU_2 var6 = var1.break_();
      if (((Qw_1)this.new_.class_[20]).break_ != this.W) {
         this.throws_();
      }

      double var7 = ((cb_3)this.new_.class_[57]).rx() - this.double_;
      double var9 = ((cb_3)this.new_.class_[57]).re() - this.switch_;
      double var11 = ((cb_3)this.new_.class_[57]).BO() - this.r;
      if (this.P != (Integer)((cb_3)this.new_.class_[57]).throws_[51]
         || this.B != (Integer)((cb_3)this.new_.class_[57]).throws_[52]
         || this.S != (Integer)((cb_3)this.new_.class_[57]).throws_[53]
         || var7 * var7 + var9 * var9 + var11 * var11 > 16.0) {
         this.double_ = ((cb_3)this.new_.class_[57]).rx();
         this.switch_ = ((cb_3)this.new_.class_[57]).re();
         this.r = ((cb_3)this.new_.class_[57]).BO();
         this.P = (Integer)((cb_3)this.new_.class_[57]).throws_[51];
         this.B = (Integer)((cb_3)this.new_.class_[57]).throws_[52];
         this.S = (Integer)((cb_3)this.new_.class_[57]).throws_[53];
         this.goto_.class_(((cb_3)this.new_.class_[57]).rx(), ((cb_3)this.new_.class_[57]).BO());
      }

      if (rrbb_3.rL()) {
         rrbg_3.class_(this);
      }

      this.d.class_(var6);
      rfH_2 var13 = var1.byte_();
      yQ_2 var14 = this.goto_.class_(var13);
      byte var15 = 16;
      rfH_2 var16 = new rfH_2(rfU_2.byte_(var6.break_ / 16.0) * 16, rfU_2.byte_(var6.byte_ / 16.0) * 16, rfU_2.byte_(var6.protected_ / 16.0) * 16);
      float var17 = var1.protected_();
      float var18 = var1.throws_();
      this.L = this.L
         || !this.synchronized_.isEmpty()
         || var6.break_ != this.s
         || var6.byte_ != this.E
         || var6.protected_ != this.G
         || (double)var17 != this.b
         || (double)var18 != this.M;
      this.s = var6.break_;
      this.E = var6.byte_;
      this.G = var6.protected_;
      this.b = (double)var17;
      this.M = (double)var18;
      int var19 = this.continue_();
      if (var19 != this.o) {
         this.o = var19;
         this.L = true;
      }

      an_3 var20 = var1.catch_();
      int var21 = 256;
      if (!rrxd_3.class_()) {
         this.L = true;
      }

      if (!var3 && this.L && rrbb_3.rt() && !rrdZ.new_) {
         var21 = rrxd_3.class_(this.else_, var20, this.W);
      }

      yQ_2 var22 = this.goto_.class_(new rfH_2(var20.rx(), var20.re(), var20.BO()));
      if (rrdZ.new_) {
         this.return_ = this.I;
         this.p = this.f;
         this.q = this.j;
         if (!var3 && this.L) {
            this.boolean_();
            if (var22 != null && var22.throws_().c_() > var21) {
               this.p.add(var22.package_());
            }

            Iterator var23 = rrdC.class_(this.else_, 0.0, var20, this.W, this.goto_);

            while (var23.hasNext()) {
               yQ_2 var24 = (yQ_2)var23.next();
               if (var24 != null && var24.throws_().c_() <= var21) {
                  yx_3 var25 = var24.package_();
                  if (!var24.class_.get().class_()) {
                     this.return_.add(var25);
                  }

                  if (rrWM.class_(var24.volatile_())) {
                     this.p.add(var25);
                  }

                  if (var24.byte_().break_().size() > 0) {
                     this.q.add(var25);
                  }
               }
            }
         }
      } else {
         this.return_ = this.T;
         this.p = this.t;
         this.q = this.w;
      }

      if (!var3 && this.L && !rrdZ.new_) {
         this.L = false;
         this.boolean_();
         this.y.clear();
         Deque var41 = this.y;
         an_3.case_(rfU_2.class_((double)((Qw_1)this.new_.class_[20]).break_ / 8.0, 1.0, 2.5) * (double)((Qw_1)this.new_.class_[20]).byte_);
         boolean var43 = (Boolean)this.new_.class_[82];
         rfH_2 var45 = var1.byte_();
         int var26 = var45.c_();
         int var27 = var26 >> 4 << 4;
         if (var27 > var21) {
            var21 += 16;
            if (var27 > var21 && var21 < 256) {
               if (var22 != null) {
                  this.p.add(var22.package_());
               }

               rjU_2 var28 = new rjU_2((double)var45.b_(), (double)var21, (double)var45.d_());
               rjU_2 var29 = new rjU_2(var28.class_(), var28.break_(), var28.byte_());
               rje_3 var30 = var1.volatile_();
               rje_3 var31 = new rje_3(var30.class_(), 0.0F, var30.byte_());
               if (!var31.protected_()) {
                  var31 = new rje_3(1.0F, 0.0F, 0.0F);
               }

               double var32 = (double)(var31.class_() * 16.0F);
               double var34 = (double)(var31.byte_() * 16.0F);
               double var36 = (double)(this.W * 16);

               for (double var38 = var36 * var36; var29.implements_(var28) < var38; var29 = var29.break_(var32, 0.0, var34)) {
                  yQ_2 var40 = this.goto_.class_(new rfH_2(var29));
                  if (var40 == null) {
                     break;
                  }

                  if (var2.class_(var40.break_)) {
                     var40.class_(var4);
                     var41.add(new yx_3(var40, null, 0));
                     break;
                  }
               }
            }
         }

         if (var41.isEmpty()) {
            if (var14 != null && var14.throws_().c_() <= var21) {
               if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().K().aJ_()) {
                  var43 = false;
               } else if (var5 && this.else_.byte_(var13).implements_(this.else_, var13)) {
                  var43 = false;
               }

               var14.class_(var4);
               var41.add(new yx_3(var14, null, 0));
            } else {
               int var49 = var16.c_() > 0 ? Math.min(var21, 248) : 8;
               if (var22 != null) {
                  this.p.add(var22.package_());
               }

               int var52 = rfU_2.byte_(var6.break_ / 16.0) * 16;
               int var54 = rfU_2.byte_(var6.protected_ / 16.0) * 16;
               ArrayList var56 = Lists.newArrayList();

               for (int var58 = -this.W; var58 <= this.W; var58++) {
                  for (int var33 = -this.W; var33 <= this.W; var33++) {
                     yQ_2 var61 = this.goto_.class_(new rfH_2(var52 + (var58 << 4) + 8, var49, var54 + (var33 << 4) + 8));
                     if (var61 != null && var2.class_(var61.break_)) {
                        var61.class_(var4);
                        yx_3 var35 = var61.package_();
                        var35.class_(null, 0, 0);
                        var56.add(var35);
                     }
                  }
               }

               var56.sort(Comparator.comparingDouble(var1x -> var13.private_(var1x.class_.throws_().break_(8, 8, 8))));
               var41.addAll(var56);
            }
         }

         boolean var50 = rrbb_3.return_();

         while (!var41.isEmpty()) {
            yx_3 var53 = (yx_3)var41.poll();
            yQ_2 var55 = var53.class_;
            rpr_3 var57 = var53.break_;
            yZ_2 var59 = var55.class_.get();
            if (!var59.class_() || var55.catch_()) {
               this.return_.add(var53);
            }

            if (rrWM.class_(var55.volatile_())) {
               this.p.add(var53);
            }

            if (var59.break_().size() > 0) {
               this.q.add(var53);
            }

            rpr_3[] var60 = var43 ? rrxd_3.class_(var53.byte_) : rpr_3.VALUES;

            for (rpr_3 var37 : var60) {
               if (!var43 || var57 == null || var59.class_(var57.case_(), var37)) {
                  yQ_2 var65 = this.class_(var16, var55, var37, var50, var21);
                  if (var65 != null && var65.class_(var4) && var2.class_(var65.break_)) {
                     int var39 = var53.byte_ | 1 << var37.ordinal();
                     yx_3 var66 = var65.package_();
                     var66.class_(var37, var39, var53.protected_ + 1);
                     var41.add(var66);
                  }
               }
            }
         }
      }

      Set var42 = this.synchronized_;
      this.synchronized_ = this.H;
      this.H = var42;
      this.synchronized_.clear();
      ObjectListIterator var44 = this.return_.iterator();

      while (var44.hasNext()) {
         yx_3 var46 = (yx_3)var44.next();
         yQ_2 var47 = var46.class_;
         if (var47.catch_() || var42.contains(var47)) {
            this.L = true;
            rfH_2 var48 = var47.throws_();
            boolean var51 = (double)rrWD.class_(var16, (float)(var48.b_() + 8), (float)(var48.c_() + 8), (float)(var48.d_() + 8)) < 768.0;
            if (!var47.private_() && !var51) {
               this.synchronized_.add(var47);
            } else if (!var47.native_()) {
               this.protected_.add(var47);
            } else {
               this.d.class_(var47);
               var47.case_();
            }
         }
      }

      this.synchronized_.addAll(var42);
   }

   public void class_(Ml_1 var1) {
      if (!var1.protected_()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   public void class_(Ml_1 var1, float var2, long var3, boolean var5, ly_3 var6, Hh_1 var7, HQ var8, rjV_2 var9) {
      jz_3.break_.class_(this.else_, this.new_.A(), (cm_3)this.new_.class_[15], var6, (rjG_2)this.new_.class_[64]);
      this.super_.class_(this.else_, var6, (an_3)this.new_.class_[63]);
      ((gm_3)this.new_.class_[56]).native_().class_().class_(Integer.MAX_VALUE, true, true);
      rjU_2 var10 = var6.break_();
      double var11 = var10.class_();
      double var13 = var10.break_();
      double var15 = var10.byte_();
      rjV_2 var17 = var1.byte_().class_();
      boolean var18 = this.c != null;
      yt_3 var19;
      if (var18) {
         var19 = this.c;
         var19.class_(this.m.class_, this.m.break_, this.m.byte_);
      } else {
         var19 = new yt_3(var17, var9);
         var19.class_(var11, var13, var15);
      }

      this.rr = var19;
      if (this.N) {
         this.class_(var17, var9, var10.break_, var10.byte_, var10.protected_, var18 ? new yt_3(var17, var9) : var19);
         this.N = false;
      }

      if (rrbb_3.rs()) {
         rrdZ.class_(0, 0, this.new_.else_().extends_(), this.new_.else_().native_());
      } else {
         RenderSystem.viewport(0, 0, this.new_.else_().extends_(), this.new_.else_().native_());
      }

      HE.class_(var6, var2, (gm_3)this.new_.class_[56], ((Qw_1)this.new_.class_[20]).break_, var7.break_(var2));
      RenderSystem.clear(16640, (Boolean)QY.break_[2]);
      boolean var20 = rrbb_3.rs();
      if (var20) {
         rrdZ.throw_();
         rrdZ.class_(var1, var6, var2);
         rrdZ.interface_();
      }

      var19.class_ = rrbb_3.rs() && !rrdZ.return_();
      float var21 = var7.implements_();
      boolean var22 = ((gm_3)this.new_.class_[56]).break_().class_(rfU_2.byte_(var11), rfU_2.byte_(var13)) || ((cq_3)this.new_.class_[19]).extends_().case_();
      if ((rrbb_3.Z() || rrbb_3.v() || rrbb_3.n()) && !rrdZ.new_) {
         HE.class_(var6, HG.FOG_SKY, var21, var22, var2);
         if (var20) {
            rrdZ.short_();
         }

         this.class_(var1, var2);
         if (var20) {
            rrdZ.default_();
         }
      } else {
         MT.final_();
      }

      HE.class_(var6, HG.FOG_TERRAIN, Math.max(var21 - 16.0F, 32.0F), var22, var2);
      this.class_(var6, var19, ((cb_3)this.new_.class_[57]).native_());
      this.class_(var6, var19, var18, this.A++, ((cb_3)this.new_.class_[57]).native_());
      int var23 = ((Qw_1)this.new_.class_[20]).protected_;
      long var24;
      if ((double)var23 == QF.extends_.case_()) {
         var24 = 0L;
      } else {
         var24 = (long)(1000000000 / var23);
      }

      long var26 = rqR_2.byte_() - var3;
      long var28 = this.abstract_.class_(var26);
      long var30 = var28 * 3L / 2L;
      long var32 = rfU_2.class_(var30, var24, 33333333L);
      this.class_(var3 + var32);
      if (((Qw_1)this.new_.class_[20]).rJ) {
         GL11.glFinish();
      }

      if (rrbb_3.synchronized_() && HE.protected_) {
         MT.byte_(false);
      }

      this.class_(HU.case_(), var1, var11, var13, var15);
      this.new_.A().break_(fJ_2.class_).class_(false, ((Qw_1)this.new_.class_[20]).instanceof_ > 0);
      this.class_(HU.catch_(), var1, var11, var13, var15);
      this.new_.A().break_(fJ_2.class_).else_();
      this.class_(HU.private_(), var1, var11, var13, var15);
      if (var20) {
         rrdL.protected_();
      }

      if (this.else_.break_().throws_()) {
         HF.class_(var1.byte_().class_());
      } else {
         HF.break_(var1.byte_().class_());
      }

      if (var20) {
         rrdZ.for_();
      }

      qh_3.throws_();
      U++;
      this.z = 0;
      this.Q = 0;
      this.Y = 0;
      if (this.const_ != null) {
         this.const_.break_((Boolean)QY.break_[2]);
         this.const_.class_(this.new_.B());
         this.new_.B().class_(false);
      }

      if (this.boolean_ != null) {
         this.boolean_.break_((Boolean)QY.break_[2]);
      }

      if (this.protected_()) {
         this.import_.break_((Boolean)QY.break_[2]);
         this.new_.B().class_(false);
      }

      boolean var34 = false;
      Hd_1 var35 = this.this_.break_();
      if (rrbb_3.rB()) {
         rrxL_2.class_();
      }

      for (yx_3 var37 : this.p) {
         yQ_2 var38 = var37.class_;
         roJ_2 var39 = var38.volatile_();

         for (an_3 var41 : var39.final_()[var38.throws_().c_() / 16]) {
            boolean var42 = var41 == (cb_3)this.new_.class_[57] && !((cb_3)this.new_.class_[57]).native_();
            if ((this.super_.class_(var41, var19, var11, var13, var15) || var41.else_((cb_3)this.new_.class_[57]))
               && (var41 != var6.catch_() || var6.implements_() || var6.catch_() instanceof iB_2 && ((iB_2)var6.catch_()).Sc())
               && (var41 != (cb_3)this.new_.class_[57] || var6.catch_() == var41 || var42)) {
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
            if ((Integer)var68.throws_[41] == 0) {
               Double var55 = var68.rx();
               var68.throws_[34] = var55;
               Double var56 = var68.re();
               var68.throws_[35] = var56;
               Double var57 = var68.BO();
               var68.throws_[36] = var57;
            }

            Object var74;
            if (this.protected_() && this.new_.class_(var68)) {
               var34 = true;
               Hc_1 var80 = this.this_.protected_();
               var74 = var80;
               int var85 = var68.rK();
               short var89 = 255;
               int var92 = var85 >> 16 & 0xFF;
               int var45 = var85 >> 8 & 0xFF;
               int var46 = var85 & 0xFF;
               var80.class_(var92, var45, var46, 255);
            } else {
               var74 = var35;
            }

            this.break_ = var68;
            if (var20) {
               rrdZ.class_(var68);
            }

            this.class_(var68, var11, var13, var15, var2, var1, (Hx_1)var74);
            this.break_ = null;
         }

         var61.clear();
      }

      this.class_(var1);
      var35.class_(HU.break_(fJ_2.class_));
      var35.class_(HU.byte_(fJ_2.class_));
      var35.class_(HU.protected_(fJ_2.class_));
      var35.class_(HU.implements_(fJ_2.class_));
      if (var20) {
         rrdZ.r();
         rrdZ.E();
      }

      jX_2.class_();
      boolean var60 = rrxr_3.Pg.byte_();
      yt_3 var62 = var19;

      for (yx_3 var69 : this.q) {
         List var75 = var69.class_.byte_().break_();
         if (!var75.isEmpty()) {
            for (ryO_2 var86 : var75) {
               if (var60) {
                  rfl_3 var90 = (rfl_3)rrxr_3.private_(var86, rrxr_3.Pg);
                  if (var90 != null && !var62.class_(var90)) {
                     continue;
                  }
               }

               if (var20) {
                  rrdZ.class_(var86);
               }

               rfH_2 var93 = var86.char_();
               Object var94 = var35;
               var1.class_();
               var1.class_((double)var93.b_() - var11, (double)var93.c_() - var13, (double)var93.d_() - var15);
               SortedSet var96 = (SortedSet)this.void_.get(var93.package_());
               if (var96 != null && !var96.isEmpty()) {
                  int var47 = ((la_3)var96.last()).break_();
                  if (var47 >= 0) {
                     MH var48 = var1.byte_();
                     Oz_1 var49 = new Oz_1(this.this_.byte_().getBuffer(IC.extends_.get(var47)), var48.class_(), var48.break_());
                     var94 = (Hx_1)var2x -> {
                        Ok_1 var3x = var35.getBuffer(var2x);
                        return var2x.interface_() ? OQ.class_(var49, var3x) : var3x;
                     };
                  }
               }

               jz_3.break_.class_(var86, var2, var1, (Hx_1)var94);
               var1.break_();
               this.Y++;
            }
         }
      }

      synchronized (this.public_) {
         for (ryO_2 var76 : this.public_) {
            if (var60) {
               rfl_3 var82 = (rfl_3)rrxr_3.private_(var76, rrxr_3.Pg);
               if (var82 != null && !var62.class_(var82)) {
                  continue;
               }
            }

            if (var20) {
               rrdZ.class_(var76);
            }

            rfH_2 var87 = var76.char_();
            var1.class_();
            var1.class_((double)var87.b_() - var11, (double)var87.c_() - var13, (double)var87.d_() - var15);
            jz_3.break_.class_(var76, var2, var1, var35);
            var1.break_();
            this.Y++;
         }
      }

      this.class_(var1);
      var35.class_(HU.case_());
      var35.class_(lp_3.catch_());
      var35.class_(lp_3.private_());
      var35.class_(lp_3.byte_());
      var35.class_(lp_3.protected_());
      var35.class_(lp_3.throws_());
      var35.class_(lp_3.case_());
      var35.class_(lp_3.class_());
      this.this_.protected_().break_();
      if (rrbb_3.rB()) {
         rrxL_2.break_();
      }

      if (var34) {
         this.short_.class_(var2);
         this.new_.B().class_(false);
      }

      if (var20) {
         rrdZ.G();
      }

      this.throws_ = true;
      ObjectIterator var66 = this.void_.long2ObjectEntrySet().iterator();

      while (var66.hasNext()) {
         Entry var71 = (Entry)var66.next();
         rfH_2 var77 = rfH_2.protected_(var71.getLongKey());
         double var83 = (double)var77.b_() - var11;
         double var91 = (double)var77.c_() - var13;
         double var95 = (double)var77.d_() - var15;
         if (!(var83 * var83 + var91 * var91 + var95 * var95 > 1024.0)) {
            SortedSet var97 = (SortedSet)var71.getValue();
            if (var97 != null && !var97.isEmpty()) {
               int var98 = ((la_3)var97.last()).break_();
               var1.class_();
               var1.class_((double)var77.b_() - var11, (double)var77.c_() - var13, (double)var77.d_() - var15);
               MH var99 = var1.byte_();
               Oz_1 var50 = new Oz_1(this.this_.byte_().getBuffer(IC.extends_.get(var98)), var99.class_(), var99.break_());
               this.new_.synchronized_().class_(this.else_.byte_(var77), var77, this.else_, var1, var50);
               var1.break_();
            }
         }
      }

      this.throws_ = false;
      rrxn_3.break_();
      U--;
      this.class_(var1);
      rjG_2 var67 = (rjG_2)this.new_.class_[64];
      if (var5 && var67 != null && var67.byte_() == rjM_2.BLOCK) {
         rfH_2 var72 = ((rff_3)var67).class_();
         xc_3 var78 = this.else_.byte_(var72);
         if (var20) {
            rrdL.extends_();
         }

         boolean var84;
         if (rrxr_3.Z.byte_() && rrxr_3.rA.byte_()) {
            var84 = !rrxr_3.break_(rrxr_3.rA, this, var6, var67, var2, var1, var35)
               && !rrxr_3.break_(var78, rrxr_3.Z, this.else_, var72)
               && this.else_.instanceof_().class_(var72);
         } else {
            var84 = !var78.catch_() && this.else_.instanceof_().class_(var72);
         }

         if (var84) {
            Ok_1 var88 = var35.getBuffer(HU.return_());
            this.class_(var1, var88, var6.catch_(), var11, var13, var15, var72, var78);
         }

         if (var20) {
            var35.class_(HU.return_());
            rrdL.native_();
         }
      } else if (var67 != null && var67.byte_() == rjM_2.ENTITY) {
         rrxr_3.rA.class_(this, var6, var67, var2, var1, var35);
      }

      RenderSystem.pushMatrix();
      RenderSystem.multMatrix(var1.byte_().class_());
      boolean var73 = MT.E();
      MT.instanceof_();
      if (var20) {
         rrdL.volatile_();
      }

      ((yK_2)this.new_.class_[17]).class_(var1, var35, var11, var13, var15);
      RenderSystem.popMatrix();
      var35.class_(lp_3.finally_());
      var35.class_(lp_3.class_());
      var35.class_(lp_3.break_());
      var35.class_(HU.final_());
      var35.class_(HU.package_());
      var35.class_(HU.new_());
      var35.class_(HU.continue_());
      var35.class_(HU.int_());
      var35.class_(HU.super_());
      var35.class_(HU.this_());
      var35.class_(HU.volatile_());
      this.this_.byte_().break_();
      MT.break_(var73);
      if (var20) {
         var35.break_();
         rrdL.final_();
         rrdZ.x();
         rrdL.class_(var7, var1, var6, var2);
         rrdZ.d();
      }

      if (this.for_ != null) {
         var35.class_(HU.return_());
         var35.break_();
         this.default_.break_((Boolean)QY.break_[2]);
         this.default_.class_(this.new_.B());
         this.class_(HU.implements_(), var1, var11, var13, var15);
         this.class_(HU.synchronized_(), var1, var11, var13, var15);
         this.strictfp_.break_((Boolean)QY.break_[2]);
         this.strictfp_.class_(this.new_.B());
         Hn_1.double_.class_();
         ((Cy_1)this.new_.class_[12]).class_(var1, var35, var8, var6, var2, var19);
         Hn_1.double_.break_();
      } else {
         if (var20) {
            rrdZ.k();
         }

         this.class_(HU.implements_(), var1, var11, var13, var15);
         if (var20) {
            rrdZ.W();
         }

         var35.class_(HU.return_());
         var35.break_();
         this.class_(HU.synchronized_(), var1, var11, var13, var15);
         if (var20) {
            rrdZ.M();
         }

         ((Cy_1)this.new_.class_[12]).class_(var1, var35, var8, var6, var2, var19);
         if (var20) {
            rrdZ.O();
         }
      }

      MT.byte_(true);
      RenderSystem.pushMatrix();
      rjV_2 var79 = var1.byte_().class_();
      RenderSystem.multMatrix(var79);
      rrAU.class_(var1, var79, var2);
      if (((Qw_1)this.new_.class_[20]).throws_() != Vd_1.OFF) {
         if (this.for_ != null) {
            this.transient_.break_((Boolean)QY.break_[2]);
            Hn_1.r.class_();
            this.class_(var1, var2, var11, var13, var15);
            Hn_1.r.break_();
         } else {
            this.class_(var1, var2, var11, var13, var15);
         }
      }

      if (this.for_ != null) {
         Hn_1.switch_.class_();
         this.class_(var8, var2, var11, var13, var15);
         this.byte_(var6);
         Hn_1.switch_.break_();
         this.for_.class_(var2);
         this.new_.B().class_(false);
      } else {
         RenderSystem.depthMask(false);
         if (rrbb_3.rs()) {
            MT.class_(rrdZ.this_());
         }

         if (var20) {
            rrdZ.X();
         }

         this.class_(var8, var2, var11, var13, var15);
         if (var20) {
            rrdZ.J();
         }

         this.byte_(var6);
         RenderSystem.depthMask(true);
      }

      this.break_(var6);
      RenderSystem.shadeModel(7424);
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
      HE.class_();
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1, var2, var9);
   }

   private void class_(lD_2 var1, float var2, boolean var3) {
      var1.class_(7, ju_3.super_);
      int var4 = (this.V / 64 + 1) * 64 + 64;

      for (int var5 = -var4; var5 <= var4; var5 += 64) {
         for (int var6 = -var4; var6 <= var4; var6 += 64) {
            float var7 = (float)var5;
            float var8 = (float)(var5 + 64);
            if (var3) {
               var8 = (float)var5;
               var7 = (float)(var5 + 64);
            }

            var1.class_((double)var7, (double)var2, (double)var6).class_();
            var1.class_((double)var8, (double)var2, (double)var6).class_();
            var1.class_((double)var8, (double)var2, (double)(var6 + 64)).class_();
            var1.class_((double)var7, (double)var2, (double)(var6 + 64)).class_();
         }
      }
   }

   public void class_(gm_3 var1) {
      this.double_ = Double.MIN_VALUE;
      this.switch_ = Double.MIN_VALUE;
      this.r = Double.MIN_VALUE;
      this.P = Integer.MIN_VALUE;
      this.B = Integer.MIN_VALUE;
      this.S = Integer.MIN_VALUE;
      this.super_.class_(var1);
      this.else_ = var1;
      if (rrbb_3.rL()) {
         rrbg_3.class_();
      }

      rrxd_3.break_();
      this.K.class_(null, null);
      rrWr_1.class_(this.else_);
      rrdZ.class_(this.else_);
      if (var1 != null) {
         this.throws_();
      } else {
         this.synchronized_.clear();
         this.H.clear();
         this.boolean_();
         if (this.goto_ != null) {
            this.goto_.class_();
            this.goto_ = null;
         }

         if (this.d != null) {
            this.d.case_();
         }

         this.d = null;
         this.public_.clear();
      }
   }

   private void class_(lD_2 var1) {
      Random var2 = new Random(10842L);
      var1.class_(7, ju_3.super_);

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
               var1.class_(var14 + var51, var16 + var47, var18 + var53).class_();
            }
         }
      }
   }

   public void class_(int var1, int var2) {
      this.volatile_();
      if (this.short_ != null) {
         this.short_.class_(var1, var2);
      }

      if (this.for_ != null) {
         this.for_.class_(var1, var2);
      }
   }

   public void class_(Ml_1 var1, float var2, double var3, double var5, double var7) {
      if (!rrbb_3.abstract_()) {
         if (rrxr_3.Po.byte_()) {
            rrGv_1 var9 = (rrGv_1)rrxr_3.private_(this.else_.break_(), rrxr_3.Po);
            if (var9 != null) {
               var9.class_(this.long_, var2, var1, this.else_, this.new_, var3, var5, var7);
               return;
            }
         }

         float var31 = this.else_.break_().class_();
         if (!Float.isNaN(var31)) {
            if (rrbb_3.rs()) {
               rrdZ.boolean_();
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
            double var14 = (double)(((float)this.long_ + var2) * 0.03F);
            double var16 = (var3 + var14) / 12.0;
            double var18 = (double)(var31 - (float)var5 + 0.33F);
            var18 += ((Qw_1)this.new_.class_[20]).ru * 128.0;
            double var20 = var7 / 12.0 + 0.33F;
            var16 -= (double)(rfU_2.byte_(var16 / 2048.0) * 2048);
            var20 -= (double)(rfU_2.byte_(var20 / 2048.0) * 2048);
            float var22 = (float)(var16 - (double)rfU_2.byte_(var16));
            float var23 = (float)(var18 / 4.0 - (double)rfU_2.byte_(var18 / 4.0)) * 4.0F;
            float var24 = (float)(var20 - (double)rfU_2.byte_(var20));
            rjU_2 var25 = this.else_.break_(var2);
            int var26 = (int)Math.floor(var16);
            int var27 = (int)Math.floor(var18 / 4.0);
            int var28 = (int)Math.floor(var20);
            if (var26 != this.O || var27 != this.h || var28 != this.X || ((Qw_1)this.new_.class_[20]).throws_() != this.x || this.J.implements_(var25) > 2.0E-4
               )
             {
               this.O = var26;
               this.h = var27;
               this.X = var28;
               this.J = var25;
               this.x = ((Qw_1)this.new_.class_[20]).throws_();
               this.interface_ = true;
            }

            if (this.interface_) {
               this.interface_ = false;
               lD_2 var29 = yb_3.class_().byte_();
               if (this.char_ != null) {
                  this.char_.close();
               }

               this.char_ = new jm_3(ju_3.try_);
               this.class_(var29, var16, var18, var20, var25);
               var29.finally_();
               this.char_.class_(var29);
            }

            this.continue_.class_(native_);
            var1.class_();
            var1.class_(12.0F, 1.0F, 12.0F);
            var1.class_((double)(-var22), (double)var23, (double)(-var24));
            if (this.char_ != null) {
               this.char_.class_();
               ju_3.try_.class_(0L);
               int var35 = this.x == Vd_1.FANCY ? 0 : 1;

               for (int var30 = var35; var30 < 2; var30++) {
                  if (var30 == 0) {
                     RenderSystem.colorMask(false, false, false, false);
                  } else {
                     RenderSystem.colorMask(true, true, true, true);
                  }

                  this.char_.class_(var1.byte_().class_(), 7);
               }

               jm_3.break_();
               ju_3.try_.protected_();
            }

            var1.break_();
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.disableAlphaTest();
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
            RenderSystem.disableFog();
            if (rrbb_3.rs()) {
               rrdZ.transient_();
            }
         }
      }
   }

   public void class_(Ml_1 var1, float var2) {
      if (rrxr_3.PK.byte_()) {
         rrGF var3 = (rrGF)rrxr_3.private_(this.else_.break_(), rrxr_3.PK);
         if (var3 != null) {
            var3.class_(this.long_, var2, var1, this.else_, this.new_);
            return;
         }
      }

      if (((gm_3)this.new_.class_[56]).break_().byte_() == gA_2.END) {
         this.break_(var1);
      } else if (((gm_3)this.new_.class_[56]).break_().byte_() == gA_2.NORMAL) {
         RenderSystem.disableTexture();
         boolean var20 = rrbb_3.rs();
         if (var20) {
            rrdZ.c();
         }

         rjU_2 var4 = this.else_.class_(((Hh_1)this.new_.class_[16]).finally_().byte_(), var2);
         var4 = rrbN_2.class_(var4, (gm_3)this.new_.class_[56], this.new_.catch_().rx(), this.new_.catch_().re() + 1.0, this.new_.catch_().BO());
         if (var20) {
            rrdZ.class_(var4);
         }

         float var5 = (float)var4.break_;
         float var6 = (float)var4.byte_;
         float var7 = (float)var4.protected_;
         HE.break_();
         lD_2 var8 = yb_3.class_().byte_();
         RenderSystem.depthMask(false);
         RenderSystem.enableFog();
         if (var20) {
            rrdZ.F();
         }

         RenderSystem.color3f(var5, var6, var7);
         if (var20) {
            rrdZ.throws_(var1);
         }

         if (rrbb_3.Z()) {
            this.instanceof_.class_();
            this.while_.class_(0L);
            this.instanceof_.class_(var1.byte_().class_(), 7);
            jm_3.break_();
            this.while_.protected_();
         }

         RenderSystem.disableFog();
         if (var20) {
            rrdZ.L();
         }

         RenderSystem.disableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         float[] var9 = this.else_.break_().class_(this.else_.protected_(var2), var2);
         if (var9 != null && rrbb_3.v()) {
            RenderSystem.disableTexture();
            if (var20) {
               rrdZ.c();
            }

            if (var20) {
               rrdZ.class_(rrdX.SUNSET);
            }

            RenderSystem.shadeModel(7425);
            var1.class_();
            var1.class_(rje_3.break_.byte_(90.0F));
            float var10 = rfU_2.class_(this.else_.throws_(var2)) < 0.0F ? 180.0F : 0.0F;
            var1.class_(rje_3.case_.byte_(var10));
            var1.class_(rje_3.case_.byte_(90.0F));
            float var11 = var9[0];
            float var12 = var9[1];
            float var13 = var9[2];
            rjV_2 var14 = var1.byte_().class_();
            var8.class_(6, ju_3.this_);
            var8.class_(var14, 0.0F, 100.0F, 0.0F).class_(var11, var12, var13, var9[3]).class_();
            byte var15 = 16;

            for (int var16 = 0; var16 <= 16; var16++) {
               float var17 = (float)var16 * (float) (Math.PI * 2) / 16.0F;
               float var18 = rfU_2.class_(var17);
               float var19 = rfU_2.break_(var17);
               var8.class_(var14, var18 * 120.0F, var19 * 120.0F, -var19 * 40.0F * var9[3]).class_(var9[0], var9[1], var9[2], 0.0F).class_();
            }

            var8.finally_();
            yk_3.class_(var8);
            var1.break_();
            RenderSystem.shadeModel(7424);
         }

         RenderSystem.enableTexture();
         if (var20) {
            rrdZ.N();
         }

         RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE, OP.ONE, MK.ZERO);
         var1.class_();
         float var22 = 1.0F - this.else_.private_(var2);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, var22);
         var1.class_(rje_3.protected_.byte_(-90.0F));
         rrbf_3.class_(this.else_, this.continue_, var1, var2);
         if (var20) {
            rrdZ.class_(var1);
         }

         var1.class_(rje_3.break_.byte_(this.else_.protected_(var2) * 360.0F));
         if (var20) {
            rrdZ.break_(var1);
         }

         rjV_2 var23 = var1.byte_().class_();
         float var24 = 30.0F;
         if (rrbb_3.F()) {
            if (var20) {
               rrdZ.class_(rrdX.SUN);
            }

            this.continue_.class_(extends_);
            var8.class_(7, ju_3.synchronized_);
            var8.class_(var23, -var24, 100.0F, -var24).class_(0.0F, 0.0F).class_();
            var8.class_(var23, var24, 100.0F, -var24).class_(1.0F, 0.0F).class_();
            var8.class_(var23, var24, 100.0F, var24).class_(1.0F, 1.0F).class_();
            var8.class_(var23, -var24, 100.0F, var24).class_(0.0F, 1.0F).class_();
            var8.finally_();
            yk_3.class_(var8);
         }

         var24 = 20.0F;
         if (rrbb_3.L()) {
            if (var20) {
               rrdZ.class_(rrdX.MOON);
            }

            this.continue_.class_(finally_);
            int var26 = this.else_.char_();
            int var28 = var26 % 4;
            int var30 = var26 / 4 % 2;
            float var31 = (float)var28 / 4.0F;
            float var34 = (float)var30 / 2.0F;
            float var35 = (float)(var28 + 1) / 4.0F;
            float var36 = (float)(var30 + 1) / 2.0F;
            var8.class_(7, ju_3.synchronized_);
            var8.class_(var23, -var24, -100.0F, var24).class_(var35, var36).class_();
            var8.class_(var23, var24, -100.0F, var24).class_(var31, var36).class_();
            var8.class_(var23, var24, -100.0F, -var24).class_(var31, var34).class_();
            var8.class_(var23, -var24, -100.0F, -var24).class_(var35, var34).class_();
            var8.finally_();
            yk_3.class_(var8);
         }

         RenderSystem.disableTexture();
         if (var20) {
            rrdZ.c();
         }

         float var27 = this.else_.byte_(var2) * var22;
         if (var27 > 0.0F && rrbb_3.n() && !rrbf_3.class_(this.else_)) {
            if (var20) {
               rrdZ.class_(rrdX.STARS);
            }

            RenderSystem.color4f(var27, var27, var27, var27);
            this.try_.class_();
            this.while_.class_(0L);
            this.try_.class_(var1.byte_().class_(), 7);
            jm_3.break_();
            this.while_.protected_();
         }

         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.disableBlend();
         RenderSystem.enableAlphaTest();
         RenderSystem.enableFog();
         if (var20) {
            rrdZ.F();
         }

         var1.break_();
         RenderSystem.disableTexture();
         if (var20) {
            rrdZ.c();
         }

         RenderSystem.color3f(0.0F, 0.0F, 0.0F);
         double var29 = ((cb_3)this.new_.class_[57]).new_(var2).byte_ - this.else_.synchronized_().volatile_();
         boolean var32 = false;
         if (var29 < 0.0) {
            if (var20) {
               rrdZ.class_(rrdX.VOID);
            }

            var1.class_();
            var1.class_(0.0, 12.0, 0.0);
            this.throw_.class_();
            this.while_.class_(0L);
            this.throw_.class_(var1.byte_().class_(), 7);
            jm_3.break_();
            this.while_.protected_();
            var1.break_();
            var32 = true;
         }

         if (this.else_.break_().break_()) {
            RenderSystem.color3f(var5 * 0.2F + 0.04F, var6 * 0.2F + 0.04F, var7 * 0.6F + 0.1F);
         } else {
            RenderSystem.color3f(var5, var6, var7);
         }

         RenderSystem.enableTexture();
         RenderSystem.depthMask(true);
         RenderSystem.disableFog();
      }
   }

   private void class_(HQ var1, float var2, double var3, double var5, double var7) {
      if (rrxr_3.PU.byte_()) {
         rrGA var9 = (rrGA)rrxr_3.private_(this.else_.break_(), rrxr_3.PU);
         if (var9 != null) {
            var9.class_(this.long_, var2, this.else_, this.new_, var1, var3, var5, var7);
            return;
         }
      }

      float var48 = ((gm_3)this.new_.class_[56]).private_(var2);
      if (!(var48 <= 0.0F)) {
         if (rrbb_3.interface_()) {
            return;
         }

         var1.byte_();
         gm_3 var10 = (gm_3)this.new_.class_[56];
         int var11 = rfU_2.byte_(var3);
         int var12 = rfU_2.byte_(var5);
         int var13 = rfU_2.byte_(var7);
         yb_3 var14 = yb_3.class_();
         lD_2 var15 = var14.byte_();
         RenderSystem.enableAlphaTest();
         RenderSystem.disableCull();
         RenderSystem.normal3f(0.0F, 1.0F, 0.0F);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.defaultAlphaFunc();
         RenderSystem.enableDepthTest();
         byte var16 = 5;
         if (rrbb_3.throw_()) {
            var16 = 10;
         }

         RenderSystem.depthMask(QY.d());
         byte var17 = -1;
         float var18 = (float)this.long_ + var2;
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         rfw_3 var19 = new rfw_3();

         for (int var20 = var13 - var16; var20 <= var13 + var16; var20++) {
            for (int var21 = var11 - var16; var21 <= var11 + var16; var21++) {
               int var22 = (var20 - var13 + 16) * 32 + var21 - var11 + 16;
               double var23 = (double)this.C[var22] * 0.5;
               double var25 = (double)this.l[var22] * 0.5;
               var19.class_(var21, 0, var20);
               rYG var27 = var10.implements_(var19);
               if (var27.byte_() != rYJ.NONE) {
                  int var28 = var10.class_(rKv_1.MOTION_BLOCKING, var19).c_();
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
                     var19.class_(var21, var29, var20);
                     float var33 = var27.class_(var19);
                     if (var33 >= 0.15F) {
                        if (var17 != 0) {
                           if (var17 >= 0) {
                              var14.break_();
                           }

                           var17 = 0;
                           this.new_.A().class_(package_);
                           var15.class_(7, ju_3.continue_);
                        }

                        int var34 = this.long_ + var21 * var21 * 3121 + var21 * 45238971 + var20 * var20 * 418711 + var20 * 13761 & 31;
                        float var35 = -((float)var34 + var2) / 32.0F * (3.0F + var32.nextFloat());
                        double var36 = (double)((float)var21 + 0.5F) - var3;
                        double var38 = (double)((float)var20 + 0.5F) - var7;
                        float var40 = rfU_2.class_(var36 * var36 + var38 * var38) / (float)var16;
                        float var41 = ((1.0F - var40 * var40) * 0.5F + 0.5F) * var48;
                        var19.class_(var21, var31, var20);
                        int var42 = class_(var10, var19);
                        var15.class_((double)var21 - var3 - var23 + 0.5, (double)var30 - var5, (double)var20 - var7 - var25 + 0.5)
                           .class_(0.0F, (float)var29 * 0.25F + var35)
                           .class_(1.0F, 1.0F, 1.0F, var41)
                           .break_(var42)
                           .class_();
                        var15.class_((double)var21 - var3 + var23 + 0.5, (double)var30 - var5, (double)var20 - var7 + var25 + 0.5)
                           .class_(1.0F, (float)var29 * 0.25F + var35)
                           .class_(1.0F, 1.0F, 1.0F, var41)
                           .break_(var42)
                           .class_();
                        var15.class_((double)var21 - var3 + var23 + 0.5, (double)var29 - var5, (double)var20 - var7 + var25 + 0.5)
                           .class_(1.0F, (float)var30 * 0.25F + var35)
                           .class_(1.0F, 1.0F, 1.0F, var41)
                           .break_(var42)
                           .class_();
                        var15.class_((double)var21 - var3 - var23 + 0.5, (double)var29 - var5, (double)var20 - var7 - var25 + 0.5)
                           .class_(0.0F, (float)var30 * 0.25F + var35)
                           .class_(1.0F, 1.0F, 1.0F, var41)
                           .break_(var42)
                           .class_();
                     } else {
                        if (var17 != 1) {
                           if (var17 >= 0) {
                              var14.break_();
                           }

                           var17 = 1;
                           this.new_.A().class_(int_);
                           var15.class_(7, ju_3.continue_);
                        }

                        float var49 = -((float)(this.long_ & 511) + var2) / 512.0F;
                        float var50 = (float)(var32.nextDouble() + (double)var18 * 0.01 * (double)((float)var32.nextGaussian()));
                        float var51 = (float)(var32.nextDouble() + (double)(var18 * (float)var32.nextGaussian()) * 0.001);
                        double var37 = (double)((float)var21 + 0.5F) - var3;
                        double var39 = (double)((float)var20 + 0.5F) - var7;
                        float var52 = rfU_2.class_(var37 * var37 + var39 * var39) / (float)var16;
                        float var53 = ((1.0F - var52 * var52) * 0.3F + 0.5F) * var48;
                        var19.class_(var21, var31, var20);
                        int var43 = class_(var10, var19);
                        int var44 = var43 >> 16 & 65535;
                        int var45 = (var43 & 65535) * 3;
                        int var46 = (var44 * 3 + 240) / 4;
                        int var47 = (var45 * 3 + 240) / 4;
                        var15.class_((double)var21 - var3 - var23 + 0.5, (double)var30 - var5, (double)var20 - var7 - var25 + 0.5)
                           .class_(0.0F + var50, (float)var29 * 0.25F + var49 + var51)
                           .class_(1.0F, 1.0F, 1.0F, var53)
                           .byte_(var47, var46)
                           .class_();
                        var15.class_((double)var21 - var3 + var23 + 0.5, (double)var30 - var5, (double)var20 - var7 + var25 + 0.5)
                           .class_(1.0F + var50, (float)var29 * 0.25F + var49 + var51)
                           .class_(1.0F, 1.0F, 1.0F, var53)
                           .byte_(var47, var46)
                           .class_();
                        var15.class_((double)var21 - var3 + var23 + 0.5, (double)var29 - var5, (double)var20 - var7 + var25 + 0.5)
                           .class_(1.0F + var50, (float)var30 * 0.25F + var49 + var51)
                           .class_(1.0F, 1.0F, 1.0F, var53)
                           .byte_(var47, var46)
                           .class_();
                        var15.class_((double)var21 - var3 - var23 + 0.5, (double)var29 - var5, (double)var20 - var7 - var25 + 0.5)
                           .class_(0.0F + var50, (float)var30 * 0.25F + var49 + var51)
                           .class_(1.0F, 1.0F, 1.0F, var53)
                           .byte_(var47, var46)
                           .class_();
                     }
                  }
               }
            }
         }

         if (var17 >= 0) {
            var14.break_();
         }

         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         RenderSystem.defaultAlphaFunc();
         RenderSystem.disableAlphaTest();
         var1.break_();
      }
   }

   private void class_(la_3 var1) {
      long var2 = var1.class_().package_();
      Set var4 = (Set)this.void_.get(var2);
      var4.remove(var1);
      if (var4.isEmpty()) {
         this.void_.remove(var2);
      }
   }

   private void class_(lD_2 var1, double var2, double var4, double var6, rjU_2 var8) {
      float var9 = 4.0F;
      float var10 = 0.00390625F;
      byte var11 = 8;
      byte var12 = 4;
      float var13 = 9.765625E-4F;
      float var14 = (float)rfU_2.byte_(var2) * 0.00390625F;
      float var15 = (float)rfU_2.byte_(var6) * 0.00390625F;
      float var16 = (float)var8.break_;
      float var17 = (float)var8.byte_;
      float var18 = (float)var8.protected_;
      float var19 = var16 * 0.9F;
      float var20 = var17 * 0.9F;
      float var21 = var18 * 0.9F;
      float var22 = var16 * 0.7F;
      float var23 = var17 * 0.7F;
      float var24 = var18 * 0.7F;
      float var25 = var16 * 0.8F;
      float var26 = var17 * 0.8F;
      float var27 = var18 * 0.8F;
      var1.class_(7, ju_3.try_);
      float var28 = (float)Math.floor(var4 / 4.0) * 4.0F;
      if (rrbb_3.char_()) {
         for (int var29 = -3; var29 <= 4; var29++) {
            for (int var30 = -3; var30 <= 4; var30++) {
               float var31 = (float)(var29 * 8);
               float var32 = (float)(var30 * 8);
               if (var28 > -5.0F) {
                  var1.class_((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                     .class_((var31 + 0.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .class_(var22, var23, var24, 0.8F)
                     .class_(0.0F, -1.0F, 0.0F)
                     .class_();
                  var1.class_((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                     .class_((var31 + 8.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .class_(var22, var23, var24, 0.8F)
                     .class_(0.0F, -1.0F, 0.0F)
                     .class_();
                  var1.class_((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                     .class_((var31 + 8.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .class_(var22, var23, var24, 0.8F)
                     .class_(0.0F, -1.0F, 0.0F)
                     .class_();
                  var1.class_((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                     .class_((var31 + 0.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .class_(var22, var23, var24, 0.8F)
                     .class_(0.0F, -1.0F, 0.0F)
                     .class_();
               }

               if (var28 <= 5.0F) {
                  var1.class_((double)(var31 + 0.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 8.0F))
                     .class_((var31 + 0.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .class_(var16, var17, var18, 0.8F)
                     .class_(0.0F, 1.0F, 0.0F)
                     .class_();
                  var1.class_((double)(var31 + 8.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 8.0F))
                     .class_((var31 + 8.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .class_(var16, var17, var18, 0.8F)
                     .class_(0.0F, 1.0F, 0.0F)
                     .class_();
                  var1.class_((double)(var31 + 8.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 0.0F))
                     .class_((var31 + 8.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .class_(var16, var17, var18, 0.8F)
                     .class_(0.0F, 1.0F, 0.0F)
                     .class_();
                  var1.class_((double)(var31 + 0.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 0.0F))
                     .class_((var31 + 0.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .class_(var16, var17, var18, 0.8F)
                     .class_(0.0F, 1.0F, 0.0F)
                     .class_();
               }

               if (var29 > -1) {
                  for (int var33 = 0; var33 < 8; var33++) {
                     var1.class_((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                        .class_((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .class_(var19, var20, var21, 0.8F)
                        .class_(-1.0F, 0.0F, 0.0F)
                        .class_();
                     var1.class_((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + 8.0F))
                        .class_((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .class_(var19, var20, var21, 0.8F)
                        .class_(-1.0F, 0.0F, 0.0F)
                        .class_();
                     var1.class_((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + 0.0F))
                        .class_((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .class_(var19, var20, var21, 0.8F)
                        .class_(-1.0F, 0.0F, 0.0F)
                        .class_();
                     var1.class_((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                        .class_((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .class_(var19, var20, var21, 0.8F)
                        .class_(-1.0F, 0.0F, 0.0F)
                        .class_();
                  }
               }

               if (var29 <= 1) {
                  for (int var38 = 0; var38 < 8; var38++) {
                     var1.class_((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                        .class_((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .class_(var19, var20, var21, 0.8F)
                        .class_(1.0F, 0.0F, 0.0F)
                        .class_();
                     var1.class_((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 4.0F), (double)(var32 + 8.0F))
                        .class_((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .class_(var19, var20, var21, 0.8F)
                        .class_(1.0F, 0.0F, 0.0F)
                        .class_();
                     var1.class_((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 4.0F), (double)(var32 + 0.0F))
                        .class_((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .class_(var19, var20, var21, 0.8F)
                        .class_(1.0F, 0.0F, 0.0F)
                        .class_();
                     var1.class_((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                        .class_((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .class_(var19, var20, var21, 0.8F)
                        .class_(1.0F, 0.0F, 0.0F)
                        .class_();
                  }
               }

               if (var30 > -1) {
                  for (int var39 = 0; var39 < 8; var39++) {
                     var1.class_((double)(var31 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var39 + 0.0F))
                        .class_((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .class_(var25, var26, var27, 0.8F)
                        .class_(0.0F, 0.0F, -1.0F)
                        .class_();
                     var1.class_((double)(var31 + 8.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var39 + 0.0F))
                        .class_((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .class_(var25, var26, var27, 0.8F)
                        .class_(0.0F, 0.0F, -1.0F)
                        .class_();
                     var1.class_((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var39 + 0.0F))
                        .class_((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .class_(var25, var26, var27, 0.8F)
                        .class_(0.0F, 0.0F, -1.0F)
                        .class_();
                     var1.class_((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var39 + 0.0F))
                        .class_((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .class_(var25, var26, var27, 0.8F)
                        .class_(0.0F, 0.0F, -1.0F)
                        .class_();
                  }
               }

               if (var30 <= 1) {
                  for (int var40 = 0; var40 < 8; var40++) {
                     var1.class_((double)(var31 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .class_((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .class_(var25, var26, var27, 0.8F)
                        .class_(0.0F, 0.0F, 1.0F)
                        .class_();
                     var1.class_((double)(var31 + 8.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .class_((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .class_(var25, var26, var27, 0.8F)
                        .class_(0.0F, 0.0F, 1.0F)
                        .class_();
                     var1.class_((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .class_((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .class_(var25, var26, var27, 0.8F)
                        .class_(0.0F, 0.0F, 1.0F)
                        .class_();
                     var1.class_((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .class_((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .class_(var25, var26, var27, 0.8F)
                        .class_(0.0F, 0.0F, 1.0F)
                        .class_();
                  }
               }
            }
         }
      } else {
         boolean var34 = true;
         byte var35 = 32;

         for (byte var36 = -32; var36 < 32; var36 += 32) {
            for (byte var37 = -32; var37 < 32; var37 += 32) {
               var1.class_((double)var36, (double)var28, (double)(var37 + 32))
                  .class_((float)var36 * 0.00390625F + var14, (float)(var37 + 32) * 0.00390625F + var15)
                  .class_(var16, var17, var18, 0.8F)
                  .class_(0.0F, -1.0F, 0.0F)
                  .class_();
               var1.class_((double)(var36 + 32), (double)var28, (double)(var37 + 32))
                  .class_((float)(var36 + 32) * 0.00390625F + var14, (float)(var37 + 32) * 0.00390625F + var15)
                  .class_(var16, var17, var18, 0.8F)
                  .class_(0.0F, -1.0F, 0.0F)
                  .class_();
               var1.class_((double)(var36 + 32), (double)var28, (double)var37)
                  .class_((float)(var36 + 32) * 0.00390625F + var14, (float)var37 * 0.00390625F + var15)
                  .class_(var16, var17, var18, 0.8F)
                  .class_(0.0F, -1.0F, 0.0F)
                  .class_();
               var1.class_((double)var36, (double)var28, (double)var37)
                  .class_((float)var36 * 0.00390625F + var14, (float)var37 * 0.00390625F + var15)
                  .class_(var16, var17, var18, 0.8F)
                  .class_(0.0F, -1.0F, 0.0F)
                  .class_();
            }
         }
      }
   }

   public void class_(long var1) {
      var1 = (long)((double)var1 + 1.0E8);
      this.L = this.L | this.d.byte_();
      long var3 = rqR_2.byte_();
      boolean var5 = false;
      if (this.protected_.size() > 0) {
         Iterator var6 = this.protected_.iterator();

         while (var6.hasNext()) {
            yQ_2 var7 = (yQ_2)var6.next();
            if (!this.d.byte_(var7)) {
               break;
            }

            var7.case_();
            var6.remove();
            this.synchronized_.remove(var7);
            this.byte_.remove(var7);
         }
      }

      if (this.byte_.size() > 0) {
         Iterator var16 = this.byte_.iterator();
         if (var16.hasNext()) {
            yQ_2 var18 = (yQ_2)var16.next();
            if (this.d.protected_(var18)) {
               var16.remove();
            }
         }
      }

      double var17 = 0.0;
      int var8 = rrbb_3.goto_();
      if (!this.synchronized_.isEmpty()) {
         Iterator var9 = this.synchronized_.iterator();

         while (var9.hasNext()) {
            yQ_2 var10 = (yQ_2)var9.next();
            boolean var11 = var10.final_();
            boolean var12;
            if (!var10.private_() && !var11) {
               var12 = this.d.byte_(var10);
            } else {
               var12 = this.d.break_(var10);
            }

            if (!var12) {
               break;
            }

            var10.case_();
            var9.remove();
            if (!var11) {
               double var13 = 2.0 * rrzb_3.break_(var10);
               var17 += var13;
               if (var17 > (double)var8) {
                  break;
               }
            }
         }
      }
   }

   private void class_(rjV_2 var1, rjV_2 var2, double var3, double var5, double var7, yt_3 var9) {
      this.c = var9;
      rjV_2 var10 = var2.case_();
      var10.class_(var1);
      var10.throws_();
      this.m.class_ = var3;
      this.m.break_ = var5;
      this.m.byte_ = var7;
      this.u[0] = new rji_3(-1.0F, -1.0F, -1.0F, 1.0F);
      this.u[1] = new rji_3(1.0F, -1.0F, -1.0F, 1.0F);
      this.u[2] = new rji_3(1.0F, 1.0F, -1.0F, 1.0F);
      this.u[3] = new rji_3(-1.0F, 1.0F, -1.0F, 1.0F);
      this.u[4] = new rji_3(-1.0F, -1.0F, 1.0F, 1.0F);
      this.u[5] = new rji_3(1.0F, -1.0F, 1.0F, 1.0F);
      this.u[6] = new rji_3(1.0F, 1.0F, 1.0F, 1.0F);
      this.u[7] = new rji_3(-1.0F, 1.0F, 1.0F, 1.0F);

      for (int var11 = 0; var11 < 8; var11++) {
         this.u[var11].class_(var10);
         this.u[var11].case_();
      }
   }

   public void class_(HU var1, Ml_1 var2, double var3, double var5, double var7) {
      var1.class_();
      boolean var9 = rrbb_3.rs();
      if (var1 == HU.implements_() && !rrdZ.new_) {
         double var10 = var3 - this.Z;
         double var12 = var5 - this.v;
         double var14 = var7 - this.F;
         if (var10 * var10 + var12 * var12 + var14 * var14 > 1.0) {
            this.Z = var3;
            this.v = var5;
            this.F = var7;
            int var16 = 0;
            this.byte_.clear();
            ObjectListIterator var17 = this.return_.iterator();

            while (var17.hasNext()) {
               yx_3 var18 = (yx_3)var17.next();
               if (var16 < 15 && var18.class_.byte_().byte_(var1)) {
                  this.byte_.add(var18.class_);
                  var16++;
               }
            }
         }
      }

      if (var9) {
         rrdL.class_(var1);
      }

      boolean var29 = rrMh_1.class_();
      RenderSystem.pushMatrix();
      RenderSystem.loadIdentity();
      RenderSystem.multMatrix(var2.byte_().class_());
      boolean var11 = var1 != HU.implements_();
      ObjectListIterator var30 = this.return_.listIterator(var11 ? 0 : this.return_.size());
      if (rrbb_3.ry()) {
         int var31 = Integer.MIN_VALUE;
         int var33 = Integer.MIN_VALUE;
         rrxH_2 var34 = null;
         Map var36 = this.i.computeIfAbsent(var1, var0 -> new LinkedHashMap(16));
         Map var38 = null;
         List var39 = null;

         while (var11 ? var30.hasNext() : var30.hasPrevious()) {
            yx_3 var19 = var11 ? (yx_3)var30.next() : (yx_3)var30.previous();
            yQ_2 var20 = var19.class_;
            if (!var20.byte_().class_(var1)) {
               jm_3 var21 = var20.class_(var1);
               rrxH_2 var22 = var21.byte_();
               if (var20.byte_ != var31 || var20.protected_ != var33) {
                  rrzS_2 var23 = rrzS_2.class_(var20.byte_, var20.protected_);
                  var38 = var36.computeIfAbsent(var23, var0 -> new LinkedHashMap(8));
                  var31 = var20.byte_;
                  var33 = var20.protected_;
                  var34 = null;
               }

               if (var22 != var34) {
                  var39 = var38.computeIfAbsent(var22, var0 -> new ArrayList());
                  var34 = var22;
               }

               var39.add(var21);
               if (rrMh_1.class_()) {
                  BitSet var44 = var20.byte_().break_(var1);
                  if (var44 != null) {
                     rrMh_1.class_(var44);
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
                  var28.class_(7);
               }

               this.class_(var42.class_(), 0, var42.break_(), var3, var5, var7, var25);
               var26.clear();
            }
         }
      } else {
         while (var11 ? var30.hasNext() : var30.hasPrevious()) {
            yx_3 var13 = var11 ? (yx_3)var30.next() : (yx_3)var30.previous();
            yQ_2 var32 = var13.class_;
            if (!var32.byte_().class_(var1)) {
               jm_3 var15 = var32.class_(var1);
               MT.transient_();
               rfH_2 var35 = var32.throws_();
               MT.break_((double)var35.b_() - var3, (double)var35.c_() - var5, (double)var35.d_() - var7);
               var15.class_();
               ju_3.private_.class_(0L);
               MT.h();
               if (var9) {
                  rrdL.package_();
               }

               var15.class_(7);
               MT.for_();
               if (var29) {
                  BitSet var37 = var32.byte_().break_(var1);
                  if (var37 != null) {
                     rrMh_1.class_(var37);
                  }
               }
            }
         }
      }

      MT.X();
      RenderSystem.popMatrix();
      if (rrbb_3.w()) {
         this.new_.A().class_(fJ_2.class_);
      }

      jm_3.break_();
      RenderSystem.clearCurrentColor();
      ju_3.private_.protected_();
      if (var9) {
         rrdL.break_(var1);
      }

      var1.break_();
   }

   private void class_(int var1, int var2, int var3, double var4, double var6, double var8, rrxH_2 var10) {
      MT.transient_();
      MT.break_((double)var1 - var4, (double)var2 - var6, (double)var3 - var8);
      var10.break_();
      MT.h();
      MT.for_();
   }

   public void class_(an_3 var1, double var2, double var4, double var6, float var8, Ml_1 var9, Hx_1 var10) {
      double var11 = rfU_2.protected_((double)var8, (Double)var1.throws_[34], var1.rx());
      double var13 = rfU_2.protected_((double)var8, (Double)var1.throws_[35], var1.re());
      double var15 = rfU_2.protected_((double)var8, (Double)var1.throws_[36], var1.BO());
      float var17 = rfU_2.catch_(var8, (Float)var1.throws_[17], (Float)var1.throws_[15]);
      this.super_.class_(var1, var11 - var2, var13 - var4, var15 - var6, var17, var8, var9, var10, this.super_.class_(var1, var8));
   }

   private void class_(rYB var1, rfH_2 var2, boolean var3) {
      for (iB_2 var5 : var1.class_(iB_2.class, new rfl_3(var2).class_(3.0))) {
         var5.class_(var2, var3);
      }
   }

   private void class_(Ok_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      float var9 = 0.25F;
      var1.class_((double)this.u[var2].class_(), (double)this.u[var2].break_(), (double)this.u[var2].byte_())
         .class_((float)var6, (float)var7, (float)var8, 0.25F)
         .class_();
      var1.class_((double)this.u[var3].class_(), (double)this.u[var3].break_(), (double)this.u[var3].byte_())
         .class_((float)var6, (float)var7, (float)var8, 0.25F)
         .class_();
      var1.class_((double)this.u[var4].class_(), (double)this.u[var4].break_(), (double)this.u[var4].byte_())
         .class_((float)var6, (float)var7, (float)var8, 0.25F)
         .class_();
      var1.class_((double)this.u[var5].class_(), (double)this.u[var5].break_(), (double)this.u[var5].byte_())
         .class_((float)var6, (float)var7, (float)var8, 0.25F)
         .class_();
   }

   private void class_(Ok_1 var1, int var2) {
      var1.class_((double)this.u[var2].class_(), (double)this.u[var2].break_(), (double)this.u[var2].byte_()).class_();
   }

   private void default_() {
      yb_3 var1 = yb_3.class_();
      lD_2 var2 = var1.byte_();
      if (this.throw_ != null) {
         this.throw_.close();
      }

      this.throw_ = new jm_3(this.while_);
      this.class_(var2, -16.0F, true);
      var2.finally_();
      this.throw_.class_(var2);
   }

   private void short_() {
      if (this.for_ != null) {
         this.for_.close();
         this.default_.class_();
         this.const_.class_();
         this.strictfp_.class_();
         this.boolean_.class_();
         this.transient_.class_();
         this.for_ = null;
         this.default_ = null;
         this.const_ = null;
         this.strictfp_ = null;
         this.boolean_ = null;
         this.transient_ = null;
      }
   }

   @Override
   public void close() {
      if (this.short_ != null) {
         this.short_.close();
      }

      if (this.for_ != null) {
         this.for_.close();
      }
   }

   public VC void_() {
      return this.transient_;
   }

   public void break_() {
      if (this.short_ != null) {
         this.short_.close();
      }

      rqO_2 var1 = new rqO_2("shaders/post/entity_outline.json");

      try {
         this.short_ = new Vq_1(this.new_.A(), this.new_.F(), this.new_.B(), var1);
         this.short_.class_(this.new_.else_().extends_(), this.new_.else_().native_());
         this.import_ = this.short_.class_("id_final");
      } catch (IOException var3) {
         implements_.warn("Failed to load shader: {}", var1, var3);
         this.short_ = null;
         this.import_ = null;
      } catch (JsonSyntaxException var4) {
         implements_.warn("Failed to parse shader: {}", var1, var4);
         this.short_ = null;
         this.import_ = null;
      }
   }

   private void break_(ly_3 var1, yt_3 var2, boolean var3) {
      int var4 = ((Qw_1)this.new_.class_[20]).rT;
      boolean var5 = ((Qw_1)this.new_.class_[20]).rd;

      try {
         ((Qw_1)this.new_.class_[20]).rT = 1000;
         ((Qw_1)this.new_.class_[20]).rd = false;
         yX_2 var6 = rrbb_3.z();
         int var7 = var6.continue_();
         long var8 = System.currentTimeMillis();
         rrbb_3.byte_("Loading visible chunks");
         long var10 = System.currentTimeMillis() + 5000L;
         int var12 = 0;
         boolean var13 = false;

         do {
            var13 = false;

            for (int var14 = 0; var14 < 100; var14++) {
               var6.volatile_();
               var6.class_(var1, var2, false, this.A++, var3);
               if (!var6.native_()) {
                  var13 = true;
               }

               var12 += var6.super_();

               while (!var6.native_()) {
                  var6.class_(System.nanoTime() + 1000000000L);
               }

               var12 -= var6.super_();
               if (!var13) {
                  break;
               }
            }

            if (var6.continue_() != var7) {
               var13 = true;
               var7 = var6.continue_();
            }

            if (System.currentTimeMillis() > var10) {
               rrbb_3.case_("Chunks loaded: " + var12);
               var10 = System.currentTimeMillis() + 5000L;
            }
         } while (var13);

         rrbb_3.case_("Chunks loaded: " + var12);
         rrbb_3.case_("Finished loading visible chunks");
         yz_3.break_ = 0;
      } finally {
         ((Qw_1)this.new_.class_[20]).rT = var4;
         ((Qw_1)this.new_.class_[20]).rd = var5;
      }
   }

   private void break_(ly_3 var1) {
      yb_3 var2 = yb_3.class_();
      lD_2 var3 = var2.byte_();
      if ((Boolean)this.new_.class_[80] || (Boolean)this.new_.class_[81]) {
         double var4 = var1.break_().class_();
         double var6 = var1.break_().break_();
         double var8 = var1.break_().byte_();
         RenderSystem.depthMask(true);
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableTexture();

         for (ObjectListIterator var10 = this.return_.iterator(); var10.hasNext(); RenderSystem.popMatrix()) {
            yx_3 var11 = (yx_3)var10.next();
            yQ_2 var12 = var11.class_;
            RenderSystem.pushMatrix();
            rfH_2 var13 = var12.throws_();
            RenderSystem.translated((double)var13.b_() - var4, (double)var13.c_() - var6, (double)var13.d_() - var8);
            if ((Boolean)this.new_.class_[80]) {
               var3.class_(1, ju_3.this_);
               RenderSystem.lineWidth(10.0F);
               int var14 = var11.protected_ == 0 ? 0 : rfU_2.case_((float)var11.protected_ / 50.0F, 0.9F, 0.9F);
               int var15 = var14 >> 16 & 0xFF;
               int var16 = var14 >> 8 & 0xFF;
               int var17 = var14 & 0xFF;
               rpr_3 var18 = var11.break_;
               if (var18 != null) {
                  var3.class_(8.0, 8.0, 8.0).break_(var15, var16, var17, 255).class_();
                  var3.class_((double)(8 - 16 * var18.implements_()), (double)(8 - 16 * var18.finally_()), (double)(8 - 16 * var18.extends_()))
                     .break_(var15, var16, var17, 255)
                     .class_();
               }

               var2.break_();
               RenderSystem.lineWidth(1.0F);
            }

            if ((Boolean)this.new_.class_[81] && !var12.byte_().class_()) {
               var3.class_(1, ju_3.this_);
               RenderSystem.lineWidth(10.0F);
               int var24 = 0;

               for (rpr_3 var30 : class_) {
                  for (rpr_3 var22 : class_) {
                     boolean var23 = var12.byte_().class_(var30, var22);
                     if (!var23) {
                        var24++;
                        var3.class_((double)(8 + 8 * var30.implements_()), (double)(8 + 8 * var30.finally_()), (double)(8 + 8 * var30.extends_()))
                           .break_(1, 0, 0, 1)
                           .class_();
                        var3.class_((double)(8 + 8 * var22.implements_()), (double)(8 + 8 * var22.finally_()), (double)(8 + 8 * var22.extends_()))
                           .break_(1, 0, 0, 1)
                           .class_();
                     }
                  }
               }

               var2.break_();
               RenderSystem.lineWidth(1.0F);
               if (var24 > 0) {
                  var3.class_(7, ju_3.this_);
                  float var26 = 0.5F;
                  float var28 = 0.2F;
                  var3.class_(0.5, 15.5, 0.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(15.5, 15.5, 0.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(15.5, 15.5, 15.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(0.5, 15.5, 15.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(0.5, 0.5, 15.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(15.5, 0.5, 15.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(15.5, 0.5, 0.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(0.5, 0.5, 0.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(0.5, 15.5, 0.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(0.5, 15.5, 15.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(0.5, 0.5, 15.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(0.5, 0.5, 0.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(15.5, 0.5, 0.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(15.5, 0.5, 15.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(15.5, 15.5, 15.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(15.5, 15.5, 0.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(0.5, 0.5, 0.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(15.5, 0.5, 0.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(15.5, 15.5, 0.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(0.5, 15.5, 0.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(0.5, 15.5, 15.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(15.5, 15.5, 15.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(15.5, 0.5, 15.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var3.class_(0.5, 0.5, 15.5).class_(0.9F, 0.9F, 0.0F, 0.2F).class_();
                  var2.break_();
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
            (float)(this.m.class_ - var1.break_().break_), (float)(this.m.break_ - var1.break_().byte_), (float)(this.m.byte_ - var1.break_().protected_)
         );
         RenderSystem.depthMask(true);
         var3.class_(7, ju_3.this_);
         this.class_(var3, 0, 1, 2, 3, 0, 1, 1);
         this.class_(var3, 4, 5, 6, 7, 1, 0, 0);
         this.class_(var3, 0, 1, 5, 4, 1, 1, 0);
         this.class_(var3, 2, 3, 7, 6, 0, 0, 1);
         this.class_(var3, 0, 4, 7, 3, 0, 1, 0);
         this.class_(var3, 1, 5, 6, 2, 1, 0, 1);
         var2.break_();
         RenderSystem.depthMask(false);
         var3.class_(1, ju_3.super_);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.class_(var3, 0);
         this.class_(var3, 1);
         this.class_(var3, 1);
         this.class_(var3, 2);
         this.class_(var3, 2);
         this.class_(var3, 3);
         this.class_(var3, 3);
         this.class_(var3, 0);
         this.class_(var3, 4);
         this.class_(var3, 5);
         this.class_(var3, 5);
         this.class_(var3, 6);
         this.class_(var3, 6);
         this.class_(var3, 7);
         this.class_(var3, 7);
         this.class_(var3, 4);
         this.class_(var3, 0);
         this.class_(var3, 4);
         this.class_(var3, 1);
         this.class_(var3, 5);
         this.class_(var3, 2);
         this.class_(var3, 6);
         this.class_(var3, 3);
         this.class_(var3, 7);
         var2.break_();
         RenderSystem.popMatrix();
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         RenderSystem.enableCull();
         RenderSystem.enableTexture();
         RenderSystem.lineWidth(1.0F);
      }
   }

   private CH break_(rLx_1 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      return this.break_(var1, var2, false, var3, var5, var7, var9, var11, var13);
   }

   private void break_(Ml_1 var1) {
      if (rrbb_3.Z()) {
         RenderSystem.disableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(false);
         this.continue_.class_(volatile_);
         yb_3 var2 = yb_3.class_();
         lD_2 var3 = var2.byte_();

         for (int var4 = 0; var4 < 6; var4++) {
            var1.class_();
            if (var4 == 1) {
               var1.class_(rje_3.break_.byte_(90.0F));
            }

            if (var4 == 2) {
               var1.class_(rje_3.break_.byte_(-90.0F));
            }

            if (var4 == 3) {
               var1.class_(rje_3.break_.byte_(180.0F));
            }

            if (var4 == 4) {
               var1.class_(rje_3.case_.byte_(90.0F));
            }

            if (var4 == 5) {
               var1.class_(rje_3.case_.byte_(-90.0F));
            }

            rjV_2 var5 = var1.byte_().class_();
            var3.class_(7, ju_3.public_);
            int var6 = 40;
            int var7 = 40;
            int var8 = 40;
            if (rrbb_3.K()) {
               rjU_2 var9 = new rjU_2((double)var6 / 255.0, (double)var7 / 255.0, (double)var8 / 255.0);
               var9 = rrbN_2.break_(var9, this.else_, this.new_.catch_(), 0.0F);
               var6 = (int)(var9.break_ * 255.0);
               var7 = (int)(var9.byte_ * 255.0);
               var8 = (int)(var9.protected_ * 255.0);
            }

            var3.class_(var5, -100.0F, -100.0F, -100.0F).class_(0.0F, 0.0F).break_(var6, var7, var8, 255).class_();
            var3.class_(var5, -100.0F, -100.0F, 100.0F).class_(0.0F, 16.0F).break_(var6, var7, var8, 255).class_();
            var3.class_(var5, 100.0F, -100.0F, 100.0F).class_(16.0F, 16.0F).break_(var6, var7, var8, 255).class_();
            var3.class_(var5, 100.0F, -100.0F, -100.0F).class_(16.0F, 0.0F).break_(var6, var7, var8, 255).class_();
            var2.break_();
            var1.break_();
         }

         RenderSystem.depthMask(true);
         RenderSystem.enableTexture();
         RenderSystem.disableBlend();
         RenderSystem.enableAlphaTest();
      }
   }

   private static void break_(Ml_1 var0, Ok_1 var1, rjC_2 var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12) {
      rjV_2 var13 = var0.byte_().class_();
      var2.class_((var12x, var14, var16, var18, var20, var22) -> {
         var1.class_(var13, (float)(var12x + var3), (float)(var14 + var5), (float)(var16 + var7)).class_(var9, var10, var11, var12).class_();
         var1.class_(var13, (float)(var18 + var3), (float)(var20 + var5), (float)(var22 + var7)).class_(var9, var10, var11, var12).class_();
      });
   }

   public void break_(int var1, rfH_2 var2, int var3) {
      if (var3 >= 0 && var3 < 10) {
         la_3 var5 = (la_3)this.float_.get(var1);
         if (var5 != null) {
            this.class_(var5);
         }

         if (var5 == null || var5.class_().b_() != var2.b_() || var5.class_().c_() != var2.c_() || var5.class_().d_() != var2.d_()) {
            var5 = new la_3(var1, var2);
            this.float_.put(var1, var5);
         }

         var5.class_(var3);
         var5.break_(this.long_);
         ((SortedSet)this.void_.computeIfAbsent(var5.class_().package_(), var0 -> Sets.newTreeSet())).add(var5);
      } else {
         la_3 var4 = (la_3)this.float_.remove(var1);
         if (var4 != null) {
            this.class_(var4);
         }
      }
   }

   public void break_(int var1, int var2, int var3) {
      this.class_(var1, var2, var3, false);
   }

   private CH break_(rLx_1 var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      ly_3 var16 = ((Hh_1)this.new_.class_[16]).finally_();
      if (this.new_ != null && var16.private_() && (Cy_1)this.new_.class_[12] != null) {
         Vm_1 var17 = this.class_(var3);
         if (var1 == rLQ.synchronized_ && !rrbb_3.switch_()) {
            return null;
         } else if (var1 == rLQ.return_ && !rrbb_3.switch_()) {
            return null;
         } else if (var1 == rLQ.boolean_ && !rrbb_3.switch_()) {
            return null;
         } else if (var1 == rLQ.s && !rrbb_3.S()) {
            return null;
         } else if (var1 == rLQ.double_ && !rrbb_3.P()) {
            return null;
         } else if (var1 == rLQ.short_ && !rrbb_3.P()) {
            return null;
         } else if (var1 == rLQ.else_ && !rrbb_3.G()) {
            return null;
         } else if (var1 == rLQ.class_ && !rrbb_3.G()) {
            return null;
         } else if (var1 == rLQ.int_ && !rrbb_3.G()) {
            return null;
         } else if (var1 == rLQ.float_ && !rrbb_3.G()) {
            return null;
         } else if (var1 == rLQ.G && !rrbb_3.G()) {
            return null;
         } else if (var1 == rLQ.transient_ && !rrbb_3.E()) {
            return null;
         } else if (var1 == rLQ.try_ && !rrbb_3.r()) {
            return null;
         } else if (var1 == rLQ.instanceof_ && !rrbb_3.r()) {
            return null;
         } else if (var1 == rLQ.package_ && !rrbb_3.double_()) {
            return null;
         } else if (var1 == rLQ.volatile_ && !rrbb_3.I()) {
            return null;
         } else if (var1 == rLQ.finally_ && !rrbb_3.I()) {
            return null;
         } else if (var1 == rLQ.goto_ && !rrbb_3.b()) {
            return null;
         } else if (var1 == rLQ.protected_ && !rrbb_3.M()) {
            return null;
         } else if ((var1 == rLQ.O || var1 == rLQ.M) && !rrbb_3.O()) {
            return null;
         } else {
            if (!var2) {
               double var18 = 1024.0;
               if (var1 == rLQ.catch_) {
                  var18 = 38416.0;
               }

               if (var16.break_().protected_(var4, var6, var8) > var18) {
                  return null;
               }

               if (var17 == Vm_1.MINIMAL) {
                  return null;
               }
            }

            CH var20 = ((Cy_1)this.new_.class_[12]).class_(var1, var4, var6, var8, var10, var12, var14);
            if (var1 == rLQ.throws_) {
               rrbN_2.class_(var20, this.else_, var4, var6, var8, this.K);
            }

            if (var1 == rLQ.E) {
               rrbN_2.class_(var20, this.else_, var4, var6, var8, this.K);
            }

            if (var1 == rLQ.for_) {
               rrbN_2.class_(var20, this.else_, var4, var6, var8, this.K);
            }

            if (var1 == rLQ.const_) {
               rrbN_2.break_(var20);
            }

            if (var1 == rLQ.transient_) {
               rrbN_2.class_(var20);
            }

            if (var1 == rLQ.package_) {
               rrbN_2.class_(var20, this.else_, var4, var6, var8);
            }

            return var20;
         }
      } else {
         return null;
      }
   }

   public void throws_() {
      if (this.else_ != null) {
         if (QY.d()) {
            this.import_();
         } else {
            this.short_();
         }

         this.else_.throws_();
         if (this.d == null) {
            this.d = new yz_3(this.else_, this, rqR_2.case_(), this.new_.strictfp_(), this.this_.class_());
         } else {
            this.d.class_(this.else_);
         }

         this.L = true;
         this.interface_ = true;
         yS_2.class_(rrbb_3.void_());
         lT_2.byte_();
         if (rrbb_3.rL()) {
            rrbg_3.class_();
         }

         rrMh_1.break_();
         e = QY.L();
         this.W = ((Qw_1)this.new_.class_[20]).break_;
         this.V = this.W * 16;
         this.g = this.V * this.V;
         this.strictfp_();
         this.const_();
         this.default_();
         if (this.goto_ != null) {
            this.goto_.class_();
         }

         this.case_();
         synchronized (this.public_) {
            this.public_.clear();
         }

         this.goto_ = new yO_2(this.d, this.else_, ((Qw_1)this.new_.class_[20]).break_, this);
         if (this.else_ != null) {
            an_3 var4 = this.new_.catch_();
            if (var4 != null) {
               this.goto_.class_(var4.rx(), var4.BO());
            }
         }
      }

      if ((cb_3)this.new_.class_[57] == null) {
         this.D = true;
      }
   }

   public void finally_() {
      this.long_++;
      if (this.long_ % 20 == 0) {
         ObjectIterator var1 = this.float_.values().iterator();

         while (var1.hasNext()) {
            la_3 var2 = (la_3)var1.next();
            int var3 = var2.byte_();
            if (this.long_ - var3 > 400) {
               var1.remove();
               this.class_(var2);
            }
         }

         if (rrbb_3.ry()) {
            this.i.clear();
         }
      }
   }

   public String catch_() {
      int var1 = this.goto_.case_.length;
      int var2 = this.private_();
      return String.format("C: %d/%d %sD: %d, %s", var2, var1, this.new_.class_[82] ? "(s) " : "", this.W, this.d == null ? "null" : this.d.class_());
   }

   public void extends_() {
   }

   public int goto_() {
      return ++this.A;
   }

   protected void case_() {
      this.synchronized_.clear();
      this.d.protected_();
   }

   private void const_() {
      yb_3 var1 = yb_3.class_();
      lD_2 var2 = var1.byte_();
      if (this.instanceof_ != null) {
         this.instanceof_.close();
      }

      this.instanceof_ = new jm_3(this.while_);
      this.class_(var2, 16.0F, false);
      var2.finally_();
      this.instanceof_.class_(var2);
   }

   public int continue_() {
      if (this.else_ == null) {
         return 0;
      } else {
         AO var1 = this.else_.native_();
         return var1 == null ? 0 : var1.protected_();
      }
   }

   public void else_() {
      if (this.D) {
         this.throws_();
         this.D = false;
      }
   }

   public String implements_() {
      return "E: " + this.z + "/" + this.else_.case_() + ", B: " + this.Q + ", " + rrbb_3.break_();
   }

   private void import_() {
      this.short_();
      rqO_2 var1 = new rqO_2("shaders/post/transparency.json");

      try {
         Vq_1 var2 = new Vq_1(this.new_.A(), this.new_.F(), this.new_.B(), var1);
         var2.class_(this.new_.else_().extends_(), this.new_.else_().native_());
         VC var10 = var2.class_("translucent");
         VC var11 = var2.class_("itemEntity");
         VC var12 = var2.class_("particles");
         VC var14 = var2.class_("weather");
         VC var7 = var2.class_("clouds");
         this.for_ = var2;
         this.default_ = var10;
         this.const_ = var11;
         this.strictfp_ = var12;
         this.boolean_ = var14;
         this.transient_ = var7;
      } catch (Exception var9) {
         String var3 = var9 instanceof JsonSyntaxException ? "parse" : "load";
         String var4 = "Failed to " + var3 + " shader: " + var1;
         yd_3 var5 = new yd_3(var4, var9);
         if (this.new_.char_().protected_().size() > 1) {
            rgN_2 var6;
            try {
               var6 = new rgN_2(this.new_.F().class_(var1).byte_());
            } catch (IOException var8) {
               var6 = null;
            }

            ((Qw_1)this.new_.class_[20]).case_ = VW.FANCY;
            this.new_.class_(var5, var6);
         } else {
            KY var13 = this.new_.class_(new KY(var4, var5));
            ((Qw_1)this.new_.class_[20]).case_ = VW.FANCY;
            ((Qw_1)this.new_.class_[20]).break_();
            implements_.fatal(var4, var5);
            this.new_.b();
            QY.byte_(var13);
         }
      }
   }

   public List<yx_3> instanceof_() {
      return this.q;
   }

   public int new_() {
      return this.Y;
   }

   public int package_() {
      return this.return_.size();
   }

   public void return_() {
      if (this.d != null) {
         this.d.private_();
      }
   }

   public int super_() {
      return this.synchronized_.size();
   }

   public rrGK throw_() {
      return rrGD.MODELS;
   }

   public List<yx_3> try_() {
      return this.p;
   }

   public yB_2 while_() {
      return this.this_;
   }

   public yt_3 static_() {
      return this.rr;
   }

   public int public_() {
      return this.A;
   }

   public boolean protected_() {
      return !rrbb_3.rs() && !rrbb_3.T() ? this.import_ != null && this.short_ != null && (cb_3)this.new_.class_[57] != null : false;
   }

   protected int private_() {
      int var1 = 0;
      ObjectListIterator var2 = this.return_.iterator();

      while (var2.hasNext()) {
         yx_3 var3 = (yx_3)var2.next();
         if (!var3.class_.byte_().class_()) {
            var1++;
         }
      }

      return var1;
   }

   public VC abstract_() {
      return this.const_;
   }

   public int final_() {
      return this.goto_.case_.length;
   }

   public void volatile_() {
      this.L = true;
      this.interface_ = true;
   }

   public void synchronized_() {
      if (this.d != null) {
         this.d.catch_();
      }
   }

   public boolean native_() {
      return this.synchronized_.isEmpty() && this.d.throws_();
   }

   private void strictfp_() {
      yb_3 var1 = yb_3.class_();
      lD_2 var2 = var1.byte_();
      if (this.try_ != null) {
         this.try_.close();
      }

      this.try_ = new jm_3(this.while_);
      this.class_(var2);
      var2.finally_();
      this.try_.class_(var2);
   }
}
