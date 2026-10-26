package celestial;

class rVY implements rpv_3 {
   private final float id_break;
   private int id_byte;
   private rgc_3 id_protected;
   private boolean id_throws;
   private float id_case;
   private int id_catch;
   private rgc_3 id_private;
   private int id_implements;
   private int id_finally;

   private boolean id_byte() {
      return this.id_byte != -1;
   }

   public rVY(rVj_1 var1, float var2) {
      this.id_class = var1;
      this.id_byte = -1;
      this.id_protected = rgc_3.id_class;
      this.id_catch = -1;
      this.id_private = rgc_3.id_class;
      this.id_break = Math.max(var2, 1.0F);
   }

   public void id_class(int var1) {
      this.id_finally += var1;
   }

   public int id_class() {
      return this.id_byte() ? this.id_byte : this.id_implements;
   }

   private boolean id_class(int var1, rgc_3 var2) {
      this.id_byte = var1;
      this.id_protected = var2;
      return false;
   }

   @Override
   public boolean accept(int var1, rgc_3 var2, int var3) {
      int var4 = var1 + this.id_finally;
      switch (var3) {
         case 10:
            return this.id_class(var4, var2);
         case 32:
            this.id_catch = var4;
            this.id_private = var2;
         default:
            float var5 = this.id_class.id_class.getWidth(var3, var2);
            this.id_case += var5;
            if (this.id_throws && this.id_case > this.id_break) {
               return this.id_catch != -1 ? this.id_class(this.id_catch, this.id_private) : this.id_class(var4, var2);
            } else {
               this.id_throws |= var5 != 0.0F;
               this.id_implements = var4 + Character.charCount(var3);
               return true;
            }
      }
   }

   public rgc_3 id_break() {
      return this.id_protected;
   }
}
