package celestial;

import com.google.common.collect.ImmutableList;

public class tl_3<T extends iB_2> extends tX_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_ = new Iq_1(this, 22, 0);

   public tl_3() {
      this.break_.class_(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, 1.0F);
      this.class_ = new Iq_1(this, 22, 0);
      this.class_.implements_ = true;
      this.class_.class_(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, 1.0F);
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = (float) (Math.PI / 12);
      float var8 = (float) (-Math.PI / 12);
      float var9 = 0.0F;
      float var10 = 0.0F;
      if (var1.Sy()) {
         float var11 = 1.0F;
         rjU_2 var12 = var1.rv();
         if (var12.byte_ < 0.0) {
            rjU_2 var13 = var12.protected_();
            var11 = 1.0F - (float)Math.pow(-var13.byte_, 1.5);
         }

         var7 = var11 * (float) (Math.PI / 9) + (1.0F - var11) * var7;
         var8 = var11 * (float) (-Math.PI / 2) + (1.0F - var11) * var8;
      } else if (var1.x()) {
         var7 = (float) Math.PI * 2.0F / 9.0F;
         var8 = (float) (-Math.PI / 4);
         var9 = 3.0F;
         var10 = 0.08726646F;
      }

      this.break_.byte_ = 5.0F;
      this.break_.protected_ = var9;
      if (var1 instanceof cG_2 var21) {
         Float var18 = (float)((double)((Float)var21.class_[2]).floatValue() + (double)(var7 - (Float)var21.class_[2]) * 0.1);
         var21.class_[2] = var18;
         Float var19 = (float)((double)((Float)var21.class_[3]).floatValue() + (double)(var10 - (Float)var21.class_[3]) * 0.1);
         var21.class_[3] = var19;
         Float var20 = (float)((double)((Float)var21.class_[4]).floatValue() + (double)(var8 - (Float)var21.class_[4]) * 0.1);
         var21.class_[4] = var20;
         this.break_.case_ = (Float)var21.class_[2];
         this.break_.catch_ = (Float)var21.class_[3];
         this.break_.private_ = (Float)var21.class_[4];
      } else {
         this.break_.case_ = var7;
         this.break_.private_ = var8;
         this.break_.catch_ = var10;
      }

      this.class_.byte_ = -this.break_.byte_;
      this.class_.catch_ = -this.break_.catch_;
      this.class_.protected_ = this.break_.protected_;
      this.class_.case_ = this.break_.case_;
      this.class_.private_ = -this.break_.private_;
   }

   @Override
   protected Iterable<Iq_1> class_() {
      return ImmutableList.of();
   }

   @Override
   protected Iterable<Iq_1> break_() {
      return ImmutableList.of(this.break_, this.class_);
   }
}
