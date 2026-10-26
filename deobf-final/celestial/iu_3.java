package celestial;

public class iu_3 extends iJ_2 {
   private final double class_;
   private final double break_;

   public iu_3(String var1, double var2, double var4, double var6) {
      super(var1, var2);
      this.class_ = var4;
      this.break_ = var6;
      if (var4 > var6) {
         throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
      } else if (var2 < var4) {
         throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
      } else if (var2 > var6) {
         throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
      }
   }

   @Override
   public double class_(double var1) {
      return rfU_2.class_(var1, this.class_, this.break_);
   }
}
