package celestial;

class rhB_2 extends rBI<rOH> {
   public rhB_2(rhP_2 var1) {
      super(var1, rOH.class, 16, false, true, var0 -> !((rOH)var0).sZ());
   }

   @Override
   protected double id_extends() {
      return super.id_extends() * 0.25;
   }
}
