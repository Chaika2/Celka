package celestial;

public enum rpZ_2 {
   LEFT(new rgn_3("options.mainHand.left")),
   RIGHT(new rgn_3("options.mainHand.right"));

   private final rgP_2 handName;

   private rpZ_2(rgP_2 var3) {
      this.handName = var3;
   }

   @Override
   public String toString() {
      return this.handName.getString();
   }

   public rpZ_2 class_() {
      return this == LEFT ? RIGHT : LEFT;
   }

   public rgP_2 break_() {
      return this.handName;
   }
}
