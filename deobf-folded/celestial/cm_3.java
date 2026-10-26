package celestial;

import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class cm_3 {
   private static final rje_3 id_protected = new rje_3(0.0F, 0.0F, 0.03F);
   public final int id_class = 9;
   public final Random id_break = new Random();
   private final Function<rqO_2, uG_2> id_throws;
   private final rVj_1 id_case;
   private boolean id_catch = false;
   private rrxz_3 id_private = new rrxz_3();
   private uX_2 id_implements = new rrWA(4.0F);
   public static boolean id_byte = false;

   public int id_byte(Ml_1 var1, rgP_2 var2, float var3, float var4, int var5) {
      RenderSystem.enableAlphaTest();
      return this.id_class(var2.id_catch(), var3, var4, var5, var1.id_byte().id_class(), false);
   }

   private float id_byte(rpl_3 var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10) {
      cZ_2 var11 = new cZ_2(this, var7, var2, var3, var4, var5, var6, var8, var10);
      var1.accept(var11);
      return var11.id_class(var9, var2);
   }

   public cm_3(Function<rqO_2, uG_2> var1) {
      this.id_throws = var1;
      this.id_case = new rVj_1((var1x, var2) -> this.id_class(var2.id_extends()).id_class(var1x).id_class(var2.id_break()));
   }

   public int id_class(rgP_2 var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10) {
      return this.id_class(var1.id_catch(), var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public int id_class(rpl_3 var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10) {
      return this.id_break(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   private static int id_class(int var0) {
      if (id_byte) {
         return var0;
      } else {
         return (var0 & -67108864) == 0 ? var0 | 0xFF000000 : var0;
      }
   }

   uG_2 id_class(rqO_2 var1) {
      return this.id_throws.apply(var1);
   }

   void id_class(
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
      var1.id_class(var3, var5, var6, var7, var8, var9, var10, var11, var12, var13);
      if (var2) {
         var1.id_class(var3, var5 + var4, var6, var7, var8, var9, var10, var11, var12, var13);
      }
   }

   private int id_class(rpl_3 var1, float var2, float var3, int var4, rjV_2 var5, boolean var6, boolean var7) {
      Hd_1 var8 = Hx_1.id_class(yb_3.id_class().id_byte());
      int var9 = this.id_class(var1, var2, var3, var4, var7, var5, var8, var6, 0, 15728880);
      var8.id_break();
      return var9;
   }

   private int id_class(rpl_3 var1, float var2, float var3, int var4, rjV_2 var5, boolean var6, int var7, boolean var8) {
      Hd_1 var9 = Hx_1.id_class(yb_3.id_class().id_byte());
      int var10 = this.id_class(var1, var2, var3, var4, var8, var5, var9, var6, var7, 15728880);
      var9.id_break();
      return var10;
   }

   public int id_class(Ml_1 var1, String var2, float var3, float var4, int var5) {
      return this.id_class(var2, var3, var4, var5, var1.id_byte().id_class(), true, this.id_class());
   }

   public int id_class(String var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10, boolean var11) {
      return this.id_break(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public rgS_2 id_class(rgS_2 var1, int var2) {
      return this.id_case.id_class(var1, var2, rgc_3.id_class);
   }

   public void id_class(rgS_2 var1, int var2, int var3, int var4, int var5) {
      rjV_2 var6 = rjo_3.id_class().id_byte();

      for (rpl_3 var8 : this.id_break(var1, var4)) {
         this.id_class(var8, (float)var2, (float)var3, var5, var6, false);
         var3 += 9;
      }
   }

   public boolean id_class() {
      return rgX_2.id_byte().id_class();
   }

   public int id_class(String var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10) {
      return this.id_class(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, this.id_class());
   }

   public int id_class(rgS_2 var1) {
      return rfU_2.id_case(this.id_case.id_class(var1));
   }

   public int id_class(rpl_3 var1) {
      return rfU_2.id_case(this.id_case.id_class(var1));
   }

   public String id_class(String var1, int var2, boolean var3) {
      return var3 ? this.id_case.id_byte(var1, var2, rgc_3.id_class) : this.id_case.id_break(var1, var2, rgc_3.id_class);
   }

   public String id_class(String var1, int var2) {
      return this.id_case.id_break(var1, var2, rgc_3.id_class);
   }

   public int id_class(Ml_1 var1, rgP_2 var2, float var3, float var4, int var5, boolean var6, int var7) {
      RenderSystem.enableAlphaTest();
      return this.id_class(var2.id_catch(), var3, var4, var5, var1.id_byte().id_class(), var6, var7, true);
   }

   public int id_class(Ml_1 var1, rgP_2 var2, float var3, float var4, int var5) {
      RenderSystem.enableAlphaTest();
      return this.id_class(var2.id_catch(), var3, var4, var5, var1.id_byte().id_class(), false);
   }

   public int id_class(Ml_1 var1, rpl_3 var2, float var3, float var4, int var5) {
      RenderSystem.enableAlphaTest();
      return this.id_class(var2, var3, var4, var5, var1.id_byte().id_class(), true);
   }

   public int id_class(Ml_1 var1, rgP_2 var2, int var3, int var4, int var5) {
      return this.id_class(var1, var2, (float)(var3 - this.id_class(var2) / 2), (float)var4, var5);
   }

   public int id_class(Ml_1 var1, String var2, int var3, int var4, int var5) {
      return this.id_class(var2, (float)(var3 - this.id_break(var2) / 2), (float)var4, var5, var1.id_byte().id_class(), false, this.id_class());
   }

   public int id_class(Ml_1 var1, String var2, float var3, float var4, int var5, boolean var6, boolean var7) {
      return this.id_class(var2, var3, var4, var5, var1.id_byte().id_class(), var6, var7, this.id_class());
   }

   private int id_class(String var1, float var2, float var3, int var4, rjV_2 var5, boolean var6, boolean var7, boolean var8) {
      if (var1 == null) {
         return 0;
      } else {
         Hd_1 var9 = Hx_1.id_class(yb_3.id_class().id_byte());
         int var10 = this.id_class(var1, var2, var3, var4, var6, var5, var9, var7, 0, 15728880, var8);
         var9.id_break();
         return var10;
      }
   }

   public int id_class(Ml_1 var1, String var2, float var3, float var4, int var5, boolean var6) {
      return this.id_class(var2, var3, var4, var5, var1.id_byte().id_class(), true, var6, this.id_class());
   }

   private int id_class(String var1, float var2, float var3, int var4, rjV_2 var5, boolean var6, boolean var7) {
      if (var1 == null) {
         return 0;
      } else {
         Hd_1 var8 = Hx_1.id_class(yb_3.id_class().id_byte());
         int var9 = this.id_class(var1, var2, var3, var4, var6, var5, var8, false, 0, 15728880, var7);
         var8.id_break();
         return var9;
      }
   }

   public String id_class(String var1) {
      try {
         Bidi var2 = new Bidi(new ArabicShaping(8).shape(var1), 127);
         var2.setReorderingMode(0);
         return var2.writeReordered(2);
      } catch (ArabicShapingException var3) {
         return var1;
      }
   }

   private int id_class(rpl_3 var1, float var2, float var3, int var4, rjV_2 var5, boolean var6) {
      Hd_1 var7 = Hx_1.id_class(yb_3.id_class().id_byte());
      int var8 = this.id_class(var1, var2, var3, var4, var6, var5, var7, false, 0, 15728880);
      var7.id_break();
      return var8;
   }

   public void id_class(List<String> var1, rrWn_1[] var2, int var3, rjV_2 var4, boolean var5, boolean var6) {
      Hd_1 var7 = Hx_1.id_class(yb_3.id_class().id_byte());

      for (int var8 = 0; var8 < var1.size(); var8++) {
         String var9 = (String)var1.get(var8);
         if (var9 != null && !var9.isEmpty()) {
            rrWn_1 var10 = var2[var8];
            if (var10 != null) {
               float var11 = (float)var10.id_class();
               float var12 = (float)var10.id_break();
               this.id_class(var9, var11, var12, var3, var5, var4, var7, false, 0, 15728880, var6);
            }
         }
      }

      var7.id_break();
   }

   public int id_break(Ml_1 var1, rgP_2 var2, int var3, int var4, int var5) {
      return this.id_break(var1, var2, (float)(var3 - this.id_class(var2) / 2), (float)var4, var5);
   }

   public int id_break(String var1, int var2) {
      return 9 * this.id_case.id_protected(var1, var2, rgc_3.id_class).size();
   }

   public int id_break(Ml_1 var1, rpl_3 var2, float var3, float var4, int var5) {
      RenderSystem.enableAlphaTest();
      return this.id_class(var2, var3, var4, var5, var1.id_byte().id_class(), false);
   }

   public rVj_1 id_break() {
      return this.id_case;
   }

   public int id_break(Ml_1 var1, String var2, int var3, int var4, int var5) {
      return this.id_class(var2, (float)(var3 - this.id_break(var2) / 2), (float)var4, var5, var1.id_byte().id_class(), true, this.id_class());
   }

   public List<rpl_3> id_break(rgS_2 var1, int var2) {
      return rgX_2.id_byte().id_class(this.id_case.id_break(var1, var2, rgc_3.id_class));
   }

   public int id_break(Ml_1 var1, rgP_2 var2, float var3, float var4, int var5) {
      RenderSystem.enableAlphaTest();
      return this.id_class(var2.id_catch(), var3, var4, var5, var1.id_byte().id_class(), true);
   }

   private float id_break(String var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10) {
      cZ_2 var11 = new cZ_2(this, var7, var2, var3, var4, var5, var6, var8, var10);
      rgL_2.id_byte(var1, rgc_3.id_class, var11);
      return var11.id_class(var9, var2);
   }

   private int id_break(rpl_3 var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10) {
      var4 = id_class(var4);
      rjV_2 var11 = var6.id_case();
      if (var5) {
         this.id_byte(var1, var2, var3, var4, true, var6, var7, var8, var9, var10);
         var11.id_class(id_protected);
      }

      var2 = this.id_byte(var1, var2, var3, var4, false, var11, var7, var8, var9, var10);
      return (int)var2 + (var5 ? 1 : 0);
   }

   private int id_break(String var1, float var2, float var3, int var4, boolean var5, rjV_2 var6, Hx_1 var7, boolean var8, int var9, int var10, boolean var11) {
      if (var11) {
         var1 = this.id_class(var1);
      }

      var4 = id_class(var4);
      rjV_2 var12 = var6.id_case();
      if (var5) {
         this.id_break(var1, var2, var3, var4, true, var6, var7, var8, var9, var10);
         var12.id_class(id_protected);
      }

      var2 = this.id_break(var1, var2, var3, var4, false, var12, var7, var8, var9, var10);
      return (int)var2 + (var5 ? 1 : 0);
   }

   public int id_break(Ml_1 var1, String var2, float var3, float var4, int var5, boolean var6) {
      RenderSystem.enableAlphaTest();
      return this.id_class(var2, var3, var4, var5, var1.id_byte().id_class(), true, var6);
   }

   public int id_break(Ml_1 var1, String var2, float var3, float var4, int var5) {
      RenderSystem.enableAlphaTest();
      return this.id_class(var2, var3, var4, var5, var1.id_byte().id_class(), false, this.id_class());
   }

   public float id_break(rgS_2 var1) {
      return this.id_case.id_class(var1);
   }

   public int id_break(String var1) {
      return rfU_2.id_case(this.id_case.id_class(var1));
   }
}
