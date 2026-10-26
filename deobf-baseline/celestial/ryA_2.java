package celestial;

enum ryA_2 {
   @Override
   public ryF_2 id_class() {
      return BACKWARD;
   }

   @Override
   public rpB_2 id_class(rpB_2 var1) {
      return AXES[Math.floorMod(var1.ordinal() + 1, 3)];
   }

   @Override
   public int id_class(int var1, int var2, int var3, rpB_2 var4) {
      return var4.id_class(var3, var1, var2);
   }
}
