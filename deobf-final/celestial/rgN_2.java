package celestial;

public class rgN_2 extends rgZ_2 {
   public static final rgP_2 byte_ = new rgN_2("");
   private final String protected_;

   public rgN_2(String var1) {
      this.protected_ = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgN_2 var2) ? false : this.protected_.equals(var2.private_()) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "TextComponent{text='" + this.protected_ + "', siblings=" + this.case_ + ", style=" + this.class_() + "}";
   }

   @Override
   public String break_() {
      return this.protected_;
   }

   public rgN_2 implements_() {
      return new rgN_2(this.protected_);
   }

   public String private_() {
      return this.protected_;
   }
}
