package celestial;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ux_3 {
   private final Supplier<String> id_class;
   private final Consumer<String> id_break;
   private final Supplier<String> id_byte;
   private final Consumer<String> id_protected;
   private final Predicate<String> id_throws;
   private int id_case;
   private int id_catch;

   private int id_byte(int var1) {
      return rfU_2.id_class(var1, 0, this.id_class.get().length());
   }

   public void id_byte(int var1, boolean var2) {
      this.id_case = this.id_byte(var1);
      this.id_class(var2);
   }

   public static Consumer<String> id_byte(QY var0) {
      return var1 -> id_class(var0, var1);
   }

   private String id_byte(String var1) {
      if (this.id_catch == this.id_case) {
         return var1;
      } else {
         int var2 = Math.min(this.id_case, this.id_catch);
         int var3 = Math.max(this.id_case, this.id_catch);
         String var4 = var1.substring(0, var2) + var1.substring(var3);
         this.id_catch = this.id_case = var2;
         return var4;
      }
   }

   public void id_byte() {
      this.id_protected.accept(this.id_break(this.id_class.get()));
   }

   private void id_byte(boolean var1) {
      this.id_case = this.id_class.get().length();
      this.id_class(var1);
   }

   public ux_3(Supplier<String> var1, Consumer<String> var2, Supplier<String> var3, Consumer<String> var4, Predicate<String> var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_throws();
   }

   public void id_class(int var1, int var2) {
      int var3 = this.id_class.get().length();
      this.id_case = rfU_2.id_class(var1, 0, var3);
      this.id_catch = rfU_2.id_class(var2, 0, var3);
   }

   public static void id_class(QY var0, String var1) {
      ((Qj_1)var0.id_class[23]).id_class(var1);
   }

   public void id_class() {
      String var1 = this.id_class.get();
      this.id_protected.accept(this.id_break(var1));
      this.id_break.accept(this.id_byte(var1));
   }

   public static Supplier<String> id_class(QY var0) {
      return () -> id_break(var0);
   }

   public void id_class(String var1) {
      this.id_class(this.id_class.get(), var1);
   }

   private void id_class(String var1, String var2) {
      if (this.id_catch != this.id_case) {
         var1 = this.id_byte(var1);
      }

      this.id_case = rfU_2.id_class(this.id_case, 0, var1.length());
      String var3 = new StringBuilder(var1).insert(this.id_case, var2).toString();
      if (this.id_throws.test(var3)) {
         this.id_break.accept(var3);
         this.id_catch = this.id_case = Math.min(var3.length(), this.id_case + var2.length());
      }
   }

   public boolean id_class(int var1) {
      if (vm_3.id_private(var1)) {
         this.id_protected();
         return true;
      } else if (vm_3.id_catch(var1)) {
         this.id_byte();
         return true;
      } else if (vm_3.id_case(var1)) {
         this.id_break();
         return true;
      } else if (vm_3.id_throws(var1)) {
         this.id_class();
         return true;
      } else if (var1 == 259) {
         this.id_break(-1);
         return true;
      } else {
         if (var1 == 261) {
            this.id_break(1);
         } else {
            if (var1 == 263) {
               if (vm_3.id_else()) {
                  this.id_break(-1, vm_3.id_synchronized());
               } else {
                  this.id_class(-1, vm_3.id_synchronized());
               }

               return true;
            }

            if (var1 == 262) {
               if (vm_3.id_else()) {
                  this.id_break(1, vm_3.id_synchronized());
               } else {
                  this.id_class(1, vm_3.id_synchronized());
               }

               return true;
            }

            if (var1 == 268) {
               this.id_break(vm_3.id_synchronized());
               return true;
            }

            if (var1 == 269) {
               this.id_byte(vm_3.id_synchronized());
               return true;
            }
         }

         return false;
      }
   }

   public boolean id_class(char var1) {
      if (rqu_3.id_class(var1)) {
         this.id_class(this.id_class.get(), Character.toString(var1));
      }

      return true;
   }

   private void id_class(boolean var1) {
      if (!var1) {
         this.id_catch = this.id_case;
      }
   }

   public void id_class(int var1, boolean var2) {
      this.id_case = rqR_2.id_class(this.id_class.get(), this.id_case, var1);
      this.id_class(var2);
   }

   private void id_break(boolean var1) {
      this.id_case = 0;
      this.id_class(var1);
   }

   public void id_break() {
      this.id_class(this.id_class.get(), this.id_byte.get());
      this.id_catch = this.id_case;
   }

   public void id_break(int var1) {
      String var2 = this.id_class.get();
      if (!var2.isEmpty()) {
         String var3;
         if (this.id_catch != this.id_case) {
            var3 = this.id_byte(var2);
         } else {
            int var4 = rqR_2.id_class(var2, this.id_case, var1);
            int var5 = Math.min(var4, this.id_case);
            int var6 = Math.max(var4, this.id_case);
            var3 = new StringBuilder(var2).delete(var5, var6).toString();
            if (var1 < 0) {
               this.id_catch = this.id_case = var5;
            }
         }

         this.id_break.accept(var3);
      }
   }

   public void id_break(int var1, boolean var2) {
      this.id_case = rVj_1.id_class(this.id_class.get(), var1, this.id_case, true);
      this.id_class(var2);
   }

   public static String id_break(QY var0) {
      return rgF_2.id_class(((Qj_1)var0.id_class[23]).id_class().replaceAll("\\r", ""));
   }

   private String id_break(String var1) {
      int var2 = Math.min(this.id_case, this.id_catch);
      int var3 = Math.max(this.id_case, this.id_catch);
      return var1.substring(var2, var3);
   }

   public void id_throws() {
      this.id_byte(false);
   }

   public int id_catch() {
      return this.id_catch;
   }

   public int id_case() {
      return this.id_case;
   }

   public void id_protected() {
      this.id_catch = 0;
      this.id_case = this.id_class.get().length();
   }

   public boolean id_private() {
      return this.id_case != this.id_catch;
   }
}
