package celestial;

import java.io.IOException;

public class rmt_3 implements ruS_2<rmH_2> {
   private int class_;
   private int break_;
   private int byte_;
   private short protected_;
   private rdn_3 throws_ = rdn_3.break_;
   private rXa_1 case_;

   public int byte_() {
      return this.break_;
   }

   public rmt_3() {
   }

   public rmt_3(int var1, int var2, int var3, rXa_1 var4, rdn_3 var5, short var6) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.throws_ = var5.implements_();
      this.protected_ = var6;
      this.case_ = var4;
   }

   @Override
   public String toString() {
      return "CClickWindowPacket(window="
         + this.class_
         + ", slot="
         + this.break_
         + ", button="
         + this.byte_
         + ", action="
         + this.protected_
         + ", mode="
         + this.case_
         + ", item="
         + this.throws_
         + ")";
   }

   public void class_(int var1) {
      this.class_ = var1;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readByte();
      this.break_ = var1.readShort();
      this.byte_ = var1.readByte();
      this.protected_ = var1.readShort();
      this.case_ = var1.class_(rXa_1.class);
      this.throws_ = var1.extends_();
   }

   public int break_() {
      return this.class_;
   }

   public void break_(int var1) {
      this.break_ = var1;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.class_);
      var1.writeShort(this.break_);
      var1.writeByte(this.byte_);
      var1.writeShort(this.protected_);
      var1.class_(this.case_);
      var1.class_(this.throws_);
   }

   public short throws_() {
      return this.protected_;
   }

   public rXa_1 catch_() {
      return this.case_;
   }

   public rdn_3 case_() {
      return this.throws_;
   }

   public int protected_() {
      return this.byte_;
   }
}
