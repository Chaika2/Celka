package celestial;

class mD_2 extends LF {
   mD_2(mo_3 var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.id_class = var1;
   }

   @Override
   protected rVi_1 A_() {
      return super.A_().id_break(". ").id_class(this.id_class.S).id_break(" ").id_class(this.id_class.s);
   }

   @Override
   public rgP_2 C_() {
      return new rgn_3("options.generic_value", mo_3.id_private, new rgn_3("selectWorld.gameMode." + this.id_class.id_try.field_228217_e_));
   }
}
