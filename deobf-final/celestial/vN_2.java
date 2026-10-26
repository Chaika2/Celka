package celestial;

public interface vN_2 {
   static vN_2 class_(rdn_3 var0) {
      rdb_3 var1 = var0.break_();
      if (var1 == rdy_3.dr) {
         return new vu_3(var0);
      } else {
         return (vN_2)(var1 == rdy_3.xi ? new vc_3(var0) : vz_3.class_);
      }
   }

   rgS_2 class_(int var1);

   int class_();

   default rgS_2 break_(int var1) {
      return var1 >= 0 && var1 < this.class_() ? this.class_(var1) : rgS_2.break_;
   }
}
