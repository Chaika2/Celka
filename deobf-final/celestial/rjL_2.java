package celestial;

public final class rjL_2 extends rjp_3 {
   private final rjp_3 protected_;
   private final int throws_;
   private final int case_;
   private final int catch_;
   private final int private_;
   private final int implements_;
   private final int finally_;

   protected rjL_2(rjp_3 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var5 - var2, var6 - var3, var7 - var4);
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
      this.catch_ = var4;
      this.private_ = var5;
      this.implements_ = var6;
      this.finally_ = var7;
   }

   @Override
   public int class_(rpB_2 var1) {
      return Math.max(0, this.protected_.class_(var1) - var1.class_(this.throws_, this.case_, this.catch_));
   }

   @Override
   public void class_(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.protected_.class_(this.throws_ + var1, this.case_ + var2, this.catch_ + var3, var4, var5);
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return this.protected_.break_(this.throws_ + var1, this.case_ + var2, this.catch_ + var3);
   }

   @Override
   public int break_(rpB_2 var1) {
      return Math.min(
         var1.class_(this.private_, this.implements_, this.finally_), this.protected_.break_(var1) - var1.class_(this.throws_, this.case_, this.catch_)
      );
   }
}
