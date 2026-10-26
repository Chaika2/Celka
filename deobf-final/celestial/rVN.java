package celestial;

import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rVN {
   public static final PrintStream class_ = System.out;
   private static boolean break_;
   private static final Logger byte_ = LogManager.getLogger();

   public static void byte_() {
      if (!break_) {
         throw new IllegalArgumentException("Not bootstrapped");
      } else {
         if (rqu_3.byte_) {
            break_().forEach(var0 -> byte_.error("Missing translations: " + var0));
            gp_3.break_();
         }

         iN_2.class_();
      }
   }

   public static void class_() {
      if (!break_) {
         break_ = true;
         if (rVL.protected_.protected_().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         }

         dt_3.break_();
         xU_2.break_();
         if (aI_2.class_(aI_2.rM) == null) {
            throw new IllegalStateException("Failed loading EntityTypes");
         }

         rAr_1.class_();
         RF.class_();
         UT.class_();
         RG.class_();
         rlA_2.break_();
         protected_();
      }
   }

   public static void class_(String var0) {
      class_.println(var0);
   }

   private static <T> void class_(Iterable<T> var0, Function<T, String> var1, Set<String> var2) {
      rgX_2 var3 = rgX_2.byte_();
      var0.forEach(var3x -> {
         String var4 = (String)var1.apply(var3x);
         if (!var3.break_(var4)) {
            var2.add(var4);
         }
      });
   }

   private static void class_(Set<String> var0) {
      rgX_2 var1 = rgX_2.byte_();
      rRu_1.class_(new rVc_1(var1, var0));
   }

   public static Set<String> break_() {
      TreeSet var0 = new TreeSet();
      class_(rVL.O, iJ_2::byte_, var0);
      class_(rVL.transient_, aI_2::private_, var0);
      class_(rVL.const_, rLR::byte_, var0);
      class_(rVL.for_, rdb_3::break_, var0);
      class_(rVL.boolean_, ev_3::catch_, var0);
      class_(rVL.strictfp_, xd_3::volatile_, var0);
      class_(rVL.B, var0x -> "stat." + var0x.toString().replace(':', '.'), var0);
      class_(var0);
      return var0;
   }

   private static void protected_() {
      if (byte_.isDebugEnabled()) {
         System.setErr(new rnk_3("STDERR", System.err));
         System.setOut(new rnk_3("STDOUT", class_));
      } else {
         System.setErr(new rpK_2("STDERR", System.err));
         System.setOut(new rpK_2("STDOUT", class_));
      }
   }
}
