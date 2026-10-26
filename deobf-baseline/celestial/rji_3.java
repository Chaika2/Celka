package celestial;

public class rji_3 {
   public static final rji_3 id_class = new rji_3(0.0F, 0.0F, 0.0F, 0.0F);
   private float id_break;
   private float id_byte;
   private float id_protected;
   private float id_throws;

   public float id_byte() {
      return this.id_protected;
   }

   public rji_3() {
   }

   public rji_3(rje_3 var1) {
      this(var1.id_class(), var1.id_break(), var1.id_byte(), 1.0F);
   }

   public rji_3(float var1, float var2, float var3, float var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rji_3 var2 = (rji_3)var1;
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
      return "[" + this.id_break + ", " + this.id_byte + ", " + this.id_protected + ", " + this.id_throws + "]";
   }

   @Override
   public int hashCode() {
      int var1 = Float.floatToIntBits(this.id_break);
      var1 = 31 * var1 + Float.floatToIntBits(this.id_byte);
      var1 = 31 * var1 + Float.floatToIntBits(this.id_protected);
      return 31 * var1 + Float.floatToIntBits(this.id_throws);
   }

   public void id_class(rjV_2 var1) {
      float var2 = this.id_break;
      float var3 = this.id_byte;
      float var4 = this.id_protected;
      float var5 = this.id_throws;
      this.id_break = var1.id_class * var2 + var1.id_break * var3 + var1.id_byte * var4 + var1.id_protected * var5;
      this.id_byte = var1.id_throws * var2 + var1.id_case * var3 + var1.id_catch * var4 + var1.id_private * var5;
      this.id_protected = var1.id_implements * var2 + var1.id_finally * var3 + var1.id_extends * var4 + var1.id_native * var5;
      this.id_throws = var1.id_volatile * var2 + var1.id_final * var3 + var1.id_package * var4 + var1.id_int * var5;
   }

   public float id_class(rji_3 var1) {
      return this.id_break * var1.id_break + this.id_byte * var1.id_byte + this.id_protected * var1.id_protected + this.id_throws * var1.id_throws;
   }

   public void id_class(rjY_2 var1) {
      rjY_2 var2 = new rjY_2(var1);
      var2.id_class(new rjY_2(this.id_class(), this.id_break(), this.id_byte(), 0.0F));
      rjY_2 var3 = new rjY_2(var1);
      var3.id_throws();
      var2.id_class(var3);
      this.id_class(var2.id_class(), var2.id_break(), var2.id_byte(), this.id_protected());
   }

   public void id_class(rje_3 var1) {
      this.id_break = this.id_break * var1.id_class();
      this.id_byte = this.id_byte * var1.id_break();
      this.id_protected = this.id_protected * var1.id_byte();
   }

   public float id_class() {
      return this.id_break;
   }

   public void id_class(float var1) {
      float var2 = 1.0F / var1;
      this.id_break *= var2;
      this.id_byte *= var2;
      this.id_protected *= var2;
      this.id_throws *= var2;
   }

   public void id_class(float var1, float var2, float var3, float var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
   }

   public float id_break() {
      return this.id_byte;
   }

   public boolean id_throws() {
      float var1 = this.id_break * this.id_break + this.id_byte * this.id_byte + this.id_protected * this.id_protected + this.id_throws * this.id_throws;
      if ((double)var1 < 1.0E-5) {
         return false;
      } else {
         float var2 = rfU_2.id_implements(var1);
         this.id_break *= var2;
         this.id_byte *= var2;
         this.id_protected *= var2;
         this.id_throws *= var2;
         return true;
      }
   }

   public void id_case() {
      this.id_break = this.id_break / this.id_throws;
      this.id_byte = this.id_byte / this.id_throws;
      this.id_protected = this.id_protected / this.id_throws;
      this.id_throws = 1.0F;
   }

   public float id_protected() {
      return this.id_throws;
   }
}
