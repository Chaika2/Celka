package celestial;

public enum rtX_2 {
   DOWN(rtx_3.NEGATIVE, rtJ_2.Y),
   UP(rtx_3.POSITIVE, rtJ_2.Y),
   NORTH(rtx_3.NEGATIVE, rtJ_2.Z),
   SOUTH(rtx_3.POSITIVE, rtJ_2.Z),
   WEST(rtx_3.NEGATIVE, rtJ_2.X),
   EAST(rtx_3.POSITIVE, rtJ_2.X);

   private final rtJ_2 axis;
   private final rtx_3 axisDirection;

   private rtX_2(rtx_3 var3, rtJ_2 var4) {
      this.axis = var4;
      this.axisDirection = var3;
   }

   public rtx_3 class_() {
      return this.axisDirection;
   }

   public rtJ_2 break_() {
      return this.axis;
   }
}
