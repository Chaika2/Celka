package celestial;

class ON extends rrxp_3 implements Ok_1 {
   private final Ok_1 class_;
   private final Ok_1 break_;
   private boolean byte_;

   @Override
   public Ok_1 byte_(int var1, int var2) {
      this.class_.byte_(var1, var2);
      this.break_.byte_(var1, var2);
      return this;
   }

   public ON(Ok_1 var1, Ok_1 var2) {
      super(var2);
      if (var1 == var2) {
         throw new IllegalArgumentException("Duplicate delegates");
      } else {
         this.class_ = var1;
         this.break_ = var2;
         this.catch_();
      }
   }

   @Override
   public void class_(boolean var1) {
      super.class_(var1);
      this.catch_();
   }

   @Override
   public Ok_1 class_(double var1, double var3, double var5) {
      this.class_.class_(var1, var3, var5);
      this.break_.class_(var1, var3, var5);
      return this;
   }

   @Override
   public void class_() {
      this.class_.class_();
      this.break_.class_();
   }

   @Override
   public void class_(
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
      if (this.byte_) {
         this.class_.class_(var1, var2, var3, var4, var5, var6, var7, var8 / 32.0F, var9 / 32.0F, var10, var11, var12, var13, var14);
      } else {
         this.class_.class_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
      }

      this.break_.class_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
   }

   @Override
   public Ok_1 class_(float var1, float var2, float var3) {
      this.class_.class_(var1, var2, var3);
      this.break_.class_(var1, var2, var3);
      return this;
   }

   @Override
   public Ok_1 class_(int var1) {
      this.class_.class_(var1);
      this.break_.class_(var1);
      return this;
   }

   @Override
   public Ok_1 class_(int var1, int var2) {
      this.class_.class_(var1, var2);
      this.break_.class_(var1, var2);
      return this;
   }

   @Override
   public Ok_1 class_(float var1, float var2) {
      this.class_.class_(var1, var2);
      this.break_.class_(var1, var2);
      return this;
   }

   @Override
   public Ok_1 break_(int var1, int var2, int var3, int var4) {
      this.class_.break_(var1, var2, var3, var4);
      this.break_.break_(var1, var2, var3, var4);
      return this;
   }

   @Override
   public Ok_1 break_(int var1, int var2) {
      this.class_.break_(var1, var2);
      this.break_.break_(var1, var2);
      return this;
   }

   @Override
   public Ok_1 throws_() {
      return this.class_;
   }

   private void catch_() {
      this.byte_ = !this.class_.break_() && this.break_.break_();
   }
}
