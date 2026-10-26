package celestial;

import java.io.IOException;
import java.util.UUID;

public class rFx_1 implements ruS_2<At_1> {
   private int class_;
   private UUID break_;
   private rfH_2 byte_;
   private rpr_3 protected_;
   private int throws_;

   public UUID byte_() {
      return this.break_;
   }

   public rFx_1() {
   }

   public rFx_1(rsO_2 var1) {
      this.class_ = var1.V();
      this.break_ = var1.ro();
      this.byte_ = var1.implements_();
      this.protected_ = var1.Pg();
      this.throws_ = rVL.P.class_(var1.catch_);
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.private_();
      this.throws_ = var1.case_();
      this.byte_ = var1.byte_();
      this.protected_ = rpr_3.break_(var1.readUnsignedByte());
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.class_(this.break_);
      var1.protected_(this.throws_);
      var1.class_(this.byte_);
      var1.writeByte(this.protected_.protected_());
   }

   public rpr_3 throws_() {
      return this.protected_;
   }

   public rsh_3 case_() {
      return rVL.P.class_(this.throws_);
   }

   public rfH_2 protected_() {
      return this.byte_;
   }
}
