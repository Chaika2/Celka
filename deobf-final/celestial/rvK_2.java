package celestial;

import java.io.IOException;

public class rvK_2 implements ruS_2<At_1> {
   private double class_;
   private double break_;
   private double byte_;
   private int protected_;
   private Rm_1 throws_;
   private Rm_1 case_;
   private boolean catch_;

   public rvK_2(Rm_1 var1, an_3 var2, Rm_1 var3) {
      this.throws_ = var1;
      this.protected_ = var2.V();
      this.case_ = var3;
      rjU_2 var4 = var3.class_(var2);
      this.class_ = var4.break_;
      this.break_ = var4.byte_;
      this.byte_ = var4.protected_;
      this.catch_ = true;
   }

   public rvK_2(Rm_1 var1, double var2, double var4, double var6) {
      this.throws_ = var1;
      this.class_ = var2;
      this.break_ = var4;
      this.byte_ = var6;
   }

   public rvK_2() {
   }

   public rjU_2 class_(rYB var1) {
      if (this.catch_) {
         an_3 var2 = var1.break_(this.protected_);
         return var2 == null ? new rjU_2(this.class_, this.break_, this.byte_) : this.case_.class_(var2);
      } else {
         return new rjU_2(this.class_, this.break_, this.byte_);
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.throws_ = var1.class_(Rm_1.class);
      this.class_ = var1.readDouble();
      this.break_ = var1.readDouble();
      this.byte_ = var1.readDouble();
      if (var1.readBoolean()) {
         this.catch_ = true;
         this.protected_ = var1.case_();
         this.case_ = var1.class_(Rm_1.class);
      }
   }

   public Rm_1 break_() {
      return this.throws_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.throws_);
      var1.writeDouble(this.class_);
      var1.writeDouble(this.break_);
      var1.writeDouble(this.byte_);
      var1.writeBoolean(this.catch_);
      if (this.catch_) {
         var1.protected_(this.protected_);
         var1.class_(this.case_);
      }
   }
}
