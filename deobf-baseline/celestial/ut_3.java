package celestial;

public record ut_3() {
   private final int id_class;
   private final int id_break;

   public ut_3(int var1, int var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static ut_3 id_class(uy_3 var0, int var1, int var2) {
      return switch (var0) {
         case HORIZONTAL -> new ut_3(var1, var2);
         case VERTICAL -> new ut_3(var2, var1);
      };
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public ut_3 id_class(uq_3 var1) {
      return switch (var1) {
         case DOWN -> new ut_3(this.id_class, this.id_break + 1);
         case UP -> new ut_3(this.id_class, this.id_break - 1);
         case LEFT -> new ut_3(this.id_class - 1, this.id_break);
         case RIGHT -> new ut_3(this.id_class + 1, this.id_break);
      };
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int id_class(uy_3 var1) {
      return switch (var1) {
         case HORIZONTAL -> this.id_class;
         case VERTICAL -> this.id_break;
      };
   }
}
