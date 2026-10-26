package celestial;

public class rPV extends rPY {
   private final int implements_;
   private final boolean finally_;

   public rPV(is_3 var1, int var2, boolean var3) {
      super(var1);
      this.implements_ = var2;
      this.finally_ = var3;
   }

   @Override
   public void class_() {
      if (this.private_ == rPo_1.MOVE_TO) {
         this.private_ = rPo_1.WAIT;
         this.class_.finally_(true);
         double var1 = this.break_ - this.class_.rx();
         double var3 = this.byte_ - this.class_.re();
         double var5 = this.protected_ - this.class_.BO();
         double var7 = var1 * var1 + var3 * var3 + var5 * var5;
         if (var7 < 2.5000003E-7F) {
            this.class_.while_(0.0F);
            this.class_.catch_(0.0F);
            return;
         }

         float var9 = (float)(rfU_2.protected_(var5, var1) * 180.0F / (float)Math.PI) - 90.0F;
         is_3 var10000 = this.class_;
         Float var18 = this.class_((Float)this.class_.throws_[15], var9, 90.0F);
         var10000.throws_[15] = var18;
         float var10;
         if (this.class_.BL()) {
            var10 = (float)(this.throws_ * this.class_.class_(iQ_2.protected_));
         } else {
            var10 = (float)(this.throws_ * this.class_.class_(iQ_2.throws_));
         }

         this.class_.super_(var10);
         double var11 = (double)rfU_2.class_(var1 * var1 + var5 * var5);
         float var13 = (float)(-(rfU_2.protected_(var3, var11) * 180.0F / (float)Math.PI));
         var10000 = this.class_;
         Float var19 = this.class_((Float)this.class_.throws_[16], var13, (float)this.implements_);
         var10000.throws_[16] = var19;
         this.class_.while_(var3 > 0.0 ? var10 : -var10);
      } else {
         if (!this.finally_) {
            this.class_.finally_(false);
         }

         this.class_.while_(0.0F);
         this.class_.catch_(0.0F);
      }
   }
}
