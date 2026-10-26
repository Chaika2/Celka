package celestial;

import java.io.IOException;

public class rvI_2 implements ruS_2<At_1> {
   private rqO_2 class_;
   private rqL_2 break_;
   private int byte_;
   private int protected_ = Integer.MAX_VALUE;
   private int throws_;
   private float case_;
   private float catch_;

   public rqL_2 byte_() {
      return this.break_;
   }

   public rvI_2() {
   }

   public rvI_2(rqO_2 var1, rqL_2 var2, rjU_2 var3, float var4, float var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = (int)(var3.break_ * 8.0);
      this.protected_ = (int)(var3.byte_ * 8.0);
      this.throws_ = (int)(var3.protected_ * 8.0);
      this.case_ = var4;
      this.catch_ = var5;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.volatile_();
      this.break_ = var1.class_(rqL_2.class);
      this.byte_ = var1.readInt();
      this.protected_ = var1.readInt();
      this.throws_ = var1.readInt();
      this.case_ = var1.readFloat();
      this.catch_ = var1.readFloat();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.class_(this.break_);
      var1.writeInt(this.byte_);
      var1.writeInt(this.protected_);
      var1.writeInt(this.throws_);
      var1.writeFloat(this.case_);
      var1.writeFloat(this.catch_);
   }

   public rqO_2 break_() {
      return this.class_;
   }

   public double throws_() {
      return (double)((float)this.protected_ / 8.0F);
   }

   public float catch_() {
      return this.case_;
   }

   public double case_() {
      return (double)((float)this.throws_ / 8.0F);
   }

   public double protected_() {
      return (double)((float)this.byte_ / 8.0F);
   }

   public float private_() {
      return this.catch_;
   }
}
