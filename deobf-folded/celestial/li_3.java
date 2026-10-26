package celestial;

public enum li_3 {
   DOWN(
      new HP(Hr_1.id_case, Hr_1.id_throws, Hr_1.id_class),
      new HP(Hr_1.id_case, Hr_1.id_throws, Hr_1.id_protected),
      new HP(Hr_1.id_byte, Hr_1.id_throws, Hr_1.id_protected),
      new HP(Hr_1.id_byte, Hr_1.id_throws, Hr_1.id_class)
   ),
   UP(
      new HP(Hr_1.id_case, Hr_1.id_break, Hr_1.id_protected),
      new HP(Hr_1.id_case, Hr_1.id_break, Hr_1.id_class),
      new HP(Hr_1.id_byte, Hr_1.id_break, Hr_1.id_class),
      new HP(Hr_1.id_byte, Hr_1.id_break, Hr_1.id_protected)
   ),
   NORTH(
      new HP(Hr_1.id_byte, Hr_1.id_break, Hr_1.id_protected),
      new HP(Hr_1.id_byte, Hr_1.id_throws, Hr_1.id_protected),
      new HP(Hr_1.id_case, Hr_1.id_throws, Hr_1.id_protected),
      new HP(Hr_1.id_case, Hr_1.id_break, Hr_1.id_protected)
   ),
   SOUTH(
      new HP(Hr_1.id_case, Hr_1.id_break, Hr_1.id_class),
      new HP(Hr_1.id_case, Hr_1.id_throws, Hr_1.id_class),
      new HP(Hr_1.id_byte, Hr_1.id_throws, Hr_1.id_class),
      new HP(Hr_1.id_byte, Hr_1.id_break, Hr_1.id_class)
   ),
   WEST(
      new HP(Hr_1.id_case, Hr_1.id_break, Hr_1.id_protected),
      new HP(Hr_1.id_case, Hr_1.id_throws, Hr_1.id_protected),
      new HP(Hr_1.id_case, Hr_1.id_throws, Hr_1.id_class),
      new HP(Hr_1.id_case, Hr_1.id_break, Hr_1.id_class)
   ),
   EAST(
      new HP(Hr_1.id_byte, Hr_1.id_break, Hr_1.id_class),
      new HP(Hr_1.id_byte, Hr_1.id_throws, Hr_1.id_class),
      new HP(Hr_1.id_byte, Hr_1.id_throws, Hr_1.id_protected),
      new HP(Hr_1.id_byte, Hr_1.id_break, Hr_1.id_protected)
   );

   private static final li_3[] FACINGS = rqR_2.id_class(new li_3[6], var0 -> {
      var0[Hr_1.id_throws] = DOWN;
      var0[Hr_1.id_break] = UP;
      var0[Hr_1.id_protected] = NORTH;
      var0[Hr_1.id_class] = SOUTH;
      var0[Hr_1.id_case] = WEST;
      var0[Hr_1.id_byte] = EAST;
   });
   private final HP[] vertexInfos;

   private li_3(HP... var3) {
      this.vertexInfos = var3;
   }

   public HP id_class(int var1) {
      return this.vertexInfos[var1];
   }

   public static li_3 id_class(rpr_3 var0) {
      return FACINGS[var0.id_byte()];
   }
}
