package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sj_1 {
   private static int[] id_class;
   private static short[] id_break;
   private static byte[] id_byte;
   private static double[] id_protected;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_protected = new double[2];
   }

   private Sj_1() {
   }

   static {
      ntfClinit();
   }

   public static St_1 id_class(roJ_2 var0) {
      HashMap var1 = new HashMap();
      BitSet var2 = new BitSet(id_class[0]);

      try {
         roQ_2[] var3 = var0.id_byte();

         for (int var4 = id_throws[0]; var4 < id_byte[0]; var4++) {
            roQ_2 var5 = var3[var4];
            if (var5 != null) {
               rVM var6 = var5.id_implements();
               int var7 = var4 << id_byte[1];

               for (int var8 = id_throws[1]; var8 < id_byte[2]; var8++) {
                  int var9 = var8 | var7;

                  for (int var10 = id_throws[2]; var10 < id_byte[3]; var10++) {
                     for (int var11 = id_throws[3]; var11 < id_byte[4]; var11++) {
                        int var12 = St_1.id_class(var11, var9, var10);
                        xc_3 var13 = (xc_3)var6.id_class(var11, var8, var10);
                        boolean[] var14 = id_class(var13, var0, var11, var9, var10).id_class();
                        var2.set(var12, var14[id_throws[4]]);
                        var2.set(var12 + id_throws[5], var14[id_throws[6]]);
                        xd_3 var15 = var13.id_break();
                        if (((ImmutableSet)St_1.id_class[id_break[0]]).contains(var15)) {
                           String var16 = ri_3.id_class(var15);
                           var1.computeIfAbsent(var16, var0x -> new ArrayList<>()).add(new rfH_2(var11, var9, var10));
                        }
                     }
                  }
               }
            }
         }
      } catch (Exception var17) {
         var17.printStackTrace();
      }

      xc_3[] var18 = new xc_3[id_break[1]];

      for (int var19 = id_throws[7]; var19 < id_byte[5]; var19++) {
         label58:
         for (int var20 = id_throws[8]; var20 < id_byte[6]; var20++) {
            for (int var21 = id_break[2]; var21 >= 0; var21--) {
               int var22 = St_1.id_class(var20, var21, var19);
               if (var2.get(var22) || var2.get(var22 + id_throws[9])) {
                  var18[var19 << id_byte[7] | var20] = bw_3.id_class(var0, var20, var21, var19);
                  continue label58;
               }
            }

            var18[var19 << id_byte[8] | var20] = xu_3.id_class.id_continue();
         }
      }

      return new St_1(var0.id_private().id_break, var0.id_private().id_byte, var2, var18, var1, System.currentTimeMillis());
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{79, -62, 0, -90, 22, 16, 90, 54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static xc_3 id_class(MB var0, rqM_2<rYB> var1) {
      switch (((int[])SV.id_class[id_break[11]])[var0.ordinal()]) {
         case 1:
            return xu_3.id_class.id_continue();
         case 2:
            return xu_3.id_try.id_continue();
         case 3:
            return xu_3.id_instanceof.id_continue();
         case 4:
            if (var1 == rYB.id_byte) {
               return xu_3.id_break.id_continue();
            } else if (var1 == rYB.id_protected) {
               return xu_3.PR.id_continue();
            } else if (var1 == rYB.id_throws) {
               return xu_3.Sh.id_continue();
            }
         default:
            return null;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -723346514;
   }

   private static MB id_class(xc_3 var0, roJ_2 var1, int var2, int var3, int var4) {
      xd_3 var5 = var0.id_break();
      if (EF.id_byte(var0)) {
         if (EF.id_protected(var0)) {
            return (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[3]];
         } else if ((var2 == id_byte[9] || !EF.id_protected(bw_3.id_class(var1, var2 + id_throws[10], var3, var4)))
            && (var2 == 0 || !EF.id_protected(bw_3.id_class(var1, var2 - id_throws[11], var3, var4)))
            && (var4 == id_byte[10] || !EF.id_protected(bw_3.id_class(var1, var2, var3, var4 + id_throws[12])))
            && (var4 == 0 || !EF.id_protected(bw_3.id_class(var1, var2, var3, var4 - id_throws[13])))) {
            if (var2 != 0 && var2 != id_byte[11] && var4 != 0 && var4 != id_byte[12]) {
               return (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[7]];
            } else {
               rjU_2 var6 = var0.id_volatile()
                  .id_byte(
                     var1.id_extends(), new rfH_2(var2 + (var1.id_private().id_break << id_byte[13]), var3, var4 + (var1.id_private().id_byte << id_byte[14]))
                  );
               return var6.id_break == id_protected[0] && var6.id_protected == id_protected[1]
                  ? (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[6]]
                  : (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[5]];
            }
         } else {
            return (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[4]];
         }
      } else if (EF.id_throws(var0) || EF.id_break(var0)) {
         return (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[8]];
      } else {
         return !(var5 instanceof Ja_1) && !(var5 instanceof zc_3) && !(var5 instanceof du_3) && !(var5 instanceof dI_2)
            ? (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[10]]
            : (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[9]];
      }
   }

   private static void id_class() {
      id_break = new short[]{0, 256, 255, 2, 2, 1, 2, 1, 2, 0, 3, 0};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6029975890625909753L;
   }

   private static void id_break() {
      id_throws = new boolean[]{false, false, false, false, false, true, true, false, false, true, true, true, true, true};
   }

   private static void id_throws() {
      id_class = new int[]{131072};
   }

   private static void id_protected() {
      id_byte = new byte[]{16, 4, 16, 16, 16, 16, 16, 4, 4, 15, 15, 15, 15, 4, 4};
   }
}
