package celestial;

class LD extends LF {
   LD(LK var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7, LR var8, Vu_1 var9, rgP_2 var10) {
      super(var2, var3, var4, var5, var6, var7);
      this.id_class = var8;
      this.id_throws = var9;
      this.id_case = var10;
   }

   @Override
   protected rVi_1 A_() {
      return this.id_throws.id_extends()
         ? new rgn_3("narrator.controls.unbound", this.id_case)
         : new rgn_3("narrator.controls.bound", this.id_case, super.A_());
   }
}
