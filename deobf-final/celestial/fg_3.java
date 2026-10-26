package celestial;

final class fg_3 implements AutoCloseable {
   final fN_2[] break_;

   fg_3(fj_3 var1, fN_2[] var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   fg_3(fj_3 var1, fV_2 var2, int var3) {
      this.class_ = var1;
      this.break_ = new fN_2[var3 + 1];

      for (int var4 = 0; var4 < this.break_.length; var4++) {
         int var5 = var2.break_ >> var4;
         int var6 = var2.byte_ >> var4;
         if (this.break_[var4] == null) {
            this.break_[var4] = new fN_2(var5, var6, false);
         }
      }
   }

   private int class_(int var1, int var2, int var3, int var4) {
      return this.class_.class_[var2]
         .class_(var3 + (this.class_.super_[var1] * this.class_.new_.break_ >> var2), var4 + (this.class_.this_[var1] * this.class_.new_.byte_ >> var2));
   }

   private int class_(double var1, int var3, int var4) {
      return (int)(var1 * (double)var3 + (1.0 - var1) * (double)var4);
   }

   void class_() {
      double var1 = 1.0 - (double)this.class_.throw_ / (double)this.class_.continue_.byte_(this.class_.instanceof_);
      int var3 = this.class_.continue_.protected_(this.class_.instanceof_);
      int var4 = this.class_.continue_.class_() == 0 ? this.class_.native_() : this.class_.continue_.class_();
      int var5 = this.class_.continue_.protected_((this.class_.instanceof_ + 1) % var4);
      if (var3 != var5 && var5 >= 0 && var5 < this.class_.native_()) {
         if (!this.class_.private_) {
            for (int var6 = 0; var6 < this.break_.length; var6++) {
               int var7 = this.class_.new_.break_ >> var6;
               int var8 = this.class_.new_.byte_ >> var6;

               for (int var9 = 0; var9 < var8; var9++) {
                  for (int var10 = 0; var10 < var7; var10++) {
                     int var11 = this.class_(var3, var6, var10, var9);
                     int var12 = this.class_(var5, var6, var10, var9);
                     int var13 = this.class_(var1, var11 >> 16 & 0xFF, var12 >> 16 & 0xFF);
                     int var14 = this.class_(var1, var11 >> 8 & 0xFF, var12 >> 8 & 0xFF);
                     int var15 = this.class_(var1, var11 & 0xFF, var12 & 0xFF);
                     this.break_[var6].class_(var10, var9, var11 & 0xFF000000 | var13 << 16 | var14 << 8 | var15);
                  }
               }
            }
         }

         this.class_.class_(0, 0, this.break_);
      }
   }

   @Override
   public void close() {
      for (fN_2 var4 : this.break_) {
         if (var4 != null) {
            var4.close();
         }
      }
   }
}
