package celestial;

public enum tQ_2 {
   EMPTY(false),
   ITEM(false),
   BLOCK(false),
   BOW_AND_ARROW(true),
   THROW_SPEAR(false),
   CROSSBOW_CHARGE(true),
   CROSSBOW_HOLD(true);

   private final boolean field_241656_h_;

   private tQ_2(boolean var3) {
      this.field_241656_h_ = var3;
   }

   public boolean class_() {
      return this.field_241656_h_;
   }
}
