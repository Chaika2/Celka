package celestial;

class rGh_1 extends rBk_1 {
   private int id_break;

   @Override
   public void id_byte() {
      this.id_break = 10;
      this.id_class.id_super = rGS.CIRCLE;
      this.id_catch();
   }

   rGh_1(rGB var1) {
      this.id_class = var1;
   }

   @Override
   public boolean id_class() {
      iB_2 var1 = this.id_class.I_();
      return var1 != null ? this.id_class.id_class(this.id_class.I_(), ay_3.id_class) : false;
   }

   @Override
   public void id_throws() {
      if (this.id_class.id_super == rGS.CIRCLE) {
         this.id_break--;
         if (this.id_break <= 0) {
            this.id_class.id_super = rGS.SWOOP;
            this.id_catch();
            this.id_break = (8 + rGB.id_finally(this.id_class).nextInt(4)) * 20;
            this.id_class.id_class(rqn_3.OY, 10.0F, 0.95F + rGB.id_extends(this.id_class).nextFloat() * 0.1F);
         }
      }
   }

   private void id_catch() {
      this.id_class.id_protected = this.id_class.I_().Bs().id_break(20 + rGB.id_native(this.id_class).nextInt(20));
      if (this.id_class.id_protected.c_() < ((rYB)this.id_class.id_throws[7]).id_short()) {
         this.id_class.id_protected = new rfH_2(
            this.id_class.id_protected.b_(), ((rYB)this.id_class.id_throws[7]).id_short() + 1, this.id_class.id_protected.d_()
         );
      }
   }

   @Override
   public void id_protected() {
      this.id_class.id_protected = ((rYB)this.id_class.id_throws[7])
         .id_class(rKv_1.MOTION_BLOCKING, this.id_class.id_protected)
         .id_break(10 + rGB.id_implements(this.id_class).nextInt(20));
   }
}
