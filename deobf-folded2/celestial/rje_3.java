package celestial;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

public final class rje_3 {
   public static rje_3 id_class = new rje_3(-1.0F, 0.0F, 0.0F);
   public static rje_3 id_break = new rje_3(1.0F, 0.0F, 0.0F);
   public static rje_3 id_byte = new rje_3(0.0F, -1.0F, 0.0F);
   public static rje_3 id_protected = new rje_3(0.0F, 1.0F, 0.0F);
   public static rje_3 id_throws = new rje_3(0.0F, 0.0F, -1.0F);
   public static rje_3 id_case = new rje_3(0.0F, 0.0F, 1.0F);
   public float id_catch;
   public float id_private;
   public float id_implements;

   public void id_byte(float var1, float var2, float var3) {
      this.id_catch += var1;
      this.id_private += var2;
      this.id_implements += var3;
   }

   public float id_byte() {
      return this.id_implements;
   }

   public rjY_2 id_byte(float var1) {
      return new rjY_2(this, var1, true);
   }

   public float id_byte(rje_3 var1) {
      return this.id_catch * var1.id_catch + this.id_private * var1.id_private + this.id_implements * var1.id_implements;
   }

   public rje_3() {
   }

   public rje_3(float var1, float var2, float var3) {
      this.id_catch = var1;
      this.id_private = var2;
      this.id_implements = var3;
   }

   public rje_3(rjU_2 var1) {
      this((float)var1.id_break, (float)var1.id_byte, (float)var1.id_protected);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rje_3 var2 = (rje_3)var1;
         if (Float.compare(var2.id_catch, this.id_catch) != 0) {
            return false;
         } else {
            return Float.compare(var2.id_private, this.id_private) != 0 ? false : Float.compare(var2.id_implements, this.id_implements) == 0;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "[" + this.id_catch + ", " + this.id_private + ", " + this.id_implements + "]";
   }

   @Override
   public int hashCode() {
      int var1 = Float.floatToIntBits(this.id_catch);
      var1 = 31 * var1 + Float.floatToIntBits(this.id_private);
      return 31 * var1 + Float.floatToIntBits(this.id_implements);
   }

   public float id_class() {
      return this.id_catch;
   }

   public void id_class(rjY_2 var1) {
      rjY_2 var2 = new rjY_2(var1);
      var2.id_class(new rjY_2(this.id_class(), this.id_break(), this.id_byte(), 0.0F));
      rjY_2 var3 = new rjY_2(var1);
      var3.id_throws();
      var2.id_class(var3);
      this.id_break(var2.id_class(), var2.id_break(), var2.id_byte());
   }

   public void id_class(rje_3 var1, float var2) {
      float var3 = 1.0F - var2;
      this.id_catch = this.id_catch * var3 + var1.id_catch * var2;
      this.id_private = this.id_private * var3 + var1.id_private * var2;
      this.id_implements = this.id_implements * var3 + var1.id_implements * var2;
   }

   public void id_class(rjj_3 var1) {
      float var2 = this.id_catch;
      float var3 = this.id_private;
      float var4 = this.id_implements;
      this.id_catch = var1.id_class * var2 + var1.id_break * var3 + var1.id_byte * var4;
      this.id_private = var1.id_protected * var2 + var1.id_throws * var3 + var1.id_case * var4;
      this.id_implements = var1.id_catch * var2 + var1.id_private * var3 + var1.id_implements * var4;
   }

   public void id_class(float var1) {
      this.id_catch *= var1;
      this.id_private *= var1;
      this.id_implements *= var1;
   }

   public void id_class(float var1, float var2, float var3) {
      this.id_catch *= var1;
      this.id_private *= var2;
      this.id_implements *= var3;
   }

   public void id_class(float var1, float var2) {
      this.id_catch = rfU_2.id_class(this.id_catch, var1, var2);
      this.id_private = rfU_2.id_class(this.id_private, var1, var2);
      this.id_implements = rfU_2.id_class(this.id_implements, var1, var2);
   }

   public void id_class(Float2FloatFunction var1) {
      this.id_catch = var1.get(this.id_catch);
      this.id_private = var1.get(this.id_private);
      this.id_implements = var1.get(this.id_implements);
   }

   public void id_class(rje_3 var1) {
      this.id_catch = this.id_catch + var1.id_catch;
      this.id_private = this.id_private + var1.id_private;
      this.id_implements = this.id_implements + var1.id_implements;
   }

   public rjY_2 id_break(float var1) {
      return new rjY_2(this, var1, false);
   }

   public float id_break() {
      return this.id_private;
   }

   public void id_break(float var1, float var2, float var3) {
      this.id_catch = var1;
      this.id_private = var2;
      this.id_implements = var3;
   }

   public void id_break(rje_3 var1) {
      this.id_catch = this.id_catch - var1.id_catch;
      this.id_private = this.id_private - var1.id_private;
      this.id_implements = this.id_implements - var1.id_implements;
   }

   public rje_3 id_throws() {
      return new rje_3(this.id_catch, this.id_private, this.id_implements);
   }

   public rje_3 id_protected(float var1, float var2, float var3) {
      this.id_catch -= var1;
      this.id_private -= var2;
      this.id_implements -= var3;
      return this;
   }

   public boolean id_protected() {
      float var1 = this.id_catch * this.id_catch + this.id_private * this.id_private + this.id_implements * this.id_implements;
      if ((double)var1 < 1.0E-5) {
         return false;
      } else {
         float var2 = rfU_2.id_implements(var1);
         this.id_catch *= var2;
         this.id_private *= var2;
         this.id_implements *= var2;
         return true;
      }
   }

   public void id_protected(rje_3 var1) {
      float var2 = this.id_catch;
      float var3 = this.id_private;
      float var4 = this.id_implements;
      float var5 = var1.id_class();
      float var6 = var1.id_break();
      float var7 = var1.id_byte();
      this.id_catch = var3 * var7 - var4 * var6;
      this.id_private = var4 * var5 - var2 * var7;
      this.id_implements = var2 * var6 - var3 * var5;
   }
}
