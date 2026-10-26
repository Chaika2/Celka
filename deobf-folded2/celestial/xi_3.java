package celestial;

class xi_3 extends rXA implements rXF {
   private final xc_3 id_class;
   private final rRg_1 id_break;
   private final rfH_2 id_byte;
   private boolean id_protected;

   public xi_3(xc_3 var1, rRg_1 var2, rfH_2 var3) {
      super(1);
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public boolean id_class(int var1, rdn_3 var2, rpr_3 var3) {
      return !this.id_protected && var3 == rpr_3.UP && xU_2.id_final.containsKey(var2.id_break());
   }

   @Override
   public int[] id_class(rpr_3 var1) {
      return var1 == rpr_3.UP ? new int[]{0} : new int[0];
   }

   @Override
   public boolean id_break(int var1, rdn_3 var2, rpr_3 var3) {
      return false;
   }

   @Override
   public void id_break() {
      rdn_3 var1 = this.id_extends(0);
      if (!var1.id_class()) {
         this.id_protected = true;
         xc_3 var2 = xU_2.id_class(this.id_class, this.id_break, this.id_byte, var1);
         this.id_break.id_byte(1500, this.id_byte, var2 != this.id_class ? 1 : 0);
         this.id_native(0);
      }
   }

   @Override
   public int ab_() {
      return 1;
   }
}
