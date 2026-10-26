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
   default int char_() {
      roQ_2 var1 = this.interface_();
      return var1 == null ? 0 : var1.catch_();
   }

   roQ_2[] byte_();

   rRV<xd_3> int_();

   long this_();

   default roQ_2 interface_() {
      roQ_2[] var1 = this.byte_();

      for (int var2 = var1.length - 1; var2 >= 0; var2--) {
         roQ_2 var3 = var1[var2];
         if (!roQ_2.class_(var3)) {
            return var3;
         }
      }

      return null;
   }

   int class_(rKv_1 var1, int var2, int var3);

   rKZ class_(rKv_1 var1);

   void class_(long var1);

   default boolean class_(int var1, int var2) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 >= 256) {
         var2 = 255;
      }

      for (int var3 = var1; var3 <= var2; var3 += 16) {
         if (!roQ_2.class_(this.byte_()[var3 >> 4])) {
            return false;
         }
      }

      return true;
   }

   default void class_(rcd_3 var1) {
      LogManager.getLogger().warn("Trying to set a BlockEntity, but this operation is not supported.");
   }

   void class_(rfH_2 var1, ryO_2 var2);

   void class_(an_3 var1);

   xc_3 class_(rfH_2 var1, xc_3 var2, boolean var3);

   void class_(rKv_1 var1, long[] var2);

   static ShortList class_(ShortList[] var0, int var1) {
      if (var0[var1] == null) {
         var0[var1] = new ShortArrayList();
      }

      return var0[var1];
   }

   void break_(boolean var1);

   default void break_(short var1, int var2) {
      class_(this.return_(), var2).add(var1);
   }

   void break_(long var1);

   Set<rfH_2> break_();

   void break_(Map<rrrZ<?>, rrrH<?>> var1);

   void throws_(rfH_2 var1);

   default void extends_(rfH_2 var1) {
      LogManager.getLogger().warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", var1);
   }

   roN_2 goto_();

   rcd_3 case_(rfH_2 var1);

   boolean continue_();

   rYZ implements_();

   rRV<rXs_1> new_();

   Stream<rfH_2> package_();

   ShortList[] return_();

   Map<rrrZ<?>, rrrH<?>> super_();

   boolean throw_();

   void protected_(boolean var1);

   rcd_3 protected_(rfH_2 var1);

   rfj_3 private_();

   rVh_1 synchronized_();

   Collection<Entry<rKv_1, rKZ>> native_();
}
