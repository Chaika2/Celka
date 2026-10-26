package celestial;

public class rLv_1 extends rLq_1 {
   private float volatile_ = Float.MAX_VALUE;
   private rLq_1 final_;
   private boolean package_;

   public rLv_1(rLq_1 var1) {
      super(var1.class_, var1.break_, var1.byte_);
   }

   public rLv_1(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public rLq_1 class_() {
      return this.final_;
   }

   public static rLv_1 class_(ruu_3 var0) {
      rLv_1 var1 = new rLv_1(var0.readInt(), var0.readInt(), var0.readInt());
      var1.finally_ = var0.readFloat();
      var1.extends_ = var0.readFloat();
      var1.implements_ = var0.readBoolean();
      var1.native_ = rLp_1.values()[var0.readInt()];
      var1.catch_ = var0.readFloat();
      return var1;
   }

   public void class_(float var1, rLq_1 var2) {
      if (var1 < this.volatile_) {
         this.volatile_ = var1;
         this.final_ = var2;
      }
   }

   public void break_() {
      this.package_ = true;
   }
}
