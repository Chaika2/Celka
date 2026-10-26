package celestial;

public class HZ {
   private int class_;
   private int break_;
   private int byte_;
   private int protected_;

   public int byte_() {
      return this.byte_;
   }

   public HZ(int var1, int var2, int var3, int var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   public boolean class_(int var1, int var2) {
      return var1 >= this.class_ && var1 <= this.class_ + this.byte_ && var2 >= this.break_ && var2 <= this.break_ + this.protected_;
   }

   public int class_() {
      return this.class_;
   }

   public int break_() {
      return this.break_;
   }

   public int protected_() {
      return this.protected_;
   }
}
