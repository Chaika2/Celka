package celestial;

public class rLv_1 extends rLq_1 {
   private float id_volatile = Float.MAX_VALUE;
   private rLq_1 id_final;
   private boolean id_package;

   public rLv_1(rLq_1 var1) {
      super(var1.id_class, var1.id_break, var1.id_byte);
   }

   public rLv_1(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public rLq_1 id_class() {
      return this.id_final;
   }

   public static rLv_1 id_class(ruu_3 var0) {
      rLv_1 var1 = new rLv_1(var0.readInt(), var0.readInt(), var0.readInt());
      var1.id_finally = var0.readFloat();
      var1.id_extends = var0.readFloat();
      var1.id_implements = var0.readBoolean();
      var1.id_native = rLp_1.values()[var0.readInt()];
      var1.id_catch = var0.readFloat();
      return var1;
   }

   public void id_class(float var1, rLq_1 var2) {
      if (var1 < this.id_volatile) {
         this.id_volatile = var1;
         this.id_final = var2;
      }
   }

   public void id_break() {
      this.id_package = true;
   }
}
