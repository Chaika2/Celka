package celestial;

public class DK {
   public static rqO_2 id_class(xd_3 var0) {
      rqO_2 var1 = rVL.id_strictfp.id_break(var0);
      return new rqO_2(var1.id_byte(), "block/" + var1.id_break());
   }

   public static rqO_2 id_class(rdb_3 var0) {
      rqO_2 var1 = rVL.id_for.id_break(var0);
      return new rqO_2(var1.id_byte(), "item/" + var1.id_break());
   }

   public static rqO_2 id_class(rdb_3 var0, String var1) {
      rqO_2 var2 = rVL.id_for.id_break(var0);
      return new rqO_2(var2.id_byte(), "item/" + var2.id_break() + var1);
   }

   public static rqO_2 id_class(xd_3 var0, String var1) {
      rqO_2 var2 = rVL.id_strictfp.id_break(var0);
      return new rqO_2(var2.id_byte(), "block/" + var2.id_break() + var1);
   }

   @Deprecated
   public static rqO_2 id_class(String var0) {
      return new rqO_2("minecraft", "block/" + var0);
   }

   public static rqO_2 id_break(String var0) {
      return new rqO_2("minecraft", "item/" + var0);
   }
}
