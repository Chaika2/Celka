package celestial;

import javax.annotation.Nullable;

public record uI_2() {
   private final ut_3 class_;
   private final int break_;
   private final int byte_;
   private static final uI_2 protected_ = new uI_2(0, 0, 0, 0);

   public uI_2 byte_(uq_3 var1) {
      int var2 = this.break_(var1);
      uy_3 var3 = var1.class_().class_();
      int var4 = this.break_(var3.byte_());
      int var5 = this.class_(var3);
      return class_(var1.class_(), var2, var4, 1, var5).class_(var1);
   }

   public int byte_() {
      return this.class_.break_() + this.byte_;
   }

   public uI_2(int var1, int var2, int var3, int var4) {
      this(new ut_3(var1, var2), var3, var4);
   }

   public uI_2(ut_3 var1, int var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public boolean class_(int var1, int var2) {
      return var1 >= this.protected_() && var1 < this.throws_() && var2 >= this.break_() && var2 < this.byte_();
   }

   public static uI_2 class_(uy_3 var0, int var1, int var2, int var3, int var4) {
      return switch (var0) {
         case HORIZONTAL -> new uI_2(var1, var2, var3, var4);
         case VERTICAL -> new uI_2(var2, var1, var4, var3);
      };
   }

   public static uI_2 class_() {
      return protected_;
   }

   public uI_2 class_(uq_3 var1) {
      return new uI_2(this.class_.class_(var1), this.break_, this.byte_);
   }

   public boolean class_(uI_2 var1) {
      return this.class_(var1, uy_3.HORIZONTAL) && this.class_(var1, uy_3.VERTICAL);
   }

   public boolean class_(uI_2 var1, uy_3 var2) {
      int var3 = this.break_(var2.byte_());
      int var4 = var1.break_(var2.byte_());
      int var5 = this.break_(var2.break_());
      int var6 = var1.break_(var2.break_());
      return Math.max(var3, var4) <= Math.min(var5, var6);
   }

   public int class_(uy_3 var1) {
      return switch (var1) {
         case HORIZONTAL -> this.break_;
         case VERTICAL -> this.byte_;
      };
   }

   public int break_(uy_3 var1) {
      return (this.break_(var1.break_()) + this.break_(var1.byte_())) / 2;
   }

   @Nullable
   public uI_2 break_(uI_2 var1) {
      int var2 = Math.max(this.protected_(), var1.protected_());
      int var3 = Math.max(this.break_(), var1.break_());
      int var4 = Math.min(this.throws_(), var1.throws_());
      int var5 = Math.min(this.byte_(), var1.byte_());
      return var2 < var4 && var3 < var5 ? new uI_2(var2, var3, var4 - var2, var5 - var3) : null;
   }

   public int break_() {
      return this.class_.break_();
   }

   public int break_(uq_3 var1) {
      uy_3 var2 = var1.class_();
      return var1.byte_() ? this.class_.class_(var2) + this.class_(var2) - 1 : this.class_.class_(var2);
   }

   public int throws_() {
      return this.class_.class_() + this.break_;
   }

   public int catch_() {
      return this.break_;
   }

   public ut_3 case_() {
      return this.class_;
   }

   public int protected_() {
      return this.class_.class_();
   }

   public int private_() {
      return this.byte_;
   }
}
