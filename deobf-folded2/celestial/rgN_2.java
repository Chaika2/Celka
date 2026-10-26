package celestial;

public class rgN_2 extends rgZ_2 {
   public static final rgP_2 id_byte = new rgN_2("");
   private final String id_protected;

   public rgN_2(String var1) {
      this.id_protected = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgN_2 var2) ? false : this.id_protected.equals(var2.id_private()) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "TextComponent{text='" + this.id_protected + "', siblings=" + this.id_case + ", style=" + this.id_class() + "}";
   }

   @Override
   public String id_break() {
      return this.id_protected;
   }

   public rgN_2 id_implements() {
      return new rgN_2(this.id_protected);
   }

   public String id_private() {
      return this.id_protected;
   }
}
