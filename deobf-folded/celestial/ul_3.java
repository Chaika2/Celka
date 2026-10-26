package celestial;

class ul_3 implements uJ_2 {
   private final int id_class;
   private final int id_break;
   private final int id_byte;
   private final int id_protected;
   private final fN_2 id_throws;

   @Override
   public float id_byte() {
      return 2.0F;
   }

   ul_3(int var1, int var2, int var3, int var4, fN_2 var5) {
      this.id_class = var3;
      this.id_break = var4;
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var5;
   }

   @Override
   public void id_class(int var1, int var2) {
      this.id_throws.id_class(0, var1, var2, this.id_byte, this.id_protected, this.id_class, this.id_break, false, false);
   }

   @Override
   public int id_class() {
      return this.id_class;
   }

   @Override
   public int id_break() {
      return this.id_break;
   }

   @Override
   public float id_catch() {
      return 0.5F;
   }

   @Override
   public float id_case() {
      return 0.5F;
   }

   @Override
   public boolean id_protected() {
      return this.id_throws.id_byte().id_class() > 1;
   }

   @Override
   public float getAdvance() {
      return (float)(this.id_class / 2 + 1);
   }
}
