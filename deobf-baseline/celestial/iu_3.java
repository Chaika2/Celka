package celestial;

public class iu_3 extends iJ_2 {
   private final double id_class;
   private final double id_break;

   public iu_3(String var1, double var2, double var4, double var6) {
      super(var1, var2);
      this.id_class = var4;
      this.id_break = var6;
      if (var4 > var6) {
         throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
      } else if (var2 < var4) {
         throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
      } else if (var2 > var6) {
         throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
      }
   }

   @Override
   public double id_class(double var1) {
      return rfU_2.id_class(var1, this.id_class, this.id_break);
   }
}
