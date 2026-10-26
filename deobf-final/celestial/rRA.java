package celestial;

public final class rRA<T extends rRC<T>> {
   final String class_;
   private final rRZ break_;

   public rRZ byte_() {
      return this.break_;
   }

   public rRA(String var1, rRZ var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rRA && ((rRA)var1).class_.equals(this.class_);
   }

   @Override
   public String toString() {
      return this.class_;
   }

   @Override
   public int hashCode() {
      return this.class_.hashCode();
   }

   public String class_() {
      return this.class_;
   }

   public String break_() {
      return "gamerule." + this.class_;
   }
}
