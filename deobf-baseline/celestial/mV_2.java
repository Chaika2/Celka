package celestial;

class mV_2 extends Lg_1<mV_2> {
   final rYG id_break;
   private final rgP_2 id_byte;

   public mV_2(mj_3 var1, rYG var2) {
      this.id_class = var1;
      this.id_break = var2;
      rqO_2 var3 = var1.id_class.id_catch.id_break(var2);
      String var4 = "biome." + var3.id_byte() + "." + var3.id_break();
      if (rgX_2.id_byte().id_break(var4)) {
         this.id_byte = new rgn_3(var4);
      } else {
         this.id_byte = new rgN_2(var3.toString());
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      ch_3.id_break(var1, this.id_class.id_class.id_super, this.id_byte, var4 + 5, var3 + 2, 16777215);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (var5 == 0) {
         this.id_class.id_class(this);
         return true;
      } else {
         return false;
      }
   }
}
