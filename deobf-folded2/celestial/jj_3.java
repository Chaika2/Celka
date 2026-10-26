package celestial;

import com.mojang.bridge.game.Language;

public class jj_3 implements Language, Comparable<jj_3> {
   private final String id_class;
   private final String id_break;
   private final String id_byte;
   private final boolean id_protected;

   public jj_3(String var1, String var2, String var3, boolean var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof jj_3) ? false : this.id_class.equals(((jj_3)var1).id_class);
      }
   }

   @Override
   public String toString() {
      return String.format("%s (%s)", this.id_byte, this.id_break);
   }

   @Override
   public int hashCode() {
      return this.id_class.hashCode();
   }

   public String getName() {
      return this.id_byte;
   }

   public int id_class(jj_3 var1) {
      return this.id_class.compareTo(var1.id_class);
   }

   public boolean id_class() {
      return this.id_protected;
   }

   public String getRegion() {
      return this.id_break;
   }

   public String getCode() {
      return this.id_class;
   }
}
