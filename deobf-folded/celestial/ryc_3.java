package celestial;

public class ryc_3 {
   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static rfl_3 id_class(rfl_3 var0, rpr_3 var1, double var2) {
      double var4 = var2 * (double)var1.id_throws().id_class();
      double var6 = Math.min(var4, 0.0);
      double var8 = Math.max(var4, 0.0);
      switch (var1) {
         case WEST:
            return new rfl_3(var0.id_class + var6, var0.id_break, var0.id_byte, var0.id_class + var8, var0.id_throws, var0.id_case);
         case EAST:
            return new rfl_3(var0.id_protected + var6, var0.id_break, var0.id_byte, var0.id_protected + var8, var0.id_throws, var0.id_case);
         case DOWN:
            return new rfl_3(var0.id_class, var0.id_break + var6, var0.id_byte, var0.id_protected, var0.id_break + var8, var0.id_case);
         case UP:
         default:
            return new rfl_3(var0.id_class, var0.id_throws + var6, var0.id_byte, var0.id_protected, var0.id_throws + var8, var0.id_case);
         case NORTH:
            return new rfl_3(var0.id_class, var0.id_break, var0.id_byte + var6, var0.id_protected, var0.id_throws, var0.id_byte + var8);
         case SOUTH:
            return new rfl_3(var0.id_class, var0.id_break, var0.id_case + var6, var0.id_protected, var0.id_throws, var0.id_case + var8);
      }
   }
}
