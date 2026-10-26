package celestial;

class rMt_1 extends rBP {
   private final rMl_1 id_protected;
   private int id_throws;

   public rMt_1(rMl_1 var1, rMl_1 var2, double var3) {
      super(var2, var3);
      this.id_protected = var2;
   }

   @Override
   public boolean id_class() {
      if (!super.id_class() || this.id_protected.L() != 0) {
         return false;
      } else if (!this.id_private()) {
         if (this.id_throws <= (Integer)this.id_protected.id_throws[41]) {
            this.id_protected.id_else(32);
            this.id_throws = (Integer)this.id_protected.id_throws[41] + 600;
            if (this.id_protected.id_try()) {
               rhd_3 var1 = this.id_break.id_class(rMl_1.id_while, this.id_protected);
               this.id_protected.id_static.id_class(var1);
            }
         }

         return false;
      } else {
         return true;
      }
   }

   private boolean id_private() {
      rfH_2 var1 = this.id_protected.Bs();
      rfw_3 var2 = new rfw_3();

      for (int var3 = 0; var3 < 3; var3++) {
         for (int var4 = 0; var4 < 8; var4++) {
            for (int var5 = 0; var5 <= var4; var5 = var5 > 0 ? -var5 : 1 - var5) {
               for (int var6 = var5 < var4 && var5 > -var4 ? var4 : 0; var6 <= var4; var6 = var6 > 0 ? -var6 : 1 - var6) {
                  var2.id_class(var1, var5, var3, var6);
                  if (this.id_break.id_byte(var2).id_class(xu_3.hs)) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }
}
