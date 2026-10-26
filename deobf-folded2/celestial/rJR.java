package celestial;

public final class rJR implements rJZ {
   private final rgP_2 id_class;
   private final rJm_1 id_break;

   public rJR(rJm_1 var1, rgP_2 var2) {
      this.id_break = var1;
      this.id_class = var2;
   }

   @Override
   public rgP_2 L_() {
      return this.id_class;
   }

   @Override
   public rJr_1 createMenu(int var1, rhz_3 var2, rhd_3 var3) {
      return this.id_break.createMenu(var1, var2, var3);
   }
}
