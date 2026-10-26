package celestial;

public class LF extends Lv_1 {
   public static final LA id_private = (var0, var1, var2, var3) -> {
   };
   protected final LL id_implements;
   protected final LA id_super;

   public LF(int var1, int var2, int var3, int var4, rgP_2 var5, LL var6) {
      this(var1, var2, var3, var4, var5, var6, id_private);
   }

   public LF(int var1, int var2, int var3, int var4, rgP_2 var5, LL var6, LA var7) {
      super(var1, var2, var3, var4, var5);
      this.id_implements = var6;
      this.id_super = var7;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3) {
      this.id_volatile().onTooltip(this, var1, var2, var3);
   }

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      super.id_break(var1, var2, var3, var4);
      if (this.B_()) {
         this.id_class(var1, var2, var3);
      }
   }

   @Override
   public void id_catch() {
      this.id_implements.onPress(this);
   }

   public LA id_volatile() {
      return this.id_super;
   }
}
