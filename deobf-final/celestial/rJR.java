package celestial;

public final class rJR implements rJZ {
   private final rgP_2 class_;
   private final rJm_1 break_;

   public rJR(rJm_1 var1, rgP_2 var2) {
      this.break_ = var1;
      this.class_ = var2;
   }

   @Override
   public rgP_2 L_() {
      return this.class_;
   }

   @Override
   public rJr_1 createMenu(int var1, rhz_3 var2, rhd_3 var3) {
      return this.break_.createMenu(var1, var2, var3);
   }
}
