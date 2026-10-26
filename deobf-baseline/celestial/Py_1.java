package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Py_1 extends Pv_1 implements PP {
   private static byte[] id_break;
   private static short[] id_throws;
   private static boolean[] id_case;
   private static String[] id_catch;

   private static void id_byte() {
      id_case = new boolean[]{true, true, true, false, false, true, true, false, false, false};
   }

   public Py_1(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrLs_1 var1) {
      if ((vm_3)b_.id_class[id_throws[0]] == null || (vm_3)b_.id_class[id_throws[1]] instanceof Fu_1) {
         Vu_1 var2 = ((Qw_1)b_.id_class[id_throws[2]]).c;
         int var3 = var1.id_protected();
         int var4 = var1.id_class();
         if (var4 == id_case[0]) {
            if (var3 == var2.id_int().id_break() && Vu_1.id_class(var2)) {
               vm_3 var7 = (vm_3)b_.id_class[id_throws[3]];
               if (var7 instanceof Fu_1 var6) {
                  rJY var12 = var6.id_int();
                  if (var12 == null) {
                     return;
                  }

                  rdn_3 var5 = var12.id_class().id_implements();
                  if (var5.id_class()) {
                     return;
                  }

                  rJr_1 var8 = var6.G_();

                  for (rJY var10 : var8.id_throws) {
                     if (this.id_class(var10.id_class(), var5, var10.id_protected)) {
                        ((Ax_1)b_.id_class[id_throws[4]]).id_break(var8.id_case, var10.id_protected, id_case[1], rXa_1.THROW, id_case[2]);
                     }
                  }
               } else {
                  rdn_3 var11 = ((cb_3)b_.id_class[id_throws[5]]).ss().id_implements();
                  if (var11.id_class()) {
                     return;
                  }

                  for (int var13 = id_case[3]; var13 < id_break[0]; var13++) {
                     int var14 = rrfY_2.id_break(var13);
                     if (this.id_class(((rhz_3)((cb_3)b_.id_class[id_throws[6]]).id_implements[id_throws[7]]).id_extends(var13), var11, var14)) {
                        ((Ax_1)b_.id_class[id_throws[8]]).id_break(id_case[4], var14, id_case[5], rXa_1.THROW, id_case[6]);
                     }
                  }

                  ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[9]]).id_finally().id_class(rrLY.id_class());
               }
            }
         }
      }
   }

   private boolean id_class(rdn_3 var1, rdn_3 var2, int var3) {
      if ((vm_3)b_.id_class[id_throws[10]] instanceof FH && var3 < id_break[1]) {
         return id_case[7];
      } else if (var1 != null && var2 != null) {
         return var1.id_break() != var2.id_break() ? id_case[9] : rdn_3.id_class(var1, var2, Set.of(id_catch[0], id_catch[1]));
      } else {
         return id_case[8];
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1787790246;
   }

   private static void id_class() {
      id_throws = new short[]{73, 73, 20, 73, 55, 57, 57, 1, 55, 0, 73};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4197874435238539839L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, 18, 16, 22, -72, 9, -45, -16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new byte[]{36, 9};
   }

   private static void id_protected() {
      id_catch = new String[]{new String("Damage"), new String("display")};
   }
}
