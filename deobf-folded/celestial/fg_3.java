package celestial;

final class fg_3 implements AutoCloseable {
   final fN_2[] id_break;

   fg_3(fj_3 var1, fN_2[] var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   fg_3(fj_3 var1, fV_2 var2, int var3) {
      this.id_class = var1;
      this.id_break = new fN_2[var3 + 1];

      for (int var4 = 0; var4 < this.id_break.length; var4++) {
         int var5 = var2.id_break >> var4;
         int var6 = var2.id_byte >> var4;
         if (this.id_break[var4] == null) {
            this.id_break[var4] = new fN_2(var5, var6, false);
         }
      }
   }

   private int id_class(int var1, int var2, int var3, int var4) {
      return this.id_class.id_class[var2]
         .id_class(
            var3 + (this.id_class.id_super[var1] * this.id_class.id_new.id_break >> var2),
            var4 + (this.id_class.id_this[var1] * this.id_class.id_new.id_byte >> var2)
         );
   }

   private int id_class(double var1, int var3, int var4) {
      return (int)(var1 * (double)var3 + (1.0 - var1) * (double)var4);
   }

   void id_class() {
      double var1 = 1.0 - (double)this.id_class.id_throw / (double)this.id_class.id_continue.id_byte(this.id_class.id_instanceof);
      int var3 = this.id_class.id_continue.id_protected(this.id_class.id_instanceof);
      int var4 = this.id_class.id_continue.id_class() == 0 ? this.id_class.id_native() : this.id_class.id_continue.id_class();
      int var5 = this.id_class.id_continue.id_protected((this.id_class.id_instanceof + 1) % var4);
      if (var3 != var5 && var5 >= 0 && var5 < this.id_class.id_native()) {
         if (!this.id_class.id_private) {
            for (int var6 = 0; var6 < this.id_break.length; var6++) {
               int var7 = this.id_class.id_new.id_break >> var6;
               int var8 = this.id_class.id_new.id_byte >> var6;

               for (int var9 = 0; var9 < var8; var9++) {
                  for (int var10 = 0; var10 < var7; var10++) {
                     int var11 = this.id_class(var3, var6, var10, var9);
                     int var12 = this.id_class(var5, var6, var10, var9);
                     int var13 = this.id_class(var1, var11 >> 16 & 0xFF, var12 >> 16 & 0xFF);
                     int var14 = this.id_class(var1, var11 >> 8 & 0xFF, var12 >> 8 & 0xFF);
                     int var15 = this.id_class(var1, var11 & 0xFF, var12 & 0xFF);
                     this.id_break[var6].id_class(var10, var9, var11 & 0xFF000000 | var13 << 16 | var14 << 8 | var15);
                  }
               }
            }
         }

         this.id_class.id_class(0, 0, this.id_break);
      }
   }

   @Override
   public void close() {
      for (fN_2 var4 : this.id_break) {
         if (var4 != null) {
            var4.close();
         }
      }
   }
}
