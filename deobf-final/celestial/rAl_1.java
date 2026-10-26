package celestial;

public enum rAl_1 {
   TOO_OLD("old"),
   TOO_NEW("new"),
   COMPATIBLE("compatible");

   private final rgP_2 description;
   private final rgP_2 confirmMessage;

   public rgP_2 byte_() {
      return this.confirmMessage;
   }

   private rAl_1(String var3) {
      this.description = new rgn_3("pack.incompatible." + var3).class_(rgF_2.GRAY);
      this.confirmMessage = new rgn_3("pack.incompatible.confirm." + var3);
   }

   public static rAl_1 class_(int var0) {
      if (var0 < rqu_3.class_().getPackVersion()) {
         return TOO_OLD;
      } else {
         return var0 > rqu_3.class_().getPackVersion() ? TOO_NEW : COMPATIBLE;
      }
   }

   public boolean class_() {
      return this == COMPATIBLE;
   }

   public rgP_2 break_() {
      return this.description;
   }
}
