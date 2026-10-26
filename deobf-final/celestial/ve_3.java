package celestial;

class ve_3 extends LF {
   ve_3(vK_2 var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7, mo_3 var8) {
      super(var2, var3, var4, var5, var6, var7);
      this.throws_ = var1;
      this.class_ = var8;
   }

   @Override
   public rgP_2 C_() {
      return cN_2.class_(super.C_(), this.throws_.package_.byte_() && !this.class_.class_);
   }
}
