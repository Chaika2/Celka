package celestial;

public class rgC_2 extends IllegalArgumentException {
   public rgC_2(rgn_3 var1, String var2) {
      super(String.format("Error parsing: %s: %s", var1, var2));
   }

   public rgC_2(rgn_3 var1, int var2) {
      super(String.format("Invalid index %d requested for %s", var2, var1));
   }

   public rgC_2(rgn_3 var1, Throwable var2) {
      super(String.format("Error while parsing: %s", var1), var2);
   }
}
