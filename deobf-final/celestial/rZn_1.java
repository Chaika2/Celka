package celestial;

import java.io.IOException;

public class rZn_1 implements ruS_2<rmH_2> {
   private rfH_2 class_;
   private String break_;
   private boolean byte_;
   private boolean protected_;
   private boolean throws_;
   private rHF case_;

   public String byte_() {
      return this.break_;
   }

   public rZn_1() {
   }

   public rZn_1(rfH_2 var1, String var2, rHF var3, boolean var4, boolean var5, boolean var6) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var4;
      this.protected_ = var5;
      this.throws_ = var6;
      this.case_ = var3;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.byte_();
      this.break_ = var1.throws_(32767);
      this.case_ = var1.class_(rHF.class);
      byte var2 = var1.readByte();
      this.byte_ = (var2 & 1) != 0;
      this.protected_ = (var2 & 2) != 0;
      this.throws_ = (var2 & 4) != 0;
   }

   public rfH_2 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.class_(this.break_);
      var1.class_(this.case_);
      byte var2 = 0;
      if (this.byte_) {
         var2 |= 1;
      }

      if (this.protected_) {
         var2 |= 2;
      }

      if (this.throws_) {
         var2 |= 4;
      }

      var1.writeByte(var2);
   }

   public boolean throws_() {
      return this.protected_;
   }

   public rHF catch_() {
      return this.case_;
   }

   public boolean case_() {
      return this.throws_;
   }

   public boolean protected_() {
      return this.byte_;
   }
}
