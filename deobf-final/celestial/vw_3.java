package celestial;

class vw_3 extends Lg_1<vw_3> {
   private final aI_2<?> break_;
   private final rgP_2 byte_;
   private final rgP_2 protected_;
   private final boolean throws_;
   private final rgP_2 case_;
   private final boolean catch_;

   public vw_3(aI_2<?> var1, aI_2 var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var2.implements_();
      int var3 = var1.class_.finally_.class_(rlB_2.catch_.break_(var2));
      if (var3 == 0) {
         this.protected_ = new rgn_3("stat_type.minecraft.killed.none", this.byte_);
         this.throws_ = false;
      } else {
         this.protected_ = new rgn_3("stat_type.minecraft.killed", var3, this.byte_);
         this.throws_ = true;
      }

      int var4 = var1.class_.finally_.class_(rlB_2.private_.break_(var2));
      if (var4 == 0) {
         this.case_ = new rgn_3("stat_type.minecraft.killed_by.none", this.byte_);
         this.catch_ = false;
      } else {
         this.case_ = new rgn_3("stat_type.minecraft.killed_by", this.byte_, var4);
         this.catch_ = true;
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      ch_3.break_(var1, this.class_.class_.super_, this.byte_, var4 + 2, var3 + 1, 16777215);
      ch_3.break_(var1, this.class_.class_.super_, this.protected_, var4 + 2 + 10, var3 + 1 + 9, this.throws_ ? 9474192 : 6316128);
      ch_3.break_(var1, this.class_.class_.super_, this.case_, var4 + 2 + 10, var3 + 1 + 18, this.catch_ ? 9474192 : 6316128);
   }
}
