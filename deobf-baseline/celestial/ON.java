package celestial;

class ON extends rrxp_3 implements Ok_1 {
   private final Ok_1 id_class;
   private final Ok_1 id_break;
   private boolean id_byte;

   @Override
   public Ok_1 id_byte(int var1, int var2) {
      this.id_class.id_byte(var1, var2);
      this.id_break.id_byte(var1, var2);
      return this;
   }

   public ON(Ok_1 var1, Ok_1 var2) {
      super(var2);
      if (var1 == var2) {
         throw new IllegalArgumentException("Duplicate delegates");
      } else {
         this.id_class = var1;
         this.id_break = var2;
         this.id_catch();
      }
   }

   @Override
   public void id_class(boolean var1) {
      super.id_class(var1);
      this.id_catch();
   }

   @Override
   public Ok_1 id_class(double var1, double var3, double var5) {
      this.id_class.id_class(var1, var3, var5);
      this.id_break.id_class(var1, var3, var5);
      return this;
   }

   @Override
   public void id_class() {
      this.id_class.id_class();
      this.id_break.id_class();
   }

   @Override
   public void id_class(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      float var12,
      float var13,
      float var14
   ) {
      if (this.id_byte) {
         this.id_class.id_class(var1, var2, var3, var4, var5, var6, var7, var8 / 32.0F, var9 / 32.0F, var10, var11, var12, var13, var14);
      } else {
         this.id_class.id_class(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
      }

      this.id_break.id_class(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
   }

   @Override
   public Ok_1 id_class(float var1, float var2, float var3) {
      this.id_class.id_class(var1, var2, var3);
      this.id_break.id_class(var1, var2, var3);
      return this;
   }

   @Override
   public Ok_1 id_class(int var1) {
      this.id_class.id_class(var1);
      this.id_break.id_class(var1);
      return this;
   }

   @Override
   public Ok_1 id_class(int var1, int var2) {
      this.id_class.id_class(var1, var2);
      this.id_break.id_class(var1, var2);
      return this;
   }

   @Override
   public Ok_1 id_class(float var1, float var2) {
      this.id_class.id_class(var1, var2);
      this.id_break.id_class(var1, var2);
      return this;
   }

   @Override
   public Ok_1 id_break(int var1, int var2, int var3, int var4) {
      this.id_class.id_break(var1, var2, var3, var4);
      this.id_break.id_break(var1, var2, var3, var4);
      return this;
   }

   @Override
   public Ok_1 id_break(int var1, int var2) {
      this.id_class.id_break(var1, var2);
      this.id_break.id_break(var1, var2);
      return this;
   }

   @Override
   public Ok_1 id_throws() {
      return this.id_class;
   }

   private void id_catch() {
      this.id_byte = !this.id_class.id_break() && this.id_break.id_break();
   }
}
