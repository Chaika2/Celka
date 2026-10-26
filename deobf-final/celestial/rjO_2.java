package celestial;

public class rjO_2 {
   protected final float class_;
   protected final float break_;
   protected final float byte_;

   public float byte_() {
      return this.break_;
   }

   public rjO_2(float var1, float var2, float var3) {
      this.class_ = !Float.isInfinite(var1) && !Float.isNaN(var1) ? var1 % 360.0F : 0.0F;
      this.break_ = !Float.isInfinite(var2) && !Float.isNaN(var2) ? var2 % 360.0F : 0.0F;
      this.byte_ = !Float.isInfinite(var3) && !Float.isNaN(var3) ? var3 % 360.0F : 0.0F;
   }

   public rjO_2(rcy_3 var1) {
      this(var1.private_(0), var1.private_(1), var1.private_(2));
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof rjO_2 var2) ? false : this.class_ == var2.class_ && this.break_ == var2.break_ && this.byte_ == var2.byte_;
   }

   public rcy_3 class_() {
      rcy_3 var1 = new rcy_3();
      var1.add(rcu_3.class_(this.class_));
      var1.add(rcu_3.class_(this.break_));
      var1.add(rcu_3.class_(this.byte_));
      return var1;
   }

   public float break_() {
      return this.class_;
   }

   public float protected_() {
      return this.byte_;
   }
}
