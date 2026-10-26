package celestial;

import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class rFX implements ruS_2<At_1> {
   private rqA_2 class_;
   private rqL_2 break_;
   private int byte_;
   private float protected_;
   private float throws_;

   public rqL_2 byte_() {
      return this.break_;
   }

   public rFX() {
   }

   public rFX(rqA_2 var1, rqL_2 var2, an_3 var3, float var4, float var5) {
      Validate.notNull(var1, "sound", new Object[0]);
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3.V();
      this.protected_ = var4;
      this.throws_ = var5;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = rVL.short_.class_(var1.case_());
      this.break_ = var1.class_(rqL_2.class);
      this.byte_ = var1.case_();
      this.protected_ = var1.readFloat();
      this.throws_ = var1.readFloat();
   }

   public rqA_2 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(rVL.short_.class_(this.class_));
      var1.class_(this.break_);
      var1.protected_(this.byte_);
      var1.writeFloat(this.protected_);
      var1.writeFloat(this.throws_);
   }

   public float throws_() {
      return this.protected_;
   }

   public float case_() {
      return this.throws_;
   }

   public int protected_() {
      return this.byte_;
   }
}
