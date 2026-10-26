package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bt_3 implements PP {
   private static boolean[] id_throws;
   private static short[] id_case;
   public Object[] id_class;
   public static Object[] id_break;
   private static byte[] id_catch;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_catch[0]];
         Object[] var1 = this.id_class;
         var1[id_throws[3]] = Integer.valueOf(id_throws[4]);
      }
   }

   public bt_3(Ps_1 var1) {
      this.id_byte();
      this.id_class[id_case[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1167898005152649688L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -970880217;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, 57, 14, 90, -78, 30, -95, 3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(boolean var1) {
      if ((Integer)this.id_class[id_case[1]] > 0) {
         Integer var11 = (Integer)this.id_class[id_case[2]] - id_throws[0];
         this.id_class[id_case[3]] = var11;
      } else {
         rjG_2 var2 = ((Ps_1)this.id_class[id_case[4]]).id_byte();
         if (var1 && !((Ps_1)this.id_class[id_case[5]]).id_catch().id_long() && var2 != null && var2.id_byte() == rjM_2.BLOCK) {
            Integer var12 = (Integer)C_class.id_instanceof().PO.id_class[id_case[6]] - id_throws[1];
            this.id_class[id_case[7]] = var12;
            rpm_3[] var3 = rpm_3.values();
            int var4 = var3.length;

            for (int var5 = id_throws[2]; var5 < var4; var5++) {
               rpm_3 var6 = var3[var5];
               if (((Ps_1)this.id_class[id_case[8]])
                     .id_native()
                     .id_break(((Ps_1)this.id_class[id_case[9]]).id_catch(), ((Ps_1)this.id_class[id_case[10]]).id_case(), var6, (rff_3)var2)
                  == ryZ_2.SUCCESS) {
                  ((Ps_1)this.id_class[id_case[11]]).id_catch().id_class(var6);
                  return;
               }

               if (!((Ps_1)this.id_class[id_case[12]]).id_catch().id_protected(var6).id_class()
                  && ((Ps_1)this.id_class[id_case[13]]).id_native().id_class(var6) == ryZ_2.SUCCESS) {
                  return;
               }
            }
         }
      }
   }

   private static void id_class() {
      id_throws = new boolean[]{true, true, false, true, false, true, false, true};
   }

   private static void id_break() {
      Object[] var0 = new Object[]{1};
      id_break = var0;
   }

   private static void id_throws() {
      id_case = new short[]{0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
   }

   private static void id_protected() {
      id_catch = new byte[]{2};
   }
}
