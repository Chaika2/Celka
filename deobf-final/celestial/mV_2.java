package celestial;

class mV_2 extends Lg_1<mV_2> {
   final rYG break_;
   private final rgP_2 byte_;

   public mV_2(mj_3 var1, rYG var2) {
      this.class_ = var1;
      this.break_ = var2;
      rqO_2 var3 = var1.class_.catch_.break_(var2);
      String var4 = "biome." + var3.byte_() + "." + var3.break_();
      if (rgX_2.byte_().break_(var4)) {
         this.byte_ = new rgn_3(var4);
      } else {
         this.byte_ = new rgN_2(var3.toString());
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      ch_3.break_(var1, this.class_.class_.super_, this.byte_, var4 + 5, var3 + 2, 16777215);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (var5 == 0) {
         this.class_.class_(this);
         return true;
      } else {
         return false;
      }
   }
}
