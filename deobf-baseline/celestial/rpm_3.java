package celestial;

public enum rpm_3 {
   MAIN_HAND,
   OFF_HAND;

   public rpm_3 id_class() {
      return this == MAIN_HAND ? OFF_HAND : MAIN_HAND;
   }
}
