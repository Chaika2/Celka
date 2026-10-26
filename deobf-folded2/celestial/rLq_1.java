package celestial;

public class rLq_1 {
   public final int id_class;
   public final int id_break;
   public final int id_byte;
   private final int id_volatile;
   public int id_protected = -1;
   public float id_throws;
   public float id_case;
   public float id_catch;
   public rLq_1 id_private;
   public boolean id_implements;
   public float id_finally;
   public float id_extends;
   public rLp_1 id_native = rLp_1.BLOCKED;

   public rfH_2 id_byte() {
      return new rfH_2(this.id_class, this.id_break, this.id_byte);
   }

   public float id_byte(rLq_1 var1) {
      float var2 = (float)Math.abs(var1.id_class - this.id_class);
      float var3 = (float)Math.abs(var1.id_break - this.id_break);
      float var4 = (float)Math.abs(var1.id_byte - this.id_byte);
      return var2 + var3 + var4;
   }

   public rLq_1(int var1, int var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_volatile = id_break(var1, var2, var3);
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof rLq_1 var2)
         ? false
         : this.id_volatile == var2.id_volatile && this.id_class == var2.id_class && this.id_break == var2.id_break && this.id_byte == var2.id_byte;
   }

   @Override
   public String toString() {
      return "Node{x=" + this.id_class + ", y=" + this.id_break + ", z=" + this.id_byte + "}";
   }

   @Override
   public int hashCode() {
      return this.id_volatile;
   }

   public float id_class(rfH_2 var1) {
      float var2 = (float)Math.abs(var1.b_() - this.id_class);
      float var3 = (float)Math.abs(var1.c_() - this.id_break);
      float var4 = (float)Math.abs(var1.d_() - this.id_byte);
      return var2 + var3 + var4;
   }

   public rLq_1 id_class(int var1, int var2, int var3) {
      rLq_1 var4 = new rLq_1(var1, var2, var3);
      var4.id_protected = this.id_protected;
      var4.id_throws = this.id_throws;
      var4.id_case = this.id_case;
      var4.id_catch = this.id_catch;
      var4.id_private = this.id_private;
      var4.id_implements = this.id_implements;
      var4.id_finally = this.id_finally;
      var4.id_extends = this.id_extends;
      var4.id_native = this.id_native;
      return var4;
   }

   public float id_class(rLq_1 var1) {
      float var2 = (float)(var1.id_class - this.id_class);
      float var3 = (float)(var1.id_break - this.id_break);
      float var4 = (float)(var1.id_byte - this.id_byte);
      return rfU_2.id_byte(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public static rLq_1 id_break(ruu_3 var0) {
      rLq_1 var1 = new rLq_1(var0.readInt(), var0.readInt(), var0.readInt());
      var1.id_finally = var0.readFloat();
      var1.id_extends = var0.readFloat();
      var1.id_implements = var0.readBoolean();
      var1.id_native = rLp_1.values()[var0.readInt()];
      var1.id_catch = var0.readFloat();
      return var1;
   }

   public static int id_break(int var0, int var1, int var2) {
      return var1 & 0xFF | (var0 & 32767) << 8 | (var2 & 32767) << 24 | (var0 < 0 ? Integer.MIN_VALUE : 0) | (var2 < 0 ? 32768 : 0);
   }

   public float id_break(rLq_1 var1) {
      float var2 = (float)(var1.id_class - this.id_class);
      float var3 = (float)(var1.id_break - this.id_break);
      float var4 = (float)(var1.id_byte - this.id_byte);
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public boolean id_protected() {
      return this.id_protected >= 0;
   }
}
