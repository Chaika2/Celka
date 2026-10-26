package celestial;

class VL extends LN {
   VL(VF var1, Qw_1 var2, int var3, int var4, int var5, int var6, VF var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.id_case = var1;
   }

   @Override
   public float id_public() {
      return this.id_case.id_protected();
   }
}
