package celestial;

import java.io.IOException;
import java.util.Objects;

public class rFH implements ruS_2<At_1> {
   private String class_ = "";
   private String break_;
   private int byte_;
   private rnb_3 protected_;

   public String byte_() {
      return this.break_;
   }

   public rFH() {
   }

   public rFH(rnb_3 var1, String var2, String var3, int var4) {
      if (var1 != rnb_3.REMOVE && var2 == null) {
         throw new IllegalArgumentException("Need an objective name");
      } else {
         this.class_ = var3;
         this.break_ = var2;
         this.byte_ = var4;
         this.protected_ = var1;
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.throws_(40);
      this.protected_ = var1.class_(rnb_3.class);
      String var2 = var1.throws_(16);
      this.break_ = Objects.equals(var2, "") ? null : var2;
      if (this.protected_ != rnb_3.REMOVE) {
         this.byte_ = var1.case_();
      }
   }

   public String break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.class_(this.protected_);
      var1.class_(this.break_ == null ? "" : this.break_);
      if (this.protected_ != rnb_3.REMOVE) {
         var1.protected_(this.byte_);
      }
   }

   public rnb_3 throws_() {
      return this.protected_;
   }

   public int protected_() {
      return this.byte_;
   }
}
