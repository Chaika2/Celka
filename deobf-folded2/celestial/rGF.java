package celestial;

import java.util.Random;

class rGF extends rBk_1 {
   private final rGZ id_class;
   private int id_break;

   public rGF(rGZ var1) {
      this.id_class = var1;
   }

   @Override
   public boolean id_class() {
      return this.id_break > 0;
   }

   @Override
   public void id_throws() {
      this.id_break--;
      if (this.id_break <= 0) {
         rYB var1 = (rYB)this.id_class.id_throws[7];
         Random var2 = this.id_class.Sa();
         rfH_2 var3 = this.id_class.Bs();

         for (int var4 = 0; var4 <= 5 && var4 >= -5; var4 = (var4 <= 0 ? 1 : 0) - var4) {
            for (int var5 = 0; var5 <= 10 && var5 >= -10; var5 = (var5 <= 0 ? 1 : 0) - var5) {
               for (int var6 = 0; var6 <= 10 && var6 >= -10; var6 = (var6 <= 0 ? 1 : 0) - var6) {
                  rfH_2 var7 = var3.id_break(var5, var4, var6);
                  xc_3 var8 = var1.id_byte(var7);
                  xd_3 var9 = var8.id_break();
                  if (var9 instanceof WT) {
                     if (var1.B().id_break(rRu_1.id_break)) {
                        var1.id_class(var7, true, this.id_class);
                     } else {
                        var1.id_class(var7, ((WT)var9).id_break().id_continue(), 3);
                     }

                     if (var2.nextBoolean()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public void id_catch() {
      if (this.id_break == 0) {
         this.id_break = 20;
      }
   }
}
