package celestial;

import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;

public interface roC_2 extends rRj_1, rRq_1 {
   default int id_char() {
      roQ_2 var1 = this.id_interface();
      return var1 == null ? 0 : var1.id_catch();
   }

   roQ_2[] id_byte();

   rRV<xd_3> id_int();

   long id_this();

   default roQ_2 id_interface() {
      roQ_2[] var1 = this.id_byte();

      for (int var2 = var1.length - 1; var2 >= 0; var2--) {
         roQ_2 var3 = var1[var2];
         if (!roQ_2.id_class(var3)) {
            return var3;
         }
      }

      return null;
   }

   int id_class(rKv_1 var1, int var2, int var3);

   rKZ id_class(rKv_1 var1);

   void id_class(long var1);

   default boolean id_class(int var1, int var2) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 >= 256) {
         var2 = 255;
      }

      for (int var3 = var1; var3 <= var2; var3 += 16) {
         if (!roQ_2.id_class(this.id_byte()[var3 >> 4])) {
            return false;
         }
      }

      return true;
   }

   default void id_class(rcd_3 var1) {
      LogManager.getLogger().warn("Trying to set a BlockEntity, but this operation is not supported.");
   }

   void id_class(rfH_2 var1, ryO_2 var2);

   void id_class(an_3 var1);

   xc_3 id_class(rfH_2 var1, xc_3 var2, boolean var3);

   void id_class(rKv_1 var1, long[] var2);

   static ShortList id_class(ShortList[] var0, int var1) {
      if (var0[var1] == null) {
         var0[var1] = new ShortArrayList();
      }

      return var0[var1];
   }

   void id_break(boolean var1);

   default void id_break(short var1, int var2) {
      id_class(this.id_return(), var2).add(var1);
   }

   void id_break(long var1);

   Set<rfH_2> id_break();

   void id_break(Map<rrrZ<?>, rrrH<?>> var1);

   void id_throws(rfH_2 var1);

   default void id_extends(rfH_2 var1) {
      LogManager.getLogger().warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", var1);
   }

   roN_2 id_goto();

   rcd_3 id_case(rfH_2 var1);

   boolean id_continue();

   rYZ id_implements();

   rRV<rXs_1> id_new();

   Stream<rfH_2> id_package();

   ShortList[] id_return();

   Map<rrrZ<?>, rrrH<?>> id_super();

   boolean id_throw();

   void id_protected(boolean var1);

   rcd_3 id_protected(rfH_2 var1);

   rfj_3 id_private();

   rVh_1 id_synchronized();

   Collection<Entry<rKv_1, rKZ>> id_native();
}
