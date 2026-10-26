package celestial;

class ZF extends Lu_1 {
   ZF(Zv_1 var1, cm_3 var2, int var3, int var4, int var5, int var6, rgP_2 var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.class_ = var1;
   }

   @Override
   public boolean class_(char var1, int var2) {
      return !this.class_.class_(this.private_(), var1, this.final_()) ? false : super.class_(var1, var2);
   }
}
