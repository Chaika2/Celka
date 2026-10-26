package celestial;

public class rrxz_3 {
   private boolean id_class;
   private int id_break;
   private int id_byte;
   private int id_protected;
   private int id_throws;

   public boolean id_byte() {
      return this.id_class;
   }

   public rrxz_3() {
      this(false, 1, 0);
   }

   public rrxz_3(boolean var1, int var2, int var3) {
      this(var1, var2, var3, var2, var3);
   }

   public rrxz_3(boolean var1, int var2, int var3, int var4, int var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
   }

   public rrxz_3(boolean var1) {
      this(var1, 1, 0);
   }

   @Override
   public String toString() {
      return "enabled: "
         + this.id_class
         + ", src: "
         + this.id_break
         + ", dst: "
         + this.id_byte
         + ", srcAlpha: "
         + this.id_protected
         + ", dstAlpha: "
         + this.id_throws;
   }

   public void id_class(int var1, int var2, int var3, int var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
   }

   public void id_class(int var1, int var2) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var1;
      this.id_throws = var2;
   }

   public void id_class(boolean var1, int var2, int var3, int var4, int var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
   }

   public void id_class(boolean var1) {
      this.id_class = var1;
   }

   public void id_class() {
      this.id_class = true;
   }

   public void id_class(rrxz_3 var1) {
      this.id_class = var1.id_class;
      this.id_break = var1.id_break;
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_protected;
      this.id_throws = var1.id_throws;
   }

   public void id_break() {
      this.id_class = false;
   }

   public int id_throws() {
      return this.id_byte;
   }

   public int id_catch() {
      return this.id_throws;
   }

   public int id_case() {
      return this.id_protected;
   }

   public void id_implements() {
      if (!this.id_class) {
         MT.id_final();
      } else {
         MT.id_package();
         MT.id_break(this.id_break, this.id_byte, this.id_protected, this.id_throws);
      }
   }

   public int id_protected() {
      return this.id_break;
   }

   public boolean id_private() {
      return this.id_break != this.id_protected || this.id_byte != this.id_throws;
   }
}
