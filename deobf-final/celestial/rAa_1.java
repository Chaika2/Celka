package celestial;

import java.util.Comparator;

public class rAa_1 {
   public static final Comparator<rAa_1> class_ = (var0, var1) -> {
      if (var0.break_() > var1.break_()) {
         return 1;
      } else {
         return var0.break_() < var1.break_() ? -1 : var1.throws_().compareToIgnoreCase(var0.throws_());
      }
   };
   private final rns_3 break_;
   private final rnP_2 byte_;
   private final String protected_;
   private int throws_;
   private boolean case_;
   private boolean catch_;

   public void byte_() {
      this.break_(0);
   }

   public rAa_1(rns_3 var1, rnP_2 var2, String var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.case_ = true;
      this.catch_ = true;
   }

   public void class_(int var1) {
      if (this.byte_.byte_().break_()) {
         throw new IllegalStateException("Cannot modify read-only score");
      } else {
         this.break_(this.break_() + var1);
      }
   }

   public void class_() {
      this.class_(1);
   }

   public void class_(boolean var1) {
      this.case_ = var1;
   }

   public int break_() {
      return this.throws_;
   }

   public void break_(int var1) {
      int var2 = this.throws_;
      this.throws_ = var1;
      if (var2 != var1 || this.catch_) {
         this.catch_ = false;
         this.case_().class_(this);
      }
   }

   public String throws_() {
      return this.protected_;
   }

   public boolean catch_() {
      return this.case_;
   }

   public rns_3 case_() {
      return this.break_;
   }

   public rnP_2 protected_() {
      return this.byte_;
   }
}
