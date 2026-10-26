package celestial;

public class DK {
   public static rqO_2 class_(xd_3 var0) {
      rqO_2 var1 = rVL.strictfp_.break_(var0);
      return new rqO_2(var1.byte_(), "block/" + var1.break_());
   }

   public static rqO_2 class_(rdb_3 var0) {
      rqO_2 var1 = rVL.for_.break_(var0);
      return new rqO_2(var1.byte_(), "item/" + var1.break_());
   }

   public static rqO_2 class_(rdb_3 var0, String var1) {
      rqO_2 var2 = rVL.for_.break_(var0);
      return new rqO_2(var2.byte_(), "item/" + var2.break_() + var1);
   }

   public static rqO_2 class_(xd_3 var0, String var1) {
      rqO_2 var2 = rVL.strictfp_.break_(var0);
      return new rqO_2(var2.byte_(), "block/" + var2.break_() + var1);
   }

   @Deprecated
   public static rqO_2 class_(String var0) {
      return new rqO_2("minecraft", "block/" + var0);
   }

   public static rqO_2 break_(String var0) {
      return new rqO_2("minecraft", "item/" + var0);
   }
}
