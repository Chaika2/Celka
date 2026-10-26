package celestial;

public final class rjY_2 {
   public static final rjY_2 id_class = new rjY_2(0.0F, 0.0F, 0.0F, 1.0F);
   private float id_break;
   private float id_byte;
   private float id_protected;
   private float id_throws;

   private static float id_byte(float var0) {
      return (float)Math.sin((double)var0);
   }

   public float id_byte() {
      return this.id_protected;
   }

   public rjY_2(float var1, float var2, float var3, float var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
   }

   public rjY_2(rjY_2 var1) {
      this.id_break = var1.id_break;
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_protected;
      this.id_throws = var1.id_throws;
   }

   public rjY_2(float var1, float var2, float var3, boolean var4) {
      if (var4) {
         var1 *= (float) (Math.PI / 180.0);
         var2 *= (float) (Math.PI / 180.0);
         var3 *= (float) (Math.PI / 180.0);
      }

      float var5 = id_byte(0.5F * var1);
      float var6 = id_break(0.5F * var1);
      float var7 = id_byte(0.5F * var2);
      float var8 = id_break(0.5F * var2);
      float var9 = id_byte(0.5F * var3);
      float var10 = id_break(0.5F * var3);
      this.id_break = var5 * var8 * var10 + var6 * var7 * var9;
      this.id_byte = var6 * var7 * var10 - var5 * var8 * var9;
      this.id_protected = var5 * var7 * var10 + var6 * var8 * var9;
      this.id_throws = var6 * var8 * var10 - var5 * var7 * var9;
   }

   public rjY_2(rje_3 var1, float var2, boolean var3) {
      if (var3) {
         var2 *= (float) (Math.PI / 180.0);
      }

      float var4 = id_byte(var2 / 2.0F);
      this.id_break = var1.id_class() * var4;
      this.id_byte = var1.id_break() * var4;
      this.id_protected = var1.id_byte() * var4;
      this.id_throws = id_break(var2 / 2.0F);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rjY_2 var2 = (rjY_2)var1;
         if (Float.compare(var2.id_break, this.id_break) != 0) {
            return false;
         } else if (Float.compare(var2.id_byte, this.id_byte) != 0) {
            return false;
         } else {
            return Float.compare(var2.id_protected, this.id_protected) != 0 ? false : Float.compare(var2.id_throws, this.id_throws) == 0;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Quaternion[").append(this.id_protected()).append(" + ");
      var1.append(this.id_class()).append("i + ");
      var1.append(this.id_break()).append("j + ");
      var1.append(this.id_byte()).append("k]");
      return var1.toString();
   }

   @Override
   public int hashCode() {
      int var1 = Float.floatToIntBits(this.id_break);
      var1 = 31 * var1 + Float.floatToIntBits(this.id_byte);
      var1 = 31 * var1 + Float.floatToIntBits(this.id_protected);
      return 31 * var1 + Float.floatToIntBits(this.id_throws);
   }

   public void id_class(float var1) {
      this.id_break *= var1;
      this.id_byte *= var1;
      this.id_protected *= var1;
      this.id_throws *= var1;
   }

   public void id_class(float var1, float var2, float var3, float var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
   }

   public float id_class() {
      return this.id_break;
   }

   public void id_class(rjY_2 var1) {
      float var2 = this.id_class();
      float var3 = this.id_break();
      float var4 = this.id_byte();
      float var5 = this.id_protected();
      float var6 = var1.id_class();
      float var7 = var1.id_break();
      float var8 = var1.id_byte();
      float var9 = var1.id_protected();
      this.id_break = var5 * var6 + var2 * var9 + var3 * var8 - var4 * var7;
      this.id_byte = var5 * var7 - var2 * var8 + var3 * var9 + var4 * var6;
      this.id_protected = var5 * var8 + var2 * var7 - var3 * var6 + var4 * var9;
      this.id_throws = var5 * var9 - var2 * var6 - var3 * var7 - var4 * var8;
   }

   public float id_break() {
      return this.id_byte;
   }

   private static float id_break(float var0) {
      return (float)Math.cos((double)var0);
   }

   public void id_throws() {
      this.id_break = -this.id_break;
      this.id_byte = -this.id_byte;
      this.id_protected = -this.id_protected;
   }

   public rjY_2 id_catch() {
      return new rjY_2(this);
   }

   public void id_case() {
      float var1 = this.id_class() * this.id_class()
         + this.id_break() * this.id_break()
         + this.id_byte() * this.id_byte()
         + this.id_protected() * this.id_protected();
      if (var1 > 1.0E-6F) {
         float var2 = rfU_2.id_implements(var1);
         this.id_break *= var2;
         this.id_byte *= var2;
         this.id_protected *= var2;
         this.id_throws *= var2;
      } else {
         this.id_break = 0.0F;
         this.id_byte = 0.0F;
         this.id_protected = 0.0F;
         this.id_throws = 0.0F;
      }
   }

   public float id_protected() {
      return this.id_throws;
   }
}
