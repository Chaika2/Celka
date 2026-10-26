package celestial;

public enum ryZ_2 {
   SUCCESS,
   CONSUME,
   PASS,
   FAIL;

   public boolean byte_() {
      return this == CONSUME;
   }

   public static ryZ_2 class_(boolean var0) {
      return var0 ? SUCCESS : CONSUME;
   }

   public boolean class_() {
      return this == SUCCESS || this == CONSUME;
   }

   public boolean break_() {
      return this == SUCCESS;
   }
}
