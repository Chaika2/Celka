package celestial;

import java.util.ArrayList;
import java.util.List;

public class rrWU {
   private static long id_class = System.currentTimeMillis();
   private static long id_break = id_private();
   private static long id_byte = id_class;
   private static long id_protected = id_break;
   private static boolean id_throws = false;
   private static long id_case = 0L;
   private static long id_catch = 0L;
   private static List<Long> id_private = new ArrayList<>();
   private static long id_implements = 0L;
   private static long id_finally = 1048576L;

   public static long id_byte() {
      return id_break / id_finally;
   }

   public static void id_class() {
      long var0 = System.currentTimeMillis();
      long var2 = id_private();
      id_throws = var2 < id_protected;
      if (id_throws) {
         id_implements = id_case;
         id_class = var0;
         id_break = var2;
      }

      long var4 = var0 - id_class;
      long var6 = var2 - id_break;
      double var8 = (double)var4 / 1000.0;
      if (var6 >= 0L && var8 > 0.0) {
         id_case = (long)((double)var6 / var8);
         id_private.add(id_case);
         if (var0 / 1000L != id_byte / 1000L) {
            long var10 = 0L;

            for (Long var13 : id_private) {
               var10 += var13;
            }

            id_catch = var10 / (long)id_private.size();
            id_private.clear();
         }
      }

      id_byte = var0;
      id_protected = var2;
   }

   public static long id_break() {
      return id_class;
   }

   public static long id_throws() {
      return id_case / id_finally;
   }

   public static long id_catch() {
      return id_implements / id_finally;
   }

   public static long id_case() {
      return id_catch / id_finally;
   }

   public static boolean id_protected() {
      return id_throws;
   }

   private static long id_private() {
      Runtime var0 = Runtime.getRuntime();
      return var0.totalMemory() - var0.freeMemory();
   }
}
