package celestial;

class Zd_1 extends LF {
   Zd_1(Zx_1 var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7, ZJ var8, rgP_2 var9, rRm_1 var10, String var11) {
      super(var2, var3, var4, var5, var6, var7);
      this.class_ = var8;
      this.throws_ = var9;
      this.case_ = var10;
      this.catch_ = var11;
   }

   @Override
   protected rVi_1 A_() {
      return cN_2.class_(this.throws_, this.case_.class_()).break_("\n").break_(this.catch_);
   }
}
