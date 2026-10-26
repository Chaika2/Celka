package celestial;

import java.util.Arrays;

public class rrdG {
   private final int id_class;
   private final String id_break;
   private final rrdM id_byte;
   private final rrdG id_protected;
   private rrxf_3[] id_throws;
   private rrxW_2 id_case;
   private rrxz_3 id_catch;
   private rrxz_3[] id_private;
   private rrdj_1 id_implements;
   private final Boolean[] id_finally = new Boolean[16];
   private int id_extends;
   private int id_native;
   private String[] id_volatile;
   private rrxY_2 id_final;
   private rrxY_2 id_package;
   private int id_int;
   private int id_new;
   private final boolean[] id_continue = new boolean[16];
   private rrWz_1 id_super;
   private rrxz_3[] id_this;

   public void id_byte(int var1) {
      this.id_int = var1;
   }

   public void id_byte() {
      this.id_volatile = null;
      this.id_int = 0;
      this.id_new = 0;
      Arrays.fill(this.id_continue, false);
      this.id_super = null;
      this.id_this = null;
      if (this.id_package == null) {
         this.id_package = new rrxY_2(this.id_break, 16, 8);
      }
   }

   public rrxz_3 id_int() {
      return this.id_catch;
   }

   public rrdG(int var1, String var2, rrdM var3, rrdG var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = new rrxf_3[0];
   }

   public rrdG(int var1, String var2, rrdM var3, boolean var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4 ? this : null;
      this.id_throws = new rrxf_3[0];
   }

   @Override
   public String toString() {
      return "name: " + this.id_break + ", id: " + this.id_extends + ", ref: " + this.id_native + ", real: " + this.id_synchronized();
   }

   public Boolean[] id_this() {
      return this.id_finally;
   }

   public void id_class(rrdj_1 var1) {
      this.id_implements = var1;
   }

   public void id_class(int var1, rrxz_3 var2) {
      if (this.id_private == null) {
         this.id_private = new rrxz_3[var1 + 1];
      }

      if (this.id_private.length < var1 + 1) {
         rrxz_3[] var3 = new rrxz_3[var1 + 1];
         System.arraycopy(this.id_private, 0, var3, 0, this.id_private.length);
         this.id_private = var3;
      }

      this.id_private[var1] = var2;
   }

   public void id_class(rrdG var1) {
      this.id_extends = var1.id_private();
      this.id_case = var1.id_package();
      this.id_catch = var1.id_int();
      this.id_private = var1.id_private;
      this.id_implements = var1.id_super();
      System.arraycopy(var1.id_this(), 0, this.id_finally, 0, this.id_finally.length);
      this.id_volatile = var1.id_finally();
      this.id_final = var1.id_extends();
      this.id_int = var1.id_volatile();
      this.id_new = var1.id_final();
      System.arraycopy(var1.id_else(), 0, this.id_continue, 0, this.id_continue.length);
      this.id_this = var1.id_this;
   }

   public void id_class(rrWz_1 var1) {
      this.id_super = var1;
   }

   public void id_class(rrxz_3 var1) {
      this.id_catch = var1;
   }

   public void id_class(rrxW_2 var1) {
      this.id_case = var1;
   }

   public void id_class() {
      this.id_case = null;
      this.id_catch = null;
      this.id_private = null;
      this.id_implements = null;
      Arrays.fill(this.id_finally, null);
   }

   public void id_class(rrxY_2 var1) {
      this.id_final = var1;
   }

   public void id_class(String[] var1) {
      this.id_volatile = var1;
   }

   public void id_class(rrxf_3[] var1) {
      this.id_throws = var1;
   }

   public void id_class(int var1) {
      this.id_extends = var1;
   }

   public void id_break(int var1) {
      this.id_native = var1;
   }

   public void id_break() {
      this.id_extends = 0;
      this.id_native = 0;
   }

   public void id_break(int var1, rrxz_3 var2) {
      if (this.id_this == null) {
         this.id_this = new rrxz_3[var1 + 1];
      }

      if (this.id_this.length < var1 + 1) {
         rrxz_3[] var3 = new rrxz_3[var1 + 1];
         System.arraycopy(this.id_this, 0, var3, 0, this.id_this.length);
         this.id_this = var3;
      }

      this.id_this[var1] = var2;
   }

   public String id_throws() {
      return this.id_break;
   }

   public String[] id_finally() {
      return this.id_volatile;
   }

   public rrdG id_catch() {
      return this.id_protected;
   }

   public rrxY_2 id_extends() {
      return this.id_final;
   }

   public rrxf_3[] id_goto() {
      return this.id_throws;
   }

   public rrdM id_case() {
      return this.id_byte;
   }

   public rrxz_3[] id_continue() {
      return this.id_this;
   }

   public boolean[] id_else() {
      return this.id_continue;
   }

   public int id_implements() {
      return this.id_native;
   }

   public rrxz_3[] id_new() {
      return this.id_private;
   }

   public rrxW_2 id_package() {
      return this.id_case;
   }

   public boolean id_return() {
      return this.id_int != 0;
   }

   public rrdj_1 id_super() {
      return this.id_implements;
   }

   public rrWz_1 id_public() {
      return this.id_super;
   }

   public void id_protected(int var1) {
      this.id_new = var1;
   }

   public int id_protected() {
      return this.id_class;
   }

   public int id_private() {
      return this.id_extends;
   }

   public int id_final() {
      return this.id_new;
   }

   public int id_volatile() {
      return this.id_int;
   }

   public String id_synchronized() {
      if (this.id_extends == 0) {
         return "none";
      } else {
         rrdG var1;
         for (var1 = this; var1.id_implements() != this.id_extends; var1 = var1.id_catch()) {
            if (var1.id_catch() == null || var1.id_catch() == var1) {
               return "unknown";
            }
         }

         return var1.id_throws();
      }
   }

   public rrxY_2 id_native() {
      return this.id_package;
   }
}
