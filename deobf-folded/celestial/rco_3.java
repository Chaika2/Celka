package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class rco_3 {
   private static final Logger id_class = LogManager.getLogger();

   public static xc_3 id_byte(rcd_3 var0) {
      if (!var0.id_byte("Name", 8)) {
         return xu_3.id_class.id_continue();
      } else {
         xd_3 var1 = rVL.id_strictfp.id_class(new rqO_2(var0.id_native("Name")));
         xc_3 var2 = var1.id_continue();
         if (var0.id_byte("Properties", 10)) {
            rcd_3 var3 = var0.id_int("Properties");
            rCF var4 = var1.id_new();

            for (String var6 : var3.id_protected()) {
               rCZ var7 = var4.id_class(var6);
               if (var7 != null) {
                  var2 = id_class(var2, var7, var6, var3, var0);
               }
            }
         }

         return var2;
      }
   }

   private static <S extends rCn_1<?, S>, T extends Comparable<T>> S id_class(S var0, rCZ<T> var1, String var2, rcd_3 var3, rcd_3 var4) {
      Optional var5 = var1.id_break(var3.id_native(var2));
      if (var5.isPresent()) {
         return (S)var0.id_class(var1, (Comparable)var5.get());
      } else {
         id_class.warn("Unable to read property: {} with value: {} for blockstate: {}", var2, var3.id_native(var2), var4.toString());
         return (S)var0;
      }
   }

   public static rcd_3 id_class(xc_3 var0) {
      rcd_3 var1 = new rcd_3();
      var1.id_class("Name", rVL.id_strictfp.id_break(var0.id_break()).toString());
      ImmutableMap var2 = var0.id_goto();
      if (!var2.isEmpty()) {
         rcd_3 var3 = new rcd_3();
         UnmodifiableIterator var4 = var2.entrySet().iterator();

         while (var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            rCZ var6 = (rCZ)var5.getKey();
            var3.id_class(var6.id_throws(), id_class(var6, (Comparable<?>)var5.getValue()));
         }

         var1.id_class("Properties", var3);
      }

      return var1;
   }

   private static <T extends Comparable<T>> String id_class(rCZ<T> var0, Comparable<?> var1) {
      return var0.id_class((T)var1);
   }

   public static rcd_3 id_class(DataFixer var0, rTv_1 var1, rcd_3 var2, int var3) {
      return id_class(var0, var1, var2, var3, rqu_3.id_class().getWorldVersion());
   }

   public static rcd_3 id_class(DataFixer var0, rTv_1 var1, rcd_3 var2, int var3, int var4) {
      return (rcd_3)var0.update(var1.id_class(), new Dynamic(rcf_3.id_class, var2), var3, var4).getValue();
   }

   public static rcd_3 id_class(rfH_2 var0) {
      rcd_3 var1 = new rcd_3();
      var1.id_break("X", var0.b_());
      var1.id_break("Y", var0.c_());
      var1.id_break("Z", var0.d_());
      return var1;
   }

   public static boolean id_class(rcZ_2 var0, rcZ_2 var1, boolean var2) {
      if (var0 == var1) {
         return true;
      } else if (var0 == null) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (!var0.getClass().equals(var1.getClass())) {
         return false;
      } else if (var0 instanceof rcd_3 var9) {
         rcd_3 var10 = (rcd_3)var1;

         for (String var12 : var9.id_protected()) {
            rcZ_2 var13 = var9.id_byte(var12);
            if (!id_class(var13, var10.id_byte(var12), var2)) {
               return false;
            }
         }

         return true;
      } else if (var0 instanceof rcy_3 && var2) {
         rcy_3 var3 = (rcy_3)var0;
         rcy_3 var4 = (rcy_3)var1;
         if (var3.isEmpty()) {
            return var4.isEmpty();
         } else {
            for (int var5 = 0; var5 < var3.size(); var5++) {
               rcZ_2 var6 = var3.id_finally(var5);
               boolean var7 = false;

               for (int var8 = 0; var8 < var4.size(); var8++) {
                  if (id_class(var6, var4.id_finally(var8), var2)) {
                     var7 = true;
                     break;
                  }
               }

               if (!var7) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return var0.equals(var1);
      }
   }

   public static rcL_2 id_class(UUID var0) {
      return new rcL_2(rqV_2.id_class(var0));
   }

   public static UUID id_class(rcZ_2 var0) {
      if (var0.id_break() != rcL_2.id_class) {
         throw new IllegalArgumentException("Expected UUID-Tag to be of type " + rcL_2.id_class.id_class() + ", but found " + var0.id_break().id_class() + ".");
      } else {
         int[] var1 = ((rcL_2)var0).id_case();
         if (var1.length != 4) {
            throw new IllegalArgumentException("Expected UUID-Array to be of length 4, but found " + var1.length + ".");
         } else {
            return rqV_2.id_class(var1);
         }
      }
   }

   public static rcd_3 id_class(rcd_3 var0, GameProfile var1) {
      if (!rql_3.id_break(var1.getName())) {
         var0.id_class("Name", var1.getName());
      }

      if (var1.getId() != null) {
         var0.id_class("Id", var1.getId());
      }

      if (!var1.getProperties().isEmpty()) {
         rcd_3 var2 = new rcd_3();

         for (String var4 : var1.getProperties().keySet()) {
            rcy_3 var5 = new rcy_3();

            for (Property var7 : var1.getProperties().get(var4)) {
               rcd_3 var8 = new rcd_3();
               var8.id_class("Value", var7.getValue());
               if (var7.hasSignature()) {
                  var8.id_class("Signature", var7.getSignature());
               }

               var5.add(var8);
            }

            var2.id_class(var4, var5);
         }

         var0.id_class("Properties", var2);
      }

      return var0;
   }

   public static GameProfile id_class(rcd_3 var0) {
      String var1 = null;
      UUID var2 = null;
      if (var0.id_byte("Name", 8)) {
         var1 = var0.id_native("Name");
      }

      if (var0.id_break("Id")) {
         var2 = var0.id_class("Id");
      }

      try {
         GameProfile var3 = new GameProfile(var2, var1);
         if (var0.id_byte("Properties", 10)) {
            rcd_3 var4 = var0.id_int("Properties");

            for (String var6 : var4.id_protected()) {
               rcy_3 var7 = var4.id_protected(var6, 10);

               for (int var8 = 0; var8 < var7.size(); var8++) {
                  rcd_3 var9 = var7.id_class(var8);
                  String var10 = var9.id_native("Value");
                  if (var9.id_byte("Signature", 8)) {
                     var3.getProperties().put(var6, new Property(var6, var10, var9.id_native("Signature")));
                  } else {
                     var3.getProperties().put(var6, new Property(var6, var10));
                  }
               }
            }
         }

         return var3;
      } catch (Throwable var11) {
         return null;
      }
   }

   public static rfH_2 id_break(rcd_3 var0) {
      return new rfH_2(var0.id_private("X"), var0.id_private("Y"), var0.id_private("Z"));
   }
}
