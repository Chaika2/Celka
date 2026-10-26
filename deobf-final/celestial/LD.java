package celestial;

class LD extends LF {
   LD(LK var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7, LR var8, Vu_1 var9, rgP_2 var10) {
      super(var2, var3, var4, var5, var6, var7);
      this.class_ = var8;
      this.throws_ = var9;
      this.case_ = var10;
   }

   @Override
   protected rVi_1 A_() {
      return this.throws_.extends_() ? new rgn_3("narrator.controls.unbound", this.case_) : new rgn_3("narrator.controls.bound", this.case_, super.A_());
   }
}
