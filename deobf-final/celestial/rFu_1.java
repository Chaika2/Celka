package celestial;

import java.io.IOException;

public class rFu_1 implements ruS_2<At_1> {
   private rFm_1 class_;
   private rgP_2 break_;
   private int byte_;
   private int protected_;
   private int throws_;

   public rgP_2 byte_() {
      return this.break_;
   }

   public rFu_1(rFm_1 var1, rgP_2 var2, int var3, int var4, int var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
   }

   public rFu_1(int var1, int var2, int var3) {
      this(rFm_1.TIMES, (rgP_2)null, var1, var2, var3);
   }

   public rFu_1() {
   }

   public rFu_1(rFm_1 var1, rgP_2 var2) {
      this(var1, var2, -1, -1, -1);
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.class_(rFm_1.class);
      if (this.class_ == rFm_1.TITLE || this.class_ == rFm_1.SUBTITLE || this.class_ == rFm_1.ACTIONBAR) {
         this.break_ = var1.throws_();
      }

      if (this.class_ == rFm_1.TIMES) {
         this.byte_ = var1.readInt();
         this.protected_ = var1.readInt();
         this.throws_ = var1.readInt();
      }
   }

   public rFm_1 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      if (this.class_ == rFm_1.TITLE || this.class_ == rFm_1.SUBTITLE || this.class_ == rFm_1.ACTIONBAR) {
         var1.class_(this.break_);
      }

      if (this.class_ == rFm_1.TIMES) {
         var1.writeInt(this.byte_);
         var1.writeInt(this.protected_);
         var1.writeInt(this.throws_);
      }
   }

   public int throws_() {
      return this.protected_;
   }

   public int case_() {
      return this.throws_;
   }

   public int protected_() {
      return this.byte_;
   }
}
