package celestial;

public class rky_3 extends rWN {
   private static final rkg_3 id_class = rkg_3.id_class(rdy_3.Xb);
   private static final rkg_3 id_break = rkg_3.id_class(rdy_3.hr);
   private static final rkg_3 id_byte = rkg_3.id_class(rdy_3.du);

   @Override
   public rdn_3 id_byte() {
      return new rdn_3(rdy_3.dc);
   }

   public rky_3(rqO_2 var1) {
      super(var1);
   }

   public rdn_3 id_class(rXk_1 var1) {
      rdn_3 var2 = new rdn_3(rdy_3.dc, 3);
      rcd_3 var3 = var2.id_class("Fireworks");
      rcy_3 var4 = new rcy_3();
      int var5 = 0;

      for (int var6 = 0; var6 < var1.id_else(); var6++) {
         rdn_3 var7 = var1.id_extends(var6);
         if (!var7.id_class()) {
            if (id_break.id_class(var7)) {
               var5++;
            } else if (id_byte.id_class(var7)) {
               rcd_3 var8 = var7.id_break("Explosion");
               if (var8 != null) {
                  var4.add(var8);
               }
            }
         }
      }

      var3.id_class("Flight", (byte)var5);
      if (!var4.isEmpty()) {
         var3.id_class("Explosions", var4);
      }

      return var2;
   }

   public boolean id_class(rXk_1 var1, rYB var2) {
      boolean var3 = false;
      int var4 = 0;

      for (int var5 = 0; var5 < var1.id_else(); var5++) {
         rdn_3 var6 = var1.id_extends(var5);
         if (!var6.id_class()) {
            if (id_class.id_class(var6)) {
               if (var3) {
                  return false;
               }

               var3 = true;
            } else if (id_break.id_class(var6)) {
               if (++var4 > 3) {
                  return false;
               }
            } else if (!id_byte.id_class(var6)) {
               return false;
            }
         }
      }

      return var3 && var4 >= 1;
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.id_catch;
   }
}
