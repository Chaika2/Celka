package celestial;

public class rPj_1 extends rPR {
   private final int private_;

   public rPj_1(is_3 var1, int var2) {
      super(var1);
      this.private_ = var2;
   }

   @Override
   public void class_() {
      if (this.protected_) {
         this.protected_ = false;
         is_3 var10000 = this.class_;
         Float var6 = this.class_((Float)this.class_.private_[25], this.private_() + 20.0F, this.break_);
         var10000.private_[25] = var6;
         var10000 = this.class_;
         Float var7 = this.class_((Float)this.class_.throws_[16], this.catch_() + 10.0F, this.byte_);
         var10000.throws_[16] = var7;
      } else {
         if (this.class_.public_().native_()) {
            is_3 var13 = this.class_;
            Float var8 = this.class_((Float)this.class_.throws_[16], 0.0F, 5.0F);
            var13.throws_[16] = var8;
         }

         is_3 var14 = this.class_;
         Float var9 = this.class_((Float)this.class_.private_[25], (Float)this.class_.private_[23], this.break_);
         var14.private_[25] = var9;
      }

      float var1 = rfU_2.catch_((Float)this.class_.private_[25] - (Float)this.class_.private_[23]);
      if (var1 < (float)(-this.private_)) {
         is_3 var15 = this.class_;
         Float var10 = (Float)this.class_.private_[23] - 4.0F;
         var15.private_[23] = var10;
      } else if (var1 > (float)this.private_) {
         is_3 var16 = this.class_;
         Float var11 = (Float)this.class_.private_[23] + 4.0F;
         var16.private_[23] = var11;
      }
   }
}
