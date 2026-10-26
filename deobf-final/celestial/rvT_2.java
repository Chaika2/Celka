package celestial;

import java.io.IOException;

public class rvT_2 implements ruS_2<At_1> {
   private int class_;
   private byte break_;
   private byte byte_;
   private int protected_;
   private byte throws_;

   public int byte_() {
      return this.class_;
   }

   public rvT_2() {
   }

   public rvT_2(int var1, rLY var2) {
      this.class_ = var1;
      this.break_ = (byte)(rLR.class_(var2.class_()) & 0xFF);
      this.byte_ = (byte)(var2.byte_() & 0xFF);
      if (var2.break_() > 32767) {
         this.protected_ = 32767;
      } else {
         this.protected_ = var2.break_();
      }

      this.throws_ = 0;
      if (var2.protected_()) {
         this.throws_ = (byte)(this.throws_ | 1);
      }

      if (var2.throws_()) {
         this.throws_ = (byte)(this.throws_ | 2);
      }

      if (var2.case_()) {
         this.throws_ = (byte)(this.throws_ | 4);
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.readByte();
      this.byte_ = var1.readByte();
      this.protected_ = var1.case_();
      this.throws_ = var1.readByte();
   }

   public boolean break_() {
      return this.protected_ == 32767;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.writeByte(this.break_);
      var1.writeByte(this.byte_);
      var1.protected_(this.protected_);
      var1.writeByte(this.throws_);
   }

   public byte throws_() {
      return this.byte_;
   }

   public boolean catch_() {
      return (this.throws_ & 2) == 2;
   }

   public int case_() {
      return this.protected_;
   }

   public boolean implements_() {
      return (this.throws_ & 4) == 4;
   }

   public byte protected_() {
      return this.break_;
   }

   public boolean private_() {
      return (this.throws_ & 1) == 1;
   }
}
