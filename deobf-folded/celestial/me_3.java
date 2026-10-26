package celestial;

class me_3 extends LF {
   me_3(mo_3 var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.id_class = var1;
   }

   @Override
   protected rVi_1 A_() {
      return super.A_().id_break(". ").id_class(new rgn_3("selectWorld.allowCommands.info"));
   }

   @Override
   public rgP_2 C_() {
      return cN_2.id_class(super.C_(), this.id_class.id_char && !this.id_class.id_class);
   }
}
