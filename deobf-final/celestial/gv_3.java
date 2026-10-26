package celestial;

public class gv_3 implements rrGS {
   private final boolean class_;
   private final rRu_1 break_;
   private final boolean byte_;
   private int protected_;
   private int throws_;
   private int case_;
   private float catch_;
   private long private_;
   private long implements_;
   private boolean finally_;
   private rRO extends_;
   private boolean native_;

   @Override
   public void byte_(int var1) {
      this.case_ = var1;
   }

   @Override
   public int byte_() {
      return this.case_;
   }

   public gv_3(rRO var1, boolean var2, boolean var3) {
      this.extends_ = var1;
      this.class_ = var2;
      this.byte_ = var3;
      this.break_ = new rRu_1();
   }

   @Override
   public void class_(boolean var1) {
      this.finally_ = var1;
   }

   @Override
   public void class_(float var1) {
      this.catch_ = var1;
   }

   public void class_(long var1) {
      this.private_ = var1;
   }

   @Override
   public void class_(rfH_2 var1, float var2) {
      this.protected_ = var1.b_();
      this.throws_ = var1.c_();
      this.case_ = var1.d_();
      this.catch_ = var2;
   }

   public void class_(rRO var1) {
      rrxr_3.a.catch_(var1, this.extends_);
      this.extends_ = var1;
   }

   @Override
   public void class_(Ko_1 var1) {
      rrGS.super.class_(var1);
   }

   @Override
   public int class_() {
      return this.protected_;
   }

   @Override
   public void class_(int var1) {
      this.protected_ = var1;
   }

   @Override
   public int break_() {
      return this.throws_;
   }

   @Override
   public void break_(int var1) {
      this.throws_ = var1;
   }

   public void break_(boolean var1) {
      this.native_ = var1;
   }

   public void break_(long var1) {
      this.implements_ = var1;
   }

   @Override
   public long throws_() {
      return this.private_;
   }

   @Override
   public rRu_1 finally_() {
      return this.break_;
   }

   @Override
   public boolean catch_() {
      return false;
   }

   @Override
   public rRO extends_() {
      return this.extends_;
   }

   @Override
   public long case_() {
      return this.implements_;
   }

   @Override
   public boolean implements_() {
      return this.class_;
   }

   @Override
   public float protected_() {
      return this.catch_;
   }

   @Override
   public boolean private_() {
      return this.finally_;
   }

   public double final_() {
      return this.byte_ ? 1.0 : 0.03125;
   }

   public double volatile_() {
      return this.byte_ ? 0.0 : 63.0;
   }

   @Override
   public boolean native_() {
      return this.native_;
   }
}
