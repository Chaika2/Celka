package celestial;

public enum rhQ_2 {
   CAPE(0, "cape"),
   JACKET(1, "jacket"),
   LEFT_SLEEVE(2, "left_sleeve"),
   RIGHT_SLEEVE(3, "right_sleeve"),
   LEFT_PANTS_LEG(4, "left_pants_leg"),
   RIGHT_PANTS_LEG(5, "right_pants_leg"),
   HAT(6, "hat");

   private final int partId;
   private final int partMask;
   private final String partName;
   private final rgP_2 name;

   public rgP_2 id_byte() {
      return this.name;
   }

   private rhQ_2(int var3, String var4) {
      this.partId = var3;
      this.partMask = 1 << var3;
      this.partName = var4;
      this.name = new rgn_3("options.modelPart." + var4);
   }

   public int id_class() {
      return this.partMask;
   }

   public String id_break() {
      return this.partName;
   }
}
