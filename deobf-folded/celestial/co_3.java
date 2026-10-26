package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class co_3 extends ch_3 {
   private static final rqO_2 id_class = new rqO_2("textures/gui/advancements/widgets.png");
   private static final int[] id_throws = new int[]{0, 10, -10, 25, -25};
   private final cD_2 id_case;
   private final OT id_catch;
   private final OU id_private;
   private final rpl_3 id_implements;
   private final int id_finally;
   private final List<rpl_3> id_extends;
   private final QY id_native;
   private co_3 id_volatile;
   private final List<co_3> id_final = Lists.newArrayList();
   private Oj_1 id_package;
   private final int id_int;
   private final int id_new;

   public co_3(cD_2 var1, QY var2, OT var3, OU var4) {
      this.id_case = var1;
      this.id_catch = var3;
      this.id_private = var4;
      this.id_native = var2;
      this.id_implements = rgX_2.id_byte().id_class(((cm_3)var2.id_class[15]).id_class(var4.id_class(), 163));
      this.id_int = rfU_2.id_protected(var4.id_case() * 28.0F);
      this.id_new = rfU_2.id_protected(var4.id_catch() * 27.0F);
      int var5 = var3.id_catch();
      int var6 = String.valueOf(var5).length();
      int var7 = var5 > 1
         ? ((cm_3)var2.id_class[15]).id_break("  ") + ((cm_3)var2.id_class[15]).id_break("0") * var6 * 2 + ((cm_3)var2.id_class[15]).id_break("/")
         : 0;
      int var8 = 29 + ((cm_3)var2.id_class[15]).id_class(this.id_implements) + var7;
      this.id_extends = rgX_2.id_byte()
         .id_class(this.id_class(rgv_3.id_class(var4.id_break().id_case(), rgc_3.id_class.id_class(var4.id_throws().id_byte())), var8));

      for (rpl_3 var10 : this.id_extends) {
         var8 = Math.max(var8, ((cm_3)var2.id_class[15]).id_class(var10));
      }

      this.id_finally = var8 + 3 + 5;
   }

   public void id_class(co_3 var1) {
      this.id_final.add(var1);
   }

   private static float id_class(rVj_1 var0, List<rgS_2> var1) {
      return (float)var1.stream().mapToDouble(var0::id_class).max().orElse(0.0);
   }

   protected void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.id_break(var1, var2, var3, var9, var10, var6, var6);
      this.id_class(var1, var2 + var6, var3, var4 - var6 - var6, var6, var9 + var6, var10, var7 - var6 - var6, var8);
      this.id_break(var1, var2 + var4 - var6, var3, var9 + var7 - var6, var10, var6, var6);
      this.id_break(var1, var2, var3 + var5 - var6, var9, var10 + var8 - var6, var6, var6);
      this.id_class(var1, var2 + var6, var3 + var5 - var6, var4 - var6 - var6, var6, var9 + var6, var10 + var8 - var6, var7 - var6 - var6, var8);
      this.id_break(var1, var2 + var4 - var6, var3 + var5 - var6, var9 + var7 - var6, var10 + var8 - var6, var6, var6);
      this.id_class(var1, var2, var3 + var6, var6, var5 - var6 - var6, var9, var10 + var6, var7, var8 - var6 - var6);
      this.id_class(var1, var2 + var6, var3 + var6, var4 - var6 - var6, var5 - var6 - var6, var9 + var6, var10 + var6, var7 - var6 - var6, var8 - var6 - var6);
      this.id_class(var1, var2 + var4 - var6, var3 + var6, var6, var5 - var6 - var6, var9 + var7 - var6, var10 + var6, var7, var8 - var6 - var6);
   }

   protected void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 0;

      while (var10 < var4) {
         int var11 = var2 + var10;
         int var12 = Math.min(var8, var4 - var10);
         int var13 = 0;

         while (var13 < var5) {
            int var14 = var3 + var13;
            int var15 = Math.min(var9, var5 - var13);
            this.id_break(var1, var11, var14, var6, var7, var12, var15);
            var13 += var9;
         }

         var10 += var8;
      }
   }

   public void id_class() {
      if (this.id_volatile == null && this.id_catch.id_break() != null) {
         this.id_volatile = this.id_class(this.id_catch);
         if (this.id_volatile != null) {
            this.id_volatile.id_class(this);
         }
      }
   }

   public void id_class(Ml_1 var1, int var2, int var3, float var4, int var5, int var6) {
      boolean var7 = var5 + var2 + this.id_int + this.id_finally + 26 >= this.id_case.id_throws().id_package;
      String var8 = this.id_package == null ? null : this.id_package.id_protected();
      int var9 = var8 == null ? 0 : ((cm_3)this.id_native.id_class[15]).id_break(var8);
      boolean var10 = 113 - var3 - this.id_new - 26 <= 6 + this.id_extends.size() * 9;
      float var11 = this.id_package == null ? 0.0F : this.id_package.id_byte();
      int var12 = rfU_2.id_protected(var11 * (float)this.id_finally);
      cK_2 var13;
      cK_2 var14;
      cK_2 var15;
      if (var11 >= 1.0F) {
         var12 = this.id_finally / 2;
         var13 = cK_2.OBTAINED;
         var14 = cK_2.OBTAINED;
         var15 = cK_2.OBTAINED;
      } else if (var12 < 2) {
         var12 = this.id_finally / 2;
         var13 = cK_2.UNOBTAINED;
         var14 = cK_2.UNOBTAINED;
         var15 = cK_2.UNOBTAINED;
      } else if (var12 > this.id_finally - 2) {
         var12 = this.id_finally / 2;
         var13 = cK_2.OBTAINED;
         var14 = cK_2.OBTAINED;
         var15 = cK_2.UNOBTAINED;
      } else {
         var13 = cK_2.OBTAINED;
         var14 = cK_2.UNOBTAINED;
         var15 = cK_2.UNOBTAINED;
      }

      int var16 = this.id_finally - var12;
      this.id_native.A().id_class(id_class);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableBlend();
      int var17 = var3 + this.id_new;
      int var18;
      if (var7) {
         var18 = var2 + this.id_int - this.id_finally + 26 + 6;
      } else {
         var18 = var2 + this.id_int;
      }

      int var19 = 32 + this.id_extends.size() * 9;
      if (!this.id_extends.isEmpty()) {
         if (var10) {
            this.id_class(var1, var18, var17 + 26 - var19, this.id_finally, var19, 10, 200, 26, 0, 52);
         } else {
            this.id_class(var1, var18, var17, this.id_finally, var19, 10, 200, 26, 0, 52);
         }
      }

      this.id_break(var1, var18, var17, 0, var13.id_class() * 26, var12, 26);
      this.id_break(var1, var18 + var12, var17, 200 - var16, var14.id_class() * 26, var16, 26);
      this.id_break(var1, var2 + this.id_int + 3, var3 + this.id_new, this.id_private.id_throws().id_break(), 128 + var15.id_class() * 26, 26, 26);
      if (var7) {
         ((cm_3)this.id_native.id_class[15]).id_class(var1, this.id_implements, (float)(var18 + 5), (float)(var3 + this.id_new + 9), -1);
         if (var8 != null) {
            ((cm_3)this.id_native.id_class[15]).id_class(var1, var8, (float)(var2 + this.id_int - var9), (float)(var3 + this.id_new + 9), -1);
         }
      } else {
         ((cm_3)this.id_native.id_class[15]).id_class(var1, this.id_implements, (float)(var2 + this.id_int + 32), (float)(var3 + this.id_new + 9), -1);
         if (var8 != null) {
            ((cm_3)this.id_native.id_class[15])
               .id_class(var1, var8, (float)(var2 + this.id_int + this.id_finally - var9 - 5), (float)(var3 + this.id_new + 9), -1);
         }
      }

      if (var10) {
         for (int var20 = 0; var20 < this.id_extends.size(); var20++) {
            ((cm_3)this.id_native.id_class[15])
               .id_break(var1, this.id_extends.get(var20), (float)(var18 + 5), (float)(var17 + 26 - var19 + 7 + var20 * 9), -5592406);
         }
      } else {
         for (int var21 = 0; var21 < this.id_extends.size(); var21++) {
            ((cm_3)this.id_native.id_class[15])
               .id_break(var1, this.id_extends.get(var21), (float)(var18 + 5), (float)(var3 + this.id_new + 9 + 17 + var21 * 9), -5592406);
         }
      }

      this.id_native.id_float().id_break(this.id_private.id_byte(), var2 + this.id_int + 8, var3 + this.id_new + 5);
   }

   private List<rgS_2> id_class(rgP_2 var1, int var2) {
      rVj_1 var3 = ((cm_3)this.id_native.id_class[15]).id_break();
      List var4 = null;
      float var5 = Float.MAX_VALUE;

      for (int var9 : id_throws) {
         List var10 = var3.id_break(var1, var2 - var9, rgc_3.id_class);
         float var11 = Math.abs(id_class(var3, var10) - (float)var2);
         if (var11 <= 10.0F) {
            return var10;
         }

         if (var11 < var5) {
            var5 = var11;
            var4 = var10;
         }
      }

      return var4;
   }

   private co_3 id_class(OT var1) {
      do {
         var1 = var1.id_break();
      } while (var1 != null && var1.id_byte() == null);

      return var1 != null && var1.id_byte() != null ? this.id_case.id_break(var1) : null;
   }

   public void id_class(Ml_1 var1, int var2, int var3, boolean var4) {
      if (this.id_volatile != null) {
         int var5 = var2 + this.id_volatile.id_int + 13;
         int var6 = var2 + this.id_volatile.id_int + 26 + 4;
         int var7 = var3 + this.id_volatile.id_new + 13;
         int var8 = var2 + this.id_int + 13;
         int var9 = var3 + this.id_new + 13;
         int var10 = var4 ? -16777216 : -1;
         if (var4) {
            this.id_class(var1, var6, var5, var7 - 1, var10);
            this.id_class(var1, var6 + 1, var5, var7, var10);
            this.id_class(var1, var6, var5, var7 + 1, var10);
            this.id_class(var1, var8, var6 - 1, var9 - 1, var10);
            this.id_class(var1, var8, var6 - 1, var9, var10);
            this.id_class(var1, var8, var6 - 1, var9 + 1, var10);
            this.id_break(var1, var6 - 1, var9, var7, var10);
            this.id_break(var1, var6 + 1, var9, var7, var10);
         } else {
            this.id_class(var1, var6, var5, var7, var10);
            this.id_class(var1, var8, var6, var9, var10);
            this.id_break(var1, var6, var9, var7, var10);
         }
      }

      for (co_3 var12 : this.id_final) {
         var12.id_class(var1, var2, var3, var4);
      }
   }

   public void id_class(Oj_1 var1) {
      this.id_package = var1;
   }

   public void id_class(Ml_1 var1, int var2, int var3) {
      if (!this.id_private.id_finally() || this.id_package != null && this.id_package.id_class()) {
         float var4 = this.id_package == null ? 0.0F : this.id_package.id_byte();
         cK_2 var5;
         if (var4 >= 1.0F) {
            var5 = cK_2.OBTAINED;
         } else {
            var5 = cK_2.UNOBTAINED;
         }

         this.id_native.A().id_class(id_class);
         this.id_break(var1, var2 + this.id_int + 3, var3 + this.id_new, this.id_private.id_throws().id_break(), 128 + var5.id_class() * 26, 26, 26);
         this.id_native.id_float().id_break(this.id_private.id_byte(), var2 + this.id_int + 8, var3 + this.id_new + 5);
      }

      for (co_3 var7 : this.id_final) {
         var7.id_class(var1, var2, var3);
      }
   }

   public boolean id_break(int var1, int var2, int var3, int var4) {
      if (!this.id_private.id_finally() || this.id_package != null && this.id_package.id_class()) {
         int var5 = var1 + this.id_int;
         int var6 = var5 + 26;
         int var7 = var2 + this.id_new;
         int var8 = var7 + 26;
         return var3 >= var5 && var3 <= var6 && var4 >= var7 && var4 <= var8;
      } else {
         return false;
      }
   }

   public int id_throws() {
      return this.id_int;
   }

   public int id_protected() {
      return this.id_new;
   }
}
