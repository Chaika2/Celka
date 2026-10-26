package celestial;

import java.io.IOException;

public class rmw_3 implements ruS_2<rmH_2> {
   private String class_;
   private int break_;
   private rhJ_2 byte_;
   private boolean protected_;
   private int throws_;
   private rpZ_2 case_;

   public boolean byte_() {
      return this.protected_;
   }

   public rmw_3() {
   }

   public rmw_3(String var1, int var2, rhJ_2 var3, boolean var4, int var5, rpZ_2 var6) {
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
      this.class_ = var1.throws_(16);
      this.break_ = var1.readByte();
      this.byte_ = var1.class_(rhJ_2.class);
      this.protected_ = var1.readBoolean();
      this.throws_ = var1.readUnsignedByte();
      this.case_ = var1.class_(rpZ_2.class);
   }

   public rhJ_2 break_() {
      return this.byte_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.writeByte(this.break_);
      var1.class_(this.byte_);
      var1.writeBoolean(this.protected_);
      var1.writeByte(this.throws_);
      var1.class_(this.case_);
   }

   public rpZ_2 throws_() {
      return this.case_;
   }

   public int protected_() {
      return this.throws_;
   }
}
