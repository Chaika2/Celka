package celestial;

class rGO extends rGb_1 {
   private float id_byte;
   private float id_protected;
   private float id_throws;
   private float id_case;

   @Override
   public void id_byte() {
      this.id_protected = 5.0F + rGB.id_class(this.id_break).nextFloat() * 10.0F;
      this.id_throws = -4.0F + rGB.id_break(this.id_break).nextFloat() * 9.0F;
      this.id_case = rGB.id_byte(this.id_break).nextBoolean() ? 1.0F : -1.0F;
      this.id_private();
   }

   rGO(rGB var1) {
      super(var1);
      this.id_break = var1;
   }

   @Override
   public boolean id_class() {
      return this.id_break.I_() == null || this.id_break.id_super == rGS.CIRCLE;
   }

   @Override
   public void id_throws() {
      if (rGB.id_protected(this.id_break).nextInt(350) == 0) {
         this.id_throws = -4.0F + rGB.id_throws(this.id_break).nextFloat() * 9.0F;
      }

      if (rGB.id_case(this.id_break).nextInt(250) == 0) {
         this.id_protected++;
         if (this.id_protected > 15.0F) {
            this.id_protected = 5.0F;
            this.id_case = -this.id_case;
         }
      }

      if (rGB.id_catch(this.id_break).nextInt(450) == 0) {
         this.id_byte = rGB.id_private(this.id_break).nextFloat() * 2.0F * (float) Math.PI;
         this.id_private();
      }

      if (this.id_catch()) {
         this.id_private();
      }

      if (this.id_break.id_break.id_byte < this.id_break.re() && !((rYB)this.id_break.id_throws[7]).id_finally(this.id_break.Bs().id_catch(1))) {
         this.id_throws = Math.max(1.0F, this.id_throws);
         this.id_private();
      }

      if (this.id_break.id_break.id_byte > this.id_break.re() && !((rYB)this.id_break.id_throws[7]).id_finally(this.id_break.Bs().id_break(1))) {
         this.id_throws = Math.min(-1.0F, this.id_throws);
         this.id_private();
      }
   }

   private void id_private() {
      if (rfH_2.id_protected.equals(this.id_break.id_protected)) {
         this.id_break.id_protected = this.id_break.Bs();
      }

      this.id_byte = this.id_byte + this.id_case * 15.0F * (float) (Math.PI / 180.0);
      this.id_break.id_break = rjU_2.id_byte(this.id_break.id_protected)
         .id_break(
            (double)(this.id_protected * rfU_2.id_break(this.id_byte)),
            (double)(-4.0F + this.id_throws),
            (double)(this.id_protected * rfU_2.id_class(this.id_byte))
         );
   }
}
