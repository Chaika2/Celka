package celestial;

import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rVN {
   public static final PrintStream id_class = System.out;
   private static boolean id_break;
   private static final Logger id_byte = LogManager.getLogger();

   public static void id_byte() {
      if (!id_break) {
         throw new IllegalArgumentException("Not bootstrapped");
      } else {
         if (rqu_3.id_byte) {
            id_break().forEach(var0 -> id_byte.error("Missing translations: " + var0));
            gp_3.id_break();
         }

         iN_2.id_class();
      }
   }

   public static void id_class() {
      if (!id_break) {
         id_break = true;
         if (rVL.id_protected.id_protected().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         }

         dt_3.id_break();
         xU_2.id_break();
         if (aI_2.id_class(aI_2.rM) == null) {
            throw new IllegalStateException("Failed loading EntityTypes");
         }

         rAr_1.id_class();
         RF.id_class();
         UT.id_class();
         RG.id_class();
         rlA_2.id_break();
         id_protected();
      }
   }

   public static void id_class(String var0) {
      id_class.println(var0);
   }

   private static <T> void id_class(Iterable<T> var0, Function<T, String> var1, Set<String> var2) {
      rgX_2 var3 = rgX_2.id_byte();
      var0.forEach(var3x -> {
         String var4 = (String)var1.apply(var3x);
         if (!var3.id_break(var4)) {
            var2.add(var4);
         }
      });
   }

   private static void id_class(Set<String> var0) {
      rgX_2 var1 = rgX_2.id_byte();
      rRu_1.id_class(new rVc_1(var1, var0));
   }

   public static Set<String> id_break() {
      TreeSet var0 = new TreeSet();
      id_class(rVL.O, iJ_2::id_byte, var0);
      id_class(rVL.id_transient, aI_2::id_private, var0);
      id_class(rVL.id_const, rLR::id_byte, var0);
      id_class(rVL.id_for, rdb_3::id_break, var0);
      id_class(rVL.id_boolean, ev_3::id_catch, var0);
      id_class(rVL.id_strictfp, xd_3::id_volatile, var0);
      id_class(rVL.B, var0x -> "stat." + var0x.toString().replace(':', '.'), var0);
      id_class(var0);
      return var0;
   }

   private static void id_protected() {
      if (id_byte.isDebugEnabled()) {
         System.setErr(new rnk_3("STDERR", System.err));
         System.setOut(new rnk_3("STDOUT", id_class));
      } else {
         System.setErr(new rpK_2("STDERR", System.err));
         System.setOut(new rpK_2("STDOUT", id_class));
      }
   }
}
