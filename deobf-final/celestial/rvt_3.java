package celestial;

import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class rvt_3 implements ruS_2<At_1> {
   private rqA_2 class_;
   private rqL_2 break_;
   private int byte_;
   private int protected_;
   private int throws_;
   private float case_;
   private float catch_;

   public rqL_2 byte_() {
      return this.break_;
   }

   public rvt_3() {
   }

   public rvt_3(rqA_2 var1, rqL_2 var2, double var3, double var5, double var7, float var9, float var10) {
      Validate.notNull(var1, "sound", new Object[0]);
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = (int)(var3 * 8.0);
      this.protected_ = (int)(var5 * 8.0);
      this.throws_ = (int)(var7 * 8.0);
      this.case_ = var9;
      this.catch_ = var10;
   }

   public void class_(rqA_2 var1) {
      this.class_ = var1;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = rVL.short_.class_(var1.case_());
      this.break_ = var1.class_(rqL_2.class);
      this.byte_ = var1.readInt();
      this.protected_ = var1.readInt();
      this.throws_ = var1.readInt();
      this.case_ = var1.readFloat();
      this.catch_ = var1.readFloat();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(rVL.short_.class_(this.class_));
      var1.class_(this.break_);
      var1.writeInt(this.byte_);
      var1.writeInt(this.protected_);
      var1.writeInt(this.throws_);
      var1.writeFloat(this.case_);
      var1.writeFloat(this.catch_);
   }

   public rqA_2 break_() {
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
