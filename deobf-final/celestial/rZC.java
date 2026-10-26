package celestial;

import java.io.IOException;

public class rZC implements ruS_2<rmH_2> {
   private rfH_2 class_;
   private rqO_2 break_;
   private rqO_2 byte_;
   private rqO_2 protected_;
   private String throws_;
   private rHV case_;

   public rqO_2 byte_() {
      return this.break_;
   }

   public rZC() {
   }

   public rZC(rfH_2 var1, rqO_2 var2, rqO_2 var3, rqO_2 var4, String var5, rHV var6) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.byte_();
      this.break_ = var1.volatile_();
      this.byte_ = var1.volatile_();
      this.protected_ = var1.volatile_();
      this.throws_ = var1.throws_(32767);
      this.case_ = rHV.class_(var1.throws_(32767)).orElse(rHV.ALIGNED);
   }

   public rfH_2 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.class_(this.break_);
      var1.class_(this.byte_);
      var1.class_(this.protected_);
      var1.class_(this.throws_);
      var1.class_(this.case_.class_());
   }

   public rqO_2 throws_() {
      return this.protected_;
   }

   public rHV catch_() {
      return this.case_;
   }

   public String case_() {
      return this.throws_;
   }

   public rqO_2 protected_() {
      return this.byte_;
   }
}
