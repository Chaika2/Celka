package celestial;

import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class cm_3 {
   private static final rje_3 protected_ = new rje_3(0.0F, 0.0F, 0.03F);
   public final int class_ = 9;
   public final Random break_ = new Random();
   private final Function<rqO_2, uG_2> throws_;
   private final rVj_1 case_;
   private boolean catch_ = false;
   private rrxz_3 private_ = new rrxz_3();
   private uX_2 implements_ = new rrWA(4.0F);
   public static boolean byte_ = false;

   public int byte_(Ml_1 var1, rgP_2 var2, float var3, float var4, int var5) {
      RenderSystem.enableAlphaTest();
      return this.class_(var2.catch_(), var3, var4, var5, var1.byte_().class_(), false);
   }

   private float byte_(rpl_3 var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10) {
      cZ_2 var11 = new cZ_2(this, var7, var2, var3, var4, var5, var6, var8, var10);
      var1.accept(var11);
      return var11.class_(var9, var2);
   }

   public cm_3(Function<rqO_2, uG_2> var1) {
      this.throws_ = var1;
      this.case_ = new rVj_1((var1x, var2) -> this.class_(var2.extends_()).class_(var1x).class_(var2.break_()));
   }

   public int class_(rgP_2 var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10) {
      return this.class_(var1.catch_(), var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public int class_(rpl_3 var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10) {
      return this.break_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   private static int class_(int var0) {
      if (byte_) {
         return var0;
      } else {
         return (var0 & -67108864) == 0 ? var0 | 0xFF000000 : var0;
      }
   }

   uG_2 class_(rqO_2 var1) {
      return this.throws_.apply(var1);
   }

   void class_(
      ud_3 var1,
      boolean var2,
      boolean var3,
      float var4,
      float var5,
      float var6,
      rjV_2 var7,
      Ok_1 var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13
   ) {
      var1.class_(var3, var5, var6, var7, var8, var9, var10, var11, var12, var13);
      if (var2) {
         var1.class_(var3, var5 + var4, var6, var7, var8, var9, var10, var11, var12, var13);
      }
   }

   private int class_(rpl_3 var1, float var2, float var3, int var4, rjV_2 var5, boolean var6, boolean var7) {
      Hd_1 var8 = Hx_1.class_(yb_3.class_().byte_());
      int var9 = this.class_(var1, var2, var3, var4, var7, var5, var8, var6, 0, 15728880);
      var8.break_();
      return var9;
   }

   private int class_(rpl_3 var1, float var2, float var3, int var4, rjV_2 var5, boolean var6, int var7, boolean var8) {
      Hd_1 var9 = Hx_1.class_(yb_3.class_().byte_());
      int var10 = this.class_(var1, var2, var3, var4, var8, var5, var9, var6, var7, 15728880);
      var9.break_();
      return var10;
   }

   public int class_(Ml_1 var1, String var2, float var3, float var4, int var5) {
      return this.class_(var2, var3, var4, var5, var1.byte_().class_(), true, this.class_());
   }

   public int class_(String var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10, boolean var11) {
      return this.break_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public rgS_2 class_(rgS_2 var1, int var2) {
      return this.case_.class_(var1, var2, rgc_3.class_);
   }

   public void class_(rgS_2 var1, int var2, int var3, int var4, int var5) {
      rjV_2 var6 = rjo_3.class_().byte_();

      for (rpl_3 var8 : this.break_(var1, var4)) {
         this.class_(var8, (float)var2, (float)var3, var5, var6, false);
         var3 += 9;
      }
   }

   public boolean class_() {
      return rgX_2.byte_().class_();
   }

   public int class_(String var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10) {
      return this.class_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, this.class_());
   }

   public int class_(rgS_2 var1) {
      return rfU_2.case_(this.case_.class_(var1));
   }

   public int class_(rpl_3 var1) {
      return rfU_2.case_(this.case_.class_(var1));
   }

   public String class_(String var1, int var2, boolean var3) {
      return var3 ? this.case_.byte_(var1, var2, rgc_3.class_) : this.case_.break_(var1, var2, rgc_3.class_);
   }

   public String class_(String var1, int var2) {
      return this.case_.break_(var1, var2, rgc_3.class_);
   }

   public int class_(Ml_1 var1, rgP_2 var2, float var3, float var4, int var5, boolean var6, int var7) {
      RenderSystem.enableAlphaTest();
      return this.class_(var2.catch_(), var3, var4, var5, var1.byte_().class_(), var6, var7, true);
   }

   public int class_(Ml_1 var1, rgP_2 var2, float var3, float var4, int var5) {
      RenderSystem.enableAlphaTest();
      return this.class_(var2.catch_(), var3, var4, var5, var1.byte_().class_(), false);
   }

   public int class_(Ml_1 var1, rpl_3 var2, float var3, float var4, int var5) {
      RenderSystem.enableAlphaTest();
      return this.class_(var2, var3, var4, var5, var1.byte_().class_(), true);
   }

   public int class_(Ml_1 var1, rgP_2 var2, int var3, int var4, int var5) {
      return this.class_(var1, var2, (float)(var3 - this.class_(var2) / 2), (float)var4, var5);
   }

   public int class_(Ml_1 var1, String var2, int var3, int var4, int var5) {
      return this.class_(var2, (float)(var3 - this.break_(var2) / 2), (float)var4, var5, var1.byte_().class_(), false, this.class_());
   }

   public int class_(Ml_1 var1, String var2, float var3, float var4, int var5, boolean var6, boolean var7) {
      return this.class_(var2, var3, var4, var5, var1.byte_().class_(), var6, var7, this.class_());
   }

   private int class_(String var1, float var2, float var3, int var4, rjV_2 var5, boolean var6, boolean var7, boolean var8) {
      if (var1 == null) {
         return 0;
      } else {
         Hd_1 var9 = Hx_1.class_(yb_3.class_().byte_());
         int var10 = this.class_(var1, var2, var3, var4, var6, var5, var9, var7, 0, 15728880, var8);
         var9.break_();
         return var10;
      }
   }

   public int class_(Ml_1 var1, String var2, float var3, float var4, int var5, boolean var6) {
      return this.class_(var2, var3, var4, var5, var1.byte_().class_(), true, var6, this.class_());
   }

   private int class_(String var1, float var2, float var3, int var4, rjV_2 var5, boolean var6, boolean var7) {
      if (var1 == null) {
         return 0;
      } else {
         Hd_1 var8 = Hx_1.class_(yb_3.class_().byte_());
         int var9 = this.class_(var1, var2, var3, var4, var6, var5, var8, false, 0, 15728880, var7);
         var8.break_();
         return var9;
      }
   }

   public String class_(String var1) {
      try {
         Bidi var2 = new Bidi(new ArabicShaping(8).shape(var1), 127);
         var2.setReorderingMode(0);
         return var2.writeReordered(2);
      } catch (ArabicShapingException var3) {
         return var1;
      }
   }

   private int class_(rpl_3 var1, float var2, float var3, int var4, rjV_2 var5, boolean var6) {
      Hd_1 var7 = Hx_1.class_(yb_3.class_().byte_());
      int var8 = this.class_(var1, var2, var3, var4, var6, var5, var7, false, 0, 15728880);
      var7.break_();
      return var8;
   }

   public void class_(List<String> var1, rrWn_1[] var2, int var3, rjV_2 var4, boolean var5, boolean var6) {
      Hd_1 var7 = Hx_1.class_(yb_3.class_().byte_());

      for (int var8 = 0; var8 < var1.size(); var8++) {
         String var9 = (String)var1.get(var8);
         if (var9 != null && !var9.isEmpty()) {
            rrWn_1 var10 = var2[var8];
            if (var10 != null) {
               float var11 = (float)var10.class_();
               float var12 = (float)var10.break_();
               this.class_(var9, var11, var12, var3, var5, var4, var7, false, 0, 15728880, var6);
            }
         }
      }

      var7.break_();
   }

   public int break_(Ml_1 var1, rgP_2 var2, int var3, int var4, int var5) {
      return this.break_(var1, var2, (float)(var3 - this.class_(var2) / 2), (float)var4, var5);
   }

   public int break_(String var1, int var2) {
      return 9 * this.case_.protected_(var1, var2, rgc_3.class_).size();
   }

   public int break_(Ml_1 var1, rpl_3 var2, float var3, float var4, int var5) {
      RenderSystem.enableAlphaTest();
      return this.class_(var2, var3, var4, var5, var1.byte_().class_(), false);
   }

   public rVj_1 break_() {
      return this.case_;
   }

   public int break_(Ml_1 var1, String var2, int var3, int var4, int var5) {
      return this.class_(var2, (float)(var3 - this.break_(var2) / 2), (float)var4, var5, var1.byte_().class_(), true, this.class_());
   }

   public List<rpl_3> break_(rgS_2 var1, int var2) {
      return rgX_2.byte_().class_(this.case_.break_(var1, var2, rgc_3.class_));
   }

   public int break_(Ml_1 var1, rgP_2 var2, float var3, float var4, int var5) {
      RenderSystem.enableAlphaTest();
      return this.class_(var2.catch_(), var3, var4, var5, var1.byte_().class_(), true);
   }

   private float break_(String var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10) {
      cZ_2 var11 = new cZ_2(this, var7, var2, var3, var4, var5, var6, var8, var10);
      rgL_2.byte_(var1, rgc_3.class_, var11);
      return var11.class_(var9, var2);
   }

   private int break_(rpl_3 var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10) {
      var4 = class_(var4);
      rjV_2 var11 = var6.case_();
      if (var5) {
         this.byte_(var1, var2, var3, var4, true, var6, var7, var8, var9, var10);
         var11.class_(protected_);
      }

      var2 = this.byte_(var1, var2, var3, var4, false, var11, var7, var8, var9, var10);
      return (int)var2 + (var5 ? 1 : 0);
   }

   private int break_(String var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10, boolean var11) {
      if (var11) {
         var1 = this.class_(var1);
      }

      var4 = class_(var4);
      rjV_2 var12 = var6.case_();
      if (var5) {
         this.break_(var1, var2, var3, var4, true, var6, var7, var8, var9, var10);
         var12.class_(protected_);
      }

      var2 = this.break_(var1, var2, var3, var4, false, var12, var7, var8, var9, var10);
      return (int)var2 + (var5 ? 1 : 0);
   }

   public int break_(Ml_1 var1, String var2, float var3, float var4, int var5, boolean var6) {
      RenderSystem.enableAlphaTest();
      return this.class_(var2, var3, var4, var5, var1.byte_().class_(), true, var6);
   }

   public int break_(Ml_1 var1, String var2, float var3, float var4, int var5) {
      RenderSystem.enableAlphaTest();
      return this.class_(var2, var3, var4, var5, var1.byte_().class_(), false, this.class_());
   }

   public float break_(rgS_2 var1) {
      return this.case_.class_(var1);
   }

   public int break_(String var1) {
      return rfU_2.case_(this.case_.class_(var1));
   }
}
