package celestial;

enum ryA_2 {
   ;
   @Override
   public ryF_2 class_() {
      return BACKWARD;
   }

   @Override
   public rpB_2 class_(rpB_2 var1) {
      return AXES[Math.floorMod(var1.ordinal() + 1, 3)];
   }

   @Override
   public int class_(int var1, int var2, int var3, rpB_2 var4) {
      return var4.class_(var3, var1, var2);
   }
}
