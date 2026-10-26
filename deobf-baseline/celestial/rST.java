package celestial;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class rST<T extends rSl_1> {
   private static rST<?>[] id_native = new rST[0];
   public static final rST<rSn_1> id_class = id_class(rSn_1.class, "HoldingPattern");
   public static final rST<rSI> id_break = id_class(rSI.class, "StrafePlayer");
   public static final rST<rSH> id_byte = id_class(rSH.class, "LandingApproach");
   public static final rST<rSy_1> id_protected = id_class(rSy_1.class, "Landing");
   public static final rST<rSf_1> id_throws = id_class(rSf_1.class, "Takeoff");
   public static final rST<rSA> id_case = id_class(rSA.class, "SittingFlaming");
   public static final rST<rSt_1> id_catch = id_class(rSt_1.class, "SittingScanning");
   public static final rST<rSv_1> id_private = id_class(rSv_1.class, "SittingAttacking");
   public static final rST<rSF> id_implements = id_class(rSF.class, "ChargingPlayer");
   public static final rST<rSL> id_finally = id_class(rSL.class, "Dying");
   public static final rST<rSC> id_extends = id_class(rSC.class, "Hover");
   private final Class<? extends rSl_1> id_volatile;
   private final int id_final;
   private final String id_package;

   public static int id_byte() {
      return id_native.length;
   }

   private rST(int var1, Class<? extends rSl_1> var2, String var3) {
      this.id_final = var1;
      this.id_volatile = var2;
      this.id_package = var3;
   }

   @Override
   public String toString() {
      return this.id_package + " (#" + this.id_final + ")";
   }

   private static <T extends rSl_1> rST<T> id_class(Class<T> var0, String var1) {
      rST var2 = new rST(id_native.length, var0, var1);
      id_native = Arrays.copyOf(id_native, id_native.length + 1);
      id_native[var2.id_break()] = var2;
      return var2;
   }

   public rSl_1 id_class(rSu_1 var1) {
      try {
         Constructor var2 = this.id_class();
         return (rSl_1)var2.newInstance(var1);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   public static rST<?> id_class(int var0) {
      return var0 >= 0 && var0 < id_native.length ? id_native[var0] : id_class;
   }

   protected Constructor<? extends rSl_1> id_class() throws NoSuchMethodException {
      return this.id_volatile.getConstructor(rSu_1.class);
   }

   public int id_break() {
      return this.id_final;
   }
}
