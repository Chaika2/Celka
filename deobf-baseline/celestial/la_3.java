package celestial;

public class la_3 implements Comparable<la_3> {
   private final int id_class;
   private final rfH_2 id_break;
   private int id_byte;
   private int id_protected;

   public int id_byte() {
      return this.id_protected;
   }

   public la_3(int var1, rfH_2 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         la_3 var2 = (la_3)var1;
         return this.id_class == var2.id_class;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.id_class);
   }

   public int id_class(la_3 var1) {
      return this.id_byte != var1.id_byte ? Integer.compare(this.id_byte, var1.id_byte) : Integer.compare(this.id_class, var1.id_class);
   }

   public void id_class(int var1) {
      if (var1 > 10) {
         var1 = 10;
      }

      this.id_byte = var1;
   }

   public rfH_2 id_class() {
      return this.id_break;
   }

   public void id_break(int var1) {
      this.id_protected = var1;
   }

   public int id_break() {
      return this.id_byte;
   }
}
