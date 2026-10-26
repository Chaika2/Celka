package celestial;

public class rxH_2 extends rdb_3 implements eU_2, rdS_2 {
   private static final rdn_3 class_ = new rdn_3(rdy_3.dc);

   public rxH_2(rdO_2 var1) {
      super(var1);
      dQ_2.class_(this, rxS_2.class_);
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      rXQ var5 = is_3.finally_(var4);
      rdn_3 var6 = var2.class_(var5);
      if (var6.class_()) {
         var2.class_(var5, var4.implements_());
         var4.throws_(0);
         return rym_3.class_(var4, var1.import_());
      } else {
         return rym_3.protected_(var4);
      }
   }

   @Override
   public String class_(rhd_3 var1, rdn_3 var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < 45; var4++) {
         rdn_3 var5 = ((rhz_3)var1.implements_[1]).extends_(var4);
         if (var5.break_() == rdy_3.dc) {
            var3 += var5.char_();
         }
      }

      return var3 + "";
   }

   @Override
   public boolean class_(rdn_3 var1, rdn_3 var2) {
      return var2.break_() == rdy_3.ko;
   }

   @Override
   public rdn_3 catch_() {
      return class_;
   }

   public static boolean protected_(rdn_3 var0) {
      return var0.catch_() < var0.private_() - 1;
   }
}
