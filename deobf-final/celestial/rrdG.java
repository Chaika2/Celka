package celestial;

import java.util.Arrays;

public class rrdG {
   private final int class_;
   private final String break_;
   private final rrdM byte_;
   private final rrdG protected_;
   private rrxf_3[] throws_;
   private rrxW_2 case_;
   private rrxz_3 catch_;
   private rrxz_3[] private_;
   private rrdj_1 implements_;
   private final Boolean[] finally_ = new Boolean[16];
   private int extends_;
   private int native_;
   private String[] volatile_;
   private rrxY_2 final_;
   private rrxY_2 package_;
   private int int_;
   private int new_;
   private final boolean[] continue_ = new boolean[16];
   private rrWz_1 super_;
   private rrxz_3[] this_;

   public void byte_(int var1) {
      this.int_ = var1;
   }

   public void byte_() {
      this.volatile_ = null;
      this.int_ = 0;
      this.new_ = 0;
      Arrays.fill(this.continue_, false);
      this.super_ = null;
      this.this_ = null;
      if (this.package_ == null) {
         this.package_ = new rrxY_2(this.break_, 16, 8);
      }
   }

   public rrxz_3 int_() {
      return this.catch_;
   }

   public rrdG(int var1, String var2, rrdM var3, rrdG var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = new rrxf_3[0];
   }

   public rrdG(int var1, String var2, rrdM var3, boolean var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4 ? this : null;
      this.throws_ = new rrxf_3[0];
   }

   @Override
   public String toString() {
      return "name: " + this.break_ + ", id: " + this.extends_ + ", ref: " + this.native_ + ", real: " + this.synchronized_();
   }

   public Boolean[] this_() {
      return this.finally_;
   }

   public void class_(rrdj_1 var1) {
      this.implements_ = var1;
   }

   public void class_(int var1, rrxz_3 var2) {
      if (this.private_ == null) {
         this.private_ = new rrxz_3[var1 + 1];
      }

      if (this.private_.length < var1 + 1) {
         rrxz_3[] var3 = new rrxz_3[var1 + 1];
         System.arraycopy(this.private_, 0, var3, 0, this.private_.length);
         this.private_ = var3;
      }

      this.private_[var1] = var2;
   }

   public void class_(rrdG var1) {
      this.extends_ = var1.private_();
      this.case_ = var1.package_();
      this.catch_ = var1.int_();
      this.private_ = var1.private_;
      this.implements_ = var1.super_();
      System.arraycopy(var1.this_(), 0, this.finally_, 0, this.finally_.length);
      this.volatile_ = var1.finally_();
      this.final_ = var1.extends_();
      this.int_ = var1.volatile_();
      this.new_ = var1.final_();
      System.arraycopy(var1.else_(), 0, this.continue_, 0, this.continue_.length);
      this.this_ = var1.this_;
   }

   public void class_(rrWz_1 var1) {
      this.super_ = var1;
   }

   public void class_(rrxz_3 var1) {
      this.catch_ = var1;
   }

   public void class_(rrxW_2 var1) {
      this.case_ = var1;
   }

   public void class_() {
      this.case_ = null;
      this.catch_ = null;
      this.private_ = null;
      this.implements_ = null;
      Arrays.fill(this.finally_, null);
   }

   public void class_(rrxY_2 var1) {
      this.final_ = var1;
   }

   public void class_(String[] var1) {
      this.volatile_ = var1;
   }

   public void class_(rrxf_3[] var1) {
      this.throws_ = var1;
   }

   public void class_(int var1) {
      this.extends_ = var1;
   }

   public void break_(int var1) {
      this.native_ = var1;
   }

   public void break_() {
      this.extends_ = 0;
      this.native_ = 0;
   }

   public void break_(int var1, rrxz_3 var2) {
      if (this.this_ == null) {
         this.this_ = new rrxz_3[var1 + 1];
      }

      if (this.this_.length < var1 + 1) {
         rrxz_3[] var3 = new rrxz_3[var1 + 1];
         System.arraycopy(this.this_, 0, var3, 0, this.this_.length);
         this.this_ = var3;
      }

      this.this_[var1] = var2;
   }

   public String throws_() {
      return this.break_;
   }

   public String[] finally_() {
      return this.volatile_;
   }

   public rrdG catch_() {
      return this.protected_;
   }

   public rrxY_2 extends_() {
      return this.final_;
   }

   public rrxf_3[] goto_() {
      return this.throws_;
   }

   public rrdM case_() {
      return this.byte_;
   }

   public rrxz_3[] continue_() {
      return this.this_;
   }

   public boolean[] else_() {
      return this.continue_;
   }

   public int implements_() {
      return this.native_;
   }

   public rrxz_3[] new_() {
      return this.private_;
   }

   public rrxW_2 package_() {
      return this.case_;
   }

   public boolean return_() {
      return this.int_ != 0;
   }

   public rrdj_1 super_() {
      return this.implements_;
   }

   public rrWz_1 public_() {
      return this.super_;
   }

   public void protected_(int var1) {
      this.new_ = var1;
   }

   public int protected_() {
      return this.class_;
   }

   public int private_() {
      return this.extends_;
   }

   public int final_() {
      return this.new_;
   }

   public int volatile_() {
      return this.int_;
   }

   public String synchronized_() {
      if (this.extends_ == 0) {
         return "none";
      } else {
         rrdG var1;
         for (var1 = this; var1.implements_() != this.extends_; var1 = var1.catch_()) {
            if (var1.catch_() == null || var1.catch_() == var1) {
               return "unknown";
            }
         }

         return var1.throws_();
      }
   }

   public rrxY_2 native_() {
      return this.package_;
   }
}
