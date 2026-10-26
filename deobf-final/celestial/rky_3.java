package celestial;

public class rky_3 extends rWN {
   private static final rkg_3 class_ = rkg_3.class_(rdy_3.Xb);
   private static final rkg_3 break_ = rkg_3.class_(rdy_3.hr);
   private static final rkg_3 byte_ = rkg_3.class_(rdy_3.du);

   @Override
   public rdn_3 byte_() {
      return new rdn_3(rdy_3.dc);
   }

   public rky_3(rqO_2 var1) {
      super(var1);
   }

   public rdn_3 class_(rXk_1 var1) {
      rdn_3 var2 = new rdn_3(rdy_3.dc, 3);
      rcd_3 var3 = var2.class_("Fireworks");
      rcy_3 var4 = new rcy_3();
      int var5 = 0;

      for (int var6 = 0; var6 < var1.else_(); var6++) {
         rdn_3 var7 = var1.extends_(var6);
         if (!var7.class_()) {
            if (break_.class_(var7)) {
               var5++;
            } else if (byte_.class_(var7)) {
               rcd_3 var8 = var7.break_("Explosion");
               if (var8 != null) {
                  var4.add(var8);
               }
            }
         }
      }

      var3.class_("Flight", (byte)var5);
      if (!var4.isEmpty()) {
         var3.class_("Explosions", var4);
      }

      return var2;
   }

   public boolean class_(rXk_1 var1, rYB var2) {
      boolean var3 = false;
      int var4 = 0;

      for (int var5 = 0; var5 < var1.else_(); var5++) {
         rdn_3 var6 = var1.extends_(var5);
         if (!var6.class_()) {
            if (class_.class_(var6)) {
               if (var3) {
                  return false;
               }

               var3 = true;
            } else if (break_.class_(var6)) {
               if (++var4 > 3) {
                  return false;
               }
            } else if (!byte_.class_(var6)) {
               return false;
            }
         }
      }

      return var3 && var4 >= 1;
   }

   @Override
   public boolean class_(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.catch_;
   }
}
