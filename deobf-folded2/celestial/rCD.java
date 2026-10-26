package celestial;

public enum rCD implements rpH_2 {
   SAVE("save"),
   LOAD("load"),
   CORNER("corner"),
   DATA("data");

   private final String name;
   private final rgP_2 field_242702_f;

   private rCD(String var3) {
      this.name = var3;
      this.field_242702_f = new rgn_3("structure_block.mode_info." + var3);
   }

   @Override
   public String id_class() {
      return this.name;
   }

   public rgP_2 id_break() {
      return this.field_242702_f;
   }
}
