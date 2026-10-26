package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcN_2 implements rrcT_2<Boolean> {
   private static boolean[] id_class;
   private static String[] id_break;

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 95239108;
   }

   boolean id_class(rrNd_1 var1, rdn_3 var2, Map<ev_3, Integer> var3) {
      List var4 = var1.id_super();
      if (var4 == null || var4.isEmpty()) {
         return id_class[0];
      } else if (var3.isEmpty()) {
         return id_class[1];
      } else if (var4.size() != var3.size()) {
         return id_class[2];
      } else if (var2.id_protected(id_break[0])) {
         return id_class[3];
      } else {
         for (rrfA_2 var6 : var4) {
            Integer var7 = (Integer)var3.get(var6.id_break());
            if (var7 == null || var7 != var6.id_class()) {
               return id_class[4];
            }
         }

         return id_class[5];
      }
   }

   @Override
   public rrfI_2<Boolean> id_class(rrNd_1 var1, rrNw_1 var2) {
      return new rrcc_3(this, var2, var1);
   }

   private static void id_class() {
      id_break = new String[]{new String("custom-enchantments")};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-13, -92, -52, 41, 117, -122, -98, 89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   boolean id_class(rrNd_1 var1, Map<ev_3, Integer> var2) {
      List var3 = var1.id_goto();
      if (var3 != null && !var3.isEmpty()) {
         for (rrfA_2 var5 : var3) {
            ev_3 var6 = var5.id_break();
            int var7 = var5.id_class();
            if (var6 == eY_2.id_private) {
               rrIk_1 var8 = var1.id_final();
               if (var8 != null && var8.id_class()) {
                  continue;
               }
            }

            if (var2.containsKey(var6) && (Integer)var2.get(var6) >= var7) {
               return id_class[6];
            }
         }
      }

      return id_class[7];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3618396176890233706L;
   }

   private static void id_break() {
      id_class = new boolean[]{true, false, false, false, false, true, false, true, true, false, false, false, true};
   }

   boolean id_break(rrNd_1 var1, Map<ev_3, Integer> var2) {
      List var3 = var1.id_new();
      if (var3 != null && !var3.isEmpty()) {
         if (var2.isEmpty()) {
            return id_class[9];
         } else {
            for (rrfA_2 var5 : var3) {
               ev_3 var6 = var5.id_break();
               int var7 = var5.id_class();
               if (!var2.containsKey(var6)) {
                  return id_class[11];
               }

               int var8 = (Integer)var2.get(var6);
               if (var8 < var7) {
                  return id_class[10];
               }
            }

            return id_class[12];
         }
      } else {
         return id_class[8];
      }
   }
}
