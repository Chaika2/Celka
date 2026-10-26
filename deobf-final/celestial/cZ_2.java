package celestial;

import com.google.common.collect.Lists;
import java.util.List;

class cZ_2 implements rpv_3 {
   final Hx_1 class_;
   private final boolean byte_;
   private final float protected_;
   private final float throws_;
   private final float case_;
   private final float catch_;
   private final float private_;
   private final rjV_2 implements_;
   private final boolean finally_;
   private final int extends_;
   private float native_;
   private float volatile_;
   private List<uk_3> final_;
   private rgc_3 package_;
   private uG_2 int_;

   public cZ_2(cm_3 var1, Hx_1 var2, float var3, float var4, int var5, boolean var6, rjV_2 var7, boolean var8, int var9) {
      this.break_ = var1;
      this.class_ = var2;
      this.native_ = var3;
      this.volatile_ = var4;
      this.byte_ = var6;
      this.protected_ = var6 ? 0.25F : 1.0F;
      this.throws_ = (float)(var5 >> 16 & 0xFF) / 255.0F * this.protected_;
      this.case_ = (float)(var5 >> 8 & 0xFF) / 255.0F * this.protected_;
      this.catch_ = (float)(var5 & 0xFF) / 255.0F * this.protected_;
      this.private_ = (float)(var5 >> 24 & 0xFF) / 255.0F;
      this.implements_ = var7.break_() ? ud_3.class_ : var7;
      this.finally_ = var8;
      this.extends_ = var9;
   }

   public float class_(int var1, float var2) {
      if (var1 != 0) {
         float var3 = (float)(var1 >> 24 & 0xFF) / 255.0F;
         float var4 = (float)(var1 >> 16 & 0xFF) / 255.0F;
         float var5 = (float)(var1 >> 8 & 0xFF) / 255.0F;
         float var6 = (float)(var1 & 0xFF) / 255.0F;
         this.class_(new uk_3(var2 - 1.0F, this.volatile_ + 9.0F, this.native_ + 1.0F, this.volatile_ - 1.0F, 0.01F, var4, var5, var6, var3));
      }

      if (this.final_ != null) {
         ud_3 var7 = this.break_.class_(rgc_3.break_).class_();
         Ok_1 var8 = this.class_.getBuffer(var7.class_(this.finally_));

         for (uk_3 var10 : this.final_) {
            var7.class_(var10, this.implements_, var8, this.extends_);
         }
      }

      return this.native_;
   }

   private uG_2 class_(rgc_3 var1) {
      if (var1 == this.package_) {
         return this.int_;
      } else {
         this.package_ = var1;
         this.int_ = this.break_.class_(var1.extends_());
         return this.int_;
      }
   }

   private void class_(uk_3 var1) {
      if (this.final_ == null) {
         this.final_ = Lists.newArrayList();
      }

      this.final_.add(var1);
   }

   @Override
   public boolean accept(int var1, rgc_3 var2, int var3) {
      uG_2 var4 = this.class_(var2);
      uX_2 var5 = var4.class_(var3);
      ud_3 var6 = var2.case_() && var3 != 32 ? var4.class_(var5) : var4.break_(var3);
      boolean var7 = var2.break_();
      float var8 = this.private_;
      rVa_1 var9 = var2.class_();
      float var10;
      float var11;
      float var12;
      if (var9 != null) {
         int var13 = var9.class_();
         var10 = (float)(var13 >> 16 & 0xFF) / 255.0F * this.protected_;
         var11 = (float)(var13 >> 8 & 0xFF) / 255.0F * this.protected_;
         var12 = (float)(var13 & 0xFF) / 255.0F * this.protected_;
      } else {
         var10 = this.throws_;
         var11 = this.case_;
         var12 = this.catch_;
      }

      if (!(var6 instanceof uE_2)) {
         float var16 = var7 ? var5.case_() : 0.0F;
         float var14 = this.byte_ ? var5.catch_() : 0.0F;
         Ok_1 var15 = this.class_.getBuffer(var6.class_(this.finally_));
         this.break_
            .class_(
               var6, var7, var2.byte_(), var16, this.native_ + var14, this.volatile_ + var14, this.implements_, var15, var10, var11, var12, var8, this.extends_
            );
      }

      float var17 = var5.class_(var7);
      float var18 = this.byte_ ? 1.0F : 0.0F;
      if (var2.protected_()) {
         this.class_(
            new uk_3(
               this.native_ + var18 - 1.0F,
               this.volatile_ + var18 + 4.5F,
               this.native_ + var18 + var17,
               this.volatile_ + var18 + 4.5F - 1.0F,
               0.01F,
               var10,
               var11,
               var12,
               var8
            )
         );
      }

      if (var2.throws_()) {
         this.class_(
            new uk_3(
               this.native_ + var18 - 1.0F,
               this.volatile_ + var18 + 9.0F,
               this.native_ + var18 + var17,
               this.volatile_ + var18 + 9.0F - 1.0F,
               0.01F,
               var10,
               var11,
               var12,
               var8
            )
         );
      }

      this.native_ += var17;
      return true;
   }
}
