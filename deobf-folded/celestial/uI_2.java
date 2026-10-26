package celestial;

import javax.annotation.Nullable;

public record uI_2() {
   private final ut_3 id_class;
   private final int id_break;
   private final int id_byte;
   private static final uI_2 id_protected = new uI_2(0, 0, 0, 0);

   public uI_2 id_byte(uq_3 var1) {
      int var2 = this.id_break(var1);
      uy_3 var3 = var1.id_class().id_class();
      int var4 = this.id_break(var3.id_byte());
      int var5 = this.id_class(var3);
      return id_class(var1.id_class(), var2, var4, 1, var5).id_class(var1);
   }

   public int id_byte() {
      return this.id_class.id_break() + this.id_byte;
   }

   public uI_2(int var1, int var2, int var3, int var4) {
      this(new ut_3(var1, var2), var3, var4);
   }

   public uI_2(ut_3 var1, int var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public boolean id_class(int var1, int var2) {
      return var1 >= this.id_protected() && var1 < this.id_throws() && var2 >= this.id_break() && var2 < this.id_byte();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static uI_2 id_class(uy_3 var0, int var1, int var2, int var3, int var4) {
      return switch (var0) {
         case HORIZONTAL -> new uI_2(var1, var2, var3, var4);
         case VERTICAL -> new uI_2(var2, var1, var4, var3);
      };
   }

   public static uI_2 id_class() {
      return id_protected;
   }

   public uI_2 id_class(uq_3 var1) {
      return new uI_2(this.id_class.id_class(var1), this.id_break, this.id_byte);
   }

   public boolean id_class(uI_2 var1) {
      return this.id_class(var1, uy_3.HORIZONTAL) && this.id_class(var1, uy_3.VERTICAL);
   }

   public boolean id_class(uI_2 var1, uy_3 var2) {
      int var3 = this.id_break(var2.id_byte());
      int var4 = var1.id_break(var2.id_byte());
      int var5 = this.id_break(var2.id_break());
      int var6 = var1.id_break(var2.id_break());
      return Math.max(var3, var4) <= Math.min(var5, var6);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int id_class(uy_3 var1) {
      return switch (var1) {
         case HORIZONTAL -> this.id_break;
         case VERTICAL -> this.id_byte;
      };
   }

   public int id_break(uy_3 var1) {
      return (this.id_break(var1.id_break()) + this.id_break(var1.id_byte())) / 2;
   }

   @Nullable
   public uI_2 id_break(uI_2 var1) {
      int var2 = Math.max(this.id_protected(), var1.id_protected());
      int var3 = Math.max(this.id_break(), var1.id_break());
      int var4 = Math.min(this.id_throws(), var1.id_throws());
      int var5 = Math.min(this.id_byte(), var1.id_byte());
      return var2 < var4 && var3 < var5 ? new uI_2(var2, var3, var4 - var2, var5 - var3) : null;
   }

   public int id_break() {
      return this.id_class.id_break();
   }

   public int id_break(uq_3 var1) {
      uy_3 var2 = var1.id_class();
      return var1.id_byte() ? this.id_class.id_class(var2) + this.id_class(var2) - 1 : this.id_class.id_class(var2);
   }

   public int id_throws() {
      return this.id_class.id_class() + this.id_break;
   }

   public int id_catch() {
      return this.id_break;
   }

   public ut_3 id_case() {
      return this.id_class;
   }

   public int id_protected() {
      return this.id_class.id_class();
   }

   public int id_private() {
      return this.id_byte;
   }
}
