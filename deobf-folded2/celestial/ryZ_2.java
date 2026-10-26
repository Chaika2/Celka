package celestial;

public enum ryZ_2 {
   SUCCESS,
   CONSUME,
   PASS,
   FAIL;

   public boolean id_byte() {
      return this == CONSUME;
   }

   public static ryZ_2 id_class(boolean var0) {
      return var0 ? SUCCESS : CONSUME;
   }

   public boolean id_class() {
      return this == SUCCESS || this == CONSUME;
   }

   public boolean id_break() {
      return this == SUCCESS;
   }
}
