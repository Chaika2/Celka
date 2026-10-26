package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrne_3 implements MinecraftAccessor {
   private static boolean[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static double[] id_protected;
   private static long[] id_throws;
   private static short[] id_case;

   private static void id_byte() {
      id_byte = new byte[]{3, 19, 4, 2, 3};
   }

   public rrne_3() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrFK var1) {
      Integer var6 = Integer.valueOf(id_break[4]);
      this.id_class[id_case[15]] = var6;
      Long var7 = id_throws[1];
      this.id_class[id_case[16]] = var7;
      Boolean var8 = id_break[5];
      this.id_class[id_case[17]] = var8;
      Double var9 = id_protected[4];
      this.id_class[id_case[18]] = var9;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1327682761;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2284296490563143417L;
   }

   @EventTarget
   public void id_class(rrLZ var1) {
      ruS_2 var2 = var1.id_class();
      if (var2 instanceof rZq_1 var3 && var3.id_break() == rZT.ATTACK && var3.id_byte() instanceof rhd_3) {
         long var19 = System.currentTimeMillis();
         long var20 = var19 - (Long)this.id_class[id_case[0]];
         Long var13 = var19;
         this.id_class[id_case[1]] = var13;
         if ((Boolean)this.id_class[id_case[2]]) {
            if (var20 > id_throws[0]) {
               Integer var14 = (Integer)this.id_class[id_case[3]] + id_break[0];
               this.id_class[id_case[4]] = var14;
               return;
            }
         } else {
            Integer var15 = Integer.valueOf(id_break[1]);
            this.id_class[id_case[5]] = var15;
         }

         return;
      }

      if (var2 instanceof rZO var4) {
         double var5 = var4.id_break(((cb_3)id_import.id_class[id_case[6]]).re()) - ((cb_3)id_import.id_class[id_case[7]]).O();
         double var7 = (Double)this.id_class[id_case[8]];
         if (var5 >= id_protected[0]) {
            Double var16 = id_protected[1];
            this.id_class[id_case[9]] = var16;
         } else {
            Double var17 = (Double)this.id_class[id_case[10]] - var5;
            this.id_class[id_case[11]] = var17;
         }

         if (rrjS_2.id_protected() || ((cb_3)id_import.id_class[id_case[12]]).Bj() >= id_byte[0]) {
            Boolean var18 = var7 == id_protected[2] && this.id_class[id_case[13]] != id_protected[3] ? id_break[2] : id_break[3];
            this.id_class[id_case[14]] = var18;
         }
      }
   }

   public boolean id_class() {
      return (Boolean)this.id_class[id_case[20]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{94, 79, 77, -49, 37, -128, 102, -125}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_break() {
      return this.id_class[id_case[19]] >= id_byte[1] ? id_break[6] : id_break[7];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         this.id_class[0] = 0L;
         this.id_class[1] = 0;
         this.id_class[2] = 0.0;
         this.id_class[3] = false;
      }
   }

   private static void id_catch() {
      id_throws = new long[]{400L, 0L, 0L};
   }

   private static void id_case() {
      id_protected = new double[6];
   }

   private static void id_protected() {
      id_case = new short[]{0, 0, 3, 1, 1, 1, 57, 57, 2, 2, 2, 2, 57, 2, 3, 1, 0, 3, 2, 1, 3};
   }

   private static void id_private() {
      id_break = new boolean[]{true, false, true, false, false, false, true, false, false, true, false, false};
   }
}
