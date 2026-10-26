package celestial;

class rOW extends rLA {
   rOW(rOk_1 var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public boolean class_(rfH_2 var1) {
      return this.byte_.byte_(var1).class_(xu_3.instanceof_) || super.class_(var1);
   }

   @Override
   protected boolean class_(rLp_1 var1) {
      return var1 != rLp_1.LAVA && var1 != rLp_1.DAMAGE_FIRE && var1 != rLp_1.DANGER_FIRE ? super.class_(var1) : true;
   }

   @Override
   protected rLl_1 class_(int var1) {
      this.int_ = new rLf_1();
      return new rLl_1(this.int_, var1);
   }
}
