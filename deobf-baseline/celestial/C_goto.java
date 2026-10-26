package celestial;

import java.util.List;

public interface C_goto {
   List<rfH_2> id_class(Ps_1 var1, ra_3 var2, int var3, int var4, int var5);

   int id_class(Ps_1 var1);

   List<rfH_2> id_class(Ps_1 var1, ra_3 var2, rfj_3 var3, int var4, int var5);

   int id_class(Ps_1 var1, int var2);

   default List<rfH_2> id_class(Ps_1 var1, List<xd_3> var2, int var3, int var4, int var5) {
      return this.id_class(var1, new ra_3(var2.toArray(new xd_3[0])), var3, var4, var5);
   }

   default List<rfH_2> id_class(Ps_1 var1, List<xd_3> var2, rfj_3 var3, int var4, int var5) {
      return this.id_class(var1, new ra_3(var2), var3, var4, var5);
   }
}
