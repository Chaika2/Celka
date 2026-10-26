package celestial;

public class rLq_1 {
   public final int class_;
   public final int break_;
   public final int byte_;
   private final int volatile_;
   public int protected_ = -1;
   public float throws_;
   public float case_;
   public float catch_;
   public rLq_1 private_;
   public boolean implements_;
   public float finally_;
   public float extends_;
   public rLp_1 native_ = rLp_1.BLOCKED;

   public rfH_2 byte_() {
      return new rfH_2(this.class_, this.break_, this.byte_);
   }

   public float byte_(rLq_1 var1) {
      float var2 = (float)Math.abs(var1.class_ - this.class_);
      float var3 = (float)Math.abs(var1.break_ - this.break_);
      float var4 = (float)Math.abs(var1.byte_ - this.byte_);
      return var2 + var3 + var4;
   }

   public rLq_1(int var1, int var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.volatile_ = break_(var1, var2, var3);
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof rLq_1 var2)
         ? false
         : this.volatile_ == var2.volatile_ && this.class_ == var2.class_ && this.break_ == var2.break_ && this.byte_ == var2.byte_;
   }

   @Override
   public String toString() {
      return "Node{x=" + this.class_ + ", y=" + this.break_ + ", z=" + this.byte_ + "}";
   }

   @Override
   public int hashCode() {
      return this.volatile_;
   }

   public float class_(rfH_2 var1) {
      float var2 = (float)Math.abs(var1.b_() - this.class_);
      float var3 = (float)Math.abs(var1.c_() - this.break_);
      float var4 = (float)Math.abs(var1.d_() - this.byte_);
      return var2 + var3 + var4;
   }

   public rLq_1 class_(int var1, int var2, int var3) {
      rLq_1 var4 = new rLq_1(var1, var2, var3);
      var4.protected_ = this.protected_;
      var4.throws_ = this.throws_;
      var4.case_ = this.case_;
      var4.catch_ = this.catch_;
      var4.private_ = this.private_;
      var4.implements_ = this.implements_;
      var4.finally_ = this.finally_;
      var4.extends_ = this.extends_;
      var4.native_ = this.native_;
      return var4;
   }

   public float class_(rLq_1 var1) {
      float var2 = (float)(var1.class_ - this.class_);
      float var3 = (float)(var1.break_ - this.break_);
      float var4 = (float)(var1.byte_ - this.byte_);
      return rfU_2.byte_(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public static rLq_1 break_(ruu_3 var0) {
      rLq_1 var1 = new rLq_1(var0.readInt(), var0.readInt(), var0.readInt());
      var1.finally_ = var0.readFloat();
      var1.extends_ = var0.readFloat();
      var1.implements_ = var0.readBoolean();
      var1.native_ = rLp_1.values()[var0.readInt()];
      var1.catch_ = var0.readFloat();
      return var1;
   }

   public static int break_(int var0, int var1, int var2) {
      return var1 & 0xFF | (var0 & 32767) << 8 | (var2 & 32767) << 24 | (var0 < 0 ? Integer.MIN_VALUE : 0) | (var2 < 0 ? 32768 : 0);
   }

   public float break_(rLq_1 var1) {
      float var2 = (float)(var1.class_ - this.class_);
      float var3 = (float)(var1.break_ - this.break_);
      float var4 = (float)(var1.byte_ - this.byte_);
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public boolean protected_() {
      return this.protected_ >= 0;
   }
}
