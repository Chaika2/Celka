package celestial;

import it.unimi.dsi.fastutil.ints.IntList;

public class rWO implements rkt_3 {
   private final rqO_2 class_;
   final String break_;
   final rdn_3 byte_;
   final rqs_3<rkg_3> protected_;

   @Override
   public rdn_3 byte_() {
      return this.byte_;
   }

   public rWO(rqO_2 var1, String var2, rdn_3 var3, rqs_3<rkg_3> var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   public boolean class_(rXk_1 var1, rYB var2) {
      rWr_1 var3 = new rWr_1();
      int var4 = 0;

      for (int var5 = 0; var5 < var1.else_(); var5++) {
         rdn_3 var6 = var1.extends_(var5);
         if (!var6.class_()) {
            var4++;
            var3.class_(var6, 1);
         }
      }

      return var4 == this.protected_.size() && var3.class_(this, (IntList)null);
   }

   public rdn_3 class_(rXk_1 var1) {
      return this.byte_.implements_();
   }

   @Override
   public boolean class_(int var1, int var2) {
      return var1 * var2 >= this.protected_.size();
   }

   @Override
   public rqs_3<rkg_3> class_() {
      return this.protected_;
   }

   @Override
   public rqO_2 case_() {
      return this.class_;
   }

   @Override
   public String protected_() {
      return this.break_;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.break_;
   }
}
