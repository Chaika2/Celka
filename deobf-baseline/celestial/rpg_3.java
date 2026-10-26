package celestial;

class rpg_3 extends rpj_3 {
   rpg_3(int[] var1, int var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public void id_class(int var1) {
      this.id_class[this.id_break] = var1;
   }

   @Override
   public int id_break() {
      return this.id_class[this.id_break];
   }
}
