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
   private static final Logger class_ = LogManager.getLogger();

   public static xc_3 byte_(rcd_3 var0) {
      if (!var0.byte_("Name", 8)) {
         return xu_3.class_.continue_();
      } else {
         xd_3 var1 = rVL.strictfp_.class_(new rqO_2(var0.native_("Name")));
         xc_3 var2 = var1.continue_();
         if (var0.byte_("Properties", 10)) {
            rcd_3 var3 = var0.int_("Properties");
            rCF var4 = var1.new_();

            for (String var6 : var3.protected_()) {
               rCZ var7 = var4.class_(var6);
               if (var7 != null) {
                  var2 = class_(var2, var7, var6, var3, var0);
               }
            }
         }

         return var2;
      }
   }

   private static <S extends rCn_1<?, S>, T extends Comparable<T>> S class_(S var0, rCZ<T> var1, String var2, rcd_3 var3, rcd_3 var4) {
      Optional var5 = var1.break_(var3.native_(var2));
      if (var5.isPresent()) {
         return (S)var0.class_(var1, (Comparable)var5.get());
      } else {
         class_.warn("Unable to read property: {} with value: {} for blockstate: {}", var2, var3.native_(var2), var4.toString());
         return (S)var0;
      }
   }

   public static rcd_3 class_(xc_3 var0) {
      rcd_3 var1 = new rcd_3();
      var1.class_("Name", rVL.strictfp_.break_(var0.break_()).toString());
      ImmutableMap var2 = var0.goto_();
      if (!var2.isEmpty()) {
         rcd_3 var3 = new rcd_3();
         UnmodifiableIterator var4 = var2.entrySet().iterator();

         while (var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            rCZ var6 = (rCZ)var5.getKey();
            var3.class_(var6.throws_(), class_(var6, (Comparable<?>)var5.getValue()));
         }

         var1.class_("Properties", var3);
      }

      return var1;
   }

   private static <T extends Comparable<T>> String class_(rCZ<T> var0, Comparable<?> var1) {
      return var0.class_((T)var1);
   }

   public static rcd_3 class_(DataFixer var0, rTv_1 var1, rcd_3 var2, int var3) {
      return class_(var0, var1, var2, var3, rqu_3.class_().getWorldVersion());
   }

   public static rcd_3 class_(DataFixer var0, rTv_1 var1, rcd_3 var2, int var3, int var4) {
      return (rcd_3)var0.update(var1.class_(), new Dynamic(rcf_3.class_, var2), var3, var4).getValue();
   }

   public static rcd_3 class_(rfH_2 var0) {
      rcd_3 var1 = new rcd_3();
      var1.break_("X", var0.b_());
      var1.break_("Y", var0.c_());
      var1.break_("Z", var0.d_());
      return var1;
   }

   public static boolean class_(rcZ_2 var0, rcZ_2 var1, boolean var2) {
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

         for (String var12 : var9.protected_()) {
            rcZ_2 var13 = var9.byte_(var12);
            if (!class_(var13, var10.byte_(var12), var2)) {
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
               rcZ_2 var6 = var3.finally_(var5);
               boolean var7 = false;

               for (int var8 = 0; var8 < var4.size(); var8++) {
                  if (class_(var6, var4.finally_(var8), var2)) {
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

   public static rcL_2 class_(UUID var0) {
      return new rcL_2(rqV_2.class_(var0));
   }

   public static UUID class_(rcZ_2 var0) {
      if (var0.break_() != rcL_2.class_) {
         throw new IllegalArgumentException("Expected UUID-Tag to be of type " + rcL_2.class_.class_() + ", but found " + var0.break_().class_() + ".");
      } else {
         int[] var1 = ((rcL_2)var0).case_();
         if (var1.length != 4) {
            throw new IllegalArgumentException("Expected UUID-Array to be of length 4, but found " + var1.length + ".");
         } else {
            return rqV_2.class_(var1);
         }
      }
   }

   public static rcd_3 class_(rcd_3 var0, GameProfile var1) {
      if (!rql_3.break_(var1.getName())) {
         var0.class_("Name", var1.getName());
      }

      if (var1.getId() != null) {
         var0.class_("Id", var1.getId());
      }

      if (!var1.getProperties().isEmpty()) {
         rcd_3 var2 = new rcd_3();

         for (String var4 : var1.getProperties().keySet()) {
            rcy_3 var5 = new rcy_3();

            for (Property var7 : var1.getProperties().get(var4)) {
               rcd_3 var8 = new rcd_3();
               var8.class_("Value", var7.getValue());
               if (var7.hasSignature()) {
                  var8.class_("Signature", var7.getSignature());
               }

               var5.add(var8);
            }

            var2.class_(var4, var5);
         }

         var0.class_("Properties", var2);
      }

      return var0;
   }

   public static GameProfile class_(rcd_3 var0) {
      String var1 = null;
      UUID var2 = null;
      if (var0.byte_("Name", 8)) {
         var1 = var0.native_("Name");
      }

      if (var0.break_("Id")) {
         var2 = var0.class_("Id");
      }

      try {
         GameProfile var3 = new GameProfile(var2, var1);
         if (var0.byte_("Properties", 10)) {
            rcd_3 var4 = var0.int_("Properties");

            for (String var6 : var4.protected_()) {
               rcy_3 var7 = var4.protected_(var6, 10);

               for (int var8 = 0; var8 < var7.size(); var8++) {
                  rcd_3 var9 = var7.class_(var8);
                  String var10 = var9.native_("Value");
                  if (var9.byte_("Signature", 8)) {
                     var3.getProperties().put(var6, new Property(var6, var10, var9.native_("Signature")));
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

   public static rfH_2 break_(rcd_3 var0) {
      return new rfH_2(var0.private_("X"), var0.private_("Y"), var0.private_("Z"));
   }
}
