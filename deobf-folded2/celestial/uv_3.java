package celestial;

final class uv_3 implements uJ_2 {
   private final float id_class;
   private final fN_2 id_break;
   private final int id_byte;
   private final int id_protected;
   private final int id_throws;
   private final int id_case;
   private final int id_catch;
   private final int id_private;
   float id_implements = 1.0F;

   @Override
   public float id_byte() {
      return 1.0F / this.id_class;
   }

   uv_3(float var1, fN_2 var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = var8;
   }

   @Override
   public void id_class(int var1, int var2) {
      this.id_break.id_class(0, var1, var2, this.id_byte, this.id_protected, this.id_throws, this.id_case, false, false);
   }

   @Override
   public int id_class() {
      return this.id_throws;
   }

   @Override
   public int id_break() {
      return this.id_case;
   }

   @Override
   public float id_case() {
      return this.id_implements;
   }

   @Override
   public boolean id_protected() {
      return this.id_break.id_byte().id_class() > 1;
   }

   @Override
   public float id_native() {
      return uJ_2.super.id_native() + 7.0F - (float)this.id_private;
   }

   @Override
   public float getAdvance() {
      return (float)this.id_catch;
   }
}
