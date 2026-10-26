package celestial;

public final class rRA<T extends rRC<T>> {
   final String id_class;
   private final rRZ id_break;

   public rRZ id_byte() {
      return this.id_break;
   }

   public rRA(String var1, rRZ var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rRA && ((rRA)var1).id_class.equals(this.id_class);
   }

   @Override
   public String toString() {
      return this.id_class;
   }

   @Override
   public int hashCode() {
      return this.id_class.hashCode();
   }

   public String id_class() {
      return this.id_class;
   }

   public String id_break() {
      return "gamerule." + this.id_class;
   }
}
