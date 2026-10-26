package celestial;

import com.mojang.bridge.game.Language;

public class jj_3 implements Language, Comparable<jj_3> {
   private final String class_;
   private final String break_;
   private final String byte_;
   private final boolean protected_;

   public jj_3(String var1, String var2, String var3, boolean var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof jj_3) ? false : this.class_.equals(((jj_3)var1).class_);
      }
   }

   @Override
   public String toString() {
      return String.format("%s (%s)", this.byte_, this.break_);
   }

   @Override
   public int hashCode() {
      return this.class_.hashCode();
   }

   public String getName() {
      return this.byte_;
   }

   public int class_(jj_3 var1) {
      return this.class_.compareTo(var1.class_);
   }

   public boolean class_() {
      return this.protected_;
   }

   public String getRegion() {
      return this.break_;
   }

   public String getCode() {
      return this.class_;
   }
}
