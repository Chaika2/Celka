package celestial;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ux_3 {
   private final Supplier<String> class_;
   private final Consumer<String> break_;
   private final Supplier<String> byte_;
   private final Consumer<String> protected_;
   private final Predicate<String> throws_;
   private int case_;
   private int catch_;

   private int byte_(int var1) {
      return rfU_2.class_(var1, 0, this.class_.get().length());
   }

   public void byte_(int var1, boolean var2) {
      this.case_ = this.byte_(var1);
      this.class_(var2);
   }

   public static Consumer<String> byte_(QY var0) {
      return var1 -> class_(var0, var1);
   }

   private String byte_(String var1) {
      if (this.catch_ == this.case_) {
         return var1;
      } else {
         int var2 = Math.min(this.case_, this.catch_);
         int var3 = Math.max(this.case_, this.catch_);
         String var4 = var1.substring(0, var2) + var1.substring(var3);
         this.catch_ = this.case_ = var2;
         return var4;
      }
   }

   public void byte_() {
      this.protected_.accept(this.break_(this.class_.get()));
   }

   private void byte_(boolean var1) {
      this.case_ = this.class_.get().length();
      this.class_(var1);
   }

   public ux_3(Supplier<String> var1, Consumer<String> var2, Supplier<String> var3, Consumer<String> var4, Predicate<String> var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.throws_();
   }

   public void class_(int var1, int var2) {
      int var3 = this.class_.get().length();
      this.case_ = rfU_2.class_(var1, 0, var3);
      this.catch_ = rfU_2.class_(var2, 0, var3);
   }

   public static void class_(QY var0, String var1) {
      ((Qj_1)var0.class_[23]).class_(var1);
   }

   public void class_() {
      String var1 = this.class_.get();
      this.protected_.accept(this.break_(var1));
      this.break_.accept(this.byte_(var1));
   }

   public static Supplier<String> class_(QY var0) {
      return () -> break_(var0);
   }

   public void class_(String var1) {
      this.class_(this.class_.get(), var1);
   }

   private void class_(String var1, String var2) {
      if (this.catch_ != this.case_) {
         var1 = this.byte_(var1);
      }

      this.case_ = rfU_2.class_(this.case_, 0, var1.length());
      String var3 = new StringBuilder(var1).insert(this.case_, var2).toString();
      if (this.throws_.test(var3)) {
         this.break_.accept(var3);
         this.catch_ = this.case_ = Math.min(var3.length(), this.case_ + var2.length());
      }
   }

   public boolean class_(int var1) {
      if (vm_3.private_(var1)) {
         this.protected_();
         return true;
      } else if (vm_3.catch_(var1)) {
         this.byte_();
         return true;
      } else if (vm_3.case_(var1)) {
         this.break_();
         return true;
      } else if (vm_3.throws_(var1)) {
         this.class_();
         return true;
      } else if (var1 == 259) {
         this.break_(-1);
         return true;
      } else {
         if (var1 == 261) {
            this.break_(1);
         } else {
            if (var1 == 263) {
               if (vm_3.else_()) {
                  this.break_(-1, vm_3.synchronized_());
               } else {
                  this.class_(-1, vm_3.synchronized_());
               }

               return true;
            }

            if (var1 == 262) {
               if (vm_3.else_()) {
                  this.break_(1, vm_3.synchronized_());
               } else {
                  this.class_(1, vm_3.synchronized_());
               }

               return true;
            }

            if (var1 == 268) {
               this.break_(vm_3.synchronized_());
               return true;
            }

            if (var1 == 269) {
               this.byte_(vm_3.synchronized_());
               return true;
            }
         }

         return false;
      }
   }

   public boolean class_(char var1) {
      if (rqu_3.class_(var1)) {
         this.class_(this.class_.get(), Character.toString(var1));
      }

      return true;
   }

   private void class_(boolean var1) {
      if (!var1) {
         this.catch_ = this.case_;
      }
   }

   public void class_(int var1, boolean var2) {
      this.case_ = rqR_2.class_(this.class_.get(), this.case_, var1);
      this.class_(var2);
   }

   private void break_(boolean var1) {
      this.case_ = 0;
      this.class_(var1);
   }

   public void break_() {
      this.class_(this.class_.get(), this.byte_.get());
      this.catch_ = this.case_;
   }

   public void break_(int var1) {
      String var2 = this.class_.get();
      if (!var2.isEmpty()) {
         String var3;
         if (this.catch_ != this.case_) {
            var3 = this.byte_(var2);
         } else {
            int var4 = rqR_2.class_(var2, this.case_, var1);
            int var5 = Math.min(var4, this.case_);
            int var6 = Math.max(var4, this.case_);
            var3 = new StringBuilder(var2).delete(var5, var6).toString();
            if (var1 < 0) {
               this.catch_ = this.case_ = var5;
            }
         }

         this.break_.accept(var3);
      }
   }

   public void break_(int var1, boolean var2) {
      this.case_ = rVj_1.class_(this.class_.get(), var1, this.case_, true);
      this.class_(var2);
   }

   public static String break_(QY var0) {
      return rgF_2.class_(((Qj_1)var0.class_[23]).class_().replaceAll("\\r", ""));
   }

   private String break_(String var1) {
      int var2 = Math.min(this.case_, this.catch_);
      int var3 = Math.max(this.case_, this.catch_);
      return var1.substring(var2, var3);
   }

   public void throws_() {
      this.byte_(false);
   }

   public int catch_() {
      return this.catch_;
   }

   public int case_() {
      return this.case_;
   }

   public void protected_() {
      this.catch_ = 0;
      this.case_ = this.class_.get().length();
   }

   public boolean private_() {
      return this.case_ != this.catch_;
   }
}
