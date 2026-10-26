package celestial;

public class LF extends Lv_1 {
   public static final LA private_ = (var0, var1, var2, var3) -> {
   };
   protected final LL implements_;
   protected final LA super_;

   public LF(int var1, int var2, int var3, int var4, rgP_2 var5, LL var6) {
      this(var1, var2, var3, var4, var5, var6, private_);
   }

   public LF(int var1, int var2, int var3, int var4, rgP_2 var5, LL var6, LA var7) {
      super(var1, var2, var3, var4, var5);
      this.implements_ = var6;
      this.super_ = var7;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3) {
      this.volatile_().onTooltip(this, var1, var2, var3);
   }

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      super.break_(var1, var2, var3, var4);
      if (this.B_()) {
         this.class_(var1, var2, var3);
      }
   }

   @Override
   public void catch_() {
      this.implements_.onPress(this);
   }

   public LA volatile_() {
      return this.super_;
   }
}
