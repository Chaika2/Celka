package celestial;

class Hl_1 extends Hn_1 {
   private final boolean S;

   public Hl_1(String var1, Runnable var2, Runnable var3, boolean var4) {
      super(var1, var2, var3);
      this.S = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Hl_1 var2 = (Hl_1)var1;
         return this.S == var2.S;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.id_class + "[" + this.S + "]";
   }

   @Override
   public int hashCode() {
      return Boolean.hashCode(this.S);
   }
}
