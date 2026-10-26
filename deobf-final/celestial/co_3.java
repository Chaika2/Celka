package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class co_3 extends ch_3 {
   private static final rqO_2 class_ = new rqO_2("textures/gui/advancements/widgets.png");
   private static final int[] throws_ = new int[]{0, 10, -10, 25, -25};
   private final cD_2 case_;
   private final OT catch_;
   private final OU private_;
   private final rpl_3 implements_;
   private final int finally_;
   private final List<rpl_3> extends_;
   private final QY native_;
   private co_3 volatile_;
   private final List<co_3> final_ = Lists.newArrayList();
   private Oj_1 package_;
   private final int int_;
   private final int new_;

   public co_3(cD_2 var1, QY var2, OT var3, OU var4) {
      this.case_ = var1;
      this.catch_ = var3;
      this.private_ = var4;
      this.native_ = var2;
      this.implements_ = rgX_2.byte_().class_(((cm_3)var2.class_[15]).class_(var4.class_(), 163));
      this.int_ = rfU_2.protected_(var4.case_() * 28.0F);
      this.new_ = rfU_2.protected_(var4.catch_() * 27.0F);
      int var5 = var3.catch_();
      int var6 = String.valueOf(var5).length();
      int var7 = var5 > 1 ? ((cm_3)var2.class_[15]).break_("  ") + ((cm_3)var2.class_[15]).break_("0") * var6 * 2 + ((cm_3)var2.class_[15]).break_("/") : 0;
      int var8 = 29 + ((cm_3)var2.class_[15]).class_(this.implements_) + var7;
      this.extends_ = rgX_2.byte_().class_(this.class_(rgv_3.class_(var4.break_().case_(), rgc_3.class_.class_(var4.throws_().byte_())), var8));

      for (rpl_3 var10 : this.extends_) {
         var8 = Math.max(var8, ((cm_3)var2.class_[15]).class_(var10));
      }

      this.finally_ = var8 + 3 + 5;
   }

   public void class_(co_3 var1) {
      this.final_.add(var1);
   }

   private static float class_(rVj_1 var0, List<rgS_2> var1) {
      return (float)var1.stream().mapToDouble(var0::class_).max().orElse(0.0);
   }

   protected void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.break_(var1, var2, var3, var9, var10, var6, var6);
      this.class_(var1, var2 + var6, var3, var4 - var6 - var6, var6, var9 + var6, var10, var7 - var6 - var6, var8);
      this.break_(var1, var2 + var4 - var6, var3, var9 + var7 - var6, var10, var6, var6);
      this.break_(var1, var2, var3 + var5 - var6, var9, var10 + var8 - var6, var6, var6);
      this.class_(var1, var2 + var6, var3 + var5 - var6, var4 - var6 - var6, var6, var9 + var6, var10 + var8 - var6, var7 - var6 - var6, var8);
      this.break_(var1, var2 + var4 - var6, var3 + var5 - var6, var9 + var7 - var6, var10 + var8 - var6, var6, var6);
      this.class_(var1, var2, var3 + var6, var6, var5 - var6 - var6, var9, var10 + var6, var7, var8 - var6 - var6);
      this.class_(var1, var2 + var6, var3 + var6, var4 - var6 - var6, var5 - var6 - var6, var9 + var6, var10 + var6, var7 - var6 - var6, var8 - var6 - var6);
      this.class_(var1, var2 + var4 - var6, var3 + var6, var6, var5 - var6 - var6, var9 + var7 - var6, var10 + var6, var7, var8 - var6 - var6);
   }

   protected void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 0;

      while (var10 < var4) {
         int var11 = var2 + var10;
         int var12 = Math.min(var8, var4 - var10);
         int var13 = 0;

         while (var13 < var5) {
            int var14 = var3 + var13;
            int var15 = Math.min(var9, var5 - var13);
            this.break_(var1, var11, var14, var6, var7, var12, var15);
            var13 += var9;
         }

         var10 += var8;
      }
   }

   public void class_() {
      if (this.volatile_ == null && this.catch_.break_() != null) {
         this.volatile_ = this.class_(this.catch_);
         if (this.volatile_ != null) {
            this.volatile_.class_(this);
         }
      }
   }

   public void class_(Ml_1 var1, int var2, int var3, float var4, int var5, int var6) {
      boolean var7 = var5 + var2 + this.int_ + this.finally_ + 26 >= this.case_.throws_().package_;
      String var8 = this.package_ == null ? null : this.package_.protected_();
      int var9 = var8 == null ? 0 : ((cm_3)this.native_.class_[15]).break_(var8);
      boolean var10 = 113 - var3 - this.new_ - 26 <= 6 + this.extends_.size() * 9;
      float var11 = this.package_ == null ? 0.0F : this.package_.byte_();
      int var12 = rfU_2.protected_(var11 * (float)this.finally_);
      cK_2 var13;
      cK_2 var14;
      cK_2 var15;
      if (var11 >= 1.0F) {
         var12 = this.finally_ / 2;
         var13 = cK_2.OBTAINED;
         var14 = cK_2.OBTAINED;
         var15 = cK_2.OBTAINED;
      } else if (var12 < 2) {
         var12 = this.finally_ / 2;
         var13 = cK_2.UNOBTAINED;
         var14 = cK_2.UNOBTAINED;
         var15 = cK_2.UNOBTAINED;
      } else if (var12 > this.finally_ - 2) {
         var12 = this.finally_ / 2;
         var13 = cK_2.OBTAINED;
         var14 = cK_2.OBTAINED;
         var15 = cK_2.UNOBTAINED;
      } else {
         var13 = cK_2.OBTAINED;
         var14 = cK_2.UNOBTAINED;
         var15 = cK_2.UNOBTAINED;
      }

      int var16 = this.finally_ - var12;
      this.native_.A().class_(class_);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableBlend();
      int var17 = var3 + this.new_;
      int var18;
      if (var7) {
         var18 = var2 + this.int_ - this.finally_ + 26 + 6;
      } else {
         var18 = var2 + this.int_;
      }

      int var19 = 32 + this.extends_.size() * 9;
      if (!this.extends_.isEmpty()) {
         if (var10) {
            this.class_(var1, var18, var17 + 26 - var19, this.finally_, var19, 10, 200, 26, 0, 52);
         } else {
            this.class_(var1, var18, var17, this.finally_, var19, 10, 200, 26, 0, 52);
         }
      }

      this.break_(var1, var18, var17, 0, var13.class_() * 26, var12, 26);
      this.break_(var1, var18 + var12, var17, 200 - var16, var14.class_() * 26, var16, 26);
      this.break_(var1, var2 + this.int_ + 3, var3 + this.new_, this.private_.throws_().break_(), 128 + var15.class_() * 26, 26, 26);
      if (var7) {
         ((cm_3)this.native_.class_[15]).class_(var1, this.implements_, (float)(var18 + 5), (float)(var3 + this.new_ + 9), -1);
         if (var8 != null) {
            ((cm_3)this.native_.class_[15]).class_(var1, var8, (float)(var2 + this.int_ - var9), (float)(var3 + this.new_ + 9), -1);
         }
      } else {
         ((cm_3)this.native_.class_[15]).class_(var1, this.implements_, (float)(var2 + this.int_ + 32), (float)(var3 + this.new_ + 9), -1);
         if (var8 != null) {
            ((cm_3)this.native_.class_[15]).class_(var1, var8, (float)(var2 + this.int_ + this.finally_ - var9 - 5), (float)(var3 + this.new_ + 9), -1);
         }
      }

      if (var10) {
         for (int var20 = 0; var20 < this.extends_.size(); var20++) {
            ((cm_3)this.native_.class_[15]).break_(var1, this.extends_.get(var20), (float)(var18 + 5), (float)(var17 + 26 - var19 + 7 + var20 * 9), -5592406);
         }
      } else {
         for (int var21 = 0; var21 < this.extends_.size(); var21++) {
            ((cm_3)this.native_.class_[15])
               .break_(var1, this.extends_.get(var21), (float)(var18 + 5), (float)(var3 + this.new_ + 9 + 17 + var21 * 9), -5592406);
         }
      }

      this.native_.float_().break_(this.private_.byte_(), var2 + this.int_ + 8, var3 + this.new_ + 5);
   }

   private List<rgS_2> class_(rgP_2 var1, int var2) {
      rVj_1 var3 = ((cm_3)this.native_.class_[15]).break_();
      List var4 = null;
      float var5 = Float.MAX_VALUE;

      for (int var9 : throws_) {
         List var10 = var3.break_(var1, var2 - var9, rgc_3.class_);
         float var11 = Math.abs(class_(var3, var10) - (float)var2);
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

   private co_3 class_(OT var1) {
      do {
         var1 = var1.break_();
      } while (var1 != null && var1.byte_() == null);

      return var1 != null && var1.byte_() != null ? this.case_.break_(var1) : null;
   }

   public void class_(Ml_1 var1, int var2, int var3, boolean var4) {
      if (this.volatile_ != null) {
         int var5 = var2 + this.volatile_.int_ + 13;
         int var6 = var2 + this.volatile_.int_ + 26 + 4;
         int var7 = var3 + this.volatile_.new_ + 13;
         int var8 = var2 + this.int_ + 13;
         int var9 = var3 + this.new_ + 13;
         int var10 = var4 ? -16777216 : -1;
         if (var4) {
            this.class_(var1, var6, var5, var7 - 1, var10);
            this.class_(var1, var6 + 1, var5, var7, var10);
            this.class_(var1, var6, var5, var7 + 1, var10);
            this.class_(var1, var8, var6 - 1, var9 - 1, var10);
            this.class_(var1, var8, var6 - 1, var9, var10);
            this.class_(var1, var8, var6 - 1, var9 + 1, var10);
            this.break_(var1, var6 - 1, var9, var7, var10);
            this.break_(var1, var6 + 1, var9, var7, var10);
         } else {
            this.class_(var1, var6, var5, var7, var10);
            this.class_(var1, var8, var6, var9, var10);
            this.break_(var1, var6, var9, var7, var10);
         }
      }

      for (co_3 var12 : this.final_) {
         var12.class_(var1, var2, var3, var4);
      }
   }

   public void class_(Oj_1 var1) {
      this.package_ = var1;
   }

   public void class_(Ml_1 var1, int var2, int var3) {
      if (!this.private_.finally_() || this.package_ != null && this.package_.class_()) {
         float var4 = this.package_ == null ? 0.0F : this.package_.byte_();
         cK_2 var5;
         if (var4 >= 1.0F) {
            var5 = cK_2.OBTAINED;
         } else {
            var5 = cK_2.UNOBTAINED;
         }

         this.native_.A().class_(class_);
         this.break_(var1, var2 + this.int_ + 3, var3 + this.new_, this.private_.throws_().break_(), 128 + var5.class_() * 26, 26, 26);
         this.native_.float_().break_(this.private_.byte_(), var2 + this.int_ + 8, var3 + this.new_ + 5);
      }

      for (co_3 var7 : this.final_) {
         var7.class_(var1, var2, var3);
      }
   }

   public boolean break_(int var1, int var2, int var3, int var4) {
      if (!this.private_.finally_() || this.package_ != null && this.package_.class_()) {
         int var5 = var1 + this.int_;
         int var6 = var5 + 26;
         int var7 = var2 + this.new_;
         int var8 = var7 + 26;
         return var3 >= var5 && var3 <= var6 && var4 >= var7 && var4 <= var8;
      } else {
         return false;
      }
   }

   public int throws_() {
      return this.int_;
   }

   public int protected_() {
      return this.new_;
   }
}
