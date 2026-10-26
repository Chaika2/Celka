package celestial;

public enum rAl_1 {
   TOO_OLD("old"),
   TOO_NEW("new"),
   COMPATIBLE("compatible");

   private final rgP_2 description;
   private final rgP_2 confirmMessage;

   public rgP_2 id_byte() {
      return this.confirmMessage;
   }

   private rAl_1(String var3) {
      this.description = new rgn_3("pack.incompatible." + var3).id_class(rgF_2.GRAY);
      this.confirmMessage = new rgn_3("pack.incompatible.confirm." + var3);
   }

   public static rAl_1 id_class(int var0) {
      if (var0 < rqu_3.id_class().getPackVersion()) {
         return TOO_OLD;
      } else {
         return var0 > rqu_3.id_class().getPackVersion() ? TOO_NEW : COMPATIBLE;
      }
   }

   public boolean id_class() {
      return this == COMPATIBLE;
   }

   public rgP_2 id_break() {
      return this.description;
   }
}
