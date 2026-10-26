package celestial;

class rOW extends rLA {
   rOW(rOk_1 var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public boolean id_class(rfH_2 var1) {
      return this.id_byte.id_byte(var1).id_class(xu_3.id_instanceof) || super.id_class(var1);
   }

   @Override
   protected boolean id_class(rLp_1 var1) {
      return var1 != rLp_1.LAVA && var1 != rLp_1.DAMAGE_FIRE && var1 != rLp_1.DANGER_FIRE ? super.id_class(var1) : true;
   }

   @Override
   protected rLl_1 id_class(int var1) {
      this.id_int = new rLf_1();
      return new rLl_1(this.id_int, var1);
   }
}
