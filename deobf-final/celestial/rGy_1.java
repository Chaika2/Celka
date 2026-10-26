package celestial;

class rGy_1 extends rPY {
   private float implements_;
   private int finally_;
   private final rGA extends_;
   private boolean native_;

   public rGy_1(rGA var1) {
      super(var1);
      this.extends_ = var1;
      this.implements_ = 180.0F * (Float)var1.throws_[15] / (float) Math.PI;
   }

   @Override
   public void class_() {
      is_3 var10000 = this.class_;
      Float var5 = this.class_((Float)this.class_.throws_[15], this.implements_, 90.0F);
      var10000.throws_[15] = var5;
      var10000 = this.class_;
      Float var6 = (Float)this.class_.throws_[15];
      var10000.private_[25] = var6;
      var10000 = this.class_;
      Float var7 = (Float)this.class_.throws_[15];
      var10000.private_[23] = var7;
      if (this.private_ != rPo_1.MOVE_TO) {
         this.class_.catch_(0.0F);
      } else {
         this.private_ = rPo_1.WAIT;
         if (this.class_.BL()) {
            this.class_.super_((float)(this.throws_ * this.class_.class_(iQ_2.protected_)));
            if (this.finally_-- <= 0) {
               this.finally_ = this.extends_.implements_();
               if (this.native_) {
                  this.finally_ /= 3;
               }

               this.extends_.else_().class_();
               if (this.extends_.sz()) {
                  this.extends_.class_(this.extends_.sd(), this.extends_.Si(), this.extends_.throws_());
               }
            } else {
               rGA var13 = this.extends_;
               Float var8 = 0.0F;
               var13.private_[42] = var8;
               rGA var14 = this.extends_;
               Float var9 = 0.0F;
               var14.private_[44] = var9;
               this.class_.super_(0.0F);
            }
         } else {
            this.class_.super_((float)(this.throws_ * this.class_.class_(iQ_2.protected_)));
         }
      }
   }

   public void class_(double var1) {
      this.throws_ = var1;
      this.private_ = rPo_1.MOVE_TO;
   }

   public void class_(float var1, boolean var2) {
      this.implements_ = var1;
      this.native_ = var2;
   }
}
