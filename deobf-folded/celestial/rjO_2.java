package celestial;

public class rjO_2 {
   protected final float id_class;
   protected final float id_break;
   protected final float id_byte;

   public float id_byte() {
      return this.id_break;
   }

   public rjO_2(float var1, float var2, float var3) {
      this.id_class = !Float.isInfinite(var1) && !Float.isNaN(var1) ? var1 % 360.0F : 0.0F;
      this.id_break = !Float.isInfinite(var2) && !Float.isNaN(var2) ? var2 % 360.0F : 0.0F;
      this.id_byte = !Float.isInfinite(var3) && !Float.isNaN(var3) ? var3 % 360.0F : 0.0F;
   }

   public rjO_2(rcy_3 var1) {
      this(var1.id_private(0), var1.id_private(1), var1.id_private(2));
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof rjO_2 var2) ? false : this.id_class == var2.id_class && this.id_break == var2.id_break && this.id_byte == var2.id_byte;
   }

   public rcy_3 id_class() {
      rcy_3 var1 = new rcy_3();
      var1.add(rcu_3.id_class(this.id_class));
      var1.add(rcu_3.id_class(this.id_break));
      var1.add(rcu_3.id_class(this.id_byte));
      return var1;
   }

   public float id_break() {
      return this.id_class;
   }

   public float id_protected() {
      return this.id_byte;
   }
}
