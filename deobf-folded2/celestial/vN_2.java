package celestial;

public interface vN_2 {
   static vN_2 id_class(rdn_3 var0) {
      rdb_3 var1 = var0.id_break();
      if (var1 == rdy_3.dr) {
         return new vu_3(var0);
      } else {
         return (vN_2)(var1 == rdy_3.xi ? new vc_3(var0) : vz_3.id_class);
      }
   }

   rgS_2 id_class(int var1);

   int id_class();

   default rgS_2 id_break(int var1) {
      return var1 >= 0 && var1 < this.id_class() ? this.id_class(var1) : rgS_2.id_break;
   }
}
