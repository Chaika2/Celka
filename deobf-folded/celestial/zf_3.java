package celestial;

public enum zf_3 implements rpH_2 {
   NONE("none"),
   LOW("low"),
   TALL("tall");

   private final String heightName;

   private zf_3(String var3) {
      this.heightName = var3;
   }

   @Override
   public String toString() {
      return this.id_class();
   }

   @Override
   public String id_class() {
      return this.heightName;
   }
}
