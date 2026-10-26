package celestial;

class LU extends LF {
   LU(LK var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7, LR var8, rgP_2 var9) {
      super(var2, var3, var4, var5, var6, var7);
      this.id_class = var8;
      this.id_throws = var9;
   }

   @Override
   protected rVi_1 A_() {
      return new rgn_3("narrator.controls.reset", this.id_throws);
   }
}
