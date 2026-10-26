package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GX extends MP {
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   @Override
   public rP_2 id_byte() {
      this.id_finally();
      return (rP_2)this.id_class[id_protected[4]];
   }

   private GX(List<rU_2> var1, List<rd_3> var2, int var3, rP_2 var4) {
      this.id_finally();
      this.id_class[id_protected[0]] = var1;
      this.id_class[id_protected[1]] = var2;
      Integer var11 = var3;
      this.id_class[id_protected[2]] = var11;
      this.id_class[id_protected[3]] = var4;
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7462939888408117471L;
   }

   @Override
   public int id_class() {
      this.id_finally();
      return ((List)this.id_class[id_protected[8]]).size();
   }

   public static Optional<GX> id_class(a_1 var0, a_1 var1, boolean var2) {
      if (var1 != null && var0 != null) {
         if (!var0.id_protected().equals(var1.id_implements())) {
            return Optional.empty();
         } else {
            HashSet var3 = new HashSet<>(var1.id_break());
            int var4 = id_break[0];

            for (int var5 = id_byte[0]; var5 < var0.id_class() - id_byte[1]; var5++) {
               if (var3.contains(var0.id_break().get(var5))) {
                  var4 = var5;
                  break;
               }
            }

            if (var4 != id_break[1]) {
               if (!var2) {
                  return Optional.empty();
               }
            } else {
               var4 = var0.id_class() - id_byte[2];
            }

            int var8 = var1.id_break().indexOf(var0.id_break().get(var4));
            if (!var2 && var8 != 0) {
               throw new IllegalStateException();
            } else {
               ArrayList var6 = new ArrayList();
               ArrayList var7 = new ArrayList();
               var6.addAll(var0.id_break().subList(id_byte[3], var4 + id_byte[4]));
               var7.addAll(var0.id_catch().subList(id_byte[5], var4));
               var6.addAll(var1.id_break().subList(var8 + id_byte[6], var1.id_class()));
               var7.addAll(var1.id_catch().subList(var8, var1.id_class() - id_byte[7]));
               return Optional.of(new GX(var6, var7, var0.id_case() + var1.id_case(), var0.id_byte()));
            }
         }
      } else {
         return Optional.empty();
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{58, 72, 33, 5, 77, 53, -45, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public List<rU_2> id_break() {
      this.id_finally();
      return Collections.unmodifiableList((List<? extends rU_2>)this.id_class[id_protected[6]]);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2045034533;
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[2]];
         Object[] var1 = this.id_class;
         var1[id_break[3]] = Integer.valueOf(id_byte[8]);
      }
   }

   @Override
   public List<rd_3> id_catch() {
      this.id_finally();
      return Collections.unmodifiableList((List<? extends rd_3>)this.id_class[id_protected[5]]);
   }

   private static void id_extends() {
      id_break = new byte[]{-1, -1, 4, 2};
   }

   @Override
   public int id_case() {
      this.id_finally();
      return (Integer)this.id_class[id_protected[7]];
   }

   private static void id_volatile() {
      id_byte = new boolean[]{false, true, true, false, true, false, true, true, false};
   }

   private static void id_native() {
      id_protected = new short[]{0, 1, 2, 3, 3, 1, 0, 2, 0};
   }
}
