package celestial;

public enum VZ {
   FIRST_PERSON(true, false),
   THIRD_PERSON_BACK(false, false),
   THIRD_PERSON_FRONT(false, true);

   private static final VZ[] field_243189_d = values();
   private boolean field_243190_e;
   private boolean field_243191_f;

   public VZ byte_() {
      return field_243189_d[(this.ordinal() + 1) % field_243189_d.length];
   }

   private VZ(boolean var3, boolean var4) {
      this.field_243190_e = var3;
      this.field_243191_f = var4;
   }

   public boolean class_() {
      return this.field_243190_e;
   }

   public boolean break_() {
      return this.field_243191_f;
   }
}
