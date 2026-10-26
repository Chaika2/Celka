package celestial;

public interface ir_3 {
   default boolean class_(is_3 var1, av_3 var2, rjU_2 var3) {
      if (!var1.BM()) {
         return false;
      } else if (var1.BP() && var1.G() && (var1.Bh().isEmpty() ? null : var1.Bh().get(0)) instanceof rhd_3 var5) {
         Float var11 = var5.sO();
         var1.throws_[15] = var11;
         Float var12 = (Float)var1.throws_[15];
         var1.throws_[17] = var12;
         Float var13 = var5.Bo() * 0.5F;
         var1.throws_[16] = var13;
         var1.case_((Float)var1.throws_[15], (Float)var1.throws_[16]);
         Float var14 = (Float)var1.throws_[15];
         var1.private_[23] = var14;
         Float var15 = (Float)var1.throws_[15];
         var1.private_[25] = var15;
         Float var16 = 1.0F;
         var1.throws_[37] = var16;
         Float var17 = var1.sB() * 0.1F;
         var1.private_[29] = var17;
         if (var2.class_ && var2.break_++ > var2.byte_) {
            var2.class_ = false;
         }

         if (var1.Po()) {
            float var6 = this.throws_();
            if (var2.class_) {
               var6 += var6 * 1.15F * rfU_2.class_((float)var2.break_ / (float)var2.byte_ * (float) Math.PI);
            }

            var1.super_(var6);
            this.class_(new rjU_2(0.0, 0.0, 1.0));
            Integer var18 = 0;
            var1.private_[45] = var18;
         } else {
            var1.class_(var1, false);
            var1.byte_(rjU_2.class_);
         }

         return true;
      } else {
         Float var19 = 0.5F;
         var1.throws_[37] = var19;
         Float var20 = 0.02F;
         var1.private_[29] = var20;
         this.class_(var3);
         return false;
      }
   }

   void class_(rjU_2 var1);

   float throws_();

   boolean protected_();
}
