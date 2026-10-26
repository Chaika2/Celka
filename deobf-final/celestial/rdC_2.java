package celestial;

public enum rdC_2 {
   ENCHANTMENTS,
   MODIFIERS,
   UNBREAKABLE,
   CAN_DESTROY,
   CAN_PLACE,
   ADDITIONAL,
   DYE;

   private int field_242396_h = 1 << this.ordinal();

   public int class_() {
      return this.field_242396_h;
   }
}
