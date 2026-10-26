package celestial;

class Zd_1 extends LF {
   Zd_1(Zx_1 var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7, ZJ var8, rgP_2 var9, rRm_1 var10, String var11) {
      super(var2, var3, var4, var5, var6, var7);
      this.id_class = var8;
      this.id_throws = var9;
      this.id_case = var10;
      this.id_catch = var11;
   }

   @Override
   protected rVi_1 A_() {
      return cN_2.id_class(this.id_throws, this.id_case.id_class()).id_break("\n").id_break(this.id_catch);
   }
}
