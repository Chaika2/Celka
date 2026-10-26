package celestial;

import java.io.IOException;

public class rvL_2 implements ruS_2<At_1> {
   private int class_;
   private rdf_3 break_;
   private int byte_;
   private int protected_;
   private boolean throws_;
   private boolean case_;

   public rdf_3 byte_() {
      return this.break_;
   }

   public rvL_2() {
   }

   public rvL_2(int var1, rdf_3 var2, int var3, int var4, boolean var5, boolean var6) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = rdf_3.break_(var1);
      this.byte_ = var1.case_();
      this.protected_ = var1.case_();
      this.throws_ = var1.readBoolean();
      this.case_ = var1.readBoolean();
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      this.break_.class_(var1);
      var1.protected_(this.byte_);
      var1.protected_(this.protected_);
      var1.writeBoolean(this.throws_);
      var1.writeBoolean(this.case_);
   }

   public int throws_() {
      return this.protected_;
   }

   public boolean catch_() {
      return this.case_;
   }

   public boolean case_() {
      return this.throws_;
   }

   public int protected_() {
      return this.byte_;
   }
}
