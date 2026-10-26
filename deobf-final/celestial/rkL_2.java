package celestial;

public class rkL_2 extends rWN {
   public rkL_2(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean class_(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   public boolean class_(rXk_1 var1, rYB var2) {
      rxL_2 var3 = null;
      rdn_3 var4 = null;
      rdn_3 var5 = null;

      for (int var6 = 0; var6 < var1.else_(); var6++) {
         rdn_3 var7 = var1.extends_(var6);
         rdb_3 var8 = var7.break_();
         if (var8 instanceof rxO_2) {
            rxO_2 var9 = (rxO_2)var8;
            if (var3 == null) {
               var3 = var9.byte_();
            } else if (var3 != var9.byte_()) {
               return false;
            }

            int var10 = rHb_1.break_(var7);
            if (var10 > 6) {
               return false;
            }

            if (var10 > 0) {
               if (var4 != null) {
                  return false;
               }

               var4 = var7;
            } else {
               if (var5 != null) {
                  return false;
               }

               var5 = var7;
            }
         }
      }

      return var4 != null && var5 != null;
   }

   public rdn_3 class_(rXk_1 var1) {
      for (int var2 = 0; var2 < var1.else_(); var2++) {
         rdn_3 var3 = var1.extends_(var2);
         if (!var3.class_()) {
            int var4 = rHb_1.break_(var3);
            if (var4 > 0 && var4 <= 6) {
               rdn_3 var5 = var3.implements_();
               var5.throws_(1);
               return var5;
            }
         }
      }

      return rdn_3.break_;
   }

   public rqs_3<rdn_3> break_(rXk_1 var1) {
      rqs_3 var2 = rqs_3.class_(var1.else_(), rdn_3.break_);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         rdn_3 var4 = var1.extends_(var3);
         if (!var4.class_()) {
            if (var4.break_().int_()) {
               var2.set(var3, new rdn_3(var4.break_().package_()));
            } else if (var4.final_() && rHb_1.break_(var4) > 0) {
               rdn_3 var5 = var4.implements_();
               var5.throws_(1);
               var2.set(var3, var5);
            }
         }
      }

      return var2;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.extends_;
   }
}
