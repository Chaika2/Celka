package celestial;

public enum li_3 {
   DOWN(
      new HP(Hr_1.case_, Hr_1.throws_, Hr_1.class_),
      new HP(Hr_1.case_, Hr_1.throws_, Hr_1.protected_),
      new HP(Hr_1.byte_, Hr_1.throws_, Hr_1.protected_),
      new HP(Hr_1.byte_, Hr_1.throws_, Hr_1.class_)
   ),
   UP(
      new HP(Hr_1.case_, Hr_1.break_, Hr_1.protected_),
      new HP(Hr_1.case_, Hr_1.break_, Hr_1.class_),
      new HP(Hr_1.byte_, Hr_1.break_, Hr_1.class_),
      new HP(Hr_1.byte_, Hr_1.break_, Hr_1.protected_)
   ),
   NORTH(
      new HP(Hr_1.byte_, Hr_1.break_, Hr_1.protected_),
      new HP(Hr_1.byte_, Hr_1.throws_, Hr_1.protected_),
      new HP(Hr_1.case_, Hr_1.throws_, Hr_1.protected_),
      new HP(Hr_1.case_, Hr_1.break_, Hr_1.protected_)
   ),
   SOUTH(
      new HP(Hr_1.case_, Hr_1.break_, Hr_1.class_),
      new HP(Hr_1.case_, Hr_1.throws_, Hr_1.class_),
      new HP(Hr_1.byte_, Hr_1.throws_, Hr_1.class_),
      new HP(Hr_1.byte_, Hr_1.break_, Hr_1.class_)
   ),
   WEST(
      new HP(Hr_1.case_, Hr_1.break_, Hr_1.protected_),
      new HP(Hr_1.case_, Hr_1.throws_, Hr_1.protected_),
      new HP(Hr_1.case_, Hr_1.throws_, Hr_1.class_),
      new HP(Hr_1.case_, Hr_1.break_, Hr_1.class_)
   ),
   EAST(
      new HP(Hr_1.byte_, Hr_1.break_, Hr_1.class_),
      new HP(Hr_1.byte_, Hr_1.throws_, Hr_1.class_),
      new HP(Hr_1.byte_, Hr_1.throws_, Hr_1.protected_),
      new HP(Hr_1.byte_, Hr_1.break_, Hr_1.protected_)
   );

   private static final li_3[] FACINGS = rqR_2.class_(new li_3[6], var0 -> {
      var0[Hr_1.throws_] = DOWN;
      var0[Hr_1.break_] = UP;
      var0[Hr_1.protected_] = NORTH;
      var0[Hr_1.class_] = SOUTH;
      var0[Hr_1.case_] = WEST;
      var0[Hr_1.byte_] = EAST;
   });
   private final HP[] vertexInfos;

   private li_3(HP... var3) {
      this.vertexInfos = var3;
   }

   public HP class_(int var1) {
      return this.vertexInfos[var1];
   }

   public static li_3 class_(rpr_3 var0) {
      return FACINGS[var0.byte_()];
   }
}
