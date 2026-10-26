package celestial;

import java.io.IOException;

public class rZq_1 implements ruS_2<rmH_2> {
   private int class_;
   private an_3 break_;
   private rZT byte_;
   private rjU_2 protected_;
   private rpm_3 throws_;
   private boolean case_;

   public an_3 byte_() {
      return this.break_;
   }

   public rZq_1(an_3 var1, rpm_3 var2, rjU_2 var3, boolean var4) {
      this.class_ = var1.V();
      this.break_ = var1;
      this.byte_ = rZT.INTERACT_AT;
      this.throws_ = var2;
      this.protected_ = var3;
      this.case_ = var4;
   }

   public rZq_1(an_3 var1, rpm_3 var2, boolean var3) {
      this.class_ = var1.V();
      this.break_ = var1;
      this.byte_ = rZT.INTERACT;
      this.throws_ = var2;
      this.case_ = var3;
   }

   public rZq_1() {
   }

   public rZq_1(an_3 var1, boolean var2) {
      this.class_ = var1.V();
      this.break_ = var1;
      this.byte_ = rZT.ATTACK;
      this.case_ = var2;
   }

   public an_3 class_(rYB var1) {
      return var1.break_(this.class_);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.byte_ = var1.class_(rZT.class);
      if (this.byte_ == rZT.INTERACT_AT) {
         this.protected_ = new rjU_2((double)var1.readFloat(), (double)var1.readFloat(), (double)var1.readFloat());
      }

      if (this.byte_ == rZT.INTERACT || this.byte_ == rZT.INTERACT_AT) {
         this.throws_ = var1.class_(rpm_3.class);
      }

      this.case_ = var1.readBoolean();
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   public rZT break_() {
      return this.byte_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.class_(this.byte_);
      if (this.byte_ == rZT.INTERACT_AT) {
         var1.writeFloat((float)this.protected_.break_);
         var1.writeFloat((float)this.protected_.byte_);
         var1.writeFloat((float)this.protected_.protected_);
      }

      if (this.byte_ == rZT.INTERACT || this.byte_ == rZT.INTERACT_AT) {
         var1.class_(this.throws_);
      }

      var1.writeBoolean(this.case_);
   }

   public rjU_2 throws_() {
      return this.protected_;
   }

   public boolean case_() {
      return this.case_;
   }

   public rpm_3 protected_() {
      return this.throws_;
   }
}
